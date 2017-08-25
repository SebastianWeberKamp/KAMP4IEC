/**
 */
package IECFieldOfActivityAnnotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Role List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IECFieldOfActivityAnnotations.IECRoleList#getParent <em>Parent</em>}</li>
 *   <li>{@link IECFieldOfActivityAnnotations.IECRoleList#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECRoleList()
 * @model
 * @generated
 */
public interface IECRoleList extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link IECFieldOfActivityAnnotations.IECStaffSpecification#getRoleList <em>Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(IECStaffSpecification)
	 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECRoleList_Parent()
	 * @see IECFieldOfActivityAnnotations.IECStaffSpecification#getRoleList
	 * @model opposite="roleList" required="true" transient="false"
	 * @generated
	 */
	IECStaffSpecification getParent();

	/**
	 * Sets the value of the '{@link IECFieldOfActivityAnnotations.IECRoleList#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(IECStaffSpecification value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link IECFieldOfActivityAnnotations.IECRole}.
	 * It is bidirectional and its opposite is '{@link IECFieldOfActivityAnnotations.IECRole#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECRoleList_Roles()
	 * @see IECFieldOfActivityAnnotations.IECRole#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IECRole> getRoles();

} // IECRoleList
