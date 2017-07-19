package edu.kit.ipd.sdq.kamp4iec.core.derivation;

import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.IECActivityElementType;
import edu.kit.ipd.sdq.kamp4iec.core.IECActivityType;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECComponent;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier;

public class IECSubactivityDerivation {

	public void deriveSubactivities(Identifier iecComponent, Activity parentActivity, IECArchitectureVersion version) {
		if (iecComponent instanceof GlobalVariable) {
			deriveSubactivity((GlobalVariable) iecComponent, parentActivity, version);
		} else if (iecComponent instanceof FunctionBlock) {
			deriveSubactivity((FunctionBlock) iecComponent, parentActivity, version);
		}
	}

	private void deriveSubactivity(GlobalVariable globalVariable, Activity parentActivity, IECArchitectureVersion version) {
		if (globalVariable instanceof GlobalVariable) {
			for(Program program : version.getKonfiguration().getContainsProgram()) {
				for(FunctionBlock functionBlock : program.getCallsFunctionBlock()) {
					for(GlobalVariable globVar : functionBlock.getAccessesGlobalVariable()) {
						if(globalVariable.getId() == globVar.getId()) {
							addSubActivity(globalVariable, IECActivityElementType.GLOBALVARIABLE, functionBlock, parentActivity);
						}
					}
				}
			}
		}
	}

	private void deriveSubactivity(FunctionBlock globalVariable, Activity parentActivity, IECArchitectureVersion version) {
		//TODO
	}

	private Activity addSubActivity(GlobalVariable globalVariable, IECActivityElementType elementType, IECComponent parentElement, Activity parentActivity) {
		Activity result = new Activity(IECActivityType.ARCHITECTUREMODELDIFF, elementType, globalVariable, globalVariable.getId(), null, parentActivity.getBasicActivity(), 
				generateDescription(parentElement, globalVariable, parentActivity.getBasicActivity()));
		parentActivity.addSubActivity(result);
		return parentActivity;
	}

	public static String generateDescription(Identifier superElement, Identifier subElement, BasicActivity action) {
		String result = "";
		if (action.equals(BasicActivity.ADD)) {
			result += "Add ";
		} else if (action.equals(BasicActivity.REMOVE)) {
			result += "Remove ";
		} else if (action.equals(BasicActivity.MODIFY)) {
			result += "Modify ";
		}
		result += subElement.eClass().getName() + " " + subElement.getId();
		if (action.equals(BasicActivity.ADD)) {
			result += " to ";
		} else if (action.equals(BasicActivity.REMOVE)) {
			result += " from ";
		} else if (action.equals(BasicActivity.MODIFY)) {
			result += " of ";
		}
		result += superElement.eClass().getName() + " " + superElement.getId() + ".";
		return result;
	}

}