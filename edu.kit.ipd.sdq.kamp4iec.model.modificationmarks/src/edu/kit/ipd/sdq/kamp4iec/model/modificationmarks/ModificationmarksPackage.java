/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.modificationmarks;

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
 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.ModificationmarksFactory
 * @model kind="package"
 * @generated
 */
public interface ModificationmarksPackage extends EPackage {
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
	ModificationmarksPackage eINSTANCE = edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.ModificationmarksPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.AbstractKAMP4IECModificationRepositoryImpl <em>Abstract KAMP4IEC Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.AbstractKAMP4IECModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.ModificationmarksPackageImpl#getAbstractKAMP4IECModificationRepository()
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
	int ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>Abstract KAMP4IEC Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY_FEATURE_COUNT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract KAMP4IEC Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY_OPERATION_COUNT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationRepositoryImpl <em>IEC Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.ModificationmarksPackageImpl#getIECModificationRepository()
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
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.ModificationmarksPackageImpl#getIECSeedModifications()
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
	int IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functionblock Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SEED_MODIFICATIONS__FUNCTIONBLOCK_MODIFICATIONS = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IEC Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SEED_MODIFICATIONS_FEATURE_COUNT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IEC Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SEED_MODIFICATIONS_OPERATION_COUNT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECChangePropagationDueToDataDependencyImpl <em>IEC Change Propagation Due To Data Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECChangePropagationDueToDataDependencyImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.ModificationmarksPackageImpl#getIECChangePropagationDueToDataDependency()
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
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_BLOCK_MODIFICATIONS = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Global Variable Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__GLOBAL_VARIABLE_MODIFICATIONS = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IEC Change Propagation Due To Data Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY_FEATURE_COUNT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IEC Change Propagation Due To Data Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY_OPERATION_COUNT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.CHANGE_PROPAGATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyElementImpl <em>IEC Modify Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyElementImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.ModificationmarksPackageImpl#getIECModifyElement()
	 * @generated
	 */
	int IEC_MODIFY_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ELEMENT__AFFECTED_ELEMENT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ELEMENT__CAUSING_ELEMENTS = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ELEMENT__ID = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ELEMENT__TOOLDERIVED = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ELEMENT__USER_DECISION = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IEC Modify Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ELEMENT_FEATURE_COUNT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Modify Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_ELEMENT_OPERATION_COUNT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyGlobalVariableImpl <em>IEC Modify Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyGlobalVariableImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.ModificationmarksPackageImpl#getIECModifyGlobalVariable()
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
	int IEC_MODIFY_GLOBAL_VARIABLE__AFFECTED_ELEMENT = IEC_MODIFY_ELEMENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_GLOBAL_VARIABLE__CAUSING_ELEMENTS = IEC_MODIFY_ELEMENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_GLOBAL_VARIABLE__ID = IEC_MODIFY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_GLOBAL_VARIABLE__TOOLDERIVED = IEC_MODIFY_ELEMENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_GLOBAL_VARIABLE__USER_DECISION = IEC_MODIFY_ELEMENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IEC Modify Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_GLOBAL_VARIABLE_FEATURE_COUNT = IEC_MODIFY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Modify Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_GLOBAL_VARIABLE_OPERATION_COUNT = IEC_MODIFY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyFunctionBlockImpl <em>IEC Modify Function Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyFunctionBlockImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.ModificationmarksPackageImpl#getIECModifyFunctionBlock()
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
	int IEC_MODIFY_FUNCTION_BLOCK__AFFECTED_ELEMENT = IEC_MODIFY_ELEMENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION_BLOCK__CAUSING_ELEMENTS = IEC_MODIFY_ELEMENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION_BLOCK__ID = IEC_MODIFY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION_BLOCK__TOOLDERIVED = IEC_MODIFY_ELEMENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION_BLOCK__USER_DECISION = IEC_MODIFY_ELEMENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IEC Modify Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION_BLOCK_FEATURE_COUNT = IEC_MODIFY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Modify Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_MODIFY_FUNCTION_BLOCK_OPERATION_COUNT = IEC_MODIFY_ELEMENT_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECSeedModifications#getFunctionblockModifications <em>Functionblock Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functionblock Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECSeedModifications#getFunctionblockModifications()
	 * @see #getIECSeedModifications()
	 * @generated
	 */
	EReference getIECSeedModifications_FunctionblockModifications();

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
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyElement <em>IEC Modify Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Modify Element</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModifyElement
	 * @generated
	 */
	EClass getIECModifyElement();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModificationmarksFactory getModificationmarksFactory();

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
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.ModificationmarksPackageImpl#getAbstractKAMP4IECModificationRepository()
		 * @generated
		 */
		EClass ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY = eINSTANCE.getAbstractKAMP4IECModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationRepositoryImpl <em>IEC Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.ModificationmarksPackageImpl#getIECModificationRepository()
		 * @generated
		 */
		EClass IEC_MODIFICATION_REPOSITORY = eINSTANCE.getIECModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECSeedModificationsImpl <em>IEC Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECSeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.ModificationmarksPackageImpl#getIECSeedModifications()
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
		 * The meta object literal for the '<em><b>Functionblock Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_SEED_MODIFICATIONS__FUNCTIONBLOCK_MODIFICATIONS = eINSTANCE.getIECSeedModifications_FunctionblockModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECChangePropagationDueToDataDependencyImpl <em>IEC Change Propagation Due To Data Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECChangePropagationDueToDataDependencyImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.ModificationmarksPackageImpl#getIECChangePropagationDueToDataDependency()
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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyElementImpl <em>IEC Modify Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyElementImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.ModificationmarksPackageImpl#getIECModifyElement()
		 * @generated
		 */
		EClass IEC_MODIFY_ELEMENT = eINSTANCE.getIECModifyElement();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyGlobalVariableImpl <em>IEC Modify Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyGlobalVariableImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.ModificationmarksPackageImpl#getIECModifyGlobalVariable()
		 * @generated
		 */
		EClass IEC_MODIFY_GLOBAL_VARIABLE = eINSTANCE.getIECModifyGlobalVariable();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyFunctionBlockImpl <em>IEC Modify Function Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.IECModifyFunctionBlockImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.impl.ModificationmarksPackageImpl#getIECModifyFunctionBlock()
		 * @generated
		 */
		EClass IEC_MODIFY_FUNCTION_BLOCK = eINSTANCE.getIECModifyFunctionBlock();

	}

} //ModificationmarksPackage
