/*
* generated by Xtext
*/
package org.xtext.activity;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ActUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.activity.ui.internal.ActActivator.getInstance().getInjector("org.xtext.activity.Act");
	}
	
}
