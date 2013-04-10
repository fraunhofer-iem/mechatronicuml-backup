package de.uni_paderborn.fujaba.muml.actionlanguage.interpreter.test;

import java.util.HashSet;

import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.actionlanguage.Block;
import de.uni_paderborn.fujaba.muml.actionlanguage.interpreter.ActionLanguageInterpreter;
import de.uni_paderborn.fujaba.muml.runtime.VariableBinding;

public class TestableActionLanguageInterpreter extends
		ActionLanguageInterpreter {

	public TestableActionLanguageInterpreter() {
		super();
	}

	public Object evaluate(HashSet<VariableBinding> variableBindings, Expression expression) {
		return super.evaluate(variableBindings, expression);
	}

}
