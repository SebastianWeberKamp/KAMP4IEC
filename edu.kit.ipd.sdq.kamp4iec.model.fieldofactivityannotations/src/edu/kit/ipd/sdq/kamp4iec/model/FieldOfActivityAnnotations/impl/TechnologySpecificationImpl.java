/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl;

import edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologicalCorrespondence;
import edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologySpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TechnologySpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TechnologySpecificationImpl#getTechnologicalCorrespondences <em>Technological Correspondences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechnologySpecificationImpl extends MinimalEObjectImpl.Container implements TechnologySpecification {
	/**
	 * The cached value of the '{@link #getTechnologicalCorrespondences() <em>Technological Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologicalCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<TechnologicalCorrespondence> technologicalCorrespondences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologySpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldOfActivityAnnotationsPackage.Literals.TECHNOLOGY_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationsRepository getParent() {
		if (eContainerFeatureID() != FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__PARENT) return null;
		return (FieldOfActivityAnnotationsRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(FieldOfActivityAnnotationsRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(FieldOfActivityAnnotationsRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION, FieldOfActivityAnnotationsRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TechnologicalCorrespondence> getTechnologicalCorrespondences() {
		if (technologicalCorrespondences == null) {
			technologicalCorrespondences = new EObjectContainmentEList<TechnologicalCorrespondence>(TechnologicalCorrespondence.class, this, FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES);
		}
		return technologicalCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((FieldOfActivityAnnotationsRepository)otherEnd, msgs);
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
			case FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES:
				return ((InternalEList<?>)getTechnologicalCorrespondences()).basicRemove(otherEnd, msgs);
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
			case FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION, FieldOfActivityAnnotationsRepository.class, msgs);
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
			case FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__PARENT:
				return getParent();
			case FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES:
				return getTechnologicalCorrespondences();
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
			case FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationsRepository)newValue);
				return;
			case FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES:
				getTechnologicalCorrespondences().clear();
				getTechnologicalCorrespondences().addAll((Collection<? extends TechnologicalCorrespondence>)newValue);
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
			case FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__PARENT:
				setParent((FieldOfActivityAnnotationsRepository)null);
				return;
			case FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES:
				getTechnologicalCorrespondences().clear();
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
			case FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__PARENT:
				return getParent() != null;
			case FieldOfActivityAnnotationsPackage.TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES:
				return technologicalCorrespondences != null && !technologicalCorrespondences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TechnologySpecificationImpl
