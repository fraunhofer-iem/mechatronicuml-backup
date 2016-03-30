package org.muml.uppaal.adapter.blackbox;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharSubstitutionLibrary {
	public CharSubstitutionLibrary() {
	}

	public String substituteUnsupportedCharsByUTF(String string) {
		String substituted = string;
		Pattern pattern = Pattern.compile("[a-zA-Z_]([a-zA-Z0-9_]*)(.*)");
		Matcher matcher = pattern.matcher(string);

		while (matcher.find() && matcher.group(2) != null && !matcher.group(2).isEmpty()) {
			String s = matcher.group(2);
			char firstChar = s.charAt(0);
			String replace = String.valueOf(Integer.toHexString(firstChar));
			substituted = substituted.replace(String.valueOf(firstChar), replace);
			// System.out.println("replaced " + String.valueOf(firstChar) + "
			// with " + replace);
		}

		return substituted;

	}
}
