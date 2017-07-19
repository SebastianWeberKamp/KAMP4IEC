package edu.kit.ipd.sdq.kamp4iec.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractCreateEmptyBaseModelAction;
import edu.kit.ipd.sdq.kamp4iec.core.ArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4iec.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.ArchitectureVersionPersistency;

public class CreateEmptyBaseModelAction  extends AbstractCreateEmptyBaseModelAction<ArchitectureVersion> {
	
	public CreateEmptyBaseModelAction() {
		this.setArchitectureVersionPersistency(new ArchitectureVersionPersistency());
	}
	
	@Override
	protected ArchitectureVersion createArchitectureVersion() {
		return ArchitectureModelFactoryFacade.createEmptyModel("architecturemodel");
	}

}

