package de.uni_paderborn.fujaba.muml.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.eclipse.core.runtime.CoreException;
import org.junit.Test;

import de.uni_paderborn.fujaba.tests.resource.ProblemCollector;

public class NLSUnusedMessageTest {

	public static final String EDITOR_PLUGINS[] = {
			"de.uni_paderborn.fujaba.muml.component.diagram",
			"de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram",
			"de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram",
			"de.uni_paderborn.fujaba.muml.deployment.diagram",
			"de.uni_paderborn.fujaba.muml.messagetype.diagram",
			"de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram",
			"de.uni_paderborn.fujaba.muml.realtimestatechart.diagram" };

	@Test
	public void test() throws CoreException, IOException {

		final ProblemCollector problems = new ProblemCollector();

		Pattern regMessages = Pattern.compile("(.*)=(.*)");

		for (String pluginName : EDITOR_PLUGINS) {
			File messageProperties = new File("../" + pluginName
					+ "/messages.properties");
			File srcFolder = new File("../" + pluginName + "/src/");
			LineIterator it = FileUtils
					.lineIterator(messageProperties, "UTF-8");
			try {
				while (it.hasNext()) {
					String line = it.nextLine();
					Matcher m = regMessages.matcher(line);
					if (line.matches(regMessages.toString())) {
						String messageToLookFor = line.split("=")[0];
						if (!searchRecursiveInJavaFiles(srcFolder, ".*"
								+ messageToLookFor + ".*")) {
							problems.add("Plugin:" + pluginName
									+ " unused NLS Message: "
									+ messageToLookFor + " not defined");
						}
					}
				}
			} finally {
				LineIterator.closeQuietly(it);
			}

		}
		problems.fail();

	}

	protected boolean searchRecursiveInJavaFiles(File folder, String regex)
			throws IOException {
		Iterator<File> iter = FileUtils.iterateFiles(folder,
				new String[] { "java" }, true);

		while (iter.hasNext()) {
			File file = (File) iter.next();
			if (searchInFile(file, regex)) {
				return true;
			}

		}
		return false;
	}

	protected boolean searchInFile(File file, String regex) throws IOException {
		LineIterator it = FileUtils.lineIterator(file, "UTF-8");
		try {
			while (it.hasNext()) {
				String line = it.nextLine();
				if (line.matches(regex)) {
					LineIterator.closeQuietly(it);
					return true;
				}
			}
		} finally {
			LineIterator.closeQuietly(it);
		}
		return false;
	}

}
