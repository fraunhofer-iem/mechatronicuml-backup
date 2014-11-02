package de.uni_paderborn.fujaba.graphviz.blackbox;

import org.eclipse.jdt.annotation.NonNull;

import de.uni_paderborn.fujaba.common.xtext.ILanguageResource;
import de.uni_paderborn.fujaba.graphviz.dot.DotGraph;
import de.uni_paderborn.fujaba.graphviz.plain.PlainGraph;
import de.uni_paderborn.fujaba.graphviz.plain.xtext.resource.PlainLanguageResource;

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
