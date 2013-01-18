package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.geometry.Dimension;

public class RealtimeStatechartBehavior extends BorderItemContainerBehavior {

	public static final Dimension DEFAULT_BORDER_ITEM_OFFSET = new Dimension(
			12, 12);

	@Override
	protected Dimension getTopLeftOffset() {
		return DEFAULT_BORDER_ITEM_OFFSET;
	}

	@Override
	protected Dimension getBottomRightOffset() {
		return DEFAULT_BORDER_ITEM_OFFSET;
	}

}
