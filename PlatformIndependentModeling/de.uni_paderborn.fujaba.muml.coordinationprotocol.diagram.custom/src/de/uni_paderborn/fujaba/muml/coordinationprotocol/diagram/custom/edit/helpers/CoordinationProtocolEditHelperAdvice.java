package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom.edit.helpers;

import java.util.concurrent.TimeUnit;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.ocl.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.common.CommonExpressionsFactory;
import org.storydriven.core.expressions.common.LiteralExpression;

import de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguageFactory;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.protocol.RoleConnector;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory;

/**
 * An EditHelperAdvice for Roles. It makes sure newly created Roles are
 * automatically connected to the CoordinationProtocol.
 * 
 * @author bingo
 * 
 */
public class CoordinationProtocolEditHelperAdvice extends AbstractEditHelperAdvice {

	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {

		return new ConfigureElementCommand(request) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				CoordinationProtocol coordinationProtocol = (CoordinationProtocol) request.getElementToConfigure();
				RoleConnector roleConnector = coordinationProtocol.getRoleConnector();
				if(roleConnector!=null){
					TimeValue maxDelay = ValuetypeFactory.eINSTANCE.createTimeValue();
								maxDelay.setUnit(TimeUnit.MILLISECONDS);
								LiteralExpression maxDelayExpression=CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
								maxDelayExpression.setValue("0");
								maxDelay.setValue(maxDelayExpression);
					TimeValue minDelay = ValuetypeFactory.eINSTANCE.createTimeValue();
								minDelay.setUnit(TimeUnit.MILLISECONDS);
								LiteralExpression minDelayExpression=CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
								minDelayExpression.setValue("0");
								minDelay.setValue(minDelayExpression);
				roleConnector.getConnectorQualityOfServiceAssumptions().setMaxMessageDelay(maxDelay);
				roleConnector.getConnectorQualityOfServiceAssumptions().setMinMessageDelay(minDelay);
								
				}
				return CommandResult.newOKCommandResult(coordinationProtocol);
			}

		};

	}
}
