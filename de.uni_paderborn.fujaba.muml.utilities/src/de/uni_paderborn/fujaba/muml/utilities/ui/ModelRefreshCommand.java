package de.uni_paderborn.fujaba.muml.utilities.ui;

import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.muml.utilities.modelrefresh.Refresher;

public class ModelRefreshCommand extends AbstractHandler {

	@SuppressWarnings("unchecked")
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			new Refresher(Collections.emptyMap(), Collections.emptyMap()).run(ssel.toList());
		}
		return null;
	}

}
