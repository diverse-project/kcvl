/*
* generated by Xtext
*/
package fr.inria.diverse.kcvl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class KCVLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("fr/inria/diverse/kcvl/parser/antlr/internal/InternalKCVL.tokens");
	}
}