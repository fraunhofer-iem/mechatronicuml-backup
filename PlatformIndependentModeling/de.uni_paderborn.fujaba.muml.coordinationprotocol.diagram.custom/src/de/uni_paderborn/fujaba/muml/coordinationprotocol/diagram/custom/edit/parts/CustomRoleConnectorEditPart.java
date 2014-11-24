package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom.edit.parts;

import java.util.Iterator;
import java.util.List;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart;

/**
 * This class overrides the activate-method in order to refresh the editpart, so
 * that the connecting edge between the RoleConnector and the ConnectorQualityOfServiceAssumptions is displayed when a coordination protocol is created
 * 
 * 
 * @author sthiele2
 */
public class CustomRoleConnectorEditPart extends RoleConnectorEditPart {

	public CustomRoleConnectorEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		super.activate();
		List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
				.getRegisteredEditPolicies(this.getDiagramView().getElement());
		for (Iterator<CanonicalEditPolicy> it = editPolicies.iterator(); it
				.hasNext();) {
			CanonicalEditPolicy nextEditPolicy = it.next();
			nextEditPolicy.refresh();
		}
	}

}
