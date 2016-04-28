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
package org.muml.pim.component.diagram.expressions;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.options.ParsingOptions;
import org.muml.pim.component.diagram.part.ComponentDiagramEditorPlugin;

/**
 * @generated
 */
public class MumlOCLFactory {

	/**
	 * @generated
	 */
	private final MumlAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected MumlOCLFactory() {
		this.expressions = new MumlAbstractExpression[19];
		this.expressionBodies = new String[] { "1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"if refinedRole.oclIsUndefined() then \'\' else \': \'.concat(\n\t(if refinedRole.coordinationProtocol.name.oclIsUndefined() then \'\' else refinedRole.coordinationProtocol.name.concat(\'.\') endif).concat\n\t(if refinedRole.name.oclIsUndefined() then \'\' else refinedRole.name endif)\n) endif", //$NON-NLS-1$
				"(\n\tif dataType.name.oclIsUndefined() then \'\' else dataType.name.concat(\' \') endif\n).concat(\n\tif (self.name.oclIsUndefined()) then \'\' else self.name endif\n).concat(\n\t-- Fix for update bug #1307:\n\t-- Access samplingInterval.expression and samplingInterval.unit\n\tif samplingInterval.unit.oclIsUndefined() and samplingInterval.value.oclIsUndefined() then \'\' else \' [\'.concat(samplingInterval.toString()).concat(\']\') endif\n)\n", //$NON-NLS-1$
				"if (self.name.oclIsUndefined()) then\n\t\'\'\nelse\n\tself.name\nendif", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"let partName : String = if self.name.oclIsUndefined() then \'null\' else self.name endif in\r\nlet compName : String = if self.componentType.oclIsUndefined() then \'null\' else self.componentType.name endif in\nlet lowerBound : String = if self.cardinality.lowerBound.oclIsUndefined() then \'null\' else cardinality.lowerBound.toString() endif in\nlet upperBound : String = if self.cardinality.upperBound.oclIsUndefined() then \'null\' else cardinality.upperBound.toString() endif in\r\npartName.concat(\' : \').concat(compName).concat(\' [\').concat(lowerBound).concat(\'..\').concat(upperBound).concat(\']\').concat(\n\t-- The following will evaluate to an empty string and is only present to make sure the OCL Impact Analyzer\n\t-- registers these features as important and listens to change events (we used toString before and did not explicitely access them)\n\t(if cardinality.lowerBound.value.oclIsUndefined() then \'\' else \'\' endif).concat\n\t(if cardinality.lowerBound.infinity.oclIsUndefined() then \'\' else \'\' endif).concat\n\t(if cardinality.upperBound.value.oclIsUndefined() then \'\' else \'\' endif).concat\n\t(if cardinality.upperBound.infinity.oclIsUndefined() then \'\' else \'\' endif)\n)", //$NON-NLS-1$
				"coordinationProtocol.name", //$NON-NLS-1$
				"-- Only PortParts may be connected using an AssemblyConnector\nself.oclIsKindOf(component::PortPart)", //$NON-NLS-1$
				"-- DEACTIVATED FOR #941:\n-- Assembly must only connect PortParts at different ComponentParts of the same type\ntrue\n--self.oclIsKindOf(component::PortPart) and\n--not oppositeEnd.oclAsType(component::PortPart).componentPart.parentComponent.componentKind.oclIsUndefined() and\n--not self.oclAsType(component::PortPart).componentPart.parentComponent.oclIsUndefined() and\n--oppositeEnd.oclAsType(component::PortPart).componentPart <> self.oclAsType(component::PortPart).componentPart and\n--oppositeEnd.oclAsType(component::PortPart).componentPart.parentComponent = self.oclAsType(component::PortPart).componentPart.parentComponent", //$NON-NLS-1$
				"-- Only Ports or PortParts may be the source of a DelegationConnector\ntrue\n-- or self.oclIsKindOf(component::PortPart) or self.oclIsKindOf(component::Port)", //$NON-NLS-1$
				"-- DelegationConnector must only connect Port at StructuredComponent and PortPart at embedded ComponentPart\nlet portPart : component::PortPart = if self.oclIsKindOf(component::PortPart) then self else if oppositeEnd.oclIsKindOf(component::PortPart) then oppositeEnd else null endif endif.oclAsType(component::PortPart) in\nlet portType : component::Port = if self.oclIsKindOf(component::Port) then self else if oppositeEnd.oclIsKindOf(component::Port) then oppositeEnd else null endif endif.oclAsType(component::Port) in\nnot portPart.oclIsUndefined() and\nnot portType.oclIsUndefined() and\nnot portPart.componentPart.parentComponent.oclIsUndefined() and\nnot portType.component.oclIsUndefined() and\nportPart.componentPart.parentComponent = portType.component", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static MumlOCLFactory getInstance() {
		MumlOCLFactory instance = ComponentDiagramEditorPlugin.getInstance().getMumlOCLFactory();
		if (instance == null) {
			ComponentDiagramEditorPlugin.getInstance().setMumlOCLFactory(instance = new MumlOCLFactory());
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
	public static MumlAbstractExpression getExpression(int index, EClassifier context,
			Map<String, EClassifier> environment) {
		MumlOCLFactory cached = getInstance();
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
	public static MumlAbstractExpression getExpression(String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static MumlAbstractExpression getExpression(String body, EClassifier context) {
		return getExpression(body, context, Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression extends MumlAbstractExpression {

		/**
		 * @generated
		 */
//		private final org.eclipse.ocl.ecore.OCL oclInstance;
		
		/**
		 * @generated
		 */
//		private OCLExpression oclExpression;

		/**
		 * @generated
		 */
		private org.eclipse.ocl.pivot.utilities.OCL pivotOclInstance;

		/**
		 * @generated
		 */
		private org.eclipse.ocl.pivot.ExpressionInOCL pivotExpression = null;
		
		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context, Map<String, EClassifier> environment) {
			super(body, context);
			pivotOclInstance = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
			org.eclipse.ocl.pivot.utilities.OCLHelper pivotHelper = pivotOclInstance.createOCLHelper(context);
						try {
				pivotExpression = pivotHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (org.eclipse.ocl.pivot.utilities.ParserException e1) {
				e1.printStackTrace();
				setStatus(IStatus.ERROR, e1.getMessage(), e1);
			}
	
//			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
//			initCustomEnv(oclInstance.getEnvironment(), environment);
//			Helper oclHelper = oclInstance.createOCLHelper();
//			oclHelper.setContext(context());
//			try {
//				oclExpression = oclHelper.createQuery(body());
//				setStatus(IStatus.OK, null, null);
//			} catch (ParserException e) {
//				setStatus(IStatus.ERROR, e.getMessage(), e);
//			}
						
						

//			XXX initCustomEnv() calls the following code, which must be executed somehow pivot like:
//			for (String varName : environment.keySet()) {
//				EClassifier varType = environment.get(varName);
//				ecoreEnv.addElement(varName, createVar(ecoreEnv, varName, varType), false);
//			}

		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
	
			if (pivotExpression == null) {
				return null;
			}
			
			try {
				Object pivotResult = pivotOclInstance.evaluate(context, pivotExpression);
				// XXX Check for invalid and return null:
				// return oclInstance.isInvalid(result) ? null : result;
				return pivotResult;
			} finally {
				// XXX
//				evalEnv.clear();
//				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}

			// XXX
//			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
//			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance.getEvaluationEnvironment();
//			// initialize environment
//			for (Object nextKey : env.keySet()) {
//				evalEnv.replace((String) nextKey, env.get(nextKey));
//			}
		}
//
//		/**
//		 * @generated
//		 */
//		private static void initCustomEnv(Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
//				Map<String, EClassifier> environment) {
//			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
//			ParsingOptions.setOption(ecoreEnv, ParsingOptions.implicitRootClass(ecoreEnv),
//					EcorePackage.eINSTANCE.getEObject());
//			for (String varName : environment.keySet()) {
//				EClassifier varType = environment.get(varName);
//				ecoreEnv.addElement(varName, createVar(ecoreEnv, varName, varType), false);
//			}
//		}
//
//		/**
//		 * @generated
//		 */
//		private static Variable createVar(Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
//				String name, EClassifier type) {
//			Variable var = EcoreFactory.eINSTANCE.createVariable();
//			var.setName(name);
//			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
//			return var;
//		}
	}
}
