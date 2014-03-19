package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.UpdaterLinkDescriptor;

import de.uni_paderborn.fujaba.muml.hardware.platform.Bridge;
import de.uni_paderborn.fujaba.muml.hardware.platform.Bus;
import de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.platform.Link;
import de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.CommunicationMediaConnectedBridgesEditPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformEditPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartConnectedMediaEditPart;
/**
 * A customized EditPart for a {@link HWPlatform}.
 * This customized EditPart fixes the visualization of:
 * 		-a connection between from {@link BusPortInstance} to  a {@link Bus}
 * 		-a {@link Link} between two {@link LinkPortInstance}
 * 		-a connection between a {@link Bus} and a {@link Bridge}
 * @author adann
 *
 */
public class CustomHWPlatformEditPart extends HWPlatformEditPart {

	public CustomHWPlatformEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.policies.HWPlatformCanonicalEditPolicy(
						true) {

							@Override
							protected EditPart getSourceEditPart(
									UpdaterLinkDescriptor descriptor,
									Domain2Notation domain2NotationMap) {
								if (descriptor.getVisualID()==HWPortPartConnectedMediaEditPart.VISUAL_ID || descriptor.getVisualID()==CommunicationMediaConnectedBridgesEditPart.VISUAL_ID) {
								return null;
								}
								return super.getSourceEditPart(descriptor, domain2NotationMap);
							}
					
			
		});
	}

}
