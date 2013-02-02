package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.initializer;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.newwizard.initializer.IModelInitializer;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;


public class RealtimeStatechartModelInitializer implements IModelInitializer {

	public RealtimeStatechartModelInitializer() {
	}

	@Override
	public boolean supports(EObject object) {
		return object instanceof RealtimeStatechart; 
	}

	@Override
	public void initialize(EObject object) {
		// create an initial state
		State state = RealtimestatechartFactory.eINSTANCE.createState();
		state.setName("init");
		state.setInitial(true);
		((RealtimeStatechart)object).getStates().add(state);
	}

}
