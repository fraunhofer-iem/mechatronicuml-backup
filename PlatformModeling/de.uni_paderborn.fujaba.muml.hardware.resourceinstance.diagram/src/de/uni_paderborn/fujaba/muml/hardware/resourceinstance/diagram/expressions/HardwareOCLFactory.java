package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions;

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
	private final de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected HardwareOCLFactory() {
		this.expressions = new de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareAbstractExpression[32];
		this.expressionBodies = new String[] {
				"let portName : String = if self.name.oclIsUndefined() then \'null\' else self.name endif in\r\nlet protocolName : String = if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif in\r\nportName +\': \' +  \'\\n\' + protocolName", //$NON-NLS-1$
				"\': \' + if self.resourceType.oclIsUndefined() then \'null\' else self.resourceType.name endif", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"\': \' + if self.resourceType.oclIsUndefined() then \'null\' else self.resourceType.name endif", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"\': \' + if self.resourceType.oclIsUndefined() then \'null\' else self.resourceType.name endif", //$NON-NLS-1$
				"\'Size: \' + if self.memorySize.oclIsUndefined() then \'null\' else self.memorySize.toString() endif", //$NON-NLS-1$
				"\'Enter memorySize in form of:  Value bit/byte/kb/mb/gb\'", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"\': \' + if self.resourceType.oclIsUndefined() then \'null\' else self.resourceType.name endif", //$NON-NLS-1$
				"if self.frequency.oclIsUndefined() then \'null\' else self.frequency.toString() endif", //$NON-NLS-1$
				"\'Enter frequency in form of:  Value Hz/MHz/GHz\'", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"\': \' + if self.resourceType.oclIsUndefined() then \'null\' else self.resourceType.name endif", //$NON-NLS-1$
				"if self.frequency.oclIsUndefined() then \'null\' else self.frequency.toString() endif", //$NON-NLS-1$
				"\'Enter frequency in form of:  Value Hz/MHz/GHz\'", //$NON-NLS-1$
				"let mips : String = if self.MIPS.oclIsUndefined() then \'null\' else self.MIPS.toString() endif in\nlet cpi : String = if self.CPI.oclIsUndefined() then \'null\' else self.CPI.toString() endif in\n\'MIPS: \'+mips + \' / CPI: \'+cpi", //$NON-NLS-1$
				"0", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"\': \' + if self.resourceType.oclIsUndefined() then \'null\' else self.resourceType.name endif", //$NON-NLS-1$
				"\'Size: \' + if self.memorySize.oclIsUndefined() then \'null\' else self.memorySize.toString() endif", //$NON-NLS-1$
				"\'Enter memorySize in form of:  Value bit/byte/kb/mb/gb\'", //$NON-NLS-1$
				"\'Kind: \' + if self.memoryType.oclIsUndefined() then \'null\' else self.memoryType.toString() endif", //$NON-NLS-1$
				"0", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"\': \' + if self.resourceType.oclIsUndefined() then \'null\' else self.resourceType.name endif", //$NON-NLS-1$
				"\'Size: \' + if self.memorySize.oclIsUndefined() then \'null\' else self.memorySize.toString() endif", //$NON-NLS-1$
				"\'Enter memorySize in form of:  Value bit/byte/kb/mb/gb\'", //$NON-NLS-1$
				"\'Kind: \' + if self.memoryType.oclIsUndefined() then \'null\' else self.memoryType.toString() endif", //$NON-NLS-1$
				"\': \' + if self.resourceType.oclIsUndefined() then \'null\' else self.resourceType.name endif", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static HardwareOCLFactory getInstance() {
		HardwareOCLFactory instance = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.getInstance().getHardwareOCLFactory();
		if (instance == null) {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
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
	public static de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareAbstractExpression getExpression(
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
	public static de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareAbstractExpression getExpression(
			String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareAbstractExpression getExpression(
			String body, EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression
			extends
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.expressions.HardwareAbstractExpression {

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
