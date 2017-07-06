/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Element;

import edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.ModifikationmarksPackage;
import edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.ModifyElement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModifyElementImpl<T extends Element> extends AbstractModificationImpl<T, EObject> implements ModifyElement<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModifikationmarksPackage.Literals.MODIFY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setAffectedElement(T newAffectedElement) {
		super.setAffectedElement(newAffectedElement);
	}

} //ModifyElementImpl
