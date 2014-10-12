package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.custom.edit.helper;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;

import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable;

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
