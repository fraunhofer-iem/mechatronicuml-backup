package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.parsers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.parsers.ParameterLabelExpressionLabelParser;

/**
 * @generated
 */
public class CustomParameterLabelExpressionLabelParser5011 extends
		ParameterLabelExpressionLabelParser {

	@Override
	protected IStatus updateValues(EObject target, String newString)
			throws ExecutionException {
		((NamedElement) target).setName(newString);
		return Status.OK_STATUS;
	}

}
