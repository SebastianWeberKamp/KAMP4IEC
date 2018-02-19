/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.*;

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
			case ModificationmarksPackage.IEC_MODIFICATION_REPOSITORY: return createIECModificationRepository();
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS: return createIECSeedModifications();
			case ModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY: return createIECChangePropagationDueToDataDependency();
			case ModificationmarksPackage.IEC_MODIFY_COMPONENT: return createIECModifyComponent();
			case ModificationmarksPackage.IEC_MODIFY_GLOBAL_VARIABLE: return createIECModifyGlobalVariable();
			case ModificationmarksPackage.IEC_MODIFY_FUNCTION_BLOCK: return createIECModifyFunctionBlock();
			case ModificationmarksPackage.IEC_MODIFY_FUNCTION: return createIECModifyFunction();
			case ModificationmarksPackage.IEC_MODIFY_INTERFACE: return createIECModifyInterface();
			case ModificationmarksPackage.IEC_MODIFY_METHOD: return createIECModifyMethod();
			case ModificationmarksPackage.IEC_MODIFY_ABSTRACT_METHOD: return createIECModifyAbstractMethod();
			case ModificationmarksPackage.IEC_MODIFY_PROPERTY: return createIECModifyProperty();
			case ModificationmarksPackage.IEC_MODIFY_ABSTRACT_PROPERTY: return createIECModifyAbstractProperty();
			case ModificationmarksPackage.IEC_MODIFY_PROGRAM: return createIECModifyProgram();
			case ModificationmarksPackage.IEC_MODIFY_CONFIGURATION: return createIECModifyConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModificationRepository createIECModificationRepository() {
		IECModificationRepositoryImpl iecModificationRepository = new IECModificationRepositoryImpl();
		return iecModificationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECSeedModifications createIECSeedModifications() {
		IECSeedModificationsImpl iecSeedModifications = new IECSeedModificationsImpl();
		return iecSeedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECChangePropagationDueToDataDependency createIECChangePropagationDueToDataDependency() {
		IECChangePropagationDueToDataDependencyImpl iecChangePropagationDueToDataDependency = new IECChangePropagationDueToDataDependencyImpl();
		return iecChangePropagationDueToDataDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends IECComponent> IECModifyComponent<T> createIECModifyComponent() {
		IECModifyComponentImpl<T> iecModifyComponent = new IECModifyComponentImpl<T>();
		return iecModifyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyGlobalVariable createIECModifyGlobalVariable() {
		IECModifyGlobalVariableImpl iecModifyGlobalVariable = new IECModifyGlobalVariableImpl();
		return iecModifyGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyFunctionBlock createIECModifyFunctionBlock() {
		IECModifyFunctionBlockImpl iecModifyFunctionBlock = new IECModifyFunctionBlockImpl();
		return iecModifyFunctionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyFunction createIECModifyFunction() {
		IECModifyFunctionImpl iecModifyFunction = new IECModifyFunctionImpl();
		return iecModifyFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyInterface createIECModifyInterface() {
		IECModifyInterfaceImpl iecModifyInterface = new IECModifyInterfaceImpl();
		return iecModifyInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyMethod createIECModifyMethod() {
		IECModifyMethodImpl iecModifyMethod = new IECModifyMethodImpl();
		return iecModifyMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyAbstractMethod createIECModifyAbstractMethod() {
		IECModifyAbstractMethodImpl iecModifyAbstractMethod = new IECModifyAbstractMethodImpl();
		return iecModifyAbstractMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyProperty createIECModifyProperty() {
		IECModifyPropertyImpl iecModifyProperty = new IECModifyPropertyImpl();
		return iecModifyProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyAbstractProperty createIECModifyAbstractProperty() {
		IECModifyAbstractPropertyImpl iecModifyAbstractProperty = new IECModifyAbstractPropertyImpl();
		return iecModifyAbstractProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyProgram createIECModifyProgram() {
		IECModifyProgramImpl iecModifyProgram = new IECModifyProgramImpl();
		return iecModifyProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyConfiguration createIECModifyConfiguration() {
		IECModifyConfigurationImpl iecModifyConfiguration = new IECModifyConfigurationImpl();
		return iecModifyConfiguration;
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
