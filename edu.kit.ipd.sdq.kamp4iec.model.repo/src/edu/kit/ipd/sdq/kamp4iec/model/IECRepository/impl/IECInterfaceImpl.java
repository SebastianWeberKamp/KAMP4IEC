/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl#getDefinesIecMethod <em>Defines Iec Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl#getDefinesIecProperty <em>Defines Iec Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECInterfaceImpl extends IdentifierImpl implements IECInterface {
	/**
	 * The cached value of the '{@link #getDefinesIecMethod() <em>Defines Iec Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinesIecMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<IECAbstractMethod> definesIecMethod;

	/**
	 * The cached value of the '{@link #getDefinesIecProperty() <em>Defines Iec Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinesIecProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IECAbstractProperty> definesIecProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECRepositoryPackage.Literals.IEC_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECAbstractMethod> getDefinesIecMethod() {
		if (definesIecMethod == null) {
			definesIecMethod = new EObjectContainmentEList<IECAbstractMethod>(IECAbstractMethod.class, this, IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_METHOD);
		}
		return definesIecMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECAbstractProperty> getDefinesIecProperty() {
		if (definesIecProperty == null) {
			definesIecProperty = new EObjectContainmentEList<IECAbstractProperty>(IECAbstractProperty.class, this, IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_PROPERTY);
		}
		return definesIecProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_METHOD:
				return ((InternalEList<?>)getDefinesIecMethod()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_PROPERTY:
				return ((InternalEList<?>)getDefinesIecProperty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_METHOD:
				return getDefinesIecMethod();
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_PROPERTY:
				return getDefinesIecProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_METHOD:
				getDefinesIecMethod().clear();
				getDefinesIecMethod().addAll((Collection<? extends IECAbstractMethod>)newValue);
				return;
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_PROPERTY:
				getDefinesIecProperty().clear();
				getDefinesIecProperty().addAll((Collection<? extends IECAbstractProperty>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_METHOD:
				getDefinesIecMethod().clear();
				return;
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_PROPERTY:
				getDefinesIecProperty().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_METHOD:
				return definesIecMethod != null && !definesIecMethod.isEmpty();
			case IECRepositoryPackage.IEC_INTERFACE__DEFINES_IEC_PROPERTY:
				return definesIecProperty != null && !definesIecProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IECInterfaceImpl
