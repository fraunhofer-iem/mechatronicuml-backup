package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.parsers.ComponentInstanceLabelExpressionLabelParser5001;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;

public class CustomComponentInstanceLabelExpressionLabelParser5001 extends ComponentInstanceLabelExpressionLabelParser5001 {

	@Override
	protected IStatus updateValues(EObject target, String newString)
			throws ExecutionException {
		((ComponentInstance) target).setName(newString);
		return Status.OK_STATUS;
	}

}
