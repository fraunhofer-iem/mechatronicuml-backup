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
package org.muml.pim.realtimestatechart.diagram.providers;

import org.eclipse.emf.ecore.EcorePackage;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public void init_RealtimeStatechart_2007(
			org.muml.pim.realtimestatechart.RealtimeStatechart instance) {
		try {
			Object value_0 = org.muml.pim.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(19,
							org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getRealtimeStatechart(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_State_3032(org.muml.pim.realtimestatechart.State instance) {
		try {
			Object value_0 = org.muml.pim.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(20,
							org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DoEvent_3034(org.muml.pim.realtimestatechart.DoEvent instance) {
		try {
			org.muml.pim.realtimestatechart.Action newInstance_0_0 = org.muml.pim.realtimestatechart.RealtimestatechartFactory.eINSTANCE
					.createAction();
			instance.setAction(newInstance_0_0);
			Object value_0_0_0 = org.muml.pim.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(1,
							org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getAction(),
							null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

		} catch (RuntimeException e) {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_SynchronizationChannel_3037(
			org.muml.pim.realtimestatechart.SynchronizationChannel instance) {
		try {
			Object value_0 = org.muml.pim.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(21,
							org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getSynchronizationChannel(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Region_3042(org.muml.pim.realtimestatechart.Region instance) {
		try {
			Object value_0 = org.muml.pim.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(6,
							org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getRegion(),
							null)
					.evaluate(instance);

			value_0 = org.muml.pim.realtimestatechart.diagram.expressions.MumlAbstractExpression
					.performCast(value_0, EcorePackage.eINSTANCE.getEInt());
			instance.setPriority(((Integer) value_0).intValue());
			org.muml.pim.realtimestatechart.RealtimeStatechart newInstance_1_0 = org.muml.pim.realtimestatechart.RealtimestatechartFactory.eINSTANCE
					.createRealtimeStatechart();
			instance.setEmbeddedStatechart(newInstance_1_0);
			Object value_1_0_0 = org.muml.pim.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(7,
							org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getRealtimeStatechart(),
							null)
					.evaluate(newInstance_1_0);
			newInstance_1_0.setName((String) value_1_0_0);
			org.muml.pim.realtimestatechart.State newInstance_1_0_1_0 = org.muml.pim.realtimestatechart.RealtimestatechartFactory.eINSTANCE
					.createState();
			newInstance_1_0.getStates().add(newInstance_1_0_1_0);
			Object value_1_0_1_0_0 = org.muml.pim.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(8,
							org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(),
							null)
					.evaluate(newInstance_1_0_1_0);
			newInstance_1_0_1_0.setName((String) value_1_0_1_0_0);
			Object value_1_0_1_0_1 = org.muml.pim.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(9,
							org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(),
							null)
					.evaluate(newInstance_1_0_1_0);
			newInstance_1_0_1_0.setInitial(((Boolean) value_1_0_1_0_1).booleanValue());

		} catch (RuntimeException e) {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_RealtimeStatechart_3043(
			org.muml.pim.realtimestatechart.RealtimeStatechart instance) {
		try {
			org.muml.pim.realtimestatechart.State newInstance_0_0 = org.muml.pim.realtimestatechart.RealtimestatechartFactory.eINSTANCE
					.createState();
			instance.getStates().add(newInstance_0_0);
			Object value_0_0_0 = org.muml.pim.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(10,
							org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(),
							null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			Object value_0_0_1 = org.muml.pim.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(11,
							org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getState(),
							null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setInitial(((Boolean) value_0_0_1).booleanValue());

			Object value_1 = org.muml.pim.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(22,
							org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getRealtimeStatechart(),
							null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_EntryPoint_3040(org.muml.pim.realtimestatechart.EntryPoint instance) {
		try {
			Object value_0 = org.muml.pim.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(23,
							org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getEntryPoint(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_ExitPoint_3041(org.muml.pim.realtimestatechart.ExitPoint instance) {
		try {
			Object value_0 = org.muml.pim.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(24,
							org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getExitPoint(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Transition_4003(org.muml.pim.realtimestatechart.Transition instance) {
		try {
			Object value_0 = org.muml.pim.realtimestatechart.diagram.expressions.MumlOCLFactory
					.getExpression(15,
							org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
									.getTransition(),
							null)
					.evaluate(instance);

			value_0 = org.muml.pim.realtimestatechart.diagram.expressions.MumlAbstractExpression
					.performCast(value_0, EcorePackage.eINSTANCE.getEInt());
			instance.setPriority(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
