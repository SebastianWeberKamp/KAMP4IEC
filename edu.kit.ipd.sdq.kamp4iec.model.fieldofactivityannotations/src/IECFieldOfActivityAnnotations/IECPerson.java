/**
 */
package IECFieldOfActivityAnnotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IECFieldOfActivityAnnotations.IECPerson#getParent <em>Parent</em>}</li>
 *   <li>{@link IECFieldOfActivityAnnotations.IECPerson#getRoles <em>Roles</em>}</li>
 *   <li>{@link IECFieldOfActivityAnnotations.IECPerson#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECPerson()
 * @model
 * @generated
 */
public interface IECPerson extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link IECFieldOfActivityAnnotations.IECPersonList#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(IECPersonList)
	 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECPerson_Parent()
	 * @see IECFieldOfActivityAnnotations.IECPersonList#getPersons
	 * @model opposite="persons" required="true" transient="false"
	 * @generated
	 */
	IECPersonList getParent();

	/**
	 * Sets the value of the '{@link IECFieldOfActivityAnnotations.IECPerson#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(IECPersonList value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link IECFieldOfActivityAnnotations.IECRole}.
	 * It is bidirectional and its opposite is '{@link IECFieldOfActivityAnnotations.IECRole#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECPerson_Roles()
	 * @see IECFieldOfActivityAnnotations.IECRole#getPerson
	 * @model opposite="person"
	 * @generated
	 */
	EList<IECRole> getRoles();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IECFieldOfActivityAnnotations.IECPerson#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // IECPerson
