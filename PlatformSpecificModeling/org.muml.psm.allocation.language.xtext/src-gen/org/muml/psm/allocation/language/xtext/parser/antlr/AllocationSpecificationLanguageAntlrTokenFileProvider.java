/*
 * generated by Xtext
 */
package org.muml.psm.allocation.language.xtext.parser.antlr;

import java.io.InputStream;

import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AllocationSpecificationLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/muml/psm/allocation/language/xtext/parser/antlr/internal/InternalAllocationSpecificationLanguage.tokens");
	}
}
