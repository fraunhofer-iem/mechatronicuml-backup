package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardDataTransferPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorFactory;
import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.LegalConfiguration;

public class PatternToProtocolExportWizardPage2 extends WizardDataTransferPage
		implements IWizardPage {

	Label selectionLabel;
	FormToolkit toolkit;
	PatternToProtocolExportWizardPage1 page1;
	HashMap<Parameter, Text> hm;

	public PatternToProtocolExportWizardPage2(String pageName,
			FormToolkit toolkit, PatternToProtocolExportWizardPage1 page1) {
		super(pageName);
		this.toolkit = toolkit;
		this.setTitle("Step 2: Set the parameter values");
		this.page1 = page1;
		
	}


	Composite mainComp;
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

		mainComp = comp;
//		this.getPage1().getPatternSelectionCombobox()
//				.addSelectionListener(this);		
		this.setControl(section);
		
	}
	public void refresh()
	{
		if(hm != null && !hm.isEmpty())
		{
			for(Text t : hm.values())
			{
				t.dispose();				
			}
		}
		
		CoordinationPattern p = page1.getSelectedPattern();
		if(p == null)
			return;
		LegalConfiguration lc = page1.getSelectedLegalConfiguration();
		hm = new HashMap<Parameter, Text>();
		for(Parameter parameter : p.getPatternParameters())
		{
			Label l = toolkit.createLabel(mainComp,
					parameter.getName());
			l.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
					| GridData.HORIZONTAL_ALIGN_FILL
					| GridData.GRAB_HORIZONTAL));
			Text t = toolkit.createText(mainComp, "");
			t.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
					| GridData.HORIZONTAL_ALIGN_FILL
					| GridData.GRAB_HORIZONTAL));
			hm.put(parameter, t);
		}
		if (lc != null)
		{
			for(ParameterBinding binding : lc.getParameterBindings())
			{
				Text t = hm.get(binding.getParameter());
				if(t!=null)
				{
					t.setText(LanguageResource.serializeEObjectSafe(binding.getValue(), binding));
					t.setEditable(false);
				}
					
			}
		}
		this.getControl().redraw();
		this.getShell().redraw();
	}
	
	public ArrayList<ParameterBinding> getParameterBindings()
	{
		ArrayList<ParameterBinding> bindingList = new ArrayList<ParameterBinding>();
		LegalConfiguration lc = page1.getSelectedLegalConfiguration();
		for(ParameterBinding binding : lc.getParameterBindings())
		{
			Text t = hm.get(binding.getParameter());
			if(t!=null)
			{
				hm.remove(binding.getParameter());
				bindingList.add(binding);
			}
		}
		for(Parameter p : hm.keySet())
		{
			ParameterBinding binding = BehaviorFactory.eINSTANCE.createParameterBinding();
			binding.setParameter(p);
			//binding.setValue(LanguageResource.loadFromString(hm.get(p).getText(), new Expression());
			bindingList.add(binding);
		}
		return bindingList;
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


}
