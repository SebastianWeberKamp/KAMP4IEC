/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository;

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
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasIecMethod <em>Has Iec Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasIecProperty <em>Has Iec Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getFunctionBlock()
 * @model
 * @generated
 */
public interface FunctionBlock extends Identifier, DerivedType {
	/**
	 * Returns the value of the '<em><b>Has Iec Method</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Iec Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Iec Method</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getFunctionBlock_HasIecMethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECMethod> getHasIecMethod();

	/**
	 * Returns the value of the '<em><b>Has Iec Property</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Iec Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Iec Property</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getFunctionBlock_HasIecProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECProperty> getHasIecProperty();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' containment reference.
	 * @see #setImplements(ImplementsInterface)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage#getFunctionBlock_Implements()
	 * @model containment="true"
	 * @generated
	 */
	ImplementsInterface getImplements();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getImplements <em>Implements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' containment reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(ImplementsInterface value);

} // FunctionBlock
