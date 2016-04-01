package org.muml.modelica.adapter.ui.common;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.muml.modelica.adapter.main.Generate;
import org.muml.pim.instance.ComponentInstanceConfiguration;

public class Generator {
	
	public static void generateCode(ComponentInstanceConfiguration cic, IFolder directory, IProgressMonitor monitor) throws CoreException, IOException {
		try {
			// directly use the Generate, because this way we have more
			// control over the generation process
			// control over the generation process
			// (note: in contrast to the GenerateAll generator, which was
			// previously used, we do not set a generation id (setGenerationID))
			// (it seems we can live without it...)
			//GenerateAll generator = new GenerateAll(modelURI, target, Collections.<Object>emptyList());
			//generator.doGenerate(monitor);
			Generate generator = new Generate(cic, directory.getLocation().toFile(), Collections.<Object>emptyList());
			generator.generate(BasicMonitor.toMonitor(monitor), false);
		} finally {
			directory.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		}
	}

}
