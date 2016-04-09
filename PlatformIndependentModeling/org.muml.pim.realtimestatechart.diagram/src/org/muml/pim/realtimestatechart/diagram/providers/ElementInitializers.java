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
import org.muml.pim.realtimestatechart.Action;
import org.muml.pim.realtimestatechart.DoEvent;
import org.muml.pim.realtimestatechart.EntryPoint;
import org.muml.pim.realtimestatechart.ExitPoint;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.SynchronizationChannel;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.diagram.expressions.MumlAbstractExpression;
import org.muml.pim.realtimestatechart.diagram.expressions.MumlOCLFactory;
import org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin;

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
	public void init_RealtimeStatechart_2007(RealtimeStatechart instance) {
		try {
			Object value_0 = MumlOCLFactory
					.getExpression(19, RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_State_3032(State instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(20, RealtimestatechartPackage.eINSTANCE.getState(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_DoEvent_3034(DoEvent instance) {
		try {
			Action newInstance_0_0 = RealtimestatechartFactory.eINSTANCE.createAction();
			instance.setAction(newInstance_0_0);
			Object value_0_0_0 = MumlOCLFactory.getExpression(1, RealtimestatechartPackage.eINSTANCE.getAction(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

		} catch (RuntimeException e) {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_SynchronizationChannel_3037(SynchronizationChannel instance) {
		try {
			Object value_0 = MumlOCLFactory
					.getExpression(21, RealtimestatechartPackage.eINSTANCE.getSynchronizationChannel(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Region_3042(Region instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(6, RealtimestatechartPackage.eINSTANCE.getRegion(), null)
					.evaluate(instance);

			value_0 = MumlAbstractExpression.performCast(value_0, EcorePackage.eINSTANCE.getEInt());
			instance.setPriority(((Integer) value_0).intValue());
			RealtimeStatechart newInstance_1_0 = RealtimestatechartFactory.eINSTANCE.createRealtimeStatechart();
			instance.setEmbeddedStatechart(newInstance_1_0);
			Object value_1_0_0 = MumlOCLFactory
					.getExpression(7, RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart(), null)
					.evaluate(newInstance_1_0);
			newInstance_1_0.setName((String) value_1_0_0);
			State newInstance_1_0_1_0 = RealtimestatechartFactory.eINSTANCE.createState();
			newInstance_1_0.getStates().add(newInstance_1_0_1_0);
			Object value_1_0_1_0_0 = MumlOCLFactory
					.getExpression(8, RealtimestatechartPackage.eINSTANCE.getState(), null)
					.evaluate(newInstance_1_0_1_0);
			newInstance_1_0_1_0.setName((String) value_1_0_1_0_0);
			Object value_1_0_1_0_1 = MumlOCLFactory
					.getExpression(9, RealtimestatechartPackage.eINSTANCE.getState(), null)
					.evaluate(newInstance_1_0_1_0);
			newInstance_1_0_1_0.setInitial(((Boolean) value_1_0_1_0_1).booleanValue());

		} catch (RuntimeException e) {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_RealtimeStatechart_3043(RealtimeStatechart instance) {
		try {
			State newInstance_0_0 = RealtimestatechartFactory.eINSTANCE.createState();
			instance.getStates().add(newInstance_0_0);
			Object value_0_0_0 = MumlOCLFactory.getExpression(10, RealtimestatechartPackage.eINSTANCE.getState(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			Object value_0_0_1 = MumlOCLFactory.getExpression(11, RealtimestatechartPackage.eINSTANCE.getState(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setInitial(((Boolean) value_0_0_1).booleanValue());

			Object value_1 = MumlOCLFactory
					.getExpression(22, RealtimestatechartPackage.eINSTANCE.getRealtimeStatechart(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_EntryPoint_3040(EntryPoint instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(23, RealtimestatechartPackage.eINSTANCE.getEntryPoint(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_ExitPoint_3041(ExitPoint instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(24, RealtimestatechartPackage.eINSTANCE.getExitPoint(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Transition_4003(Transition instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(15, RealtimestatechartPackage.eINSTANCE.getTransition(), null)
					.evaluate(instance);

			value_0 = MumlAbstractExpression.performCast(value_0, EcorePackage.eINSTANCE.getEInt());
			instance.setPriority(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = RealtimestatechartDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			RealtimestatechartDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
