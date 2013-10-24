package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.wizard;

/*
 * Licensed Material - Property of IBM 
 * (C) Copyright IBM Corp. 2002 - All Rights Reserved. 
 */

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration;

/**
 * Class representing the first page of the wizard
 */

public class PlatformTypePage extends WizardPage implements Listener {

	public static final String copyright = "(c) Copyright IBM Corporation 2002.";

	// widgets on this page
	private Combo platformToInit;

	private Collection availableHWPlatforms = null;

	/**
	 * Constructor for PlatformTypeSelectPage.
	 */
	public PlatformTypePage() {
		super("Page1");
		setTitle("Platform Type");
		setDescription("Select the Hardware Platform to initialise:");

		
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		
		initContent();
		// create the composite to hold the widgets
		GridData gd;
		Composite composite = new Composite(parent, SWT.NULL);

		// create the desired layout for this wizard page
		GridLayout gl = new GridLayout();
		int ncol = 1;
		gl.numColumns = ncol;
		composite.setLayout(gl);

		// create the widgets. If the appearance of the widget is different from
		// the default,
		// create a GridData for it to set the alignment and define how much
		// space it will occupy

		// The HWPlatform to initialize
		new Label(composite, SWT.NONE).setText("Platform Type:");
		platformToInit = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		gd = new GridData();
		gd.horizontalAlignment = GridData.BEGINNING;
		platformToInit.setLayoutData(gd);
		for (Object item : availableHWPlatforms) {
			if (de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.Literals.HW_PLATFORM
					.isSuperTypeOf(((EObject) item).eClass())) {
				platformToInit.add(((HWPlatform) item).getName());
			}
		}

		// set the composite as the control for this page
		setControl(composite);
		addListeners();
	}

	private void addListeners() {
		platformToInit.addListener(SWT.Selection, this);
	}

	/**
	 * @see Listener#handleEvent(Event)
	 */
	public void handleEvent(Event event) {
		// Initialize a variable with the no error status
		if (event.widget == platformToInit) {
			getWizard().getContainer().updateButtons();
		}
	}

	/*
	 * Returns the next page. Saves the values from this page in the model
	 * associated with the wizard. Initializes the widgets on the next page.
	 */

	public IWizardPage getNextPage() {
		ConfigurePage page = ((PlatformInstanceWizard) getWizard())
				.getConfigPage();
		return page;

	}

	@Override
	public boolean canFlipToNextPage() {
		if(platformToInit.getSelectionIndex() > -1){
			saveDataToModel();
		}
			PlatformInstanceWizard wizard = (PlatformInstanceWizard) getWizard();
		WizardModel model = wizard.getModel();
		if (model.isHWPlatformSet()) {
			return true;
		} else {
			return false;
		}
	}

	private void saveDataToModel() {
		if (platformToInit.getSelectionIndex() > -1) {
			PlatformInstanceWizard wizard = (PlatformInstanceWizard) getWizard();
			WizardModel model = wizard.getModel();
			HWPlatform selectedPlatform = (HWPlatform) availableHWPlatforms
					.toArray()[platformToInit.getSelectionIndex()];
			model.setSelectedHWPlatform(selectedPlatform);
		}
	}

	
	private void initContent(){
		PlatformInstanceWizard wizard = (PlatformInstanceWizard) getWizard();
		HWPlatformInstanceConfiguration instanceConfiguration = wizard
				.getModel().getSelectedHWPlatformInstanceConfiguration();
		HWPlatform hwPlatform = de.uni_paderborn.fujaba.muml.hardware.platform.PlatformFactory.eINSTANCE
				.createHWPlatform();
		availableHWPlatforms = ItemPropertyDescriptor
				.getReachableObjectsOfType(instanceConfiguration,
						hwPlatform.eClass());
	}
}
