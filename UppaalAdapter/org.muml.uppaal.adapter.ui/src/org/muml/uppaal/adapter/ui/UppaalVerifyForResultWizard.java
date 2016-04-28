package org.muml.uppaal.adapter.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.muml.mumlcore.NamedElement;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.constraint.VerificationConstraintRepository;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.Role;
import org.muml.uppaal.adapter.job.interfaces.VerificationOptionsProvider;
import org.muml.uppaal.adapter.job.interfaces.VerificationPropertyChoiceProvider;
import org.muml.uppaal.adapter.mtctl.Property;
import org.muml.uppaal.adapter.mtctl.PropertyRepository;
import org.muml.uppaal.options.Options;

/**
 * Wizard for the "verify multiple properties and show results" option
 */
public class UppaalVerifyForResultWizard extends Wizard implements VerificationOptionsProvider, VerificationPropertyChoiceProvider {
	protected VerifiableElement verifiableElement = null;
	protected OptionsWizardPage optionsPage = null;
	protected PropertiesWizardPage propertiesPage = null;
	private WizardDialog dialog = null; //needed in prepareOptionsProvider

	public boolean prepareProvider(VerifiableElement verifiableElement) {
		if (this.verifiableElement != null) {
			if (verifiableElement != this.verifiableElement)
				throw new RuntimeException("Wizard does not expect to be reused");
			return true; //ignore second prepare call (one init for both implemented providers)
		}
		this.verifiableElement = verifiableElement;
		//Create properties page that shows all high-level properties
		ArrayList<Property> properties = new ArrayList<Property>();
		for (VerificationConstraintRepository repo : verifiableElement.getVerificationConstraintRepositories())
			if (repo instanceof PropertyRepository)
				properties.addAll(((PropertyRepository) repo).getProperties());
		
			
		propertiesPage = new PropertiesWizardPage("Choose Properties to Verify", properties, new HashMap<Property, List<Property>>());
		
		List<String> hideOptions = new ArrayList<String>();
		hideOptions.add("traceOptions");
		if (verifiableElement instanceof CoordinationProtocol) {
			//really want Java 8 now :p
			//if (!((CoordinationProtocol) verifiableElement).getRoles().stream().anyMatch(Role::isMulti))
			//	hideOptions.add("roleMultiplicity");
			boolean isMulti = false;
			for (Role role : ((CoordinationProtocol) verifiableElement).getRoles())
				isMulti |= role.isMulti();
			if (!isMulti)
				hideOptions.add("roleMultiplicity");
		}
		optionsPage = new OptionsWizardPage(verifiableElement, hideOptions);
		
		//Open dialog
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), UppaalVerifyForResultWizard.this);
				dialog.open();
			}
		});
		
		return dialog.getReturnCode() != Window.CANCEL;
	}
	
	@Override
	public Options getOptions() {
		return optionsPage.getOptions();
	}
	
	@Override
	public String getWindowTitle() {
		return "Verify "+ ((NamedElement) verifiableElement).getName() + " for Results";
	}
	
	@Override
	public void addPages() {
		addPage(optionsPage);
		addPage(propertiesPage);
	}

	@Override
	public boolean performFinish() {
		return true;
	}

	@Override
	public boolean isChosen(Property property) {
		return propertiesPage.isChecked(property);
	}

	@Override
	public boolean prepareOptionsProvider(VerifiableElement element) {
		return prepareProvider(element);
	}

	@Override
	public boolean preparePropertyChoiceProvider(VerifiableElement element) {
		return prepareProvider(element);
	}
}
