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
package org.muml.pm.hardware.platforminstance.diagram.custom.refactor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.muml.pm.hardware.common.refactor.AbstractDecoratorProvider;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class HWPlatformInstanceDecorationProvider extends AbstractDecoratorProvider implements IDecoratorProvider {

	protected static final String DECORATOR_KEY = HWPlatformInstaceDecorator.class.getSimpleName();

	public void createDecorators(IDecoratorTarget decoratorTarget) {
		Object adapter = decoratorTarget.getAdapter(EObject.class);
		if (adapter instanceof HWPlatformInstance)
			decoratorTarget.installDecorator(DECORATOR_KEY, new HWPlatformInstaceDecorator(decoratorTarget));
	}

	

}
