package org.storydriven.core.expressions;

import org.eclipse.emf.ecore.EObject;

public interface IExpressionLanguageGrammar {
	
	EObject parse(String text);
	
	String serialize(EObject element);
	
}
