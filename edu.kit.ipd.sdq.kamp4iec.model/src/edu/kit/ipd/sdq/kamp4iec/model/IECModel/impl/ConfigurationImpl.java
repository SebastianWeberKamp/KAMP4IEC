/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ConfigurationImpl#getInstantiatesProgram <em>Instantiates Program</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ConfigurationImpl#getDeclaresGlobalVariable <em>Declares Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ConfigurationImpl#getReadsGlobalVariable <em>Reads Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ConfigurationImpl#getWritesGlobalVariable <em>Writes Global Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ConfigurationImpl#getReadsProperty <em>Reads Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ConfigurationImpl#getWritesProperty <em>Writes Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends IdentifierImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getInstantiatesProgram() <em>Instantiates Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> instantiatesProgram;

	/**
	 * The cached value of the '{@link #getDeclaresGlobalVariable() <em>Declares Global Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaresGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> declaresGlobalVariable;

	/**
	 * The cached value of the '{@link #getReadsGlobalVariable() <em>Reads Global Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadsGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> readsGlobalVariable;

	/**
	 * The cached value of the '{@link #getWritesGlobalVariable() <em>Writes Global Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritesGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> writesGlobalVariable;

	/**
	 * The cached value of the '{@link #getReadsProperty() <em>Reads Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadsProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IECProperty> readsProperty;

	/**
	 * The cached value of the '{@link #getWritesProperty() <em>Writes Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritesProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IECProperty> writesProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECModelPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Program> getInstantiatesProgram() {
		if (instantiatesProgram == null) {
			instantiatesProgram = new EObjectContainmentEList<Program>(Program.class, this, IECModelPackage.CONFIGURATION__INSTANTIATES_PROGRAM);
		}
		return instantiatesProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getDeclaresGlobalVariable() {
		if (declaresGlobalVariable == null) {
			declaresGlobalVariable = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, IECModelPackage.CONFIGURATION__DECLARES_GLOBAL_VARIABLE);
		}
		return declaresGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getReadsGlobalVariable() {
		if (readsGlobalVariable == null) {
			readsGlobalVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, IECModelPackage.CONFIGURATION__READS_GLOBAL_VARIABLE);
		}
		return readsGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getWritesGlobalVariable() {
		if (writesGlobalVariable == null) {
			writesGlobalVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, IECModelPackage.CONFIGURATION__WRITES_GLOBAL_VARIABLE);
		}
		return writesGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECProperty> getReadsProperty() {
		if (readsProperty == null) {
			readsProperty = new EObjectResolvingEList<IECProperty>(IECProperty.class, this, IECModelPackage.CONFIGURATION__READS_PROPERTY);
		}
		return readsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECProperty> getWritesProperty() {
		if (writesProperty == null) {
			writesProperty = new EObjectResolvingEList<IECProperty>(IECProperty.class, this, IECModelPackage.CONFIGURATION__WRITES_PROPERTY);
		}
		return writesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECModelPackage.CONFIGURATION__INSTANTIATES_PROGRAM:
				return ((InternalEList<?>)getInstantiatesProgram()).basicRemove(otherEnd, msgs);
			case IECModelPackage.CONFIGURATION__DECLARES_GLOBAL_VARIABLE:
				return ((InternalEList<?>)getDeclaresGlobalVariable()).basicRemove(otherEnd, msgs);
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
			case IECModelPackage.CONFIGURATION__INSTANTIATES_PROGRAM:
				return getInstantiatesProgram();
			case IECModelPackage.CONFIGURATION__DECLARES_GLOBAL_VARIABLE:
				return getDeclaresGlobalVariable();
			case IECModelPackage.CONFIGURATION__READS_GLOBAL_VARIABLE:
				return getReadsGlobalVariable();
			case IECModelPackage.CONFIGURATION__WRITES_GLOBAL_VARIABLE:
				return getWritesGlobalVariable();
			case IECModelPackage.CONFIGURATION__READS_PROPERTY:
				return getReadsProperty();
			case IECModelPackage.CONFIGURATION__WRITES_PROPERTY:
				return getWritesProperty();
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
			case IECModelPackage.CONFIGURATION__INSTANTIATES_PROGRAM:
				getInstantiatesProgram().clear();
				getInstantiatesProgram().addAll((Collection<? extends Program>)newValue);
				return;
			case IECModelPackage.CONFIGURATION__DECLARES_GLOBAL_VARIABLE:
				getDeclaresGlobalVariable().clear();
				getDeclaresGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECModelPackage.CONFIGURATION__READS_GLOBAL_VARIABLE:
				getReadsGlobalVariable().clear();
				getReadsGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECModelPackage.CONFIGURATION__WRITES_GLOBAL_VARIABLE:
				getWritesGlobalVariable().clear();
				getWritesGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case IECModelPackage.CONFIGURATION__READS_PROPERTY:
				getReadsProperty().clear();
				getReadsProperty().addAll((Collection<? extends IECProperty>)newValue);
				return;
			case IECModelPackage.CONFIGURATION__WRITES_PROPERTY:
				getWritesProperty().clear();
				getWritesProperty().addAll((Collection<? extends IECProperty>)newValue);
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
			case IECModelPackage.CONFIGURATION__INSTANTIATES_PROGRAM:
				getInstantiatesProgram().clear();
				return;
			case IECModelPackage.CONFIGURATION__DECLARES_GLOBAL_VARIABLE:
				getDeclaresGlobalVariable().clear();
				return;
			case IECModelPackage.CONFIGURATION__READS_GLOBAL_VARIABLE:
				getReadsGlobalVariable().clear();
				return;
			case IECModelPackage.CONFIGURATION__WRITES_GLOBAL_VARIABLE:
				getWritesGlobalVariable().clear();
				return;
			case IECModelPackage.CONFIGURATION__READS_PROPERTY:
				getReadsProperty().clear();
				return;
			case IECModelPackage.CONFIGURATION__WRITES_PROPERTY:
				getWritesProperty().clear();
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
			case IECModelPackage.CONFIGURATION__INSTANTIATES_PROGRAM:
				return instantiatesProgram != null && !instantiatesProgram.isEmpty();
			case IECModelPackage.CONFIGURATION__DECLARES_GLOBAL_VARIABLE:
				return declaresGlobalVariable != null && !declaresGlobalVariable.isEmpty();
			case IECModelPackage.CONFIGURATION__READS_GLOBAL_VARIABLE:
				return readsGlobalVariable != null && !readsGlobalVariable.isEmpty();
			case IECModelPackage.CONFIGURATION__WRITES_GLOBAL_VARIABLE:
				return writesGlobalVariable != null && !writesGlobalVariable.isEmpty();
			case IECModelPackage.CONFIGURATION__READS_PROPERTY:
				return readsProperty != null && !readsProperty.isEmpty();
			case IECModelPackage.CONFIGURATION__WRITES_PROPERTY:
				return writesProperty != null && !writesProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
