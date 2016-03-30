package org.muml.simulink.adapter.wizard.pages;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class SelectDebugOptionsPage extends WizardPage 
{
	
	private BooleanFieldEditor saveIntermediateModelEditor = null;
	private BooleanFieldEditor printTransformationStatistics = null;
	private ComboFieldEditor printSentMessagesEditor = null;
	private int printSentMessages = 0;
	
	public SelectDebugOptionsPage(String pageName) {
		super(pageName);
		this.setTitle("Debug Options");
		this.setDescription("Select Debug Options");
	}

	@Override
	public void createControl(Composite parent) {
		// top level group
		Composite topLevel = new Composite(parent, SWT.NONE);
		topLevel.setLayout(new GridLayout());
		GridData layoutData = new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL);
		topLevel.setLayoutData(layoutData);
		topLevel.setFont(parent.getFont());
		
		this.setControl(topLevel);
		
		this.saveIntermediateModelEditor = new BooleanFieldEditor("saveIntermediateModel", "Save intermediate model (.xmi)", topLevel);
		this.saveIntermediateModelEditor.fillIntoGrid(topLevel, 2);
		
		this.printTransformationStatistics = new BooleanFieldEditor("printTransformationStatistics", "Print Statistics for Transformation Execution", topLevel);
		this.printTransformationStatistics.fillIntoGrid(topLevel, 2);
		
		final String[][] msgDebug = new String[][]{new String[]{"None", "0"},
													new String[]{"All Messages, No ACK", "1"},
													new String[]{"All Messages", "2"}};
		this.printSentMessagesEditor = new ComboFieldEditor("printSentMessages", "Print sent messages",msgDebug, topLevel);
		this.printSentMessagesEditor.setPropertyChangeListener(new IPropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent event) {
				printSentMessages = Integer.parseInt((String) event.getNewValue());
				
			}});
		this.printSentMessagesEditor.fillIntoGrid(topLevel, 2);
				
	}
	
	public boolean saveIntermediateModel()
	{
		return this.saveIntermediateModelEditor.getBooleanValue();
	}
	
	public int printSentMessages()
	{
		return this.printSentMessages;
	}

	public boolean printTransformationStatistics(){
		return this.printTransformationStatistics.getBooleanValue();
	}
}
