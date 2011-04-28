package de.uni_paderborn.fujaba.umlrt.common.wizard;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class GenericTextField implements ModifyListener
{
   private String name;
   private String label;
   private String input;

   protected Label labelElement;
   protected Text inputElement;

   private ITextFieldListener parent;

   private boolean required;


   public GenericTextField (ITextFieldListener parent, String name)
   {
      this (parent, name, name, true, "");
   }


   public GenericTextField (ITextFieldListener parent, String name, String label)
   {
      this (parent, name, label, true, "");
   }


   public GenericTextField (ITextFieldListener parent, String name, String label, boolean required)
   {
      this (parent, name, label, required, "");
   }


   public GenericTextField (ITextFieldListener parent, String name, String label, boolean required, String defaultValue)
   {
      this.name = name;
      this.label = label;
      this.input = defaultValue;
      this.parent = parent;
      this.required = required;
   }


   /**
    * @param container
    */
   public void createControl (Composite container)
   {
      GridData labelData = new GridData (SWT.BEGINNING, SWT.BEGINNING, false, false);

      labelElement = new Label (container, SWT.NONE);
      labelElement.setText (this.label + ": ");
      labelElement.setLayoutData (labelData);

      GridData inputData = new GridData (SWT.FILL, SWT.BEGINNING, true, false);

      inputElement = new Text (container, SWT.SINGLE | SWT.BORDER);
      inputElement.addModifyListener (this);
      inputElement.setLayoutData (inputData);
      inputElement.setText (input);
   }


   public void modifyText (ModifyEvent e)
   {
      this.input = inputElement.getText();
      this.parent.textFieldChanged (this);
   }


   /**
    * Set the focus on this text field
    */
   public void setFocus()
   {
      this.inputElement.setFocus();
   }


   /**
    * @return   the required
    */
   public boolean isRequired()
   {
      return required;
   }


   /**
    * @param required  the required to set
    */
   public void setRequired (boolean required)
   {
      this.required = required;
   }


   /**
    * @return   the valid
    */
   public boolean isValid()
   {
      if (input.equals ("") && required)
      {
         return false;
      }
      return true;
   }


   /**
    * @return   the input
    */
   public String getInput()
   {
      return input;
   }


   /**
    * @param input  the input to set
    */
   public void setInput (String input)
   {
      this.input = input;
      this.inputElement.setText (input);
   }


   /**
    * @return   the label
    */
   public String getLabel()
   {
      return label;
   }


   /**
    * @param label  the label to set
    */
   public void setLabel (String label)
   {
      this.label = label;
      this.labelElement.setText (this.label);
   }


   /**
    * @return   the name
    */
   public String getName()
   {
      return name;
   }
}

