/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks;

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
 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModificationmarksFactory
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
	String eNAME = "Modificationmarks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/Modificationmarks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Modificationmarks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModificationmarksPackage eINSTANCE = edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModificationmarksPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.AbstractKAMP4IECModificationRepositoryImpl <em>Abstract KAMP4IEC Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.AbstractKAMP4IECModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModificationmarksPackageImpl#getAbstractKAMP4IECModificationRepository()
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
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.KAMP4IECModificationRepositoryImpl <em>KAMP4IEC Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.KAMP4IECModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModificationmarksPackageImpl#getKAMP4IECModificationRepository()
	 * @generated
	 */
	int KAMP4IEC_MODIFICATION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP4IEC_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP4IEC_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>KAMP4IEC Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP4IEC_MODIFICATION_REPOSITORY_FEATURE_COUNT = ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>KAMP4IEC Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP4IEC_MODIFICATION_REPOSITORY_OPERATION_COUNT = ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.KAMP4IECSeedModificationsImpl <em>KAMP4IEC Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.KAMP4IECSeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModificationmarksPackageImpl#getKAMP4IECSeedModifications()
	 * @generated
	 */
	int KAMP4IEC_SEED_MODIFICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Global Variable Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP4IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functionblock Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP4IEC_SEED_MODIFICATIONS__FUNCTIONBLOCK_MODIFICATIONS = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>KAMP4IEC Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP4IEC_SEED_MODIFICATIONS_FEATURE_COUNT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>KAMP4IEC Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP4IEC_SEED_MODIFICATIONS_OPERATION_COUNT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ChangePropagationDueToDataDependencyImpl <em>Change Propagation Due To Data Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ChangePropagationDueToDataDependencyImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModificationmarksPackageImpl#getChangePropagationDueToDataDependency()
	 * @generated
	 */
	int CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY = 3;

	/**
	 * The number of structural features of the '<em>Change Propagation Due To Data Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY_FEATURE_COUNT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Change Propagation Due To Data Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY_OPERATION_COUNT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.CHANGE_PROPAGATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModifyElementImpl <em>Modify Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModifyElementImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModificationmarksPackageImpl#getModifyElement()
	 * @generated
	 */
	int MODIFY_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ELEMENT__AFFECTED_ELEMENT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ELEMENT__CAUSING_ELEMENTS = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ELEMENT__ID = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ELEMENT__TOOLDERIVED = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ELEMENT__USER_DECISION = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ELEMENT_FEATURE_COUNT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ELEMENT_OPERATION_COUNT = edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.ABSTRACT_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModifyGlobalVariableImpl <em>Modify Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModifyGlobalVariableImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModificationmarksPackageImpl#getModifyGlobalVariable()
	 * @generated
	 */
	int MODIFY_GLOBAL_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_GLOBAL_VARIABLE__AFFECTED_ELEMENT = MODIFY_ELEMENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_GLOBAL_VARIABLE__CAUSING_ELEMENTS = MODIFY_ELEMENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_GLOBAL_VARIABLE__ID = MODIFY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_GLOBAL_VARIABLE__TOOLDERIVED = MODIFY_ELEMENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_GLOBAL_VARIABLE__USER_DECISION = MODIFY_ELEMENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_GLOBAL_VARIABLE_FEATURE_COUNT = MODIFY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_GLOBAL_VARIABLE_OPERATION_COUNT = MODIFY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModifyFunctionBlockImpl <em>Modify Function Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModifyFunctionBlockImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModificationmarksPackageImpl#getModifyFunctionBlock()
	 * @generated
	 */
	int MODIFY_FUNCTION_BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_FUNCTION_BLOCK__AFFECTED_ELEMENT = MODIFY_ELEMENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_FUNCTION_BLOCK__CAUSING_ELEMENTS = MODIFY_ELEMENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_FUNCTION_BLOCK__ID = MODIFY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_FUNCTION_BLOCK__TOOLDERIVED = MODIFY_ELEMENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_FUNCTION_BLOCK__USER_DECISION = MODIFY_ELEMENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_FUNCTION_BLOCK_FEATURE_COUNT = MODIFY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_FUNCTION_BLOCK_OPERATION_COUNT = MODIFY_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.AbstractKAMP4IECModificationRepository <em>Abstract KAMP4IEC Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract KAMP4IEC Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.AbstractKAMP4IECModificationRepository
	 * @generated
	 */
	EClass getAbstractKAMP4IECModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.KAMP4IECModificationRepository <em>KAMP4IEC Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KAMP4IEC Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.KAMP4IECModificationRepository
	 * @generated
	 */
	EClass getKAMP4IECModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.KAMP4IECSeedModifications <em>KAMP4IEC Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KAMP4IEC Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.KAMP4IECSeedModifications
	 * @generated
	 */
	EClass getKAMP4IECSeedModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.KAMP4IECSeedModifications#getGlobalVariableModifications <em>Global Variable Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variable Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.KAMP4IECSeedModifications#getGlobalVariableModifications()
	 * @see #getKAMP4IECSeedModifications()
	 * @generated
	 */
	EReference getKAMP4IECSeedModifications_GlobalVariableModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.KAMP4IECSeedModifications#getFunctionblockModifications <em>Functionblock Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functionblock Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.KAMP4IECSeedModifications#getFunctionblockModifications()
	 * @see #getKAMP4IECSeedModifications()
	 * @generated
	 */
	EReference getKAMP4IECSeedModifications_FunctionblockModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ChangePropagationDueToDataDependency <em>Change Propagation Due To Data Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Propagation Due To Data Dependency</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ChangePropagationDueToDataDependency
	 * @generated
	 */
	EClass getChangePropagationDueToDataDependency();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModifyElement <em>Modify Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Element</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModifyElement
	 * @generated
	 */
	EClass getModifyElement();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModifyGlobalVariable <em>Modify Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModifyGlobalVariable
	 * @generated
	 */
	EClass getModifyGlobalVariable();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModifyFunctionBlock <em>Modify Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModifyFunctionBlock
	 * @generated
	 */
	EClass getModifyFunctionBlock();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.AbstractKAMP4IECModificationRepositoryImpl <em>Abstract KAMP4IEC Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.AbstractKAMP4IECModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModificationmarksPackageImpl#getAbstractKAMP4IECModificationRepository()
		 * @generated
		 */
		EClass ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY = eINSTANCE.getAbstractKAMP4IECModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.KAMP4IECModificationRepositoryImpl <em>KAMP4IEC Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.KAMP4IECModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModificationmarksPackageImpl#getKAMP4IECModificationRepository()
		 * @generated
		 */
		EClass KAMP4IEC_MODIFICATION_REPOSITORY = eINSTANCE.getKAMP4IECModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.KAMP4IECSeedModificationsImpl <em>KAMP4IEC Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.KAMP4IECSeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModificationmarksPackageImpl#getKAMP4IECSeedModifications()
		 * @generated
		 */
		EClass KAMP4IEC_SEED_MODIFICATIONS = eINSTANCE.getKAMP4IECSeedModifications();

		/**
		 * The meta object literal for the '<em><b>Global Variable Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAMP4IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS = eINSTANCE.getKAMP4IECSeedModifications_GlobalVariableModifications();

		/**
		 * The meta object literal for the '<em><b>Functionblock Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAMP4IEC_SEED_MODIFICATIONS__FUNCTIONBLOCK_MODIFICATIONS = eINSTANCE.getKAMP4IECSeedModifications_FunctionblockModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ChangePropagationDueToDataDependencyImpl <em>Change Propagation Due To Data Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ChangePropagationDueToDataDependencyImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModificationmarksPackageImpl#getChangePropagationDueToDataDependency()
		 * @generated
		 */
		EClass CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY = eINSTANCE.getChangePropagationDueToDataDependency();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModifyElementImpl <em>Modify Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModifyElementImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModificationmarksPackageImpl#getModifyElement()
		 * @generated
		 */
		EClass MODIFY_ELEMENT = eINSTANCE.getModifyElement();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModifyGlobalVariableImpl <em>Modify Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModifyGlobalVariableImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModificationmarksPackageImpl#getModifyGlobalVariable()
		 * @generated
		 */
		EClass MODIFY_GLOBAL_VARIABLE = eINSTANCE.getModifyGlobalVariable();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModifyFunctionBlockImpl <em>Modify Function Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModifyFunctionBlockImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl.ModificationmarksPackageImpl#getModifyFunctionBlock()
		 * @generated
		 */
		EClass MODIFY_FUNCTION_BLOCK = eINSTANCE.getModifyFunctionBlock();

	}

} //ModificationmarksPackage
