/*
* generated by Xtext
*/
package de.uni_paderborn.fujaba.muml.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import de.uni_paderborn.fujaba.muml.services.ActionLanguageGrammarAccess;

public class ActionLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ActionLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected de.uni_paderborn.fujaba.muml.parser.antlr.internal.InternalActionLanguageParser createParser(XtextTokenStream stream) {
		return new de.uni_paderborn.fujaba.muml.parser.antlr.internal.InternalActionLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Entry";
	}
	
	public ActionLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ActionLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
