package org.muml.pm.hardware.platform.diagram.expressions;

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
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.options.ParsingOptions;

/**
 * @generated
 */
public class HardwareOCLFactory {

	/**
	 * @generated
	 */
	private final org.muml.pm.hardware.platform.diagram.expressions.HardwareAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected HardwareOCLFactory() {
		this.expressions = new org.muml.pm.hardware.platform.diagram.expressions.HardwareAbstractExpression[20];
		this.expressionBodies = new String[] {
				"let bdwidth : String = if self.bandwidth.oclIsUndefined() then \'null\' else  self.bandwidth.toString() endif in\nbdwidth", //$NON-NLS-1$
				"let proto : String = if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif in\nproto", //$NON-NLS-1$
				"\'Bridge\'", //$NON-NLS-1$
				"0", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"let portType : String = if self.hwport.oclIsUndefined() then \'null\' else self.hwport.name endif in\r\nlet protocolName : String = if self.hwport.protocol.oclIsUndefined() then \'null\' else self.hwport.protocol.name endif in\r\nportType + \'\\n\' + protocolName", //$NON-NLS-1$
				"\': \' + if self.hwplatformType.oclIsUndefined() then \'null\' else self.hwplatformType.name endif", //$NON-NLS-1$
				"let lowerBound : String = if self.cardinality.lowerBound.oclIsUndefined() then \'null\' else cardinality.lowerBound.toString() endif in\nlet upperBound : String = if self.cardinality.upperBound.oclIsUndefined() then \'null\' else cardinality.upperBound.toString() endif in\r\n\'[\' + lowerBound + \'..\' + upperBound + \']\'", //$NON-NLS-1$
				"\'Enter cardinality in form of:  lowerBound..upperBound\'", //$NON-NLS-1$
				"0", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"\': \' + if self.resourceType.oclIsUndefined() then \'null\' else self.resourceType.name endif", //$NON-NLS-1$
				"let lowerBound : String = if self.cardinality.lowerBound.oclIsUndefined() then \'null\' else cardinality.lowerBound.toString() endif in\nlet upperBound : String = if self.cardinality.upperBound.oclIsUndefined() then \'null\' else cardinality.upperBound.toString() endif in\r\n\'[\' + lowerBound + \'..\' + upperBound + \']\'", //$NON-NLS-1$
				"\'Enter cardinality in form of:  lowerBound..upperBound\'", //$NON-NLS-1$
				"let isStructuredResourceInstance : Boolean = if self.resourceType.oclIsUndefined() then false else\n self.resourceType.oclIsTypeOf(hwresourceinstance::StructuredResourceInstance) endif in\nlet memory : Set(hwresourceinstance::MemoryResourceInstance) = if (isStructuredResourceInstance) then self.resourceType.oclAsType(hwresourceinstance::StructuredResourceInstance).embeddedAtomicResourceInstances->select(r|r.oclIsKindOf(hwresourceinstance::MemoryResourceInstance) and not r.oclIsTypeOf(hwresourceinstance::CacheInstance)).oclAsType(hwresourceinstance::MemoryResourceInstance)->asOrderedSet()\nelse Set(hwresourceinstance::MemoryResourceInstance){}  endif in\nlet memoryString : String = if memory->isEmpty() then \'Memory:\' else memory->iterate(m; result : String = \'Memory:\' | result.concat(m.memorySize.toString().concat(\' \').concat(m.memoryType.toString()).concat(\', \'))) endif in\nmemoryString", //$NON-NLS-1$
				"let isStructuredResourceInstance : Boolean = if self.resourceType.oclIsUndefined() then false else\n self.resourceType.oclIsTypeOf(hwresourceinstance::StructuredResourceInstance) endif in\nlet processor : Set(hwresourceinstance::ComputingResourceInstance) = if (isStructuredResourceInstance) then self.resourceType.oclAsType(hwresourceinstance::StructuredResourceInstance).embeddedAtomicResourceInstances->select(r|r.oclIsKindOf(hwresourceinstance::ComputingResourceInstance)).oclAsType(hwresourceinstance::ComputingResourceInstance)->asOrderedSet()\nelse Set(hwresourceinstance::ComputingResourceInstance){}  endif in\nlet processorString : String = if processor->isEmpty() then \'Processor:\' else processor->iterate(p; result : String = \'Processor:\' | result.concat(p.frequency.toString().concat(\', \'))) endif in\nprocessorString", //$NON-NLS-1$
				"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static HardwareOCLFactory getInstance() {
		HardwareOCLFactory instance = org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.getInstance().getHardwareOCLFactory();
		if (instance == null) {
			org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.setHardwareOCLFactory(instance = new HardwareOCLFactory());
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
	public static org.muml.pm.hardware.platform.diagram.expressions.HardwareAbstractExpression getExpression(
			int index, EClassifier context, Map<String, EClassifier> environment) {
		HardwareOCLFactory cached = getInstance();
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
	public static org.muml.pm.hardware.platform.diagram.expressions.HardwareAbstractExpression getExpression(
			String body, EClassifier context, Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static org.muml.pm.hardware.platform.diagram.expressions.HardwareAbstractExpression getExpression(
			String body, EClassifier context) {
		return getExpression(body, context, Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression
			extends org.muml.pm.hardware.platform.diagram.expressions.HardwareAbstractExpression {

		/**
		 * @generated
		 */
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		 * @generated
		 */
		private OCLExpression oclExpression;

		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context, Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
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
