package de.uni_paderborn.fujaba.muml.verification.uppaal.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.ui.properties.MtctlXtextPropertyEditor;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.TransformationJob;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.PropertyRepository;

public class AddDefaultPropertiesAction extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		GraphicalEditPart editPart = ((GraphicalEditPart) ((IStructuredSelection) selection).getFirstElement());
		final VerifiableElement verifiableElement = (VerifiableElement) ((View) editPart.getModel()).getElement();
		
		String properties = "";
		//Load default properties
		try {
			URL url = new URL("platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.ui/default_properties.mtctl");
		    InputStream inputStream = url.openConnection().getInputStream();
		    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			StringBuilder builder = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				builder.append(line);
				builder.append(System.getProperty("line.separator"));
			}
			properties = builder.toString();
			reader.close();
		} catch (Exception e) {
			return CommandResult.newErrorCommandResult("Error loading default properties");
		}
		
		
		//Parse them
		MtctlXtextPropertyEditor.VerificationPropertyLanguageResource languageResource = new MtctlXtextPropertyEditor.VerificationPropertyLanguageResource();
		final PropertyRepository defaultProperties = (PropertyRepository) languageResource.loadFromString(properties, verifiableElement).getEObject();
		
		//Add the repository to the model
		ChangeCommand addPropertiesCommand = new ChangeCommand(verifiableElement) {
			@Override
			protected void doExecute() {
				verifiableElement.getVerificationConstraintRepositories().add(defaultProperties);
			}
		};
		
		if (!addPropertiesCommand.canExecute())
			return CommandResult.newErrorCommandResult("Cannot execute adding default property command");
		
		editPart.getEditingDomain().getCommandStack().execute(addPropertiesCommand);

		return CommandResult.newOKCommandResult();
	}

}