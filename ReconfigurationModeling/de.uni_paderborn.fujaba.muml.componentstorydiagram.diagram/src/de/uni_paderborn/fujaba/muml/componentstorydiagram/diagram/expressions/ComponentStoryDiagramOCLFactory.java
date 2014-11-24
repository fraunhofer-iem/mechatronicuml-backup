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
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected ComponentStoryDiagramOCLFactory() {
		this.expressions = new de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression[33];
		this.expressionBodies = new String[] {
				"\'activity\'", //$NON-NLS-1$
				"\'componentStoryPattern\'", //$NON-NLS-1$
				"\'this\'", //$NON-NLS-1$
				"storydiagrams::patterns::BindingState::BOUND", //$NON-NLS-1$
				"storydiagrams::patterns::BindingSemantics::MANDATORY", //$NON-NLS-1$
				"let\r\n\t--couldn\'t get ->closure() working. Nicer Implementation would be something like: self->closure(eContainer())->select(oclIsTypeOf(componentstorydiagram::ComponentStoryRule))\r\n\tcompStoryRule : componentstorydiagram::ComponentStoryRule = self.eContainer().eContainer().eContainer().eContainer().oclAsType(componentstorydiagram::ComponentStoryRule)\r\nin\r\n\tif\r\n\t\tnot compStoryRule.reconfiguredComponent.oclIsUndefined()\r\n\tthen\r\n\t\tcompStoryRule.reconfiguredComponent\r\n\telse\r\n\t\tnull\r\n\tendif", //$NON-NLS-1$
				"\'componentStoryNode\'", //$NON-NLS-1$
				"if\r\n\tself.bindingState = storydiagrams::patterns::BindingState::BOUND\r\nthen\r\n\t\'\'\r\nelse\r\n\t\':\'+self.dataType.name\r\nendif", //$NON-NLS-1$
				"self.multiPortVariable.oclIsUndefined()", //$NON-NLS-1$
				"if\r\n\tself.bindingState = storydiagrams::patterns::BindingState::BOUND\r\nthen\r\n\t\'\'\r\nelse\r\n\t\':\'+self.dataType.name\r\nendif", //$NON-NLS-1$
				"--implemented by de.uni_paderborn.fujaba.muml.reconfiguration.common.edit.policies.ComponentPartVariableTriggerEmbeddedComponentExpressionLabelEditPolicy\r\n\'\'", //$NON-NLS-1$
				"let compName : String = if self.componentPartType.componentType.name.oclIsUndefined() then \'null\' else\t self.componentPartType.componentType.name endif in\r\nlet partName : String = if self.componentPartType.name.oclIsUndefined() then \' \' else\t\' / \'.concat(self.componentPartType.name) endif in\r\nlet selfName : String = if self.name.oclIsUndefined() then \'null\' else self.name endif in\r\nif bindingState = storydiagrams::patterns::BindingState::BOUND then\r\nselfName\r\nelse\r\nselfName.concat(partName.concat(\' : \'.concat(compName)))\r\nendif", //$NON-NLS-1$
				"\'init\'", //$NON-NLS-1$
				"\'junction\'", //$NON-NLS-1$
				"\'final\'", //$NON-NLS-1$
				"\'componentStoryPattern\'", //$NON-NLS-1$
				"\'this\'", //$NON-NLS-1$
				"storydiagrams::patterns::BindingState::BOUND", //$NON-NLS-1$
				"storydiagrams::patterns::BindingSemantics::MANDATORY", //$NON-NLS-1$
				"storydiagrams::patterns::BindingOperator::DESTROY", //$NON-NLS-1$
				"storydiagrams::patterns::BindingOperator::CREATE", //$NON-NLS-1$
				"let\r\n\t--couldn\'t get ->closure() working. Nicer Implementation would be something like: self->closure(eContainer())->select(oclIsTypeOf(componentstorydiagram::ComponentStoryRule))\r\n\tcompStoryRule : componentstorydiagram::ComponentStoryRule = self.eContainer().eContainer().eContainer().eContainer().oclAsType(componentstorydiagram::ComponentStoryRule)\r\nin\r\n\tif\r\n\t\tnot compStoryRule.reconfiguredComponent.oclIsUndefined()\r\n\tthen\r\n\t\tcompStoryRule.reconfiguredComponent\r\n\telse\r\n\t\tnull\r\n\tendif", //$NON-NLS-1$
				"\'controllerExchangeNode\'", //$NON-NLS-1$
				"let compName : String = if self.componentPartType.componentType.name.oclIsUndefined() then \'null\' else\tself.componentPartType.componentType.name endif in\r\nlet partName : String = if self.componentPartType.name.oclIsUndefined() then \' \' else\t\' / \'.concat(self.componentPartType.name) endif in\r\nlet selfName : String = if self.name.oclIsUndefined() then \'null\' else self.name endif in\r\nif bindingState = storydiagrams::patterns::BindingState::BOUND then\r\nselfName\r\nelse\r\nselfName.concat(partName.concat(\' : \'.concat(compName)))\r\nendif", //$NON-NLS-1$
				"if self.appliedFadingFunction.oclIsUndefined()\r\nthen \'\'\r\nelse\r\n\tself.appliedFadingFunction.name\r\nendif", //$NON-NLS-1$
				"if self.deadline.oclIsUndefined() then \'\'\r\nelse\r\nlet lowerBound: String = self.deadline.oclAsType(muml::realtimestatechart::Deadline).lowerBound.oclAsType(muml::valuetype::TimeValue).toString(), \r\n\tupperBound: String = self.deadline.oclAsType(muml::realtimestatechart::Deadline).upperBound.oclAsType(muml::valuetype::TimeValue).toString() in\r\n\'[\'+lowerBound+\'; \'+upperBound+\']\'\r\nendif", //$NON-NLS-1$
				"let this : componentstorypattern::ComponentVariable = self.eContainer().oclAsType(ComponentVariable),\r\n\tassemblyConnectors : Collection(muml::connector::Connector) = this.type.oclAsType(muml::component::StructuredComponent).connectors->select(oclIsTypeOf(muml::component::AssemblyConnector)),\r\n\tportVariableTypes: Collection(muml::component::Port) = self.portVariables.portType->excluding(null),\r\n\tconnector : muml::component::AssemblyConnector = assemblyConnectors->select(aC | portVariableTypes->forAll(p | aC.oclAsType(muml::component::AssemblyConnector).portParts.portType->includes(p)))->any(true).oclAsType(muml::component::AssemblyConnector)\r\nin\r\n\tif\r\n\t\tnot connector.oclIsUndefined()\r\n\tthen\r\n\t\tconnector\r\n\telse\r\n\t\tnull\r\n\tendif", //$NON-NLS-1$
				"--Create AssemblyVariable between PortVariables of PartVariables\r\nnot self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().oclIsUndefined()", //$NON-NLS-1$
				"--Create AssemblyVariable between PortVariables of different PartVariables\r\nself.oclAsType(ecore::EObject).eContainer().eContainer() = oppositeEnd.eContainer().eContainer() and self.eContainer() <> oppositeEnd.eContainer()", //$NON-NLS-1$
				"let outerPort : muml::component::Port = self.portVariables->select(eContainer().oclIsTypeOf(ComponentVariable))->at(1).portType,\r\n\tinnerPort : muml::component::Port = self.portVariables.portType->excluding(outerPort)->at(1),\r\n\tdelegationConnectorsOuter : OrderedSet(muml::connector::Connector) = outerPort.connectors->select(oclIsTypeOf(muml::component::DelegationConnector))\r\nin\r\n\tdelegationConnectorsOuter->select(dC | dC.oclAsType(muml::component::DelegationConnector).portPart.portType = innerPort)->any(true).oclAsType(muml::component::DelegationConnector)", //$NON-NLS-1$
				"--Start creation of DelegationVariable at PortVariable of ComponentVariable\r\nself.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().eContainer().oclIsUndefined()", //$NON-NLS-1$
				"--End creation of DelegationVariable at PortVariable of PartVariable\r\nself.oclAsType(ecore::EObject).eContainer().eContainer().eContainer() = oppositeEnd.oclAsType(ecore::EObject).eContainer().eContainer()", //$NON-NLS-1$
				"if self.orderConstraintType = MultiPortOrderConstraintType::NEXT then\r\n\'\u00abnext\u00bb\'\r\nelse\r\n\'\u00abprev\u00bb\'\r\nendif", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static ComponentStoryDiagramOCLFactory getInstance() {
		ComponentStoryDiagramOCLFactory instance = de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.getInstance().getComponentStoryDiagramOCLFactory();
		if (instance == null) {
			de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
					.getInstance().setComponentStoryDiagramOCLFactory(
							instance = new ComponentStoryDiagramOCLFactory());
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
	public static de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.expressions.ComponentStoryDiagramAbstractExpression getExpression(
			int index, EClassifier context, Map<String, EClassifier> environment) {
		ComponentStoryDiagramOCLFactory cached = getInstance();
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
