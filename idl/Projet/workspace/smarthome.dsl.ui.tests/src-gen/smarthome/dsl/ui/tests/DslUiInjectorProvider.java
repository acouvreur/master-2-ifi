/*
 * generated by Xtext 2.12.0
 */
package smarthome.dsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import smarthome.dsl.ui.internal.DslActivator;

public class DslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("smarthome.dsl.Dsl");
	}

}