package org.eclipse.capella.vp.kcvl.uml.xtext ;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport ;
 
import com.google.inject.Module ;
 
public class UmlSupport extends AbstractGenericResourceSupport
{
	@Override
	protected Module createGuiceModule() {
		return new UmlRuntimeModule() ;
	}
}
