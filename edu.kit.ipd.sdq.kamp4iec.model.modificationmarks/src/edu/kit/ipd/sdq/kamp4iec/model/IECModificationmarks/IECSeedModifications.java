/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECSeedModifications#getGlobalVariableModifications <em>Global Variable Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECSeedModifications#getFunctionblockModifications <em>Functionblock Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECSeedModifications()
 * @model
 * @generated
 */
public interface IECSeedModifications extends AbstractSeedModifications {
	/**
	 * Returns the value of the '<em><b>Global Variable Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyGlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variable Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variable Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECSeedModifications_GlobalVariableModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyGlobalVariable> getGlobalVariableModifications();

	/**
	 * Returns the value of the '<em><b>Functionblock Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunctionBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functionblock Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionblock Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage#getIECSeedModifications_FunctionblockModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECModifyFunctionBlock> getFunctionblockModifications();

} // IECSeedModifications
