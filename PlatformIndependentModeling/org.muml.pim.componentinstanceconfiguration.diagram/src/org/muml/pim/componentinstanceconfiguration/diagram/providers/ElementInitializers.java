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
package org.muml.pim.componentinstanceconfiguration.diagram.providers;

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
	public void init_HybridPortInstance_2021(org.muml.pim.instance.HybridPortInstance instance) {
		try {
			Object value_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(14,
							org.muml.pim.instance.InstancePackage.eINSTANCE.getHybridPortInstance(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_DiscreteSinglePortInstance_2022(
			org.muml.pim.instance.DiscreteSinglePortInstance instance) {
		try {
			Object value_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(15, org.muml.pim.instance.InstancePackage.eINSTANCE
							.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_DiscreteMultiPortInstance_2023(
			org.muml.pim.instance.DiscreteMultiPortInstance instance) {
		try {
			Object value_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(16, org.muml.pim.instance.InstancePackage.eINSTANCE
							.getDiscreteMultiPortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_ContinuousPortInstance_2024(
			org.muml.pim.instance.ContinuousPortInstance instance) {
		try {
			Object value_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(17,
							org.muml.pim.instance.InstancePackage.eINSTANCE.getContinuousPortInstance(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_AtomicComponentInstance_2016(
			org.muml.pim.instance.AtomicComponentInstance instance) {
		try {
			Object value_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(18, org.muml.pim.instance.InstancePackage.eINSTANCE
							.getAtomicComponentInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StructuredComponentInstance_2015(
			org.muml.pim.instance.StructuredComponentInstance instance) {
		try {
			org.muml.pim.instance.ComponentInstanceConfiguration newInstance_0_0 = org.muml.pim.instance.InstanceFactory.eINSTANCE
					.createComponentInstanceConfiguration();
			instance.setEmbeddedCIC(newInstance_0_0);
			Object value_0_0_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(9, org.muml.pim.instance.InstancePackage.eINSTANCE
							.getComponentInstanceConfiguration(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

			Object value_1 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(19, org.muml.pim.instance.InstancePackage.eINSTANCE
							.getStructuredComponentInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_CoordinationProtocolInstance_2025(
			org.muml.pim.instance.CoordinationProtocolInstance instance) {
		try {
			Object value_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(20, org.muml.pim.instance.InstancePackage.eINSTANCE
							.getCoordinationProtocolInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DiscreteSinglePortInstance_3026(
			org.muml.pim.instance.DiscreteSinglePortInstance instance) {
		try {
			Object value_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(4, org.muml.pim.instance.InstancePackage.eINSTANCE
							.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setComponentInstance((org.muml.pim.instance.ComponentInstance) value_0);
			Object value_1 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(21, org.muml.pim.instance.InstancePackage.eINSTANCE
							.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_HybridPortInstance_3031(org.muml.pim.instance.HybridPortInstance instance) {
		try {
			Object value_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(22,
							org.muml.pim.instance.InstancePackage.eINSTANCE.getHybridPortInstance(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_DiscreteSinglePortInstance_3032(
			org.muml.pim.instance.DiscreteSinglePortInstance instance) {
		try {
			Object value_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(23, org.muml.pim.instance.InstancePackage.eINSTANCE
							.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_DiscreteMultiPortInstance_3033(
			org.muml.pim.instance.DiscreteMultiPortInstance instance) {
		try {
			Object value_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(24, org.muml.pim.instance.InstancePackage.eINSTANCE
							.getDiscreteMultiPortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_ContinuousPortInstance_3034(
			org.muml.pim.instance.ContinuousPortInstance instance) {
		try {
			Object value_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(25,
							org.muml.pim.instance.InstancePackage.eINSTANCE.getContinuousPortInstance(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_ComponentInstanceConfiguration_3023(
			org.muml.pim.instance.ComponentInstanceConfiguration instance) {
		try {
			Object value_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(26, org.muml.pim.instance.InstancePackage.eINSTANCE
							.getComponentInstanceConfiguration(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_AtomicComponentInstance_3024(
			org.muml.pim.instance.AtomicComponentInstance instance) {
		try {
			Object value_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(27, org.muml.pim.instance.InstancePackage.eINSTANCE
							.getAtomicComponentInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StructuredComponentInstance_3025(
			org.muml.pim.instance.StructuredComponentInstance instance) {
		try {
			org.muml.pim.instance.ComponentInstanceConfiguration newInstance_0_0 = org.muml.pim.instance.InstanceFactory.eINSTANCE
					.createComponentInstanceConfiguration();
			instance.setEmbeddedCIC(newInstance_0_0);
			Object value_0_0_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(9, org.muml.pim.instance.InstancePackage.eINSTANCE
							.getComponentInstanceConfiguration(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

			Object value_1 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(28, org.muml.pim.instance.InstancePackage.eINSTANCE
							.getStructuredComponentInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_CoordinationProtocolInstance_3035(
			org.muml.pim.instance.CoordinationProtocolInstance instance) {
		try {
			Object value_0 = org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(29, org.muml.pim.instance.InstancePackage.eINSTANCE
							.getCoordinationProtocolInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
