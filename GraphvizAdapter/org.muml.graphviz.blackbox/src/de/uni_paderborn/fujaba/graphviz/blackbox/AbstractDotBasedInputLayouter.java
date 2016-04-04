package de.uni_paderborn.fujaba.graphviz.blackbox;

import org.eclipse.jdt.annotation.NonNull;

import de.uni_paderborn.fujaba.graphviz.dot.DotGraph;
import de.uni_paderborn.fujaba.graphviz.dot.xtext.resource.DotLanguageResource;

public abstract class AbstractDotBasedInputLayouter<O> extends AbstractGraphvizLayouter<DotGraph, O> {
	
	private static final String DOT_BINARY = "dot";

	@Override
	@NonNull
	public String createInput(DotGraph graph) {
		return getDotLanguageResource().serializeEObject(graph, null);
	}
	
	@NonNull
	protected DotLanguageResource getDotLanguageResource() {
		return new DotLanguageResource();
	}
	
	@NonNull
	protected abstract String[] getDotOptions();

	@Override
	protected String[] getCommand() {
		String[] options = getDotOptions();
		String[] cmd = new String[1 + options.length];
		cmd[0] = DOT_BINARY;
		System.arraycopy(options, 0, cmd, 1, options.length);
		return cmd;
	}
}