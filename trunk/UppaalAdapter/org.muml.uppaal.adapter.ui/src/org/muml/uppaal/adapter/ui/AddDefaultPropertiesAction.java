package org.muml.uppaal.adapter.ui;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.uppaal.adapter.mtctl.PropertyRepository;
import org.muml.uppaal.adapter.mtctl.xtext.ui.properties.MtctlXtextPropertyEditor;

public class AddDefaultPropertiesAction extends AbstractUppaalAction {

	@Override
	public Object executeJobSpecific(ExecutionEvent event, Shell shell, ISelection selection,
			EditingDomain editingDomain) {
		final VerifiableElement verifiableElement = this.verifiableElement;
		String properties = "";
		// Load default properties
		try {
			URL url = new URL(
					"platform:/plugin/org.muml.uppaal.adapter.ui/default_properties.mtctl");
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

		// Parse them
		MtctlXtextPropertyEditor.VerificationPropertyLanguageResource languageResource = new MtctlXtextPropertyEditor.VerificationPropertyLanguageResource();
		final PropertyRepository defaultProperties = (PropertyRepository) languageResource
				.loadFromString(properties, verifiableElement).getEObject();

		// Add the repository to the model
		ChangeCommand addPropertiesCommand = new ChangeCommand(verifiableElement) {
			@Override
			protected void doExecute() {
				verifiableElement.getVerificationConstraintRepositories().add(defaultProperties);
			}
		};

		if (!addPropertiesCommand.canExecute())
			return CommandResult.newErrorCommandResult("Cannot execute adding default property command");

		editingDomain.getCommandStack().execute(addPropertiesCommand);

		return CommandResult.newOKCommandResult();
	}

}