package de.uni_paderborn.fujaba.common.edit.policies;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.widgets.Display;

public class CanonicalRefreshEditPolicy extends org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy {


		@Override
		public void activate() {
			
			super.activate();
			Display.getCurrent().asyncExec(new Runnable() {
				@Override
				public void run() {
					EObject diagramElement = getDiagramElement();
					List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
							.getRegisteredEditPolicies(diagramElement);
					for (Iterator<CanonicalEditPolicy> it = editPolicies.iterator(); it
							.hasNext();) {
						CanonicalEditPolicy nextEditPolicy = it.next();
						nextEditPolicy.refresh();
					}
				}
			});
		}

		protected EObject getDiagramElement() {
			if (getHost().getRoot() == null || getHost().getRoot().getContents() == null) {
				return null;
			} 
			View view = (View) getHost().getRoot().getContents().getModel();
			if (view == null) {
				return null;
			}
			EObject diagramElement = null;
			if (view.getDiagram() != null) {
				diagramElement = view.getDiagram().getElement();
			}
			return diagramElement;
		}

		@Override
		protected List getSemanticChildrenList() {		
			return Collections.EMPTY_LIST;
		}
}
