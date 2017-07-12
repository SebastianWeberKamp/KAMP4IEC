/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getDevelopmentArtefactSpecification <em>Development Artefact Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getBuildSpecification <em>Build Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTestSpecification <em>Test Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getReleaseSpecification <em>Release Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getDeploymentSpecification <em>Deployment Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getStaffSpecification <em>Staff Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTechnologySpecification <em>Technology Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getDesignPatternSpecification <em>Design Pattern Specification</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository()
 * @model
 * @generated
 */
public interface FieldOfActivityAnnotationsRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Development Artefact Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Development Artefact Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Artefact Specification</em>' containment reference.
	 * @see #setDevelopmentArtefactSpecification(DevelopmentArtefactSpecification)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_DevelopmentArtefactSpecification()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	DevelopmentArtefactSpecification getDevelopmentArtefactSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getDevelopmentArtefactSpecification <em>Development Artefact Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Artefact Specification</em>' containment reference.
	 * @see #getDevelopmentArtefactSpecification()
	 * @generated
	 */
	void setDevelopmentArtefactSpecification(DevelopmentArtefactSpecification value);

	/**
	 * Returns the value of the '<em><b>Build Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Specification</em>' containment reference.
	 * @see #setBuildSpecification(BuildSpecification)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_BuildSpecification()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	BuildSpecification getBuildSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getBuildSpecification <em>Build Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Specification</em>' containment reference.
	 * @see #getBuildSpecification()
	 * @generated
	 */
	void setBuildSpecification(BuildSpecification value);

	/**
	 * Returns the value of the '<em><b>Test Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Specification</em>' containment reference.
	 * @see #setTestSpecification(TestSpecification)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_TestSpecification()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	TestSpecification getTestSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTestSpecification <em>Test Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Specification</em>' containment reference.
	 * @see #getTestSpecification()
	 * @generated
	 */
	void setTestSpecification(TestSpecification value);

	/**
	 * Returns the value of the '<em><b>Release Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Specification</em>' containment reference.
	 * @see #setReleaseSpecification(ReleaseSpecification)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_ReleaseSpecification()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ReleaseSpecification getReleaseSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getReleaseSpecification <em>Release Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Specification</em>' containment reference.
	 * @see #getReleaseSpecification()
	 * @generated
	 */
	void setReleaseSpecification(ReleaseSpecification value);

	/**
	 * Returns the value of the '<em><b>Deployment Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DeploymentSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Specification</em>' containment reference.
	 * @see #setDeploymentSpecification(DeploymentSpecification)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_DeploymentSpecification()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DeploymentSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	DeploymentSpecification getDeploymentSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getDeploymentSpecification <em>Deployment Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Specification</em>' containment reference.
	 * @see #getDeploymentSpecification()
	 * @generated
	 */
	void setDeploymentSpecification(DeploymentSpecification value);

	/**
	 * Returns the value of the '<em><b>Staff Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.StaffSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Specification</em>' containment reference.
	 * @see #setStaffSpecification(StaffSpecification)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_StaffSpecification()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.StaffSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	StaffSpecification getStaffSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getStaffSpecification <em>Staff Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff Specification</em>' containment reference.
	 * @see #getStaffSpecification()
	 * @generated
	 */
	void setStaffSpecification(StaffSpecification value);

	/**
	 * Returns the value of the '<em><b>Technology Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologySpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology Specification</em>' containment reference.
	 * @see #setTechnologySpecification(TechnologySpecification)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_TechnologySpecification()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologySpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	TechnologySpecification getTechnologySpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTechnologySpecification <em>Technology Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology Specification</em>' containment reference.
	 * @see #getTechnologySpecification()
	 * @generated
	 */
	void setTechnologySpecification(TechnologySpecification value);

	/**
	 * Returns the value of the '<em><b>Design Pattern Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Pattern Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Pattern Specification</em>' containment reference.
	 * @see #setDesignPatternSpecification(DesignPatternSpecification)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage#getFieldOfActivityAnnotationsRepository_DesignPatternSpecification()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	DesignPatternSpecification getDesignPatternSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getDesignPatternSpecification <em>Design Pattern Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Pattern Specification</em>' containment reference.
	 * @see #getDesignPatternSpecification()
	 * @generated
	 */
	void setDesignPatternSpecification(DesignPatternSpecification value);

} // FieldOfActivityAnnotationsRepository
