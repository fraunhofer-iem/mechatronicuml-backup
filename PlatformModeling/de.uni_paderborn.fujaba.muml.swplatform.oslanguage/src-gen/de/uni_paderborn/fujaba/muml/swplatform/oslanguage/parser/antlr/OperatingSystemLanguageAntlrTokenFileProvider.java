/*
* generated by Xtext
*/
package de.uni_paderborn.fujaba.muml.swplatform.oslanguage.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class OperatingSystemLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.tokens");
	}
}
