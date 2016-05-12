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
package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry;

/**
 * @generated
 */
public class ComponentSDDEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ComponentSDDVisualIDRegistry.getVisualID(view)) {

			case ComponentStoryDecisionDiagramEditPart.VISUAL_ID:
				return new ComponentStoryDecisionDiagramEditPart(view);

			case ComponentStoryPatternNodeEditPart.VISUAL_ID:
				return new ComponentStoryPatternNodeEditPart(view);

			case ComponentStoryPatternNodeNameEditPart.VISUAL_ID:
				return new ComponentStoryPatternNodeNameEditPart(view);

			case ComponentStoryPatternNodeTypeEditPart.VISUAL_ID:
				return new ComponentStoryPatternNodeTypeEditPart(view);

			case LeafNodeEditPart.VISUAL_ID:
				return new LeafNodeEditPart(view);

			case InitialNodeEditPart.VISUAL_ID:
				return new InitialNodeEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

			case ComponentStoryPatternEditPart.VISUAL_ID:
				return new ComponentStoryPatternEditPart(view);

			case ComponentVariableEditPart.VISUAL_ID:
				return new ComponentVariableEditPart(view);

			case ComponentVariableOperatorEditPart.VISUAL_ID:
				return new ComponentVariableOperatorEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case ComponentPartVariableEditPart.VISUAL_ID:
				return new ComponentPartVariableEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

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

			case FadingComponentPartVariableEditPart.VISUAL_ID:
				return new FadingComponentPartVariableEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case ComponentStoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
				return new ComponentStoryPatternNodePatternNodeContentCompartmentEditPart(view);

			case ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
				return new ComponentStoryPatternComponentStoryPatternCompartmentEditPart(view);

			case ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
				return new ComponentVariableComponentVariableCompartmentEditPart(view);

			case MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
				return new MultiPortVariableMultiPortVariablesCompartmentEditPart(view);

			case MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
				return new MultiPortVariableMultiPortVariablesCompartment2EditPart(view);

			case EdgeEditPart.VISUAL_ID:
				return new EdgeEditPart(view);

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

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

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
