
/*
 * generated by Xtext
 */
 
package org.xtext.lrm.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class MultiplosdestinosExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.xtext.lrm.ui.internal.MultiplosdestinosActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.xtext.lrm.ui.internal.MultiplosdestinosActivator.getInstance().getInjector("org.xtext.lrm.Multiplosdestinos");
	}
	
}
