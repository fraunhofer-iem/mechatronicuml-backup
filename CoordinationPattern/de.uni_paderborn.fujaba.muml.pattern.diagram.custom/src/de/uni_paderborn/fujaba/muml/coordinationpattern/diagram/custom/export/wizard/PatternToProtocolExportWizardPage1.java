package de.uni_paderborn.fujaba.muml.coordinationpattern.diagram.custom.export.wizard;

import java.util.Collection;
import java.util.HashMap;

import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
//import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardDataTransferPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import pattern.CoordinationPattern;
import pattern.LegalConfiguration;
import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;

/**
 * First page of the export wizard for the Pattern-To-Protocol transformation.
 * Shows a list of patterns from the .muml file.
 * 
 * @author sthiele2
 *
 */
public class PatternToProtocolExportWizardPage1 extends WizardDataTransferPage
		implements IWizardPage, SelectionListener, IPageChangedListener {

	HashMap<Parameter, Text> parameterToTextfieldHashMap = new HashMap<Parameter, Text>();
	Combo legalConfigurationCombo;
	FormToolkit toolkit;
	// Combo patternSelectionCombo;
	Composite parameterBindingComp;

	public PatternToProtocolExportWizardPage1(String pageName,
			FormToolkit toolkit) {
		super(pageName);
		this.toolkit = toolkit;
		this.setTitle("Step 1: Selection of a Coordination Pattern");

	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub

		initializeDialogUnits(parent);
		int sectionStyle = Section.TITLE_BAR | Section.CLIENT_INDENT
				| Section.EXPANDED;
		// Section mainSelection = toolkit.createSection(parent, sectionStyle);
		// mainSelection.setLayout(new GridLayout());
		Composite mainComposite = toolkit.createComposite(parent);
		mainComposite.setLayout(new GridLayout());
		/*
		 * Section patternSelectionsection =
		 * toolkit.createSection(mainComposite, sectionStyle);
		 * patternSelectionsection.setText("Select a Coordination Pattern");
		 * patternSelectionsection.setLayout(new GridLayout()); Composite
		 * patternSelectionComp = toolkit
		 * .createComposite(patternSelectionsection);
		 * patternSelectionComp.setLayout(new GridLayout());
		 * patternSelectionsection.setClient(patternSelectionComp);
		 * patternSelectionCombo = new Combo(patternSelectionComp,
		 * SWT.Selection); patternSelectionCombo.setLayoutData(new GridData());
		 * 
		 * // getPatternList(). for (CoordinationPattern pattern :
		 * this.getPatternList()) {
		 * patternSelectionCombo.add(pattern.getName()); }
		 */
		// create ui part for selecting the legal configuration
		Section configurationSelection = toolkit.createSection(mainComposite,
				sectionStyle);
		configurationSelection
				.setText("You can select a legal configuration in order to bind the pattern's parameters to values. If you"
						+ "do not choose a legal configuration, you have to set the parameter bindings by hand:");
		Composite configComposite = toolkit
				.createComposite(configurationSelection);
		configComposite.setLayout(new GridLayout());
		configurationSelection.setClient(configComposite);

		legalConfigurationCombo = new Combo(configComposite, SWT.Selection);

		legalConfigurationCombo.addSelectionListener(this);
		// patternSelectionCombo.addSelectionListener(this);

		parameterBindingComp = toolkit.createComposite(mainComposite);
		parameterBindingComp.setLayout(new GridLayout(2, false));
		this.setControl(mainComposite);
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

		CoordinationPattern selectedPattern = ((PatternToProtocolExportSourcePage) this
				.getWizard().getPage(
						ExportWizardPatternToProtocol.SELECTPATTERN))
				.getSelectedPattern();

		if (selectedPattern != null) {
			if (e.getSource() == legalConfigurationCombo) {
				int lcIndex = legalConfigurationCombo.getSelectionIndex();
				if (lcIndex != legalConfigurationCombo.getItemCount() - 1
						&& lcIndex >= 0) {
					LegalConfiguration lc = selectedPattern
							.getLegalConfigurations().get(lcIndex);
					Collection<Text> coll = parameterToTextfieldHashMap
							.values();
					for (Text t : coll) {
						t.setText("");
					}
					for (ParameterBinding binding : lc.getParameterBindings()) {
						Parameter p = binding.getParameter();
						Text t = parameterToTextfieldHashMap.get(p);

						if (t != null) {
							t.setText(binding.getValue().toString());
						}
					}
				} else if (lcIndex == legalConfigurationCombo.getItemCount() - 1
						&& lcIndex >= 0) {
					for (Text t : parameterToTextfieldHashMap.values()) {
						t.setText("");
					}
				}
			}
		}

	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pageChanged(PageChangedEvent event) {
		// TODO Auto-generated method stub
		CoordinationPattern selectedPattern = ((PatternToProtocolExportSourcePage) this
				.getWizard().getPage(
						ExportWizardPatternToProtocol.SELECTPATTERN))
				.getSelectedPattern();

		if (selectedPattern != null && event.getSelectedPage() == this) {
			legalConfigurationCombo.removeAll();
			for (LegalConfiguration configuration : selectedPattern
					.getLegalConfigurations()) {
				legalConfigurationCombo.add(configuration.getName());
			}
			legalConfigurationCombo.add("No legal configuration selected!");
			legalConfigurationCombo.select(legalConfigurationCombo
					.getItemCount() - 1);
			// delete old children
			Control[] children = parameterBindingComp.getChildren();
			for (Control child : children) {
				child.dispose();
			}
			parameterToTextfieldHashMap = new HashMap<Parameter, Text>();
			for (Parameter parameter : selectedPattern.getPatternParameters()) {
				Label l = toolkit.createLabel(parameterBindingComp,
						parameter.getName());
				l.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
						| GridData.HORIZONTAL_ALIGN_FILL
						| GridData.GRAB_HORIZONTAL));
				Text t = toolkit.createText(parameterBindingComp, "");
				t.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
						| GridData.HORIZONTAL_ALIGN_FILL
						| GridData.GRAB_HORIZONTAL));
				parameterToTextfieldHashMap.put(parameter, t);
			}
			parameterBindingComp.layout();
			parameterBindingComp.redraw();
			this.getControl().redraw();
			this.getShell().redraw();

		}
	}
}
