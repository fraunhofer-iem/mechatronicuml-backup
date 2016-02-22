package de.uni_paderborn.examples.tests;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

import de.uni_paderborn.fujaba.muml.codegen.c.ui.export.C99SourceCodeExport;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

public class CodegenTest {

	@Test
	public void CheckManifest() throws IOException, CoreException {
	for (File directory : findWorkspaceLocation().listFiles()) {
			if (directory.isDirectory()) {
				if (Platform.getBundle(directory.getName()) != null) {
					checkFiles(directory, new FilenameFilter() {
						@Override
						public boolean accept(File dir, String name) {
							return name.endsWith(".muml") || name.endsWith(".fujaba");
						}
					});
				}
			}
		}
	}

	private void checkFiles(File directory, FilenameFilter filenameFilter) throws CoreException {
		for (File file : directory.listFiles()) {
			if (file.isDirectory() && !".".equals(file.getName()) && ! "..".equals(file.getName())) {
				checkFiles(file, filenameFilter);
			} else if (file.isFile() && filenameFilter.accept(directory, file.getName())) {
				checkModelFile(URI.createFileURI(file.getAbsolutePath()));
			}
		}
	}

	private void checkModelFile(URI uri) throws CoreException {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(uri, true);
		for (EObject element : resource.getContents()) {
			checkElement(element);
		}
	}

	private void checkElement(EObject element) throws CoreException {
		if (element instanceof ComponentInstanceConfiguration) {
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("test");
			project.delete(true, new NullProgressMonitor());
			project.create(new NullProgressMonitor());
			IContainer container = project.getFolder("src-gen");
			
			C99SourceCodeExport export = new C99SourceCodeExport();
			export.generateSourceCode(element, container, new NullProgressMonitor());
			
			// prevent child ComponentInstanceConfigurations from being found
			return;
		}

		for (EObject child : element.eContents()) {
			checkElement(child);
		}
	}

	/**
	 * Finds the path that contains all bundles.
	 * 
	 * @return The workspace location.
	 */
	private File findWorkspaceLocation() {
		return new File("."); // This requires that the launch configuration
								// sets ${workspace_loc} as working directory!
	}

}
