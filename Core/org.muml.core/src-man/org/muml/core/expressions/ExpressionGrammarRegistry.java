package org.muml.core.expressions;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.muml.core.expressions.grammar.IExpressionGrammar;

public class ExpressionGrammarRegistry {
	public static String EXTENSION_POINT_ID = "org.muml.core.expressionGrammar";

	public static ExpressionGrammarRegistry INSTANCE = new ExpressionGrammarRegistry();

	private Map<String, IExpressionGrammar> grammarMap = null;

	private ExpressionGrammarRegistry() {
	}

	public IExpressionGrammar getGrammar(String name) {
		getGrammarMap();
		if (grammarMap.containsKey(name)) {
			return grammarMap.get(name);
		}
		return null;
	}

	public Map<String, IExpressionGrammar> getGrammarMap() {
		if (grammarMap == null) {
			grammarMap = new HashMap<String, IExpressionGrammar>();
			IConfigurationElement[] config = Platform.getExtensionRegistry()
					.getConfigurationElementsFor(EXTENSION_POINT_ID);
			for (IConfigurationElement configElement : config) {
				IConfigurationElement[] children = configElement.getChildren("grammar");
				for (IConfigurationElement child : children) {

					// Read implementation
					Object implementation = null;
					try {
						implementation = child.createExecutableExtension("implementation");
					} catch (CoreException e1) {
						e1.printStackTrace();
					}

					// Cast to IExpressionGrammar, get name and put into map
					if (implementation instanceof IExpressionGrammar) {
						IExpressionGrammar grammar = (IExpressionGrammar) implementation;
						NameReader nameReader = new NameReader(grammar);
						SafeRunner.run(nameReader);
						String name = nameReader.getName();
						if (name != null) {
							grammarMap.put(name, grammar);
						}
					}
				}
			}
		}
		return grammarMap;
	}

	
	private class NameReader implements ISafeRunnable {
		private String name = null;
		private IExpressionGrammar grammar;
		public NameReader(IExpressionGrammar grammar) {
			this.grammar = grammar;
		}
		@Override
		public void handleException(Throwable e) {
			e.printStackTrace();
		}

		@Override
		public void run() throws Exception {
			this.name = grammar.getName();
		}
		
		public String getName() {
			return name;
		}
	}
	
}
