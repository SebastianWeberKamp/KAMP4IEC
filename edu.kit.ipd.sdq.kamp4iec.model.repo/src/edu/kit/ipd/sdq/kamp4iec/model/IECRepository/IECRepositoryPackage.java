/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface IECRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IECRepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/IECRepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IECReporitory";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IECRepositoryPackage eINSTANCE = edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl <em>Function Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getFunctionBlock()
	 * @generated
	 */
	int FUNCTION_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Has Iec Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__HAS_IEC_METHOD = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Iec Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__HAS_IEC_PROPERTY = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__IMPLEMENTS = IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.GlobalVariableImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__TYPE = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl <em>IEC Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECInterface()
	 * @generated
	 */
	int IEC_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Defines Iec Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__DEFINES_IEC_METHOD = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Defines Iec Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__DEFINES_IEC_PROPERTY = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IEC Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IEC Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 4;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ProgramImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 5;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 6;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImpl <em>IEC Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECProperty()
	 * @generated
	 */
	int IEC_PROPERTY = 7;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractPropertyImpl <em>IEC Abstract Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractPropertyImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECAbstractProperty()
	 * @generated
	 */
	int IEC_ABSTRACT_PROPERTY = 8;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractMethodImpl <em>IEC Abstract Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractMethodImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECAbstractMethod()
	 * @generated
	 */
	int IEC_ABSTRACT_METHOD = 9;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl <em>IEC Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECMethod()
	 * @generated
	 */
	int IEC_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__IMPLEMENTS = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IEC Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IEC Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = IDENTIFIER__NAME;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = IDENTIFIER__NAME;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains Program</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Contains Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Contains Function Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_FUNCTION_BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Contains Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Contains Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = 5;

	/**
	 * The feature id for the '<em><b>Contains Enum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_ENUM = 6;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY__IMPLEMENTS = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IEC Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IEC Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_PROPERTY__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_PROPERTY__NAME = IDENTIFIER__NAME;

	/**
	 * The number of structural features of the '<em>IEC Abstract Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_PROPERTY_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Abstract Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_PROPERTY_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_METHOD__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_METHOD__NAME = IDENTIFIER__NAME;

	/**
	 * The number of structural features of the '<em>IEC Abstract Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_METHOD_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Abstract Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_METHOD_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.EnumImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ImplementsInterfaceImpl <em>Implements Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ImplementsInterfaceImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getImplementsInterface()
	 * @generated
	 */
	int IMPLEMENTS_INTERFACE = 12;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_INTERFACE__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Implements Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_INTERFACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Implements Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ConfigurationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = IDENTIFIER__NAME;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.DerivedTypeImpl <em>Derived Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.DerivedTypeImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getDerivedType()
	 * @generated
	 */
	int DERIVED_TYPE = 14;

	/**
	 * The number of structural features of the '<em>Derived Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Derived Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType <em>Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock <em>Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock
	 * @generated
	 */
	EClass getFunctionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasIecMethod <em>Has Iec Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Iec Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasIecMethod()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_HasIecMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasIecProperty <em>Has Iec Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Iec Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasIecProperty()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_HasIecProperty();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getImplements()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_Implements();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable#getType()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_Type();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface <em>IEC Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface
	 * @generated
	 */
	EClass getIECInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getDefinesIecMethod <em>Defines Iec Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defines Iec Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getDefinesIecMethod()
	 * @see #getIECInterface()
	 * @generated
	 */
	EReference getIECInterface_DefinesIecMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getDefinesIecProperty <em>Defines Iec Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defines Iec Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getDefinesIecProperty()
	 * @see #getIECInterface()
	 * @generated
	 */
	EReference getIECInterface_DefinesIecProperty();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsProgram <em>Contains Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Program</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsProgram()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsInterface <em>Contains Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsInterface()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsFunctionBlock <em>Contains Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsFunctionBlock()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsFunctionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsFunction <em>Contains Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsFunction()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsVariable <em>Contains Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsVariable()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getName()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsEnum <em>Contains Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsEnum()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsEnum();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty <em>IEC Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty
	 * @generated
	 */
	EClass getIECProperty();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty#getImplements()
	 * @see #getIECProperty()
	 * @generated
	 */
	EReference getIECProperty_Implements();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty <em>IEC Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Abstract Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty
	 * @generated
	 */
	EClass getIECAbstractProperty();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod <em>IEC Abstract Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Abstract Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod
	 * @generated
	 */
	EClass getIECAbstractMethod();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod <em>IEC Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod
	 * @generated
	 */
	EClass getIECMethod();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getImplements()
	 * @see #getIECMethod()
	 * @generated
	 */
	EReference getIECMethod_Implements();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Enum#getName()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier#getId()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier#getName()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface <em>Implements Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implements Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface
	 * @generated
	 */
	EClass getImplementsInterface();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.ImplementsInterface#getInterface()
	 * @see #getImplementsInterface()
	 * @generated
	 */
	EReference getImplementsInterface_Interface();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.DerivedType <em>Derived Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.DerivedType
	 * @generated
	 */
	EClass getDerivedType();

	/**
	 * Returns the meta object for enum '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType
	 * @generated
	 */
	EEnum getVariableType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IECRepositoryFactory getIECRepositoryFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl <em>Function Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getFunctionBlock()
		 * @generated
		 */
		EClass FUNCTION_BLOCK = eINSTANCE.getFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Has Iec Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__HAS_IEC_METHOD = eINSTANCE.getFunctionBlock_HasIecMethod();

		/**
		 * The meta object literal for the '<em><b>Has Iec Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__HAS_IEC_PROPERTY = eINSTANCE.getFunctionBlock_HasIecProperty();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__IMPLEMENTS = eINSTANCE.getFunctionBlock_Implements();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.GlobalVariableImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getGlobalVariable()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__TYPE = eINSTANCE.getGlobalVariable_Type();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl <em>IEC Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECInterface()
		 * @generated
		 */
		EClass IEC_INTERFACE = eINSTANCE.getIECInterface();

		/**
		 * The meta object literal for the '<em><b>Defines Iec Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_INTERFACE__DEFINES_IEC_METHOD = eINSTANCE.getIECInterface_DefinesIecMethod();

		/**
		 * The meta object literal for the '<em><b>Defines Iec Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_INTERFACE__DEFINES_IEC_PROPERTY = eINSTANCE.getIECInterface_DefinesIecProperty();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ProgramImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Contains Program</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_PROGRAM = eINSTANCE.getRepository_ContainsProgram();

		/**
		 * The meta object literal for the '<em><b>Contains Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_INTERFACE = eINSTANCE.getRepository_ContainsInterface();

		/**
		 * The meta object literal for the '<em><b>Contains Function Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_FUNCTION_BLOCK = eINSTANCE.getRepository_ContainsFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Contains Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_FUNCTION = eINSTANCE.getRepository_ContainsFunction();

		/**
		 * The meta object literal for the '<em><b>Contains Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_VARIABLE = eINSTANCE.getRepository_ContainsVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__NAME = eINSTANCE.getRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Contains Enum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_ENUM = eINSTANCE.getRepository_ContainsEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImpl <em>IEC Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECProperty()
		 * @generated
		 */
		EClass IEC_PROPERTY = eINSTANCE.getIECProperty();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PROPERTY__IMPLEMENTS = eINSTANCE.getIECProperty_Implements();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractPropertyImpl <em>IEC Abstract Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractPropertyImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECAbstractProperty()
		 * @generated
		 */
		EClass IEC_ABSTRACT_PROPERTY = eINSTANCE.getIECAbstractProperty();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractMethodImpl <em>IEC Abstract Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractMethodImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECAbstractMethod()
		 * @generated
		 */
		EClass IEC_ABSTRACT_METHOD = eINSTANCE.getIECAbstractMethod();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl <em>IEC Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECMethod()
		 * @generated
		 */
		EClass IEC_METHOD = eINSTANCE.getIECMethod();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD__IMPLEMENTS = eINSTANCE.getIECMethod_Implements();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.EnumImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__NAME = eINSTANCE.getEnum_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__ID = eINSTANCE.getIdentifier_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__NAME = eINSTANCE.getIdentifier_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ImplementsInterfaceImpl <em>Implements Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ImplementsInterfaceImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getImplementsInterface()
		 * @generated
		 */
		EClass IMPLEMENTS_INTERFACE = eINSTANCE.getImplementsInterface();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTS_INTERFACE__INTERFACE = eINSTANCE.getImplementsInterface_Interface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.ConfigurationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.DerivedTypeImpl <em>Derived Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.DerivedTypeImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getDerivedType()
		 * @generated
		 */
		EClass DERIVED_TYPE = eINSTANCE.getDerivedType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType <em>Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.VariableType
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getVariableType()
		 * @generated
		 */
		EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

	}

} //IECRepositoryPackage
