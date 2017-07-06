/**
 */
package Modifikationmarks.impl;

import Modifikationmarks.KAMP4IECSeedModifications;
import Modifikationmarks.ModifikationmarksPackage;
import Modifikationmarks.ModifyFunctionBlock;
import Modifikationmarks.ModifyGlobalVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KAMP4IEC Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Modifikationmarks.impl.KAMP4IECSeedModificationsImpl#getGlobalVariableModifications <em>Global Variable Modifications</em>}</li>
 *   <li>{@link Modifikationmarks.impl.KAMP4IECSeedModificationsImpl#getFunctionblockModifications <em>Functionblock Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KAMP4IECSeedModificationsImpl extends MinimalEObjectImpl.Container implements KAMP4IECSeedModifications {
	/**
	 * The cached value of the '{@link #getGlobalVariableModifications() <em>Global Variable Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariableModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyGlobalVariable> globalVariableModifications;

	/**
	 * The cached value of the '{@link #getFunctionblockModifications() <em>Functionblock Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionblockModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifyFunctionBlock> functionblockModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KAMP4IECSeedModificationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModifikationmarksPackage.Literals.KAMP4IEC_SEED_MODIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyGlobalVariable> getGlobalVariableModifications() {
		if (globalVariableModifications == null) {
			globalVariableModifications = new EObjectContainmentEList<ModifyGlobalVariable>(ModifyGlobalVariable.class, this, ModifikationmarksPackage.KAMP4IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS);
		}
		return globalVariableModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModifyFunctionBlock> getFunctionblockModifications() {
		if (functionblockModifications == null) {
			functionblockModifications = new EObjectContainmentEList<ModifyFunctionBlock>(ModifyFunctionBlock.class, this, ModifikationmarksPackage.KAMP4IEC_SEED_MODIFICATIONS__FUNCTIONBLOCK_MODIFICATIONS);
		}
		return functionblockModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModifikationmarksPackage.KAMP4IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS:
				return ((InternalEList<?>)getGlobalVariableModifications()).basicRemove(otherEnd, msgs);
			case ModifikationmarksPackage.KAMP4IEC_SEED_MODIFICATIONS__FUNCTIONBLOCK_MODIFICATIONS:
				return ((InternalEList<?>)getFunctionblockModifications()).basicRemove(otherEnd, msgs);
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
			case ModifikationmarksPackage.KAMP4IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS:
				return getGlobalVariableModifications();
			case ModifikationmarksPackage.KAMP4IEC_SEED_MODIFICATIONS__FUNCTIONBLOCK_MODIFICATIONS:
				return getFunctionblockModifications();
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
			case ModifikationmarksPackage.KAMP4IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS:
				getGlobalVariableModifications().clear();
				getGlobalVariableModifications().addAll((Collection<? extends ModifyGlobalVariable>)newValue);
				return;
			case ModifikationmarksPackage.KAMP4IEC_SEED_MODIFICATIONS__FUNCTIONBLOCK_MODIFICATIONS:
				getFunctionblockModifications().clear();
				getFunctionblockModifications().addAll((Collection<? extends ModifyFunctionBlock>)newValue);
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
			case ModifikationmarksPackage.KAMP4IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS:
				getGlobalVariableModifications().clear();
				return;
			case ModifikationmarksPackage.KAMP4IEC_SEED_MODIFICATIONS__FUNCTIONBLOCK_MODIFICATIONS:
				getFunctionblockModifications().clear();
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
			case ModifikationmarksPackage.KAMP4IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS:
				return globalVariableModifications != null && !globalVariableModifications.isEmpty();
			case ModifikationmarksPackage.KAMP4IEC_SEED_MODIFICATIONS__FUNCTIONBLOCK_MODIFICATIONS:
				return functionblockModifications != null && !functionblockModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KAMP4IECSeedModificationsImpl