package de.uni_paderborn.fujaba.muml.testlanguage.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.TestLanguageEditPartFactory;

public class TestLanguageEditPartFactoryOverride extends
		TestLanguageEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
					.getVisualID(view)) {
			case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.NodeNodeFigureCompartmentEditPart.VISUAL_ID:
				return new NodeNodeFigureCompartmentEditPartOverride(view);
			case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.NodeEditPart.VISUAL_ID:
				return new NodeEditPartOverride(view);
			case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.InputEditPart.VISUAL_ID:
				return new InputEditPartOverride(view);
			case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputEditPart.VISUAL_ID:
				return new OutputEditPartOverride(view);
			case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputTargetsEditPart.VISUAL_ID:
				return new OutputTargetsEditPartOverride(view);
			case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.NodeLabelEditPart.VISUAL_ID:
				return new NodeLabelEditPartOverride(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
