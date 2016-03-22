package de.uni_paderborn.fujaba.graphviz.plain.xtext.resource;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.common.xtext.AbstractLanguageResource;
import de.uni_paderborn.fujaba.graphviz.plain.PlainGraph;
import de.uni_paderborn.fujaba.graphviz.plain.xtext.GraphvizPlainStandaloneSetup;

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
