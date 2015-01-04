package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import java.util.ArrayList;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.WizardDataTransferPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import pattern.CoordinationPattern;

public class PatternToProtocolExportWizardPage2 extends WizardDataTransferPage
		implements IWizardPage, SelectionListener {

	Label selectionLabel;
	FormToolkit toolkit;

	public PatternToProtocolExportWizardPage2(String pageName,
			FormToolkit toolkit) {
		super(pageName);
		this.toolkit = toolkit;
		this.setTitle("Step 2: Set the parameter values");
	}

	private PatternToProtocolExportWizardPage1 getPage1() {
		return (PatternToProtocolExportWizardPage1) this.getWizard().getPages()[0];
	}

	private ArrayList<CoordinationPattern> getPatternList() {
		return ((ExportWizardPatternToProtocol) this.getWizard())
				.getPatternList();
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		initializeDialogUnits(parent);
	

		int sectionStyle = Section.TITLE_BAR | Section.CLIENT_INDENT
				| Section.EXPANDED;
		Section section = toolkit.createSection(parent, sectionStyle);
		section.setText("Bind all parameters to values");
		section.setLayout(new GridLayout());
		Composite comp = toolkit.createComposite(section);
		comp.setLayout(new GridLayout());
		comp.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));
		section.setClient(comp);
		selectionLabel = toolkit.createLabel(comp, "No pattern selected");
		selectionLabel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));

		this.getPage1().getPatternSelectionCombobox()
				.addSelectionListener(this);
		this.setControl(section);
	}

	@Override
	public void handleEvent(Event event) {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean allowNewContainerName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() instanceof Combo) {
			Combo c = (Combo) e.getSource();
			int index = c.getSelectionIndex();
			if (index >= 0) {
				selectionLabel.setText("You selected pattern "
						+ this.getPatternList().get(index).getName());
			} else
				selectionLabel.setText("No pattern selected");
		}
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		// TODO Auto-generated method stub

	}
}
