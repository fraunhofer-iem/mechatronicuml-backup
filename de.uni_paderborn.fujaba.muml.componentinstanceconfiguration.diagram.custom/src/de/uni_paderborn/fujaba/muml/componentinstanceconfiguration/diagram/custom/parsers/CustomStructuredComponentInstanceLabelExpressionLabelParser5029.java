package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.parsers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.parsers.StructuredComponentInstanceLabelExpressionLabelParser5029;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;

public class CustomStructuredComponentInstanceLabelExpressionLabelParser5029
		extends StructuredComponentInstanceLabelExpressionLabelParser5029 {
	@Override
	protected IStatus updateValues(EObject target, String newString)
			throws ExecutionException {
		((ComponentInstance) target).setName(newString);
		return Status.OK_STATUS;
	}
}
