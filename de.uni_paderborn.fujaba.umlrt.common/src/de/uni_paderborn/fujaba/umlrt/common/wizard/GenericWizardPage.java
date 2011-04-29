package de.uni_paderborn.fujaba.umlrt.common.wizard;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class GenericWizardPage extends WizardPage implements
ITextFieldListener {

	// State
	boolean initialized = false;
	
	private boolean selectionValid = false;

	private List<Object> selectionValues;

	// Explanation for tree view
	private String explanation;

	private Label explanationLabel;
	
	private IStructuredSelection selection = null;
	  
	// Text Fields
	private List<GenericTextField> fields = null;

	private Map<String, String> fieldValues;
	
	private int minSelectionSize = 1;

	private int maxSelectionSize = 1;
	
	protected GenericWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName);
		this.selection = selection;
		
	}
	
	/**
	* Sets the value for the specified identifier. Useful for default values or displaying values.
	* 
	* @param name identifier for the field
	* @return the entered value
	*/
	public void setFieldValue(String name, String value)
	{
		fieldValues.put(name, value);
	      
		for (GenericTextField field : fields) {
			if (field.getName().equals(name))
			{
				field.setInput(value);
				break;
			}
		}
	}
	
	/**
	* @param explanation the explanation to set
	*/
	public void setExplanation(String explanation)
	{
		this.explanation = explanation;
	 	if (initialized)
	   	{
	 		explanationLabel.setText(explanation);
	    }
	}
	
	   /**
	    * @return the maxSelectionSize
	    */
	   public int getMaxSelectionSize()
	   {
	      return maxSelectionSize;
	   }


	   /**
	    * @param maxSelectionSize the maxSelectionSize to set
	    */
	   public void setMaxSelectionSize(int maxSelectionSize)
	   {
	      if (maxSelectionSize < -1)
	      {
	         throw new IllegalArgumentException(
	               "Maximum selection size cannot be lower than -1");
	      }

	      if (maxSelectionSize > -1 && maxSelectionSize < minSelectionSize)
	      {
	         minSelectionSize = maxSelectionSize;
	      }

	      this.maxSelectionSize = maxSelectionSize;
	   }


	   /**
	    * @return the minSelectionSize
	    */
	   public int getMinSelectionSize()
	   {
	      return minSelectionSize;
	   }


	   /**
	    * @param minSelectionSize the minSelectionSize to set, minSelectionSize -1 denotes selection is not part of the required behavior
	    */
	   public void setMinSelectionSize(int minSelectionSize)
	   {
	      if (minSelectionSize < -1)
	      {
	         throw new IllegalArgumentException(
	               "Minimum selection size cannot be lower than -1");
	      }

	      if (maxSelectionSize < minSelectionSize)
	      {
	         maxSelectionSize = minSelectionSize;
	      }

	      this.minSelectionSize = minSelectionSize;

	   }
	   

	   // Text fields

	   /**
	    * Add a required text field with the given name and label
	    * 
	    * @param name identifier for the field
	    * @param label displayed label
	    */
	   public void addTextField(String name, String label)
	   {
	      fields.add(new GenericTextField(this, name, label, true));
	   }


	   /**
	    * Add an optional or required text field with the given name and label
	    * 
	    * @param name identifier for the field
	    * @param label displayed label
	    * @param required true if the field may not be left blank
	    */
	   public void addTextField(String name, String label, boolean required)
	   {
	      fields.add(new GenericTextField(this, name, label, required));
	   }

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

	      // page area
	      Composite page = new Composite(parent, SWT.NONE);
	      GridLayout gridLayout = new GridLayout();
	      gridLayout.numColumns = 2;
	      gridLayout.marginHeight = 5;
	      gridLayout.marginWidth = 5;
	      page.setLayout(gridLayout);
	      page.setFont(parent.getFont());

	      if(fields!=null){
		      Iterator<GenericTextField> itf = this.fields.iterator();
		      while (itf.hasNext())
		      {
		         itf.next().createControl(page);
		      }
	      }

	      // Hook for creating additional controls
	      addCustomFields(page);

	      // Instructions for tree
	      GridData expData = new GridData(SWT.BEGINNING, SWT.BEGINNING, false,
	            false);
	      expData.horizontalSpan = 2;
	      explanationLabel = new Label(page, SWT.NONE);
	      explanationLabel.setText(explanation);
	      explanationLabel.setLayoutData(expData);


	      // Show description on opening
	      setErrorMessage(null);
	      setMessage(null);
	      setControl(page);

	      initialized = true;

	      // Set focus to first text field if present
	      if(fields!=null){
		      Iterator<GenericTextField> ffd = this.fields.iterator();
		      if (ffd.hasNext())
		      {
		         ffd.next().setFocus();
		      }
	      }
	}
	
	/**
	* Subclasses can override this in order to add additional controls to the page.
	*/
	protected void addCustomFields(Composite page){}

	public void textFieldChanged(GenericTextField field)
	{
		fieldValues.put(field.getName(), field.getInput());
	  	updateState();
	}
	
	protected void updateState()
	{
		boolean isValid = true;
		if (selectionValid)
		{
			setErrorMessage(null);
		}

		if (getMinSelectionSize() > -1)
		{
			if (selectionValues.size() >= getMinSelectionSize()
		     	&& (getMaxSelectionSize() == -1 || selectionValues.size() <= getMaxSelectionSize()))
		  	{
				isValid &= selectionValid;
		    }
			else
		   	{
				isValid = false;
		    }
		}

		Iterator<GenericTextField> itf = this.fields.iterator();
		while (itf.hasNext())
		{
		 	isValid &= checkField(itf.next());
		}

		setPageComplete(isValid);
		// WORKAROUND to prevent NPE in org.eclipse.jface.wizard.WizardDialog
		if (getWizard().getContainer().getCurrentPage() != null)
		{
			getWizard().getContainer().updateButtons();
		}
	}
	   
	protected boolean checkField(GenericTextField field)
	{
		if (!field.isValid())
	   	{
	      	if (selectionValid)
	    	{
	         	setErrorMessage("The " + field.getLabel().toLowerCase()
	                  + " is required. Please enter a "
	                  + field.getLabel().toLowerCase() + ".");
	       	}
	        return false;
	   	}

		// Delegate the specific checks (is name unique, etc.) to wizard
		if (this.getWizard() instanceof AbstractWizard)
		{
			String error = ((AbstractWizard) this.getWizard())
	               .validateField(field.getName(), field.getInput());
			if (error != null)
	        {
	           if (selectionValid)
	           {
	               setErrorMessage(error);
	           }
	           return false;
	        }
	    }
		return true;
	}

	public IStructuredSelection getSelection() {
		return selection;
	}
}
