package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart;

public class ConfigurePage extends WizardPage implements Listener {

	private Table table;
	private CCombo[] combos;
	
	protected boolean active;

	private boolean isTableFilled;

	protected ConfigurePage() {
		super("Page2");
		setTitle("PlatformParts");
		setDescription("Select Multiplicity of the embeedded PlatformParts to initialise:");
		isTableFilled = false;
		active=false;
	}

	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		// create the composite to hold the widgets
		GridData gd;
		Composite composite = new Composite(parent, SWT.NONE);

		// create the desired layout for this wizard page
		GridLayout gl = new GridLayout();
		int ncol = 2;
		gl.numColumns = ncol;
		composite.setLayout(gl);

		table = new Table(composite, SWT.BORDER | SWT.MULTI);
		table.setLinesVisible(true);
		for (int i = 0; i < 2; i++) {
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(100);
		}

		setControl(composite);
		setPageComplete(true);
	}

	public void handleEvent(Event event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVisible(boolean visible) {
		// TODO Auto-generated method stub
		super.setVisible(visible);
		if (visible) {
			fillTable();
			active=true;
		}
	}

	private void fillTable() {
		PlatformInstanceWizard wizard = (PlatformInstanceWizard) getWizard();
		WizardModel model = wizard.getModel();
		HWPlatform selectedHWPlatform = model.getSelectedHWPlatform();
		if (selectedHWPlatform != null) {

			for (int i = 0; i < selectedHWPlatform.getEmbeddedPlatformParts()
					.size(); i++) {
				new TableItem(table, SWT.NONE);
			}

			PlatformPart currentPart;
			TableItem[] items = table.getItems();
			combos = new CCombo[items.length];
			for (int i = 0; i < items.length; i++) {
				currentPart = selectedHWPlatform.getEmbeddedPlatformParts()
						.get(i);

				TableEditor editor = new TableEditor(table);

				editor = new TableEditor(table);
				Text text = new Text(table, SWT.NONE);
				text.setText(currentPart.getName());
				editor.grabHorizontal = true;
				editor.setEditor(text, items[i], 0);

				editor = new TableEditor(table);
				CCombo combo = new CCombo(table, SWT.NONE);
			//	combo.setText("Times");
				combos[i] = combo;
				for (long j = currentPart.getCardinality().getLowerBound()
						.getValue(); j <= currentPart.getCardinality()
						.getUpperBound().getValue(); j++) {
					combo.add(Long.toString(j));
				}
				if(combo.getItemCount()>0){
					combo.select(0);
				}

				editor.grabHorizontal = true;
				editor.setEditor(combo, items[i], 1);

			}
		}
		isTableFilled = true;
	}

	protected void saveDataToModel() {
		PlatformInstanceWizard wizard = (PlatformInstanceWizard) getWizard();
		WizardModel model = wizard.getModel();
		Dictionary<String, Integer> config = model.getConfiguration();
		TableItem[] items = table.getItems();
		HWPlatform selectedHWPlatform = model.getSelectedHWPlatform();
		PlatformPart currentPart;
		Integer value;
		for (int i = 0; i < items.length; i++) {
			currentPart = selectedHWPlatform.getEmbeddedPlatformParts().get(i);

			try {
				value = Integer.parseInt(combos[i].getText());
				config.put(currentPart.getName(), value);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
			}

		}
	}

	/*
	 * Sets the completed field on the wizard class when all the information is
	 * entered and the wizard can be completed
	 */
	public boolean isPageComplete() {
		PlatformInstanceWizard wizard = (PlatformInstanceWizard) getWizard();
		WizardModel model = wizard.getModel();
		if (!isTableFilled) {
			return false;
		}
		saveDataToModel();
		return true;
	}

}
