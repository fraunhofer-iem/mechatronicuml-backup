package org.storydriven.core.expressions.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.storydriven.core.expressions.IExpressionLanguageGrammar;

public class ExpressionUtils {

	public static final String EXPRESSION_LANGUAGES_EXTENSION_POINT_ID = "org.storydriven.core.expressionLanguagesExtension";
	public static final String EXPRESSION_LANGUAGES_GRAMMAR_ATTRIBUTE_NAME = "grammar";
	public static final String EXPRESSION_LANGUAGES_EXPRESSION_LANGUAGE_ATTRIBUTE_NAME = "expressionLanguage";
	public static final String EXPRESSION_LANGUAGES_VERSION_ATTRIBUTE_NAME = "version";
	public static final String EXPRESSION_SOURCE_VIEWER_ATTRIBUTE_NAME = "sourceViewerProvider";

	private static Map<String, Map<String, IExpressionLanguageGrammar>> expressionGrammars = null;

	private static void initialize() {
		if (expressionGrammars == null) {
			expressionGrammars = new HashMap<String, Map<String, IExpressionLanguageGrammar>>();
	
			if (Platform.getExtensionRegistry() != null) {
				IConfigurationElement[] configurationElements = Platform.getExtensionRegistry()
						.getConfigurationElementsFor(EXPRESSION_LANGUAGES_EXTENSION_POINT_ID);
	
				for (IConfigurationElement configurationElement : configurationElements) {
					String s = configurationElement.getAttribute(EXPRESSION_LANGUAGES_EXPRESSION_LANGUAGE_ATTRIBUTE_NAME);
					String v = configurationElement.getAttribute(EXPRESSION_LANGUAGES_VERSION_ATTRIBUTE_NAME);
					IExpressionLanguageGrammar g = null;
					try {
						Object grammarObject = configurationElement.createExecutableExtension(EXPRESSION_LANGUAGES_GRAMMAR_ATTRIBUTE_NAME);
						if (grammarObject instanceof IExpressionLanguageGrammar) {
							g = (IExpressionLanguageGrammar) grammarObject;
						}
					} catch (CoreException e) {
						e.printStackTrace();
					}

					if (s != null && !("".equals(s))) {
						// add language and version
						if (!expressionGrammars.containsKey(s)) {
							expressionGrammars.put(s, new HashMap<String, IExpressionLanguageGrammar>());
						}
						expressionGrammars.get(s).put(v, g);
					}
				}
			}
		}
	}

	public static int getMaximumAmountVersions() {
		initialize();
		int maximumAmountVersions = 0;
		for (Map.Entry<String, Map<String, IExpressionLanguageGrammar>> entry : expressionGrammars.entrySet()) {
			int amountVersions = entry.getValue().size();
			if (amountVersions > maximumAmountVersions) {
				maximumAmountVersions = amountVersions;
			}
		}
		return maximumAmountVersions;
	}

	public static List<String> getAvailableExpressionLanguages() {
		initialize();
		return new ArrayList<String>(expressionGrammars.keySet());
	}

	public static List<String> getAvailableExpressionLanguageVersions(String language) {
		initialize();
		if (expressionGrammars.containsKey(language)) {
			return new ArrayList<String>(expressionGrammars.get(language).keySet());
		} 
		return Collections.emptyList();
	}

	public static IExpressionLanguageGrammar getGrammar(String language, String languageVersion) {
		initialize();
		if (expressionGrammars.containsKey(language)) {
			Map<String, IExpressionLanguageGrammar> versions = expressionGrammars.get(language);
			if (versions.containsKey(languageVersion)) {
				return versions.get(languageVersion);
			}
		}
		return null;
	}

	public static int getAmountLanguages() {
		return getAvailableExpressionLanguages().size();
	}

}
