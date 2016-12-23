package org.muml.storydiagram.diagram.ocl;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

public class OCLWhitespaceDetector implements IWhitespaceDetector {
	@Override
	public boolean isWhitespace(char c) {
		switch (c) {
		case ' ':
		case '\t':
		case '\n':
		case '\r':
			return true;
		default:
			return false;
		}
	}

}
