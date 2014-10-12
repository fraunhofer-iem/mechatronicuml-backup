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
package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers;

import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.BindingState;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

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
	public void init_ComponentStoryPatternNode_2003(
			de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryPatternNode instance) {
		try {
			de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern newInstance_0_0 = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternFactory.eINSTANCE
					.createComponentStoryPattern();
			instance.setPattern(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.expressions.ComponentSDDOCLFactory
					.getExpression(
							0,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentStoryPattern(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternFactory.eINSTANCE
					.createComponentVariable();
			newInstance_0_0.setThisVariable(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.expressions.ComponentSDDOCLFactory
					.getExpression(
							1,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);
			newInstance_0_0_1_0.setName((String) value_0_0_1_0_0);
			Object value_0_0_1_0_1 = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.expressions.ComponentSDDOCLFactory
					.getExpression(
							2,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_1 = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.expressions.ComponentSDDAbstractExpression
					.performCast(value_0_0_1_0_1,
							PatternsPackage.eINSTANCE.getBindingState());
			newInstance_0_0_1_0.setBindingState((BindingState) value_0_0_1_0_1);
			Object value_0_0_1_0_2 = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.expressions.ComponentSDDOCLFactory
					.getExpression(
							3,
							de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
									.getComponentVariable(), null).evaluate(
							newInstance_0_0_1_0);

			value_0_0_1_0_2 = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.expressions.ComponentSDDAbstractExpression
					.performCast(value_0_0_1_0_2,
							PatternsPackage.eINSTANCE.getBindingSemantics());
			newInstance_0_0_1_0
					.setBindingSemantics((BindingSemantics) value_0_0_1_0_2);

			Object value_1 = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.expressions.ComponentSDDOCLFactory
					.getExpression(
							4,
							de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage.eINSTANCE
									.getComponentStoryPatternNode(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
