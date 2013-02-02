package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel6EditPart;

/**
 * The WrappingLabel for SynchronizationChannels.
 * 
 * @author bingo
 * 
 */
public class CustomWrappingLabel6EditPart extends WrappingLabel6EditPart {

	public CustomWrappingLabel6EditPart(View view) {
		super(view);
	}

	@Override
	protected void addSemanticListeners() {
		super.addSemanticListeners();

		SynchronizationChannel synchronizationChannel = (SynchronizationChannel) resolveSemanticElement();

		addListenerFilter(
				"ParentSemanticElement", this, synchronizationChannel.getState());//$NON-NLS-1$
	}

}
