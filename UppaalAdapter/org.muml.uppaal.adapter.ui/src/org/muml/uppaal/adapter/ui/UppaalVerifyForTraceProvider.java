package org.muml.uppaal.adapter.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.muml.core.NamedElement;
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
 * Wizards for the "verify one simple property for a trace" option
 *
 */
public class UppaalVerifyForTraceProvider implements VerificationOptionsProvider, VerificationPropertyChoiceProvider {	
	protected OptionsWizardPage optionsPage = null;
	protected PropertiesWizardPage propertiesPage = null;
	protected WizardDialog dialog = null;
	
	public UppaalVerifyForTraceProvider() {
		
	}

	@Override
	public boolean preparePropertyChoiceProvider(final VerifiableElement verifiableElement) {
		ArrayList<Property> properties = new ArrayList<Property>();
		for (VerificationConstraintRepository repo : verifiableElement.getVerificationConstraintRepositories())
			if (repo instanceof PropertyRepository)
				properties.addAll(((PropertyRepository) repo).getProperties());
				
		propertiesPage = new PropertiesWizardPage("Choose a Simple Property to get a Trace", properties, new HashMap<Property, List<Property>>()); //TODO show hierarchical properties here
		propertiesPage.setSelectOne(true);
		
		//Open dialog with simple wizard for the property choice page
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), new Wizard() {
					@Override
					public boolean performFinish() {
						return true;
					}
					@Override
					public void addPages() {
						addPage(propertiesPage);
					}
					
					@Override
					public String getWindowTitle() {
						return "Verify " + ((NamedElement) verifiableElement).getName() + " for a Trace";
					}
				});
				if (org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().shouldDoStatisticalEvaluation()) {
					dialog.setBlockOnOpen(false);
					dialog.open();
					if (!properties.isEmpty()) {
						propertiesPage.setPropertySelected(properties.get(0), true);
					}
					dialog.close();
				} else {
					dialog.open();
				}
			}
		});
		
		return dialog.getReturnCode() != Window.CANCEL;
	}

	@Override
	public boolean isChosen(Property property) {
		return propertiesPage.isChecked(property);
	}

	@Override
	public boolean prepareOptionsProvider(VerifiableElement verifiableElement) {
		List<String> hideOptions = new ArrayList<String>();
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
		
		//Open dialog with simple wizard for the property choice page
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), new Wizard() {
					@Override
					public boolean performFinish() {
						return true;
					}
					@Override
					public void addPages() {
						addPage(optionsPage);
					}
				});
				if (org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().shouldDoStatisticalEvaluation()) {
					dialog.setBlockOnOpen(false);
					dialog.open();
					dialog.close();
				} else {
					dialog.open();
				}
			}
		});
		
		return dialog.getReturnCode() != Window.CANCEL;
	}

	@Override
	public Options getOptions() {
		return optionsPage.getOptions();
	}
}
