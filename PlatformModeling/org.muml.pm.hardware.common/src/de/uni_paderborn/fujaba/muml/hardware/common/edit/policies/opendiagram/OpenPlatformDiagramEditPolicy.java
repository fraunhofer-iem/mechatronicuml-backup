package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.opendiagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.common.edit.policies.opendiagram.AbstractOpenDiagramEditPolicy;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;

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
		return "de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareDiagramEditorID";
	}

	@Override
	protected String getPluginID() {
		return "de.uni_paderborn.fujaba.muml.hardware.platform.diagram";
	}

	@Override
	protected String getDiagramFileExtension() {
		return "platform_diagram";
	}

}
