package org.muml.graphviz.blackbox;

import org.eclipse.jdt.annotation.NonNull;
import org.muml.core.common.xtext.ILanguageResource;
import org.muml.graphviz.dot.DotGraph;

public class GraphvizDotLayouter extends AbstractDotBasedInputLayouter<DotGraph> {

	@Override
	@NonNull
	protected String[] getDotOptions() {
		String[] options = {"-Tdot"};
		return options;
	}

	@Override
	@NonNull
	protected ILanguageResource getLanguageResource() {
		return getDotLanguageResource();
	}

	// XXX: workaround for kepler's qvto (shouldn't be needed in luna)
	@Override
	public DotGraph layout(DotGraph graph) {
		return super.layout(graph);
	}

}
