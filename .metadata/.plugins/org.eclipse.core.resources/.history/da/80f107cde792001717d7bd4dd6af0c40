/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getHasIecMethod <em>Has Iec Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getHasIecProperty <em>Has Iec Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionBlockImpl extends IdentifierImpl implements FunctionBlock {
	/**
	 * The cached value of the '{@link #getHasIecMethod() <em>Has Iec Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIecMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<IECMethod> hasIecMethod;

	/**
	 * The cached value of the '{@link #getHasIecProperty() <em>Has Iec Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIecProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IECProperty> hasIecProperty;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected ImplementsInterface implements_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECRepositoryPackage.Literals.FUNCTION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECMethod> getHasIecMethod() {
		if (hasIecMethod == null) {
			hasIecMethod = new EObjectContainmentEList<IECMethod>(IECMethod.class, this, IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD);
		}
		return hasIecMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECProperty> getHasIecProperty() {
		if (hasIecProperty == null) {
			hasIecProperty = new EObjectContainmentEList<IECProperty>(IECProperty.class, this, IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY);
		}
		return hasIecProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementsInterface getImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplements(ImplementsInterface newImplements, NotificationChain msgs) {
		ImplementsInterface oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS, oldImplements, newImplements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(ImplementsInterface newImplements) {
		if (newImplements != implements_) {
			NotificationChain msgs = null;
			if (implements_ != null)
				msgs = ((InternalEObject)implements_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS, null, msgs);
			if (newImplements != null)
				msgs = ((InternalEObject)newImplements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS, null, msgs);
			msgs = basicSetImplements(newImplements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS, newImplements, newImplements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
				return ((InternalEList<?>)getHasIecMethod()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
				return ((InternalEList<?>)getHasIecProperty()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS:
				return basicSetImplements(null, msgs);
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
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
				return getHasIecMethod();
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
				return getHasIecProperty();
			case IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS:
				return getImplements();
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
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
				getHasIecMethod().clear();
				getHasIecMethod().addAll((Collection<? extends IECMethod>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
				getHasIecProperty().clear();
				getHasIecProperty().addAll((Collection<? extends IECProperty>)newValue);
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS:
				setImplements((ImplementsInterface)newValue);
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
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
				getHasIecMethod().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
				getHasIecProperty().clear();
				return;
			case IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS:
				setImplements((ImplementsInterface)null);
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
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_METHOD:
				return hasIecMethod != null && !hasIecMethod.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__HAS_IEC_PROPERTY:
				return hasIecProperty != null && !hasIecProperty.isEmpty();
			case IECRepositoryPackage.FUNCTION_BLOCK__IMPLEMENTS:
				return implements_ != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionBlockImpl
