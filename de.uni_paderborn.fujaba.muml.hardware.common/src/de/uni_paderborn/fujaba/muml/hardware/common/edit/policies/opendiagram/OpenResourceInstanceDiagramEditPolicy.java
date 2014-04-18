package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.opendiagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.edit.policies.opendiagram.AbstractOpenDiagramEditPolicy;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;

/** When double-clicking a {@link ResourceInstancePart} this opens a diagram file that contains the corresponding {@link ResourceInstance}.
 * 
 * @author adann
 *
 */
public class OpenResourceInstanceDiagramEditPolicy extends
		AbstractOpenDiagramEditPolicy {


	protected EObject getDiagramDomainElement(View view) {
		EObject element = view.getElement();

		if (HwplatformPackage.Literals.RESOURCE_PART.isSuperTypeOf(element
				.eClass())) {
			return ((EObject) element.eGet(HwplatformPackage.Literals.RESOURCE_PART__RESOURCE_TYPE)).eContainer();
		}

		return element;
	}


	// TODO: Some of the following information can be derived using extension point in super class
	
	@Override
	protected String getDiagramKind() {
		return "Resourceinstance";
	}

	@Override
	protected String getEditorID() {
		return "de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareDiagramEditorID";
	}

	@Override
	protected String getPluginID() {
		return "de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram";
	}

	@Override
	protected String getDiagramFileExtension() {
		return "resourceinstance_diagram";
	}

}
