package org.muml.core.tests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.eclipse.core.runtime.Platform;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class ManifestTest {


	/**
	 * Finds all MANIFEST.MF files, and calls checkManifest() to check them.
	 * @throws IOException 
	 */
	@Test
	public void CheckManifest() throws IOException {
		for (File project : findWorkspaceLocation().listFiles()) {
			if (project.isDirectory()) {
				String bundleName = project.getName();
				Bundle bundle = Platform.getBundle(bundleName);
				if (bundle != null) {
					for (File metaInf : project.listFiles()) {
						if (metaInf.isDirectory() && metaInf.getName().equals("META-INF")) {
							for (File manifest : metaInf.listFiles()) {
								if (manifest.isFile() && manifest.getName().equals("MANIFEST.MF")) {
									byte[] encoded = Files.readAllBytes(manifest.toPath());
									checkManifest( new String(encoded, "UTF-8"));
								}
							}
						}
					}
				}
			}
		}
	}

	private void checkManifest(String manifestFileContents) {
		if (manifestFileContents.contains("Import-Package:")) {
			throw new IllegalArgumentException("Please do not use Import-Package definitions in MANIFEST.MF.");
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
