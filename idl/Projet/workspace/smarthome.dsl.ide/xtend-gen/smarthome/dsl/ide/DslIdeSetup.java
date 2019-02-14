/**
 * generated by Xtext 2.12.0
 */
package smarthome.dsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import smarthome.dsl.DslRuntimeModule;
import smarthome.dsl.DslStandaloneSetup;
import smarthome.dsl.ide.DslIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DslIdeSetup extends DslStandaloneSetup {
  @Override
  public Injector createInjector() {
    DslRuntimeModule _dslRuntimeModule = new DslRuntimeModule();
    DslIdeModule _dslIdeModule = new DslIdeModule();
    return Guice.createInjector(Modules2.mixin(_dslRuntimeModule, _dslIdeModule));
  }
}