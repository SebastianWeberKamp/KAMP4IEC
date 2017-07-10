package edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.editor;


import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractChangePropagationAction;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4iec.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.ArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4iec.core.ChangePropagationAnalysis;

public class ChangePropagationAction extends AbstractChangePropagationAction<ArchitectureVersion> {

	@Override
	protected AbstractChangePropagationAnalysis<ArchitectureVersion> createChangePropagationAnalysis() {
		return new ChangePropagationAnalysis();
	}

	@Override
	protected AbstractArchitectureVersionPersistency<ArchitectureVersion> createArchitectureVersionPersistency() {
		return new ArchitectureVersionPersistency();
	}

}
