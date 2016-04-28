package org.muml.simulink.adapter.wizard.pages;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.muml.mumlcore.ExtendableElement;
import org.muml.mumlcore.modelinstance.ModelElementCategory;
import org.muml.mumlcore.modelinstance.RootNode;
import org.muml.pim.instance.ComponentInstanceConfiguration;

public class SelectInstanceConfigurationPage extends WizardPage{
	
	private ListViewer instancesList = null;
	
	private RootNode model = null;

	public SelectInstanceConfigurationPage(String pageName) {
		super(pageName);
		this.setPageComplete(false);
		this.setTitle("ComponentInstanceConfiguration");
		this.setDescription("Select a ComponentInstanceConfiguration");
	}

	@Override
	public void createControl(Composite parent) {		
		// top level group
		Composite topLevel = new Composite(parent, SWT.NONE);
		topLevel.setLayout(new GridLayout());
		topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL));
		topLevel.setFont(parent.getFont());
		
		this.setControl(topLevel);
		
		this.instancesList = new ListViewer(topLevel, SWT.DEFAULT| SWT.V_SCROLL);

		
		GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gd.verticalAlignment = GridData.FILL;
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessHorizontalSpace = true;
		gd.grabExcessVerticalSpace = true;
		this.instancesList.getList().setLayoutData(gd);
		
		this.instancesList.addSelectionChangedListener(new ISelectionChangedListener(){
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				SelectInstanceConfigurationPage.this.setPageComplete(true);	
			}});
		
		this.instancesList.setLabelProvider(new LabelProvider());
		
		if(this.model != null)
			this.addConfigurationToList();
		
	}
	
	public void setModel(RootNode model)
	{
		this.model = model;
		if(this.instancesList != null)
			this.addConfigurationToList();
	}
	
	private void addConfigurationToList()
	{
		this.instancesList.remove(this.instancesList.getList());
		for(ModelElementCategory category: this.model.getCategories())
		{
			if("org.muml.pim.instance.category".equals(category.getKey()))
			{
				for(ExtendableElement modelElement :category.getModelElements())
				{
					ComponentInstanceConfiguration configuration = (ComponentInstanceConfiguration)modelElement;
					this.instancesList.add(configuration);
				}
			}
		}
		
		if(this.instancesList.getElementAt(0) != null)
			this.instancesList.setSelection(new StructuredSelection(this.instancesList.getElementAt(0)));
	}
	
	@Override
	public boolean canFlipToNextPage()
	{
		return super.canFlipToNextPage() && this.instancesList.getSelection().isEmpty() == false;
	}

	public ComponentInstanceConfiguration getConfiguration() {
		if(!this.instancesList.getSelection().isEmpty())
		{
			IStructuredSelection selection = (IStructuredSelection) this.instancesList.getSelection();
			return (ComponentInstanceConfiguration) selection.getFirstElement();
		}
		return null;
	}

}
