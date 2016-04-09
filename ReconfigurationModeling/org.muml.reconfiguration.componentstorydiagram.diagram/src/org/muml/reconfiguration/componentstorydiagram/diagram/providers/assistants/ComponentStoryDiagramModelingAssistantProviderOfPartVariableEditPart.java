/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.reconfiguration.componentstorydiagram.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes;
import org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramModelingAssistantProvider;

/**
 * @generated
 */
public class ComponentStoryDiagramModelingAssistantProviderOfPartVariableEditPart
		extends ComponentStoryDiagramModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
		types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
		return types;
	}

}
