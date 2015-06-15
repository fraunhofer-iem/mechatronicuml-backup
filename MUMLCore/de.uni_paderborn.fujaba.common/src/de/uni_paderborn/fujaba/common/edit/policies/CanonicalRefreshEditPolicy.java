package de.uni_paderborn.fujaba.common.edit.policies;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
					Diagram diagramView = ((View) getHost().getRoot().getContents().getModel()).getDiagram();
					List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
							.getRegisteredEditPolicies(diagramView.getElement());
					for (Iterator<CanonicalEditPolicy> it = editPolicies.iterator(); it
							.hasNext();) {
						CanonicalEditPolicy nextEditPolicy = it.next();
						nextEditPolicy.refresh();
					}
				}
			});
		}

		@Override
		protected List getSemanticChildrenList() {		
			return Collections.EMPTY_LIST;
		}
}
