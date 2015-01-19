package de.uni_paderborn.fujaba.tests;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class QVTOCompileErrorTest {

	public QVTOCompileErrorTest() {
	}

	@Test
	public void test() throws CoreException, IOException, URISyntaxException {
		for (File project : new File(".").listFiles()) {
			String bundleName = project.getName();
			Bundle bundle = Platform.getBundle(bundleName);
			if (bundle != null) {
				Enumeration<URL> entries = bundle.findEntries("/", "*.qvto", true);
				if (entries != null) {
					while (entries.hasMoreElements()) {
						URL url = entries.nextElement();
						String fullPath = bundleName + url.getPath();
						if (bundleName.endsWith(".diagram") && url.getPath().startsWith("/model/")) {
							continue;
						}
						if (bundleName.equals("de.uni_paderborn.fujaba.common") && url.getPath().startsWith("/gmf-templates/")) {
							continue;
						}
						URI uri = URI.createPlatformPluginURI(fullPath, true);
						TransformationExecutor transformationExecutor = new TransformationExecutor(uri);
						Diagnostic diagnostic = transformationExecutor.loadTransformation();
						if (diagnostic.getSeverity() != Diagnostic.OK) {
							if (!diagnostic.getMessage().contains("No transformation found in unit")) {
								org.junit.Assert.fail(diagnostic.toString());
							}
						}
					}
				}
			}
		}
	}


}
