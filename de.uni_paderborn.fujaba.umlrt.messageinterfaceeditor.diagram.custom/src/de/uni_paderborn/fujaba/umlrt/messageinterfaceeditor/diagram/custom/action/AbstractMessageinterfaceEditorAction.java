package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.custom.action;

import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.uni_paderborn.fujaba.umlrt.common.action.AbstractAction;
import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.custom.part.CustomMessageinterfaceDiagramEditor;

public abstract class AbstractMessageinterfaceEditorAction extends AbstractAction implements
   IEditorActionDelegate, IObjectActionDelegate
{
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   private CustomMessageinterfaceDiagramEditor targetEditor;


   /**
    * Get the activeEditor attribute of the AbstractASGDiagramEditorAction object
    *
    * @return   The activeEditor value
    */
   protected CustomMessageinterfaceDiagramEditor getEditor()
   {
      return this.targetEditor;
   }


   /**
    * Get the commandStack attribute of the AbstractASGDiagramEditorAction object
    *
    * @return   The commandStack value
    */
   @Override
   protected CommandStack getCommandStack()
   {
      return (CommandStack) getEditor().getAdapter (CommandStack.class);
   }


   /**
    * @param action
    * @param targetEditor
    * @see                 org.eclipse.ui.IEditorActionDelegate#setActiveEditor(org.eclipse.jface.action.IAction, org.eclipse.ui.IEditorPart)
    */
   public void setActiveEditor (IAction action, IEditorPart targetEditor)
   {
      if (targetEditor != null && ! (targetEditor instanceof CustomMessageinterfaceDiagramEditor))
      {
         throw new IllegalArgumentException (
            "Expected targetEditor to be an instance of AbstractASGDiagramEditor, however, it is an instance of "
            + targetEditor.getClass());
      }
      this.action = action;
      this.targetEditor = (CustomMessageinterfaceDiagramEditor) targetEditor;
   }


   /**
    * @param action
    * @param targetPart
    * @see               org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction, org.eclipse.ui.IWorkbenchPart)
    */
   public void setActivePart (IAction action, IWorkbenchPart targetPart)
   {
      if (targetPart != null && ! (targetPart instanceof CustomMessageinterfaceDiagramEditor))
      {
         throw new IllegalArgumentException (
            "Expected targetPart to be an instance of AbstractASGDiagramEditor, however, it is an instance of "
            + targetPart.getClass());
      }
      this.action = action;
      this.targetEditor = (CustomMessageinterfaceDiagramEditor) targetPart;
   }
}
