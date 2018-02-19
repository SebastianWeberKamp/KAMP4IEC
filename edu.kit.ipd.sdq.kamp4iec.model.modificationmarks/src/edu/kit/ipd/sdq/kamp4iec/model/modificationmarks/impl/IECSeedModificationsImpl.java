/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractSeedModificationsImpl;
import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyAbstractMethod;
import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyAbstractProperty;
import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyFunction;
import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyFunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyGlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyInterface;
import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyMethod;
import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyProgram;
import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyProperty;
import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECSeedModifications;

import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.ModificationmarksPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECSeedModificationsImpl#getGlobalVariableModifications <em>Global Variable Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECSeedModificationsImpl#getInterfaceModifications <em>Interface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECSeedModificationsImpl#getAbstractMethodModifications <em>Abstract Method Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECSeedModificationsImpl#getAbstractPropertyModifications <em>Abstract Property Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECSeedModificationsImpl#getFunctionBlockModifications <em>Function Block Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECSeedModificationsImpl#getMethodModifications <em>Method Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECSeedModificationsImpl#getPropertyModifications <em>Property Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECSeedModificationsImpl#getFunctionModifications <em>Function Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECSeedModificationsImpl#getProgramModifications <em>Program Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECSeedModificationsImpl extends AbstractSeedModificationsImpl implements IECSeedModifications {
	/**
	 * The cached value of the '{@link #getGlobalVariableModifications() <em>Global Variable Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariableModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyGlobalVariable> globalVariableModifications;

	/**
	 * The cached value of the '{@link #getInterfaceModifications() <em>Interface Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyInterface> interfaceModifications;
	/**
	 * The cached value of the '{@link #getAbstractMethodModifications() <em>Abstract Method Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractMethodModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyAbstractMethod> abstractMethodModifications;
	/**
	 * The cached value of the '{@link #getAbstractPropertyModifications() <em>Abstract Property Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractPropertyModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyAbstractProperty> abstractPropertyModifications;
	/**
	 * The cached value of the '{@link #getFunctionBlockModifications() <em>Function Block Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionBlockModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyFunctionBlock> functionBlockModifications;

	/**
	 * The cached value of the '{@link #getMethodModifications() <em>Method Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyMethod> methodModifications;

	/**
	 * The cached value of the '{@link #getPropertyModifications() <em>Property Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyProperty> propertyModifications;

	/**
	 * The cached value of the '{@link #getFunctionModifications() <em>Function Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyFunction> functionModifications;

	/**
	 * The cached value of the '{@link #getProgramModifications() <em>Program Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyProgram> programModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECSeedModificationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyGlobalVariable> getGlobalVariableModifications() {
		if (globalVariableModifications == null) {
			globalVariableModifications = new EObjectContainmentEList<IECModifyGlobalVariable>(IECModifyGlobalVariable.class, this, ModificationmarksPackage.IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS);
		}
		return globalVariableModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyInterface> getInterfaceModifications() {
		if (interfaceModifications == null) {
			interfaceModifications = new EObjectContainmentEList<IECModifyInterface>(IECModifyInterface.class, this, ModificationmarksPackage.IEC_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS);
		}
		return interfaceModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyAbstractMethod> getAbstractMethodModifications() {
		if (abstractMethodModifications == null) {
			abstractMethodModifications = new EObjectContainmentEList<IECModifyAbstractMethod>(IECModifyAbstractMethod.class, this, ModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS);
		}
		return abstractMethodModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyAbstractProperty> getAbstractPropertyModifications() {
		if (abstractPropertyModifications == null) {
			abstractPropertyModifications = new EObjectContainmentEList<IECModifyAbstractProperty>(IECModifyAbstractProperty.class, this, ModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS);
		}
		return abstractPropertyModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyFunctionBlock> getFunctionBlockModifications() {
		if (functionBlockModifications == null) {
			functionBlockModifications = new EObjectContainmentEList<IECModifyFunctionBlock>(IECModifyFunctionBlock.class, this, ModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS);
		}
		return functionBlockModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyMethod> getMethodModifications() {
		if (methodModifications == null) {
			methodModifications = new EObjectContainmentEList<IECModifyMethod>(IECModifyMethod.class, this, ModificationmarksPackage.IEC_SEED_MODIFICATIONS__METHOD_MODIFICATIONS);
		}
		return methodModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyProperty> getPropertyModifications() {
		if (propertyModifications == null) {
			propertyModifications = new EObjectContainmentEList<IECModifyProperty>(IECModifyProperty.class, this, ModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS);
		}
		return propertyModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyFunction> getFunctionModifications() {
		if (functionModifications == null) {
			functionModifications = new EObjectContainmentEList<IECModifyFunction>(IECModifyFunction.class, this, ModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS);
		}
		return functionModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyProgram> getProgramModifications() {
		if (programModifications == null) {
			programModifications = new EObjectContainmentEList<IECModifyProgram>(IECModifyProgram.class, this, ModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS);
		}
		return programModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS:
				return ((InternalEList<?>)getGlobalVariableModifications()).basicRemove(otherEnd, msgs);
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				return ((InternalEList<?>)getInterfaceModifications()).basicRemove(otherEnd, msgs);
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS:
				return ((InternalEList<?>)getAbstractMethodModifications()).basicRemove(otherEnd, msgs);
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS:
				return ((InternalEList<?>)getAbstractPropertyModifications()).basicRemove(otherEnd, msgs);
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS:
				return ((InternalEList<?>)getFunctionBlockModifications()).basicRemove(otherEnd, msgs);
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__METHOD_MODIFICATIONS:
				return ((InternalEList<?>)getMethodModifications()).basicRemove(otherEnd, msgs);
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS:
				return ((InternalEList<?>)getPropertyModifications()).basicRemove(otherEnd, msgs);
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS:
				return ((InternalEList<?>)getFunctionModifications()).basicRemove(otherEnd, msgs);
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS:
				return ((InternalEList<?>)getProgramModifications()).basicRemove(otherEnd, msgs);
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
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS:
				return getGlobalVariableModifications();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				return getInterfaceModifications();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS:
				return getAbstractMethodModifications();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS:
				return getAbstractPropertyModifications();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS:
				return getFunctionBlockModifications();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__METHOD_MODIFICATIONS:
				return getMethodModifications();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS:
				return getPropertyModifications();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS:
				return getFunctionModifications();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS:
				return getProgramModifications();
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
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS:
				getGlobalVariableModifications().clear();
				getGlobalVariableModifications().addAll((Collection<? extends IECModifyGlobalVariable>)newValue);
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
				getInterfaceModifications().addAll((Collection<? extends IECModifyInterface>)newValue);
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS:
				getAbstractMethodModifications().clear();
				getAbstractMethodModifications().addAll((Collection<? extends IECModifyAbstractMethod>)newValue);
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS:
				getAbstractPropertyModifications().clear();
				getAbstractPropertyModifications().addAll((Collection<? extends IECModifyAbstractProperty>)newValue);
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS:
				getFunctionBlockModifications().clear();
				getFunctionBlockModifications().addAll((Collection<? extends IECModifyFunctionBlock>)newValue);
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__METHOD_MODIFICATIONS:
				getMethodModifications().clear();
				getMethodModifications().addAll((Collection<? extends IECModifyMethod>)newValue);
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS:
				getPropertyModifications().clear();
				getPropertyModifications().addAll((Collection<? extends IECModifyProperty>)newValue);
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS:
				getFunctionModifications().clear();
				getFunctionModifications().addAll((Collection<? extends IECModifyFunction>)newValue);
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS:
				getProgramModifications().clear();
				getProgramModifications().addAll((Collection<? extends IECModifyProgram>)newValue);
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
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS:
				getGlobalVariableModifications().clear();
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS:
				getAbstractMethodModifications().clear();
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS:
				getAbstractPropertyModifications().clear();
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS:
				getFunctionBlockModifications().clear();
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__METHOD_MODIFICATIONS:
				getMethodModifications().clear();
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS:
				getPropertyModifications().clear();
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS:
				getFunctionModifications().clear();
				return;
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS:
				getProgramModifications().clear();
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
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS:
				return globalVariableModifications != null && !globalVariableModifications.isEmpty();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				return interfaceModifications != null && !interfaceModifications.isEmpty();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS:
				return abstractMethodModifications != null && !abstractMethodModifications.isEmpty();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS:
				return abstractPropertyModifications != null && !abstractPropertyModifications.isEmpty();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS:
				return functionBlockModifications != null && !functionBlockModifications.isEmpty();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__METHOD_MODIFICATIONS:
				return methodModifications != null && !methodModifications.isEmpty();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS:
				return propertyModifications != null && !propertyModifications.isEmpty();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS:
				return functionModifications != null && !functionModifications.isEmpty();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS:
				return programModifications != null && !programModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IECSeedModificationsImpl
