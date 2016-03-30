package org.muml.core.tests;

import java.io.File;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.junit.Test;
import org.muml.core.tests.resource.ProblemCollector;
import org.osgi.framework.Bundle;

/**
 * A Junit test that checks all qvto files for compilation errors.
 * 
 * It searches for .qvto files in registered bundles. The current working
 * directory needs to point to the workspace location that contains all bundles
 * to check.
 * 
 * @author ingo
 *
 */
public abstract class QVTOCompileErrorTest {
	final ProblemCollector problems = new ProblemCollector();


	/**
	 * Tests all .qvto files in the current working directory (which should be
	 * the workspace root)
	 */
	@Test
	public void test() {
		for (File project : findWorkspaceLocation().listFiles()) {
			if (project.isDirectory()) {
				String bundleName = project.getName();
				Bundle bundle = Platform.getBundle(bundleName);
				if (bundle != null) {
					testBundle(bundle);
				}
			}
		}
		problems.fail();
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

	/**
	 * Test all .qvto files in that bundle.
	 * 
	 * @param bundle
	 *            The bundle that contains the .qvto files to check.
	 */
	private void testBundle(Bundle bundle) {
		String bundleName = bundle.getSymbolicName();

		// Find all .qvto files in that bundle
		Enumeration<URL> entries = bundle.findEntries("/", "*.qvto", true);
		if (entries != null) {
			while (entries.hasMoreElements()) {
				URL url = entries.nextElement();

				// Should we check this .qvto script?
				if (shouldCheck(bundleName, url)) {

					// Check that script
					check(URI.createPlatformPluginURI(bundleName + url.getPath(), true));
				}
			}
		}
	}

	/**
	 * Checks the qvto script represented by the uri.
	 * 
	 * @param uri
	 *            The uri of the qvto script to check.
	 */
	private void check(URI uri) {
		// Compile the transformation (if it was a library, we will
		// get an error)
		TransformationExecutor transformationExecutor = new TransformationExecutor(uri);
		Diagnostic diagnostic = transformationExecutor.loadTransformation();
		if (diagnostic.getSeverity() != Diagnostic.OK) {

			// If this is a library, we get an error; do not fail
			// then.
			if (!diagnostic.getMessage().contains("No transformation found in unit")) {
				//org.junit.Assert.fail(diagnostic.toString());
				problems.add(diagnostic.toString());
			}
		}
	}

	/**
	 * Finds out if this qvto script should be checked.
	 * 
	 * @param bundleName
	 *            The name of the bundle that contains this script.
	 * @param url
	 *            The url of the script within the bundle.
	 * @return <code>true</code>, if this script should be checked.
	 */
	public abstract boolean shouldCheck(String bundleName, URL url);

}
