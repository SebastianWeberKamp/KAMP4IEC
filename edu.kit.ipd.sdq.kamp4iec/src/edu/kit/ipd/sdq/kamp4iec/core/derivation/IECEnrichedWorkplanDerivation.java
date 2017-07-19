package edu.kit.ipd.sdq.kamp4iec.core.derivation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

import edu.kit.ipd.sdq.kamp.workplan.AbstractEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureAnnotationLookup;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.IECActivityElementType;
import edu.kit.ipd.sdq.kamp4iec.core.IECActivityType;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECBuildConfiguration;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECComponent;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Konfiguration;

public class IECEnrichedWorkplanDerivation implements AbstractEnrichedWorkplanDerivation<IECArchitectureVersion> {
	
	@Override
	public List<Activity> deriveEnrichedWorkplan(IECArchitectureVersion baseArchitectureVersion, IECArchitectureVersion subVersion, 
			List<Activity> baseActivityList) {
		List<Activity> result = new ArrayList<Activity>(baseActivityList);
		
		deriveCodingActivities(baseArchitectureVersion, subVersion, result);
		deriveMetadataActivities(baseArchitectureVersion, subVersion, result);
		deriveBuildConfigurationActivities(baseArchitectureVersion, subVersion, result);
		deriveBuildExecutionActivities(subVersion, result);		
		deriveTestDevelopmentActivities(baseArchitectureVersion, subVersion, result);
		deriveTestExecutionActivities(subVersion, result);
		//TODO integration tests
		//TODO acceptance tests
//		deriveReleaseConfigurationActivities(calculateFlattenendActivityList(result));		
		deriveReleaseExecutionActivities(subVersion, result);		
//		deriveDeploymentConfigurationActivities(calculateFlattenendActivityList(result));		
		deriveDeploymentExecutionActivities(subVersion, result);		
		//TODO staff
		//TODO technology specification
		//TODO design patterns

		return result;
	}

	public static List<Activity> calculateFlattenendActivityList(List<Activity> activityList) {
		List<Activity> flatActivityList = new ArrayList<Activity>();
		
		for (Activity activity : activityList) {
			flatActivityList.add(activity);
			if (!activity.getSubActivities().isEmpty()) {
				flatActivityList.addAll(calculateFlattenendActivityList(activity.getSubActivities()));
			}
			if (!activity.getFollowupActivities().isEmpty()) {
				flatActivityList.addAll(calculateFlattenendActivityList(activity.getFollowupActivities()));
			}
		}
		
		return flatActivityList;
	}
	
	private static <T extends IECArchitectureVersion> T determineRelevantArchitectureVersion(
			Activity activity, T baseVersion, T targetVersion) {
		if (activity.getBasicActivity() == BasicActivity.REMOVE) {
			return baseVersion;
		} else {
			return targetVersion;
		}
	}

	private static void deriveCodingActivities(IECArchitectureVersion baseVersion, 
			IECArchitectureVersion targetVersion, List<Activity> baseActivityList) {
		for (Activity activity : baseActivityList) {
			int numberOfFiles = determineNumberOfSourceFiles(determineRelevantArchitectureVersion(
					activity, baseVersion, targetVersion), activity);
			if (activity.getElementType() == IECActivityElementType.FUNCTIONBLOCK && numberOfFiles > 0) {
				activity.addFollowupActivity(new Activity(IECActivityType.IMPLEMENTATION_SOURCECODE, 
						IECActivityElementType.SOURCECODEFILES, activity.getElement(),
						numberOfFiles + " source file(s)", null, activity.getBasicActivity(),
						"Source code implementation: " + activity.getBasicActivity().getName() + 
						" source file(s) (" + numberOfFiles + " files) of component " + 
						activity.getElementName() + "."));
			} 
			deriveCodingActivities(baseVersion, targetVersion, activity.getSubActivities());
		}
	}

	private static int determineNumberOfSourceFiles(IECArchitectureVersion version, 
			Activity activity) {
		int numberOfISSourceFiles = 0;
//		if (activity.getElement() instanceof RepositoryComponent) {
//			RepositoryComponent component = (RepositoryComponent)activity.getElement();
//			List<ISSourceFile> sourceFiles = ISArchitectureAnnotationLookup.
//					lookUpISSourceFilesForComponent(version, component);
//			numberOfISSourceFiles += sourceFiles.size();
//			ISSourceFileAggregation sourceFileAggregation = ISArchitectureAnnotationLookup.
//					lookUpSourceFileAggregationForComponent(version, component);
//			if (sourceFileAggregation != null)
//				numberOfISSourceFiles += sourceFileAggregation.getNumberOfFiles(); 
//		}
		return numberOfISSourceFiles;
	}

