package edu.kit.ipd.sdq.kamp4iec.core;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECComponent;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ChangePropagationDueToDataDependency;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModifyFunctionBlock;

/**
 * The change propagation analysis of KAPS
 * 1. determines a seed population of affected components (resp. provided roles)
 * 2. calculates in iterations:
 *    a) inter-component propagation
 *    b) intra-component propagation
 * 3. generates internal modification marks for affected elements
 * 
 * - elements which were already part of a seed population are not further investigated
 * 
 * 
 * @author raetz
 *
 */
public class ChangePropagationAnalysis implements AbstractChangePropagationAnalysis<ArchitectureVersion> {

	private Collection<IECComponent> markedComponents;
	private ChangePropagationDueToDataDependency changePropagationDueToDataDependencies;

	@Override
	public void runChangePropagationAnalysis(ArchitectureVersion version) {
		long timeBefore = System.currentTimeMillis();
		// Setup
		this.prepareAnalysis(version);
		
		// Calculate
		this.calculateChangePropagationDueToDataDependencies(version);		
			
		// Update

		System.out.println("Time: " + (System.currentTimeMillis() - timeBefore));
		
	}
	
	private void prepareAnalysis(ArchitectureVersion version) {
		this.setChangePropagationDueToDataDependency(ModificationmarksFactory.eINSTANCE.
				createChangePropagationDueToDataDependency());
		/* Link calculated data dependency propagation steps to propagation steps of version,
		 * so the already marked elements are up to date for all sub-steps of the algorithm*/	
		version.getModificationMarkRepository().getChangePropagationSteps().add(
				this.getChangePropagationDueToDataDependencies());
		// Store marked model elements to reduce model traversal in calculation methods
		//double cast to avoid type-mismatch
		this.setMarkedComponents(edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, IECComponent.class));
	}
	
	/**
	 * Calculates the DataType-/DataObject-related changes.
	 */
	public void calculateChangePropagationDueToDataDependencies(ArchitectureVersion version) {
		// Create only one modification mark per element in this propagation step (affects only
		// DataTypes and DataObjects which could be marked by multiple sub-steps)
		Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep = 
				new HashMap<EObject, AbstractModification<?,EObject>>();
		
		// 1 GlobalVariable -> FunctionBlock
		calculateAndMarkGlobalVariableToFunctionBlockPropagation(version, elementsMarkedInThisStep);
		
		//If no at all changes: remove top-level element from tree
		if (this.getChangePropagationDueToDataDependencies().eContents().isEmpty()) {			
			version.getModificationMarkRepository().getChangePropagationSteps().remove(
					this.getChangePropagationDueToDataDependencies());	
		}
	}
	
	protected void calculateAndMarkGlobalVariableToFunctionBlockPropagation(ArchitectureVersion version,
			Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep) {
		List<GlobalVariable> markedGlobalVariables = new ArrayList<>();
		for(IECComponent marked : getMarkedComponents()) {
			if(marked.getClass().equals(GlobalVariable.class)) {
				markedGlobalVariables.add((GlobalVariable) marked);
			}
		}
		Map<FunctionBlock, Set<GlobalVariable>> functionBlocksToBeMarked = ArchitectureModelLookup.
				lookUpFunctionBlocksOfGlobalVariable(version, markedGlobalVariables);

		 for(Map.Entry<FunctionBlock, Set<GlobalVariable>> functionBlockToBeMarkedEntry: 
			 	functionBlocksToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(functionBlockToBeMarkedEntry.getKey())) {
				for(IECComponent cause: functionBlockToBeMarkedEntry.getValue()) {
					if (!elementsMarkedInThisStep.get(functionBlockToBeMarkedEntry.getKey()).
							getCausingElements().contains(cause)) {
						elementsMarkedInThisStep.get(functionBlockToBeMarkedEntry.getKey()).
							getCausingElements().add(cause);	
					}
				}	
			} else {
				ModifyFunctionBlock modifyDataType = ModificationmarksFactory.eINSTANCE.createModifyFunctionBlock();
				modifyDataType.setToolderived(true);
				modifyDataType.setAffectedElement(functionBlockToBeMarkedEntry.getKey());
				modifyDataType.getCausingElements().addAll(functionBlockToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(functionBlockToBeMarkedEntry.getKey(), modifyDataType);
				this.getMarkedComponents().add(functionBlockToBeMarkedEntry.getKey());
				this.getChangePropagationDueToDataDependencies().getFunctionBlockModifications().
						add(modifyDataType);
			}
		 }
	}

	protected void setChangePropagationDueToDataDependency(ChangePropagationDueToDataDependency changePropagationDueToDataDependencies) {
		this.changePropagationDueToDataDependencies = changePropagationDueToDataDependencies;
	}
	
	public ChangePropagationDueToDataDependency getChangePropagationDueToDataDependencies() {
		return changePropagationDueToDataDependencies;
	}

	public Collection<IECComponent> getMarkedComponents() {
		return markedComponents;
	}

	public void setMarkedComponents(Collection<IECComponent> markedComponents) {
		this.markedComponents = markedComponents;
	}

	public void setChangePropagationDueToDataDependencies(
			ChangePropagationDueToDataDependency changePropagationDueToDataDependencies) {
		this.changePropagationDueToDataDependencies = changePropagationDueToDataDependencies;
	}


}
