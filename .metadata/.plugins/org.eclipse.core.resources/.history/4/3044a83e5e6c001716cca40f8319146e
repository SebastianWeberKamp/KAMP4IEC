package edu.kit.ipd.sdq.kamp4iec.core;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

//import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;
import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion.ArchitectureVersionParams;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.AbstractKAMP4IECModificationRepository;

public class IECArchitectureVersionPersistency extends AbstractKAMP4IECArchitectureVersionPersistency<IECArchitectureVersion> {	
	
	
	private ArchitectureVersionParams archParams = new ArchitectureVersionParams();

	@Override
	public IECArchitectureVersion load(String folderpath, String filename, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();	
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;
		
		archParams.name = versionname;
		archParams.modificationMarkRepository = (AbstractKAMP4IECModificationRepository<?>)loadEmfModelFromResource(folderpath, internalModFilePath, loadResourceSet);
		return new IECArchitectureVersion(archParams);
	}	
	
	@Override
	public IECArchitectureVersion load(IContainer folder, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();	
		IFile internalModFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_MODIFICATIONMARK);
		
		archParams.modificationMarkRepository = null;
		
		archParams.name = versionname;
		if (internalModFile != null && internalModFile.exists())
			archParams.modificationMarkRepository = (AbstractKAMP4IECModificationRepository<?>)loadEmfModelFromResource(internalModFile.getFullPath().toString(), null, loadResourceSet);
		return new IECArchitectureVersion(archParams);
	}
	
}
