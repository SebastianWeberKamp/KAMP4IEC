/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration#getContainsProgram <em>Contains Program</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration#getDeclaresGlobalVariable <em>Declares Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration#getAccessesProperty <em>Accesses Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration#getAccessesGlobalVariable <em>Accesses Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration#getUsesEnum <em>Uses Enum</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends IECComponent {
	/**
	 * Returns the value of the '<em><b>Contains Program</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Program</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Program</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getConfiguration_ContainsProgram()
	 * @model containment="true"
	 * @generated
	 */
	EList<Program> getContainsProgram();

	/**
	 * Returns the value of the '<em><b>Declares Global Variable</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declares Global Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declares Global Variable</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getConfiguration_DeclaresGlobalVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalVariable> getDeclaresGlobalVariable();

	/**
	 * Returns the value of the '<em><b>Accesses Property</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesses Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesses Property</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getConfiguration_AccessesProperty()
	 * @model
	 * @generated
	 */
	EList<IECProperty> getAccessesProperty();

	/**
	 * Returns the value of the '<em><b>Accesses Global Variable</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesses Global Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesses Global Variable</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getConfiguration_AccessesGlobalVariable()
	 * @model
	 * @generated
	 */
	EList<GlobalVariable> getAccessesGlobalVariable();

	/**
	 * Returns the value of the '<em><b>Uses Enum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Enum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Enum</em>' containment reference.
	 * @see #setUsesEnum(Enums)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getConfiguration_UsesEnum()
	 * @model containment="true"
	 * @generated
	 */
	Enums getUsesEnum();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration#getUsesEnum <em>Uses Enum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Enum</em>' containment reference.
	 * @see #getUsesEnum()
	 * @generated
	 */
	void setUsesEnum(Enums value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Configuration)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getConfiguration_Type()
	 * @model required="true"
	 * @generated
	 */
	edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Configuration getType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Configuration value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference.
	 * @see #setInterfaces(Interfaces)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getConfiguration_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	Interfaces getInterfaces();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration#getInterfaces <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaces</em>' containment reference.
	 * @see #getInterfaces()
	 * @generated
	 */
	void setInterfaces(Interfaces value);

} // Configuration
