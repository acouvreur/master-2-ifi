/**
 * generated by Xtext 2.12.0
 */
package smarthome.dsl;

import smarthome.dsl.DslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class DslStandaloneSetup extends DslStandaloneSetupGenerated {
  public static void doSetup() {
    new DslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}