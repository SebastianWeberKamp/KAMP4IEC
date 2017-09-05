/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getAccessesProperty <em>Accesses Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getAccessesGlobalVariable <em>Accesses Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getHasMethod <em>Has Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getHasProperty <em>Has Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getUsesEnum <em>Uses Enum</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getCallsFunction <em>Calls Function</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getImplements <em>Implements</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getInstantiatesFunctionBlock <em>Instantiates Function Block</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getCallsMethod <em>Calls Method</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getFunctionBlock()
 * @model
 * @generated
 */
public interface FunctionBlock extends DependencyResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getFunctionBlock_Type()
	 * @model required="true"
	 * @generated
	 */
	edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock getType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock value);

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getFunctionBlock_AccessesProperty()
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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getFunctionBlock_AccessesGlobalVariable()
	 * @model
	 * @generated
	 */
	EList<GlobalVariable> getAccessesGlobalVariable();

	/**
	 * Returns the value of the '<em><b>Has Method</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Method</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getFunctionBlock_HasMethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECMethod> getHasMethod();

	/**
	 * Returns the value of the '<em><b>Has Property</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Property</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getFunctionBlock_HasProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECProperty> getHasProperty();

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getFunctionBlock_UsesEnum()
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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getFunctionBlock_CallsFunction()
	 * @model
	 * @generated
	 */
	EList<Function> getCallsFunction();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getFunctionBlock_Implements()
	 * @model
	 * @generated
	 */
	EList<IECInterface> getImplements();

	/**
	 * Returns the value of the '<em><b>Instantiates Function Block</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates Function Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates Function Block</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getFunctionBlock_InstantiatesFunctionBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionBlock> getInstantiatesFunctionBlock();

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getFunctionBlock_CallsMethod()
	 * @model
	 * @generated
	 */
	EList<IECMethod> getCallsMethod();

} // FunctionBlock
