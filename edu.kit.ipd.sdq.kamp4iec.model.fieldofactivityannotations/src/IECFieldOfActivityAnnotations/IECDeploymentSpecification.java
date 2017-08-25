/**
 */
package IECFieldOfActivityAnnotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IECFieldOfActivityAnnotations.IECDeploymentSpecification#getRuntimeInstances <em>Runtime Instances</em>}</li>
 *   <li>{@link IECFieldOfActivityAnnotations.IECDeploymentSpecification#getRuntimeInstanceAggregations <em>Runtime Instance Aggregations</em>}</li>
 *   <li>{@link IECFieldOfActivityAnnotations.IECDeploymentSpecification#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECDeploymentSpecification()
 * @model
 * @generated
 */
public interface IECDeploymentSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Runtime Instances</b></em>' containment reference list.
	 * The list contents are of type {@link IECFieldOfActivityAnnotations.IECRuntimeInstance}.
	 * It is bidirectional and its opposite is '{@link IECFieldOfActivityAnnotations.IECRuntimeInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Instances</em>' containment reference list.
	 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECDeploymentSpecification_RuntimeInstances()
	 * @see IECFieldOfActivityAnnotations.IECRuntimeInstance#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IECRuntimeInstance> getRuntimeInstances();

	/**
	 * Returns the value of the '<em><b>Runtime Instance Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link IECFieldOfActivityAnnotations.IECRuntimeInstanceAggregation}.
	 * It is bidirectional and its opposite is '{@link IECFieldOfActivityAnnotations.IECRuntimeInstanceAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Instance Aggregations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Instance Aggregations</em>' containment reference list.
	 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECDeploymentSpecification_RuntimeInstanceAggregations()
	 * @see IECFieldOfActivityAnnotations.IECRuntimeInstanceAggregation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IECRuntimeInstanceAggregation> getRuntimeInstanceAggregations();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository#getDeploymentSpecification <em>Deployment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(IECFieldOfActivityAnnotationsRepository)
	 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECDeploymentSpecification_Parent()
	 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository#getDeploymentSpecification
	 * @model opposite="deploymentSpecification" required="true" transient="false"
	 * @generated
	 */
	IECFieldOfActivityAnnotationsRepository getParent();

	/**
	 * Sets the value of the '{@link IECFieldOfActivityAnnotations.IECDeploymentSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(IECFieldOfActivityAnnotationsRepository value);

} // IECDeploymentSpecification
