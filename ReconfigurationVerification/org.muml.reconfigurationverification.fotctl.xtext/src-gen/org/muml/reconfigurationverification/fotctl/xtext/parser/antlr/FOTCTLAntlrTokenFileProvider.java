/*
 * generated by Xtext
 */
package org.muml.reconfigurationverification.fotctl.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FOTCTLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/muml/reconfigurationverification/fotctl/xtext/parser/antlr/internal/InternalFOTCTL.tokens");
	}
}