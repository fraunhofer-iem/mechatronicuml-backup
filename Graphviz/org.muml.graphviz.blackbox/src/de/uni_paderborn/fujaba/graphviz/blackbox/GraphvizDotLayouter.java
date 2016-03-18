package de.uni_paderborn.fujaba.graphviz.blackbox;

import org.eclipse.jdt.annotation.NonNull;

import de.uni_paderborn.fujaba.common.xtext.ILanguageResource;
import de.uni_paderborn.fujaba.graphviz.dot.DotGraph;
import de.uni_paderborn.fujaba.graphviz.dot.xtext.resource.DotLanguageResource;

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
		return new DotLanguageResource();
	}

	// XXX: workaround for kepler's qvto (shouldn't be needed in luna)
	@Override
	public DotGraph layout(DotGraph graph) {
		return super.layout(graph);
	}

}
