package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechart2EditPart;

public class CustomRealtimeStatechart2EditPart extends
		RealtimeStatechart2EditPart {
	
	private RealtimeStatechartBehavior statechartBehavior = new RealtimeStatechartBehavior();
//
	public CustomRealtimeStatechart2EditPart(View view) {
		super(view);
	}
	
	// Deactivated because we currently do not have Entry/Exit points and so the realtimestatechart does not have border items. 
	// TODO: Reactivate if we have border items again
		
//
//	@Override
//	public void activate() {
//		statechartBehavior.setEditPart(this);
//		super.activate();
//	}
//
//	@Override
//	public void deactivate() {
//		statechartBehavior.setEditPart(null);
//		super.deactivate();
//	}
//
//	@Override
//	protected boolean addFixedChild(EditPart childEditPart) {
//		boolean result = super.addFixedChild(childEditPart);
//		statechartBehavior.afterAddFixedChild(childEditPart);
//		return result;
//	}
}
