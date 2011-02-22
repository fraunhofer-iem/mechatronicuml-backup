package de.uni_paderborn.fujaba.newwizard.diagrams.pages;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class DomainSourceSelectionPage extends WizardPage {

	protected DomainSourceSelectionPage(String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		// Create the top-level control
		Composite plate = new Composite(parent, SWT.NONE);
		plate.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout(1, true);
		layout.marginWidth = 0;
		plate.setLayout(layout);
		plate.setFont(parent.getFont());

		// Create the controls
		Button buttonCreateModel = new Button(plate, SWT.RADIO);
		buttonCreateModel.setText("Create new Domain Model");

		Label labelCreateModel = new Label(plate, SWT.WRAP);
		labelCreateModel
				.setText("Erstellt ein neues Fujaba Model und verknüpft das Diagramm.");
		FontData fontDataCreate = labelCreateModel.getFont().getFontData()[0];
		Font fontCreate = new Font(labelCreateModel.getDisplay(), new FontData(
				fontDataCreate.getName(), fontDataCreate.getHeight(), SWT.ITALIC));
		labelCreateModel.setFont(fontCreate);
		GridData labelCreateModelData = new GridData(SWT.FILL, SWT.NONE, false, false);
		labelCreateModelData.horizontalIndent = 23;
		labelCreateModel.setLayoutData(labelCreateModelData);

		GridData buttonSelectModelData = new GridData(SWT.NONE, SWT.NONE, false, false);
		buttonSelectModelData.verticalIndent = 16;
		Button buttonSelectModel = new Button(plate, SWT.RADIO);
		buttonSelectModel.setText("Select existing Domain Model");
		buttonSelectModel.setLayoutData(buttonSelectModelData);

		Label labelSelectModel = new Label(plate, SWT.NONE);
		labelSelectModel
				.setText("Verwendet ein bereits existierendes Fujaba Model und verknüpft das Diagramm.");
		FontData fontDataSelect = labelSelectModel.getFont().getFontData()[0];
		Font fontSelect = new Font(labelCreateModel.getDisplay(), new FontData(
				fontDataSelect.getName(), fontDataSelect.getHeight(), SWT.ITALIC));
		labelCreateModel.setFont(fontSelect);
		GridData labelSelectModelData = new GridData(SWT.FILL, SWT.NONE, false, false);
		labelSelectModelData.horizontalIndent = 23;
		labelSelectModel.setLayoutData(labelSelectModelData);
		
		buttonSelectModel.setSelection(true);
		
		// Show description on opening
		setErrorMessage(null);
		setMessage(null);
		setControl(plate);
	}

}
