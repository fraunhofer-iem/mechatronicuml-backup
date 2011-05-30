package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.wizards;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.common.wizard.AbstractWizard;

public abstract class CommonModifyWizard  extends AbstractWizard {

	protected FujabaRealtimeStatechart realtimeStatechart = null;

	public CommonModifyWizard(org.eclipse.gmf.runtime.notation.impl.DiagramImpl diag)
	{
		super();

		this.realtimeStatechart = (FujabaRealtimeStatechart)diag.getElement();
	}
	
	public FujabaRealtimeStatechart getRealtimeStatechart() {
		return realtimeStatechart;
	}
	
	@Override
	public boolean performFinish() {
		
		return super.performFinish();
	}
}
