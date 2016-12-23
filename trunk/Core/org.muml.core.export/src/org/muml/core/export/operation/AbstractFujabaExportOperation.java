package org.muml.core.export.operation;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;


/**
 *	Operation for exporting the contents of a resource to the local file system.
 */
public abstract class AbstractFujabaExportOperation implements IFujabaExportOperation{
	protected IStatus status = Status.CANCEL_STATUS;
	
    public AbstractFujabaExportOperation() {
    }

    public final void run(IProgressMonitor progressMonitor) throws InterruptedException {
   		status = doExecute(progressMonitor);
    }
    
    protected IStatus doExecute(IProgressMonitor progressMonitor) {
		return Status.OK_STATUS;
	}

	public IStatus getStatus() {
    	return status;
    }

}
