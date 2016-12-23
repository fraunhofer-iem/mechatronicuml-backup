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
package org.muml.pim.componentinstanceconfiguration.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes;
import org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlModelingAssistantProvider;

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfComponentInstanceConfigurationDiagramEditPart
		extends MumlModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(MumlElementTypes.HybridPortInstance_2021);
		types.add(MumlElementTypes.DiscreteSinglePortInstance_2022);
		types.add(MumlElementTypes.DiscreteMultiPortInstance_2023);
		types.add(MumlElementTypes.ContinuousPortInstance_2024);
		types.add(MumlElementTypes.AtomicComponentInstance_2016);
		types.add(MumlElementTypes.StructuredComponentInstance_2015);
		types.add(MumlElementTypes.CoordinationProtocolInstance_2025);
		return types;
	}

}
