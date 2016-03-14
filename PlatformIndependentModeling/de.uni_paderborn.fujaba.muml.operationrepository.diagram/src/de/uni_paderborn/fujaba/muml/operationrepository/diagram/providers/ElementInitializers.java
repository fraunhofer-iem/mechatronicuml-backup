package de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers;

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
	public void init_OperationRepository_2001(de.uni_paderborn.fujaba.muml.behavior.OperationRepository instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.operationrepository.diagram.expressions.MumlOCLFactory
					.getExpression(2,
							de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE.getOperationRepository(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Operation_3001(de.uni_paderborn.fujaba.muml.behavior.Operation instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.operationrepository.diagram.expressions.MumlOCLFactory
					.getExpression(3, de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE.getOperation(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Parameter_3002(de.uni_paderborn.fujaba.muml.behavior.Parameter instance) {
		try {
			Object value_0 = de.uni_paderborn.fujaba.muml.operationrepository.diagram.expressions.MumlOCLFactory
					.getExpression(4, de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE.getParameter(),
							null)
					.evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
					.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
					.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
