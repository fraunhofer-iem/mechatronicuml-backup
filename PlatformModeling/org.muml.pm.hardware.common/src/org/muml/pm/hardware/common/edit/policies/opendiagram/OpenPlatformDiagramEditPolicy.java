package org.muml.pm.hardware.common.edit.policies.opendiagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.core.common.edit.policies.opendiagram.AbstractOpenDiagramEditPolicy;
import org.muml.pm.hardware.hwplatform.HWPlatform;
import org.muml.pm.hardware.hwplatform.HWPlatformPart;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;

/** When double-clicking a {@link HWPlatformPart} this opens a diagram file that contains the corresponding {@link HWPlatform}.
 * 
 * @author adann
 *
 */
public class OpenPlatformDiagramEditPolicy extends
		AbstractOpenDiagramEditPolicy {


	protected EObject getDiagramDomainElement(View view) {
		EObject element = view.getElement();

		if (HwplatformPackage.Literals.HW_PLATFORM_PART.isSuperTypeOf(element
				.eClass())) {
			return ((EObject) element.eGet(HwplatformPackage.Literals.HW_PLATFORM_PART__HWPLATFORM_TYPE));
		}

		return element;
	}


	// TODO: Some of the following information can be derived using extension point in super class
	
	@Override
	protected String getDiagramKind() {
		return "Platform";
	}

	@Override
	protected String getEditorID() {
		return "org.muml.pm.hardware.platform.diagram.part.HardwareDiagramEditorID";
	}

	@Override
	protected String getPluginID() {
		return "org.muml.pm.hardware.platform.diagram";
	}

	@Override
	protected String getDiagramFileExtension() {
		return "platform_diagram";
	}

}
