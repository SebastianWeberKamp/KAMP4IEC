package edu.kit.ipd.sdq.kamp4iec.core.derivation;

import java.util.List;

import org.eclipse.emf.compare.Diff;

import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp4iec.core.ArchitectureVersion;

public class DifferenceCalculation extends AbstractKAMP4IECDifferenceCalculation<ArchitectureVersion>{

	@Override
	public List<Activity> deriveWorkplan(ArchitectureVersion baseVersion, ArchitectureVersion targetVersion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void checkForDifferencesAndAddToWorkplan(Diff diffElement, List<Activity> workplan) {
		// TODO Auto-generated method stub
		
	}

}
