package edu.kit.ipd.sdq.kamp4iec.core;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.model.Modifikationmarks.AbstractKAMP4IECModificationRepository;


public class ArchitectureVersion extends AbstractArchitectureVersion<AbstractKAMP4IECModificationRepository<?>> {
	
	public static class ArchitectureVersionParams{
		public String name;
		public AbstractKAMP4IECModificationRepository<?> modificationMarkRepository;
	}
	
	public ArchitectureVersion(ArchitectureVersionParams params) {
		super(params.name, params.modificationMarkRepository);
		// Some of the files describing the architecture might not exist; prevent NullPointer
		// in propagation algorithm by setting newly created objects (whose EReferences are
		// instantiated with empty collections, so the algorithm can handle them)
		
	}
}
