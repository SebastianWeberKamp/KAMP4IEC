/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECInterface#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECInterface#getHasMethod <em>Has Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECInterface#getHasProperty <em>Has Property</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getIECInterface()
 * @model
 * @generated
 */
public interface IECInterface extends DependencyResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getIECInterface_Type()
	 * @model required="true"
	 * @generated
	 */
	edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface getType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECInterface#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface value);

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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getIECInterface_HasMethod()
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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getIECInterface_HasProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<IECProperty> getHasProperty();

} // IECInterface
