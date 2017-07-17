package edu.kit.ipd.sdq.kamp4iec.core.derivation;

import java.util.LinkedList;
import java.util.List;

import edu.kit.ipd.sdq.kamp.workplan.AbstractEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp4iec.core.ArchitectureVersion;

public class EnrichedWorkplanDerivation implements AbstractEnrichedWorkplanDerivation<ArchitectureVersion> {
	
	public static Activity addBusinessProcessFollowupActivity(NamedElement entity, NamedElement parentElement,
			Activity parentActivity) {
		Activity result = new Activity(BPActivityType.BUSINESS_PROCESS,
				BPActivityElementType.getAnnotationActivityTypeForObject(entity), entity, entity.getEntityName(), null,
				parentActivity.getBasicActivity(),
				ISSubactivityDerivation.generateDescription(parentElement, entity, parentActivity.getBasicActivity()));
		parentActivity.addFollowupActivity(result);
		return result;
	}

	private static BPFieldOfActivityAnnotationsRepository determineRelevantBPAnnotationRepository(Activity activity,
			BPArchitectureVersion baseVersion, BPArchitectureVersion targetVersion) {
		if (activity.getBasicActivity() == BasicActivity.REMOVE) {
			if (baseVersion.getFieldOfActivityRepository() instanceof BPFieldOfActivityAnnotationsRepository) {
				return (BPFieldOfActivityAnnotationsRepository) baseVersion.getFieldOfActivityRepository();
			}
			else {
				return null;
			}
		}
		else {
			if (targetVersion.getFieldOfActivityRepository() instanceof BPFieldOfActivityAnnotationsRepository) {
				return (BPFieldOfActivityAnnotationsRepository) targetVersion.getFieldOfActivityRepository();
			}
			else {
				return null;
			}
		}
	}

	@Override
	public List<Activity> deriveEnrichedWorkplan(ArchitectureVersion baseVersion, ArchitectureVersion targetVersion,
			List<Activity> baseActivityList) {
		List<Activity> result = new ArrayList<Activity>(
				super.deriveEnrichedWorkplan(baseVersion, targetVersion, baseActivityList));
		deriveBPUserActionAnnotationActivities(baseVersion, targetVersion, result);
		deriveBPGoodActivities(baseVersion, targetVersion, result);
		deriveBPTrainingCourseActivities(baseVersion, targetVersion, result);
		deriveBPOrganizationalUnitActivities(baseVersion, targetVersion, result);
		deriveBPMessageActivities(baseVersion, targetVersion, result);
		return result;
	}

	private static void deriveBPGoodActivities(BPArchitectureVersion baseVersion, BPArchitectureVersion targetVersion,
			List<Activity> activityList) {
		for (Activity activity : activityList) {
			if (activity.getElementType() == BPActivityElementType.ACTORSTEP) {
				BPFieldOfActivityAnnotationsRepository annotationRepository = determineRelevantBPAnnotationRepository(
						activity, baseVersion, targetVersion);
				Collection<BPGood> goods = BPArchitectureAnnotationLookup
						.lookUpBPGoodsForActorStep(annotationRepository, (ActorStep) activity.getElement());
				for (BPGood good : goods) {
					activity.addFollowupActivity(new Activity(BPActivityType.BUSINESS_PROCESS,
							BPActivityElementType.GOOD, good, good.getEntityName(), createCausingElementList(activity),
							activity.getBasicActivity(),
							BPActivityElementType.ACTORSTEP.getName() + " \"" + activity.getElementName()
									+ "\" works with " + BPActivityElementType.GOOD.getName() + " \""
									+ good.getEntityName() + "\"."));
				}
			}
			deriveBPGoodActivities(baseVersion, targetVersion, activity.getSubActivities());
		}
	}

	private static void deriveBPTrainingCourseActivities(BPArchitectureVersion baseVersion,
			BPArchitectureVersion targetVersion, List<Activity> activityList) {
		for (Activity activity : activityList) {
			if (activity.getElementType() == BPActivityElementType.ACTORSTEP) {
				BPFieldOfActivityAnnotationsRepository annotationRepository = determineRelevantBPAnnotationRepository(
						activity, baseVersion, targetVersion);
				Collection<BPTrainingCourse> trainingCourses = BPArchitectureAnnotationLookup
						.lookUpBPTrainingCoursesForActorStep(annotationRepository, (ActorStep) activity.getElement());
				for (BPTrainingCourse trainingCourse : trainingCourses) {
					activity.addFollowupActivity(new Activity(BPActivityType.BUSINESS_PROCESS,
							BPActivityElementType.TRAININGCOURSE, trainingCourse, trainingCourse.getEntityName(),
							createCausingElementList(activity), activity.getBasicActivity(),
							BPActivityElementType.ACTORSTEP.getName() + " \"" + activity.getElementName()
									+ "\" changed; consider attending " + BPActivityElementType.TRAININGCOURSE.getName()
									+ " \"" + trainingCourse.getEntityName() + "\"."));
				}
			}
			deriveBPTrainingCourseActivities(baseVersion, targetVersion, activity.getSubActivities());
		}
	}

