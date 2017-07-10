/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel;

import edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesRepository;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPS System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.SPSSystem#getContainsProgram <em>Contains Program</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.SPSSystem#getComponentInternalDependencies <em>Component Internal Dependencies</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getSPSSystem()
 * @model
 * @generated
 */
public interface SPSSystem extends Identifier, IECComponent {
	/**
	 * Returns the value of the '<em><b>Contains Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Program</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Program</em>' containment reference.
	 * @see #setContainsProgram(Program)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getSPSSystem_ContainsProgram()
	 * @model containment="true"
	 * @generated
	 */
	Program getContainsProgram();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.SPSSystem#getContainsProgram <em>Contains Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains Program</em>' containment reference.
	 * @see #getContainsProgram()
	 * @generated
	 */
	void setContainsProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Component Internal Dependencies</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.ComponentInternalDependencies.ComponentInternalDependenciesRepository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Internal Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Internal Dependencies</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage#getSPSSystem_ComponentInternalDependencies()
	 * @model
	 * @generated
	 */
	EList<ComponentInternalDependenciesRepository> getComponentInternalDependencies();

} // SPSSystem
