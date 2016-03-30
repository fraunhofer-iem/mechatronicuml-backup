package org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart;

public class CustomCoordinationProtocolInstanceEditPart extends
		CoordinationProtocolInstanceEditPart {

	static final Font BOLD_FONT = new Font(Display.getCurrent(), Display
			.getDefault().getSystemFont().getFontData()[0].getName(), 9,
			SWT.BOLD);

	public CustomCoordinationProtocolInstanceEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected IFigure createNodeShape() {
		return primaryShape = new CustomCoordinationProtocolFigure();
	}

	public class CustomCoordinationProtocolFigure extends
			CoordinationProtocolFigure {

		public CustomCoordinationProtocolFigure() {
			super();
			this.getFigureCoordinationProtocolNameFigure().setTextUnderline(
					true);
			this.getFigureCoordinationProtocolNameFigure().setFont(BOLD_FONT);

		}
	}
}
