package org.muml.psm.allocation.language.xtext.ui.view;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;

@SuppressWarnings("all")
public class OpenEvaluationContextWizardHandler extends BaseHandler {
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    try {
      Object _xblockexpression = null;
      {
        IWorkbenchWindow _activeWorkbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
        final IWorkbench workbench = _activeWorkbenchWindow.getWorkbench();
        final Shell shell = HandlerUtil.getActiveShell(event);
        final EvaluationContextWizard wizard = new EvaluationContextWizard();
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
        StructuredSelection _xifexpression = null;
        if ((selection instanceof StructuredSelection)) {
          _xifexpression = ((StructuredSelection) selection);
        } else {
          _xifexpression = StructuredSelection.EMPTY;
        }
        final StructuredSelection ssel = _xifexpression;
        wizard.init(workbench, ssel);
        final WizardDialog wizardDialog = new WizardDialog(shell, wizard);
        wizardDialog.open();
        IWorkbenchWindow _activeWorkbenchWindow_1 = HandlerUtil.getActiveWorkbenchWindow(event);
        IWorkbenchPage _activePage = _activeWorkbenchWindow_1.getActivePage();
        IViewPart _showView = _activePage.showView(BaseHandler.viewID);
        final AllocationSpecificationLanguageEvaluationView view = ((AllocationSpecificationLanguageEvaluationView) _showView);
        ComponentInstanceConfiguration _componentInstanceConfiguration = wizard.getComponentInstanceConfiguration();
        view.setCic(_componentInstanceConfiguration);
        HWPlatformInstanceConfiguration _hWPlatformInstanceConfiguration = wizard.getHWPlatformInstanceConfiguration();
        view.setHpic(_hWPlatformInstanceConfiguration);
        _xblockexpression = null;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
