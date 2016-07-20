package org.eclipse.capella.vp.kcvl.capella.xtext ;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport ;
 
import com.google.inject.Module ;
 
public class CapellaSupport extends AbstractGenericResourceSupport
{
	@Override
	protected Module createGuiceModule() {
		return new CapellaRuntimeModule() ;
	}
}
