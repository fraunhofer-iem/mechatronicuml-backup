package org.muml.pim.realtimestatechart.diagram.custom.initializer;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.modelinstance.ui.initializer.IModelInitializer;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.State;


public class RealtimeStatechartModelInitializer implements IModelInitializer {

	public RealtimeStatechartModelInitializer() {
	}

	@Override
	public boolean supports(EObject object) {
		return object instanceof RealtimeStatechart; 
	}

	@Override
	public void initialize(EObject object) {
		((RealtimeStatechart)object).setName("statechart");
		
		// create an initial state
		State state = RealtimestatechartFactory.eINSTANCE.createState();
		state.setName("init");
		state.setInitial(true);
		((RealtimeStatechart)object).getStates().add(state);
	}

}
