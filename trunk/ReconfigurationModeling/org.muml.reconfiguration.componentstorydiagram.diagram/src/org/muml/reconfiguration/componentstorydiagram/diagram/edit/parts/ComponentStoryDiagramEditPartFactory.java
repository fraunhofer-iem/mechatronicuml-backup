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
package org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry;

/**
 * @generated
 */
public class ComponentStoryDiagramEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ComponentStoryDiagramVisualIDRegistry.getVisualID(view)) {

			case ComponentStoryRuleEditPart.VISUAL_ID:
				return new ComponentStoryRuleEditPart(view);

			case ActivityEditPart.VISUAL_ID:
				return new ActivityEditPart(view);

			case ActivityNameEditPart.VISUAL_ID:
				return new ActivityNameEditPart(view);

			case ComponentStoryNodeEditPart.VISUAL_ID:
				return new ComponentStoryNodeEditPart(view);

			case ComponentStoryNodeNameEditPart.VISUAL_ID:
				return new ComponentStoryNodeNameEditPart(view);

			case ComponentStoryPatternEditPart.VISUAL_ID:
				return new ComponentStoryPatternEditPart(view);

			case ComponentVariableEditPart.VISUAL_ID:
				return new ComponentVariableEditPart(view);

			case ComponentVariableOperatorEditPart.VISUAL_ID:
				return new ComponentVariableOperatorEditPart(view);

			case ComponentVariableNameEditPart.VISUAL_ID:
				return new ComponentVariableNameEditPart(view);

			case PartVariableEditPart.VISUAL_ID:
				return new PartVariableEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case MultiPortVariableEditPart.VISUAL_ID:
				return new MultiPortVariableEditPart(view);

			case PortVariableOperatorEditPart.VISUAL_ID:
				return new PortVariableOperatorEditPart(view);

			case MultiPortVariableNameEditPart.VISUAL_ID:
				return new MultiPortVariableNameEditPart(view);

			case UnderlinedLabelEditPart.VISUAL_ID:
				return new UnderlinedLabelEditPart(view);

			case SinglePortVariableEditPart.VISUAL_ID:
				return new SinglePortVariableEditPart(view);

			case SinglePortVariable2EditPart.VISUAL_ID:
				return new SinglePortVariable2EditPart(view);

			case PortVariableOperator2EditPart.VISUAL_ID:
				return new PortVariableOperator2EditPart(view);

			case SinglePortVariableNameEditPart.VISUAL_ID:
				return new SinglePortVariableNameEditPart(view);

			case UnderlinedLabel2EditPart.VISUAL_ID:
				return new UnderlinedLabel2EditPart(view);

			case MultiPortVariable2EditPart.VISUAL_ID:
				return new MultiPortVariable2EditPart(view);

			case PortVariableOperator3EditPart.VISUAL_ID:
				return new PortVariableOperator3EditPart(view);

			case MultiPortVariableName2EditPart.VISUAL_ID:
				return new MultiPortVariableName2EditPart(view);

			case UnderlinedLabel3EditPart.VISUAL_ID:
				return new UnderlinedLabel3EditPart(view);

			case SinglePortVariable3EditPart.VISUAL_ID:
				return new SinglePortVariable3EditPart(view);

			case PortVariableOperator4EditPart.VISUAL_ID:
				return new PortVariableOperator4EditPart(view);

			case SinglePortVariableName2EditPart.VISUAL_ID:
				return new SinglePortVariableName2EditPart(view);

			case UnderlinedLabel4EditPart.VISUAL_ID:
				return new UnderlinedLabel4EditPart(view);

			case InitialNodeEditPart.VISUAL_ID:
				return new InitialNodeEditPart(view);

			case JunctionNodeEditPart.VISUAL_ID:
				return new JunctionNodeEditPart(view);

			case ActivityFinalNodeEditPart.VISUAL_ID:
				return new ActivityFinalNodeEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case ControllerExchangeNodeEditPart.VISUAL_ID:
				return new ControllerExchangeNodeEditPart(view);

			case ControllerExchangeNodeNameEditPart.VISUAL_ID:
				return new ControllerExchangeNodeNameEditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case ComponentStoryPattern2EditPart.VISUAL_ID:
				return new ComponentStoryPattern2EditPart(view);

			case ComponentVariable2EditPart.VISUAL_ID:
				return new ComponentVariable2EditPart(view);

			case ComponentVariableOperator2EditPart.VISUAL_ID:
				return new ComponentVariableOperator2EditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case FadingComponentPartVariableEditPart.VISUAL_ID:
				return new FadingComponentPartVariableEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case ActivityActivityCompartmentEditPart.VISUAL_ID:
				return new ActivityActivityCompartmentEditPart(view);

			case ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID:
				return new ComponentStoryNodeComponentStoryNodeCompartmentEditPart(view);

			case ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
				return new ComponentStoryPatternComponentStoryPatternCompartmentEditPart(view);

			case ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
				return new ComponentVariableComponentVariableCompartmentEditPart(view);

			case MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
				return new MultiPortVariableMultiPortVariablesCompartmentEditPart(view);

			case MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
				return new MultiPortVariableMultiPortVariablesCompartment2EditPart(view);

			case ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart.VISUAL_ID:
				return new ControllerExchangeNodeControllerExchangeNodeFadingFunctionsCompartmentEditPart(view);

			case ComponentStoryPatternComponentStoryPatternCompartment2EditPart.VISUAL_ID:
				return new ComponentStoryPatternComponentStoryPatternCompartment2EditPart(view);

			case ComponentVariableComponentVariableCompartment2EditPart.VISUAL_ID:
				return new ComponentVariableComponentVariableCompartment2EditPart(view);

			case ActivityEdgeEditPart.VISUAL_ID:
				return new ActivityEdgeEditPart(view);

			case ActivityEdgeGuardEditPart.VISUAL_ID:
				return new ActivityEdgeGuardEditPart(view);

			case AssemblyVariableEditPart.VISUAL_ID:
				return new AssemblyVariableEditPart(view);

			case AssemblyVariableNameEditPart.VISUAL_ID:
				return new AssemblyVariableNameEditPart(view);

			case DelegationVariableEditPart.VISUAL_ID:
				return new DelegationVariableEditPart(view);

			case DelegationVariableNameEditPart.VISUAL_ID:
				return new DelegationVariableNameEditPart(view);

			case MultiPortOrderConstraintEditPart.VISUAL_ID:
				return new MultiPortOrderConstraintEditPart(view);

			case MultiPortOrderConstraintOrderConstraintTypeEditPart.VISUAL_ID:
				return new MultiPortOrderConstraintOrderConstraintTypeEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
