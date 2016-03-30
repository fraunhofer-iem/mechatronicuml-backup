package org.muml.uppaal.adapter.mtctl.xtext.ui;

import java.util.Arrays;
import java.util.regex.Pattern;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

/**
 * Classifies mtctl tokens for syntax coloring (which is defined in MtctlHighlightingConfiguration)
 *
 */
public class MtctlTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	private static final Pattern LOGIC = Pattern.compile("^'(and|or|not|implies|forall|exists)'$", Pattern.MULTILINE);
	private static final Pattern SPECIAL_PREDICATES = Pattern.compile("^'(deadlock|bufferOverflow|true|false)'$", Pattern.MULTILINE);
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		
		if(Arrays.asList(new String[] {"'AG'", "'AF'", "'A<>'", "'A[]'","'EG'", "'EF'", "'E<>'", "'E[]'", "'leadsTo'", "'timeInterval'"}).contains(tokenName))
			return MtctlHighlightingConfiguration.TEMPORAL_QUANTIFIER_ID;
				
		if (LOGIC.matcher(tokenName).matches())
			return MtctlHighlightingConfiguration.LOGIC_ID;
		
		if (SPECIAL_PREDICATES.matcher(tokenName).matches())
			return MtctlHighlightingConfiguration.PREDICATE_ID;
		
		if ("RULE_ID".equals(tokenName))
			return MtctlHighlightingConfiguration.IDENT_ID;
		
		return super.calculateId(tokenName, tokenType);
	}

}
