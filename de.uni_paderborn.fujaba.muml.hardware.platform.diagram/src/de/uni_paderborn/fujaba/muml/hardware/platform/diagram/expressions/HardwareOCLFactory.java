package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions;

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

/**
 * @generated
 */
public class HardwareOCLFactory {

	/**
	 * @generated
	 */
	private final de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	protected HardwareOCLFactory() {
		this.expressions = new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression[44];
	}

	/**
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression getExpression(
			int index, EClassifier context, Map<String, EClassifier> environment) {
		HardwareOCLFactory cached = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.getInstance().getHardwareOCLFactory();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance().setHardwareOCLFactory(
							cached = new HardwareOCLFactory());
		}
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			final String[] exprBodies = new String[] {
					"--0".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--DataRateUnit::bs".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let bdwidth : String = if self.bandwidth.oclIsUndefined() then \'null\' else  self.bandwidth.toString() endif in\n--bdwidth".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'Enter bandwidth in form of: Value bs/kbs/mbs\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let proto : String = if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif in\n--proto".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'Bridge\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--0".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--1".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'platformPart\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let portName : String = if self.name.oclIsUndefined() then \'null\' else self.name endif in\n--let portType : String = if self.hwPortInstance.oclIsUndefined() then \'null\' else self.hwPortInstance.name endif in\r\n--let protocolName : String = if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif in\r\n--portName +\': \' + portType + \'\\n\' + protocolName".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\': \' + if self.hwplatformType.oclIsUndefined() then \'null\' else self.hwplatformType.name endif".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let lowerBound : String = if self.cardinality.lowerBound.oclIsUndefined() then \'null\' else cardinality.lowerBound.toString() endif in\n--let upperBound : String = if self.cardinality.upperBound.oclIsUndefined() then \'null\' else cardinality.upperBound.toString() endif in\r\n--\'[\' + lowerBound + \'..\' + upperBound + \']\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'Enter cardinality in form of:  lowerBound..upperBound\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let portName : String = if self.name.oclIsUndefined() then \'null\' else self.name endif in\n--let portType : String = if self.hwportType.oclIsUndefined() then \'null\' else self.hwportType.name endif in\n--let protocolName : String = if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif in\n--portName +\': \' + portType + \'\\n\' + protocolName".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--0".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--1".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'resourceInstance\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\': \' + if self.resourceInstanceType.oclIsUndefined() then \'null\' else self.resourceInstanceType.name endif".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let lowerBound : String = if self.cardinality.lowerBound.oclIsUndefined() then \'null\' else cardinality.lowerBound.toString() endif in\n--let upperBound : String = if self.cardinality.upperBound.oclIsUndefined() then \'null\' else cardinality.upperBound.toString() endif in\r\n--\'[\' + lowerBound + \'..\' + upperBound + \']\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'Enter cardinality in form of:  lowerBound..upperBound\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let isStructuredResourceInstance : Boolean = if self.resourceInstanceType.oclIsUndefined() then false else\n-- self.resourceInstanceType.oclIsTypeOf(platform::StructuredResourceInstance) endif in\n--let memory : Set(platform::MemoryResourceInstance) = if (isStructuredResourceInstance) then self.resourceInstanceType.oclAsType(platform::StructuredResourceInstance).embeddedAtomicResourceInstances->select(r|r.oclIsKindOf(platform::MemoryResourceInstance) and not r.oclIsTypeOf(platform::CacheInstance)).oclAsType(platform::MemoryResourceInstance)->asOrderedSet()\n--else Set(platform::MemoryResourceInstance){}  endif in\n--let memoryString : String = if memory->isEmpty() then \'Memory:\' else memory->iterate(m; result : String = \'Memory:\' | result.concat(m.memorySize.toString().concat(\' \').concat(m.memoryType.toString()).concat(\', \'))) endif in\n--memoryString".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let isStructuredResourceInstance : Boolean = if self.resourceInstanceType.oclIsUndefined() then false else\n-- self.resourceInstanceType.oclIsTypeOf(platform::StructuredResourceInstance) endif in\n--let processor : Set(platform::ComputingResourceInstance) = if (isStructuredResourceInstance) then self.resourceInstanceType.oclAsType(platform::StructuredResourceInstance).embeddedAtomicResourceInstances->select(r|r.oclIsKindOf(platform::ComputingResourceInstance)).oclAsType(platform::ComputingResourceInstance)->asOrderedSet()\n--else Set(platform::ComputingResourceInstance){}  endif in\n--let processorString : String = if processor->isEmpty() then \'Processor:\' else processor->iterate(p; result : String = \'Processor:\' | result.concat(p.frequency.toString().concat(\', \'))) endif in\n--processorString".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let portName : String = if self.name.oclIsUndefined() then \'null\' else self.name endif in\n--let portType : String = if self.hwportType.oclIsUndefined() then \'null\' else self.hwportType.name endif in\n--let protocolName : String = if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif in\n--portName +\': \' + portType + \'\\n\' + protocolName\n--".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let nameToShow : String = if (self.oclIsTypeOf(platforminstance::HWPlatformInstance)) then \n--\tself.name.toString() +\' :\'+ self.oclAsType(platforminstance::HWPlatformInstance).hwplatformType.name.toString()\n--else \n--\tself.name.toString()\n--endif \n-- in\n--nameToShow".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.oclIsTypeOf(platform::HWPortPart)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.oclAsType(platform::HWPortInstance).isDelegationPort".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.connectedBridges->isEmpty()".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--0".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--DataRateUnit::bs".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let proto : String = if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif in\n--let bdwidth : String = if self.bandwidth.oclIsUndefined() then \'null\' else  self.bandwidth.toString() endif in\n--proto + \'\\n\' + bdwidth".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'Enter bandwidth in form of: Value bs/kbs/mbs\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.oclAsType(platform::HWPortPart).hwPortInstance.oclIsTypeOf(platform::LinkPortInstance)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.oclAsType(platform::HWPortPart).hwPortInstance.oclIsTypeOf(platform::LinkPortInstance)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.hwPortInstance.oclIsTypeOf(platform::BusPortInstance)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.oclIsTypeOf(platform::Bus)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.oclIsTypeOf(platform::Bus)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.oclIsTypeOf(platform::Bridge)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.connectedBridges->notEmpty()".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--0".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--DataRateUnit::bs".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let proto : String = if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif in\n--let bdwidth : String = if self.bandwidth.oclIsUndefined() then \'null\' else  self.bandwidth.toString() endif in\n--proto + \'\\n\' + bdwidth".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'Enter bandwidth in form of: Value bs/kbs/mbs\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.oclAsType(platform::HWPortPart).hwPortInstance.oclIsTypeOf(platform::LinkPortInstance)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.oclIsTypeOf(platform::Bridge)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
			};
			cached.expressions[index] = getExpression(
					exprBodies[index],
					context,
					environment == null ? Collections
							.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression getExpression(
			String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression getExpression(
			String body, EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression
			extends
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.expressions.HardwareAbstractExpression {

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
		public Expression(String body, EClassifier context,
				Map<String, EClassifier> environment) {
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
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance
					.getEvaluationEnvironment();
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
		private static void initCustomEnv(
				Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv,
					ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName,
						createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static Variable createVar(
				Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
