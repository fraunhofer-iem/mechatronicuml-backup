package de.uni_paderborn.fujaba.properties.codegen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.PostProcessor;

public class JMergePostProcessor implements PostProcessor {
	private final JControlModel model;

	public JMergePostProcessor(JControlModel model) {
		this.model = model;
	}

	// @Override This override causes problems when deploying as plugin.
	public void beforeWriteAndClose(FileHandle file) {
		if (model == null || !model.canMerge()) {
			return;
		}
		if (!file.getAbsolutePath().endsWith(".java")) {
			return;
		}
		try {
			// if (1 == 1 ) {throw new Exception();}
			JMerger merger = new JMerger(model);

			String oldText = getFileContents(file.getAbsolutePath());
			String newText = file.getBuffer().toString();
			merger.setSourceCompilationUnit(merger
					.createCompilationUnitForContents(newText)); // oldText vs.
																	// newText?
			merger.setTargetCompilationUnit(merger
					.createCompilationUnitForContents(oldText));// oldText vs.
																// newText?
			merger.merge();
			file.setBuffer(merger.getTargetCompilationUnitContents());
		} catch (Exception e) {
			// do nothing, just don't merge but overwrite!
		}
	}

	private String getFileContents(String absolutePath) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(absolutePath)));
		try {
			StringBuilder builder = new StringBuilder();
			String line = "";
			while ((line = reader.readLine()) != null) {
				builder.append(line);
			}
			return builder.toString();
		} finally {
			reader.close();
		}
	}

	// @Override This override causes problems when deploying as plugin.
	public void afterClose(FileHandle impl) {
		// do nothing
	}

}
