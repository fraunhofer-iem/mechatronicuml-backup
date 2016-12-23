package org.muml.pim.operationrepository.diagram.providers;

import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.Operation;
import org.muml.pim.behavior.OperationRepository;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.operationrepository.diagram.expressions.MumlOCLFactory;
import org.muml.pim.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public void init_OperationRepository_2001(OperationRepository instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(2, BehaviorPackage.eINSTANCE.getOperationRepository(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			OperationRepositoryDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Operation_3001(Operation instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(3, BehaviorPackage.eINSTANCE.getOperation(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			OperationRepositoryDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Parameter_3002(Parameter instance) {
		try {
			Object value_0 = MumlOCLFactory.getExpression(4, BehaviorPackage.eINSTANCE.getParameter(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			OperationRepositoryDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = OperationRepositoryDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			OperationRepositoryDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
