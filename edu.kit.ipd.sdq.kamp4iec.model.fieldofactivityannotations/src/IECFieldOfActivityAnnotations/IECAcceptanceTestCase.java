/**
 */
package IECFieldOfActivityAnnotations;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Acceptance Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IECFieldOfActivityAnnotations.IECAcceptanceTestCase#getParent <em>Parent</em>}</li>
 *   <li>{@link IECFieldOfActivityAnnotations.IECAcceptanceTestCase#getProvidedrole <em>Providedrole</em>}</li>
 * </ul>
 *
 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECAcceptanceTestCase()
 * @model
 * @generated
 */
public interface IECAcceptanceTestCase extends IECTestCase {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link IECFieldOfActivityAnnotations.IECTestSpecification#getAcceptanceTestCases <em>Acceptance Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(IECTestSpecification)
	 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECAcceptanceTestCase_Parent()
	 * @see IECFieldOfActivityAnnotations.IECTestSpecification#getAcceptanceTestCases
	 * @model opposite="acceptanceTestCases" required="true" transient="false"
	 * @generated
	 */
	IECTestSpecification getParent();

	/**
	 * Sets the value of the '{@link IECFieldOfActivityAnnotations.IECAcceptanceTestCase#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(IECTestSpecification value);

	/**
	 * Returns the value of the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providedrole</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providedrole</em>' reference.
	 * @see #setProvidedrole(OperationProvidedRole)
	 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECAcceptanceTestCase_Providedrole()
	 * @model
	 * @generated
	 */
	OperationProvidedRole getProvidedrole();

	/**
	 * Sets the value of the '{@link IECFieldOfActivityAnnotations.IECAcceptanceTestCase#getProvidedrole <em>Providedrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providedrole</em>' reference.
	 * @see #getProvidedrole()
	 * @generated
	 */
	void setProvidedrole(OperationProvidedRole value);

} // IECAcceptanceTestCase
