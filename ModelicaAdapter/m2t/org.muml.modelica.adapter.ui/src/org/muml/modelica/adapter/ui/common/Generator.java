package org.muml.modelica.adapter.ui.common;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.muml.modelica.adapter.main.Generate;
import org.muml.modelica.adapter.ui.Activator;
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
			long start;
			start = System.currentTimeMillis();
			generator.generate(BasicMonitor.toMonitor(monitor), false);
			Double finalTime = Double.valueOf(Double.valueOf(System.currentTimeMillis() - start)
					.doubleValue() / 1000d);
			Status logTransformationTime = new Status(Status.INFO,Activator.PLUGIN_ID,"Time to generate Modelica Code: "+finalTime);
			// writes log into the .log file within the .metadata folder of the workspace
			Activator.getDefault().getLog().log(logTransformationTime);
		} finally {
			directory.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		}
	}

}
