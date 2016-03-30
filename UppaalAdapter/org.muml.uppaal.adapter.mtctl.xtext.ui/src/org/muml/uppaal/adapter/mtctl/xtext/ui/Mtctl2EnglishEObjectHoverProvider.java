package org.muml.uppaal.adapter.mtctl.xtext.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.muml.uppaal.adapter.mtctl.Expression;

/**
 * A Hover Provider that is ready for MTCTL2English
 * The most interesting thing about this is in Mtctl2EnglishEObjectDocumentationProvider
 * (which is used by the superclass of this one through some guice magic)
 */
public class Mtctl2EnglishEObjectHoverProvider extends DefaultEObjectHoverProvider {

	@Override
	protected String getFirstLine(EObject o) {
		return super.getFirstLine(o); //just the EClass name of o
		//You may want to override this in the future to provide more fancy first lines if o instanceof Expression
	}
	
	@Override
	protected boolean hasHover(EObject o) {
		return super.hasHover(o) || o instanceof Expression; //adding tooltips for Expressions
	}

}
