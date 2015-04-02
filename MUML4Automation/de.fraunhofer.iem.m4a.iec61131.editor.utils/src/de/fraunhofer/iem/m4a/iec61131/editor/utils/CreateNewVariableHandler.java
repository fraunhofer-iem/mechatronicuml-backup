package de.fraunhofer.iem.m4a.iec61131.editor.utils;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.WindowManager;
import org.eclipse.ui.handlers.HandlerUtil;

import de.fraunhofer.iem.m4a.IEC61131.IEC61131;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.IOVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarInitDeclaration;

public class CreateNewVariableHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get the selected element
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();

		CreateNewVariableWindow createVariableWindow = new CreateNewVariableWindow(HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench().getDisplay(), selection);
		createVariableWindow.open();
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
