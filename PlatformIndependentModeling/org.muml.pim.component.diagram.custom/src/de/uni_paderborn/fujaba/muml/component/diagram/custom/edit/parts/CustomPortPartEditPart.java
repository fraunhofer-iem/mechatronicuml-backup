package de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.component.PortPart;
import de.uni_paderborn.fujaba.muml.component.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;

public class CustomPortPartEditPart extends PortPartEditPart {

	public CustomPortPartEditPart(View view) {
		super(view);
	}

	@Override
	protected void doCanonicalRefresh() {
		// DO NOTHING TO PREVENT PROBLEMS
	}


}
