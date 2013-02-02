package de.uni_paderborn.fujaba.muml.structuredcomponent.diagram.custom.edit.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.structuredcomponent.diagram.edit.parts.WrappingLabel3EditPart;

public class CustomRolePatternEditPart extends WrappingLabel3EditPart {

	public CustomRolePatternEditPart(View view) {
		super(view);
	}

	/**
	 * ExpressionLabelMapping needs semantic element as self-element to use for
	 * parsing, which is not correctly resolved. Because our Connector does not
	 * have a class, Connector.getElement() returns null. We use the source
	 * element.
	 */
	@Override
	public EObject resolveSemanticElement() {
		Connector con = (Connector) getNotationView().eContainer();
		return con.getSource().getElement();
	}

}
