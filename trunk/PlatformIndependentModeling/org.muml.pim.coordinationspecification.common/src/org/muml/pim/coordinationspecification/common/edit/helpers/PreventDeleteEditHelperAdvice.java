package org.muml.pim.coordinationspecification.common.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

public class PreventDeleteEditHelperAdvice extends AbstractEditHelperAdvice {
	@Override
	protected ICommand getBeforeDestroyElementCommand(DestroyElementRequest request) {
		return UnexecutableCommand.INSTANCE;
	}
	@Override
	protected ICommand getAfterDestroyElementCommand(DestroyElementRequest request) {
		return UnexecutableCommand.INSTANCE;
	}
}
