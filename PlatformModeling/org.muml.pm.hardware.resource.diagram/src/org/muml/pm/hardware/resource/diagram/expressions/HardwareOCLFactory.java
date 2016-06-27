package org.muml.pm.hardware.resource.diagram.expressions;

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
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.utilities.OCLHelper;
import org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin;

/**
 * @generated
 */
public class HardwareOCLFactory {

	/**
	 * @generated
	 */
	private final HardwareAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected HardwareOCLFactory() {
		this.expressions = new HardwareAbstractExpression[43];
		this.expressionBodies = new String[] { "\'hw-port\'", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"let portName : String = if self.name.oclIsUndefined() then \'null\' else self.name endif in\r\nlet protocolName : String = if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif in\r\nportName.concat(\' : \').concat(protocolName)", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"\': \' + self.deviceKind.toString()", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"if self.protocol.oclIsUndefined() then \'null\' else self.protocol.name endif", //$NON-NLS-1$
				"let lowerBound : String = if self.cardinality.lowerBound.oclIsUndefined() then \'null\' else cardinality.lowerBound.toString() endif in\nlet upperBound : String = if self.cardinality.upperBound.oclIsUndefined() then \'null\' else cardinality.upperBound.toString() endif in\r\n\'[\' + lowerBound + \'..\' + upperBound + \']\'", //$NON-NLS-1$
				"\' : Cache\'", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"let nbSet : String = if self.nbSets.oclIsUndefined() then \'null\' else self.nbSets.toString() endif in\n\'#Sets:\' + nbSet", //$NON-NLS-1$
				"let associa : String =  if self.associativity.oclIsUndefined() then \'null\' else self.associativity.toString() endif in\n\'Associativity:\' + associa", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"\' : Processor\'", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"\'#Cores: \' + self. nbCores.toString()", //$NON-NLS-1$
				"let arch: String = if self.architecture.oclIsUndefined() then \'null\' else self.architecture.toString() endif in\nlet fam: String =  if self.family.oclIsUndefined() then \'null\' else self.family.toString() endif in\n\'Architecture: \' + arch + \' Family: \' + fam", //$NON-NLS-1$
				"\' : PLD\'", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"if self.memoryType.oclIsUndefined() then \':\' else \': \'.concat(self.memoryType.toString()) endif", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"let access: String = if self.memoryAccess.oclIsUndefined() then \'null\' else self.memoryAccess.toString() endif in\n\'Access: \' + access", //$NON-NLS-1$
				"let volatile: String = if self.isVolatile.oclIsUndefined() then \'null\' else self.isVolatile.toString() endif in\n\'Volatile: \' + volatile", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"\' \'", //$NON-NLS-1$
				"DataRateUnit::Kbs", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"DataRateUnit::Kbs", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"self.oclIsTypeOf(Processor) implies self.oclAsType(Processor).ownedCache.oclIsUndefined()", //$NON-NLS-1$
				"self.oclContainer() = oppositeEnd.oclContainer()\nand self.oclIsTypeOf(Cache)\n", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static HardwareOCLFactory getInstance() {
		HardwareOCLFactory instance = HardwareDiagramEditorPlugin.getInstance().getHardwareOCLFactory();
		if (instance == null) {
			HardwareDiagramEditorPlugin.getInstance().setHardwareOCLFactory(instance = new HardwareOCLFactory());
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
	public static HardwareAbstractExpression getExpression(int index, EClassifier context,
			Map<String, EClassifier> environment) {
		HardwareOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(cached.expressionBodies[index], context,
					environment == null ? Collections.<String, EClassifier>emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	 * @generated
	 */
	public static HardwareAbstractExpression getExpression(String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static HardwareAbstractExpression getExpression(String body, EClassifier context) {
		return getExpression(body, context, Collections.<String, EClassifier>emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression extends HardwareAbstractExpression {

		/**
		* @generated
		*/
		private final org.eclipse.ocl.pivot.utilities.OCL pivotOclInstance;

		/**
		* @generated
		*/
		private ExpressionInOCL pivotOclExpression;

		/**
			 * @generated
			 */
		public Expression(String body, EClassifier context, Map<String, EClassifier> environment) {
			super(body, context);
			pivotOclInstance = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
			OCLHelper pivotHelper = pivotOclInstance.createOCLHelper(context);
			try {
				pivotOclExpression = pivotHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (org.eclipse.ocl.pivot.utilities.ParserException e1) {
				e1.printStackTrace();
				setStatus(IStatus.ERROR, e1.getMessage(), e1);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (pivotOclExpression == null) {
				return null;
			}
			try {
				Object pivotResult = pivotOclInstance.evaluate(context, pivotOclExpression);
				// XXX Check for invalid and return null:
				// return oclInstance.isInvalid(result) ? null : result;
				return pivotResult;
			} finally {
				// XXX
				//				evalEnv.clear();
				//				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
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
