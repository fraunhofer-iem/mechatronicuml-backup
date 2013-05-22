package de.uni_paderborn.fujaba.muml.component.diagram.expressions;

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
	private final de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	protected MumlOCLFactory() {
		this.expressions = new de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlAbstractExpression[15];
	}

	/**
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlAbstractExpression getExpression(
			int index, EClassifier context, Map<String, EClassifier> environment) {
		MumlOCLFactory cached = de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
				.getInstance().getMumlOCLFactory();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
					.getInstance().setMumlOCLFactory(
							cached = new MumlOCLFactory());
		}
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			final String[] exprBodies = new String[] {
					"--\'comp\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--1".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--1".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'port\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--if refinedRole.oclIsUndefined() then \'\' else \': \'.concat(\n--\tif refinedRole.name.oclIsUndefined() then \'\' else refinedRole.name endif\n--) endif".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'port\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'port\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--1".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--1".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--let partName : String = if self.name.oclIsUndefined() then \'null\' else self.name endif in\r\n--let compName : String = if self.componentType.oclIsUndefined() then \'null\' else self.componentType.name endif in\n--let lowerBound : String = if self.cardinality.lowerBound.oclIsUndefined() then \'null\' else cardinality.lowerBound.toString() endif in\n--let upperBound : String = if self.cardinality.upperBound.oclIsUndefined() then \'null\' else cardinality.upperBound.toString() endif in\r\n--partName.concat(\' : \').concat(compName).concat(\' [\').concat(lowerBound).concat(\'..\').concat(upperBound).concat(\']\')".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--coordinationProtocol.name".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"---- Only PortParts may be connected using an AssemblyConnector\n--self.oclIsKindOf(component::PortPart)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"---- Assembly must only connect PortParts at different ComponentParts of the same type\n--self.oclIsKindOf(component::PortPart) and\n--not oppositeEnd.oclAsType(component::PortPart).parentComponent.componentType.oclIsUndefined() and\n--not self.oclAsType(component::PortPart).componentPart.parentComponent.oclIsUndefined() and\n--oppositeEnd.oclAsType(component::PortPart).componentPart <> self.oclAsType(component::PortPart).componentPart and\n--oppositeEnd.oclAsType(component::PortPart).componentPart.parentComponent = self.oclAsType(component::PortPart).componentPart.parentComponent".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"---- Only Ports or PortParts may be the source of a DelegationConnector\n--true\n---- or self.oclIsKindOf(component::PortPart) or self.oclIsKindOf(component::Port)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"---- DelegationConnector must only connect Port at StructuredComponent and PortPart at embedded ComponentPart\n--let portPart : component::PortPart = if self.oclIsKindOf(component::PortPart) then self else if oppositeEnd.oclIsKindOf(component::PortPart) then oppositeEnd else null endif endif.oclAsType(component::PortPart) in\n--let portType : component::Port = if self.oclIsKindOf(component::Port) then self else if oppositeEnd.oclIsKindOf(component::Port) then oppositeEnd else null endif endif.oclAsType(component::Port) in\n--not portPart.oclIsUndefined() and\n--not portType.oclIsUndefined() and\n--not portPart.componentPart.parentComponent.oclIsUndefined() and\n--not portType.component.oclIsUndefined() and\n--portPart.componentPart.parentComponent = portType.component".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
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
	public static de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlAbstractExpression getExpression(
			String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlAbstractExpression getExpression(
			String body, EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression
			extends
			de.uni_paderborn.fujaba.muml.component.diagram.expressions.MumlAbstractExpression {

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
