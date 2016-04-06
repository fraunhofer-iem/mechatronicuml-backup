package org.muml.graphviz.blackbox;

import org.eclipse.jdt.annotation.NonNull;
import org.muml.core.common.xtext.ILanguageResource;
import org.muml.graphviz.dot.DotGraph;
import org.muml.graphviz.plain.PlainGraph;
import org.muml.graphviz.plain.xtext.resource.PlainLanguageResource;

public class GraphvizPlainLayouter extends AbstractDotBasedInputLayouter<PlainGraph> {
	
	@Override
	@NonNull
	protected String[] getDotOptions() {
		String[] options = {"-Tplain"};
		return options;
	}
	
	@Override
	@NonNull
	protected ILanguageResource getLanguageResource() {
		return new PlainLanguageResource();
	}
	
	// XXX: workaround for kepler's qvto (shouldn't be needed in luna)
	@Override
	public PlainGraph layout(DotGraph graph) {
		return super.layout(graph);
	}

}
