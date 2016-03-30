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
package org.muml.pim.component.diagram.providers;

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
	public void init_StaticAtomicComponent_2006(org.muml.pim.component.StaticAtomicComponent instance) {
		try {
			Object value_0 = org.muml.pim.component.diagram.expressions.MumlOCLFactory.getExpression(13,
					org.muml.pim.component.ComponentPackage.eINSTANCE.getStaticAtomicComponent(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_StaticStructuredComponent_2005(
			org.muml.pim.component.StaticStructuredComponent instance) {
		try {
			Object value_0 = org.muml.pim.component.diagram.expressions.MumlOCLFactory.getExpression(14,
					org.muml.pim.component.ComponentPackage.eINSTANCE.getStaticStructuredComponent(),
					null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DiscretePort_3010(org.muml.pim.component.DiscretePort instance) {
		try {
			org.muml.pim.valuetype.Cardinality newInstance_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = org.muml.pim.component.diagram.expressions.MumlOCLFactory
					.getExpression(0,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_0_0);

			value_0_0_0_0_0 = org.muml.pim.component.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = org.muml.pim.component.diagram.expressions.MumlOCLFactory
					.getExpression(1,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_0 = org.muml.pim.component.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

			Object value_1 = org.muml.pim.component.diagram.expressions.MumlOCLFactory
					.getExpression(15,
							org.muml.pim.component.ComponentPackage.eINSTANCE.getDiscretePort(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_ContinuousPort_3011(org.muml.pim.component.ContinuousPort instance) {
		try {
			Object value_0 = org.muml.pim.component.diagram.expressions.MumlOCLFactory
					.getExpression(16,
							org.muml.pim.component.ComponentPackage.eINSTANCE.getContinuousPort(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_HybridPort_3013(org.muml.pim.component.HybridPort instance) {
		try {
			Object value_0 = org.muml.pim.component.diagram.expressions.MumlOCLFactory
					.getExpression(17,
							org.muml.pim.component.ComponentPackage.eINSTANCE.getHybridPort(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ComponentPart_3012(org.muml.pim.component.ComponentPart instance) {
		try {
			org.muml.pim.valuetype.Cardinality newInstance_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_0_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = org.muml.pim.component.diagram.expressions.MumlOCLFactory
					.getExpression(5,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_0_0);

			value_0_0_0_0_0 = org.muml.pim.component.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			org.muml.pim.valuetype.NaturalNumber newInstance_0_0_1_0 = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = org.muml.pim.component.diagram.expressions.MumlOCLFactory
					.getExpression(6,
							org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_0 = org.muml.pim.component.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

			Object value_1 = org.muml.pim.component.diagram.expressions.MumlOCLFactory
					.getExpression(18,
							org.muml.pim.component.ComponentPackage.eINSTANCE.getComponentPart(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
