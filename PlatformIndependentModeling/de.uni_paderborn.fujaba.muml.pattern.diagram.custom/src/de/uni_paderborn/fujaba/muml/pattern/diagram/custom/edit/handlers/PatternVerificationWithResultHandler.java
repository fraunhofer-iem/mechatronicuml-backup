package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.edit.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * 
 * @author sthiele2
 * PatternVerificationHandler handles the verification of pattern. There are three steps necessary for the execution:
 * 1. select a legal configuration for the pattern. 
 * 2. transform the pattern to a protocol
 * 3. run the uppaal protocol verification on the protocol created in step 2
 *
 */
public class PatternVerificationWithResultHandler extends AbstractHandler  {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		// get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		// collect all StaticStructureComponents from the selection
		Iterator iter = ((IStructuredSelection) selection).iterator();
		return null;
	}

}
