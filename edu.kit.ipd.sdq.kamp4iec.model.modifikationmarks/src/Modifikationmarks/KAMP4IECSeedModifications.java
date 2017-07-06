/**
 */
package Modifikationmarks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KAMP4IEC Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Modifikationmarks.KAMP4IECSeedModifications#getGlobalVariableModifications <em>Global Variable Modifications</em>}</li>
 *   <li>{@link Modifikationmarks.KAMP4IECSeedModifications#getFunctionblockModifications <em>Functionblock Modifications</em>}</li>
 * </ul>
 *
 * @see Modifikationmarks.ModifikationmarksPackage#getKAMP4IECSeedModifications()
 * @model
 * @generated
 */
public interface KAMP4IECSeedModifications extends EObject {
	/**
	 * Returns the value of the '<em><b>Global Variable Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link Modifikationmarks.ModifyGlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variable Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variable Modifications</em>' containment reference list.
	 * @see Modifikationmarks.ModifikationmarksPackage#getKAMP4IECSeedModifications_GlobalVariableModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyGlobalVariable> getGlobalVariableModifications();

	/**
	 * Returns the value of the '<em><b>Functionblock Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link Modifikationmarks.ModifyFunctionBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functionblock Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionblock Modifications</em>' containment reference list.
	 * @see Modifikationmarks.ModifikationmarksPackage#getKAMP4IECSeedModifications_FunctionblockModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyFunctionBlock> getFunctionblockModifications();

} // KAMP4IECSeedModifications