package org.muml.core.tests;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.junit.Test;
import org.muml.core.tests.resource.ProblemCollector;

public abstract class NLSUnusedMessageTest {

	private String pluginName;

	public NLSUnusedMessageTest(String pluginName) {
		this.pluginName = pluginName;
	}

	@Test
	public void test() throws CoreException, IOException, URISyntaxException {

		final ProblemCollector problems = new ProblemCollector();

		Pattern regMessages = Pattern.compile("(.*)=(.*)");

		URL urlMessageProperties = Platform.getBundle(pluginName).getResource(
				"messages.properties");
		URL urlSrcFolder = Platform.getBundle(pluginName)
				.getResource("src");
		File messageProperties = new File(FileLocator.resolve(urlMessageProperties).toURI());
		File srcFolder = new File(FileLocator.resolve(urlSrcFolder).toURI());
		LineIterator it = FileUtils.lineIterator(messageProperties, "UTF-8");
		try {
			while (it.hasNext()) {
				String line = it.nextLine();
				if (line.matches(regMessages.toString())) {
					String messageToLookFor = line.split("=")[0];
					if (!searchRecursiveInJavaFiles(srcFolder, ".*"
							+ messageToLookFor + ".*")) {
						problems.add("Plugin:" + pluginName
								+ " unused NLS Message: " + messageToLookFor
								+ " not defined");
					}
				}
			}
		} finally {
			LineIterator.closeQuietly(it);
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
