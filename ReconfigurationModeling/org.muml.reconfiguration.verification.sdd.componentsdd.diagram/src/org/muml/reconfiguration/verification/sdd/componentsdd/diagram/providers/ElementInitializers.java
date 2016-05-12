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
package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers;

import org.muml.pim.component.AssemblyConnector;
import org.muml.pim.component.DelegationConnector;
import org.muml.reconfiguration.ReconfigurableComponent;
import org.muml.reconfiguration.componentstorypattern.AssemblyVariable;
import org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern;
import org.muml.reconfiguration.componentstorypattern.ComponentVariable;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternFactory;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.reconfiguration.componentstorypattern.DelegationVariable;
import org.muml.reconfiguration.verification.sdd.componentsdd.ComponentStoryPatternNode;
import org.muml.reconfiguration.verification.sdd.componentsdd.ComponentsddPackage;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.expressions.ComponentSDDAbstractExpression;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.expressions.ComponentSDDOCLFactory;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin;
import org.muml.storydiagram.patterns.BindingSemantics;
import org.muml.storydiagram.patterns.BindingState;
import org.muml.storydiagram.patterns.PatternsPackage;

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
	public void init_ComponentStoryPatternNode_2003(ComponentStoryPatternNode instance) {
		try {
			ComponentStoryPattern newInstance_0_0 = ComponentstorypatternFactory.eINSTANCE
					.createComponentStoryPattern();
			instance.setPattern(newInstance_0_0);
			Object value_0_0_0 = ComponentSDDOCLFactory
					.getExpression(0, ComponentstorypatternPackage.eINSTANCE.getComponentStoryPattern(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			ComponentVariable newInstance_0_0_1_0 = ComponentstorypatternFactory.eINSTANCE.createComponentVariable();
			newInstance_0_0.setThisVariable(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = ComponentSDDOCLFactory
					.getExpression(1, ComponentstorypatternPackage.eINSTANCE.getComponentVariable(), null)
					.evaluate(newInstance_0_0_1_0);
			newInstance_0_0_1_0.setName((String) value_0_0_1_0_0);
			Object value_0_0_1_0_1 = ComponentSDDOCLFactory
					.getExpression(2, ComponentstorypatternPackage.eINSTANCE.getComponentVariable(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_1 = ComponentSDDAbstractExpression.performCast(value_0_0_1_0_1,
					PatternsPackage.eINSTANCE.getBindingState());
			newInstance_0_0_1_0.setBindingState((BindingState) value_0_0_1_0_1);
			Object value_0_0_1_0_2 = ComponentSDDOCLFactory
					.getExpression(3, ComponentstorypatternPackage.eINSTANCE.getComponentVariable(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_2 = ComponentSDDAbstractExpression.performCast(value_0_0_1_0_2,
					PatternsPackage.eINSTANCE.getBindingSemantics());
			newInstance_0_0_1_0.setBindingSemantics((BindingSemantics) value_0_0_1_0_2);
			Object value_0_0_1_0_3 = ComponentSDDOCLFactory
					.getExpression(4, ComponentstorypatternPackage.eINSTANCE.getComponentVariable(), null)
					.evaluate(newInstance_0_0_1_0);
			newInstance_0_0_1_0.setType((ReconfigurableComponent) value_0_0_1_0_3);

			Object value_1 = ComponentSDDOCLFactory
					.getExpression(5, ComponentsddPackage.eINSTANCE.getComponentStoryPatternNode(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			ComponentSDDDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_AssemblyVariable_4002(AssemblyVariable instance) {
		try {
			Object value_0 = ComponentSDDOCLFactory
					.getExpression(17, ComponentstorypatternPackage.eINSTANCE.getAssemblyVariable(), null)
					.evaluate(instance);
			instance.setType((AssemblyConnector) value_0);
		} catch (RuntimeException e) {
			ComponentSDDDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_DelegationVariable_4003(DelegationVariable instance) {
		try {
			Object value_0 = ComponentSDDOCLFactory
					.getExpression(20, ComponentstorypatternPackage.eINSTANCE.getDelegationVariable(), null)
					.evaluate(instance);
			instance.setType((DelegationConnector) value_0);
		} catch (RuntimeException e) {
			ComponentSDDDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ComponentSDDDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ComponentSDDDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
