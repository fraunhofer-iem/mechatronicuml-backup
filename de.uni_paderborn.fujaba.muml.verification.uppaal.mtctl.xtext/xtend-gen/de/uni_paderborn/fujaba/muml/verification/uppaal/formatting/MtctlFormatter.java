/**
 * generated by Xtext
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.formatting;

import com.google.inject.Inject;
import de.uni_paderborn.fujaba.muml.verification.uppaal.services.MtctlGrammarAccess;
import java.util.List;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.formatting.impl.FormattingConfig.LinewrapLocator;
import org.eclipse.xtext.formatting.impl.FormattingConfig.NoLinewrapLocator;
import org.eclipse.xtext.formatting.impl.FormattingConfig.NoSpaceLocator;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
@SuppressWarnings("all")
public class MtctlFormatter extends AbstractDeclarativeFormatter {
  @Inject
  @Extension
  private MtctlGrammarAccess _mtctlGrammarAccess;
  
  protected void configureFormatting(final FormattingConfig c) {
    c.setAutoLinewrap(500);
    List<Pair<Keyword,Keyword>> _findKeywordPairs = this._mtctlGrammarAccess.findKeywordPairs("[", "]");
    for (final Pair<Keyword,Keyword> pair : _findKeywordPairs) {
      {
        NoSpaceLocator _setNoSpace = c.setNoSpace();
        Keyword _second = pair.getSecond();
        _setNoSpace.before(_second);
        NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        Keyword _first = pair.getFirst();
        _setNoSpace_1.after(_first);
      }
    }
    List<Keyword> _findKeywords = this._mtctlGrammarAccess.findKeywords(",");
    for (final Keyword comma : _findKeywords) {
      NoSpaceLocator _setNoSpace = c.setNoSpace();
      _setNoSpace.before(comma);
    }
    List<Pair<Keyword,Keyword>> _findKeywordPairs_1 = this._mtctlGrammarAccess.findKeywordPairs("(", ")");
    for (final Pair<Keyword,Keyword> parentheses : _findKeywordPairs_1) {
      {
        NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        Keyword _first = parentheses.getFirst();
        _setNoSpace_1.after(_first);
        NoSpaceLocator _setNoSpace_2 = c.setNoSpace();
        Keyword _second = parentheses.getSecond();
        _setNoSpace_2.before(_second);
      }
    }
    List<Keyword> _findKeywords_1 = this._mtctlGrammarAccess.findKeywords("bufferMessageCount", "transitionFiring", "messageInBuffer", "messageInTransit", "stateInStatechart", "substateOf", "stateActive", "stateEntering", "stateExiting", "forall", "exists");
    for (final Keyword keyword : _findKeywords_1) {
      NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
      _setNoSpace_1.after(keyword);
    }
    List<Keyword> _findKeywords_2 = this._mtctlGrammarAccess.findKeywords(";");
    for (final Keyword semikolon : _findKeywords_2) {
      {
        NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        _setNoLinewrap.before(semikolon);
        NoSpaceLocator _setNoSpace_2 = c.setNoSpace();
        _setNoSpace_2.before(semikolon);
        LinewrapLocator _setLinewrap = c.setLinewrap();
        _setLinewrap.after(semikolon);
      }
    }
    TerminalRule _sL_COMMENTRule = this._mtctlGrammarAccess.getSL_COMMENTRule();
    List<RuleCall> _findRuleCalls = this._mtctlGrammarAccess.findRuleCalls(_sL_COMMENTRule);
    for (final RuleCall comment : _findRuleCalls) {
      {
        NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        _setNoLinewrap.before(comment);
        LinewrapLocator _setLinewrap = c.setLinewrap();
        _setLinewrap.after(comment);
      }
    }
  }
}
