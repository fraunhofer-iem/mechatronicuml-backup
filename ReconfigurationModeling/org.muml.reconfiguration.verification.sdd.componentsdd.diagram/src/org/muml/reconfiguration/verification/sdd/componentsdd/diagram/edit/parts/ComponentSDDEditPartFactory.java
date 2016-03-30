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
			switch (org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry
					.getVisualID(view)) {

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeNameEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeNameEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeTypeEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeTypeEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.InitialNodeEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel9EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel10EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableOperatorEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableOperatorEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentPartVariableEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentPartVariableEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel6EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperatorEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperatorEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableNameEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableNameEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabelEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabelEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator2EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator2EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableNameEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableNameEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabel2EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabel2EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator3EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator3EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableName2EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableName2EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabel3EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabel3EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator4EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator4EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableName2EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableName2EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabel4EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.UnderlinedLabel4EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.FadingComponentPartVariableEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.FadingComponentPartVariableEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel5EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel7EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartmentEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableMultiPortVariablesCompartment2EditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableNameEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableNameEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableNameEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableNameEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortOrderConstraintEditPart(
						view);

			case org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel8EditPart(
						view);

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
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
