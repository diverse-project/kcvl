package fr.inria.diverse.kcvl.uml.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

public class ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

   @Override
   protected Bundle getBundle() {
	   Activator v = Activator.getDefault();
	   System.out.println("v="+v);
	   Bundle b = v.getBundle() ;
	   System.out.println("b="+b);
       return b;
   }

   @Override
   protected Injector getInjector() {
       return Activator.getDefault().getInjector();
   }

}
