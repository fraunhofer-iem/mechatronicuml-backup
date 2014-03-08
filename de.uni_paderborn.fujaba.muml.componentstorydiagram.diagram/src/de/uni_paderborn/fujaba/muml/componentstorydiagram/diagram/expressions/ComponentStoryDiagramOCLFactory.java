package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions;

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
public class ComponentStoryDiagramOCLFactory {

	/**
	 * @generated
	 */
	private final de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	protected ComponentStoryDiagramOCLFactory() {
		this.expressions = new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression[19];
	}

	/**
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression getExpression(
			int index, EClassifier context, Map<String, EClassifier> environment) {
		ComponentStoryDiagramOCLFactory cached = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.getInstance().getComponentStoryDiagramOCLFactory();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().setComponentStoryDiagramOCLFactory(
							cached = new ComponentStoryDiagramOCLFactory());
		}
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			final String[] exprBodies = new String[] {
					"--\'activity\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'componentStoryPattern\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'this\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--storydiagrams::patterns::BindingState::BOUND".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--storydiagrams::patterns::BindingSemantics::MANDATORY".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'componentStoryNode\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.multiPortVariable.oclIsUndefined()".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let compName : String = if self.type.componentType.name.oclIsUndefined() then \'null\' else\tself.type.componentType.name endif in\r\n--let partName : String = if self.type.name.oclIsUndefined() then \' \' else\t\' / \'.concat(self.type.name) endif in\r\n--let selfName : String = if self.name.oclIsUndefined() then \'null\' else self.name endif in\r\n--if bindingState = storydiagrams::patterns::BindingState::BOUND then\r\n--selfName\r\n--else\r\n--selfName.concat(partName.concat(\' : \'.concat(compName)))\r\n--endif".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'componentStoryPattern\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'this\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--storydiagrams::patterns::BindingState::BOUND".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--storydiagrams::patterns::BindingSemantics::MANDATORY".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--storydiagrams::patterns::BindingOperator::DESTROY".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--storydiagrams::patterns::BindingOperator::CREATE".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'controllerExchangeNode\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"----Create AssemblyVariable between PortVariables of PartVariables\r\n--not self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().oclIsUndefined()".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"----Create AssemblyVariable between PortVariables of different PartVariables\r\n--self.oclAsType(ecore::EObject).eContainer().eContainer() = oppositeEnd.eContainer().eContainer() and self.eContainer() <> oppositeEnd.eContainer()".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"----Start creation of DelegationVariable at PortVariable of ComponentVariable\r\n--self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().oclIsUndefined()".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"----End creation of DelegationVariable at PortVariable of PartVariable\r\n--self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer() = oppositeEnd.oclAsType(ecore::EObject).eContainer().eContainer()".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
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
	public static de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression getExpression(
			String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression getExpression(
			String body, EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression
			extends
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression {

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
