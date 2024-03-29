
/*
 * generated by Xtext
 */
package org.xtext.lrm.ui.internal;

import org.apache.log4j.Logger;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;

import java.util.Map;
import java.util.HashMap;

/**
 * Generated
 */
public class MultiplosdestinosActivator extends AbstractUIPlugin {

	private Map<String,Injector> injectors = new HashMap<String,Injector>();
	private static MultiplosdestinosActivator INSTANCE;

	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		try {
			
			injectors.put("org.xtext.lrm.Multiplosdestinos", Guice.createInjector(
				Modules.override(Modules.override(getRuntimeModule("org.xtext.lrm.Multiplosdestinos")).with(getUiModule("org.xtext.lrm.Multiplosdestinos"))).with(getSharedStateModule())
			));
			
		} catch (Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}
	
	public static MultiplosdestinosActivator getInstance() {
		return INSTANCE;
	}
	
	protected Module getRuntimeModule(String grammar) {
		
		if ("org.xtext.lrm.Multiplosdestinos".equals(grammar)) {
		  return new org.xtext.lrm.MultiplosdestinosRuntimeModule();
		}
		
		throw new IllegalArgumentException(grammar);
	}
	protected Module getUiModule(String grammar) {
		
		if ("org.xtext.lrm.Multiplosdestinos".equals(grammar)) {
		  return new org.xtext.lrm.ui.MultiplosdestinosUiModule(this);
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new org.eclipse.xtext.ui.shared.SharedStateModule();
	}
	
}
