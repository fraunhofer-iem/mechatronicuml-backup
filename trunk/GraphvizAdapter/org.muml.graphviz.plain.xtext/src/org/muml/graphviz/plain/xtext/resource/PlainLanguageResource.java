package org.muml.graphviz.plain.xtext.resource;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.common.xtext.AbstractLanguageResource;
import org.muml.graphviz.plain.PlainGraph;
import org.muml.graphviz.plain.xtext.GraphvizPlainStandaloneSetup;

import com.google.inject.Injector;

public class PlainLanguageResource extends AbstractLanguageResource {

	@Override
	protected Injector getInjector() {
		return new GraphvizPlainStandaloneSetup().createInjector();
	}

	@Override
	protected boolean isSerializable(EObject object) {
		return object instanceof PlainGraph;
	}

}
