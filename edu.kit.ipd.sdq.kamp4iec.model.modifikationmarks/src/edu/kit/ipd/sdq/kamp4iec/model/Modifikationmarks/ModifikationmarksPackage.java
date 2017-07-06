/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks;

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
 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.ModifikationmarksFactory
 * @model kind="package"
 * @generated
 */
public interface ModifikationmarksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Modifikationmarks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/Modifikationmarks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Modifikationmarks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModifikationmarksPackage eINSTANCE = edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifikationmarksPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.AbstractKAMP4IECModificationRepositoryImpl <em>Abstract KAMP4IEC Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.AbstractKAMP4IECModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifikationmarksPackageImpl#getAbstractKAMP4IECModificationRepository()
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
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.KAMP4IECModificationRepositoryImpl <em>KAMP4IEC Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.KAMP4IECModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifikationmarksPackageImpl#getKAMP4IECModificationRepository()
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
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.KAMP4IECSeedModificationsImpl <em>KAMP4IEC Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.KAMP4IECSeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifikationmarksPackageImpl#getKAMP4IECSeedModifications()
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
	int KAMP4IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functionblock Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP4IEC_SEED_MODIFICATIONS__FUNCTIONBLOCK_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>KAMP4IEC Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP4IEC_SEED_MODIFICATIONS_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>KAMP4IEC Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP4IEC_SEED_MODIFICATIONS_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ChangePropagationDueToDataDeployImpl <em>Change Propagation Due To Data Deploy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ChangePropagationDueToDataDeployImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifikationmarksPackageImpl#getChangePropagationDueToDataDeploy()
	 * @generated
	 */
	int CHANGE_PROPAGATION_DUE_TO_DATA_DEPLOY = 3;

	/**
	 * The number of structural features of the '<em>Change Propagation Due To Data Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_DATA_DEPLOY_FEATURE_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Change Propagation Due To Data Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_DATA_DEPLOY_OPERATION_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifyElementImpl <em>Modify Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifyElementImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifikationmarksPackageImpl#getModifyElement()
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
	int MODIFY_ELEMENT__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ELEMENT__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ELEMENT__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ELEMENT__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ELEMENT__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ELEMENT_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ELEMENT_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifyGlobalVariableImpl <em>Modify Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifyGlobalVariableImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifikationmarksPackageImpl#getModifyGlobalVariable()
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
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifyFunctionBlockImpl <em>Modify Function Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifyFunctionBlockImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifikationmarksPackageImpl#getModifyFunctionBlock()
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
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.AbstractKAMP4IECModificationRepository <em>Abstract KAMP4IEC Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract KAMP4IEC Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.AbstractKAMP4IECModificationRepository
	 * @generated
	 */
	EClass getAbstractKAMP4IECModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.KAMP4IECModificationRepository <em>KAMP4IEC Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KAMP4IEC Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.KAMP4IECModificationRepository
	 * @generated
	 */
	EClass getKAMP4IECModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.KAMP4IECSeedModifications <em>KAMP4IEC Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KAMP4IEC Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.KAMP4IECSeedModifications
	 * @generated
	 */
	EClass getKAMP4IECSeedModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.KAMP4IECSeedModifications#getGlobalVariableModifications <em>Global Variable Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variable Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.KAMP4IECSeedModifications#getGlobalVariableModifications()
	 * @see #getKAMP4IECSeedModifications()
	 * @generated
	 */
	EReference getKAMP4IECSeedModifications_GlobalVariableModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.KAMP4IECSeedModifications#getFunctionblockModifications <em>Functionblock Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functionblock Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.KAMP4IECSeedModifications#getFunctionblockModifications()
	 * @see #getKAMP4IECSeedModifications()
	 * @generated
	 */
	EReference getKAMP4IECSeedModifications_FunctionblockModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.ChangePropagationDueToDataDeploy <em>Change Propagation Due To Data Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Propagation Due To Data Deploy</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.ChangePropagationDueToDataDeploy
	 * @generated
	 */
	EClass getChangePropagationDueToDataDeploy();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.ModifyElement <em>Modify Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Element</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.ModifyElement
	 * @generated
	 */
	EClass getModifyElement();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.ModifyGlobalVariable <em>Modify Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.ModifyGlobalVariable
	 * @generated
	 */
	EClass getModifyGlobalVariable();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.ModifyFunctionBlock <em>Modify Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.ModifyFunctionBlock
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
	ModifikationmarksFactory getModifikationmarksFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.AbstractKAMP4IECModificationRepositoryImpl <em>Abstract KAMP4IEC Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.AbstractKAMP4IECModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifikationmarksPackageImpl#getAbstractKAMP4IECModificationRepository()
		 * @generated
		 */
		EClass ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY = eINSTANCE.getAbstractKAMP4IECModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.KAMP4IECModificationRepositoryImpl <em>KAMP4IEC Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.KAMP4IECModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifikationmarksPackageImpl#getKAMP4IECModificationRepository()
		 * @generated
		 */
		EClass KAMP4IEC_MODIFICATION_REPOSITORY = eINSTANCE.getKAMP4IECModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.KAMP4IECSeedModificationsImpl <em>KAMP4IEC Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.KAMP4IECSeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifikationmarksPackageImpl#getKAMP4IECSeedModifications()
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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ChangePropagationDueToDataDeployImpl <em>Change Propagation Due To Data Deploy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ChangePropagationDueToDataDeployImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifikationmarksPackageImpl#getChangePropagationDueToDataDeploy()
		 * @generated
		 */
		EClass CHANGE_PROPAGATION_DUE_TO_DATA_DEPLOY = eINSTANCE.getChangePropagationDueToDataDeploy();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifyElementImpl <em>Modify Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifyElementImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifikationmarksPackageImpl#getModifyElement()
		 * @generated
		 */
		EClass MODIFY_ELEMENT = eINSTANCE.getModifyElement();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifyGlobalVariableImpl <em>Modify Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifyGlobalVariableImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifikationmarksPackageImpl#getModifyGlobalVariable()
		 * @generated
		 */
		EClass MODIFY_GLOBAL_VARIABLE = eINSTANCE.getModifyGlobalVariable();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifyFunctionBlockImpl <em>Modify Function Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifyFunctionBlockImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.impl.ModifikationmarksPackageImpl#getModifyFunctionBlock()
		 * @generated
		 */
		EClass MODIFY_FUNCTION_BLOCK = eINSTANCE.getModifyFunctionBlock();

	}

} //ModifikationmarksPackage
