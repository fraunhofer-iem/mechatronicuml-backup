
package org.muml.pim.component.diagram.custom.parsers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.tooling.runtime.ocl.tracker.OclTracker;
import org.muml.pim.component.HybridPort;
import org.muml.pim.component.diagram.parsers.HybridPortLabelExpressionLabelParser;

public class CustomHybridPortLabelExpressionLabelParser extends HybridPortLabelExpressionLabelParser {

	protected IStatus updateValues(EObject target, String newString) throws ExecutionException {
		((HybridPort)target).setName(newString);
		return Status.OK_STATUS;
	}
	
}
