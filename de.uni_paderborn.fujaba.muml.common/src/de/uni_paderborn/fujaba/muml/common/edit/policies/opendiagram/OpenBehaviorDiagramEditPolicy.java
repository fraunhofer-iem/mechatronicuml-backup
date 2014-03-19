package de.uni_paderborn.fujaba.muml.common.edit.policies.opendiagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;

public class OpenBehaviorDiagramEditPolicy extends
		AbstractOpenDiagramEditPolicy {


	protected EObject getDiagramDomainElement(View view) {
		EObject element = view.getElement();

		if (BehaviorPackage.Literals.BEHAVIORAL_ELEMENT.isSuperTypeOf(element
				.eClass())) {
			return (EObject) element
					.eGet(BehaviorPackage.Literals.BEHAVIORAL_ELEMENT__BEHAVIOR);
		}

		return element;
	}


	// TODO: Some of the following information can be derived using extension point in super class
	
	@Override
	protected String getDiagramKind() {
		return "Realtimestatechart";
	}

	@Override
	protected String getEditorID() {
		return "de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorID";
	}

	@Override
	protected String getPluginID() {
		return "de.uni_paderborn.fujaba.muml.realtimestatechart.diagram";
	}

	@Override
	protected String getDiagramFileExtension() {
		return "realtimestatechart_diagram";
	}

}
