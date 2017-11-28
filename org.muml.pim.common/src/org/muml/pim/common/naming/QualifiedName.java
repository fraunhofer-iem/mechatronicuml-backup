package org.muml.pim.common.naming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/**
 * A simple class representing a qualified name.
 */
public class QualifiedName {
	private ArrayList<String> segments = new ArrayList<String>();
	private static final Pattern DISALLOWED_CHARS = Pattern.compile("[^a-zA-Z0-9_]"); //matches any characters that may not be part of a segment
	private static final Pattern DISALLOWED_CHARS_FIRST_POS = Pattern.compile("[0-9]"); //matches characters that are additionally disallowed at first position of a segment
	
	/**
	 * Constructs an empty qualified name
	 */
	public QualifiedName() {
		
	}
	
	/**
	 * Equivalent to new QualifiedName().append(firstSegment)
	 * @param firstSegment the first (least specific) segment
	 */
	public QualifiedName(String firstSegment) {
		append(firstSegment);
	}
	
	/**
	 * Clones a QualifiedName
	 */
	public QualifiedName(QualifiedName name) {
		segments.addAll(name.getSegments());
	}
	
	/**
	 * Add a segment (which makes the name more specific than it was previously).
	 * You do not have to 'escape' the segment, it can be any arbitrary String.
	 */
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
	
	/**
	 * Replaces certain characters like '(', spaces, etc. such that 
	 * the resulting segment is a valid identifier (by typical definitions)
	 * @return the escaped segment
	 */
	public String escapeSegment(String segment) {
		if (segment.length() == 0)
			return segment;
		
		if (DISALLOWED_CHARS_FIRST_POS.matcher(segment.subSequence(0, 1)).matches())
			segment = "num"+segment.substring(1);
		
		segment = DISALLOWED_CHARS.matcher(segment).replaceAll("_");
		
		return segment;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < segments.size(); i++) {
			if (i != 0)
				builder.append('.');			
			builder.append(escapeSegment(segments.get(i)));
		}
		
		return builder.toString();
	}
	
}
