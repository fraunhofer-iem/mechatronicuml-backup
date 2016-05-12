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
package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDModelingAssistantProvider;

/**
 * @generated
 */
public class ComponentSDDModelingAssistantProviderOfComponentStoryDecisionDiagramEditPart
		extends ComponentSDDModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ComponentSDDElementTypes.ComponentStoryPatternNode_2003);
		types.add(ComponentSDDElementTypes.LeafNode_2002);
		types.add(ComponentSDDElementTypes.InitialNode_2004);
		return types;
	}

}