	private static void deriveMetadataActivities(IECArchitectureVersion baseVersion, 
			IECArchitectureVersion targetVersion, List<Activity> baseActivityList) {
		for (Activity activity : baseActivityList) {
//			int numberOfFiles = determineNumberOfMetadataFiles(determineRelevantArchitectureVersion(
//					activity, baseVersion, targetVersion), activity);
//			if (activity.getElementType() == IECActivityElementType.COMPONENT && numberOfFiles > 0) {
//				activity.addFollowupActivity(new Activity(IECActivityType.IMPLEMENTATION_METADATA, 
//						IECActivityElementType.METADATAFILES, activity.getElement(),
//						numberOfFiles + " meta data file(s)", null, activity.getBasicActivity(), 
//						"Meta data implementation: " + activity.getBasicActivity().getName() + 
//						" meta data file(s) (" + numberOfFiles + " files) of component " + 
//						activity.getElementName() + "."));
//			} 
			deriveMetadataActivities(baseVersion, targetVersion, activity.getSubActivities());
		}
	}

//	private static int determineNumberOfMetadataFiles(ArchitectureVersion version, 
//			Activity activity) {
//		int numberOfISMetadataFiles = 0;
//		if (activity.getElement() instanceof RepositoryComponent) {
//			RepositoryComponent component = (RepositoryComponent)activity.getElement();
//			List<ISMetadataFile> metadataFiles = ISArchitectureAnnotationLookup.
//					lookUpMetadataFilesForComponent(version, component);
//			numberOfISMetadataFiles += metadataFiles.size();
//			ISMetadataFileAggregation metadataFileAggregation = ISArchitectureAnnotationLookup.
//					lookUpMetadataFileAggregationForComponent(version, component);
//			if (metadataFileAggregation!=null)
//				numberOfISMetadataFiles += metadataFileAggregation.getNumberOfFiles(); 
//		}
//		return numberOfISMetadataFiles;
//	}
	
	private static void deriveBuildConfigurationActivities(IECArchitectureVersion baseVersion, 
			IECArchitectureVersion targetVersion, List<Activity> activityList) {
		// TODO: update build annotations
		for (Activity activity : activityList) {
			deriveBuildConfigurationActivitiesForComponent(activity, determineRelevantArchitectureVersion(
					activity, baseVersion, targetVersion), activityList);
			deriveBuildConfigurationActivitiesForRequiredRole(activity, determineRelevantArchitectureVersion(
					activity, baseVersion, targetVersion), activityList);
			deriveBuildConfigurationActivities(baseVersion, targetVersion, activity.getSubActivities());
		}	
	}
	
	private static void deriveBuildConfigurationActivitiesForComponent(
			Activity activity, IECArchitectureVersion version, List<Activity> activityList) {
//		if (activity.getElementType() == IECActivityElementType.COMPONENT && 
//				componentIsNotThirdPartyOrLibrary(version, (RepositoryComponent)activity.getElement()) 
//				&& (activity.getBasicActivity() == BasicActivity.ADD || 
//				activity.getBasicActivity() == BasicActivity.REMOVE)) {
//			ISBuildConfiguration buildConfiguration = ISArchitectureAnnotationLookup.
//					lookUpBuildConfigurationForComponent(version, (RepositoryComponent)activity.getElement());
//			String description = "";
//			if (activity.getBasicActivity()==BasicActivity.ADD) {			
//				description = "Register component " + activity.getElementName() + 
//						" in build configuration.";
//			} else if (activity.getBasicActivity()==BasicActivity.REMOVE) {
//				description = "Remove component" + activity.getElementName() + 
//						" from build configuration.";
//			}
//			activity.addFollowupActivity(new Activity(IECActivityType.BUILDCONFIGURATION, 
//					IECActivityElementType.BUILDCONFIGURATION, activity.getElement(),
//					(buildConfiguration != null) ? buildConfiguration.getFilename() : "",
//					null, BasicActivity.MODIFY, "Build configuration: " + description));
//		}
	}
	
//	private static boolean componentIsNotThirdPartyOrLibrary(ArchitectureVersion version, 
//			RepositoryComponent component) {
//		return IECArchitectureAnnotationLookup.lookUpThirdPartyOrLibraryAnnotationForComponent(
//				version, component) == null;
//	}
	
