/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECComponent;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModificationmarksFactoryImpl extends EFactoryImpl implements ModificationmarksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModificationmarksFactory init() {
		try {
			ModificationmarksFactory theModificationmarksFactory = (ModificationmarksFactory)EPackage.Registry.INSTANCE.getEFactory(ModificationmarksPackage.eNS_URI);
			if (theModificationmarksFactory != null) {
				return theModificationmarksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModificationmarksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationmarksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModificationmarksPackage.KAMP4IEC_MODIFICATION_REPOSITORY: return createKAMP4IECModificationRepository();
			case ModificationmarksPackage.KAMP4IEC_SEED_MODIFICATIONS: return createKAMP4IECSeedModifications();
			case ModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY: return createChangePropagationDueToDataDependency();
			case ModificationmarksPackage.MODIFY_ELEMENT: return createModifyElement();
			case ModificationmarksPackage.MODIFY_GLOBAL_VARIABLE: return createModifyGlobalVariable();
			case ModificationmarksPackage.MODIFY_FUNCTION_BLOCK: return createModifyFunctionBlock();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4IECModificationRepository createKAMP4IECModificationRepository() {
		KAMP4IECModificationRepositoryImpl kamp4IECModificationRepository = new KAMP4IECModificationRepositoryImpl();
		return kamp4IECModificationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4IECSeedModifications createKAMP4IECSeedModifications() {
		KAMP4IECSeedModificationsImpl kamp4IECSeedModifications = new KAMP4IECSeedModificationsImpl();
		return kamp4IECSeedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangePropagationDueToDataDependency createChangePropagationDueToDataDependency() {
		ChangePropagationDueToDataDependencyImpl changePropagationDueToDataDependency = new ChangePropagationDueToDataDependencyImpl();
		return changePropagationDueToDataDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends IECComponent> ModifyElement<T> createModifyElement() {
		ModifyElementImpl<T> modifyElement = new ModifyElementImpl<T>();
		return modifyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyGlobalVariable createModifyGlobalVariable() {
		ModifyGlobalVariableImpl modifyGlobalVariable = new ModifyGlobalVariableImpl();
		return modifyGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyFunctionBlock createModifyFunctionBlock() {
		ModifyFunctionBlockImpl modifyFunctionBlock = new ModifyFunctionBlockImpl();
		return modifyFunctionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationmarksPackage getModificationmarksPackage() {
		return (ModificationmarksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModificationmarksPackage getPackage() {
		return ModificationmarksPackage.eINSTANCE;
	}

} //ModificationmarksFactoryImpl
