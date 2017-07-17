package edu.kit.ipd.sdq.kamp4iec.core.derivation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4iec.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.IECActivityType;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECComponent;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.AbstractKAMP4IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ChangePropagationDueToDataDependency;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModifyFunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModifyGlobalVariable;

public class InternalModificationDerivation {
	
	// Fields should be set by user, but defaults used to prevent NullPointer
	private ChangePropagationDueToDataDependency changePropagationDueToDataDependency =
			ModificationmarksFactory.eINSTANCE.createChangePropagationDueToDataDependency();
	
	public List<Activity> deriveInternalModifications(ArchitectureVersion targetVersion) {
		List<Activity> activityList = new ArrayList<Activity>();
		if (targetVersion.getModificationMarkRepository() != null) {
			this.findRelevantPropagationSteps(targetVersion.getModificationMarkRepository());
			this.deriveFunctionBlockModifications(activityList);
			this.deriveGlobalVariableModifications(activityList);
		}
		return activityList;
	}
	
	/**
	 * Relevant for KAMP+IntBIIS are only propagation because of data dependencies and
	 * business processes (both model elements should only exist once). All other kinds
	 * of steps are handled by the superclass.
	 */
	private void findRelevantPropagationSteps(AbstractKAMP4IECModificationRepository<?> 
			modificationRepository) {
		for (ChangePropagationStep step: modificationRepository.getChangePropagationSteps()) {
			if (step instanceof ChangePropagationDueToDataDependency) {
				this.setChangePropagationDueToDataDependency(
						(ChangePropagationDueToDataDependency) step);
			}
		}
	}

	private void deriveFunctionBlockModifications(List<Activity> activityList) {
		List<ModifyFunctionBlock> functionBlockModifications = new ArrayList<ModifyFunctionBlock>(this.
				getChangePropagationDueToDataDependency().getFunctionBlockModifications());
		for (ModifyFunctionBlock modifyFunctionBlock : functionBlockModifications) {
			activityList.add(InternalModificationDerivation.createModificationActivity(
					modifyFunctionBlock, IECActivityType.MODIFY_FUNCTIONBLOCK));
		}
	}

	private void deriveGlobalVariableModifications(List<Activity> activityList) {
		List<ModifyGlobalVariable> globalVariableModifications = new ArrayList<ModifyGlobalVariable>(this.
				getChangePropagationDueToDataDependency().getGlobalVariableModifications());
		for (ModifyGlobalVariable modifyGlobalVariable : globalVariableModifications) {
			activityList.add(InternalModificationDerivation.createModificationActivity(
					modifyGlobalVariable, IECActivityType.MODIFY_GLOBALVARIABLE));
		}
	}

	public static List<String> getCausingElementsNames(AbstractModification<?, ?> modification) {
		List<String> causingElementNames = new LinkedList<String>();
		for (Object causingElement : modification.getCausingElements()) {
			if (causingElement instanceof GlobalVariable) {
				GlobalVariable causingModule = (GlobalVariable) causingElement;
				causingElementNames.add(causingModule.eClass().
						getName() + " \"" + causingModule.getId() + "\"");
			} else if (causingElement instanceof FunctionBlock) {
				FunctionBlock causingInterface = (FunctionBlock) causingElement;
				causingElementNames.add(causingInterface.eClass().
						getName() + " \"" + causingInterface.getId() + "\"");
			} else if (causingElement instanceof IECComponent) {
				IECComponent causingCompoenent = (IECComponent) causingElement;
				causingElementNames.add(causingCompoenent.eClass().
						getName() + " \"" + causingCompoenent.getId() + "\"");
			} 
		}
		return causingElementNames;
	}

	public static Activity createModificationActivity(AbstractModification<?, ?> modification,
			List<String> causingElementNames, AbstractActivityElementType activityElementType) {
		if (modification instanceof ModifyFunctionBlock){
			IECComponent component = ((ModifyFunctionBlock) modification).getAffectedElement();
			return new Activity(IECActivityType.MODIFY_FUNCTIONBLOCK, activityElementType, component,
					component.getId(), causingElementNames, BasicActivity.MODIFY, "Modify " + component.eClass().getName() + ".");
		}
		if (modification instanceof ModifyGlobalVariable){
			GlobalVariable interfaceElement = ((ModifyGlobalVariable) modification).getAffectedElement();
			return new Activity(IECActivityType.MODIFY_GLOBALVARIABLE, activityElementType, interfaceElement,
					interfaceElement.getId(), causingElementNames, BasicActivity.MODIFY, "Modify " + interfaceElement.eClass().getName() + ".");
		} else {
			return null;
		}
	}

	public static Activity createModificationActivity(AbstractModification<?, ?> modification,
			AbstractActivityElementType activityElementType) {
		List<String> causingElementNames = getCausingElementsNames(modification);
		return createModificationActivity(modification, causingElementNames, activityElementType);
	}
	
	protected ChangePropagationDueToDataDependency getChangePropagationDueToDataDependency() {
		return changePropagationDueToDataDependency;
	}

	protected void setChangePropagationDueToDataDependency(
			ChangePropagationDueToDataDependency changePropagationDueToDataDependency) {
		this.changePropagationDueToDataDependency = changePropagationDueToDataDependency;
	}
	
}
