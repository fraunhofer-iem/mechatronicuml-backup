package org.muml.uppaal.adapter.mtctl.xtext.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultHoverDocumentationProvider;
import org.muml.uppaal.adapter.mtctl.Expression;
import org.muml.uppaal.adapter.mtctl.Property;
import org.muml.uppaal.adapter.mtctl.english.Mtctl2English;

/**
 * A Documentation Provider that shows MTCTL2English tooltips.
 */
public class Mtctl2EnglishEObjectDocumentationProvider extends DefaultHoverDocumentationProvider {

	Mtctl2English translator = new Mtctl2English();
	
	@Override
	public String getDocumentation(EObject o) {
		//First try super. Typically, this returns null. If not, there might be a good reason
		String superDoc = super.getDocumentation(o);
		if (superDoc != null)
			return superDoc;
		
		try {
			if (o instanceof Expression) {
				return "<b>This Part of the Property</b>: <br/>"+translator.expr((Expression) o, true).toString()
						+ "<br/><br/><b>Complete Property:</b><br/>"+translator.serializeProperty(getRootProperty((Expression) o));
			}
		} catch (RuntimeException e) {
			//No worries. This is expected. Simply don't show the tooltip/second line.
		}
		return null;
	}
	
	/**
	 * Returns the mtctl property this expression is part of
	 */
	private Property getRootProperty(Expression expr) {
		EObject tmp = expr;
		do {
			tmp = tmp.eContainer();
		} while (tmp != null && !(tmp instanceof Property));
		
		return (Property) tmp;
	}

}
