package edu.kit.ipd.sdq.kamp4iec.core;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.AbstractKAMP4IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;

public class IECArchitectureVersion extends AbstractArchitectureVersion<AbstractKAMP4IECModificationRepository<?>> {
	private Repository _IECRepository;
	private Configuration _configuration;
	private IECFieldOfActivityAnnotationsRepository _fieldOfActivityRepository;
	
	public static class ArchitectureVersionParams{
		public String name;
		public AbstractKAMP4IECModificationRepository<?> modificationMarkRepository;
		public Repository iecRepository;
		public Configuration configuration;
		public IECFieldOfActivityAnnotationsRepository fieldOfActivityRepository;
	}
	
	public IECArchitectureVersion(ArchitectureVersionParams params) {
		super(params.name, params.modificationMarkRepository);
		// Some of the files describing the architecture might not exist; prevent NullPointer
		// in propagation algorithm by setting newly created objects (whose EReferences are
		// instantiated with empty collections, so the algorithm can handle them)
		if (params.iecRepository == null) {
			_IECRepository = IECRepositoryFactory.eINSTANCE.
					createRepository();
		}
		this._IECRepository = params.iecRepository;
		if (params.configuration == null) {
			_configuration = IECModelFactory.eINSTANCE.
					createConfiguration();
		}
		this._configuration = params.configuration;
		if (params.fieldOfActivityRepository == null) {
			_fieldOfActivityRepository = IECFieldOfActivityAnnotationsFactory.eINSTANCE.
					createIECFieldOfActivityAnnotationsRepository();
		}
		this._fieldOfActivityRepository = params.fieldOfActivityRepository;
		
	}

	public Repository getIECRepository() {
		return _IECRepository;
	}

	public void setIECRepository(Repository iecRepository) {
		this._IECRepository = iecRepository;
	}

	public Configuration getConfiguration() {
		return _configuration;
	}

	public void setKonfiguration(Configuration configuration) {
		this._configuration = configuration;
	}

	public IECFieldOfActivityAnnotationsRepository getFieldOfActivityRepository() {
		return _fieldOfActivityRepository;
	}

	public void setFieldOfActivityRepository(IECFieldOfActivityAnnotationsRepository fieldOfActivityRepository) {
		this._fieldOfActivityRepository = fieldOfActivityRepository;
	}
}