	private static void deriveBuildConfigurationActivitiesForRequiredRole(
			Activity activity, IECArchitectureVersion version, List<Activity> activityList) {
//		if (activity.getElementType() == IECActivityElementType.REQUIREDROLE && 
//				(activity.getBasicActivity() == BasicActivity.ADD || 
//				activity.getBasicActivity() == BasicActivity.REMOVE)) {
//			RepositoryComponent component = null;
//			component = getComponentOfRequiredRole(activity);
//			if (component != null && componentIsNotThirdPartyOrLibrary(version, component)) {
//				BuildConfiguration buildConfiguration = ArchitectureAnnotationLookup.
//						lookUpBuildConfigurationForComponent(version, component);
//				String description = "";
//				if (activity.getBasicActivity()==BasicActivity.ADD) {			
//					description = "Added dependency for RequiredRole " + activity.getElementName() + 
//					" added to build configuration.";
//				} else if (activity.getBasicActivity()==BasicActivity.REMOVE) {
//					description = "Removed dependency for RequiredRole " + activity.getElementName() + 
//					" removed from build configuration.";
//				}
//				activity.addFollowupActivity(new Activity(ISActivityType.BUILDCONFIGURATION, 
//						ISActivityElementType.BUILDCONFIGURATION, activity.getElement(),
//						(buildConfiguration != null) ? buildConfiguration.getFilename() : "",
//						null, BasicActivity.MODIFY, "Build configuration: " + description));
//				
//			}
//		}
	}
	
//	private static RepositoryComponent getComponentOfRequiredRole(Activity activity) {
//		RepositoryComponent component = null;
//		if (activity.getElement() != null) {
//			InterfaceRequiringEntity entity = ((RequiredRole)(activity.getElement())).
//					getRequiringEntity_RequiredRole();
//			if (entity instanceof RepositoryComponent) {
//				component = (RepositoryComponent) entity;
//			}
//		}
//		return component;
//	}

	private static void deriveBuildExecutionActivities(IECArchitectureVersion target, 
			List<Activity> activityList) {	
		for (Activity activity : activityList) {
//			if (activity.getElementType() == IECActivityElementType.FUNCTIONBLOCK && 
//					((activity.getBasicActivity()==BasicActivity.ADD) || 
//					(activity.getBasicActivity()==BasicActivity.MODIFY))) {
//				if (componentIsNotThirdPartyOrLibrary(target, (RepositoryComponent)activity.getElement())) {
//					// Source code and meta data not relevant
//					// TODO: build configuration defines the unit
//					// TODO: for each build configuration only one execution
//					ISBuildConfiguration buildConfig = ISArchitectureAnnotationLookup.
//							lookUpBuildConfigurationForComponent(target, 
//									(RepositoryComponent)activity.getElement());
//					activity.addFollowupActivity(new Activity(ISActivityType.BUILDEXECUTION, 
//							ISActivityElementType.BUILDCONFIGURATION, activity.getElement(),
//							(buildConfig != null) ? buildConfig.getFilename() : "" , 
//							null, BasicActivity.EXECUTE, 
//							"Build execution: Build component " + activity.getElementName()));
//				}
//			}
			deriveBuildExecutionActivities(target, activity.getSubActivities());
		}
	}
	
	private static void deriveTestDevelopmentActivities(IECArchitectureVersion baseVersion, 
			IECArchitectureVersion targetVersion, List<Activity> baseActivityList) {	
		for (Activity activity : baseActivityList) {
//			if (activity.getElementType() == IECActivityElementType.PROVIDEDROLE && 
//					activity.getBasicActivity() == BasicActivity.ADD) {
//				activity.addFollowupActivity(new Activity(IECActivityType.TESTDEVELOPMENT, 
//						IECActivityElementType.TESTCASE, activity.getElement(),
//						"", null, BasicActivity.ADD, 
//						"Test development: Develop unit tests for ProvidedRole."));
//			} else if (activity.getElementType() == IECActivityElementType.PROVIDEDROLE && 
//					activity.getBasicActivity() == BasicActivity.REMOVE) {
//				int numberOfUnitTests = numberOfAvailableUnitTests(baseVersion, activity);
//				if (numberOfUnitTests > 0) {
//					activity.addFollowupActivity(new Activity(ISActivityType.TESTDEVELOPMENT, 
//							IECActivityElementType.TESTCASE, activity.getElement(),
//							numberOfUnitTests + " test(s)", null, BasicActivity.REMOVE, 
//							"Test development: Remove unit tests for ProvidedRole."));
//				}
//			} else if (activity.getElementType() == IEActivityElementType.PROVIDEDROLE && 
//					activity.getBasicActivity() == BasicActivity.MODIFY) {
//				int numberOfUnitTests = numberOfAvailableUnitTests(targetVersion, activity);
//				if (numberOfUnitTests > 0) {
//					activity.addFollowupActivity(new Activity(ISActivityType.TESTUPDATE, 
//							ISActivityElementType.TESTCASE, activity.getElement(),
//							numberOfUnitTests + " test(s)", null, BasicActivity.CHECKANDUPDATE, 
//							"Test development: Check and update unit tests for ProvidedRole."));
//				}
//			}
			deriveTestDevelopmentActivities(baseVersion, targetVersion, activity.getSubActivities());
		}
	}

