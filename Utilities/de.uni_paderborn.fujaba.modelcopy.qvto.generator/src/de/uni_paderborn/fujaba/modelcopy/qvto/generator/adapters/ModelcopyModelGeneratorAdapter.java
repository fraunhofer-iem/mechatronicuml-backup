package de.uni_paderborn.fujaba.modelcopy.qvto.generator.adapters;

import java.io.PrintWriter;

import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapter;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;

import de.uni_paderborn.fujaba.modelcopy.qvto.generator.template.ModelcopyGenerator;

public class ModelcopyModelGeneratorAdapter extends GenModelGeneratorAdapter {

	public ModelcopyModelGeneratorAdapter(
			GeneratorAdapterFactory generatorAdapterFactory) {
		super(generatorAdapterFactory);
	}

	public boolean canGenerateModel(Object object) {
		return super.canGenerateModel(object);
	}

	public boolean canGenerateEdit(Object object) {
		return false;
	}

	public boolean canGenerateEditor(Object object) {
		return false;
	}

	public boolean canGenerateTests(Object object) {
		return false;
	}
	
	@Override
	protected Diagnostic generateModel(Object object, Monitor monitor) {
		GenModel genModel = (GenModel) object;
		for (GenPackage genPackage : genModel.getGenPackages()) {
			EPackage ePackage = genPackage.getEcorePackage();
			if (ePackage == null) {
				continue;
			}
			ModelcopyGenerator generator = new ModelcopyGenerator();
	
		    ensureProjectExists
		      (genModel.getModelDirectory(), genModel, MODEL_PROJECT_TYPE, genModel.isUpdateClasspath(), createMonitor(monitor, 1));
		   
	
			String fileName = ePackage.getName() + "2" + ePackage.getName() + ".qvto";
			String targetPath = genModel.getModelProjectDirectory();
			URI targetDirectory = toURI(targetPath).appendSegment("model");
			URI targetFile = targetDirectory.appendSegment(fileName);
			PrintWriter writer = null;
			ensureContainerExists(targetDirectory, monitor);
			try {
				writer = new PrintWriter(createOutputStream(targetFile));
				writer.write(generator.createGenerator(ePackage).toString());
				writer.flush();
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (writer != null) {
					writer.close();
				}
			}
		}
	    return Diagnostic.OK_INSTANCE;
	}
	
	
}