	private static void deriveBPMessageActivities(BPArchitectureVersion baseVersion,
			BPArchitectureVersion targetVersion, List<Activity> activityList) {
		for (Activity activity : activityList) {
			if (activity.getElementType() == BPActivityElementType.ACTORSTEP) {
				BPFieldOfActivityAnnotationsRepository annotationRepository = determineRelevantBPAnnotationRepository(
						activity, baseVersion, targetVersion);
				Collection<BPMessage> messages = BPArchitectureAnnotationLookup
						.lookUpBPMessagesForActorStep(annotationRepository, (ActorStep) activity.getElement());
				for (BPMessage message : messages) {
					String activityDescription = null;
					if (message.getSender() == activity.getElement()) {
						activityDescription = "Sending " + BPActivityElementType.ACTORSTEP.getName() + " \""
								+ activity.getElementName() + "\" of " + BPActivityElementType.MESSAGE.getName() + " \""
								+ message.getEntityName() + "\" changed.";
					}
					else if (message.getReceiver() == activity.getElement()) {
						activityDescription = "Receiving " + BPActivityElementType.ACTORSTEP.getName() + " \""
								+ activity.getElementName() + "\" of " + BPActivityElementType.MESSAGE.getName() + " \""
								+ message.getEntityName() + "\" changed.";
					}
					else {
						//ERROR
					}
					activity.addFollowupActivity(new Activity(BPActivityType.BUSINESS_PROCESS,
							BPActivityElementType.MESSAGE, message, message.getEntityName(),
							createCausingElementList(activity), activity.getBasicActivity(), activityDescription));
				}
			}
			deriveBPMessageActivities(baseVersion, targetVersion, activity.getSubActivities());
		}
	}

	private static void deriveBPOrganizationalUnitActivities(BPArchitectureVersion baseVersion,
			BPArchitectureVersion targetVersion, List<Activity> activityList) {
		for (Activity activity : activityList) {
			if (activity.getElement() instanceof AbstractUserAction) {
				BPFieldOfActivityAnnotationsRepository annotationRepository = determineRelevantBPAnnotationRepository(
						activity, baseVersion, targetVersion);
				Collection<BPOrganizationalUnit> organizationalUnits = BPArchitectureAnnotationLookup
						.lookUpBPOrganizationalUnitsForAbstractUserAction(annotationRepository,
								(AbstractUserAction) activity.getElement());
				for (BPOrganizationalUnit organizationalUnit : organizationalUnits) {
					activity.addFollowupActivity(
							new Activity(BPActivityType.BUSINESS_PROCESS, BPActivityElementType.ORGANIZATIONALUNIT,
									organizationalUnit, organizationalUnit.getEntityName(),
									createCausingElementList(activity), activity.getBasicActivity(),
									BPActivityElementType.ACTORSTEP.getName() + " \"" + activity.getElementName()
											+ "\" changed; " + BPActivityElementType.ORGANIZATIONALUNIT.getName()
											+ " \"" + organizationalUnit.getEntityName() + "\" might be affected."));
				}
			}
			deriveBPOrganizationalUnitActivities(baseVersion, targetVersion, activity.getSubActivities());
		}
	}

	private static void deriveBPUserActionAnnotationActivities(BPArchitectureVersion baseVersion,
			BPArchitectureVersion targetVersion, List<Activity> activityList) {
		for (Activity activity : activityList) {
			if (activity.getElement() instanceof AbstractUserAction) {
				AbstractUserAction userAction = (AbstractUserAction) activity.getElement();
				BPFieldOfActivityAnnotationsRepository annotationRepository = determineRelevantBPAnnotationRepository(
						activity, baseVersion, targetVersion);
				if (annotationRepository != null) {
					Collection<BPUserActionAnnotation<?>> userActionAnnotations = BPArchitectureAnnotationLookup
							.lookUpUserActionAnnotationsForUserAction(annotationRepository, userAction);
					for (BPUserActionAnnotation<?> userActionAnnotation : userActionAnnotations) {
						addBusinessProcessFollowupActivity(userActionAnnotation, userAction, activity);
					}
				}
			}
		}
	}

	private static LinkedList<String> createCausingElementList(Activity activity) {
		LinkedList<String> newList = new LinkedList<String>();
		newList.addFirst(activity.getElementType().getName() + " \"" + activity.getElementName() + "\"");
		return newList;
	}
}