package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.opendiagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.common.edit.policies.opendiagram.AbstractOpenDiagramEditPolicy;
import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomIconFigure.ResourceType;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;

/** When double-clicking a {@link ResourceInstance} this opens a diagram file that contains the corresponding {@link ResourceType} .
 * 
 * @author adann
 *
 */
public class OpenResourceTypeDiagramEditPolicy extends
		AbstractOpenDiagramEditPolicy {


	protected EObject getDiagramDomainElement(View view) {
		EObject element = view.getElement();

		if (HwresourceinstancePackage.Literals.RESOURCE_INSTANCE.isSuperTypeOf(element
				.eClass())) {
			return ((EObject) element.eGet(HwresourceinstancePackage.Literals.RESOURCE_INSTANCE__RESOURCE_TYPE)).eContainer();
		}

		return element;
	}


	// TODO: Some of the following information can be derived using extension point in super class
	
	@Override
	protected String getDiagramKind() {
		return "Resource";
	}

	@Override
	protected String getEditorID() {
		return "de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorID";
	}

	@Override
	protected String getPluginID() {
		return "de.uni_paderborn.fujaba.muml.hardware.resource.diagram";
	}

	@Override
	protected String getDiagramFileExtension() {
		return "resource_diagram";
	}

}
