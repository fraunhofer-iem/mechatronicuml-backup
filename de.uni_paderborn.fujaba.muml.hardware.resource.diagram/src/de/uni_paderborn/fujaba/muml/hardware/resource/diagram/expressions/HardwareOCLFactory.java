package de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions;

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
	private final de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	protected HardwareOCLFactory() {
		this.expressions = new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareAbstractExpression[42];
	}

	/**
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareAbstractExpression getExpression(
			int index, EClassifier context, Map<String, EClassifier> environment) {
		HardwareOCLFactory cached = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.getInstance().getHardwareOCLFactory();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().setHardwareOCLFactory(
							cached = new HardwareOCLFactory());
		}
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			final String[] exprBodies = new String[] {
					"--\'device\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'hw-port\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--1".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--1".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let portName : String = if self.name.oclIsUndefined() then \'null\' else self.name endif in\r\n--let protocolName : String = if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif in\r\n--portName.concat(\' : \').concat(protocolName)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\' \'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\': \' + self.deviceType.toString()".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'StructuredResource\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'cache\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\' : Cache\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\' \'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let nbSet : String = if self.nbSets.oclIsUndefined() then \'null\' else self.nbSets.toString() endif in\n--\'#Sets:\' + nbSet".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let associa : String =  if self.associativity.oclIsUndefined() then \'null\' else self.associativity.toString() endif in\n--\'Associativity:\' + associa".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'processor\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--1".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\' : Processor\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\' \'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'#Cores: \' + self. nbCores.toString()".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let arch: String = if self.architecture.oclIsUndefined() then \'null\' else self.architecture.toString() endif in\n--let fam: String =  if self.family.oclIsUndefined() then \'null\' else self.family.toString() endif in\n--\'Architecture: \' + arch + \' Family: \' + fam".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'PLD\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\' : PLD\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\' \'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'memory\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--if self.memoryType.oclIsUndefined() then \':\' else \': \'.concat(self.memoryType.toString()) endif".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\' \'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let access: String = if self.memoryAccess.oclIsUndefined() then \'null\' else self.memoryAccess.toString() endif in\n--\'Access: \' + access".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let volatile: String = if self.isVolatile.oclIsUndefined() then \'null\' else self.isVolatile.toString() endif in\n--\'Volatile: \' + volatile".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\' \'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\' \'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--0".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let bdwidth : String = if self.bandwidth.oclIsUndefined() then \'null\' else  self.bandwidth.toString() endif in\n--bdwidth".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'Enter bandwidth in form of: Value bs/kbs/mbs\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let proto : String = if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif in\n--proto".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--0".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let bdwidth : String = if self.bandwidth.oclIsUndefined() then \'null\' else  self.bandwidth.toString() endif in\n--bdwidth".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'Enter bandwidth in form of: Value bs/kbs/mbs\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let proto : String = if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif in\n--proto".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'ProtocolRepository\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'BusProtocol\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'LinkProtocol\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.oclIsTypeOf(hwresource::Processor) implies self.oclAsType(hwresource::Processor).ownedCache.oclIsUndefined()".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.oclAsType(ecore::EObject).eContainer() = oppositeEnd.oclAsType(ecore::EObject).eContainer()\n--and self.oclIsTypeOf(hwresource::Cache)\n--".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
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
	public static de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareAbstractExpression getExpression(
			String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareAbstractExpression getExpression(
			String body, EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression
			extends
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareAbstractExpression {

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
