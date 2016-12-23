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
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes;
import org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlModelingAssistantProvider;

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfContinuousPortInstance2EditPart extends MumlModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ContinuousPortInstance2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ContinuousPortInstance2EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MumlElementTypes.AssemblyConnectorInstance_4001);
		types.add(MumlElementTypes.DelegationConnectorInstance_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ContinuousPortInstance2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ContinuousPortInstance2EditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof HybridPortInstanceEditPart) {
			types.add(MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof DiscreteSinglePortInstanceEditPart) {
			types.add(MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof DiscreteMultiPortInstanceEditPart) {
			types.add(MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof ContinuousPortInstanceEditPart) {
			types.add(MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof DiscreteSinglePortInstance2EditPart) {
			types.add(MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof HybridPortInstance2EditPart) {
			types.add(MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof DiscreteSinglePortInstance3EditPart) {
			types.add(MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof DiscreteMultiPortInstance2EditPart) {
			types.add(MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof ContinuousPortInstance2EditPart) {
			types.add(MumlElementTypes.AssemblyConnectorInstance_4001);
		}
		if (targetEditPart instanceof HybridPortInstanceEditPart) {
			types.add(MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof DiscreteSinglePortInstanceEditPart) {
			types.add(MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof DiscreteMultiPortInstanceEditPart) {
			types.add(MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof ContinuousPortInstanceEditPart) {
			types.add(MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof DiscreteSinglePortInstance2EditPart) {
			types.add(MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof HybridPortInstance2EditPart) {
			types.add(MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof DiscreteSinglePortInstance3EditPart) {
			types.add(MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof DiscreteMultiPortInstance2EditPart) {
			types.add(MumlElementTypes.DelegationConnectorInstance_4002);
		}
		if (targetEditPart instanceof ContinuousPortInstance2EditPart) {
			types.add(MumlElementTypes.DelegationConnectorInstance_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ContinuousPortInstance2EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ContinuousPortInstance2EditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MumlElementTypes.AssemblyConnectorInstance_4001) {
			types.add(MumlElementTypes.HybridPortInstance_2021);
			types.add(MumlElementTypes.DiscreteSinglePortInstance_2022);
			types.add(MumlElementTypes.DiscreteMultiPortInstance_2023);
			types.add(MumlElementTypes.ContinuousPortInstance_2024);
			types.add(MumlElementTypes.DiscreteSinglePortInstance_3026);
			types.add(MumlElementTypes.HybridPortInstance_3031);
			types.add(MumlElementTypes.DiscreteSinglePortInstance_3032);
			types.add(MumlElementTypes.DiscreteMultiPortInstance_3033);
			types.add(MumlElementTypes.ContinuousPortInstance_3034);
		} else if (relationshipType == MumlElementTypes.DelegationConnectorInstance_4002) {
			types.add(MumlElementTypes.HybridPortInstance_2021);
			types.add(MumlElementTypes.DiscreteSinglePortInstance_2022);
			types.add(MumlElementTypes.DiscreteMultiPortInstance_2023);
			types.add(MumlElementTypes.ContinuousPortInstance_2024);
			types.add(MumlElementTypes.DiscreteSinglePortInstance_3026);
			types.add(MumlElementTypes.HybridPortInstance_3031);
			types.add(MumlElementTypes.DiscreteSinglePortInstance_3032);
			types.add(MumlElementTypes.DiscreteMultiPortInstance_3033);
			types.add(MumlElementTypes.ContinuousPortInstance_3034);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ContinuousPortInstance2EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ContinuousPortInstance2EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(MumlElementTypes.AssemblyConnectorInstance_4001);
		types.add(MumlElementTypes.DelegationConnectorInstance_4002);
		types.add(MumlElementTypes.CoordinationProtocolInstancePortInstances_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ContinuousPortInstance2EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ContinuousPortInstance2EditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MumlElementTypes.AssemblyConnectorInstance_4001) {
			types.add(MumlElementTypes.HybridPortInstance_2021);
			types.add(MumlElementTypes.DiscreteSinglePortInstance_2022);
			types.add(MumlElementTypes.DiscreteMultiPortInstance_2023);
			types.add(MumlElementTypes.ContinuousPortInstance_2024);
			types.add(MumlElementTypes.DiscreteSinglePortInstance_3026);
			types.add(MumlElementTypes.HybridPortInstance_3031);
			types.add(MumlElementTypes.DiscreteSinglePortInstance_3032);
			types.add(MumlElementTypes.DiscreteMultiPortInstance_3033);
			types.add(MumlElementTypes.ContinuousPortInstance_3034);
		} else if (relationshipType == MumlElementTypes.DelegationConnectorInstance_4002) {
			types.add(MumlElementTypes.HybridPortInstance_2021);
			types.add(MumlElementTypes.DiscreteSinglePortInstance_2022);
			types.add(MumlElementTypes.DiscreteMultiPortInstance_2023);
			types.add(MumlElementTypes.ContinuousPortInstance_2024);
			types.add(MumlElementTypes.DiscreteSinglePortInstance_3026);
			types.add(MumlElementTypes.HybridPortInstance_3031);
			types.add(MumlElementTypes.DiscreteSinglePortInstance_3032);
			types.add(MumlElementTypes.DiscreteMultiPortInstance_3033);
			types.add(MumlElementTypes.ContinuousPortInstance_3034);
		} else if (relationshipType == MumlElementTypes.CoordinationProtocolInstancePortInstances_4003) {
			types.add(MumlElementTypes.CoordinationProtocolInstance_2025);
			types.add(MumlElementTypes.CoordinationProtocolInstance_3035);
		}
		return types;
	}

}
