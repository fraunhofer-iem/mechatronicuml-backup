package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.options.ParsingOptions;

/**
 * @generated
 */
public class MumlOCLFactory {

	/**
	 * @generated
	 */
	private final de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected MumlOCLFactory() {
		this.expressions = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlAbstractExpression[25];
		this.expressionBodies = new String[] {
				"\'entry /\'.concat(\n\t(\n\tif self.action.oclIsUndefined() or self.action.name = \'\' then\n\t\t\'\'\n\telse\n\t\t\' {\'.concat(self.action.name).concat(\'}\')\n\tendif\n\t).concat(\n\t\tif self.clockResets->isEmpty() then\n\t\t\t\'\'\n\t\telse\n\t\t\t\' {reset: \'.concat(self.clockResets->iterate(c : Clock; s : String = \'\' | if s = \'\' then s.concat(c.name) else s.concat(\', \').concat(c.name) endif)).concat(\'}\')\n\t\tendif\n\t)\n)", //$NON-NLS-1$
				"\'action\'", //$NON-NLS-1$
				"\'do / \'.concat(\r\n\tif self.action.oclIsUndefined() then\r\n\t\t\'\'\r\n\telse\r\n\t\t\'{\'.concat(self.action.name).concat(\'}\')\r\n\tendif\r\n).concat(\' [\').concat(\r\n\tif self.period.oclIsUndefined() then \'n.a.\' else self.period.toString() endif\r\n).concat(\']\')", //$NON-NLS-1$
				"\'exit /\'.concat(\n\t(\n\tif self.action.oclIsUndefined() or self.action.name = \'\' then\n\t\t\'\'\n\telse\n\t\t\' {\'.concat(self.action.name).concat(\'}\')\n\tendif\n\t).concat(\n\t\tif self.clockResets->isEmpty() then\n\t\t\t\'\'\n\t\telse\n\t\t\t\' {reset: \'.concat(self.clockResets->iterate(c : Clock; s : String = \'\' | if s = \'\' then s.concat(c.name) else s.concat(\', \').concat(c.name) endif)).concat(\'}\')\n\t\tendif\n\t)\n)", //$NON-NLS-1$
				"(\r\nif self.oclAsType(ecore::EObject).eContainer().oclAsType(State).invariants->first() = self then\r\n\t\'invariant: \'\r\nelse\r\n\t\'\'\r\nendif\r\n).concat(\r\n\r\n-- BEGIN: The actual name of the Invariant\r\n\r\n\tif self.clock.name.oclIsUndefined() then\r\n\t\t\'null\'\r\n\telse\r\n\t\tself.clock.name\r\n\tendif\r\n).concat(\' \').concat(\r\n\tif self.operator.oclIsUndefined() then\r\n\t\t\'null\'\r\n\telse\r\nif operator = core::expressions::common::ComparingOperator::LESS then \'<\'\r\n\telse if operator = core::expressions::common::ComparingOperator::LESS_OR_EQUAL then \'\u2264\' \r\n\t\telse if operator = core::expressions::common::ComparingOperator::EQUAL then \'=\'\r\n\t\t\telse if operator = core::expressions::common::ComparingOperator::GREATER_OR_EQUAL then \'\u2265\'\r\n\t\t\t\telse if operator = core::expressions::common::ComparingOperator::GREATER then \'>\'\r\n\t\t\t\t\telse if operator = core::expressions::common::ComparingOperator::UNEQUAL then \'\u2260\'\r\n\t\t\t\t\t\telse if operator = core::expressions::common::ComparingOperator::REGULAR_EXPRESSION then \'regexp\' \r\n\t\t\t\t\t\t\telse \'\'\r\n\t\t\t\t\t \t\tendif \r\n\t\t\t\t\t \tendif\r\n\t\t\t\t\tendif\r\n\t\t\t\tendif\r\n\t\t\tendif\r\n\t\tendif\r\n\tendif\r\n\t\t--let array : Set(Tuple(s : String, d : core::expressions::common::ComparingOperator)) = Set{\r\n\t\t--\tTuple{s = \'<\', d = core::expressions::common::ComparingOperator::LESS },\r\n\t\t--\tTuple{s = \'\u2264\', d = core::expressions::common::ComparingOperator::LESS_OR_EQUAL },\r\n\t\t--\tTuple{s = \'=\', d = core::expressions::common::ComparingOperator::EQUAL },\r\n\t\t--\tTuple{s = \'\u2265\', d = core::expressions::common::ComparingOperator::GREATER_OR_EQUAL },\r\n\t\t--\tTuple{s = \'>\', d = core::expressions::common::ComparingOperator::GREATER },\r\n\t\t--\tTuple{s = \'\u2260\', d = core::expressions::common::ComparingOperator::UNEQUAL },\r\n\t\t--\tTuple{s = \'regexp\', d = core::expressions::common::ComparingOperator::REGULAR_EXPRESSION }\r\n\t\t--} in array->any(t | t.d = self.operator).s\r\n\tendif\r\n).concat(\' \').concat(\r\n\tif self.bound.oclIsUndefined() then\r\n\t\t\'null\'\r\n\telse\r\n\t\t\'{boundExpression}\'.concat(\n\t\t\t-- the following will evaluate to an empty string and is only added so that the OCL impact analyzer recognizes\n\t\t\t-- a dependency to these attributes and updates the label in case they change.\n\t\t\t(if self.bound.unit.oclIsUndefined() then \'\' else \'\' endif).concat\n\t\t\t(if self.bound.value.oclIsUndefined() then \'\' else \'\' endif).concat\n\t\t\t(if self.bound.value.oclIsUndefined() then \'\' else \'\' endif)\n\t\t)\r\n\tendif\r\n\r\n-- END: The actual name of the invariant\r\n\r\n).concat(\r\nif self.oclAsType(ecore::EObject).eContainer().oclAsType(State).invariants->last() = self then\r\n\t\';\'\r\nelse\r\n\t\',\'\r\nendif\r\n)\r\n\r\n", //$NON-NLS-1$
				"(\r\nif self.state.channels->first() = self then\r\n\t\'channel: \'\r\nelse\r\n\t\'\'\r\nendif\r\n\r\n).concat(\r\n\tif self.name.oclIsUndefined() then \'null\' else self.name endif\r\n).concat(\r\n\tif self.selectorType.name.oclIsUndefined() then \'\' else \'[\'.concat(self.selectorType.name).concat(\']\') endif\r\n).concat(\r\nif self.state.channels->last() = self then\r\n\t\';\'\r\nelse\r\n\t\',\'\r\nendif\r\n)", //$NON-NLS-1$
				"self.parentState.embeddedRegions.priority->max() + 1", //$NON-NLS-1$
				"\'statechart\'", //$NON-NLS-1$
				"\'init\'", //$NON-NLS-1$
				"true", //$NON-NLS-1$
				"\'init\'", //$NON-NLS-1$
				"true", //$NON-NLS-1$
				"name", //$NON-NLS-1$
				"embeddedStatechart->collect(\r\n(\r\n\r\n-- Attributes\r\n\r\n\tif variables->isEmpty() then\r\n\t\t\'\'\r\n\telse\r\n\t\t\'variable: \'.concat(\r\n\t\t\tvariables->iterate(attribute; result : String = \'\' |\r\n\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\r\n\t\t\t\t\t(\r\n\t\t\t\t\t\tif attribute.dataType.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\t\'\'\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\tattribute.dataType.name.concat(\' \')\r\n\t\t\t\t\t\tendif\r\n\t\t\t\t\t).concat(\r\n\t\t\t\t\t\tif attribute.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\t\'\'\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\tattribute.name\r\n\t\t\t\t\t\tendif\r\n\t\t\t\t\t)\r\n\t\t\t\t)\r\n\t\t\t)\r\n\t\t).concat(\'; \')\r\n\tendif\r\n).concat(\r\n\r\n-- Operations\r\n\r\n\tif operations->isEmpty() then\r\n\t\t\'\'\r\n\telse\r\n\t\t\'operation: \'.concat(\r\n\t\t\toperations->iterate(operation; result : String = \'\' |\r\n\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\r\n\t\t\t\t\t(\r\n\t\t\t\t\t\tif operation.returnType.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\t\'\'\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\toperation.returnType.name.concat(\' \')\r\n\t\t\t\t\t\tendif\r\n\t\t\t\t\t).concat(\r\n\t\t\t\t\t\tif operation.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\t\'\'\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\toperation.name\r\n\t\t\t\t\t\tendif\r\n\t\t\t\t\t)\r\n\t\t\t\t).concat(\'(\').concat(\r\n\t\t\t\t\t-- parameters\r\n\t\t\t\t\toperation.parameters->iterate(parameter; result2 : String = \'\' |\r\n\t\t\t\t\t\t(if result2 = \'\' then \'\' else result2.concat(\', \') endif).concat(\r\n\t\t\t\t\t\t\t(\r\n\t\t\t\t\t\t\t\tif parameter.dataType.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\t\t\t\'\'\r\n\t\t\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\t\t\tparameter.dataType.name.concat(\' \')\r\n\t\t\t\t\t\t\t\tendif\r\n\t\t\t\t\t\t\t).concat(\r\n\t\t\t\t\t\t\t\tif parameter.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\t\t\t\'\'\r\n\t\t\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\t\t\tparameter.name\r\n\t\t\t\t\t\t\t\tendif\r\n\t\t\t\t\t\t\t)\r\n\t\t\t\t\t\t)\r\n\t\t\t\t\t)\r\n\t\t\t\t).concat(\')\')\r\n\t\t\t)\r\n\t\t).concat(\'; \')\r\n\tendif\r\n).concat(\r\n\r\n-- Clocks\r\n\r\n\tif clocks->isEmpty() then\r\n\t\t\'\'\r\n\telse\r\n\t\t\'clocks: \'.concat(\r\n\t\t\tclocks->iterate(clock; result : String = \'\' |\r\n\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\r\n\t\t\t\t\tif clock.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\'\'\r\n\t\t\t\t\telse\r\n\t\t\t\t\t\tclock.name\r\n\t\t\t\t\tendif\r\n\t\t\t\t)\r\n\t\t\t)\r\n\t\t).concat(\'; \')\r\n\tendif\r\n)\r\n)->any(true)", //$NON-NLS-1$
				"self->collect(\r\n(\r\n\r\n-- Attributes\r\n\r\n\tif variables->isEmpty() then\r\n\t\t\'\'\r\n\telse\r\n\t\t\'variable: \'.concat(\r\n\t\t\tvariables->iterate(attribute; result : String = \'\' |\r\n\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\r\n\t\t\t\t\t(\r\n\t\t\t\t\t\tif attribute.dataType.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\t\'\'\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\tattribute.dataType.name.concat(\' \')\r\n\t\t\t\t\t\tendif\r\n\t\t\t\t\t).concat(\r\n\t\t\t\t\t\tif attribute.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\t\'\'\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\tattribute.name\r\n\t\t\t\t\t\tendif\r\n\t\t\t\t\t)\r\n\t\t\t\t)\r\n\t\t\t)\r\n\t\t).concat(\'; \')\r\n\tendif\r\n).concat(\r\n\r\n-- Operations\r\n\r\n\tif operations->isEmpty() then\r\n\t\t\'\'\r\n\telse\r\n\t\t\'operation: \'.concat(\r\n\t\t\toperations->iterate(operation; result : String = \'\' |\r\n\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\r\n\t\t\t\t\t(\r\n\t\t\t\t\t\tif operation.returnType.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\t\'\'\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\toperation.returnType.name.concat(\' \')\r\n\t\t\t\t\t\tendif\r\n\t\t\t\t\t).concat(\r\n\t\t\t\t\t\tif operation.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\t\'\'\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\toperation.name\r\n\t\t\t\t\t\tendif\r\n\t\t\t\t\t)\r\n\t\t\t\t).concat(\'(\').concat(\r\n\t\t\t\t\t-- parameters\r\n\t\t\t\t\toperation.parameters->iterate(parameter; result2 : String = \'\' |\r\n\t\t\t\t\t\t(if result2 = \'\' then \'\' else result2.concat(\', \') endif).concat(\r\n\t\t\t\t\t\t\t(\r\n\t\t\t\t\t\t\t\tif parameter.dataType.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\t\t\t\'\'\r\n\t\t\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\t\t\tparameter.dataType.name.concat(\' \')\r\n\t\t\t\t\t\t\t\tendif\r\n\t\t\t\t\t\t\t).concat(\r\n\t\t\t\t\t\t\t\tif parameter.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\t\t\t\'\'\r\n\t\t\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\t\t\tparameter.name\r\n\t\t\t\t\t\t\t\tendif\r\n\t\t\t\t\t\t\t)\r\n\t\t\t\t\t\t)\r\n\t\t\t\t\t)\r\n\t\t\t\t).concat(\')\')\r\n\t\t\t)\r\n\t\t).concat(\'; \')\r\n\tendif\r\n).concat(\r\n\r\n-- Clocks\r\n\r\n\tif clocks->isEmpty() then\r\n\t\t\'\'\r\n\telse\r\n\t\t\'clock: \'.concat(\r\n\t\t\tclocks->iterate(clock; result : String = \'\' |\r\n\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\r\n\t\t\t\t\tif clock.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\'\'\r\n\t\t\t\t\telse\r\n\t\t\t\t\t\tclock.name\r\n\t\t\t\t\tendif\r\n\t\t\t\t)\r\n\t\t\t)\r\n\t\t).concat(\'; \')\r\n\tendif\r\n)\r\n)->any(true)", //$NON-NLS-1$
				"self.source.getUniqueTransitionPriority(0)", //$NON-NLS-1$
				"(\r\n-- Clock Constraints\r\n\r\n\tif self.clockConstraints->isEmpty() then\r\n\t\t\'\'\r\n\telse\r\n\t\t\'[\'.concat(\r\n\t\t\tself.clockConstraints->iterate(clockConstraint; result : String = \'\' | (\r\n\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\r\n\t\t\t\t\t(\r\n\t\t\t\t\t\tif clockConstraint.clock.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\t\'null\'\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\tclockConstraint.clock.name\r\n\t\t\t\t\t\tendif\r\n\t\t\t\t\t).concat(\' \').concat(\r\n\t\t\r\n\t\t\t\t\t\tif clockConstraint.operator.oclIsUndefined() then\r\n\t\t\t\t\t\t\t\'null\'\r\n\t\t\t\t\t\telse\r\nif clockConstraint.operator = core::expressions::common::ComparingOperator::LESS then \'<\'\r\n\telse if clockConstraint.operator = core::expressions::common::ComparingOperator::LESS_OR_EQUAL then \'\u2264\' \r\n\t\telse if clockConstraint.operator = core::expressions::common::ComparingOperator::EQUAL then \'=\'\r\n\t\t\telse if clockConstraint.operator = core::expressions::common::ComparingOperator::GREATER_OR_EQUAL then \'\u2265\'\r\n\t\t\t\telse if clockConstraint.operator = core::expressions::common::ComparingOperator::GREATER then \'>\'\r\n\t\t\t\t\telse if clockConstraint.operator = core::expressions::common::ComparingOperator::UNEQUAL then \'\u2260\'\r\n\t\t\t\t\t\telse if clockConstraint.operator = core::expressions::common::ComparingOperator::REGULAR_EXPRESSION then \'regexp\' \r\n\t\t\t\t\t\t\telse \'\'\r\n\t\t\t\t\t \t\tendif \r\n\t\t\t\t\t \tendif\r\n\t\t\t\t\tendif\r\n\t\t\t\tendif\r\n\t\t\tendif\r\n\t\tendif\r\n\tendif\r\n--\t\t\t\t\t\t\tlet array : Set(Tuple(s : String, d : core::expressions::common::ComparingOperator)) = Set{\r\n--\t\t\t\t\t\t\t\tTuple{s = \'<\', d = core::expressions::common::ComparingOperator::LESS },\r\n--\t\t\t\t\t\t\t\tTuple{s = \'\u2264\', d = core::expressions::common::ComparingOperator::LESS_OR_EQUAL },\r\n--\t\t\t\t\t\t\t\tTuple{s = \'=\', d = core::expressions::common::ComparingOperator::EQUAL },\r\n--\t\t\t\t\t\t\t\tTuple{s = \'\u2265\', d = core::expressions::common::ComparingOperator::GREATER_OR_EQUAL },\r\n--\t\t\t\t\t\t\t\tTuple{s = \'>\', d = core::expressions::common::ComparingOperator::GREATER },\r\n--\t\t\t\t\t\t\t\tTuple{s = \'\u2260\', d = core::expressions::common::ComparingOperator::UNEQUAL },\r\n--\t\t\t\t\t\t\t\tTuple{s = \'regexp\', d = core::expressions::common::ComparingOperator::REGULAR_EXPRESSION }\r\n--\t\t\t\t\t\t\t} in array->any(t | t.d = clockConstraint.operator).s\r\n\t\t\t\t\t\tendif\r\n\t\t\r\n\t\t\t\t\t).concat(\' \').concat(\r\n\t\t\t\t\t\tif clockConstraint.bound.oclIsUndefined() then\r\n\t\t\t\t\t\t\t\'null\'\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\tclockConstraint.bound.toString()\r\n\t\t\t\t\t\tendif\r\n\t\t\t\t\t)\r\n\t\t\t\t)\r\n\t\t\t))\r\n\t\t).concat(\'] \')\r\n\tendif\r\n).concat(\r\n\r\n\t-- Guard\r\n\r\n\t-- Note: We use the XText Parser to build a String for the Guard Model-Element.\r\n\t-- For this purpose, the text \"{guardExpression}\" will be replaced in the custom parser within the \"realtimestatechart.diagram.custom\" project.\r\n\r\n\t-- this is a placeholder which is replaced after ocl parsing\r\n\t\'{guardExpression}\'\r\n\r\n\r\n).concat(\r\n\r\n-- Trigger Event\r\n\r\n\tif self.triggerMessageEvent.oclIsUndefined() then\r\n\t\t\'\'\r\n\telse\r\n\t\tif self.triggerMessageEvent.message.instanceOf.name.oclIsUndefined() then\r\n\t\t\t\'null \'\r\n\t\telse\r\n\t\t\tself.triggerMessageEvent.message.instanceOf.name.concat(\' \')\r\n\t\tendif\r\n\tendif\r\n).concat(\r\n\r\n-- Synchronizations\r\n\r\n\tif self.synchronization.oclIsUndefined() then\r\n\t\t\'\'\r\n\telse\r\n\t\t(\r\n\t\t\tif self.synchronization.syncChannel.name.oclIsUndefined() then\r\n\t\t\t\t\'null\'\r\n\t\t\telse\r\n\t\t\t\tself.synchronization.syncChannel.name\r\n\t\t\tendif\r\n\t\t).concat(\r\n\t\t\t-- this is a placeholder which is replaced after ocl parsing\r\n\t\t\t\'{synchronizationExpression}\'\r\n\t\t).concat(\r\n\t\t\tif self.synchronization.kind = SynchronizationKind::SEND then\r\n\t\t\t\t\'!\'\r\n\t\t\telse\r\n\t\t\t\t\'?\'\r\n\t\t\tendif\r\n\t\t)\r\n\tendif\r\n\r\n).concat(\r\n\r\n-- Slash (only shown, if one of the next parts is not null\r\n\r\n\tif self.action.oclIsUndefined() and self.raiseMessageEvent.oclIsUndefined() and self.clockResets->isEmpty() then\r\n\t\t\'\'\r\n\telse\r\n\t\t\' / \'\r\n\tendif\r\n\r\n).concat(\r\n\r\n-- Action\r\n\r\n\tif self.action.name.oclIsUndefined() then\r\n\t\t\'\'\r\n\telse\r\n\t\t\'{ \'.concat(\r\n\t\t\tself.action.name\r\n\t\t).concat(\' } \')\r\n\tendif\r\n\r\n\r\n).concat(\r\n\r\n-- Raise Event\r\n\r\n\tif self.raiseMessageEvent.oclIsUndefined() then\r\n\t\t\'\'\r\n\telse\r\n\t\t(\r\n\t\t\tif self.raiseMessageEvent.message.instanceOf.name.oclIsUndefined() then\r\n\t\t\t\t\'null\'\r\n\t\t\telse\r\n\t\t\t\tself.raiseMessageEvent.message.instanceOf.name\r\n\t\t\tendif\r\n\t\t).concat(\'(\').concat(\r\n\t\t\t-- this is a placeholder which is replaced after ocl parsing\r\n\t\t\t\'{raiseMessageEventParameterBinding}\'\r\n\t\t).concat(\') \'\r\n\t\t)\r\n\tendif\r\n\r\n).concat(\r\n\r\n-- Clock Resets\r\n\r\n\tif self.clockResets->isEmpty() then\r\n\t\t\'\'\r\n\telse\r\n\t\t\'{reset: \'.concat(\r\n\t\t\tself.clockResets->iterate(clockReset; result : String = \'\' | \r\n\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\r\n\t\t\t\t\tif clockReset.name.oclIsUndefined() then\r\n\t\t\t\t\t\t\'null\'\r\n\t\t\t\t\telse\r\n\t\t\t\t\t\tclockReset.name\r\n\t\t\t\t\tendif\r\n\t\t\t\t)\r\n\t\t\t)\r\n\t\t).concat(\'}\')\r\n\tendif\r\n\r\n)", //$NON-NLS-1$
				"(\n\n-- Relative Deadline\n\n\tif self.relativeDeadline.oclIsUndefined() then\n\t\t\'\'\n\telse\n\t\t\'[\'.concat(\n\t\t\tif self.relativeDeadline.lowerBound.value.oclIsUndefined() or self.relativeDeadline.lowerBound.unit.oclIsUndefined() then \'null\' else \'{relativeLowerBoundExpression}\' endif\n\t\t).concat(\';\').concat(\n\t\t\tif self.relativeDeadline.upperBound.value.oclIsUndefined() or self.relativeDeadline.upperBound.unit.oclIsUndefined() then \'null\' else \'{relativeUpperBoundExpression}\' endif\n\t\t).concat(\']\').concat(if not absoluteDeadlines->isEmpty() then \'\\n\' else \'\' endif)\n\tendif\n\n).concat(\n\n-- Absolute Deadlines\n--\tself.absoluteDeadlines->iterate(absoluteDeadline; result : String = \'\' |\n--\t\t(if result = \'\\n\' then \'\' else result.concat(\'\\n\') endif).concat(\n--\t\t\tif absoluteDeadline.clock.name.oclIsUndefined() then\n--\t\t\t\t\'\'\n--\t\t\telse\n--\t\t\t\tabsoluteDeadline.clock.name\n--\t\t\tendif\n--\t\t).concat(\' \u2208 [\').concat(\n--\t\t\tif absoluteDeadline.lowerBound.oclIsUndefined() then\n--\t\t\t\t\'null\'\n--\t\t\telse\n--\t\t\t\tabsoluteDeadline.lowerBound.toString()\n--\t\t\tendif\n--\t\t).concat(\';\').concat(\n--\t\t\tif absoluteDeadline.upperBound.oclIsUndefined() then \n--\t\t\t\t\'null\'\n--\t\t\telse\n--\t\t\t\tabsoluteDeadline.upperBound.toString()\n--\t\t\tendif\n--\t\t).concat(\']\')\n--\t)\n\n\t-- list features that we need to listen to (Impact Analyzer)\n\t(if self.absoluteDeadlines->isEmpty() then \'\' else \'\' endif).concat\n\t(if self.absoluteDeadlines->select(clock.name.toString().oclIsUndefined())->isEmpty() then \'\' else \'\' endif).concat\n\t(if self.absoluteDeadlines->select(lowerBound.value.oclIsUndefined())->isEmpty() then \'\' else \'\' endif).concat\n\t(if self.absoluteDeadlines->select(lowerBound.unit.oclIsUndefined())->isEmpty() then \'\' else \'\' endif).concat\n\t(if self.absoluteDeadlines->select(upperBound.value.oclIsUndefined())->isEmpty() then \'\' else \'\' endif).concat\n\t(if self.absoluteDeadlines->select(upperBound.unit.oclIsUndefined())->isEmpty() then \'\' else \'\' endif).concat\n\t(\'{absoluteDeadlinesExpression}\')\n)", //$NON-NLS-1$
				"-- Deactivated because StateEntryPoint has been deleted and logic changed.\n\n-- not (self.oclIsKindOf(EntryPoint) and (not oppositeEnd.oclIsKindOf(State))) and\n-- not (self.oclIsKindOf(ExitPoint) and (not oppositeEnd.oclIsKindOf(State)))\ntrue", //$NON-NLS-1$
				"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
				"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n\tlet provisionalName : String = prefix.concat(e.toString()) in\n\tif self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n\t\te + 1\n\telse\n\t\te\n\tendif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static MumlOCLFactory getInstance() {
		MumlOCLFactory instance = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.getInstance().getMumlOCLFactory();
		if (instance == null) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().setMumlOCLFactory(
							instance = new MumlOCLFactory());
		}
		return instance;
	}

	/**
	 * @generated
	 */
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlAbstractExpression getExpression(
			int index, EClassifier context, Map<String, EClassifier> environment) {
		MumlOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(
					cached.expressionBodies[index],
					context,
					environment == null ? Collections
							.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlAbstractExpression getExpression(
			String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlAbstractExpression getExpression(
			String body, EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression
			extends
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlAbstractExpression {

		/**
		 * @generated
		 */
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		 * @generated
		 */
		private OCLExpression oclExpression;

		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context,
				Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance
					.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		 * @generated
		 */
		private static void initCustomEnv(
				Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv,
					ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName,
						createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static Variable createVar(
				Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
