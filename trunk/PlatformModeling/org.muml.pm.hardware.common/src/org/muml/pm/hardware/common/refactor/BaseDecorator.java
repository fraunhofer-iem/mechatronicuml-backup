/**
 * Copyright (c) 2011 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.muml.pm.hardware.common.refactor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.AbstractDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public abstract class BaseDecorator extends AbstractDecorator {

	private IGraphicalEditPart gep;

	private EObject semanticElement;

	private NotificationListener notificationListener = new NotificationListener() {

		public void notifyChanged(Notification notification) {
			refresh();
		}
	};

	public BaseDecorator(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget);
		gep = (IGraphicalEditPart) getDecoratorTarget().getAdapter(IGraphicalEditPart.class);
		semanticElement = gep.resolveSemanticElement();

	}

	public void activate() {
		DiagramEventBroker.getInstance(gep.getEditingDomain()).addNotificationListener(semanticElement,
				notificationListener);
		DiagramEventBroker.getInstance(gep.getEditingDomain()).addNotificationListener(gep.getNotationView(),
				notificationListener);
	}

	public void deactivate() {
		removeDecoration();
		IGraphicalEditPart gepDec = (IGraphicalEditPart) getDecoratorTarget().getAdapter(IGraphicalEditPart.class);
		assert gepDec != null;

		DiagramEventBroker.getInstance(gepDec.getEditingDomain()).removeNotificationListener(semanticElement,
				notificationListener);
		DiagramEventBroker.getInstance(gepDec.getEditingDomain()).removeNotificationListener(gepDec.getNotationView(),
				notificationListener);
	}

}
