/**
 */
package IECFieldOfActivityAnnotations.impl;

import IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage;
import IECFieldOfActivityAnnotations.IECTestSpecification;
import IECFieldOfActivityAnnotations.IECUnitTestCase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Unit Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IECFieldOfActivityAnnotations.impl.IECUnitTestCaseImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link IECFieldOfActivityAnnotations.impl.IECUnitTestCaseImpl#getProvidedrole <em>Providedrole</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECUnitTestCaseImpl extends IECTestCaseImpl implements IECUnitTestCase {
	/**
	 * The cached value of the '{@link #getProvidedrole() <em>Providedrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedrole()
	 * @generated
	 * @ordered
	 */
	protected OperationProvidedRole providedrole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECUnitTestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECFieldOfActivityAnnotationsPackage.Literals.IEC_UNIT_TEST_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECTestSpecification getParent() {
		if (eContainerFeatureID() != IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PARENT) return null;
		return (IECTestSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IECTestSpecification newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(IECTestSpecification newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASES, IECTestSpecification.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole getProvidedrole() {
		if (providedrole != null && ((EObject)providedrole).eIsProxy()) {
			InternalEObject oldProvidedrole = (InternalEObject)providedrole;
			providedrole = (OperationProvidedRole)eResolveProxy(oldProvidedrole);
			if (providedrole != oldProvidedrole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PROVIDEDROLE, oldProvidedrole, providedrole));
			}
		}
		return providedrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole basicGetProvidedrole() {
		return providedrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedrole(OperationProvidedRole newProvidedrole) {
		OperationProvidedRole oldProvidedrole = providedrole;
		providedrole = newProvidedrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PROVIDEDROLE, oldProvidedrole, providedrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((IECTestSpecification)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PARENT:
				return eInternalContainer().eInverseRemove(this, IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASES, IECTestSpecification.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PARENT:
				return getParent();
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PROVIDEDROLE:
				if (resolve) return getProvidedrole();
				return basicGetProvidedrole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PARENT:
				setParent((IECTestSpecification)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PROVIDEDROLE:
				setProvidedrole((OperationProvidedRole)newValue);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PARENT:
				setParent((IECTestSpecification)null);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PROVIDEDROLE:
				setProvidedrole((OperationProvidedRole)null);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PARENT:
				return getParent() != null;
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PROVIDEDROLE:
				return providedrole != null;
		}
		return super.eIsSet(featureID);
	}

} //IECUnitTestCaseImpl
