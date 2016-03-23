package org.muml.ape.presentation;

import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.ape.PropertyGenerator;
import org.muml.ape.codegen.Generator;
import org.muml.ape.provider.PropertiesEditPlugin;

public class GeneratePropertiesHandler extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		PropertiesModelWizard wizard = new PropertiesModelWizard();
		 
		ISelection sel = HandlerUtil.getCurrentSelection(event);
		IStructuredSelection ssel = new StructuredSelection();
		if (sel instanceof IStructuredSelection) {
			ssel = (IStructuredSelection) sel;
		}
		
		try {
			for (Object object : ssel.toList()) {
				if (object instanceof IFile) {
					IFile file = (IFile) object;
					URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
					ResourceSet resourceSet = new ResourceSetImpl();
					Resource resource = resourceSet.createResource(uri);
					resource.load(Collections.emptyMap());
					for (EObject contents : resource.getContents()) {
						if (contents instanceof PropertyGenerator) {
							PropertyGenerator generator = (PropertyGenerator) contents;
							new Generator().generate(generator);
						}
					}
				}
			}

		} catch (Exception exception) {
			PropertiesEditPlugin.INSTANCE.log(exception);

			// Something went wrong that shouldn't
			new MessageDialog(Display.getDefault().getShells()[0],
					"Code generation failed!", null,
					"Code generation failed. Reason: "
							+ exception.getMessage(),
					MessageDialog.WARNING, new String[] { "OK" }, 0).open();

		}
		return null;
	}

}

