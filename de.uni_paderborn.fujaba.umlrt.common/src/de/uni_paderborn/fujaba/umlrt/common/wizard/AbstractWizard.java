package de.uni_paderborn.fujaba.umlrt.common.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

public abstract class AbstractWizard extends Wizard implements
      IWorkbenchWizard
{
   // ///////////////////////////////////////////////////////////////
   // Extensible interface
   // ///////////////////////////////////////////////////////////////

   /**
    * @see org.eclipse.jface.wizard.IWizard#addPages()
    */
   @Override
   public abstract void addPages();


   /**
    * Overload this to customize the wizard title
    * 
    * @return Wizard Title
    */
   protected String getTitle()
   {
      return "Fujaba Wizard";
   }


   /**
    * Overload this method to check the current selection, return null if ok, the error message that
    * should be displayed otherwise
    * 
    * @param name the name of the selection
    * @param value the selected value
    * @return null or an error message
    */
   public String validate(String name, Object value)
   {
      return null;
   }


   /**
    * Overload this method to check the input in the specified text fields, return null if ok, the
    * error message that should be displayed otherwise
    * 
    * @param fieldName the name of the text field
    * @param input the value of the text field
    * @return null or an error message
    */
   public String validateField(String fieldName, String input)
   {
      return null;
   }


   /**
    * Overload this method to check the state of the specified check box, return null if ok, the
    * error message that should be displayed otherwise
    * 
    * @param fieldName the name of the check box field
    * @param input the selection state of the check box field
    * @return null or an error message
    */
   public String validateOption(String fieldName, boolean input)
   {
      return null;
   }

   // ///////////////////////////////////////////////////////////////
   // Implementation
   // ///////////////////////////////////////////////////////////////

   /**
    * The workbench.
    */
   private IWorkbench workbench;


   /**
    * The initial selection.
    */
   protected IStructuredSelection selection;


   /**
    * Creates an empty wizard for creating a new resource in the workspace.
    */
   protected AbstractWizard()
   {
      super();
   }


   /**
    * Returns the selection which was passed to <code>init</code>.
    * 
    * @return the selection
    */
   public IStructuredSelection getSelection()
   {
      return selection;
   }


   /**
    * Returns the workbench which was passed to <code>init</code>.
    * 
    * @return the workbench
    */
   public IWorkbench getWorkbench()
   {
      return workbench;
   }


   /**
    * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
    *      org.eclipse.jface.viewers.IStructuredSelection)
    */
   public void init(IWorkbench workbench, IStructuredSelection initialSelection)
   {
      this.workbench = workbench;
      this.selection = initialSelection;

      this.setWindowTitle(this.getTitle());
      this.setNeedsProgressMonitor(false);
   }


   public static final String GENERIC_PAGE = "GenericSelector";

   /**
    * Cache access to the generic page here
    */
   protected WizardPage genericPage = null;


   public WizardPage getGenericPage()
   {
      return genericPage;
   }


   /**
    * @see org.eclipse.jface.wizard.IWizard#performFinish()
    */
   @Override
   public boolean performFinish()
   {
      return true;
   }
}
