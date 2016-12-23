package org.muml.pim.componentinstanceconfiguration.diagram.custom.parsers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.muml.pim.componentinstanceconfiguration.diagram.parsers.AtomicComponentInstanceLabelExpressionLabelParser5027;
import org.muml.pim.instance.ComponentInstance;

public class CustomAtomicComponentInstanceLabelExpressionLabelParser5027 extends
		AtomicComponentInstanceLabelExpressionLabelParser5027 {
	@Override
	protected IStatus updateValues(EObject target, String newString)
			throws ExecutionException {
		((ComponentInstance) target).setName(newString);
		return Status.OK_STATUS;
	}
}
