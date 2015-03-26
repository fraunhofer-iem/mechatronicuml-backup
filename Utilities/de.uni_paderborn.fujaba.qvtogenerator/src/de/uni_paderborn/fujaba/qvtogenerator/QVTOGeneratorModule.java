package de.uni_paderborn.fujaba.qvtogenerator;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

import de.uni_paderborn.fujaba.qvtogenerator.QVTOGenerator;


public class QVTOGeneratorModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "sample.presentation.SampleEditorID";
	}

	@Override
	protected String getFileExtensions() {
		 return "ecore";
	}
	
	public Class<? extends IGenerator> bindIGenerator() {
        return QVTOGenerator.class;
    }
 
    public Class<? extends ResourceSet> bindResourceSet() {
        return ResourceSetImpl.class;
    }

}
