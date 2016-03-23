package org.muml.oclfilter.generator;

import org.eclipse.emf.codegen.ecore.CodeGenEcorePlugin;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenClassGeneratorAdapter;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.oclfilter.OCLFilterPlugin;
import org.muml.oclfilter.descriptor.OCLItemPropertyDescriptor;

public class OCLClassGeneratorAdapter extends GenClassGeneratorAdapter {

	public OCLClassGeneratorAdapter(
			GeneratorAdapterFactory generatorAdapterFactory) {
		super(generatorAdapterFactory);
	}

	public boolean canGenerateModel(Object object) {
		return false;
	}

	public boolean canGenerateEdit(Object object) {
		if (super.canGenerateEdit(object) && object instanceof GenClass) {
			GenClass genClass = (GenClass) object;
			return OCLFilterPlugin.shouldGenerate(genClass.getEcoreClass());
		}
		return false;
	}


	public boolean canGenerateEditor(Object object) {
		return false;
	}

	public boolean canGenerateTests(Object object) {
		return false;
	}

	@Override
	protected Diagnostic generateEdit(Object object, Monitor monitor)
	{
	  GenClass genClass = (GenClass)object;
	  GenModel genModel = genClass.getGenModel();
	  ensureProjectExists(genModel.getEditDirectory(), genClass, EDIT_PROJECT_TYPE, genModel.isUpdateClasspath(), createMonitor(monitor, 1));
	  generateItemProvider(genClass, monitor);
	  return Diagnostic.OK_INSTANCE;
	}

	protected void generateItemProvider(GenClass genClass, Monitor monitor) {
		// Default Code generation
		super.generateItemProvider(genClass, monitor);
		
		if (OCLFilterPlugin.shouldGenerate(genClass.getEcoreClass())) {

			// Find out filename of generated item provider
			String targetPath = genClass.getGenModel().getEditDirectory();
			String packageName = genClass.getGenPackage().getProviderPackageName();
			String className = genClass.getProviderClassName();
			URI targetDirectory = toURI(targetPath).appendSegments(packageName.split("\\."));
			URI targetFile = targetDirectory.appendSegment(className + ".java");
	
			// Read files
			String contents = readFile(targetFile);
			String template = OCLFilterPlugin.readBundleResource("template/ItemProvider.txt");
	
			// Append at end of class definition
			if (!contents.contains("@generated OCL")) {
				contents = insert(contents, template, contents.lastIndexOf('}'));
			}
	
			// Write back
			writeFile(targetFile, contents);
		}
	}

	private static String insert(String str, String insert, int position) {
		return str.substring(0, position) + insert + str.substring(position);
	}

	private String readFile(URI targetFile) {
		try {
			return OCLFilterPlugin.readStream(createInputStream(targetFile));
		} catch (Exception e) {
			throw new WrappedException(e);
		}
	}

	protected void writeFile(URI uri, String contents) {
		try {
			OCLFilterPlugin.writeStream(createOutputStream(uri), contents);
		} catch (Exception e) {
			throw new WrappedException(e);
		}
	}
}
