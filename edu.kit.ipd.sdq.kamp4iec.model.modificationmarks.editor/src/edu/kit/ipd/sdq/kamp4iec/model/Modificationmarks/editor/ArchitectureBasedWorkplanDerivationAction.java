package edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.editor;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractArchitectureBasedWorkplanDerivationAction;
import edu.kit.ipd.sdq.kamp4iec.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.ArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4iec.core.derivation.DifferenceCalculation;
import edu.kit.ipd.sdq.kamp4iec.core.derivation.EnrichedWorkplanDerivation;

public class ArchitectureBasedWorkplanDerivationAction extends AbstractArchitectureBasedWorkplanDerivationAction<ArchitectureVersion> {
	
	public ArchitectureBasedWorkplanDerivationAction() {
		this.setWorkplanDerivation(new DifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new EnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new ArchitectureVersionPersistency());
	}

}

