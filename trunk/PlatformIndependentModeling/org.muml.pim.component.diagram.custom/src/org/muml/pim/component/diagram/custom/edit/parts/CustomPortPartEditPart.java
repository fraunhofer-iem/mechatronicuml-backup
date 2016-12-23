package org.muml.pim.component.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.component.PortPart;
import org.muml.pim.component.diagram.custom.part.Activator;
import org.muml.pim.component.diagram.edit.parts.PortPartEditPart;
import org.muml.pim.connector.ConnectorPackage;

public class CustomPortPartEditPart extends PortPartEditPart {

	public CustomPortPartEditPart(View view) {
		super(view);
	}

	@Override
	protected void doCanonicalRefresh() {
		// DO NOTHING TO PREVENT PROBLEMS
	}


}
