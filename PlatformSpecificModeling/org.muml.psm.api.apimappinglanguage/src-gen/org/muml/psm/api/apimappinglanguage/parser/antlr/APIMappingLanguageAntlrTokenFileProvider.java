/*
 * generated by Xtext
 */
package org.muml.psm.api.apimappinglanguage.parser.antlr;

import java.io.InputStream;

import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class APIMappingLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.tokens");
	}
}