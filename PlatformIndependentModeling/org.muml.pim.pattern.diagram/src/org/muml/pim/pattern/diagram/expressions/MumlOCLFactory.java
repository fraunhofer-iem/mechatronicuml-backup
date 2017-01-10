package org.muml.pim.pattern.diagram.expressions;

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
import org.muml.pim.pattern.diagram.part.MumlDiagramEditorPlugin;

/**
 * @generated
 */
public class MumlOCLFactory {

	/**
	* @generated
	*/
	private final MumlAbstractExpression[] expressions;

	/**
	* @generated
	*/
	private final String[] expressionBodies;

	/**
	* @generated
	*/
	protected MumlOCLFactory() {
		this.expressions = new MumlAbstractExpression[31];
		this.expressionBodies = new String[] { "\'\'", //$NON-NLS-1$
				"\'0\'", //$NON-NLS-1$
				"\'role1\'", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"self.coordinationProtocol.roleConnector", //$NON-NLS-1$
				"\'role2\'", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"self.coordinationProtocol.roleConnector", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"(\r\nif self.oclAsType(ecore::EObject).eContainer().oclAsType(pim::msgtype::MessageType).parameters->first() = self then\r\n\t\t\'\'\r\n\telse\r\n\t\t\' \'\r\n\tendif\r\n).concat(\r\n\tif self.dataType.name.oclIsUndefined() then\r\n\t\t\'\'\r\n\telse\r\n\t\tself.dataType.name\r\n\tendif\t\r\n\r\n).concat(\r\n\tif self.name.oclIsUndefined() then\r\n\t\t\'null\'\r\n\telse\r\n\t\t\' \'.concat(self.name)\r\n\tendif\r\n).concat(\r\n\tif self.oclAsType(ecore::EObject).eContainer().oclAsType(pim::msgtype::MessageType).parameters->last() = self then\r\n\t\t\'\'\r\n\telse\r\n\t\t\',\'\r\n\tendif\r\n)\r\n\r\n", //$NON-NLS-1$
				"if self.name.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tself.name\r\nendif", //$NON-NLS-1$
				"\'Size: \'.concat(if(self.bufferSize.oclIsUndefined()) \r\nthen \'null\' else self.bufferSize.toString() endif)", //$NON-NLS-1$
				"\'Discard: \'.concat(if (self.bufferOverflowAvoidanceStrategy = BufferOverflowAvoidanceStrategy::DISCARD_INCOMING_MESSAGE)\r\nthen \'Incoming Msgs\' else \'Oldest Msgs\' endif)", //$NON-NLS-1$
				"\'Incoming Buffer: \'.concat(\r\n\tif (self.name.oclIsUndefined()) then\r\n\t\t\'\'\r\n\telse\r\n\t\tself.name\r\n\tendif\r\n)", //$NON-NLS-1$
				"\'Reliable: \'.concat((not self.messageLossPossible).toString())", //$NON-NLS-1$
				"\'\'", //$NON-NLS-1$
				"\'role1\'", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"\'role2\'", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"OrderedSet { self.coordinationProtocol.roles->first(), self.coordinationProtocol.roles->last() }", //$NON-NLS-1$
				"\'\'", //$NON-NLS-1$
				"\'0\'", //$NON-NLS-1$
				"\'\'", //$NON-NLS-1$
				"\'0\'", //$NON-NLS-1$
				"true -- self.oclAsType(pim::protocol::Role).coordinationProtocol = oppositeEnd.oclAsType(pim::protocol::Role).coordinationProtocol", //$NON-NLS-1$
		};
	}

	/**
	* @generated
	*/
	private static MumlOCLFactory getInstance() {
		MumlOCLFactory instance = MumlDiagramEditorPlugin.getInstance().getMumlOCLFactory();
		if (instance == null) {
			MumlDiagramEditorPlugin.getInstance().setMumlOCLFactory(instance = new MumlOCLFactory());
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
	public static MumlAbstractExpression getExpression(int index, EClassifier context,
			Map<String, EClassifier> environment) {
		MumlOCLFactory cached = getInstance();
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
	public static MumlAbstractExpression getExpression(String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	* This method will become private in the next release
	* @generated
	*/
	public static MumlAbstractExpression getExpression(String body, EClassifier context) {
		return getExpression(body, context, Collections.<String, EClassifier>emptyMap());
	}

	/**
	* @generated
	*/
	private static class Expression extends MumlAbstractExpression {

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
			try {
				OCLHelper pivotHelper = pivotOclInstance.createOCLHelper(context);
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
