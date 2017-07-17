/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Propagation Due To Data Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ChangePropagationDueToDataDependency#getFunctionBlockModifications <em>Function Block Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ChangePropagationDueToDataDependency#getGlobalVariableModifications <em>Global Variable Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModificationmarksPackage#getChangePropagationDueToDataDependency()
 * @model
 * @generated
 */
public interface ChangePropagationDueToDataDependency extends ChangePropagationStep {

	/**
	 * Returns the value of the '<em><b>Function Block Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModifyFunctionBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Block Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Block Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModificationmarksPackage#getChangePropagationDueToDataDependency_FunctionBlockModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyFunctionBlock> getFunctionBlockModifications();

	/**
	 * Returns the value of the '<em><b>Global Variable Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModifyGlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variable Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variable Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModificationmarksPackage#getChangePropagationDueToDataDependency_GlobalVariableModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyGlobalVariable> getGlobalVariableModifications();
} // ChangePropagationDueToDataDependency
