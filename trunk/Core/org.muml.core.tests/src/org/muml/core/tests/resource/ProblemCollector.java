package org.muml.core.tests.resource;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class ProblemCollector extends ArrayList<String> {

	/**
	 * Fail if there have been problems added.
	 */
	public void fail() {
		if (!isEmpty()) {
			StringBuilder errorText = new StringBuilder();
			int size = size();
			for (String problem : this) {
				if (size > 1) {
					errorText.append("\n\n");
				}
				errorText.append(problem);
			}
			org.junit.Assert.fail(errorText.toString());
		}
	}

}
