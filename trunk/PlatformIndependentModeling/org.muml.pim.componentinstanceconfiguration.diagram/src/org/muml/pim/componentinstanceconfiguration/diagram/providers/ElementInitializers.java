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

import org.muml.pim.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory;
import org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin;
import org.muml.pim.instance.AtomicComponentInstance;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.ContinuousPortInstance;
import org.muml.pim.instance.CoordinationProtocolInstance;
import org.muml.pim.instance.DiscreteMultiPortInstance;
import org.muml.pim.instance.DiscreteSinglePortInstance;
import org.muml.pim.instance.HybridPortInstance;
import org.muml.pim.instance.InstanceFactory;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.StructuredComponentInstance;

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
	public void init_HybridPortInstance_2021(HybridPortInstance instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(14, InstancePackage.eINSTANCE.getHybridPortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	* @generated
	*/
	public void init_DiscreteSinglePortInstance_2022(DiscreteSinglePortInstance instance) {
		try {
			Object value_0 = MumlOCLFactory
					.getExpression(15, InstancePackage.eINSTANCE.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	* @generated
	*/
	public void init_DiscreteMultiPortInstance_2023(DiscreteMultiPortInstance instance) {
		try {
			Object value_0 = MumlOCLFactory
					.getExpression(16, InstancePackage.eINSTANCE.getDiscreteMultiPortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	* @generated
	*/
	public void init_ContinuousPortInstance_2024(ContinuousPortInstance instance) {
		try {
			Object value_0 = MumlOCLFactory
					.getExpression(17, InstancePackage.eINSTANCE.getContinuousPortInstance(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	* @generated
	*/
	public void init_AtomicComponentInstance_2016(AtomicComponentInstance instance) {
		try {
			Object value_0 = MumlOCLFactory
					.getExpression(18, InstancePackage.eINSTANCE.getAtomicComponentInstance(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	* @generated
	*/
	public void init_StructuredComponentInstance_2015(StructuredComponentInstance instance) {
		try {
			ComponentInstanceConfiguration newInstance_0_0 = InstanceFactory.eINSTANCE
					.createComponentInstanceConfiguration();
			instance.setEmbeddedCIC(newInstance_0_0);
			Object value_0_0_0 = MumlOCLFactory
					.getExpression(9, InstancePackage.eINSTANCE.getComponentInstanceConfiguration(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

			Object value_1 = MumlOCLFactory
					.getExpression(19, InstancePackage.eINSTANCE.getStructuredComponentInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	* @generated
	*/
	public void init_CoordinationProtocolInstance_2025(CoordinationProtocolInstance instance) {
		try {
			Object value_0 = MumlOCLFactory
					.getExpression(20, InstancePackage.eINSTANCE.getCoordinationProtocolInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	* @generated
	*/
	public void init_DiscreteSinglePortInstance_3026(DiscreteSinglePortInstance instance) {
		try {
			Object value_0 = MumlOCLFactory
					.getExpression(4, InstancePackage.eINSTANCE.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setComponentInstance((ComponentInstance) value_0);
			Object value_1 = MumlOCLFactory
					.getExpression(21, InstancePackage.eINSTANCE.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	* @generated
	*/
	public void init_HybridPortInstance_3031(HybridPortInstance instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(22, InstancePackage.eINSTANCE.getHybridPortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	* @generated
	*/
	public void init_DiscreteSinglePortInstance_3032(DiscreteSinglePortInstance instance) {
		try {
			Object value_0 = MumlOCLFactory
					.getExpression(23, InstancePackage.eINSTANCE.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	* @generated
	*/
	public void init_DiscreteMultiPortInstance_3033(DiscreteMultiPortInstance instance) {
		try {
			Object value_0 = MumlOCLFactory
					.getExpression(24, InstancePackage.eINSTANCE.getDiscreteMultiPortInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	* @generated
	*/
	public void init_ContinuousPortInstance_3034(ContinuousPortInstance instance) {
		try {
			Object value_0 = MumlOCLFactory
					.getExpression(25, InstancePackage.eINSTANCE.getContinuousPortInstance(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	* @generated
	*/
	public void init_ComponentInstanceConfiguration_3023(ComponentInstanceConfiguration instance) {
		try {
			Object value_0 = MumlOCLFactory
					.getExpression(26, InstancePackage.eINSTANCE.getComponentInstanceConfiguration(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	* @generated
	*/
	public void init_AtomicComponentInstance_3024(AtomicComponentInstance instance) {
		try {
			Object value_0 = MumlOCLFactory
					.getExpression(27, InstancePackage.eINSTANCE.getAtomicComponentInstance(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	* @generated
	*/
	public void init_StructuredComponentInstance_3025(StructuredComponentInstance instance) {
		try {
			ComponentInstanceConfiguration newInstance_0_0 = InstanceFactory.eINSTANCE
					.createComponentInstanceConfiguration();
			instance.setEmbeddedCIC(newInstance_0_0);
			Object value_0_0_0 = MumlOCLFactory
					.getExpression(9, InstancePackage.eINSTANCE.getComponentInstanceConfiguration(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

			Object value_1 = MumlOCLFactory
					.getExpression(28, InstancePackage.eINSTANCE.getStructuredComponentInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	* @generated
	*/
	public void init_CoordinationProtocolInstance_3035(CoordinationProtocolInstance instance) {
		try {
			Object value_0 = MumlOCLFactory
					.getExpression(29, InstancePackage.eINSTANCE.getCoordinationProtocolInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().logError("Element initialization failed", //$NON-NLS-1$
					e);
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
