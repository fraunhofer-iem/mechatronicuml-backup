package org.muml.graphviz.dot.xtext.resource;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.common.xtext.AbstractLanguageResource;
import org.muml.graphviz.dot.DotGraph;
import org.muml.graphviz.dot.xtext.DotLanguageStandaloneSetup;

import com.google.inject.Injector;

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
