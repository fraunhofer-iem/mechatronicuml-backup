package org.muml.pim.operationrepository.diagram.providers;

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
	public void init_OperationRepository_2001(org.muml.pim.behavior.OperationRepository instance) {
		try {
			Object value_0 = org.muml.pim.operationrepository.diagram.expressions.MumlOCLFactory
					.getExpression(2,
							org.muml.pim.behavior.BehaviorPackage.eINSTANCE.getOperationRepository(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Operation_3001(org.muml.pim.behavior.Operation instance) {
		try {
			Object value_0 = org.muml.pim.operationrepository.diagram.expressions.MumlOCLFactory
					.getExpression(3, org.muml.pim.behavior.BehaviorPackage.eINSTANCE.getOperation(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Parameter_3002(org.muml.pim.behavior.Parameter instance) {
		try {
			Object value_0 = org.muml.pim.operationrepository.diagram.expressions.MumlOCLFactory
					.getExpression(4, org.muml.pim.behavior.BehaviorPackage.eINSTANCE.getParameter(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			org.muml.pim.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = org.muml.pim.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			org.muml.pim.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
					.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
