/**
 * generated by Xtext
 */
package de.uni_paderborn.fujaba.muml.formatting;

import com.google.inject.Inject;
import de.uni_paderborn.fujaba.muml.services.DependencyModelLanguageGrammarAccess;
import java.util.List;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
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
public class DependencyModelLanguageFormatter extends AbstractDeclarativeFormatter {
  @Inject
  @Extension
  private DependencyModelLanguageGrammarAccess _dependencyModelLanguageGrammarAccess;
  
  @Override
  protected void configureFormatting(final FormattingConfig c) {
    List<Pair<Keyword, Keyword>> _findKeywordPairs = this._dependencyModelLanguageGrammarAccess.findKeywordPairs("(", ")");
    for (final Pair<Keyword, Keyword> pair : _findKeywordPairs) {
      {
        Keyword _first = pair.getFirst();
        Keyword _second = pair.getSecond();
        c.setIndentation(_first, _second);
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        Keyword _first_1 = pair.getFirst();
        _setNoLinewrap.after(_first_1);
        FormattingConfig.NoLinewrapLocator _setNoLinewrap_1 = c.setNoLinewrap();
        Keyword _second_1 = pair.getSecond();
        _setNoLinewrap_1.before(_second_1);
        FormattingConfig.NoLinewrapLocator _setNoLinewrap_2 = c.setNoLinewrap();
        Keyword _second_2 = pair.getSecond();
        _setNoLinewrap_2.after(_second_2);
      }
    }
    List<Pair<Keyword, Keyword>> _findKeywordPairs_1 = this._dependencyModelLanguageGrammarAccess.findKeywordPairs("{", "}");
    for (final Pair<Keyword, Keyword> pair_1 : _findKeywordPairs_1) {
      {
        Keyword _first = pair_1.getFirst();
        Keyword _second = pair_1.getSecond();
        c.setIndentation(_first, _second);
        FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap();
        Keyword _first_1 = pair_1.getFirst();
        _setLinewrap.after(_first_1);
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        Keyword _second_1 = pair_1.getSecond();
        _setNoLinewrap.before(_second_1);
        FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap();
        Keyword _second_2 = pair_1.getSecond();
        _setLinewrap_1.after(_second_2);
      }
    }
    List<Keyword> _findKeywords = this._dependencyModelLanguageGrammarAccess.findKeywords(",");
    for (final Keyword comma : _findKeywords) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        _setNoLinewrap.before(comma);
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.before(comma);
      }
    }
    List<Keyword> _findKeywords_1 = this._dependencyModelLanguageGrammarAccess.findKeywords(";");
    for (final Keyword comma_1 : _findKeywords_1) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        _setNoLinewrap.before(comma_1);
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.before(comma_1);
        FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap();
        _setLinewrap.after(comma_1);
      }
    }
    FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(0, 1, 2);
    TerminalRule _sL_COMMENTRule = this._dependencyModelLanguageGrammarAccess.getSL_COMMENTRule();
    _setLinewrap.before(_sL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap(0, 1, 2);
    TerminalRule _mL_COMMENTRule = this._dependencyModelLanguageGrammarAccess.getML_COMMENTRule();
    _setLinewrap_1.before(_mL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_2 = c.setLinewrap(0, 1, 1);
    TerminalRule _mL_COMMENTRule_1 = this._dependencyModelLanguageGrammarAccess.getML_COMMENTRule();
    _setLinewrap_2.after(_mL_COMMENTRule_1);
  }
}
