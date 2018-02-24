package org.muml.pim.realtimestatechart.design.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.CreateDecoratorsOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;

public class MyDecoratorProvider extends AbstractProvider implements IDecoratorProvider {

	public MyDecoratorProvider() {
		
	}
	
	public void createDecorators(IDecoratorTarget decoratorTarget) {
//		View view = decoratorTarget.getAdapter(View.class);
//		if (view instanceof Node) {
//			Node node = (Node) view;
//			if (node.getLayoutConstraint() instanceof Bounds) {
//				Bounds bounds = (Bounds) node.getLayoutConstraint();
//				bounds.setHeight(20);
//			}
//		}
	}

	public boolean provides(IOperation operation) {
		if (operation instanceof CreateDecoratorsOperation) {
			IDecoratorTarget decorationTarget = ((CreateDecoratorsOperation) operation).getDecoratorTarget();
			View view = decorationTarget.getAdapter(View.class);
			if ("3009".equals(view.getType())) {
				if (view.getElement() instanceof DRepresentationElement) {
					EObject target = ((DRepresentationElement)view.getElement()).getTarget();
					if (target.eClass().getEPackage() == RealtimestatechartPackage.eINSTANCE) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
