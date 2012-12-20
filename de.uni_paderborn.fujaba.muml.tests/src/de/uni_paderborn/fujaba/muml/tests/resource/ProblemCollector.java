package de.uni_paderborn.fujaba.muml.tests.resource;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class ProblemCollector extends ArrayList<String> {

	public void fail() {
		if (!isEmpty()) {
			StringBuilder errorText = new StringBuilder();
			int line = 0;
			for (String problem : this) {
				if (line++ > 0) {
					errorText.append('\n');
				}
				errorText.append(problem);
			}
			org.junit.Assert.fail(errorText.toString());
		}
	}

}
