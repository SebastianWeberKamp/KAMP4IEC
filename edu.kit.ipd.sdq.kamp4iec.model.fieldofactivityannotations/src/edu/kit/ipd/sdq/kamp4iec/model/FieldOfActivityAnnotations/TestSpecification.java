/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getUnitTestCases <em>Unit Test Cases</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getAcceptanceTestCases <em>Acceptance Test Cases</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getIntegrationTestCases <em>Integration Test Cases</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getUnitTestCaseAggregations <em>Unit Test Case Aggregations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getAcceptanceTestCaseAggregations <em>Acceptance Test Case Aggregations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getIntegrationTestCaseAggregations <em>Integration Test Case Aggregations</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTestSpecification()
 * @model
 * @generated
 */
public interface TestSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTestSpecification <em>Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FieldOfActivityAnnotationsRepository)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTestSpecification_Parent()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTestSpecification
	 * @model opposite="testSpecification" required="true" transient="false"
	 * @generated
	 */
	FieldOfActivityAnnotationsRepository getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FieldOfActivityAnnotationsRepository value);

	/**
	 * Returns the value of the '<em><b>Unit Test Cases</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCase}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Test Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Test Cases</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTestSpecification_UnitTestCases()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCase#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<UnitTestCase> getUnitTestCases();

	/**
	 * Returns the value of the '<em><b>Acceptance Test Cases</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCase}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptance Test Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance Test Cases</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTestSpecification_AcceptanceTestCases()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCase#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<AcceptanceTestCase> getAcceptanceTestCases();

	/**
	 * Returns the value of the '<em><b>Integration Test Cases</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCase}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integration Test Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integration Test Cases</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTestSpecification_IntegrationTestCases()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCase#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IntegrationTestCase> getIntegrationTestCases();

	/**
	 * Returns the value of the '<em><b>Unit Test Case Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCaseAggregation}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCaseAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Test Case Aggregations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Test Case Aggregations</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTestSpecification_UnitTestCaseAggregations()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCaseAggregation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<UnitTestCaseAggregation> getUnitTestCaseAggregations();

	/**
	 * Returns the value of the '<em><b>Acceptance Test Case Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCaseAggregation}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCaseAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptance Test Case Aggregations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance Test Case Aggregations</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTestSpecification_AcceptanceTestCaseAggregations()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCaseAggregation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<AcceptanceTestCaseAggregation> getAcceptanceTestCaseAggregations();

	/**
	 * Returns the value of the '<em><b>Integration Test Case Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCaseAggregation}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCaseAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integration Test Case Aggregations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integration Test Case Aggregations</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getTestSpecification_IntegrationTestCaseAggregations()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCaseAggregation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IntegrationTestCaseAggregation> getIntegrationTestCaseAggregations();

} // TestSpecification
