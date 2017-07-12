/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

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
 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface FieldOfActivityAnnotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FieldOfActivityAnnotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/FieldOfActivityAnnotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FieldOfActivityAnnotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FieldOfActivityAnnotationsPackage eINSTANCE = edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Development Artefact Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Build Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Test Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Release Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Deployment Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Staff Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Technology Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Design Pattern Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION = 7;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DevelopmentArtefactSpecificationImpl <em>Development Artefact Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DevelopmentArtefactSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getDevelopmentArtefactSpecification()
	 * @generated
	 */
	int DEVELOPMENT_ARTEFACT_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Source Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES = 1;

	/**
	 * The feature id for the '<em><b>Source File Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS = 2;

	/**
	 * The feature id for the '<em><b>Metadata Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES = 3;

	/**
	 * The feature id for the '<em><b>Metadata File Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS = 4;

	/**
	 * The number of structural features of the '<em>Development Artefact Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ARTEFACT_SPECIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Development Artefact Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ARTEFACT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FileImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 32;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILENAME = 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TECHNOLOGY = 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.SourceFileImpl <em>Source File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.SourceFileImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getSourceFile()
	 * @generated
	 */
	int SOURCE_FILE = 2;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__FILENAME = FILE__FILENAME;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__TECHNOLOGY = FILE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__PARENT = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__COMPONENT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FileAggregationImpl <em>File Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FileAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getFileAggregation()
	 * @generated
	 */
	int FILE_AGGREGATION = 33;

	/**
	 * The feature id for the '<em><b>Number Of Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_AGGREGATION__NUMBER_OF_FILES = 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_AGGREGATION__TECHNOLOGY = 1;

	/**
	 * The number of structural features of the '<em>File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_AGGREGATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_AGGREGATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.SourceFileAggregationImpl <em>Source File Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.SourceFileAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getSourceFileAggregation()
	 * @generated
	 */
	int SOURCE_FILE_AGGREGATION = 3;

	/**
	 * The feature id for the '<em><b>Number Of Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_AGGREGATION__NUMBER_OF_FILES = FILE_AGGREGATION__NUMBER_OF_FILES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_AGGREGATION__TECHNOLOGY = FILE_AGGREGATION__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_AGGREGATION__PARENT = FILE_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_AGGREGATION__COMPONENT = FILE_AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_AGGREGATION_FEATURE_COUNT = FILE_AGGREGATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Source File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_AGGREGATION_OPERATION_COUNT = FILE_AGGREGATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.MetadataFileImpl <em>Metadata File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.MetadataFileImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getMetadataFile()
	 * @generated
	 */
	int METADATA_FILE = 4;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FILE__FILENAME = FILE__FILENAME;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FILE__TECHNOLOGY = FILE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FILE__PARENT = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FILE__COMPONENT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Metadata File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Metadata File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FILE_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.MetadataFileAggregationImpl <em>Metadata File Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.MetadataFileAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getMetadataFileAggregation()
	 * @generated
	 */
	int METADATA_FILE_AGGREGATION = 5;

	/**
	 * The feature id for the '<em><b>Number Of Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FILE_AGGREGATION__NUMBER_OF_FILES = FILE_AGGREGATION__NUMBER_OF_FILES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FILE_AGGREGATION__TECHNOLOGY = FILE_AGGREGATION__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FILE_AGGREGATION__PARENT = FILE_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FILE_AGGREGATION__COMPONENT = FILE_AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Metadata File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FILE_AGGREGATION_FEATURE_COUNT = FILE_AGGREGATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Metadata File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FILE_AGGREGATION_OPERATION_COUNT = FILE_AGGREGATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.BuildSpecificationImpl <em>Build Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.BuildSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getBuildSpecification()
	 * @generated
	 */
	int BUILD_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Build Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_SPECIFICATION__BUILD_CONFIGURATIONS = 1;

	/**
	 * The feature id for the '<em><b>Third Party Component Or Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES = 2;

	/**
	 * The number of structural features of the '<em>Build Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Build Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.BuildConfigurationImpl <em>Build Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.BuildConfigurationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getBuildConfiguration()
	 * @generated
	 */
	int BUILD_CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATION__FILENAME = FILE__FILENAME;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATION__TECHNOLOGY = FILE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATION__PARENT = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATION__COMPONENT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Build Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATION_FEATURE_COUNT = FILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Build Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATION_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ThirdPartyComponentOrLibraryImpl <em>Third Party Component Or Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ThirdPartyComponentOrLibraryImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getThirdPartyComponentOrLibrary()
	 * @generated
	 */
	int THIRD_PARTY_COMPONENT_OR_LIBRARY = 8;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_COMPONENT_OR_LIBRARY__FILENAME = FILE__FILENAME;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_COMPONENT_OR_LIBRARY__TECHNOLOGY = FILE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_COMPONENT_OR_LIBRARY__PARENT = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_COMPONENT_OR_LIBRARY__COMPONENT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Third Party Component Or Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_COMPONENT_OR_LIBRARY_FEATURE_COUNT = FILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Third Party Component Or Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_COMPONENT_OR_LIBRARY_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestSpecificationImpl <em>Test Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTestSpecification()
	 * @generated
	 */
	int TEST_SPECIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Unit Test Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__UNIT_TEST_CASES = 1;

	/**
	 * The feature id for the '<em><b>Acceptance Test Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES = 2;

	/**
	 * The feature id for the '<em><b>Integration Test Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__INTEGRATION_TEST_CASES = 3;

	/**
	 * The feature id for the '<em><b>Unit Test Case Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS = 4;

	/**
	 * The feature id for the '<em><b>Acceptance Test Case Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS = 5;

	/**
	 * The feature id for the '<em><b>Integration Test Case Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS = 6;

	/**
	 * The number of structural features of the '<em>Test Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Test Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ReleaseSpecificationImpl <em>Release Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ReleaseSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getReleaseSpecification()
	 * @generated
	 */
	int RELEASE_SPECIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Release Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_SPECIFICATION__PARENT = 1;

	/**
	 * The number of structural features of the '<em>Release Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Release Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ReleaseConfigurationImpl <em>Release Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ReleaseConfigurationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getReleaseConfiguration()
	 * @generated
	 */
	int RELEASE_CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_CONFIGURATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_CONFIGURATION__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Pathname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_CONFIGURATION__PATHNAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_CONFIGURATION__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Release Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Release Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DeploymentSpecificationImpl <em>Deployment Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DeploymentSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getDeploymentSpecification()
	 * @generated
	 */
	int DEPLOYMENT_SPECIFICATION = 12;

	/**
	 * The feature id for the '<em><b>Runtime Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Runtime Instance Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Deployment Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Deployment Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RuntimeInstanceImpl <em>Runtime Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RuntimeInstanceImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getRuntimeInstance()
	 * @generated
	 */
	int RUNTIME_INSTANCE = 13;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE__COMPONENTS = 3;

	/**
	 * The number of structural features of the '<em>Runtime Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Runtime Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RuntimeInstanceAggregationImpl <em>Runtime Instance Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RuntimeInstanceAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getRuntimeInstanceAggregation()
	 * @generated
	 */
	int RUNTIME_INSTANCE_AGGREGATION = 14;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE_AGGREGATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Number Of Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE_AGGREGATION__NUMBER_OF_INSTANCES = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE_AGGREGATION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE_AGGREGATION__COMPONENTS = 3;

	/**
	 * The number of structural features of the '<em>Runtime Instance Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE_AGGREGATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Runtime Instance Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INSTANCE_AGGREGATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestCaseImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 34;

	/**
	 * The feature id for the '<em><b>Name Of Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__NAME_OF_TEST = 0;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.UnitTestCaseImpl <em>Unit Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.UnitTestCaseImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getUnitTestCase()
	 * @generated
	 */
	int UNIT_TEST_CASE = 15;

	/**
	 * The feature id for the '<em><b>Name Of Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_CASE__NAME_OF_TEST = TEST_CASE__NAME_OF_TEST;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_CASE__PARENT = TEST_CASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_CASE__PROVIDEDROLE = TEST_CASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_CASE_FEATURE_COUNT = TEST_CASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unit Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_CASE_OPERATION_COUNT = TEST_CASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.AcceptanceTestCaseImpl <em>Acceptance Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.AcceptanceTestCaseImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getAcceptanceTestCase()
	 * @generated
	 */
	int ACCEPTANCE_TEST_CASE = 16;

	/**
	 * The feature id for the '<em><b>Name Of Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_CASE__NAME_OF_TEST = TEST_CASE__NAME_OF_TEST;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_CASE__PARENT = TEST_CASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_CASE__PROVIDEDROLE = TEST_CASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Acceptance Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_CASE_FEATURE_COUNT = TEST_CASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Acceptance Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_CASE_OPERATION_COUNT = TEST_CASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.IntegrationTestCaseImpl <em>Integration Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.IntegrationTestCaseImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getIntegrationTestCase()
	 * @generated
	 */
	int INTEGRATION_TEST_CASE = 17;

	/**
	 * The feature id for the '<em><b>Name Of Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TEST_CASE__NAME_OF_TEST = TEST_CASE__NAME_OF_TEST;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TEST_CASE__PARENT = TEST_CASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TEST_CASE__PROVIDEDROLE = TEST_CASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TEST_CASE__ASSEMBLY_CONNECTOR = TEST_CASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integration Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TEST_CASE_FEATURE_COUNT = TEST_CASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Integration Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TEST_CASE_OPERATION_COUNT = TEST_CASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestCaseAggregationImpl <em>Test Case Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestCaseAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTestCaseAggregation()
	 * @generated
	 */
	int TEST_CASE_AGGREGATION = 35;

	/**
	 * The feature id for the '<em><b>Number Of Testcases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES = 0;

	/**
	 * The feature id for the '<em><b>Name Of Test Suite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE = 1;

	/**
	 * The number of structural features of the '<em>Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_AGGREGATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_AGGREGATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.UnitTestCaseAggregationImpl <em>Unit Test Case Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.UnitTestCaseAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getUnitTestCaseAggregation()
	 * @generated
	 */
	int UNIT_TEST_CASE_AGGREGATION = 18;

	/**
	 * The feature id for the '<em><b>Number Of Testcases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES = TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES;

	/**
	 * The feature id for the '<em><b>Name Of Test Suite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE = TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_CASE_AGGREGATION__PARENT = TEST_CASE_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_CASE_AGGREGATION__PROVIDEDROLE = TEST_CASE_AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_CASE_AGGREGATION_FEATURE_COUNT = TEST_CASE_AGGREGATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unit Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_CASE_AGGREGATION_OPERATION_COUNT = TEST_CASE_AGGREGATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.AcceptanceTestCaseAggregationImpl <em>Acceptance Test Case Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.AcceptanceTestCaseAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getAcceptanceTestCaseAggregation()
	 * @generated
	 */
	int ACCEPTANCE_TEST_CASE_AGGREGATION = 19;

	/**
	 * The feature id for the '<em><b>Number Of Testcases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES = TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES;

	/**
	 * The feature id for the '<em><b>Name Of Test Suite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE = TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_CASE_AGGREGATION__PARENT = TEST_CASE_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_CASE_AGGREGATION__PROVIDEDROLE = TEST_CASE_AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Acceptance Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_CASE_AGGREGATION_FEATURE_COUNT = TEST_CASE_AGGREGATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Acceptance Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_CASE_AGGREGATION_OPERATION_COUNT = TEST_CASE_AGGREGATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.IntegrationTestCaseAggregationImpl <em>Integration Test Case Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.IntegrationTestCaseAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getIntegrationTestCaseAggregation()
	 * @generated
	 */
	int INTEGRATION_TEST_CASE_AGGREGATION = 20;

	/**
	 * The feature id for the '<em><b>Number Of Testcases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES = TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES;

	/**
	 * The feature id for the '<em><b>Name Of Test Suite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE = TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TEST_CASE_AGGREGATION__PARENT = TEST_CASE_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providedrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TEST_CASE_AGGREGATION__PROVIDEDROLE = TEST_CASE_AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TEST_CASE_AGGREGATION__ASSEMBLY_CONNECTOR = TEST_CASE_AGGREGATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integration Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TEST_CASE_AGGREGATION_FEATURE_COUNT = TEST_CASE_AGGREGATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Integration Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TEST_CASE_AGGREGATION_OPERATION_COUNT = TEST_CASE_AGGREGATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.StaffSpecificationImpl <em>Staff Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.StaffSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getStaffSpecification()
	 * @generated
	 */
	int STAFF_SPECIFICATION = 21;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Person List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SPECIFICATION__PERSON_LIST = 1;

	/**
	 * The feature id for the '<em><b>Role List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SPECIFICATION__ROLE_LIST = 2;

	/**
	 * The number of structural features of the '<em>Staff Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Staff Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.PersonListImpl <em>Person List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.PersonListImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getPersonList()
	 * @generated
	 */
	int PERSON_LIST = 22;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_LIST__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_LIST__PERSONS = 1;

	/**
	 * The number of structural features of the '<em>Person List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.PersonImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 23;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RoleImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 24;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PERSON = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__COMPONENTS = 3;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RoleListImpl <em>Role List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RoleListImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getRoleList()
	 * @generated
	 */
	int ROLE_LIST = 25;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LIST__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LIST__ROLES = 1;

	/**
	 * The number of structural features of the '<em>Role List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DeveloperImpl <em>Developer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DeveloperImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getDeveloper()
	 * @generated
	 */
	int DEVELOPER = 26;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__PARENT = ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__PERSON = ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__DESCRIPTION = ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__COMPONENTS = ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.BuildConfiguratorImpl <em>Build Configurator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.BuildConfiguratorImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getBuildConfigurator()
	 * @generated
	 */
	int BUILD_CONFIGURATOR = 27;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATOR__PARENT = ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATOR__PERSON = ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATOR__DESCRIPTION = ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATOR__COMPONENTS = ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Build Configurator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATOR_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Build Configurator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONFIGURATOR_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestDeveloperImpl <em>Test Developer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestDeveloperImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTestDeveloper()
	 * @generated
	 */
	int TEST_DEVELOPER = 28;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DEVELOPER__PARENT = ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DEVELOPER__PERSON = ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DEVELOPER__DESCRIPTION = ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DEVELOPER__COMPONENTS = ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Test Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DEVELOPER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Test Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DEVELOPER_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TesterImpl <em>Tester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TesterImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTester()
	 * @generated
	 */
	int TESTER = 29;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTER__PARENT = ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTER__PERSON = ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTER__DESCRIPTION = ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTER__COMPONENTS = ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Tester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTER_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ReleaseConfiguratorImpl <em>Release Configurator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ReleaseConfiguratorImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getReleaseConfigurator()
	 * @generated
	 */
	int RELEASE_CONFIGURATOR = 30;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_CONFIGURATOR__PARENT = ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_CONFIGURATOR__PERSON = ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_CONFIGURATOR__DESCRIPTION = ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_CONFIGURATOR__COMPONENTS = ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Release Configurator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_CONFIGURATOR_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Release Configurator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_CONFIGURATOR_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DeployerImpl <em>Deployer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DeployerImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getDeployer()
	 * @generated
	 */
	int DEPLOYER = 31;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYER__PARENT = ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYER__PERSON = ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYER__DESCRIPTION = ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYER__COMPONENTS = ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Deployer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deployer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYER_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DesignPatternSpecificationImpl <em>Design Pattern Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DesignPatternSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getDesignPatternSpecification()
	 * @generated
	 */
	int DESIGN_PATTERN_SPECIFICATION = 36;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Design Pattern Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN_SPECIFICATION__DESIGN_PATTERN_ROLES = 1;

	/**
	 * The number of structural features of the '<em>Design Pattern Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Design Pattern Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DesignPatternRoleImpl <em>Design Pattern Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DesignPatternRoleImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getDesignPatternRole()
	 * @generated
	 */
	int DESIGN_PATTERN_ROLE = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN_ROLE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN_ROLE__PROVIDED_ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN_ROLE__COMPONENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Design Pattern Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN_ROLE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Design Pattern Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PATTERN_ROLE_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TechnologySpecificationImpl <em>Technology Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TechnologySpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTechnologySpecification()
	 * @generated
	 */
	int TECHNOLOGY_SPECIFICATION = 38;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Technological Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES = 1;

	/**
	 * The number of structural features of the '<em>Technology Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Technology Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TechnologicalCorrespondenceImpl <em>Technological Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TechnologicalCorrespondenceImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTechnologicalCorrespondence()
	 * @generated
	 */
	int TECHNOLOGICAL_CORRESPONDENCE = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGICAL_CORRESPONDENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Technological Correspondence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGICAL_CORRESPONDENCE__COMPONENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Technological Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGICAL_CORRESPONDENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Technological Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGICAL_CORRESPONDENCE_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologicalCorrespondenceTypes <em>Technological Correspondence Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologicalCorrespondenceTypes
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTechnologicalCorrespondenceTypes()
	 * @generated
	 */
	int TECHNOLOGICAL_CORRESPONDENCE_TYPES = 40;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository
	 * @generated
	 */
	EClass getFieldOfActivityAnnotationsRepository();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getDevelopmentArtefactSpecification <em>Development Artefact Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Development Artefact Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getDevelopmentArtefactSpecification()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_DevelopmentArtefactSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getBuildSpecification <em>Build Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Build Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getBuildSpecification()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_BuildSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTestSpecification <em>Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTestSpecification()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_TestSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getReleaseSpecification <em>Release Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Release Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getReleaseSpecification()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_ReleaseSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getDeploymentSpecification <em>Deployment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getDeploymentSpecification()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_DeploymentSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getStaffSpecification <em>Staff Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staff Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getStaffSpecification()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_StaffSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTechnologySpecification <em>Technology Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technology Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getTechnologySpecification()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_TechnologySpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getDesignPatternSpecification <em>Design Pattern Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design Pattern Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository#getDesignPatternSpecification()
	 * @see #getFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationsRepository_DesignPatternSpecification();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification <em>Development Artefact Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Artefact Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification
	 * @generated
	 */
	EClass getDevelopmentArtefactSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification#getParent()
	 * @see #getDevelopmentArtefactSpecification()
	 * @generated
	 */
	EReference getDevelopmentArtefactSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification#getSourceFiles <em>Source Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Files</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification#getSourceFiles()
	 * @see #getDevelopmentArtefactSpecification()
	 * @generated
	 */
	EReference getDevelopmentArtefactSpecification_SourceFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification#getSourceFileAggregations <em>Source File Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source File Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification#getSourceFileAggregations()
	 * @see #getDevelopmentArtefactSpecification()
	 * @generated
	 */
	EReference getDevelopmentArtefactSpecification_SourceFileAggregations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification#getMetadataFiles <em>Metadata Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata Files</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification#getMetadataFiles()
	 * @see #getDevelopmentArtefactSpecification()
	 * @generated
	 */
	EReference getDevelopmentArtefactSpecification_MetadataFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification#getMetadataFileAggregations <em>Metadata File Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata File Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification#getMetadataFileAggregations()
	 * @see #getDevelopmentArtefactSpecification()
	 * @generated
	 */
	EReference getDevelopmentArtefactSpecification_MetadataFileAggregations();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source File</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFile
	 * @generated
	 */
	EClass getSourceFile();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFile#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFile#getParent()
	 * @see #getSourceFile()
	 * @generated
	 */
	EReference getSourceFile_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFile#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFile#getComponent()
	 * @see #getSourceFile()
	 * @generated
	 */
	EReference getSourceFile_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFileAggregation <em>Source File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source File Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFileAggregation
	 * @generated
	 */
	EClass getSourceFileAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFileAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFileAggregation#getParent()
	 * @see #getSourceFileAggregation()
	 * @generated
	 */
	EReference getSourceFileAggregation_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFileAggregation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFileAggregation#getComponent()
	 * @see #getSourceFileAggregation()
	 * @generated
	 */
	EReference getSourceFileAggregation_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFile <em>Metadata File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata File</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFile
	 * @generated
	 */
	EClass getMetadataFile();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFile#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFile#getParent()
	 * @see #getMetadataFile()
	 * @generated
	 */
	EReference getMetadataFile_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFile#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFile#getComponent()
	 * @see #getMetadataFile()
	 * @generated
	 */
	EReference getMetadataFile_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFileAggregation <em>Metadata File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata File Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFileAggregation
	 * @generated
	 */
	EClass getMetadataFileAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFileAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFileAggregation#getParent()
	 * @see #getMetadataFileAggregation()
	 * @generated
	 */
	EReference getMetadataFileAggregation_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFileAggregation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFileAggregation#getComponent()
	 * @see #getMetadataFileAggregation()
	 * @generated
	 */
	EReference getMetadataFileAggregation_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildSpecification <em>Build Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildSpecification
	 * @generated
	 */
	EClass getBuildSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildSpecification#getParent()
	 * @see #getBuildSpecification()
	 * @generated
	 */
	EReference getBuildSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildSpecification#getBuildConfigurations <em>Build Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Build Configurations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildSpecification#getBuildConfigurations()
	 * @see #getBuildSpecification()
	 * @generated
	 */
	EReference getBuildSpecification_BuildConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildSpecification#getThirdPartyComponentOrLibraries <em>Third Party Component Or Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Third Party Component Or Libraries</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildSpecification#getThirdPartyComponentOrLibraries()
	 * @see #getBuildSpecification()
	 * @generated
	 */
	EReference getBuildSpecification_ThirdPartyComponentOrLibraries();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildConfiguration <em>Build Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Configuration</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildConfiguration
	 * @generated
	 */
	EClass getBuildConfiguration();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildConfiguration#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildConfiguration#getParent()
	 * @see #getBuildConfiguration()
	 * @generated
	 */
	EReference getBuildConfiguration_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildConfiguration#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildConfiguration#getComponent()
	 * @see #getBuildConfiguration()
	 * @generated
	 */
	EReference getBuildConfiguration_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ThirdPartyComponentOrLibrary <em>Third Party Component Or Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Third Party Component Or Library</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ThirdPartyComponentOrLibrary
	 * @generated
	 */
	EClass getThirdPartyComponentOrLibrary();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ThirdPartyComponentOrLibrary#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ThirdPartyComponentOrLibrary#getParent()
	 * @see #getThirdPartyComponentOrLibrary()
	 * @generated
	 */
	EReference getThirdPartyComponentOrLibrary_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ThirdPartyComponentOrLibrary#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ThirdPartyComponentOrLibrary#getComponent()
	 * @see #getThirdPartyComponentOrLibrary()
	 * @generated
	 */
	EReference getThirdPartyComponentOrLibrary_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification <em>Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification
	 * @generated
	 */
	EClass getTestSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getParent()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EReference getTestSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getUnitTestCases <em>Unit Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Test Cases</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getUnitTestCases()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EReference getTestSpecification_UnitTestCases();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getAcceptanceTestCases <em>Acceptance Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acceptance Test Cases</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getAcceptanceTestCases()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EReference getTestSpecification_AcceptanceTestCases();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getIntegrationTestCases <em>Integration Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integration Test Cases</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getIntegrationTestCases()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EReference getTestSpecification_IntegrationTestCases();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getUnitTestCaseAggregations <em>Unit Test Case Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Test Case Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getUnitTestCaseAggregations()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EReference getTestSpecification_UnitTestCaseAggregations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getAcceptanceTestCaseAggregations <em>Acceptance Test Case Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acceptance Test Case Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getAcceptanceTestCaseAggregations()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EReference getTestSpecification_AcceptanceTestCaseAggregations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getIntegrationTestCaseAggregations <em>Integration Test Case Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integration Test Case Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification#getIntegrationTestCaseAggregations()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EReference getTestSpecification_IntegrationTestCaseAggregations();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseSpecification <em>Release Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseSpecification
	 * @generated
	 */
	EClass getReleaseSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseSpecification#getReleaseConfigurations <em>Release Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Release Configurations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseSpecification#getReleaseConfigurations()
	 * @see #getReleaseSpecification()
	 * @generated
	 */
	EReference getReleaseSpecification_ReleaseConfigurations();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseSpecification#getParent()
	 * @see #getReleaseSpecification()
	 * @generated
	 */
	EReference getReleaseSpecification_Parent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfiguration <em>Release Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Configuration</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfiguration
	 * @generated
	 */
	EClass getReleaseConfiguration();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfiguration#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfiguration#getParent()
	 * @see #getReleaseConfiguration()
	 * @generated
	 */
	EReference getReleaseConfiguration_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfiguration#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfiguration#getComponents()
	 * @see #getReleaseConfiguration()
	 * @generated
	 */
	EReference getReleaseConfiguration_Components();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfiguration#getPathname <em>Pathname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pathname</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfiguration#getPathname()
	 * @see #getReleaseConfiguration()
	 * @generated
	 */
	EAttribute getReleaseConfiguration_Pathname();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfiguration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfiguration#getDescription()
	 * @see #getReleaseConfiguration()
	 * @generated
	 */
	EAttribute getReleaseConfiguration_Description();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DeploymentSpecification <em>Deployment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DeploymentSpecification
	 * @generated
	 */
	EClass getDeploymentSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DeploymentSpecification#getRuntimeInstances <em>Runtime Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runtime Instances</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DeploymentSpecification#getRuntimeInstances()
	 * @see #getDeploymentSpecification()
	 * @generated
	 */
	EReference getDeploymentSpecification_RuntimeInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DeploymentSpecification#getRuntimeInstanceAggregations <em>Runtime Instance Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runtime Instance Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DeploymentSpecification#getRuntimeInstanceAggregations()
	 * @see #getDeploymentSpecification()
	 * @generated
	 */
	EReference getDeploymentSpecification_RuntimeInstanceAggregations();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DeploymentSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DeploymentSpecification#getParent()
	 * @see #getDeploymentSpecification()
	 * @generated
	 */
	EReference getDeploymentSpecification_Parent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstance <em>Runtime Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Instance</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstance
	 * @generated
	 */
	EClass getRuntimeInstance();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstance#getParent()
	 * @see #getRuntimeInstance()
	 * @generated
	 */
	EReference getRuntimeInstance_Parent();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstance#getName()
	 * @see #getRuntimeInstance()
	 * @generated
	 */
	EAttribute getRuntimeInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstance#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstance#getDescription()
	 * @see #getRuntimeInstance()
	 * @generated
	 */
	EAttribute getRuntimeInstance_Description();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstance#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstance#getComponents()
	 * @see #getRuntimeInstance()
	 * @generated
	 */
	EReference getRuntimeInstance_Components();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstanceAggregation <em>Runtime Instance Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Instance Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstanceAggregation
	 * @generated
	 */
	EClass getRuntimeInstanceAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstanceAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstanceAggregation#getParent()
	 * @see #getRuntimeInstanceAggregation()
	 * @generated
	 */
	EReference getRuntimeInstanceAggregation_Parent();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstanceAggregation#getNumberOfInstances <em>Number Of Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Instances</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstanceAggregation#getNumberOfInstances()
	 * @see #getRuntimeInstanceAggregation()
	 * @generated
	 */
	EAttribute getRuntimeInstanceAggregation_NumberOfInstances();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstanceAggregation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstanceAggregation#getDescription()
	 * @see #getRuntimeInstanceAggregation()
	 * @generated
	 */
	EAttribute getRuntimeInstanceAggregation_Description();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstanceAggregation#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstanceAggregation#getComponents()
	 * @see #getRuntimeInstanceAggregation()
	 * @generated
	 */
	EReference getRuntimeInstanceAggregation_Components();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCase <em>Unit Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Test Case</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCase
	 * @generated
	 */
	EClass getUnitTestCase();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCase#getParent()
	 * @see #getUnitTestCase()
	 * @generated
	 */
	EReference getUnitTestCase_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCase#getProvidedrole <em>Providedrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providedrole</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCase#getProvidedrole()
	 * @see #getUnitTestCase()
	 * @generated
	 */
	EReference getUnitTestCase_Providedrole();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCase <em>Acceptance Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceptance Test Case</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCase
	 * @generated
	 */
	EClass getAcceptanceTestCase();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCase#getParent()
	 * @see #getAcceptanceTestCase()
	 * @generated
	 */
	EReference getAcceptanceTestCase_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCase#getProvidedrole <em>Providedrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providedrole</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCase#getProvidedrole()
	 * @see #getAcceptanceTestCase()
	 * @generated
	 */
	EReference getAcceptanceTestCase_Providedrole();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCase <em>Integration Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration Test Case</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCase
	 * @generated
	 */
	EClass getIntegrationTestCase();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCase#getParent()
	 * @see #getIntegrationTestCase()
	 * @generated
	 */
	EReference getIntegrationTestCase_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCase#getProvidedrole <em>Providedrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providedrole</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCase#getProvidedrole()
	 * @see #getIntegrationTestCase()
	 * @generated
	 */
	EReference getIntegrationTestCase_Providedrole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCase#getAssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Connector</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCase#getAssemblyConnector()
	 * @see #getIntegrationTestCase()
	 * @generated
	 */
	EReference getIntegrationTestCase_AssemblyConnector();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCaseAggregation <em>Unit Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Test Case Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCaseAggregation
	 * @generated
	 */
	EClass getUnitTestCaseAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCaseAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCaseAggregation#getParent()
	 * @see #getUnitTestCaseAggregation()
	 * @generated
	 */
	EReference getUnitTestCaseAggregation_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCaseAggregation#getProvidedrole <em>Providedrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providedrole</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCaseAggregation#getProvidedrole()
	 * @see #getUnitTestCaseAggregation()
	 * @generated
	 */
	EReference getUnitTestCaseAggregation_Providedrole();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCaseAggregation <em>Acceptance Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceptance Test Case Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCaseAggregation
	 * @generated
	 */
	EClass getAcceptanceTestCaseAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCaseAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCaseAggregation#getParent()
	 * @see #getAcceptanceTestCaseAggregation()
	 * @generated
	 */
	EReference getAcceptanceTestCaseAggregation_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCaseAggregation#getProvidedrole <em>Providedrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providedrole</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCaseAggregation#getProvidedrole()
	 * @see #getAcceptanceTestCaseAggregation()
	 * @generated
	 */
	EReference getAcceptanceTestCaseAggregation_Providedrole();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCaseAggregation <em>Integration Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration Test Case Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCaseAggregation
	 * @generated
	 */
	EClass getIntegrationTestCaseAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCaseAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCaseAggregation#getParent()
	 * @see #getIntegrationTestCaseAggregation()
	 * @generated
	 */
	EReference getIntegrationTestCaseAggregation_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCaseAggregation#getProvidedrole <em>Providedrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providedrole</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCaseAggregation#getProvidedrole()
	 * @see #getIntegrationTestCaseAggregation()
	 * @generated
	 */
	EReference getIntegrationTestCaseAggregation_Providedrole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCaseAggregation#getAssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Connector</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCaseAggregation#getAssemblyConnector()
	 * @see #getIntegrationTestCaseAggregation()
	 * @generated
	 */
	EReference getIntegrationTestCaseAggregation_AssemblyConnector();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.StaffSpecification <em>Staff Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.StaffSpecification
	 * @generated
	 */
	EClass getStaffSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.StaffSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.StaffSpecification#getParent()
	 * @see #getStaffSpecification()
	 * @generated
	 */
	EReference getStaffSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.StaffSpecification#getPersonList <em>Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.StaffSpecification#getPersonList()
	 * @see #getStaffSpecification()
	 * @generated
	 */
	EReference getStaffSpecification_PersonList();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.StaffSpecification#getRoleList <em>Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.StaffSpecification#getRoleList()
	 * @see #getStaffSpecification()
	 * @generated
	 */
	EReference getStaffSpecification_RoleList();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.PersonList <em>Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.PersonList
	 * @generated
	 */
	EClass getPersonList();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.PersonList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.PersonList#getParent()
	 * @see #getPersonList()
	 * @generated
	 */
	EReference getPersonList_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.PersonList#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.PersonList#getPersons()
	 * @see #getPersonList()
	 * @generated
	 */
	EReference getPersonList_Persons();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Person#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Person#getParent()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Person#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Person#getRoles()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Roles();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Role#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Role#getParent()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Role#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Role#getPerson()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Person();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Role#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Role#getDescription()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Description();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Role#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Role#getComponents()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Components();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RoleList <em>Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RoleList
	 * @generated
	 */
	EClass getRoleList();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RoleList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RoleList#getParent()
	 * @see #getRoleList()
	 * @generated
	 */
	EReference getRoleList_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RoleList#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RoleList#getRoles()
	 * @see #getRoleList()
	 * @generated
	 */
	EReference getRoleList_Roles();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Developer <em>Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Developer</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Developer
	 * @generated
	 */
	EClass getDeveloper();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildConfigurator <em>Build Configurator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Configurator</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildConfigurator
	 * @generated
	 */
	EClass getBuildConfigurator();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestDeveloper <em>Test Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Developer</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestDeveloper
	 * @generated
	 */
	EClass getTestDeveloper();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Tester <em>Tester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tester</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Tester
	 * @generated
	 */
	EClass getTester();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfigurator <em>Release Configurator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Configurator</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfigurator
	 * @generated
	 */
	EClass getReleaseConfigurator();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Deployer <em>Deployer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployer</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Deployer
	 * @generated
	 */
	EClass getDeployer();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.File#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.File#getFilename()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Filename();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.File#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.File#getTechnology()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Technology();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FileAggregation <em>File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FileAggregation
	 * @generated
	 */
	EClass getFileAggregation();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FileAggregation#getNumberOfFiles <em>Number Of Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Files</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FileAggregation#getNumberOfFiles()
	 * @see #getFileAggregation()
	 * @generated
	 */
	EAttribute getFileAggregation_NumberOfFiles();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FileAggregation#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FileAggregation#getTechnology()
	 * @see #getFileAggregation()
	 * @generated
	 */
	EAttribute getFileAggregation_Technology();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestCase#getNameOfTest <em>Name Of Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Of Test</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestCase#getNameOfTest()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_NameOfTest();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestCaseAggregation <em>Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestCaseAggregation
	 * @generated
	 */
	EClass getTestCaseAggregation();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestCaseAggregation#getNumberOfTestcases <em>Number Of Testcases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Testcases</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestCaseAggregation#getNumberOfTestcases()
	 * @see #getTestCaseAggregation()
	 * @generated
	 */
	EAttribute getTestCaseAggregation_NumberOfTestcases();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestCaseAggregation#getNameOfTestSuite <em>Name Of Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Of Test Suite</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestCaseAggregation#getNameOfTestSuite()
	 * @see #getTestCaseAggregation()
	 * @generated
	 */
	EAttribute getTestCaseAggregation_NameOfTestSuite();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternSpecification <em>Design Pattern Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Pattern Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternSpecification
	 * @generated
	 */
	EClass getDesignPatternSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternSpecification#getParent()
	 * @see #getDesignPatternSpecification()
	 * @generated
	 */
	EReference getDesignPatternSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternSpecification#getDesignPatternRoles <em>Design Pattern Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Design Pattern Roles</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternSpecification#getDesignPatternRoles()
	 * @see #getDesignPatternSpecification()
	 * @generated
	 */
	EReference getDesignPatternSpecification_DesignPatternRoles();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternRole <em>Design Pattern Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Pattern Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternRole
	 * @generated
	 */
	EClass getDesignPatternRole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternRole#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternRole#getProvidedRole()
	 * @see #getDesignPatternRole()
	 * @generated
	 */
	EReference getDesignPatternRole_ProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternRole#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternRole#getComponent()
	 * @see #getDesignPatternRole()
	 * @generated
	 */
	EReference getDesignPatternRole_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologySpecification <em>Technology Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologySpecification
	 * @generated
	 */
	EClass getTechnologySpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologySpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologySpecification#getParent()
	 * @see #getTechnologySpecification()
	 * @generated
	 */
	EReference getTechnologySpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologySpecification#getTechnologicalCorrespondences <em>Technological Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technological Correspondences</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologySpecification#getTechnologicalCorrespondences()
	 * @see #getTechnologySpecification()
	 * @generated
	 */
	EReference getTechnologySpecification_TechnologicalCorrespondences();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologicalCorrespondence <em>Technological Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technological Correspondence</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologicalCorrespondence
	 * @generated
	 */
	EClass getTechnologicalCorrespondence();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologicalCorrespondence#getTechnologicalCorrespondenceType <em>Technological Correspondence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technological Correspondence Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologicalCorrespondence#getTechnologicalCorrespondenceType()
	 * @see #getTechnologicalCorrespondence()
	 * @generated
	 */
	EAttribute getTechnologicalCorrespondence_TechnologicalCorrespondenceType();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologicalCorrespondence#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologicalCorrespondence#getComponent()
	 * @see #getTechnologicalCorrespondence()
	 * @generated
	 */
	EReference getTechnologicalCorrespondence_Component();

	/**
	 * Returns the meta object for enum '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologicalCorrespondenceTypes <em>Technological Correspondence Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Technological Correspondence Types</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologicalCorrespondenceTypes
	 * @generated
	 */
	EEnum getTechnologicalCorrespondenceTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FieldOfActivityAnnotationsFactory getFieldOfActivityAnnotationsFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getFieldOfActivityAnnotationsRepository()
		 * @generated
		 */
		EClass FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY = eINSTANCE.getFieldOfActivityAnnotationsRepository();

		/**
		 * The meta object literal for the '<em><b>Development Artefact Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationsRepository_DevelopmentArtefactSpecification();

		/**
		 * The meta object literal for the '<em><b>Build Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationsRepository_BuildSpecification();

		/**
		 * The meta object literal for the '<em><b>Test Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationsRepository_TestSpecification();

		/**
		 * The meta object literal for the '<em><b>Release Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationsRepository_ReleaseSpecification();

		/**
		 * The meta object literal for the '<em><b>Deployment Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationsRepository_DeploymentSpecification();

		/**
		 * The meta object literal for the '<em><b>Staff Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationsRepository_StaffSpecification();

		/**
		 * The meta object literal for the '<em><b>Technology Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationsRepository_TechnologySpecification();

		/**
		 * The meta object literal for the '<em><b>Design Pattern Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationsRepository_DesignPatternSpecification();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DevelopmentArtefactSpecificationImpl <em>Development Artefact Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DevelopmentArtefactSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getDevelopmentArtefactSpecification()
		 * @generated
		 */
		EClass DEVELOPMENT_ARTEFACT_SPECIFICATION = eINSTANCE.getDevelopmentArtefactSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT = eINSTANCE.getDevelopmentArtefactSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Source Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES = eINSTANCE.getDevelopmentArtefactSpecification_SourceFiles();

		/**
		 * The meta object literal for the '<em><b>Source File Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS = eINSTANCE.getDevelopmentArtefactSpecification_SourceFileAggregations();

		/**
		 * The meta object literal for the '<em><b>Metadata Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES = eINSTANCE.getDevelopmentArtefactSpecification_MetadataFiles();

		/**
		 * The meta object literal for the '<em><b>Metadata File Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS = eINSTANCE.getDevelopmentArtefactSpecification_MetadataFileAggregations();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.SourceFileImpl <em>Source File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.SourceFileImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getSourceFile()
		 * @generated
		 */
		EClass SOURCE_FILE = eINSTANCE.getSourceFile();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_FILE__PARENT = eINSTANCE.getSourceFile_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_FILE__COMPONENT = eINSTANCE.getSourceFile_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.SourceFileAggregationImpl <em>Source File Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.SourceFileAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getSourceFileAggregation()
		 * @generated
		 */
		EClass SOURCE_FILE_AGGREGATION = eINSTANCE.getSourceFileAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_FILE_AGGREGATION__PARENT = eINSTANCE.getSourceFileAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_FILE_AGGREGATION__COMPONENT = eINSTANCE.getSourceFileAggregation_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.MetadataFileImpl <em>Metadata File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.MetadataFileImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getMetadataFile()
		 * @generated
		 */
		EClass METADATA_FILE = eINSTANCE.getMetadataFile();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_FILE__PARENT = eINSTANCE.getMetadataFile_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_FILE__COMPONENT = eINSTANCE.getMetadataFile_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.MetadataFileAggregationImpl <em>Metadata File Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.MetadataFileAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getMetadataFileAggregation()
		 * @generated
		 */
		EClass METADATA_FILE_AGGREGATION = eINSTANCE.getMetadataFileAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_FILE_AGGREGATION__PARENT = eINSTANCE.getMetadataFileAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_FILE_AGGREGATION__COMPONENT = eINSTANCE.getMetadataFileAggregation_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.BuildSpecificationImpl <em>Build Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.BuildSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getBuildSpecification()
		 * @generated
		 */
		EClass BUILD_SPECIFICATION = eINSTANCE.getBuildSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_SPECIFICATION__PARENT = eINSTANCE.getBuildSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Build Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_SPECIFICATION__BUILD_CONFIGURATIONS = eINSTANCE.getBuildSpecification_BuildConfigurations();

		/**
		 * The meta object literal for the '<em><b>Third Party Component Or Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES = eINSTANCE.getBuildSpecification_ThirdPartyComponentOrLibraries();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.BuildConfigurationImpl <em>Build Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.BuildConfigurationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getBuildConfiguration()
		 * @generated
		 */
		EClass BUILD_CONFIGURATION = eINSTANCE.getBuildConfiguration();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_CONFIGURATION__PARENT = eINSTANCE.getBuildConfiguration_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_CONFIGURATION__COMPONENT = eINSTANCE.getBuildConfiguration_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ThirdPartyComponentOrLibraryImpl <em>Third Party Component Or Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ThirdPartyComponentOrLibraryImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getThirdPartyComponentOrLibrary()
		 * @generated
		 */
		EClass THIRD_PARTY_COMPONENT_OR_LIBRARY = eINSTANCE.getThirdPartyComponentOrLibrary();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THIRD_PARTY_COMPONENT_OR_LIBRARY__PARENT = eINSTANCE.getThirdPartyComponentOrLibrary_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THIRD_PARTY_COMPONENT_OR_LIBRARY__COMPONENT = eINSTANCE.getThirdPartyComponentOrLibrary_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestSpecificationImpl <em>Test Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTestSpecification()
		 * @generated
		 */
		EClass TEST_SPECIFICATION = eINSTANCE.getTestSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SPECIFICATION__PARENT = eINSTANCE.getTestSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Unit Test Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SPECIFICATION__UNIT_TEST_CASES = eINSTANCE.getTestSpecification_UnitTestCases();

		/**
		 * The meta object literal for the '<em><b>Acceptance Test Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES = eINSTANCE.getTestSpecification_AcceptanceTestCases();

		/**
		 * The meta object literal for the '<em><b>Integration Test Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SPECIFICATION__INTEGRATION_TEST_CASES = eINSTANCE.getTestSpecification_IntegrationTestCases();

		/**
		 * The meta object literal for the '<em><b>Unit Test Case Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS = eINSTANCE.getTestSpecification_UnitTestCaseAggregations();

		/**
		 * The meta object literal for the '<em><b>Acceptance Test Case Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS = eINSTANCE.getTestSpecification_AcceptanceTestCaseAggregations();

		/**
		 * The meta object literal for the '<em><b>Integration Test Case Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS = eINSTANCE.getTestSpecification_IntegrationTestCaseAggregations();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ReleaseSpecificationImpl <em>Release Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ReleaseSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getReleaseSpecification()
		 * @generated
		 */
		EClass RELEASE_SPECIFICATION = eINSTANCE.getReleaseSpecification();

		/**
		 * The meta object literal for the '<em><b>Release Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS = eINSTANCE.getReleaseSpecification_ReleaseConfigurations();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_SPECIFICATION__PARENT = eINSTANCE.getReleaseSpecification_Parent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ReleaseConfigurationImpl <em>Release Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ReleaseConfigurationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getReleaseConfiguration()
		 * @generated
		 */
		EClass RELEASE_CONFIGURATION = eINSTANCE.getReleaseConfiguration();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_CONFIGURATION__PARENT = eINSTANCE.getReleaseConfiguration_Parent();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_CONFIGURATION__COMPONENTS = eINSTANCE.getReleaseConfiguration_Components();

		/**
		 * The meta object literal for the '<em><b>Pathname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_CONFIGURATION__PATHNAME = eINSTANCE.getReleaseConfiguration_Pathname();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_CONFIGURATION__DESCRIPTION = eINSTANCE.getReleaseConfiguration_Description();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DeploymentSpecificationImpl <em>Deployment Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DeploymentSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getDeploymentSpecification()
		 * @generated
		 */
		EClass DEPLOYMENT_SPECIFICATION = eINSTANCE.getDeploymentSpecification();

		/**
		 * The meta object literal for the '<em><b>Runtime Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES = eINSTANCE.getDeploymentSpecification_RuntimeInstances();

		/**
		 * The meta object literal for the '<em><b>Runtime Instance Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS = eINSTANCE.getDeploymentSpecification_RuntimeInstanceAggregations();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_SPECIFICATION__PARENT = eINSTANCE.getDeploymentSpecification_Parent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RuntimeInstanceImpl <em>Runtime Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RuntimeInstanceImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getRuntimeInstance()
		 * @generated
		 */
		EClass RUNTIME_INSTANCE = eINSTANCE.getRuntimeInstance();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_INSTANCE__PARENT = eINSTANCE.getRuntimeInstance_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_INSTANCE__NAME = eINSTANCE.getRuntimeInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_INSTANCE__DESCRIPTION = eINSTANCE.getRuntimeInstance_Description();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_INSTANCE__COMPONENTS = eINSTANCE.getRuntimeInstance_Components();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RuntimeInstanceAggregationImpl <em>Runtime Instance Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RuntimeInstanceAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getRuntimeInstanceAggregation()
		 * @generated
		 */
		EClass RUNTIME_INSTANCE_AGGREGATION = eINSTANCE.getRuntimeInstanceAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_INSTANCE_AGGREGATION__PARENT = eINSTANCE.getRuntimeInstanceAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Number Of Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_INSTANCE_AGGREGATION__NUMBER_OF_INSTANCES = eINSTANCE.getRuntimeInstanceAggregation_NumberOfInstances();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_INSTANCE_AGGREGATION__DESCRIPTION = eINSTANCE.getRuntimeInstanceAggregation_Description();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_INSTANCE_AGGREGATION__COMPONENTS = eINSTANCE.getRuntimeInstanceAggregation_Components();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.UnitTestCaseImpl <em>Unit Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.UnitTestCaseImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getUnitTestCase()
		 * @generated
		 */
		EClass UNIT_TEST_CASE = eINSTANCE.getUnitTestCase();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_TEST_CASE__PARENT = eINSTANCE.getUnitTestCase_Parent();

		/**
		 * The meta object literal for the '<em><b>Providedrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_TEST_CASE__PROVIDEDROLE = eINSTANCE.getUnitTestCase_Providedrole();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.AcceptanceTestCaseImpl <em>Acceptance Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.AcceptanceTestCaseImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getAcceptanceTestCase()
		 * @generated
		 */
		EClass ACCEPTANCE_TEST_CASE = eINSTANCE.getAcceptanceTestCase();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPTANCE_TEST_CASE__PARENT = eINSTANCE.getAcceptanceTestCase_Parent();

		/**
		 * The meta object literal for the '<em><b>Providedrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPTANCE_TEST_CASE__PROVIDEDROLE = eINSTANCE.getAcceptanceTestCase_Providedrole();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.IntegrationTestCaseImpl <em>Integration Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.IntegrationTestCaseImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getIntegrationTestCase()
		 * @generated
		 */
		EClass INTEGRATION_TEST_CASE = eINSTANCE.getIntegrationTestCase();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_TEST_CASE__PARENT = eINSTANCE.getIntegrationTestCase_Parent();

		/**
		 * The meta object literal for the '<em><b>Providedrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_TEST_CASE__PROVIDEDROLE = eINSTANCE.getIntegrationTestCase_Providedrole();

		/**
		 * The meta object literal for the '<em><b>Assembly Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_TEST_CASE__ASSEMBLY_CONNECTOR = eINSTANCE.getIntegrationTestCase_AssemblyConnector();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.UnitTestCaseAggregationImpl <em>Unit Test Case Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.UnitTestCaseAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getUnitTestCaseAggregation()
		 * @generated
		 */
		EClass UNIT_TEST_CASE_AGGREGATION = eINSTANCE.getUnitTestCaseAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_TEST_CASE_AGGREGATION__PARENT = eINSTANCE.getUnitTestCaseAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Providedrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_TEST_CASE_AGGREGATION__PROVIDEDROLE = eINSTANCE.getUnitTestCaseAggregation_Providedrole();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.AcceptanceTestCaseAggregationImpl <em>Acceptance Test Case Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.AcceptanceTestCaseAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getAcceptanceTestCaseAggregation()
		 * @generated
		 */
		EClass ACCEPTANCE_TEST_CASE_AGGREGATION = eINSTANCE.getAcceptanceTestCaseAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPTANCE_TEST_CASE_AGGREGATION__PARENT = eINSTANCE.getAcceptanceTestCaseAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Providedrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPTANCE_TEST_CASE_AGGREGATION__PROVIDEDROLE = eINSTANCE.getAcceptanceTestCaseAggregation_Providedrole();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.IntegrationTestCaseAggregationImpl <em>Integration Test Case Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.IntegrationTestCaseAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getIntegrationTestCaseAggregation()
		 * @generated
		 */
		EClass INTEGRATION_TEST_CASE_AGGREGATION = eINSTANCE.getIntegrationTestCaseAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_TEST_CASE_AGGREGATION__PARENT = eINSTANCE.getIntegrationTestCaseAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Providedrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_TEST_CASE_AGGREGATION__PROVIDEDROLE = eINSTANCE.getIntegrationTestCaseAggregation_Providedrole();

		/**
		 * The meta object literal for the '<em><b>Assembly Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_TEST_CASE_AGGREGATION__ASSEMBLY_CONNECTOR = eINSTANCE.getIntegrationTestCaseAggregation_AssemblyConnector();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.StaffSpecificationImpl <em>Staff Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.StaffSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getStaffSpecification()
		 * @generated
		 */
		EClass STAFF_SPECIFICATION = eINSTANCE.getStaffSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_SPECIFICATION__PARENT = eINSTANCE.getStaffSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Person List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_SPECIFICATION__PERSON_LIST = eINSTANCE.getStaffSpecification_PersonList();

		/**
		 * The meta object literal for the '<em><b>Role List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_SPECIFICATION__ROLE_LIST = eINSTANCE.getStaffSpecification_RoleList();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.PersonListImpl <em>Person List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.PersonListImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getPersonList()
		 * @generated
		 */
		EClass PERSON_LIST = eINSTANCE.getPersonList();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_LIST__PARENT = eINSTANCE.getPersonList_Parent();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_LIST__PERSONS = eINSTANCE.getPersonList_Persons();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.PersonImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PARENT = eINSTANCE.getPerson_Parent();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ROLES = eINSTANCE.getPerson_Roles();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RoleImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PARENT = eINSTANCE.getRole_Parent();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PERSON = eINSTANCE.getRole_Person();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__DESCRIPTION = eINSTANCE.getRole_Description();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__COMPONENTS = eINSTANCE.getRole_Components();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RoleListImpl <em>Role List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.RoleListImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getRoleList()
		 * @generated
		 */
		EClass ROLE_LIST = eINSTANCE.getRoleList();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_LIST__PARENT = eINSTANCE.getRoleList_Parent();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_LIST__ROLES = eINSTANCE.getRoleList_Roles();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DeveloperImpl <em>Developer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DeveloperImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getDeveloper()
		 * @generated
		 */
		EClass DEVELOPER = eINSTANCE.getDeveloper();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.BuildConfiguratorImpl <em>Build Configurator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.BuildConfiguratorImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getBuildConfigurator()
		 * @generated
		 */
		EClass BUILD_CONFIGURATOR = eINSTANCE.getBuildConfigurator();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestDeveloperImpl <em>Test Developer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestDeveloperImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTestDeveloper()
		 * @generated
		 */
		EClass TEST_DEVELOPER = eINSTANCE.getTestDeveloper();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TesterImpl <em>Tester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TesterImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTester()
		 * @generated
		 */
		EClass TESTER = eINSTANCE.getTester();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ReleaseConfiguratorImpl <em>Release Configurator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.ReleaseConfiguratorImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getReleaseConfigurator()
		 * @generated
		 */
		EClass RELEASE_CONFIGURATOR = eINSTANCE.getReleaseConfigurator();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DeployerImpl <em>Deployer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DeployerImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getDeployer()
		 * @generated
		 */
		EClass DEPLOYER = eINSTANCE.getDeployer();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FileImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILENAME = eINSTANCE.getFile_Filename();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__TECHNOLOGY = eINSTANCE.getFile_Technology();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FileAggregationImpl <em>File Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FileAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getFileAggregation()
		 * @generated
		 */
		EClass FILE_AGGREGATION = eINSTANCE.getFileAggregation();

		/**
		 * The meta object literal for the '<em><b>Number Of Files</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_AGGREGATION__NUMBER_OF_FILES = eINSTANCE.getFileAggregation_NumberOfFiles();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_AGGREGATION__TECHNOLOGY = eINSTANCE.getFileAggregation_Technology();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestCaseImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Name Of Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__NAME_OF_TEST = eINSTANCE.getTestCase_NameOfTest();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestCaseAggregationImpl <em>Test Case Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TestCaseAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTestCaseAggregation()
		 * @generated
		 */
		EClass TEST_CASE_AGGREGATION = eINSTANCE.getTestCaseAggregation();

		/**
		 * The meta object literal for the '<em><b>Number Of Testcases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES = eINSTANCE.getTestCaseAggregation_NumberOfTestcases();

		/**
		 * The meta object literal for the '<em><b>Name Of Test Suite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE = eINSTANCE.getTestCaseAggregation_NameOfTestSuite();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DesignPatternSpecificationImpl <em>Design Pattern Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DesignPatternSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getDesignPatternSpecification()
		 * @generated
		 */
		EClass DESIGN_PATTERN_SPECIFICATION = eINSTANCE.getDesignPatternSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_PATTERN_SPECIFICATION__PARENT = eINSTANCE.getDesignPatternSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Design Pattern Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_PATTERN_SPECIFICATION__DESIGN_PATTERN_ROLES = eINSTANCE.getDesignPatternSpecification_DesignPatternRoles();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DesignPatternRoleImpl <em>Design Pattern Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.DesignPatternRoleImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getDesignPatternRole()
		 * @generated
		 */
		EClass DESIGN_PATTERN_ROLE = eINSTANCE.getDesignPatternRole();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_PATTERN_ROLE__PROVIDED_ROLE = eINSTANCE.getDesignPatternRole_ProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_PATTERN_ROLE__COMPONENT = eINSTANCE.getDesignPatternRole_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TechnologySpecificationImpl <em>Technology Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TechnologySpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTechnologySpecification()
		 * @generated
		 */
		EClass TECHNOLOGY_SPECIFICATION = eINSTANCE.getTechnologySpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SPECIFICATION__PARENT = eINSTANCE.getTechnologySpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Technological Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES = eINSTANCE.getTechnologySpecification_TechnologicalCorrespondences();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TechnologicalCorrespondenceImpl <em>Technological Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.TechnologicalCorrespondenceImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTechnologicalCorrespondence()
		 * @generated
		 */
		EClass TECHNOLOGICAL_CORRESPONDENCE = eINSTANCE.getTechnologicalCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Technological Correspondence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE = eINSTANCE.getTechnologicalCorrespondence_TechnologicalCorrespondenceType();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGICAL_CORRESPONDENCE__COMPONENT = eINSTANCE.getTechnologicalCorrespondence_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologicalCorrespondenceTypes <em>Technological Correspondence Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologicalCorrespondenceTypes
		 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.impl.FieldOfActivityAnnotationsPackageImpl#getTechnologicalCorrespondenceTypes()
		 * @generated
		 */
		EEnum TECHNOLOGICAL_CORRESPONDENCE_TYPES = eINSTANCE.getTechnologicalCorrespondenceTypes();

	}

} //FieldOfActivityAnnotationsPackage
