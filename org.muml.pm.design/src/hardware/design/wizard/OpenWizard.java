package hardware.design.wizard;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.PlatformUI;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.platforminstance.diagram.custom.wizard.PlatformInstanceWizard;

public class OpenWizard implements IExternalJavaAction {

	public OpenWizard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

		HWPlatformInstance hwplatformInstance = (HWPlatformInstance) parameters.get("self");

		HWPlatformInstanceConfiguration hwplatformInstanceConfig = (HWPlatformInstanceConfiguration) hwplatformInstance
				.getParentHPIC();

		// Create wizard
		INewWizard wizard = new PlatformInstanceWizard(hwplatformInstance, hwplatformInstanceConfig, TransactionUtil.getEditingDomain(hwplatformInstance));
		wizard.init(PlatformUI.getWorkbench(), null);
		// Open wizard dialog
		WizardDialog dialog = new WizardDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
		if (dialog.open() == Window.CANCEL) {
			throw new OperationCanceledException("Wizard Canceled");
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
