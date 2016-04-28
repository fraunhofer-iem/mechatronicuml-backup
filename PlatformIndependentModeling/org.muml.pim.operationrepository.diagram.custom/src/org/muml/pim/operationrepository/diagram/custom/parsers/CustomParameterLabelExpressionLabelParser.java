package org.muml.pim.operationrepository.diagram.custom.parsers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.muml.mumlcore.NamedElement;
import org.muml.pim.operationrepository.diagram.parsers.ParameterLabelExpressionLabelParser;

public class CustomParameterLabelExpressionLabelParser extends ParameterLabelExpressionLabelParser {

	@Override
	protected IStatus updateValues(EObject target, String newString)
			throws ExecutionException {
		((NamedElement) target).setName(newString);
		return Status.OK_STATUS;
	}
}
