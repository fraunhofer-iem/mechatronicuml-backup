package org.storydriven.core.expressions;

import com.google.inject.Injector;

public interface IExpressionLanguageXtextGrammar extends IExpressionLanguageGrammar {
	Injector getXtextInjector();
}
