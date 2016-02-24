package de.uni_paderborn.examples.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

import de.uni_paderborn.fujaba.muml.codegen.c.ui.export.C99SourceCodeExport;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.tests.TestUtilities;
import de.uni_paderborn.fujaba.tests.resource.ProblemCollector;

public class CodegenTest {

	private ProblemCollector problemCollector;
	
	@Test
	public void CheckCodegen() throws Exception {
		problemCollector = new ProblemCollector();
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
		problemCollector.fail();
	}

	private void checkFiles(File directory, FilenameFilter filenameFilter) throws Exception {
		for (File file : directory.listFiles()) {
			if (file.isDirectory() && !".".equals(file.getName()) && ! "..".equals(file.getName())) {
				checkFiles(file, filenameFilter);
			} else if (file.isFile() && filenameFilter.accept(directory, file.getName())) {
				checkModelFile(URI.createFileURI(file.getAbsolutePath()));
			}
		}
	}

	private void checkModelFile(URI uri) throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = TestUtilities.loadResource(resourceSet, uri);
		EcoreUtil.resolveAll(resourceSet);
		validateResource(resource);
		for (EObject element : resource.getContents()) {
			codegen(element);
		}
	}

	private void validateResource(Resource resource) {
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		for (EObject contents : resource.getContents()) {
			Map<Object, Object> context = new HashMap<Object, Object>();
			if (!Diagnostician.INSTANCE.validate(contents, diagnostics,
					context)) {
				problemCollector.add(resource.getURI().toString() + " is not valid. ERROR: " + diagnostics.getMessage());
			}
		}
	}

	private void codegen(EObject element) throws Exception {
		if (element instanceof ComponentInstanceConfiguration) {
			codegenCIC((ComponentInstanceConfiguration) element);
			// prevent children from being processed.
			// we only want to process root cic, no child cics within structuredcomponentinstances.
			return;
		}
		for (EObject child : element.eContents()) {
			codegen(child);
		}
	}

	private void codegenCIC(ComponentInstanceConfiguration configuration) throws Exception {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("codegen");
		project.delete(true, new NullProgressMonitor());
		project.create(new NullProgressMonitor());
		try {
			C99SourceCodeExport export = new C99SourceCodeExport();
			export.generateSourceCode(configuration, project, new NullProgressMonitor());
			IFolder sourceFolder = project.getFolder(configuration.getName());
			Process myProcess = new ProcessBuilder("make", "all").directory(new File(sourceFolder.getRawLocation().makeAbsolute().toOSString())).start();
			myProcess.waitFor(60, TimeUnit.SECONDS);
			
			if (myProcess.exitValue() != 0) {
				StringBuffer buffer = new StringBuffer();
				buffer.append('[');
				buffer.append(configuration.getName());
				buffer.append("]: Code generation failed. ERROR:\n");
				BufferedReader br = new BufferedReader(new InputStreamReader(myProcess.getErrorStream()));
				String line;
				while (null != (line = br.readLine())) {
					buffer.append(line);
				}
				problemCollector.add(buffer.toString());
			}
		} finally {
			project.delete(true, new NullProgressMonitor());
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
