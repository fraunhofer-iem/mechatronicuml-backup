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
package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers;

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
	public void init_StructuredComponentInstance_2015(
			de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance instance) {
		try {
			de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration newInstance_0_0 = de.uni_paderborn.fujaba.muml.instance.InstanceFactory.eINSTANCE
					.createComponentInstanceConfiguration();
			instance.setEmbeddedCIC(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(9, de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
							.getComponentInstanceConfiguration(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DiscreteSinglePortInstance_3026(
			de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(4, de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
							.getDiscreteSinglePortInstance(), null)
					.evaluate(instance);
			instance.setComponentInstance((de.uni_paderborn.fujaba.muml.instance.ComponentInstance) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StructuredComponentInstance_3025(
			de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance instance) {
		try {
			de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration newInstance_0_0 = de.uni_paderborn.fujaba.muml.instance.InstanceFactory.eINSTANCE
					.createComponentInstanceConfiguration();
			instance.setEmbeddedCIC(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.expressions.MumlOCLFactory
					.getExpression(9, de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
							.getComponentInstanceConfiguration(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
