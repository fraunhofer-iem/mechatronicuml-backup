/*
 * generated by Xtext
 */
package org.muml.psm.api.apimappinglanguage.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.muml.psm.api.apimappinglanguage.xtext.services.APIMappingLanguageGrammarAccess;

public class APIMappingLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private APIMappingLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.muml.psm.api.apimappinglanguage.xtext.parser.antlr.internal.InternalAPIMappingLanguageParser createParser(XtextTokenStream stream) {
		return new org.muml.psm.api.apimappinglanguage.xtext.parser.antlr.internal.InternalAPIMappingLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "MappingRepository";
	}
	
	public APIMappingLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(APIMappingLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
