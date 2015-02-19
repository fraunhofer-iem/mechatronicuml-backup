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
package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfContinuousPortInstanceEditPart
		extends
		de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.HybridPortInstance_2021);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_2022);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_2023);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ContinuousPortInstance_2024);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3026);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.HybridPortInstance_3031);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3032);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_3033);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ContinuousPortInstance_3034);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.HybridPortInstance_2021);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_2022);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_2023);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ContinuousPortInstance_2024);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3026);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.HybridPortInstance_3031);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3032);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_3033);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ContinuousPortInstance_3034);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.CoordinationProtocolInstancePortInstances_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.HybridPortInstance_2021);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_2022);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_2023);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ContinuousPortInstance_2024);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3026);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.HybridPortInstance_3031);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3032);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_3033);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ContinuousPortInstance_3034);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.HybridPortInstance_2021);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_2022);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_2023);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ContinuousPortInstance_2024);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3026);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.HybridPortInstance_3031);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3032);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_3033);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ContinuousPortInstance_3034);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.CoordinationProtocolInstancePortInstances_4003) {
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.CoordinationProtocolInstance_2025);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.CoordinationProtocolInstance_3035);
		}
		return types;
	}

}
