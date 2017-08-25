/**
 */
package IECFieldOfActivityAnnotations;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Unit Test Case Aggregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IECFieldOfActivityAnnotations.IECUnitTestCaseAggregation#getParent <em>Parent</em>}</li>
 *   <li>{@link IECFieldOfActivityAnnotations.IECUnitTestCaseAggregation#getProvidedrole <em>Providedrole</em>}</li>
 * </ul>
 *
 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECUnitTestCaseAggregation()
 * @model
 * @generated
 */
public interface IECUnitTestCaseAggregation extends IECTestCaseAggregation {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link IECFieldOfActivityAnnotations.IECTestSpecification#getUnitTestCaseAggregations <em>Unit Test Case Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(IECTestSpecification)
	 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECUnitTestCaseAggregation_Parent()
	 * @see IECFieldOfActivityAnnotations.IECTestSpecification#getUnitTestCaseAggregations
	 * @model opposite="unitTestCaseAggregations" required="true" transient="false"
	 * @generated
	 */
	IECTestSpecification getParent();

	/**
	 * Sets the value of the '{@link IECFieldOfActivityAnnotations.IECUnitTestCaseAggregation#getParent <em>Parent</em>}' container reference.
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
	 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECUnitTestCaseAggregation_Providedrole()
	 * @model
	 * @generated
	 */
	OperationProvidedRole getProvidedrole();

	/**
	 * Sets the value of the '{@link IECFieldOfActivityAnnotations.IECUnitTestCaseAggregation#getProvidedrole <em>Providedrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providedrole</em>' reference.
	 * @see #getProvidedrole()
	 * @generated
	 */
	void setProvidedrole(OperationProvidedRole value);

} // IECUnitTestCaseAggregation
