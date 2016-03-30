package org.muml.testlanguage.custom.validation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;

public class ValidationRunnable implements IRunnableWithProgress {
	
	public static void runWithShell(ValidationRunnable validation, Shell shell)
	{
		try {
			ProgressMonitorDialog monitor = new ProgressMonitorDialog(shell);
			monitor.setCancelable(false);
			monitor.run(true, true, validation);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private IStatus status = null;
	private View view;
	private IBatchValidator validator;
	
	public ValidationRunnable(View view, IBatchValidator validator)
	{
		super();
		this.view = view;
		this.validator = validator;
	}

	public IStatus getStatus() {
		return this.status;
	}

	@Override
	public void run(IProgressMonitor monitor)
			throws InvocationTargetException, InterruptedException {

		this.status = validator.validate(this.view.getElement(), monitor);

	}
}