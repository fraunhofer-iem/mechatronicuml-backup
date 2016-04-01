package de.uni_paderborn.fujaba.graphviz.blackbox;

import java.io.IOException;

import org.eclipse.jdt.annotation.NonNull;

import de.uni_paderborn.fujaba.graphviz.dot.DotGraph;
import de.uni_paderborn.fujaba.graphviz.m2t.main.CustomDot;

public abstract class AbstractDotBasedInputLayouter<O> extends AbstractGraphvizLayouter<DotGraph, O> {
	
	private static final String DOT_BINARY = "dot";

	@Override
	@NonNull
	public String createInput(DotGraph graph) {
		try	{
			CustomDot dotGenerator = new CustomDot(graph);
			return dotGenerator.generateDot();
		} catch (IOException e) {
			// should not happen
			throw new IllegalStateException(e);
		}
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
