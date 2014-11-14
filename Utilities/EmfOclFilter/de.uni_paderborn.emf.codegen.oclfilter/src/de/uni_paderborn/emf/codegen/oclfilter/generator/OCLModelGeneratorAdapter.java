package de.uni_paderborn.emf.codegen.oclfilter.generator;

import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapter;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import de.uni_paderborn.emf.codegen.oclfilter.OCLFilterPlugin;

public class OCLModelGeneratorAdapter extends GenModelGeneratorAdapter {

	public OCLModelGeneratorAdapter(
			GeneratorAdapterFactory generatorAdapterFactory) {
		super(generatorAdapterFactory);
	}

	public boolean canGenerateModel(Object object) {
		return false;
	}

	public boolean canGenerateEdit(Object object) {
		return super.canGenerateEdit(object);
	}

	public boolean canGenerateEditor(Object object) {
		return false;
	}

	public boolean canGenerateTests(Object object) {
		return false;
	}

	protected Diagnostic generateEdit(Object object, Monitor monitor) {

	    GenModel genModel = (GenModel)object;
	   
	    ensureProjectExists
	      (genModel.getEditDirectory(), genModel, EDIT_PROJECT_TYPE, genModel.isUpdateClasspath(), createMonitor(monitor, 1));
	   
	    generateEditManifest(genModel, monitor);
	    

		return Diagnostic.OK_INSTANCE;
	}
	
	@Override
	protected void generateEditManifest(GenModel genModel, Monitor monitor) {
		super.generateEditManifest(genModel, monitor);
	    
		if (OCLFilterPlugin.shouldGenerate(genModel)) {
			copyPropertyDescriptor(genModel);
			addOCLDependency(genModel);
		}
	}
	
	protected void addOCLDependency(GenModel genModel) {
  		URI targetFile = toURI(genModel.getEditProjectDirectory() + "/META-INF/MANIFEST.MF");

  		// Make sure src folder is added to build.properties for binary build!
  		String manifest = readFile(targetFile);
  		if (!manifest.contains("Require-Bundle: org.eclipse.ocl.ecore,")) {
	  		manifest = manifest.replaceFirst("Require-Bundle:", "Require-Bundle: org.eclipse.ocl.ecore,\n");
	  		writeFile(targetFile, manifest);		
  		}
	}

	protected void copyPropertyDescriptor(GenModel genModel) {
  		String targetPath = genModel.getEditDirectory();
		URI targetDirectory = toURI(targetPath).appendSegment("ocl");
		URI targetFile = targetDirectory.appendSegment("OCLItemPropertyDescriptor.java");

  		// Make sure src folder is added to build.properties for binary build!
  		String descriptor = OCLFilterPlugin.readBundleResource("src/de/uni_paderborn/emf/codegen/oclfilter/descriptor/OCLItemPropertyDescriptor.java");
  		descriptor = descriptor.replaceFirst("^package (.*);", "package ocl;");
  		writeFile(targetFile, descriptor);		
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
