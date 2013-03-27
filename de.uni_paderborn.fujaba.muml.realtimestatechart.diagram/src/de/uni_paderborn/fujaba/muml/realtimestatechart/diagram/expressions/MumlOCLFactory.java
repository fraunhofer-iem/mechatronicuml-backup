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
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
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
	protected MumlOCLFactory() {
		this.expressions = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlAbstractExpression[22];
	}

	/**
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlAbstractExpression getExpression(
			int index, EClassifier context, Map<String, EClassifier> environment) {
		MumlOCLFactory cached = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.getInstance().getMumlOCLFactory();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().setMumlOCLFactory(
							cached = new MumlOCLFactory());
		}
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			final String[] exprBodies = new String[] {
					"--\'State\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'entry /\'.concat(\n--\t(\n--\tif self.action.oclIsUndefined() or self.action.name = \'\' then\n--\t\t\'\'\n--\telse\n--\t\t\' {\'.concat(self.action.name).concat(\'}\')\n--\tendif\n--\t).concat(\n--\t\tif self.clockResets->isEmpty() then\n--\t\t\t\'\'\n--\t\telse\n--\t\t\t\' {reset: \'.concat(self.clockResets->iterate(c : Clock; s : String = \'\' | if s = \'\' then s.concat(c.name) else s.concat(\', \').concat(c.name) endif)).concat(\'}\')\n--\t\tendif\n--\t)\n--)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'action\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'do / \'.concat(\n--\tif self.action.oclIsUndefined() then\n--\t\t\'\'\n--\telse\n--\t\t\'{\'.concat(self.action.name).concat(\'}\')\n--\tendif\n--).concat(\' [\').concat(\n--\tif self.periodLower.oclIsUndefined() then \'\' else self.periodLower.toString() endif\n--).concat(\';\').concat(\n--\tif self.periodUpper.oclIsUndefined() then \'\' else self.periodUpper.toString() endif\n--).concat(\']\')".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'exit /\'.concat(\n--\t(\n--\tif self.action.oclIsUndefined() or self.action.name = \'\' then\n--\t\t\'\'\n--\telse\n--\t\t\' {\'.concat(self.action.name).concat(\'}\')\n--\tendif\n--\t).concat(\n--\t\tif self.clockResets->isEmpty() then\n--\t\t\t\'\'\n--\t\telse\n--\t\t\t\' {reset: \'.concat(self.clockResets->iterate(c : Clock; s : String = \'\' | if s = \'\' then s.concat(c.name) else s.concat(\', \').concat(c.name) endif)).concat(\'}\')\n--\t\tendif\n--\t)\n--)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--(\n--if self.eContainer().oclAsType(State).invariants->first() = self then\n--\t\'inv: \'\n--else\n--\t\'\'\n--endif\n--).concat(\n--\n---- BEGIN: The actual name of the Invariant\n--\n--\tif self.clock.name.oclIsUndefined() then\n--\t\t\'null\'\n--\telse\n--\t\tself.clock.name\n--\tendif\n--).concat(\' \').concat(\n--\tif self.operator.oclIsUndefined() then\n--\t\t\'null\'\n--\telse\n--\t\tlet array : Set(Tuple(s : String, d : core::expressions::common::ComparingOperator)) = Set{\n--\t\t\tTuple{s = \'<\', d = core::expressions::common::ComparingOperator::LESS },\n--\t\t\tTuple{s = \'\u2264\', d = core::expressions::common::ComparingOperator::LESS_OR_EQUAL },\n--\t\t\tTuple{s = \'=\', d = core::expressions::common::ComparingOperator::EQUAL },\n--\t\t\tTuple{s = \'\u2265\', d = core::expressions::common::ComparingOperator::GREATER_OR_EQUAL },\n--\t\t\tTuple{s = \'>\', d = core::expressions::common::ComparingOperator::GREATER },\n--\t\t\tTuple{s = \'\u2260\', d = core::expressions::common::ComparingOperator::UNEQUAL },\n--\t\t\tTuple{s = \'regexp\', d = core::expressions::common::ComparingOperator::REGULAR_EXPRESSION }\n--\t\t} in array->any(t | t.d = self.operator).s\n--\tendif\n--).concat(\' \').concat(\n--\tif self.bound.oclIsUndefined() then\n--\t\t\'null\'\n--\telse\n--\t\tself.bound.toString()\n--\tendif\n--\n---- END: The actual name of the invariant\n--\n--).concat(\n--if self.eContainer().oclAsType(State).invariants->last() = self then\n--\t\';\'\n--else\n--\t\',\'\n--endif\n--)\n--\n--".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'channel\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--(\n--if self.state.channels->first() = self then\n--\t\'ch: \'\n--else\n--\t\'\'\n--endif\n--).concat(\n--\n---- BEGIN: The actual name of the Clock\n--\n--if self.name.oclIsUndefined() then \'null\' else self.name endif).concat(\n--\t\'(\'.concat(\n--\t\tself.parameters->iterate(param; result : String = \'\' | \n--\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\n--\t\t\t\tparam.name.concat(\' : \').concat(\n--\t\t\t\t\tif param.type.oclIsUndefined() then\n--\t\t\t\t\t\t\'null\'\n--\t\t\t\t\telse\n--\t\t\t\t\t\tparam.type.name\n--\t\t\t\t\tendif\n--\t\t\t\t)\n--\t\t\t)\n--\t\t)\n--\t).concat(\')\')\n--\n---- END: The actual name of the Clock\n--\n--).concat(\n--if self.state.channels->last() = self then\n--\t\';\'\n--else\n--\t\',\'\n--endif\n--)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.parentState.getUniqueRegionPriority(0)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'statechart\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'init\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--true".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'init\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--true".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--embeddedStatechart->collect(\n--(\n--\n---- Attributes\n--\n--\tif variables->isEmpty() then\n--\t\t\'\'\n--\telse\n--\t\t\'var: \'.concat(\n--\t\t\tvariables->iterate(attribute; result : String = \'\' |\n--\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\n--\t\t\t\t\t(\n--\t\t\t\t\t\tif attribute.dataType.name.oclIsUndefined() then\n--\t\t\t\t\t\t\t\'\'\n--\t\t\t\t\t\telse\n--\t\t\t\t\t\t\tattribute.dataType.name.concat(\' \')\n--\t\t\t\t\t\tendif\n--\t\t\t\t\t).concat(\n--\t\t\t\t\t\tif attribute.name.oclIsUndefined() then\n--\t\t\t\t\t\t\t\'\'\n--\t\t\t\t\t\telse\n--\t\t\t\t\t\t\tattribute.name\n--\t\t\t\t\t\tendif\n--\t\t\t\t\t)\n--\t\t\t\t)\n--\t\t\t)\n--\t\t).concat(\'; \')\n--\tendif\n--).concat(\n--\n---- Operations\n--\n--\tif operations->isEmpty() then\n--\t\t\'\'\n--\telse\n--\t\t\'op: \'.concat(\n--\t\t\toperations->iterate(operation; result : String = \'\' |\n--\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\n--\t\t\t\t\t(\n--\t\t\t\t\t\tif operation.returnType.name.oclIsUndefined() then\n--\t\t\t\t\t\t\t\'\'\n--\t\t\t\t\t\telse\n--\t\t\t\t\t\t\toperation.returnType.name.concat(\' \')\n--\t\t\t\t\t\tendif\n--\t\t\t\t\t).concat(\n--\t\t\t\t\t\tif operation.name.oclIsUndefined() then\n--\t\t\t\t\t\t\t\'\'\n--\t\t\t\t\t\telse\n--\t\t\t\t\t\t\toperation.name\n--\t\t\t\t\t\tendif\n--\t\t\t\t\t)\n--\t\t\t\t).concat(\'(\').concat(\n--\t\t\t\t\t-- parameters\n--\t\t\t\t\toperation.parameters->iterate(parameter; result2 : String = \'\' |\n--\t\t\t\t\t\t(if result2 = \'\' then \'\' else result2.concat(\', \') endif).concat(\n--\t\t\t\t\t\t\t(\n--\t\t\t\t\t\t\t\tif parameter.dataType.name.oclIsUndefined() then\n--\t\t\t\t\t\t\t\t\t\'\'\n--\t\t\t\t\t\t\t\telse\n--\t\t\t\t\t\t\t\t\tparameter.dataType.name.concat(\' \')\n--\t\t\t\t\t\t\t\tendif\n--\t\t\t\t\t\t\t).concat(\n--\t\t\t\t\t\t\t\tif parameter.name.oclIsUndefined() then\n--\t\t\t\t\t\t\t\t\t\'\'\n--\t\t\t\t\t\t\t\telse\n--\t\t\t\t\t\t\t\t\tparameter.name\n--\t\t\t\t\t\t\t\tendif\n--\t\t\t\t\t\t\t)\n--\t\t\t\t\t\t)\n--\t\t\t\t\t)\n--\t\t\t\t).concat(\')\')\n--\t\t\t)\n--\t\t).concat(\'; \')\n--\tendif\n--).concat(\n--\n---- Clocks\n--\n--\tif clocks->isEmpty() then\n--\t\t\'\'\n--\telse\n--\t\t\'cl: \'.concat(\n--\t\t\tclocks->iterate(clock; result : String = \'\' |\n--\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\n--\t\t\t\t\tif clock.name.oclIsUndefined() then\n--\t\t\t\t\t\t\'\'\n--\t\t\t\t\telse\n--\t\t\t\t\t\tclock.name\n--\t\t\t\t\tendif\n--\t\t\t\t)\n--\t\t\t)\n--\t\t).concat(\'; \')\n--\tendif\n--)\n--)->any(true)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'entry\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--\'exit\'".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self->collect(\n--(\n--\n---- Attributes\n--\n--\tif variables->isEmpty() then\n--\t\t\'\'\n--\telse\n--\t\t\'var: \'.concat(\n--\t\t\tvariables->iterate(attribute; result : String = \'\' |\n--\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\n--\t\t\t\t\t(\n--\t\t\t\t\t\tif attribute.dataType.name.oclIsUndefined() then\n--\t\t\t\t\t\t\t\'\'\n--\t\t\t\t\t\telse\n--\t\t\t\t\t\t\tattribute.dataType.name.concat(\' \')\n--\t\t\t\t\t\tendif\n--\t\t\t\t\t).concat(\n--\t\t\t\t\t\tif attribute.name.oclIsUndefined() then\n--\t\t\t\t\t\t\t\'\'\n--\t\t\t\t\t\telse\n--\t\t\t\t\t\t\tattribute.name\n--\t\t\t\t\t\tendif\n--\t\t\t\t\t)\n--\t\t\t\t)\n--\t\t\t)\n--\t\t).concat(\'; \')\n--\tendif\n--).concat(\n--\n---- Operations\n--\n--\tif operations->isEmpty() then\n--\t\t\'\'\n--\telse\n--\t\t\'op: \'.concat(\n--\t\t\toperations->iterate(operation; result : String = \'\' |\n--\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\n--\t\t\t\t\t(\n--\t\t\t\t\t\tif operation.returnType.name.oclIsUndefined() then\n--\t\t\t\t\t\t\t\'\'\n--\t\t\t\t\t\telse\n--\t\t\t\t\t\t\toperation.returnType.name.concat(\' \')\n--\t\t\t\t\t\tendif\n--\t\t\t\t\t).concat(\n--\t\t\t\t\t\tif operation.name.oclIsUndefined() then\n--\t\t\t\t\t\t\t\'\'\n--\t\t\t\t\t\telse\n--\t\t\t\t\t\t\toperation.name\n--\t\t\t\t\t\tendif\n--\t\t\t\t\t)\n--\t\t\t\t).concat(\'(\').concat(\n--\t\t\t\t\t-- parameters\n--\t\t\t\t\toperation.parameters->iterate(parameter; result2 : String = \'\' |\n--\t\t\t\t\t\t(if result2 = \'\' then \'\' else result2.concat(\', \') endif).concat(\n--\t\t\t\t\t\t\t(\n--\t\t\t\t\t\t\t\tif parameter.dataType.name.oclIsUndefined() then\n--\t\t\t\t\t\t\t\t\t\'\'\n--\t\t\t\t\t\t\t\telse\n--\t\t\t\t\t\t\t\t\tparameter.dataType.name.concat(\' \')\n--\t\t\t\t\t\t\t\tendif\n--\t\t\t\t\t\t\t).concat(\n--\t\t\t\t\t\t\t\tif parameter.name.oclIsUndefined() then\n--\t\t\t\t\t\t\t\t\t\'\'\n--\t\t\t\t\t\t\t\telse\n--\t\t\t\t\t\t\t\t\tparameter.name\n--\t\t\t\t\t\t\t\tendif\n--\t\t\t\t\t\t\t)\n--\t\t\t\t\t\t)\n--\t\t\t\t\t)\n--\t\t\t\t).concat(\')\')\n--\t\t\t)\n--\t\t).concat(\'; \')\n--\tendif\n--).concat(\n--\n---- Clocks\n--\n--\tif clocks->isEmpty() then\n--\t\t\'\'\n--\telse\n--\t\t\'cl: \'.concat(\n--\t\t\tclocks->iterate(clock; result : String = \'\' |\n--\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\n--\t\t\t\t\tif clock.name.oclIsUndefined() then\n--\t\t\t\t\t\t\'\'\n--\t\t\t\t\telse\n--\t\t\t\t\t\tclock.name\n--\t\t\t\t\tendif\n--\t\t\t\t)\n--\t\t\t)\n--\t\t).concat(\'; \')\n--\tendif\n--)\n--)->any(true)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--self.source.getUniqueTransitionPriority(0)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--(\n---- Clock Constraints\n--\n--\tif self.clockConstraints->isEmpty() then\n--\t\t\'\'\n--\telse\n--\t\t\'[\'.concat(\n--\t\t\tself.clockConstraints->iterate(clockConstraint; result : String = \'\' | (\n--\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\n--\t\t\t\t\t(\n--\t\t\t\t\t\tif clockConstraint.clock.name.oclIsUndefined() then\n--\t\t\t\t\t\t\t\'null\'\n--\t\t\t\t\t\telse\n--\t\t\t\t\t\t\tclockConstraint.clock.name\n--\t\t\t\t\t\tendif\n--\t\t\t\t\t).concat(\' \').concat(\n--\t\t\n--\t\t\t\t\t\tif clockConstraint.operator.oclIsUndefined() then\n--\t\t\t\t\t\t\t\'null\'\n--\t\t\t\t\t\telse\n--\t\t\t\t\t\t\tlet array : Set(Tuple(s : String, d : core::expressions::common::ComparingOperator)) = Set{\n--\t\t\t\t\t\t\t\tTuple{s = \'<\', d = core::expressions::common::ComparingOperator::LESS },\n--\t\t\t\t\t\t\t\tTuple{s = \'\u2264\', d = core::expressions::common::ComparingOperator::LESS_OR_EQUAL },\n--\t\t\t\t\t\t\t\tTuple{s = \'=\', d = core::expressions::common::ComparingOperator::EQUAL },\n--\t\t\t\t\t\t\t\tTuple{s = \'\u2265\', d = core::expressions::common::ComparingOperator::GREATER_OR_EQUAL },\n--\t\t\t\t\t\t\t\tTuple{s = \'>\', d = core::expressions::common::ComparingOperator::GREATER },\n--\t\t\t\t\t\t\t\tTuple{s = \'\u2260\', d = core::expressions::common::ComparingOperator::UNEQUAL },\n--\t\t\t\t\t\t\t\tTuple{s = \'regexp\', d = core::expressions::common::ComparingOperator::REGULAR_EXPRESSION }\n--\t\t\t\t\t\t\t} in array->any(t | t.d = clockConstraint.operator).s\n--\t\t\t\t\t\tendif\n--\t\t\n--\t\t\t\t\t).concat(\' \').concat(\n--\t\t\t\t\t\tif clockConstraint.bound.oclIsUndefined() then\n--\t\t\t\t\t\t\t\'null\'\n--\t\t\t\t\t\telse\n--\t\t\t\t\t\t\tclockConstraint.bound.toString()\n--\t\t\t\t\t\tendif\n--\t\t\t\t\t)\n--\t\t\t\t)\n--\t\t\t))\n--\t\t).concat(\'] \')\n--\tendif\n--).concat(\n--\n--\t-- Guard\n--\n--\t-- Note: We use the XText Parser to build a String for the Guard Model-Element.\n--\t-- For this purpose, the variable \"guardExpression\" has been defined in the Custom OCL-Environment in the \"realtimestatechart.diagram.custom\" project.\n--\n---- DEACTIVATED BECAUSE OF MUML #516\n----\tif guardExpression.oclIsUndefined() or guardExpression = \'\' then\n----\t\t\'\'\n----\telse\n----\t\t\'[\'.concat(guardExpression).concat(\'] \')\n----\tendif\n--\'\'\n--\n--).concat(\n--\n---- Trigger Event\n--\n--\tif self.triggerMessageEvent.oclIsUndefined() then\n--\t\t\'\'\n--\telse\n--\t\tif self.triggerMessageEvent.message.instanceOf.name.oclIsUndefined() then\n--\t\t\t\'null\'\n--\t\telse\n--\t\t\tself.triggerMessageEvent.message.instanceOf.name.concat(\' \')\n--\t\tendif\n--\tendif\n--).concat(\n--\n---- Synchronizations\n--\n--\tif self.synchronization.oclIsUndefined() then\n--\t\t\'\'\n--\telse\n--\t\t(\n--\t\t\tif self.synchronization.syncChannel.name.oclIsUndefined() then\n--\t\t\t\t\'null\'\n--\t\t\telse\n--\t\t\t\tself.synchronization.syncChannel.name\n--\t\t\tendif\n--\t\t).concat(\n----\t\t\tif self.synchronization.parameterBinding->isEmpty() then\n----\t\t\t\t\'\'\n----\t\t\telse\n----\t\t\t\t\'(\'\n----\t\t\tendif\n----\t\t).concat(\n----\t\t\t-- defined in a custom OCL env\n----\t\t\tsynchronizationParameterBinding\n----\t\t).concat(\n----\t\t\tif self.synchronization.parameterBinding->isEmpty() then\n----\t\t\t\t\'\'\n----\t\t\telse\n----\t\t\t\t\')\'\n----\t\t\tendif\n----\t\t).concat(\n--\t\t\tif self.synchronization.kind = SynchronizationKind::SEND then\n--\t\t\t\t\'!\'\n--\t\t\telse\n--\t\t\t\t\'?\'\n--\t\t\tendif\n--\t\t)\n--\tendif\n--\n--).concat(\n--\n---- Slash (only shown, if one of the next parts is not null\n--\n--\tif self.action.oclIsUndefined() and self.raiseMessageEvent.oclIsUndefined() and self.clockResets->isEmpty() then\n--\t\t\'\'\n--\telse\n--\t\t\' / \'\n--\tendif\n--\n--).concat(\n--\n---- Action\n--\n--\tif self.action.name.oclIsUndefined() then\n--\t\t\'\'\n--\telse\n--\t\t\'{ \'.concat(\n--\t\t\tself.action.name\n--\t\t).concat(\' }\')\n--\tendif\n--\n--\n--).concat(\n--\n---- Raise Event\n--\n--\tif self.raiseMessageEvent.oclIsUndefined() then\n--\t\t\'\'\n--\telse\n--\t\t(\n--\t\t\tif self.raiseMessageEvent.message.instanceOf.name.oclIsUndefined() then\n--\t\t\t\t\'null\'\n--\t\t\telse\n--\t\t\t\tself.raiseMessageEvent.message.instanceOf.name\n--\t\t\tendif\n---- DEACTIVATED BECAUSE OF MUML #516\n----\t\t).concat(\'(\').concat(\n----\t\t\t-- defined in a custom OCL env\n----\t\t\traiseMessageEventParameterBinding\n----\t\t).concat(\') \'\n--\t\t)\n--\tendif\n--\n--).concat(\n--\n---- Clock Resets\n--\n--\tif self.clockResets->isEmpty() then\n--\t\t\'\'\n--\telse\n--\t\t\'{reset: \'.concat(\n--\t\t\tself.clockResets->iterate(clockReset; result : String = \'\' | \n--\t\t\t\t(if result = \'\' then \'\' else result.concat(\', \') endif).concat(\n--\t\t\t\t\tif clockReset.name.oclIsUndefined() then\n--\t\t\t\t\t\t\'null\'\n--\t\t\t\t\telse\n--\t\t\t\t\t\tclockReset.name\n--\t\t\t\t\tendif\n--\t\t\t\t)\n--\t\t\t)\n--\t\t).concat(\'}\')\n--\tendif\n--\n--)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--(\n--\n---- Relative Deadline\n--\n--\tif self.relativeDeadline.oclIsUndefined() then\n--\t\t\'\'\n--\telse\n--\t\t\'[\'.concat(\n--\t\t\tif self.relativeDeadline.lowerBound.oclIsUndefined() then \'null\' else self.relativeDeadline.lowerBound.toString() endif\n--\t\t).concat(\';\').concat(\n--\t\t\tif self.relativeDeadline.upperBound.oclIsUndefined() then \'null\' else self.relativeDeadline.upperBound.toString() endif\n--\t\t).concat(\']\')\n--\tendif\n--\n--).concat(\n--\n---- Absolute Deadlines\n--\n--\tself.absoluteDeadlines->iterate(absoluteDeadline; result : String = \'\' |\n--\t\t(if result = \'\\n\' then \'\' else result.concat(\'\\n\') endif).concat(\n--\t\t\tif absoluteDeadline.clock.name.oclIsUndefined() then\n--\t\t\t\t\'\'\n--\t\t\telse\n--\t\t\t\tabsoluteDeadline.clock.name\n--\t\t\tendif\n--\t\t).concat(\' \u2208 [\').concat(\n--\t\t\tif absoluteDeadline.lowerBound.oclIsUndefined() then\n--\t\t\t\t\'null\'\n--\t\t\telse\n--\t\t\t\tabsoluteDeadline.lowerBound.toString()\n--\t\t\tendif\n--\t\t).concat(\';\').concat(\n--\t\t\tif absoluteDeadline.upperBound.oclIsUndefined() then \n--\t\t\t\t\'null\'\n--\t\t\telse\n--\t\t\t\tabsoluteDeadline.upperBound.toString()\n--\t\t\tendif\n--\t\t).concat(\']\')\n--\t)\n--)".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
					"--not (self.oclIsKindOf(EntryPoint) and (not oppositeEnd.oclIsKindOf(State))) and\n--not (self.oclIsKindOf(ExitPoint) and (not oppositeEnd.oclIsKindOf(State)))".substring(2).replaceAll("\n--", "\n"), //$NON-NLS-1$
			};
			cached.expressions[index] = getExpression(
					exprBodies[index],
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
