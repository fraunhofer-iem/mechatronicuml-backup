package de.uni_paderborn.fujaba.graphviz.blackbox;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.jdt.annotation.NonNull;

import de.uni_paderborn.fujaba.common.xtext.ILanguageResource;
import de.uni_paderborn.fujaba.common.xtext.ILoadResult;


public abstract class AbstractGraphvizLayouter<I, O> {
	
	public O layout(I graph) {
		String input = createInput(graph);
		return runLayouter(input);
	}
	
	@NonNull
	public abstract String createInput(I graph);
	
	@NonNull
	protected abstract ILanguageResource getLanguageResource();
	
	@NonNull
	protected abstract String[] getCommand();
	
	protected O runLayouter(String dotString) {
		ProcessBuilder pb = new ProcessBuilder(getCommand());
		try {
			Process process = pb.start();
			process.getOutputStream().write(dotString.getBytes());
			process.getOutputStream().close();
			process.waitFor();
			String output = readOutput(process.getInputStream());
			O graph = parseOutput(output);
			process.getInputStream().close();
			return graph;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@NonNull
	protected String readOutput(InputStream in) throws IOException {
		InputStreamReader streamReader = new InputStreamReader(in);
		StringBuilder builder = new StringBuilder();
		int c;
		do {
			c = streamReader.read();
			if (c != -1) {
				builder.append((char) c);
			}
		} while (c != -1);
		streamReader.close();
		return builder.toString();
	}
	
	// TODO: make ILanguageResource/ILoadResult generic
	@SuppressWarnings("unchecked")
	protected O parseOutput(@NonNull String output) {
		ILoadResult loadResult = getLanguageResource()
				.loadFromString(output, null);
		if (loadResult.hasError()) {
			throw new IllegalArgumentException(loadResult.getError());
		}
		return (O) loadResult.getEObject();
	}

}
