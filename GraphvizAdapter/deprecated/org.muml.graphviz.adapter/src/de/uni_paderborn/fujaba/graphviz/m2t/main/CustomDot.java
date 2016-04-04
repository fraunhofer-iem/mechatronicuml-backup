package de.uni_paderborn.fujaba.graphviz.m2t.main;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.acceleo.engine.generation.strategy.IAcceleoGenerationStrategy;
import org.eclipse.acceleo.engine.generation.strategy.PreviewStrategy;
import org.eclipse.acceleo.engine.generation.writers.AbstractAcceleoWriter;
import org.eclipse.emf.ecore.EObject;


class CustomPreviewStrategy extends PreviewStrategy {
	private Map<String, Writer> fWriters;
	
	public CustomPreviewStrategy(Map<String, Writer> fWriters) {
		super();
		this.fWriters = fWriters;
	}
	
	@Override
	public AbstractAcceleoWriter createWriterFor(File file, AbstractAcceleoWriter previous,
			boolean appendMode, boolean hasJMergeTags, String charset) throws IOException {
		AbstractAcceleoWriter writer = super.createWriterFor(file, previous, appendMode, hasJMergeTags, charset);
		fWriters.put(file.getName(), writer);
		return writer;
	}
}

public class CustomDot extends Dot {
	private Map<String, Writer> fWriters;
	private IAcceleoGenerationStrategy fPreviewStrategy;
	private static final String USER_DIR = "user.dir";
	
	public CustomDot(EObject model) throws IOException {
		super();
		initialize(model, new File(System.getProperty(USER_DIR)), Collections.<Object>emptyList());
		fWriters = new HashMap<String, Writer>();
		fPreviewStrategy = new CustomPreviewStrategy(fWriters);
	}

	public Map<String, Writer> getWriters() {
		return fWriters;
	}
	
	@Override
	public IAcceleoGenerationStrategy getGenerationStrategy() {
        //return super.getGenerationStrategy();
		return fPreviewStrategy;
	}

	public String generateDot() {
		fWriters.clear();
		try {
			doGenerate(null);
		} catch (IOException e) {
			// should not happen
			e.printStackTrace();
			return null;
		}
		if (fWriters.values().isEmpty()) {
			return null;
		}
		Writer writer = fWriters.values().toArray(new Writer[1])[0];
		return writer.toString();
	}
}