package de.uni_paderborn.fujaba.muml.common.naming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QualifiedName {
	private ArrayList<String> segments = new ArrayList<String>();
	final char[] forbiddenChars = new char[] {' ','.','-','/','*','+','&','(',')'}; //list of characters forbidden in QualifiedNames
	
	public QualifiedName() {
		
	}
	
	public QualifiedName(String firstSegment) {
		append(firstSegment);
	}
	
	public QualifiedName(QualifiedName name) {
		segments.addAll(name.getSegments());
	}
	
	public QualifiedName append(String segment) {
		if (segment != null)
			segments.add(segment);
		return this;
	}
	
	/**
	 * Returns this QualifiedName as a list of its segments
	 */
	public List<String> getSegments() {
		return Collections.unmodifiableList(segments);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < segments.size(); i++) {
			if (i != 0)
				builder.append('.');
			String segment = segments.get(i);
			for (char c: forbiddenChars) {
				segment = segment.replace(c, '_');
			}
			builder.append(segment);
		}
		
		return builder.toString();
	}
	
}
