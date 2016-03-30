package org.muml.pim.pattern.diagram.custom.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.TextualExpression;
import org.muml.pim.actionlanguage.xtext.common.LanguageResource;
import org.muml.pim.pattern.diagram.parsers.ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5009;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;
import org.muml.pim.valuetype.TimeValue;
import org.muml.pim.valuetype.impl.TimeValueImpl;
/**
 * custom parser that serializes the expression of the time value and prints it as a string for the corresponding label
 * @author sthiele2
 *
 */
public class CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5009 extends ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5009 {

	public String getPrintString(IAdaptable element, int flags) {
		String printString = "MaxDelay: ";
		ConnectorQualityOfServiceAssumptions quosa = (ConnectorQualityOfServiceAssumptions)element.getAdapter(EObject.class);		
		TimeValue maxDelay = quosa.getMaxMessageDelay();
		if(maxDelay == null)
			return "";
		Expression maxDelayExpr  = maxDelay.getValue();
		// serialize the expression to a string that can be displayed by the label
		if(maxDelayExpr != null)			
		{
			String expressionText = null;
			if(maxDelayExpr instanceof TextualExpression) 
			{
				expressionText = ((TextualExpression)maxDelayExpr).getExpressionText();
			}
			else
			{
				expressionText = LanguageResource.serializeEObjectSafe(maxDelayExpr, maxDelay);
			}
			if(expressionText !=null)
				printString+= expressionText;
		}		
		//add the time unit to the displayed string
		printString += " "+((TimeValueImpl)maxDelay).getUnitRepresentation(maxDelay.getUnit());
		return printString;
	}

}
