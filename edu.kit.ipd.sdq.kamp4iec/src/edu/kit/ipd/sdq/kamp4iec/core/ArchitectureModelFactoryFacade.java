package edu.kit.ipd.sdq.kamp4iec.core;

import edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.KAMP4IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.KAMP4IECSeedModifications;
import edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.ModifikationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.core.ArchitectureVersion.ArchitectureVersionParams;

public class ArchitectureModelFactoryFacade {
	
	private static ArchitectureVersionParams archParams = new ArchitectureVersionParams();
	
	public static ArchitectureVersion createEmptyModel(String name) {
		archParams.name = name;

		archParams.modificationMarkRepository = ArchitectureModelFactoryFacade.createKAMP4IECModificationMarkRepository();

		return new ArchitectureVersion(archParams);
	}
	
	public static KAMP4IECModificationRepository createKAMP4IECModificationMarkRepository() {
		KAMP4IECModificationRepository repository = ModifikationmarksFactory.eINSTANCE.createKAMP4IECModificationRepository();

		KAMP4IECSeedModifications seedModifications = ModifikationmarksFactory.eINSTANCE.createKAMP4IECSeedModifications();
		repository.setSeedModifications(seedModifications);
		
		return repository;
	}

}
