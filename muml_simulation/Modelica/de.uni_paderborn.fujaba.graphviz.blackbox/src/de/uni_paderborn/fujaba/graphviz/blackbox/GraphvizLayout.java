package de.uni_paderborn.fujaba.graphviz.blackbox;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;

import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

import de.uni_paderborn.fujaba.graphviz.graphviz.output.Graph;
import de.uni_paderborn.fujaba.graphviz.m2t.main.CustomDot;
import de.uni_paderborn.fujaba.graphviz.xtext.PlainStandaloneSetup;

public class GraphvizLayout {
	private static final String DOT_BINARY = "dot";
	
	public Graph layout(de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph graph) {
		String dotString = createDotString(graph);
		return runDot(dotString);
	}
	
	private Graph runDot(String dotString) {
		ProcessBuilder pb = new ProcessBuilder(DOT_BINARY, "-Tplain");
		try {
			Process process = pb.start();
			process.getOutputStream().write(dotString.getBytes());
			process.getOutputStream().close();
			process.waitFor();
			String plain = readPlain(process.getInputStream());
			Graph graph = parse(plain);
			process.getInputStream().close();
			return graph;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private String readPlain(InputStream in) throws IOException {
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

	private Graph parse(String plainString) {
		Injector injector = new PlainStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resSet = injector.getInstance(XtextResourceSet.class);
		String ext = injector.getInstance(Key.get(String.class, Names.named(Constants.FILE_EXTENSIONS)));
		Resource resource = resSet.createResource(URI.createURI("dummy." + ext));
		Map<String, Boolean> options = new HashMap<String, Boolean>();
		options.put(XtextResource.OPTION_RESOLVE_ALL, true);
		try {
			resource.load(new StringInputStream(plainString), options);
		} catch (IOException e) {
			// should not happen
			e.printStackTrace();
		}
		if (resource.getErrors().isEmpty()) {
			return (Graph) resource.getContents().get(0);
		}
		throw new IllegalArgumentException("invalid plain string: " + plainString);
	}
	
	private String createDotString(de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph graph) {
		try	{
			CustomDot dotGenerator = new CustomDot(graph);
			return dotGenerator.generateDot();
		} catch (IOException e) {
			// should not happen
			e.printStackTrace();
			return null;
		}
	}
}
