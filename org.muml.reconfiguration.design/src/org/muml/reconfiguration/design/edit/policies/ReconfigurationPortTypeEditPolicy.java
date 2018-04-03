package org.muml.reconfiguration.design.edit.policies;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.muml.pim.common.edit.policies.ports.PortTypeEditPolicy;
import org.muml.pim.common.figures.CustomPortFigure;
import org.muml.pim.component.Port;
import org.muml.reconfiguration.ReconfigurationExecutionPort;
import org.muml.reconfiguration.ReconfigurationMessagePort;
import org.muml.reconfiguration.protocolinstantiation.BroadcastPort;

public class ReconfigurationPortTypeEditPolicy extends PortTypeEditPolicy {
	WrappingLabel fFigureReconfigurationTypeLabel = new WrappingLabel();
	

	static final Font FFIGURERECONFIGURATIONTYPELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 7, SWT.NORMAL);

	public ReconfigurationPortTypeEditPolicy() {
		fFigureReconfigurationTypeLabel.setFont(FFIGURERECONFIGURATIONTYPELABEL_FONT);
		fFigureReconfigurationTypeLabel.setAlignment(PositionConstants.CENTER | PositionConstants.MIDDLE);
	}
	
	@Override
	public void activate() {
		super.activate();
		
		Port port = getPort();
		if (port instanceof ReconfigurationExecutionPort) {
			fFigureReconfigurationTypeLabel.setText("RE");
		} else if (port instanceof ReconfigurationMessagePort) {
			fFigureReconfigurationTypeLabel.setText("RM");
		} else if (port instanceof BroadcastPort) {
			fFigureReconfigurationTypeLabel.setText("B");
		}
		
		CustomPortFigure portFigure = getPortFigure();
		if (portFigure != null) {
			portFigure.add(fFigureReconfigurationTypeLabel);
		}
	}
	
	@Override
	public void deactivate() {
		CustomPortFigure portFigure = getPortFigure();
		if (portFigure != null) {
			portFigure.remove(fFigureReconfigurationTypeLabel);
		}
		super.deactivate();
	}

}
