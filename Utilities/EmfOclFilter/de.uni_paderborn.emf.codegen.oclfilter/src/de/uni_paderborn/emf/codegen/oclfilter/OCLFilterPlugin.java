package de.uni_paderborn.emf.codegen.oclfilter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.uni_paderborn.emf.codegen.oclfilter.descriptor.OCLItemPropertyDescriptor;

/**
 * The activator class controls the plug-in life cycle
 */
public class OCLFilterPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.uni_paderborn.emf.codegen.oclfilter"; //$NON-NLS-1$

	// The shared instance
	private static OCLFilterPlugin plugin;

	/**
	 * The constructor
	 */
	public OCLFilterPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static OCLFilterPlugin getDefault() {
		return plugin;
	}

	
	
	// Helper methods
	
	
	public static String readBundleResource(String resource) {
		try {
			return readStream(OCLFilterPlugin.getDefault().getBundle()
					.getResource(resource).openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static String readStream(InputStream inputStream) {
		final StringBuffer buffer = new StringBuffer();
		try {

			BufferedReader in = null;
			try {
				in = new BufferedReader(new InputStreamReader(inputStream));
				String line = null;
				while (null != (line = in.readLine())) {
					buffer.append(line).append("\n");
				}
			} finally {
				if (in != null) {
					in.close();
				}
			}
		} catch (Exception e) {
			throw new WrappedException(e);
		}
		return buffer.toString();
	}

	public static void writeStream(OutputStream outputStream, String contents) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(outputStream);
			writer.write(contents);
			writer.flush();
			writer.close();
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
	}

	public static boolean containsAnnotation(EPackage ePackage) {
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				if (containsAnnotation((EClass) eClassifier)) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean containsAnnotation(EClass eClass) {
		for (EStructuralFeature feature : eClass.getEStructuralFeatures()) {
			if (containsAnnotation(feature)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean containsAnnotation(EStructuralFeature feature) {
		EAnnotation annotation = feature.getEAnnotation(OCLItemPropertyDescriptor.OCL_ANNOTATION);
		if (annotation != null) {
			return annotation.getDetails().containsKey(OCLItemPropertyDescriptor.CHOICES_KEY) || annotation.getDetails().containsKey(OCLItemPropertyDescriptor.FILTER_KEY);
		}
		return false;
	}

	public static boolean containsAnnotation(GenModel genModel) {
		for (GenPackage genPackage : genModel.getGenPackages()) {
			EPackage ePackage = genPackage.getEcorePackage();
			if (containsAnnotation(ePackage)) {
				return true;
			}
		}
		return false;
	}

}
