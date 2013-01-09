package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.expressions;

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
public class MumlOCLFactory {

	/**
	 * @generated
	 */
	private final de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.expressions.MumlAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	protected MumlOCLFactory() {
		this.expressions = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.expressions.MumlAbstractExpression[12];
	}

	/**
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.expressions.MumlAbstractExpression getExpression(
			int index, EClassifier context, Map<String, EClassifier> environment) {
		MumlOCLFactory cached = de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.getInstance().getMumlOCLFactory();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().setMumlOCLFactory(
							cached = new MumlOCLFactory());
		}
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			final String[] exprBodies = new String[] {
					"\'portinstance\'", //$NON-NLS-1$
					"self.multiInteractionEndpointInstance.oclIsUndefined()", //$NON-NLS-1$
					"\'portinstance\'", //$NON-NLS-1$
					"\'portinstance\'", //$NON-NLS-1$
					"\'portinstance\'", //$NON-NLS-1$
					"if self.multiInteractionEndpointInstance.oclIsUndefined() then\n\tnull\nelse\n\tif  self.multiInteractionEndpointInstance.oclIsKindOf(DiscreteMultiPortInstance) then\n\t\tself.multiInteractionEndpointInstance.oclAsType(DiscreteMultiPortInstance).componentInstance\n\telse\n\t\tnull\n\tendif\nendif", //$NON-NLS-1$
					"\'portinstance\'", //$NON-NLS-1$
					"\'instance\'", //$NON-NLS-1$
					"let compName : String = if self.componentType.name.oclIsUndefined() then \'null\' else\tself.componentType.name endif in\r\nlet partName : String = if self.componentPart.name.oclIsUndefined() then \' \' else\t\' / \'.concat(self.componentPart.name) endif in\r\n(if self.name.oclIsUndefined() then \'null\' else self.name endif).concat(partName.concat(\' : \'.concat(compName)))", //$NON-NLS-1$
					"\'instance\'", //$NON-NLS-1$
					"\'configuration\'", //$NON-NLS-1$
					"let compName : String = if self.componentType.name.oclIsUndefined() then \'null\' else\tself.componentType.name endif in\r\nlet partName : String = if self.componentPart.name.oclIsUndefined() then \' \' else\t\' / \'.concat(self.componentPart.name) endif in\r\n(if self.name.oclIsUndefined() then \'null\' else self.name endif).concat(partName.concat(\' : \'.concat(compName)))", //$NON-NLS-1$
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
	public static de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.expressions.MumlAbstractExpression getExpression(
			String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.expressions.MumlAbstractExpression getExpression(
			String body, EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression
			extends
			de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.expressions.MumlAbstractExpression {

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
