package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.TextualExpression;

import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.pattern.diagram.parsers.ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5008;
import de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;
import de.uni_paderborn.fujaba.muml.valuetype.impl.TimeValueImpl;
/**
 * custom parser that serializes the expression of the time value and prints it as a string for the corresponding label
 * @author sthiele2
 *
 */
public class CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5008 extends ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5008
{	
	public String getPrintString(IAdaptable element, int flags) {
		String printString ="MinDelay: ";
		ConnectorQualityOfServiceAssumptions quosa = (ConnectorQualityOfServiceAssumptions)element.getAdapter(EObject.class);
		TimeValue minDelay = quosa.getMinMessageDelay();
		if(minDelay == null)
			return "";
		Expression minDelayExpr  = minDelay.getValue();
		// serialize the expression to a string that can be displayed by the label
		if(minDelayExpr != null)			
		{
			String expressionText = null;
			if(minDelayExpr instanceof TextualExpression) 
			{
				expressionText = ((TextualExpression)minDelayExpr).getExpressionText();
			}
			else
			{
				expressionText = LanguageResource.serializeEObjectSafe(minDelayExpr, minDelay);
			}
			if(expressionText !=null)
				printString+= expressionText;
		}		
		//add the time unit to the displayed string
		printString += " "+ ((TimeValueImpl)minDelay).getUnitRepresentation(minDelay.getUnit());
		return printString;
	}
	
}
