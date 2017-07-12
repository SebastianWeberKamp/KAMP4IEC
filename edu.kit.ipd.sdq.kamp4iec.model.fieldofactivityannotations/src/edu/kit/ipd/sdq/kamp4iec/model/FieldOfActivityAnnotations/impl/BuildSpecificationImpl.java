/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl;

import edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildConfiguration;
import edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildSpecification;
import edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ThirdPartyComponentOrLibrary;

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
 * An implementation of the model object '<em><b>Build Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.BuildSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.BuildSpecificationImpl#getBuildConfigurations <em>Build Configurations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.BuildSpecificationImpl#getThirdPartyComponentOrLibraries <em>Third Party Component Or Libraries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildSpecificationImpl extends MinimalEObjectImpl.Container implements BuildSpecification {
	/**
	 * The cached value of the '{@link #getBuildConfigurations() <em>Build Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<BuildConfiguration> buildConfigurations;

	/**
	 * The cached value of the '{@link #getThirdPartyComponentOrLibraries() <em>Third Party Component Or Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdPartyComponentOrLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<ThirdPartyComponentOrLibrary> thirdPartyComponentOrLibraries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldOfActivityAnnotationsPackage.Literals.BUILD_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationsRepository getParent() {
		if (eContainerFeatureID() != FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__PARENT) return null;
		return (FieldOfActivityAnnotationsRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(FieldOfActivityAnnotationsRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(FieldOfActivityAnnotationsRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION, FieldOfActivityAnnotationsRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BuildConfiguration> getBuildConfigurations() {
		if (buildConfigurations == null) {
			buildConfigurations = new EObjectContainmentWithInverseEList<BuildConfiguration>(BuildConfiguration.class, this, FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__BUILD_CONFIGURATIONS, FieldOfActivityAnnotationsPackage.BUILD_CONFIGURATION__PARENT);
		}
		return buildConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThirdPartyComponentOrLibrary> getThirdPartyComponentOrLibraries() {
		if (thirdPartyComponentOrLibraries == null) {
			thirdPartyComponentOrLibraries = new EObjectContainmentWithInverseEList<ThirdPartyComponentOrLibrary>(ThirdPartyComponentOrLibrary.class, this, FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES, FieldOfActivityAnnotationsPackage.THIRD_PARTY_COMPONENT_OR_LIBRARY__PARENT);
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
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((FieldOfActivityAnnotationsRepository)otherEnd, msgs);
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBuildConfigurations()).basicAdd(otherEnd, msgs);
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
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
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				return ((InternalEList<?>)getBuildConfigurations()).basicRemove(otherEnd, msgs);
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
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
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION, FieldOfActivityAnnotationsRepository.class, msgs);
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
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__PARENT:
				return getParent();
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				return getBuildConfigurations();
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
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
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationsRepository)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				getBuildConfigurations().clear();
				getBuildConfigurations().addAll((Collection<? extends BuildConfiguration>)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
				getThirdPartyComponentOrLibraries().clear();
				getThirdPartyComponentOrLibraries().addAll((Collection<? extends ThirdPartyComponentOrLibrary>)newValue);
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
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationsRepository)null);
				return;
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				getBuildConfigurations().clear();
				return;
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
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
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__PARENT:
				return getParent() != null;
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				return buildConfigurations != null && !buildConfigurations.isEmpty();
			case FieldOfActivityAnnotationsPackage.BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
				return thirdPartyComponentOrLibraries != null && !thirdPartyComponentOrLibraries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BuildSpecificationImpl
