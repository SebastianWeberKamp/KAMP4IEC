/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethod#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethod#getAccessesGlobalVariable <em>Accesses Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethod#getAccessesProperty <em>Accesses Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethod#getUsesEnum <em>Uses Enum</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethod#getCallsFunction <em>Calls Function</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethod#getImplements <em>Implements</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethod#getCallsMethod <em>Calls Method</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getIECMethod()
 * @model
 * @generated
 */
public interface IECMethod extends DependencyResource {
	/**
	 * Returns the value of the '<em><b>Uses Enum</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Enum</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Enum</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getIECMethod_UsesEnum()
	 * @model
	 * @generated
	 */
	EList<edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum> getUsesEnum();

	/**
	 * Returns the value of the '<em><b>Calls Function</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls Function</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls Function</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getIECMethod_CallsFunction()
	 * @model
	 * @generated
	 */
	EList<Function> getCallsFunction();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getIECMethod_Type()
	 * @model required="true" derived="true"
	 * @generated
	 */
	edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod getType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethod#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod value);

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getIECMethod_AccessesGlobalVariable()
	 * @model
	 * @generated
	 */
	EList<GlobalVariable> getAccessesGlobalVariable();

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getIECMethod_AccessesProperty()
	 * @model
	 * @generated
	 */
	EList<IECProperty> getAccessesProperty();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(IECAbstractMethod)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getIECMethod_Implements()
	 * @model derived="true"
	 * @generated
	 */
	IECAbstractMethod getImplements();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethod#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(IECAbstractMethod value);

	/**
	 * Returns the value of the '<em><b>Calls Method</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls Method</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls Method</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getIECMethod_CallsMethod()
	 * @model
	 * @generated
	 */
	EList<IECMethod> getCallsMethod();

} // IECMethod
