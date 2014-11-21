package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.TextualExpression;

import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.parsers.ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5016;
import de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;
/**
 * custom parser that serializes the expression of the time value and prints it as a string for the corresponding label
 * @author sthiele2
 *
 */
public class CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5016 extends ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5016 {

	public String getPrintString(IAdaptable element, int flags) {
		String printString = "";
		ConnectorQualityOfServiceAssumptions quosa = (ConnectorQualityOfServiceAssumptions)element.getAdapter(EObject.class);		
		TimeValue maxDelay = quosa.getMaxMessageDelay();
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
				printString= expressionText;
		}		
		//add the time unit to the displayed string
		printString += " "+maxDelay.getUnit().toString();
		return printString;
	}

}
