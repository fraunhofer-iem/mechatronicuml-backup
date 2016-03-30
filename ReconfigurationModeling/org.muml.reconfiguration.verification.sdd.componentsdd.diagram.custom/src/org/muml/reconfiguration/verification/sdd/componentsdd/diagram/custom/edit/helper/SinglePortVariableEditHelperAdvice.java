package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.custom.edit.helper;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.muml.reconfiguration.componentstorypattern.ComponentVariable;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.reconfiguration.componentstorypattern.MultiPortVariable;
import org.muml.reconfiguration.componentstorypattern.PartVariable;
import org.muml.reconfiguration.componentstorypattern.SinglePortVariable;

public class SinglePortVariableEditHelperAdvice extends
		AbstractEditHelperAdvice {

	@Override
	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {
		return new ConfigureElementCommand(request) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				SinglePortVariable singlePortVariable = (SinglePortVariable) request
						.getElementToConfigure();
				MultiPortVariable multiPortVariable = singlePortVariable
						.getMultiPortVariable();
				if (multiPortVariable != null) {
					EObject container = multiPortVariable.eContainer();
					if (ComponentstorypatternPackage.Literals.COMPONENT_VARIABLE
							.isSuperTypeOf(container.eClass())) {
						ComponentVariable componentVariable = (ComponentVariable) container;
						componentVariable.getPortVariables().add(
								singlePortVariable);
					} else if (ComponentstorypatternPackage.Literals.PART_VARIABLE
							.isSuperTypeOf(container.eClass())) {
						PartVariable partVariable = (PartVariable) container;
						partVariable.getPortVariables().add(singlePortVariable);
					}
				}
				return CommandResult.newOKCommandResult(singlePortVariable);
			}

		};
	}

}
