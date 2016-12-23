package org.muml.cbs.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

public class SynthesisJobChangeAdapter extends JobChangeAdapter implements Runnable {
	
	private IStatus status;
		
	public void done(IJobChangeEvent event) {
		
		status = event.getResult();
        
        Display.getDefault().asyncExec(this);
	
	}
	
	public void run() {
			String message = null;
			int image = MessageDialog.NONE;
			
			if (status.isOK()) {
				message = "Synthesis was successful.";
				image = MessageDialog.INFORMATION;
			}
			else {
				if (status.equals(Status.CANCEL_STATUS)) {
					message = "Synthesis was canceled.";
					image = MessageDialog.CANCEL;
				}	
				else {
					message = "Synthesis was insuccessful.";
					image = MessageDialog.ERROR;
				}	
		
			}
			
			MessageDialog messageDialog = new MessageDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Synthesis Result", null,
			        message, image,
			        new String[] { "Close" }, 1);
			
			messageDialog.open();
	}
}
