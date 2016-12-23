package org.muml.uppaal.adapter.mtctl.xtext.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * Configures highlighting for mtctl according to the classification provided by MtctlTokenToAttributeIdMapper
 *
 */
public class MtctlHighlightingConfiguration extends DefaultHighlightingConfiguration {
	public static final String TEMPORAL_QUANTIFIER_ID = "temporalQuant";
	public static final String LOGIC_ID = "logic";
	public static final String PREDICATE_ID = "predicate";
	public static final String IDENT_ID = "ident";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(TEMPORAL_QUANTIFIER_ID, "Temporal Quantifiers", temporalQuantifierTextStyle());
		acceptor.acceptDefaultHighlighting(LOGIC_ID, "Logic Operators", logicTextStyle());
		acceptor.acceptDefaultHighlighting(IDENT_ID, "Identifiers", identTextStyle());
		acceptor.acceptDefaultHighlighting(PREDICATE_ID, "Special Predicates", specialPredicateText());
	}

	public TextStyle temporalQuantifierTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 0, 192));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
		
	public TextStyle logicTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 0, 85));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	@Override
	public TextStyle keywordTextStyle() { //override keywords to not look too special by default
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	
	public TextStyle identTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		//textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	
	public TextStyle specialPredicateText() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 0, 85));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
}
