package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.UpdaterLinkDescriptor;

import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.policies.ComponentInstanceConfigurationDiagramCanonicalEditPolicy;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;

public class CustomComponentInstanceConfigurationDiagramEditPart extends
		ComponentInstanceConfigurationDiagramEditPart {

	public  CustomComponentInstanceConfigurationDiagramEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		Object feature = notification.getFeature();

		if (InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES
				.equals(feature)) {
			executeTransformation();		
			
			//update the visualization of CoordinationProtocolInstances
/*			java.util.List<org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy> editPolicies = org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy
					.getRegisteredEditPolicies(getDiagramView().getElement());
			for (org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy editPolicy : editPolicies) {
				editPolicy.refresh();
			} */
			Request refreshRequest = new Request(RequestConstants.REQ_REFRESH_CONNECTIONS);
			this.performRequest(refreshRequest);
			return;

		}
		super.handleNotificationEvent(notification);
	}
	
	
	
	private void executeTransformation() {
		EditingDomain editingDomain = getEditingDomain();
		if (editingDomain != null) {
			ComponentInstanceConfiguration cic = (ComponentInstanceConfiguration) getNotationView()
					.getElement();
			Activator.updateCoordinationProtocolInstance(editingDomain, cic);
		}
	}

}
