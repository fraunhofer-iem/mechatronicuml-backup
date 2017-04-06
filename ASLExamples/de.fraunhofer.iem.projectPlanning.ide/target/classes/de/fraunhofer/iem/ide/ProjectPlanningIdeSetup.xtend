/*
 * generated by Xtext 2.11.0
 */
package de.fraunhofer.iem.ide

import com.google.inject.Guice
import de.fraunhofer.iem.ProjectPlanningRuntimeModule
import de.fraunhofer.iem.ProjectPlanningStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ProjectPlanningIdeSetup extends ProjectPlanningStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ProjectPlanningRuntimeModule, new ProjectPlanningIdeModule))
	}
	
}