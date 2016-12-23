package org.muml.pim.coordinationspecification.common.edit.helpers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * Fix for #1230.
 * 
 * This makes sure that really all children are deleted. GMF only deletes child views and their elements. Sometimes views are gone, so
 * child elements are not deleted properly. See detailed explanation below:
 * 
 * Detailed Explanation:
 * It is possible to select only the compartment of the outer rectangle of the coordination specification
 * (by clicking twice). Then the user can right-click to "Delete From Model". Only the compartment view is then removed,
 * but semantic elements.
 * This is a problem! Because if the user afterwards deletes the whole coordination specification element, saving is not possible.
 * 
 * Reason:
 * Because the child views are gone, GMF does not ask the child views for delete commands anymore.
 * 
 * @author bingo
 *
 */
public class DeleteWithChildrenEditHelperAdvice extends AbstractEditHelperAdvice {
	@Override
	protected ICommand getBeforeDestroyElementCommand(final DestroyElementRequest request) {
		return super.getBeforeDestroyElementCommand(request);
	}
	@Override
	protected ICommand getAfterDestroyElementCommand(final DestroyElementRequest request) {
		return new DestroyElementCommand(request) {
			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				EObject element = (EObject) request.getElementToDestroy();
				DeleteCommand.create(request.getEditingDomain(), element).execute();
				EObject parent = element.eContainer();
				if (parent != null && element.eContainingFeature() != null) {
					if (element.eContainingFeature().isMany()) {
						List<Object> siblings = new ArrayList<Object>((Collection<?>)parent.eGet(element.eContainingFeature()));
						siblings.remove(element);
						parent.eSet(element.eContainingFeature(), siblings);
					} else {
						parent.eSet(element.eContainingFeature(), null);
					}
				}
				return CommandResult.newOKCommandResult(element);	
			}
		};
	}
}
