package edu.kit.ipd.sdq.kamp4iec.core;

import java.util.HashMap;
import java.util.Map;

import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECComponent;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Konfiguration;

public class IECArchitectureAnnotationLookup {

	public static Map<IECComponent, Konfiguration> lookUpToChangeSoftware(IECArchitectureVersion version,
			Activity activity) {
		Map<IECComponent, Konfiguration> softwareChangeAffectedParts = new HashMap<IECComponent, Konfiguration>();
		// TODO
		return softwareChangeAffectedParts;
	}
}
