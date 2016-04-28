package org.muml.pim.messagetype.diagram.custom.parsers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.muml.mumlcore.NamedElement;
import org.muml.pim.messagetype.diagram.parsers.ParameterLabelExpressionLabelParser5016;

/**
 * @generated
 */
public class CustomParameterLabelExpressionLabelParser5016 extends
		ParameterLabelExpressionLabelParser5016 {

	@Override
	protected IStatus updateValues(EObject target, String newString)
			throws ExecutionException {
		((NamedElement) target).setName(newString);
		return Status.OK_STATUS;
	}

}