	private static int numberOfAvailableUnitTests(IECArchitectureVersion version,
			Activity activity) {
		int numberOfTests = 0;
//		if (activity.getElement() instanceof ProvidedRole) {
//			ISUnitTestCaseAggregation testAggregation = ISArchitectureAnnotationLookup.
//					lookUpUnitTestAggregationForProvidedRole(version, (ProvidedRole)activity.getElement());
//			List<ISUnitTestCase> testCases = ISArchitectureAnnotationLookup.
//					lookUpUnitTestCasesForProvidedRole(version, (ProvidedRole)activity.getElement());
//			if (testAggregation!=null)
//				numberOfTests += testAggregation.getNumberOfTestcases();
//			numberOfTests += testCases.size();
//		}
		return numberOfTests;
	}
	
	private static void deriveTestExecutionActivities(IECArchitectureVersion target,
			List<Activity> baseActivityList) {
		
		for (Activity activity : baseActivityList) {
//			if (activity.getElementType() == ISActivityElementType.PROVIDEDROLE && 
//					activity.getBasicActivity()==BasicActivity.ADD) {
//				activity.addFollowupActivity(new Activity(ISActivityType.TESTEXECUTION, 
//						ISActivityElementType.TESTCASE, activity.getElement(),
//						"New test cases", null, BasicActivity.EXECUTE, 
//						"Test execution (unit tests): Execute test cases."));
//			} else if (activity.getElementType() == ISActivityElementType.PROVIDEDROLE && 
//					activity.getBasicActivity()==BasicActivity.MODIFY) {
//				int numberOfUnitTests = numberOfAvailableUnitTests(target, activity);
//				if (numberOfUnitTests>0) {
//					activity.addFollowupActivity(new Activity(ISActivityType.TESTEXECUTION, 
//							ISActivityElementType.TESTCASE, activity.getElement(),
//							numberOfUnitTests + " test(s)", null, BasicActivity.EXECUTE,
//							"Test execution (unit tests): Execute test cases."));
//				}
//			}
			deriveTestExecutionActivities(target, activity.getSubActivities());
		}
	}

//	private static void deriveReleaseConfigurationActivities(
//			List<Activity> baseActivityList) {
//		
//		for (Activity activity : baseActivityList) {
//			if (activity.getElementType() == ActivityElementType.BUILDCONFIGURATION && 
//					activity.getBasicActivity()==BasicActivity.MODIFY) {
//				Activity newActivity = new Activity(ActivityType.RELEASECONFIGURATION, 
//						ActivityElementType.RELEASECONFIGURATION, "release configuration", 
//						BasicActivity.MODIFY, "Release configuration: Modify release configuration.");
//				activity.addFollowupactivity(newActivity);
//			} 
//		}
//	}

	private static void deriveReleaseExecutionActivities(IECArchitectureVersion target,
			List<Activity> baseActivityList) {
		for (Activity activity : baseActivityList) {
//			if (activity.getElementType() == ISActivityElementType.BUILDCONFIGURATION && 
//					activity.getBasicActivity() == BasicActivity.EXECUTE) {
//				activity.addFollowupActivity(new Activity(ISActivityType.RELEASEEXECUTION, 
//						ISActivityElementType.RELEASECONFIGURATION, activity.getElement(),
//						"release exection", null, BasicActivity.EXECUTE, 
//						"Release execution: Perform release."));
//			} 
			deriveReleaseExecutionActivities(target, activity.getFollowupActivities());
		}
	}
	
//	private static void deriveDeploymentConfigurationActivities(
//			List<Activity> baseActivityList) {
//		for (Activity activity : baseActivityList) {
//			if (activity.getType()==ActivityType.RELEASEEXECUTION && 
//					activity.getBasicActivity()==BasicActivity.EXECUTE) {
//				Activity newActivity = new Activity(ActivityType.DEPLOYMENTCONFIGURATION, 
//						ActivityElementType.DEPLOYMENTCONFIGURATION, 
//						"deployment configuration", BasicActivity.MODIFY, 
//						"Deployment configuration: Modify deployment configuration.");
//				activity.addFollowupactivity(newActivity);
//			} 
//		}
//	}

	private static void deriveDeploymentExecutionActivities(
			IECArchitectureVersion target, List<Activity> baseActivityList) {
		//TODO consider runtime instances
		for (Activity activity : baseActivityList) {
			if (activity.getType() == IECActivityType.RELEASEEXECUTION && 
					activity.getBasicActivity() == BasicActivity.EXECUTE) {
				activity.addFollowupActivity(new Activity(IECActivityType.DEPLOYMENTEXECUTION, 
						IECActivityElementType.DEPLOYMENTCONFIGURATION, activity.getElement(),
						"one run-time instance", null, BasicActivity.EXECUTE, 
						"Deployment execution: Perform deployment."));
			} 
			deriveDeploymentExecutionActivities(target, activity.getFollowupActivities());
		}
	}
}