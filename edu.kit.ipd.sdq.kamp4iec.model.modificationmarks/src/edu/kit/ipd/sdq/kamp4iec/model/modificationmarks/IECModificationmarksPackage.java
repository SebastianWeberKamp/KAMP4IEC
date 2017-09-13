/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModificationmarksFactory
 * @model kind="package"
 * @generated
 */
public interface IECModificationmarksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modificationmarks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/modificationmarks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modificationmarks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IECModificationmarksPackage eINSTANCE = edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.AbstractKAMP4IECModificationRepositoryImpl <em>Abstract KAMP4IEC Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.AbstractKAMP4IECModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getAbstractKAMP4IECModificationRepository()
	 * @generated
	 */
	int ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>Abstract KAMP4IEC Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract KAMP4IEC Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationRepositoryImpl <em>IEC Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModificationRepository()
	 * @generated
	 */
	int IEC_MODIFICATION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>IEC Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFICATION_REPOSITORY_FEATURE_COUNT = ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFICATION_REPOSITORY_OPERATION_COUNT = ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECSeedModificationsImpl <em>IEC Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECSeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECSeedModifications()
	 * @generated
	 */
	int IEC_SEED_MODIFICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Global Variable Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IEC Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SEED_MODIFICATIONS_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IEC Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SEED_MODIFICATIONS_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECChangePropagationDueToDataDependencyImpl <em>IEC Change Propagation Due To Data Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECChangePropagationDueToDataDependencyImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECChangePropagationDueToDataDependency()
	 * @generated
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY = 3;

	/**
	 * The feature id for the '<em><b>Function Block Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_BLOCK_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Global Variable Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__GLOBAL_VARIABLE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__INTERFACE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract Method Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_METHOD_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Property Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_PROPERTY_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Program Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROGRAM_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Configuration Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CONFIGURATION_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Method Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__METHOD_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Property Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROPERTY_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>IEC Change Propagation Due To Data Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY_FEATURE_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>IEC Change Propagation Due To Data Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY_OPERATION_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyComponentImpl <em>IEC Modify Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyComponentImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyComponent()
	 * @generated
	 */
	int IEC_MODIFY_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_COMPONENT__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_COMPONENT__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_COMPONENT__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_COMPONENT__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_COMPONENT__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IEC Modify Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_COMPONENT_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Modify Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_COMPONENT_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyGlobalVariableImpl <em>IEC Modify Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyGlobalVariableImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyGlobalVariable()
	 * @generated
	 */
	int IEC_MODIFY_GLOBAL_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_GLOBAL_VARIABLE__AFFECTED_ELEMENT = IEC_MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_GLOBAL_VARIABLE__CAUSING_ELEMENTS = IEC_MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_GLOBAL_VARIABLE__ID = IEC_MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_GLOBAL_VARIABLE__TOOLDERIVED = IEC_MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_GLOBAL_VARIABLE__USER_DECISION = IEC_MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IEC Modify Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_GLOBAL_VARIABLE_FEATURE_COUNT = IEC_MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Modify Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_GLOBAL_VARIABLE_OPERATION_COUNT = IEC_MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyFunctionBlockImpl <em>IEC Modify Function Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyFunctionBlockImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyFunctionBlock()
	 * @generated
	 */
	int IEC_MODIFY_FUNCTION_BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION_BLOCK__AFFECTED_ELEMENT = IEC_MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION_BLOCK__CAUSING_ELEMENTS = IEC_MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION_BLOCK__ID = IEC_MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION_BLOCK__TOOLDERIVED = IEC_MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION_BLOCK__USER_DECISION = IEC_MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IEC Modify Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION_BLOCK_FEATURE_COUNT = IEC_MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Modify Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION_BLOCK_OPERATION_COUNT = IEC_MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyFunctionImpl <em>IEC Modify Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyFunctionImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyFunction()
	 * @generated
	 */
	int IEC_MODIFY_FUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION__AFFECTED_ELEMENT = IEC_MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION__CAUSING_ELEMENTS = IEC_MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION__ID = IEC_MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION__TOOLDERIVED = IEC_MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION__USER_DECISION = IEC_MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IEC Modify Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION_FEATURE_COUNT = IEC_MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Modify Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION_OPERATION_COUNT = IEC_MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyInterfaceImpl <em>IEC Modify Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyInterfaceImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyInterface()
	 * @generated
	 */
	int IEC_MODIFY_INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_INTERFACE__AFFECTED_ELEMENT = IEC_MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_INTERFACE__CAUSING_ELEMENTS = IEC_MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_INTERFACE__ID = IEC_MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_INTERFACE__TOOLDERIVED = IEC_MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_INTERFACE__USER_DECISION = IEC_MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IEC Modify Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_INTERFACE_FEATURE_COUNT = IEC_MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Modify Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_INTERFACE_OPERATION_COUNT = IEC_MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyMethodImpl <em>IEC Modify Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyMethodImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyMethod()
	 * @generated
	 */
	int IEC_MODIFY_METHOD = 9;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_METHOD__AFFECTED_ELEMENT = IEC_MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_METHOD__CAUSING_ELEMENTS = IEC_MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_METHOD__ID = IEC_MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_METHOD__TOOLDERIVED = IEC_MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_METHOD__USER_DECISION = IEC_MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IEC Modify Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_METHOD_FEATURE_COUNT = IEC_MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Modify Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_METHOD_OPERATION_COUNT = IEC_MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyAbstractMethodImpl <em>IEC Modify Abstract Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyAbstractMethodImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyAbstractMethod()
	 * @generated
	 */
	int IEC_MODIFY_ABSTRACT_METHOD = 10;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ABSTRACT_METHOD__AFFECTED_ELEMENT = IEC_MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ABSTRACT_METHOD__CAUSING_ELEMENTS = IEC_MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ABSTRACT_METHOD__ID = IEC_MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ABSTRACT_METHOD__TOOLDERIVED = IEC_MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ABSTRACT_METHOD__USER_DECISION = IEC_MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IEC Modify Abstract Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ABSTRACT_METHOD_FEATURE_COUNT = IEC_MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Modify Abstract Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ABSTRACT_METHOD_OPERATION_COUNT = IEC_MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyPropertyImpl <em>IEC Modify Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyPropertyImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyProperty()
	 * @generated
	 */
	int IEC_MODIFY_PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_PROPERTY__AFFECTED_ELEMENT = IEC_MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_PROPERTY__CAUSING_ELEMENTS = IEC_MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_PROPERTY__ID = IEC_MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_PROPERTY__TOOLDERIVED = IEC_MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_PROPERTY__USER_DECISION = IEC_MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IEC Modify Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_PROPERTY_FEATURE_COUNT = IEC_MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Modify Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_PROPERTY_OPERATION_COUNT = IEC_MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyAbstractPropertyImpl <em>IEC Modify Abstract Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyAbstractPropertyImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyAbstractProperty()
	 * @generated
	 */
	int IEC_MODIFY_ABSTRACT_PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ABSTRACT_PROPERTY__AFFECTED_ELEMENT = IEC_MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ABSTRACT_PROPERTY__CAUSING_ELEMENTS = IEC_MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ABSTRACT_PROPERTY__ID = IEC_MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ABSTRACT_PROPERTY__TOOLDERIVED = IEC_MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ABSTRACT_PROPERTY__USER_DECISION = IEC_MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IEC Modify Abstract Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ABSTRACT_PROPERTY_FEATURE_COUNT = IEC_MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Modify Abstract Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ABSTRACT_PROPERTY_OPERATION_COUNT = IEC_MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyProgramImpl <em>IEC Modify Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyProgramImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyProgram()
	 * @generated
	 */
	int IEC_MODIFY_PROGRAM = 13;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_PROGRAM__AFFECTED_ELEMENT = IEC_MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_PROGRAM__CAUSING_ELEMENTS = IEC_MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_PROGRAM__ID = IEC_MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_PROGRAM__TOOLDERIVED = IEC_MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_PROGRAM__USER_DECISION = IEC_MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IEC Modify Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_PROGRAM_FEATURE_COUNT = IEC_MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Modify Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_PROGRAM_OPERATION_COUNT = IEC_MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyConfigurationImpl <em>IEC Modify Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyConfigurationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyConfiguration()
	 * @generated
	 */
	int IEC_MODIFY_CONFIGURATION = 14;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_CONFIGURATION__AFFECTED_ELEMENT = IEC_MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_CONFIGURATION__CAUSING_ELEMENTS = IEC_MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_CONFIGURATION__ID = IEC_MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_CONFIGURATION__TOOLDERIVED = IEC_MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_CONFIGURATION__USER_DECISION = IEC_MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IEC Modify Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_CONFIGURATION_FEATURE_COUNT = IEC_MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Modify Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_CONFIGURATION_OPERATION_COUNT = IEC_MODIFY_COMPONENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.AbstractKAMP4IECModificationRepository <em>Abstract KAMP4IEC Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract KAMP4IEC Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.AbstractKAMP4IECModificationRepository
	 * @generated
	 */
	EClass getAbstractKAMP4IECModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModificationRepository <em>IEC Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModificationRepository
	 * @generated
	 */
	EClass getIECModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECSeedModifications <em>IEC Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECSeedModifications
	 * @generated
	 */
	EClass getIECSeedModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECSeedModifications#getGlobalVariableModifications <em>Global Variable Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variable Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECSeedModifications#getGlobalVariableModifications()
	 * @see #getIECSeedModifications()
	 * @generated
	 */
	EReference getIECSeedModifications_GlobalVariableModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency <em>IEC Change Propagation Due To Data Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Change Propagation Due To Data Dependency</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency
	 * @generated
	 */
	EClass getIECChangePropagationDueToDataDependency();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getFunctionBlockModifications <em>Function Block Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Block Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getFunctionBlockModifications()
	 * @see #getIECChangePropagationDueToDataDependency()
	 * @generated
	 */
	EReference getIECChangePropagationDueToDataDependency_FunctionBlockModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getGlobalVariableModifications <em>Global Variable Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variable Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getGlobalVariableModifications()
	 * @see #getIECChangePropagationDueToDataDependency()
	 * @generated
	 */
	EReference getIECChangePropagationDueToDataDependency_GlobalVariableModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getFunctionModifications <em>Function Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getFunctionModifications()
	 * @see #getIECChangePropagationDueToDataDependency()
	 * @generated
	 */
	EReference getIECChangePropagationDueToDataDependency_FunctionModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getInterfaceModifications <em>Interface Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getInterfaceModifications()
	 * @see #getIECChangePropagationDueToDataDependency()
	 * @generated
	 */
	EReference getIECChangePropagationDueToDataDependency_InterfaceModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getAbstractMethodModifications <em>Abstract Method Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Method Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getAbstractMethodModifications()
	 * @see #getIECChangePropagationDueToDataDependency()
	 * @generated
	 */
	EReference getIECChangePropagationDueToDataDependency_AbstractMethodModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getAbstractPropertyModifications <em>Abstract Property Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Property Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getAbstractPropertyModifications()
	 * @see #getIECChangePropagationDueToDataDependency()
	 * @generated
	 */
	EReference getIECChangePropagationDueToDataDependency_AbstractPropertyModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getMethodModifications <em>Method Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getMethodModifications()
	 * @see #getIECChangePropagationDueToDataDependency()
	 * @generated
	 */
	EReference getIECChangePropagationDueToDataDependency_MethodModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getPropertyModifications <em>Property Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getPropertyModifications()
	 * @see #getIECChangePropagationDueToDataDependency()
	 * @generated
	 */
	EReference getIECChangePropagationDueToDataDependency_PropertyModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getProgramModifications <em>Program Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Program Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getProgramModifications()
	 * @see #getIECChangePropagationDueToDataDependency()
	 * @generated
	 */
	EReference getIECChangePropagationDueToDataDependency_ProgramModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getConfigurationModifications <em>Configuration Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECChangePropagationDueToDataDependency#getConfigurationModifications()
	 * @see #getIECChangePropagationDueToDataDependency()
	 * @generated
	 */
	EReference getIECChangePropagationDueToDataDependency_ConfigurationModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyComponent <em>IEC Modify Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Modify Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyComponent
	 * @generated
	 */
	EClass getIECModifyComponent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyGlobalVariable <em>IEC Modify Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Modify Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyGlobalVariable
	 * @generated
	 */
	EClass getIECModifyGlobalVariable();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyFunctionBlock <em>IEC Modify Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Modify Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyFunctionBlock
	 * @generated
	 */
	EClass getIECModifyFunctionBlock();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyFunction <em>IEC Modify Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Modify Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyFunction
	 * @generated
	 */
	EClass getIECModifyFunction();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyInterface <em>IEC Modify Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Modify Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyInterface
	 * @generated
	 */
	EClass getIECModifyInterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyMethod <em>IEC Modify Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Modify Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyMethod
	 * @generated
	 */
	EClass getIECModifyMethod();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyAbstractMethod <em>IEC Modify Abstract Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Modify Abstract Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyAbstractMethod
	 * @generated
	 */
	EClass getIECModifyAbstractMethod();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyProperty <em>IEC Modify Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Modify Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyProperty
	 * @generated
	 */
	EClass getIECModifyProperty();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyAbstractProperty <em>IEC Modify Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Modify Abstract Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyAbstractProperty
	 * @generated
	 */
	EClass getIECModifyAbstractProperty();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyProgram <em>IEC Modify Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Modify Program</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyProgram
	 * @generated
	 */
	EClass getIECModifyProgram();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyConfiguration <em>IEC Modify Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Modify Configuration</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyConfiguration
	 * @generated
	 */
	EClass getIECModifyConfiguration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IECModificationmarksFactory getIECModificationmarksFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.AbstractKAMP4IECModificationRepositoryImpl <em>Abstract KAMP4IEC Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.AbstractKAMP4IECModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getAbstractKAMP4IECModificationRepository()
		 * @generated
		 */
		EClass ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY = eINSTANCE.getAbstractKAMP4IECModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationRepositoryImpl <em>IEC Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModificationRepository()
		 * @generated
		 */
		EClass IEC_MODIFICATION_REPOSITORY = eINSTANCE.getIECModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECSeedModificationsImpl <em>IEC Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECSeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECSeedModifications()
		 * @generated
		 */
		EClass IEC_SEED_MODIFICATIONS = eINSTANCE.getIECSeedModifications();

		/**
		 * The meta object literal for the '<em><b>Global Variable Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS = eINSTANCE.getIECSeedModifications_GlobalVariableModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECChangePropagationDueToDataDependencyImpl <em>IEC Change Propagation Due To Data Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECChangePropagationDueToDataDependencyImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECChangePropagationDueToDataDependency()
		 * @generated
		 */
		EClass IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY = eINSTANCE.getIECChangePropagationDueToDataDependency();

		/**
		 * The meta object literal for the '<em><b>Function Block Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_BLOCK_MODIFICATIONS = eINSTANCE.getIECChangePropagationDueToDataDependency_FunctionBlockModifications();

		/**
		 * The meta object literal for the '<em><b>Global Variable Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__GLOBAL_VARIABLE_MODIFICATIONS = eINSTANCE.getIECChangePropagationDueToDataDependency_GlobalVariableModifications();

		/**
		 * The meta object literal for the '<em><b>Function Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_MODIFICATIONS = eINSTANCE.getIECChangePropagationDueToDataDependency_FunctionModifications();

		/**
		 * The meta object literal for the '<em><b>Interface Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__INTERFACE_MODIFICATIONS = eINSTANCE.getIECChangePropagationDueToDataDependency_InterfaceModifications();

		/**
		 * The meta object literal for the '<em><b>Abstract Method Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_METHOD_MODIFICATIONS = eINSTANCE.getIECChangePropagationDueToDataDependency_AbstractMethodModifications();

		/**
		 * The meta object literal for the '<em><b>Abstract Property Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__ABSTRACT_PROPERTY_MODIFICATIONS = eINSTANCE.getIECChangePropagationDueToDataDependency_AbstractPropertyModifications();

		/**
		 * The meta object literal for the '<em><b>Method Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__METHOD_MODIFICATIONS = eINSTANCE.getIECChangePropagationDueToDataDependency_MethodModifications();

		/**
		 * The meta object literal for the '<em><b>Property Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROPERTY_MODIFICATIONS = eINSTANCE.getIECChangePropagationDueToDataDependency_PropertyModifications();

		/**
		 * The meta object literal for the '<em><b>Program Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__PROGRAM_MODIFICATIONS = eINSTANCE.getIECChangePropagationDueToDataDependency_ProgramModifications();

		/**
		 * The meta object literal for the '<em><b>Configuration Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__CONFIGURATION_MODIFICATIONS = eINSTANCE.getIECChangePropagationDueToDataDependency_ConfigurationModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyComponentImpl <em>IEC Modify Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyComponentImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyComponent()
		 * @generated
		 */
		EClass IEC_MODIFY_COMPONENT = eINSTANCE.getIECModifyComponent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyGlobalVariableImpl <em>IEC Modify Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyGlobalVariableImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyGlobalVariable()
		 * @generated
		 */
		EClass IEC_MODIFY_GLOBAL_VARIABLE = eINSTANCE.getIECModifyGlobalVariable();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyFunctionBlockImpl <em>IEC Modify Function Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyFunctionBlockImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyFunctionBlock()
		 * @generated
		 */
		EClass IEC_MODIFY_FUNCTION_BLOCK = eINSTANCE.getIECModifyFunctionBlock();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyFunctionImpl <em>IEC Modify Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyFunctionImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyFunction()
		 * @generated
		 */
		EClass IEC_MODIFY_FUNCTION = eINSTANCE.getIECModifyFunction();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyInterfaceImpl <em>IEC Modify Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyInterfaceImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyInterface()
		 * @generated
		 */
		EClass IEC_MODIFY_INTERFACE = eINSTANCE.getIECModifyInterface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyMethodImpl <em>IEC Modify Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyMethodImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyMethod()
		 * @generated
		 */
		EClass IEC_MODIFY_METHOD = eINSTANCE.getIECModifyMethod();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyAbstractMethodImpl <em>IEC Modify Abstract Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyAbstractMethodImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyAbstractMethod()
		 * @generated
		 */
		EClass IEC_MODIFY_ABSTRACT_METHOD = eINSTANCE.getIECModifyAbstractMethod();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyPropertyImpl <em>IEC Modify Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyPropertyImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyProperty()
		 * @generated
		 */
		EClass IEC_MODIFY_PROPERTY = eINSTANCE.getIECModifyProperty();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyAbstractPropertyImpl <em>IEC Modify Abstract Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyAbstractPropertyImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyAbstractProperty()
		 * @generated
		 */
		EClass IEC_MODIFY_ABSTRACT_PROPERTY = eINSTANCE.getIECModifyAbstractProperty();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyProgramImpl <em>IEC Modify Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyProgramImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyProgram()
		 * @generated
		 */
		EClass IEC_MODIFY_PROGRAM = eINSTANCE.getIECModifyProgram();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyConfigurationImpl <em>IEC Modify Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyConfigurationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationmarksPackageImpl#getIECModifyConfiguration()
		 * @generated
		 */
		EClass IEC_MODIFY_CONFIGURATION = eINSTANCE.getIECModifyConfiguration();

	}

} //IECModificationmarksPackage
