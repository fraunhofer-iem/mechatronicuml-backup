package org.muml.core.common.edit.policies;

import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gmf.runtime.notation.View;


public class NoLinksEditPolicy extends AbstractEditPolicy {
	
	private IDiagramCanonicalEditPolicy getDiagramCanonicalEditPolicy() {
		if (getHost().getRoot() != null) {
			return (IDiagramCanonicalEditPolicy) getHost().getRoot().getContents().getEditPolicy("CustomCanonical");
		}
		return null;
	}
	
	
	@Override
	public void activate() {
		String type = ((View) getHost().getModel()).getType();
		IDiagramCanonicalEditPolicy diagramCanonicalEditPolicy = getDiagramCanonicalEditPolicy();
		diagramCanonicalEditPolicy.addNoConnectionView(type);
	}
	
	@Override
	public void deactivate() {
		String type = ((View) getHost().getModel()).getType();
		IDiagramCanonicalEditPolicy diagramCanonicalEditPolicy = getDiagramCanonicalEditPolicy();
		diagramCanonicalEditPolicy.removeNoConnectionView(type);

	}
}