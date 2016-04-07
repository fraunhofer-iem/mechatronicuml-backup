package org.muml.simulink.adapter.parser;

import org.muml.simulink.Element;
import org.muml.simulink.Parameter;
import org.muml.simulink.SimulinkFactory;

public abstract class BuilderBase 
{
	protected void copyParameters(edu.tum.cs.simulink.model.ParameterizedElement sourceElement, Element targetElement)
	{
		for(String paramName: sourceElement.getDeclaredParameterNames())
		{
			Parameter targetParam = SimulinkFactory.eINSTANCE.createParameter();
			targetParam.setName(paramName);
			targetParam.setValue(sourceElement.getParameter(paramName));
			
			targetElement.getParameters().add(targetParam);
		}				
	}
	
	/**
	 * Deletes a defined parameter from the given element
	 * @param element
	 * @param parameterName
	 * @return
	 */
	protected boolean deleteParameter(Element element, String parameterName)
	{		
		for(Parameter param: element.getParameters())
		{
			if(parameterName.equals(param.getName()))
			{
				return element.getParameters().remove(param);
			}
		}
		return false;
	}	
}
