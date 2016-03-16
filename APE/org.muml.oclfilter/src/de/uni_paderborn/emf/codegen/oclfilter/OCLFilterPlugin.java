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
import org.eclipse.emf.ecore.EModelElement;
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

	public static boolean shouldGenerate(GenModel genModel) {
		for (GenPackage genPackage : genModel.getGenPackages()) {
			EPackage ePackage = genPackage.getEcorePackage();
			if (shouldGenerate(ePackage)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean shouldGenerate(EPackage ePackage) {
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				if (shouldGenerate((EClass) eClassifier)) {
					return true;
				}
			}
		}
		for (EPackage subPackage : ePackage.getESubpackages()) {
			if (shouldGenerate(subPackage)) {
				return true;
			}
		}
		return false;
	}

	public static boolean shouldGenerate(EClass eClass) {
		if (containsAnnotation(eClass)) {
			return true;
		}
		for (EStructuralFeature feature : eClass.getEStructuralFeatures()) {
			if (containsAnnotation(feature)) {
				return true;
			}
		}
		for (EClass superType : eClass.getESuperTypes()) {
			if (shouldGenerate(superType)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean containsAnnotation(EModelElement modelElement) {
		EAnnotation annotation = modelElement.getEAnnotation(OCLItemPropertyDescriptor.FILTER_ANNOTATION);
		if (annotation != null) {
			return annotation.getDetails().containsKey(OCLItemPropertyDescriptor.FILTER_KEY);
		}
		return false;
	}


}
