/*
 * generated by Xtext
 */
package org.muml.graphviz.dot.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.muml.graphviz.dot.xtext.services.DotLanguageGrammarAccess;

public class DotLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DotLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.muml.graphviz.dot.xtext.parser.antlr.internal.InternalDotLanguageParser createParser(XtextTokenStream stream) {
		return new org.muml.graphviz.dot.xtext.parser.antlr.internal.InternalDotLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "DotGraph";
	}
	
	public DotLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DotLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}