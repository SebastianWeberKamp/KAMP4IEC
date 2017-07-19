/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECBuildConfiguration;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECBuildSpecification;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECThirdPartyComponentOrLibrary;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Build Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECBuildSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECBuildSpecificationImpl#getBuildConfigurations <em>Build Configurations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECBuildSpecificationImpl#getThirdPartyComponentOrLibraries <em>Third Party Component Or Libraries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECBuildSpecificationImpl extends MinimalEObjectImpl.Container implements IECBuildSpecification {
	/**
	 * The cached value of the '{@link #getBuildConfigurations() <em>Build Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<IECBuildConfiguration> buildConfigurations;

	/**
	 * The cached value of the '{@link #getThirdPartyComponentOrLibraries() <em>Third Party Component Or Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdPartyComponentOrLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<IECThirdPartyComponentOrLibrary> thirdPartyComponentOrLibraries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECBuildSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECFieldOfActivityAnnotationsPackage.Literals.IEC_BUILD_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECFieldOfActivityAnnotationsRepository getParent() {
		if (eContainerFeatureID() != IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__PARENT) return null;
		return (IECFieldOfActivityAnnotationsRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IECFieldOfActivityAnnotationsRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(IECFieldOfActivityAnnotationsRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION, IECFieldOfActivityAnnotationsRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECBuildConfiguration> getBuildConfigurations() {
		if (buildConfigurations == null) {
			buildConfigurations = new EObjectContainmentWithInverseEList<IECBuildConfiguration>(IECBuildConfiguration.class, this, IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS, IECFieldOfActivityAnnotationsPackage.IEC_BUILD_CONFIGURATION__PARENT);
		}
		return buildConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECThirdPartyComponentOrLibrary> getThirdPartyComponentOrLibraries() {
		if (thirdPartyComponentOrLibraries == null) {
			thirdPartyComponentOrLibraries = new EObjectContainmentWithInverseEList<IECThirdPartyComponentOrLibrary>(IECThirdPartyComponentOrLibrary.class, this, IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES, IECFieldOfActivityAnnotationsPackage.IEC_THIRD_PARTY_COMPONENT_OR_LIBRARY__PARENT);
		}
		return thirdPartyComponentOrLibraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((IECFieldOfActivityAnnotationsRepository)otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBuildConfigurations()).basicAdd(otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThirdPartyComponentOrLibraries()).basicAdd(otherEnd, msgs);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				return ((InternalEList<?>)getBuildConfigurations()).basicRemove(otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
				return ((InternalEList<?>)getThirdPartyComponentOrLibraries()).basicRemove(otherEnd, msgs);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION, IECFieldOfActivityAnnotationsRepository.class, msgs);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__PARENT:
				return getParent();
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				return getBuildConfigurations();
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
				return getThirdPartyComponentOrLibraries();
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
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__PARENT:
				setParent((IECFieldOfActivityAnnotationsRepository)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				getBuildConfigurations().clear();
				getBuildConfigurations().addAll((Collection<? extends IECBuildConfiguration>)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
				getThirdPartyComponentOrLibraries().clear();
				getThirdPartyComponentOrLibraries().addAll((Collection<? extends IECThirdPartyComponentOrLibrary>)newValue);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__PARENT:
				setParent((IECFieldOfActivityAnnotationsRepository)null);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				getBuildConfigurations().clear();
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
				getThirdPartyComponentOrLibraries().clear();
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
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__PARENT:
				return getParent() != null;
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				return buildConfigurations != null && !buildConfigurations.isEmpty();
			case IECFieldOfActivityAnnotationsPackage.IEC_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
				return thirdPartyComponentOrLibraries != null && !thirdPartyComponentOrLibraries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IECBuildSpecificationImpl
