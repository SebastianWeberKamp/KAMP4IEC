/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.util;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage
 * @generated
 */
public class FieldOfActivityAnnotationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FieldOfActivityAnnotationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FieldOfActivityAnnotationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldOfActivityAnnotationsSwitch<Adapter> modelSwitch =
		new FieldOfActivityAnnotationsSwitch<Adapter>() {
			@Override
			public Adapter caseFieldOfActivityAnnotationsRepository(FieldOfActivityAnnotationsRepository object) {
				return createFieldOfActivityAnnotationsRepositoryAdapter();
			}
			@Override
			public Adapter caseDevelopmentArtefactSpecification(DevelopmentArtefactSpecification object) {
				return createDevelopmentArtefactSpecificationAdapter();
			}
			@Override
			public Adapter caseSourceFile(SourceFile object) {
				return createSourceFileAdapter();
			}
			@Override
			public Adapter caseSourceFileAggregation(SourceFileAggregation object) {
				return createSourceFileAggregationAdapter();
			}
			@Override
			public Adapter caseMetadataFile(MetadataFile object) {
				return createMetadataFileAdapter();
			}
			@Override
			public Adapter caseMetadataFileAggregation(MetadataFileAggregation object) {
				return createMetadataFileAggregationAdapter();
			}
			@Override
			public Adapter caseBuildSpecification(BuildSpecification object) {
				return createBuildSpecificationAdapter();
			}
			@Override
			public Adapter caseBuildConfiguration(BuildConfiguration object) {
				return createBuildConfigurationAdapter();
			}
			@Override
			public Adapter caseThirdPartyComponentOrLibrary(ThirdPartyComponentOrLibrary object) {
				return createThirdPartyComponentOrLibraryAdapter();
			}
			@Override
			public Adapter caseTestSpecification(TestSpecification object) {
				return createTestSpecificationAdapter();
			}
			@Override
			public Adapter caseReleaseSpecification(ReleaseSpecification object) {
				return createReleaseSpecificationAdapter();
			}
			@Override
			public Adapter caseReleaseConfiguration(ReleaseConfiguration object) {
				return createReleaseConfigurationAdapter();
			}
			@Override
			public Adapter caseDeploymentSpecification(DeploymentSpecification object) {
				return createDeploymentSpecificationAdapter();
			}
			@Override
			public Adapter caseRuntimeInstance(RuntimeInstance object) {
				return createRuntimeInstanceAdapter();
			}
			@Override
			public Adapter caseRuntimeInstanceAggregation(RuntimeInstanceAggregation object) {
				return createRuntimeInstanceAggregationAdapter();
			}
			@Override
			public Adapter caseUnitTestCase(UnitTestCase object) {
				return createUnitTestCaseAdapter();
			}
			@Override
			public Adapter caseAcceptanceTestCase(AcceptanceTestCase object) {
				return createAcceptanceTestCaseAdapter();
			}
			@Override
			public Adapter caseIntegrationTestCase(IntegrationTestCase object) {
				return createIntegrationTestCaseAdapter();
			}
			@Override
			public Adapter caseUnitTestCaseAggregation(UnitTestCaseAggregation object) {
				return createUnitTestCaseAggregationAdapter();
			}
			@Override
			public Adapter caseAcceptanceTestCaseAggregation(AcceptanceTestCaseAggregation object) {
				return createAcceptanceTestCaseAggregationAdapter();
			}
			@Override
			public Adapter caseIntegrationTestCaseAggregation(IntegrationTestCaseAggregation object) {
				return createIntegrationTestCaseAggregationAdapter();
			}
			@Override
			public Adapter caseStaffSpecification(StaffSpecification object) {
				return createStaffSpecificationAdapter();
			}
			@Override
			public Adapter casePersonList(PersonList object) {
				return createPersonListAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseRoleList(RoleList object) {
				return createRoleListAdapter();
			}
			@Override
			public Adapter caseDeveloper(Developer object) {
				return createDeveloperAdapter();
			}
			@Override
			public Adapter caseBuildConfigurator(BuildConfigurator object) {
				return createBuildConfiguratorAdapter();
			}
			@Override
			public Adapter caseTestDeveloper(TestDeveloper object) {
				return createTestDeveloperAdapter();
			}
			@Override
			public Adapter caseTester(Tester object) {
				return createTesterAdapter();
			}
			@Override
			public Adapter caseReleaseConfigurator(ReleaseConfigurator object) {
				return createReleaseConfiguratorAdapter();
			}
			@Override
			public Adapter caseDeployer(Deployer object) {
				return createDeployerAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseFileAggregation(FileAggregation object) {
				return createFileAggregationAdapter();
			}
			@Override
			public Adapter caseTestCase(TestCase object) {
				return createTestCaseAdapter();
			}
			@Override
			public Adapter caseTestCaseAggregation(TestCaseAggregation object) {
				return createTestCaseAggregationAdapter();
			}
			@Override
			public Adapter caseDesignPatternSpecification(DesignPatternSpecification object) {
				return createDesignPatternSpecificationAdapter();
			}
			@Override
			public Adapter caseDesignPatternRole(DesignPatternRole object) {
				return createDesignPatternRoleAdapter();
			}
			@Override
			public Adapter caseTechnologySpecification(TechnologySpecification object) {
				return createTechnologySpecificationAdapter();
			}
			@Override
			public Adapter caseTechnologicalCorrespondence(TechnologicalCorrespondence object) {
				return createTechnologicalCorrespondenceAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository
	 * @generated
	 */
	public Adapter createFieldOfActivityAnnotationsRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification <em>Development Artefact Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DevelopmentArtefactSpecification
	 * @generated
	 */
	public Adapter createDevelopmentArtefactSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFile
	 * @generated
	 */
	public Adapter createSourceFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFileAggregation <em>Source File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.SourceFileAggregation
	 * @generated
	 */
	public Adapter createSourceFileAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFile <em>Metadata File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFile
	 * @generated
	 */
	public Adapter createMetadataFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFileAggregation <em>Metadata File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.MetadataFileAggregation
	 * @generated
	 */
	public Adapter createMetadataFileAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildSpecification <em>Build Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildSpecification
	 * @generated
	 */
	public Adapter createBuildSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildConfiguration <em>Build Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildConfiguration
	 * @generated
	 */
	public Adapter createBuildConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ThirdPartyComponentOrLibrary <em>Third Party Component Or Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ThirdPartyComponentOrLibrary
	 * @generated
	 */
	public Adapter createThirdPartyComponentOrLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification <em>Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestSpecification
	 * @generated
	 */
	public Adapter createTestSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseSpecification <em>Release Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseSpecification
	 * @generated
	 */
	public Adapter createReleaseSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfiguration <em>Release Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfiguration
	 * @generated
	 */
	public Adapter createReleaseConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DeploymentSpecification <em>Deployment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DeploymentSpecification
	 * @generated
	 */
	public Adapter createDeploymentSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstance <em>Runtime Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstance
	 * @generated
	 */
	public Adapter createRuntimeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstanceAggregation <em>Runtime Instance Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RuntimeInstanceAggregation
	 * @generated
	 */
	public Adapter createRuntimeInstanceAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCase <em>Unit Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCase
	 * @generated
	 */
	public Adapter createUnitTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCase <em>Acceptance Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCase
	 * @generated
	 */
	public Adapter createAcceptanceTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCase <em>Integration Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCase
	 * @generated
	 */
	public Adapter createIntegrationTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCaseAggregation <em>Unit Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.UnitTestCaseAggregation
	 * @generated
	 */
	public Adapter createUnitTestCaseAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCaseAggregation <em>Acceptance Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.AcceptanceTestCaseAggregation
	 * @generated
	 */
	public Adapter createAcceptanceTestCaseAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCaseAggregation <em>Integration Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.IntegrationTestCaseAggregation
	 * @generated
	 */
	public Adapter createIntegrationTestCaseAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.StaffSpecification <em>Staff Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.StaffSpecification
	 * @generated
	 */
	public Adapter createStaffSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.PersonList <em>Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.PersonList
	 * @generated
	 */
	public Adapter createPersonListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RoleList <em>Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.RoleList
	 * @generated
	 */
	public Adapter createRoleListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Developer <em>Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Developer
	 * @generated
	 */
	public Adapter createDeveloperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildConfigurator <em>Build Configurator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.BuildConfigurator
	 * @generated
	 */
	public Adapter createBuildConfiguratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestDeveloper <em>Test Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestDeveloper
	 * @generated
	 */
	public Adapter createTestDeveloperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Tester <em>Tester</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Tester
	 * @generated
	 */
	public Adapter createTesterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfigurator <em>Release Configurator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.ReleaseConfigurator
	 * @generated
	 */
	public Adapter createReleaseConfiguratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Deployer <em>Deployer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.Deployer
	 * @generated
	 */
	public Adapter createDeployerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FileAggregation <em>File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FileAggregation
	 * @generated
	 */
	public Adapter createFileAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestCase
	 * @generated
	 */
	public Adapter createTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestCaseAggregation <em>Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TestCaseAggregation
	 * @generated
	 */
	public Adapter createTestCaseAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternSpecification <em>Design Pattern Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternSpecification
	 * @generated
	 */
	public Adapter createDesignPatternSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternRole <em>Design Pattern Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.DesignPatternRole
	 * @generated
	 */
	public Adapter createDesignPatternRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologySpecification <em>Technology Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologySpecification
	 * @generated
	 */
	public Adapter createTechnologySpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologicalCorrespondence <em>Technological Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.TechnologicalCorrespondence
	 * @generated
	 */
	public Adapter createTechnologicalCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FieldOfActivityAnnotationsAdapterFactory
