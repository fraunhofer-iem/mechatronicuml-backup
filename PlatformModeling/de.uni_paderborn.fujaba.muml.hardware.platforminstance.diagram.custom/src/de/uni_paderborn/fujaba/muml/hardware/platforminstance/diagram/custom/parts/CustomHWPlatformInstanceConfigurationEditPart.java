package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.UpdaterLinkDescriptor;

import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart;

public class CustomHWPlatformInstanceConfigurationEditPart extends HWPlatformInstanceConfigurationEditPart{

	public CustomHWPlatformInstanceConfigurationEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}
/*
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies.HWPlatformInstanceConfigurationCanonicalEditPolicy(
						true) {

							@Override
							protected EditPart getSourceEditPart(
									UpdaterLinkDescriptor descriptor,
									Domain2Notation domain2NotationMap) {
								if (descriptor.getVisualID()==HWPortInstanceConnectedMediaEditPart.VISUAL_ID ) {
								return null;
								}
								return super.getSourceEditPart(descriptor, domain2NotationMap);
							}
					
			
		});
	} */
}
