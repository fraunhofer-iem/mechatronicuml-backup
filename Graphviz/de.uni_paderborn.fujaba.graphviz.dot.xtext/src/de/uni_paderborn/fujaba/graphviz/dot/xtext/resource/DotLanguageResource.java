package de.uni_paderborn.fujaba.graphviz.dot.xtext.resource;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.common.xtext.AbstractLanguageResource;
import de.uni_paderborn.fujaba.graphviz.dot.DotGraph;
import de.uni_paderborn.fujaba.graphviz.dot.xtext.DotLanguageStandaloneSetup;

public class DotLanguageResource extends AbstractLanguageResource {

	@Override
	protected Injector getInjector() {
		return new DotLanguageStandaloneSetup().createInjector();
	}

	@Override
	protected boolean isSerializable(EObject object) {
		return object instanceof DotGraph;
	}

}
