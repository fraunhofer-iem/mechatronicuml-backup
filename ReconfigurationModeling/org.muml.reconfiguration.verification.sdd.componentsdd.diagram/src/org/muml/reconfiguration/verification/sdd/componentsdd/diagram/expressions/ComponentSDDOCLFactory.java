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
package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.expressions;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.options.ParsingOptions;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.utilities.OCLHelper;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin;

/**
 * @generated
 */
public class ComponentSDDOCLFactory {

	/**
	 * @generated
	 */
	private final ComponentSDDAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected ComponentSDDOCLFactory() {
		this.expressions = new ComponentSDDAbstractExpression[24];
		this.expressionBodies = new String[] { "\'componentStoryPattern\'", //$NON-NLS-1$
				"\'this\'", //$NON-NLS-1$
				"storydiagram::patterns::BindingState::BOUND", //$NON-NLS-1$
				"storydiagram::patterns::BindingSemantics::MANDATORY", //$NON-NLS-1$
				"let\r\n\t--couldn\'t get ->closure() working. Nicer Implementation would be something like: self->closure(eContainer())->select(oclIsTypeOf(componentsdd::ComponentStoryDecisionDiagram))\r\n\tcompStoryRule : componentsdd::ComponentStoryDecisionDiagram = self.eContainer().eContainer().eContainer().oclAsType(componentsdd::ComponentStoryDecisionDiagram)\r\nin\r\n\tif\r\n\t\tnot compStoryRule.reconfigurableComponent.oclIsUndefined()\r\n\tthen\r\n\t\tcompStoryRule.reconfigurableComponent\r\n\telse\r\n\t\tnull\r\n\tendif", //$NON-NLS-1$
				"\'componentStoryPatternNode\'", //$NON-NLS-1$
				"if\r\n\tself.bindingState = storydiagram::patterns::BindingState::BOUND\r\nthen\r\n\t\'\'\r\nelse\r\n\t\':\'+self.dataType.name\r\nendif", //$NON-NLS-1$
				"self.multiPortVariable.oclIsUndefined()", //$NON-NLS-1$
				"if\r\n\tself.bindingState = storydiagram::patterns::BindingState::BOUND\r\nthen\r\n\t\'\'\r\nelse\r\n\t\':\'+self.dataType.name\r\nendif", //$NON-NLS-1$
				"--implemented by org.muml.reconfiguration.common.edit.policies.ComponentPartVariableTriggerEmbeddedComponentExpressionLabelEditPolicy\r\n\'\'", //$NON-NLS-1$
				"let compName : String = if self.componentPartType.componentType.name.oclIsUndefined() then \'null\' else\t self.componentPartType.componentType.name endif in\r\nlet partName : String = if self.componentPartType.name.oclIsUndefined() then \' \' else\t\' / \'.concat(self.componentPartType.name) endif in\r\nlet selfName : String = if self.name.oclIsUndefined() then \'null\' else self.name endif in\r\nif bindingState = storydiagram::patterns::BindingState::BOUND then\r\nselfName\r\nelse\r\nselfName.concat(partName.concat(\' : \'.concat(compName)))\r\nendif", //$NON-NLS-1$
				"let compName : String = if self.componentPartType.componentType.name.oclIsUndefined() then \'null\' else\tself.componentPartType.componentType.name endif in\r\nlet partName : String = if self.componentPartType.name.oclIsUndefined() then \' \' else\t\' / \'.concat(self.componentPartType.name) endif in\r\nlet selfName : String = if self.name.oclIsUndefined() then \'null\' else self.name endif in\r\nif bindingState = storydiagram::patterns::BindingState::BOUND then\r\nselfName\r\nelse\r\nselfName.concat(partName.concat(\' : \'.concat(compName)))\r\nendif", //$NON-NLS-1$
				"if self.appliedFadingFunction.oclIsUndefined()\r\nthen \'\'\r\nelse\r\n\tself.appliedFadingFunction.name\r\nendif", //$NON-NLS-1$
				"let\r\n\tdirectContents : Sequence(OclAny) = self.oclAsType(ecore::EObject).eContents(),\r\n\tallContents: Set(OclAny)= directContents->closure(t | \r\n\t\tif\r\n\t\t\tt.oclIsKindOf(ecore::EObject)\r\n\t\tthen\r\n\t\t\tt.oclAsType(ecore::EObject).eContents()\r\n\t\telse\r\n\t\t\tnull\r\n\t\tendif\r\n\t)->flatten()->asSet(),\r\n\tboundCompSPVariables : Set(OclAny) = allContents->select(oclIsKindOf(componentstorypattern::ComponentStoryPatternVariable) and oclAsType(componentstorypattern::ComponentStoryPatternVariable).bindingState = storydiagram::patterns::BindingState::UNBOUND),\r\n\tcheckVariables : OrderedSet(OclAny) = boundCompSPVariables->select(not (oclIsTypeOf(componentstorypattern::ComponentVariable) or oclAsType(componentstorypattern::ComponentStoryPatternVariable).name = \'\'))->asOrderedSet()\r\nin\r\n\tcheckVariables->iterate(v : OclAny; s : String = \'\' | s+v.oclAsType(componentstorypattern::ComponentStoryPatternVariable).name+\r\n\t\tif\r\n\t\t\tcheckVariables->indexOf(v) = checkVariables->size()\r\n\t\tthen\r\n\t\t\t\'\'\r\n\t\telse\r\n\t\t\t\', \'\r\n\t\tendif\r\n\t)", //$NON-NLS-1$
				"if\r\n\tself.type = sdd::PatternNodeType::Existential\r\nthen\r\n\t\'\\u2203\'\r\nelse\r\n\t\'\\u2200\'\r\nendif", //$NON-NLS-1$
				"let\r\n\tcsdd : componentsdd::ComponentStoryDecisionDiagram = self.oclAsType(ecore::EObject).eContainer().oclAsType(componentsdd::ComponentStoryDecisionDiagram),\r\n\tcompName : String = csdd.reconfigurableComponent.name,\r\n\tparameters : String = csdd.parameters->iterate(p:behavior::Parameter; s: String = \'\' | s+p.name+\': \'+p.dataType.name+\r\n\t\tif\r\n\t\t\tcsdd.parameters->indexOf(p) = csdd.parameters->size()\r\n\t\tthen\r\n\t\t\t\'\'\r\n\t\telse\r\n\t\t\t\'; \'\r\n\t\tendif\r\n\t)\r\nin\r\n\tcompName+\'::\'+csdd.name+\'(\'+parameters+\')\'", //$NON-NLS-1$
				"let\r\n\tcsdd : componentsdd::ComponentStoryDecisionDiagram = self.eContainer().oclAsType(componentsdd::ComponentStoryDecisionDiagram)\t\r\nin\r\n\tif\r\n\t\tcsdd.invariantSDD\r\n\tthen\r\n\t\t\'\u00abinvariant\u00bb\'\r\n\telse\r\n\t\t\'\'\r\n\tendif", //$NON-NLS-1$
				"let this : componentstorypattern::ComponentVariable = self.eContainer().oclAsType(ComponentVariable),\r\n\tassemblyConnectors : Collection(pim::connector::Connector) = this.type.oclAsType(pim::component::StructuredComponent).connectors->select(oclIsTypeOf(pim::component::AssemblyConnector)),\r\n\tportVariableTypes: Collection(pim::component::Port) = self.portVariables.portType->excluding(null),\r\n\tconnector : pim::component::AssemblyConnector = assemblyConnectors->select(aC | portVariableTypes->forAll(p | aC.oclAsType(pim::component::AssemblyConnector).portParts.portType->includes(p)))->any(true).oclAsType(pim::component::AssemblyConnector)\r\nin\r\n\tif\r\n\t\tnot connector.oclIsUndefined()\r\n\tthen\r\n\t\tconnector\r\n\telse\r\n\t\tnull\r\n\tendif", //$NON-NLS-1$
				"--Create AssemblyVariable between PortVariables of PartVariables\r\nnot self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().oclIsUndefined()", //$NON-NLS-1$
				"--Create AssemblyVariable between PortVariables of different PartVariables\r\nself.oclAsType(ecore::EObject).eContainer().eContainer() = oppositeEnd.eContainer().eContainer() and self.eContainer() <> oppositeEnd.eContainer()", //$NON-NLS-1$
				"let outerPort : pim::component::Port = self.portVariables->select(eContainer().oclIsTypeOf(ComponentVariable))->at(1).portType,\r\n\tinnerPort : pim::component::Port = self.portVariables.portType->excluding(outerPort)->at(1),\r\n\tdelegationConnectorsOuter : OrderedSet(pim::connector::Connector) = outerPort.connectors->select(oclIsTypeOf(pim::component::DelegationConnector))\r\nin\r\n\tdelegationConnectorsOuter->select(dC | dC.oclAsType(pim::component::DelegationConnector).portPart.portType = innerPort)->any(true).oclAsType(pim::component::DelegationConnector)", //$NON-NLS-1$
				"--Start creation of DelegationVariable at PortVariable of ComponentVariable\r\nself.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().oclIsUndefined()", //$NON-NLS-1$
				"--End creation of DelegationVariable at PortVariable of PartVariable\r\nself.oclAsType(ecore::EObject).eContainer().eContainer().eContainer() = oppositeEnd.oclAsType(ecore::EObject).eContainer().eContainer()", //$NON-NLS-1$
				"if self.orderConstraintType = MultiPortOrderConstraintType::NEXT then\r\n\'\u00abnext\u00bb\'\r\nelse\r\n\'\u00abprev\u00bb\'\r\nendif", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static ComponentSDDOCLFactory getInstance() {
		ComponentSDDOCLFactory instance = ComponentSDDDiagramEditorPlugin.getInstance().getComponentSDDOCLFactory();
		if (instance == null) {
			ComponentSDDDiagramEditorPlugin.getInstance()
					.setComponentSDDOCLFactory(instance = new ComponentSDDOCLFactory());
		}
		return instance;
	}

	/**
	 * @generated
	 */
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	 * @generated
	 */
	public static ComponentSDDAbstractExpression getExpression(int index, EClassifier context,
			Map<String, EClassifier> environment) {
		ComponentSDDOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(cached.expressionBodies[index], context,
					environment == null ? Collections.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	 * @generated
	 */
	public static ComponentSDDAbstractExpression getExpression(String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static ComponentSDDAbstractExpression getExpression(String body, EClassifier context) {
		return getExpression(body, context, Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression extends ComponentSDDAbstractExpression {

		/**
		* @generated
		*/
		private final org.eclipse.ocl.pivot.utilities.OCL pivotOclInstance;

		/**
		* @generated
		*/
		private ExpressionInOCL pivotOclExpression;

		/**
			 * @generated
			 */
		public Expression(String body, EClassifier context, Map<String, EClassifier> environment) {
			super(body, context);
			pivotOclInstance = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
			OCLHelper pivotHelper = pivotOclInstance.createOCLHelper(context);
			try {
				pivotOclExpression = pivotHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (org.eclipse.ocl.pivot.utilities.ParserException e1) {
				e1.printStackTrace();
				setStatus(IStatus.ERROR, e1.getMessage(), e1);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (pivotOclExpression == null) {
				return null;
			}
			try {
				Object pivotResult = pivotOclInstance.evaluate(context, pivotOclExpression);
				// XXX Check for invalid and return null:
				// return oclInstance.isInvalid(result) ? null : result;
				return pivotResult;
			} finally {
				// XXX
				//				evalEnv.clear();
				//				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		 * @generated
		 */
		private static void initCustomEnv(Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv, ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName, createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static Variable createVar(Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
