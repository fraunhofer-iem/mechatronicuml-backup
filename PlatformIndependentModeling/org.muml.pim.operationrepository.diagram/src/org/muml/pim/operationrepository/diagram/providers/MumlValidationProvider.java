package org.muml.pim.operationrepository.diagram.providers;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.operationrepository.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.operationrepository.diagram.part.MumlVisualIDRegistry;
import org.muml.pim.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin;

/**
 * @generated
 */
public class MumlValidationProvider {

	/**
	 * @generated
	 */
	private static boolean constraintsActive = false;

	/**
	 * @generated
	 */
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	 * @generated
	 */
	public static void runWithConstraints(TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				OperationRepositoryDiagramEditorPlugin.getInstance().logError("Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	 * @generated
	 */
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& ModelElementCategoryEditPart.MODEL_ID.equals(MumlVisualIDRegistry.getModelID((View) object));
		}
		return true;
	}

}
