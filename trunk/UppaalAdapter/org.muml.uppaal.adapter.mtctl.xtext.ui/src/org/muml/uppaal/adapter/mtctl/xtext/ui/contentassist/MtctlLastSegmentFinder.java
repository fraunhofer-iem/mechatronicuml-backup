package org.muml.uppaal.adapter.mtctl.xtext.ui.contentassist;

import org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher.LastSegmentFinder;

/**
 * Substitute for the DefaultLastSegmentFinder.
 * Used by FQNPrefixMatcher.isCandidateMatchingPrefix(...), which basically decides which autocomplete entries are applicable for 
 * a prefix entered by a user (e.g., "foo[Ctrl+Space]" should only show autocomplete entries that start with "foo", 
 * or whose last QualifiedName segment starts with "foo").
 * 
 * This custom class is necessary because DefaultLastSegmentFinder.getLastSegment("sth.CapitalSegment.x").equals("CapitalSegment.x")
 * (not, as expected, "x"), which may be desirable in some Java typing context, but causes "missing" autocomplete entries for 
 * queries like "foo[Ctrl+Space]", which should also match "sth.CapitalSegment.foo", but doesn't with the default LastSegmentFinder.
 *
 */
public class MtctlLastSegmentFinder implements LastSegmentFinder {

	/**
	 * Returns the substring after the last occurence of delimiter in fqn
	 */
	public String getLastSegment(String fqn, char delimiter) {
		if (fqn == null || fqn.length() == 0)
			return null;
		
		return fqn.substring(fqn.lastIndexOf(delimiter)+1);
	}
	
}
