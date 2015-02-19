package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.ClockConstraintLabelExpressionLabelParser5053;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

public class CustomClockConstraintLabelExpressionLabelParser5053 extends ClockConstraintLabelExpressionLabelParser5053 {
	@Override
	public String getPrintString(IAdaptable element, int flags) {
		String printString = super.getPrintString(element, flags);
		ClockConstraint clockConstraint = (ClockConstraint) element.getAdapter(EObject.class);
		TimeValue timeValue = clockConstraint.getBound();
		if (timeValue != null) {
			printString = printString.replaceAll("\\{boundExpression\\}",
					ParserUtilities.serializeTimeValue(timeValue, clockConstraint.eContainer()));
		}
		return printString;
	}
}
