package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions;

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
	private final de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.MumlAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	protected MumlOCLFactory() {
		this.expressions = new de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.MumlAbstractExpression[17];
	}

	/**
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.MumlAbstractExpression getExpression(
			int index, EClassifier context, Map<String, EClassifier> environment) {
		MumlOCLFactory cached = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.getInstance().getMumlOCLFactory();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().setMumlOCLFactory(
							cached = new MumlOCLFactory());
		}
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			final String[] exprBodies = new String[] {
					"\'State\'", //$NON-NLS-1$
					"\'entry / \'.concat(if self.action.oclIsUndefined() then \'null\' else self.action.name endif)", //$NON-NLS-1$
					"\'action\'", //$NON-NLS-1$
					"\'do / \'.concat(if self.action.oclIsUndefined() then \'null\' else self.action.name endif)", //$NON-NLS-1$
					"\'exit / \'.concat(if self.action.oclIsUndefined() then \'null\' else self.action.name endif)", //$NON-NLS-1$
					"if self.clock.name.oclIsUndefined() or self.operator.oclIsUndefined() then\n\t\'null\'\nelse\n\tself.clock.name.concat(\' \').concat(\'self.operator\').concat(\' \').concat(\n\t\tif self.bound.oclIsUndefined() then\n\t\t\t\'null\'\n\t\telse\n\t\t\tself.bound.toString()\n\t\tendif\n\t)\nendif", //$NON-NLS-1$
					"(if self.name.oclIsUndefined() then \'null\' else self.name endif).concat(\n\t\'(\'.concat(\n\t\tself.containedParameters->iterate(param; result : String = \'\' | \n\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\n\t\t\t\tparam.name.concat(\' : \').concat(\n\t\t\t\t\tif param.eType.oclIsUndefined() then\n\t\t\t\t\t\t\'null\'\n\t\t\t\t\telse\n\t\t\t\t\t\tparam.eType.name\n\t\t\t\t\tendif\n\t\t\t\t)\n\t\t\t)\n\t\t)\n\t).concat(\')\')\n)", //$NON-NLS-1$
					"\'c\'", //$NON-NLS-1$
					"self.clockResets->iterate(clockReset; result : String = \'\' | \n(\n\tif result = \'\' then \'\' else result.concat(\', \') endif\n).concat(if clockReset.name.oclIsUndefined() then \'null\' else clockReset.name endif).concat(\':=0\'))", //$NON-NLS-1$
					"self.absoluteDeadlines->iterate(absoluteDeadline; result : String = \'\' | \n(\n\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\n\t\t\t(if absoluteDeadline.clock.name.oclIsUndefined() then \'\' else absoluteDeadline.clock.name endif).concat(\' in [\').concat(\n\t\t\t\tif absoluteDeadline.lowerBound.oclIsUndefined() then \'null\' else absoluteDeadline.lowerBound.toString() endif\n\t\t\t).concat(\',\').concat(\n\t\t\t\tif absoluteDeadline.upperBound.oclIsUndefined() then \'null\' else absoluteDeadline.upperBound.toString() endif\n\t\t\t).concat(\']\')\n\t)\n))\n", //$NON-NLS-1$
					"\'[\'.concat(\n\tif self.relativeDeadline.lowerBound.oclIsUndefined() then \'null\' else self.relativeDeadline.lowerBound.toString() endif\n).concat(\',\').concat(\n\tif self.relativeDeadline.upperBound.oclIsUndefined() then \'null\' else self.relativeDeadline.upperBound.toString() endif\n).concat(\']\')", //$NON-NLS-1$
					"\'{\'.concat(\n\tOrderedSet { OrderedSet { self.triggerMessageEvent }, OrderedSet{ self.raiseMessageEvent } }->iterate(events; eventsResults : String = \'\' | (\n\t\t(if eventsResults = \'\' then \'\' else eventsResults.concat(\'} / {\') endif).concat(\n\t\t\tevents->iterate(event; singleEventResult : String = \'\' | \n\t\t\t(\n\t\t\t\t(if singleEventResult = \'\' then \'\' else singleEventResult.concat(\', \') endif).concat(event.message.callee.oclAsType(msgiface::MessageType).name).concat(\'(\').concat(\n\t\t\t\t\tevent.message.ownedParameterBindings->iterate(binding; bindingResult : String = \'\' | (\n\t\t\t\t\t\t(if bindingResult = \'\' then \'\' else bindingResult.concat(\', \') endif).concat(\n\t\t\t\t\t\t\tbinding.valueExpression.oclAsType(modeling::expressions::LiteralExpression).value\n\t\t\t\t\t\t).concat(\':\').concat(\n\t\t\t\t\t\t\tbinding.valueExpression.oclAsType(modeling::expressions::LiteralExpression).valueType.name\n\t\t\t\t\t\t)\n\t\t\t\t\t)).concat(\')\')\n\t\t\t\t)\n\t\t\t)\n\t\t))\n\t))\n).concat(\'}\')\n\n\n", //$NON-NLS-1$
					"\'guard\'", //$NON-NLS-1$
					"\'transitionAction\'", //$NON-NLS-1$
					"\'[\'.concat(\n\tself.clockConstraints->iterate(clockConstraint; result : String = \'\' | (\n\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\n\t\t\t(\n\t\t\t\tif clockConstraint.clock.oclIsUndefined() then\n\t\t\t\t\t\'null\'\n\t\t\t\telse\n\t\t\t\t\tclockConstraint.clock.name\n\t\t\t\tendif\n\t\t\t).concat(\' \').concat(\n\n\t\t\t\tif clockConstraint.operator.oclIsUndefined() then\n\t\t\t\t\t\'null\'\n\t\t\t\telse\n\t\t\t\t\tlet array : Set(Tuple(s : String, d : modeling::expressions::ComparingOperator)) = Set{\n\t\t\t\t\t\tTuple{s = \'<\', d = modeling::expressions::ComparingOperator::LESS },\n\t\t\t\t\t\tTuple{s = \'\u2264\', d = modeling::expressions::ComparingOperator::LESS_OR_EQUAL },\n\t\t\t\t\t\tTuple{s = \'=\', d = modeling::expressions::ComparingOperator::EQUAL },\n\t\t\t\t\t\tTuple{s = \'\u2265\', d = modeling::expressions::ComparingOperator::GREATER_OR_EQUAL },\n\t\t\t\t\t\tTuple{s = \'>\', d = modeling::expressions::ComparingOperator::GREATER },\n\t\t\t\t\t\tTuple{s = \'\u2260\', d = modeling::expressions::ComparingOperator::UNEQUAL },\n\t\t\t\t\t\tTuple{s = \'regexp\', d = modeling::expressions::ComparingOperator::REGULAR_EXPRESSION }\n\t\t\t\t\t} in array->any(t | t.d = clockConstraint.operator).s\n\t\t\t\tendif\n\n\t\t\t).concat(\' \').concat(\n\t\t\t\tif clockConstraint.bound.oclIsUndefined() then\n\t\t\t\t\t\'null\'\n\t\t\t\telse\n\t\t\t\t\tclockConstraint.bound.toString()\n\t\t\t\tendif\n\t\t\t)\n\t\t)\n\t))\n).concat(\']\')", //$NON-NLS-1$
					"if not safe then\r\n\t\'\'\r\nelse\r\n\t\'<<safetyTransition>>\'\r\nendif", //$NON-NLS-1$
					"if self.synchronization.oclIsUndefined() then\n\t\'\'\nelse\n\tself.synchronization.callee.oclAsType(SynchronizationChannel).name.concat(\'(\').concat(\n\t\tself.synchronization.ownedParameterBindings->iterate(\n\t\t\tbinding; result : String = \'\' | (if result = \'\' then \'\' else result.concat(\', \') endif).concat(\n\t\t\t\tif binding.valueExpression.oclIsUndefined() then\n\t\t\t\t\t\'null\'\n\t\t\t\telse\n\t\t\t\t\t\'\"\'.concat(\n\t\t\t\t\t\tif binding.valueExpression.oclAsType(modeling::expressions::LiteralExpression).value.oclIsUndefined() then\n\t\t\t\t\t\t\t\'null\'\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tbinding.valueExpression.oclAsType(modeling::expressions::LiteralExpression).value\n\t\t\t\t\t\tendif\n\t\t\t\t\t).concat(\'\" : \').concat(\n\t\t\t\t\t\tif binding.valueExpression.oclAsType(modeling::expressions::LiteralExpression).valueType.oclIsUndefined() then\n\t\t\t\t\t\t\t\'null\'\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tbinding.valueExpression.oclAsType(modeling::expressions::LiteralExpression).valueType.name\n\t\t\t\t\t\tendif\n\t\t\t\t\t)\n\t\t\t\tendif\n\t\t\t)\n\t\t)\n\t).concat(\')\').concat(\n\t\tif self.synchronization.kind = SynchronizationKind::SEND then\n\t\t\t\'!\'\n\t\telse\n\t\t\t\'?\'\n\t\tendif\n\t)\nendif", //$NON-NLS-1$
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
	public static de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.MumlAbstractExpression getExpression(
			String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.MumlAbstractExpression getExpression(
			String body, EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression
			extends
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.expressions.MumlAbstractExpression {

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
