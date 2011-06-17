package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.wizards;

import org.eclipse.gmf.runtime.notation.Diagram;

import de.uni_paderborn.fujaba.muml.common.wizard.AbstractWizard;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;

public abstract class CommonModifyWizard extends AbstractWizard {

	protected FujabaRealtimeStatechart realtimeStatechart = null;

	public CommonModifyWizard(Diagram diag) {
		super();

		this.realtimeStatechart = (FujabaRealtimeStatechart) diag.getElement();
	}

	public FujabaRealtimeStatechart getRealtimeStatechart() {
		return realtimeStatechart;
	}

	@Override
	public boolean performFinish() {

		return super.performFinish();
	}
}
