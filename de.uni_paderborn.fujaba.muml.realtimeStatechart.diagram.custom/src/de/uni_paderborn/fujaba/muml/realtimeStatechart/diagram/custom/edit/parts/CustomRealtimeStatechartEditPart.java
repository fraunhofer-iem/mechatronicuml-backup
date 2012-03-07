package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart;

public class CustomRealtimeStatechartEditPart extends
		RealtimeStatechartEditPart {
	private RealtimeStatechartBehavior statechartBehavior = new RealtimeStatechartBehavior();

	public CustomRealtimeStatechartEditPart(View view) {
		super(view);
	}

	@Override
	public void activate() {
		statechartBehavior.setEditPart(this);
		super.activate();
	}

	@Override
	public void deactivate() {
		statechartBehavior.setEditPart(null);
		super.deactivate();
	}

	@Override
	protected boolean addFixedChild(EditPart childEditPart) {
		boolean result = super.addFixedChild(childEditPart);
		statechartBehavior.afterAddFixedChild(childEditPart);
		return result;
	}
}
