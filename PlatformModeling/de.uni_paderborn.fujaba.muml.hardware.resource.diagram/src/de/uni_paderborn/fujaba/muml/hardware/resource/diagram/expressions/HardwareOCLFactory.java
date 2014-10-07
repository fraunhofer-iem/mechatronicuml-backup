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
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected HardwareOCLFactory() {
		this.expressions = new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareAbstractExpression[47];
		this.expressionBodies = new String[] {
				"\'device\'", //$NON-NLS-1$
				"\'hw-port\'", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"let portName : String = if self.name.oclIsUndefined() then \'null\' else self.name endif in\r\nlet protocolName : String = if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif in\r\nportName.concat(\' : \').concat(protocolName)", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"\': \' + self.deviceType.toString()", //$NON-NLS-1$
				"\'StructuredResource\'", //$NON-NLS-1$
				"\'Com.Resource\'", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif", //$NON-NLS-1$
				"let lowerBound : String = if self.cardinality.lowerBound.oclIsUndefined() then \'null\' else cardinality.lowerBound.toString() endif in\nlet upperBound : String = if self.cardinality.upperBound.oclIsUndefined() then \'null\' else cardinality.upperBound.toString() endif in\r\n\'[\' + lowerBound + \'..\' + upperBound + \']\'", //$NON-NLS-1$
				"\'cache\'", //$NON-NLS-1$
				"\' : Cache\'", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"let nbSet : String = if self.nbSets.oclIsUndefined() then \'null\' else self.nbSets.toString() endif in\n\'#Sets:\' + nbSet", //$NON-NLS-1$
				"let associa : String =  if self.associativity.oclIsUndefined() then \'null\' else self.associativity.toString() endif in\n\'Associativity:\' + associa", //$NON-NLS-1$
				"\'processor\'", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"\' : Processor\'", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"\'#Cores: \' + self. nbCores.toString()", //$NON-NLS-1$
				"let arch: String = if self.architecture.oclIsUndefined() then \'null\' else self.architecture.toString() endif in\nlet fam: String =  if self.family.oclIsUndefined() then \'null\' else self.family.toString() endif in\n\'Architecture: \' + arch + \' Family: \' + fam", //$NON-NLS-1$
				"\'PLD\'", //$NON-NLS-1$
				"\' : PLD\'", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"\'memory\'", //$NON-NLS-1$
				"if self.memoryType.oclIsUndefined() then \':\' else \': \'.concat(self.memoryType.toString()) endif", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"let access: String = if self.memoryAccess.oclIsUndefined() then \'null\' else self.memoryAccess.toString() endif in\n\'Access: \' + access", //$NON-NLS-1$
				"let volatile: String = if self.isVolatile.oclIsUndefined() then \'null\' else self.isVolatile.toString() endif in\n\'Volatile: \' + volatile", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"0", //$NON-NLS-1$
				"let bdwidth : String = if self.bandwidth.oclIsUndefined() then \'null\' else  self.bandwidth.toString() endif in\nbdwidth", //$NON-NLS-1$
				"\'Enter bandwidth in form of: Value bs/kbs/mbs\'", //$NON-NLS-1$
				"let proto : String = if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif in\nproto", //$NON-NLS-1$
				"0", //$NON-NLS-1$
				"let bdwidth : String = if self.bandwidth.oclIsUndefined() then \'null\' else  self.bandwidth.toString() endif in\nbdwidth", //$NON-NLS-1$
				"\'Enter: bs/kbs/mbs\'", //$NON-NLS-1$
				"let proto : String = if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif in\nproto", //$NON-NLS-1$
				"\'ProtocolRepository\'", //$NON-NLS-1$
				"\'BusProtocol\'", //$NON-NLS-1$
				"\'LinkProtocol\'", //$NON-NLS-1$
				"self.oclIsTypeOf(hwresource::Processor) implies self.oclAsType(hwresource::Processor).ownedCache.oclIsUndefined()", //$NON-NLS-1$
				"self.oclAsType(ecore::EObject).eContainer() = oppositeEnd.oclAsType(ecore::EObject).eContainer()\nand self.oclIsTypeOf(hwresource::Cache)\n", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static HardwareOCLFactory getInstance() {
		HardwareOCLFactory instance = de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.getInstance().getHardwareOCLFactory();
		if (instance == null) {
			de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().setHardwareOCLFactory(
							instance = new HardwareOCLFactory());
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
	public static de.uni_paderborn.fujaba.muml.hardware.resource.diagram.expressions.HardwareAbstractExpression getExpression(
			int index, EClassifier context, Map<String, EClassifier> environment) {
		HardwareOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(
					cached.expressionBodies[index],
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
