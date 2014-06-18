package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;

public class CustomComponentInstanceConfigurationEditPart extends
		ComponentInstanceConfigurationEditPart {

	public CustomComponentInstanceConfigurationEditPart(View view) {
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
			java.util.List<org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy> editPolicies = org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy
					.getRegisteredEditPolicies(getDiagramView().getElement());
			for (org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy editPolicy : editPolicies) {
				editPolicy.refresh();
			}

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
