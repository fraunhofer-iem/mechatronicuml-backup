package org.muml.simulink.adapter.parser;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Parses an labelString from a transition and returns the values.
 * 
 * Syntax: event [condition]{condition_action}/transition_action
 */
public class TransitionLabelParser 
{
	public class Label
	{
		String event 			= null;
		String[] condition 		= null;		
		String conditionAction 	= null; //Not used in the current meta model
		String transitionAction = null;
	}
	
	private final Pattern labelStringPattern = Pattern.compile("([^\\[{/]+?)?(\\\\n|\\p{Space})*(\\[([^\\]]+)\\])?(\\\\n|\\p{Space})*(\\{([^}]+)\\})?(\\\\n|\\p{Space})*(/(.+))?");
	
	private final static int LABELSTRING_EVENT 				= 1;
	private final static int LABELSTRING_CONDITION 			= 4;
	private final static int LABELSTRING_CONDITIONACTION 	= 7;
	private final static int LABELSTRING_TRANSITIONACTION 	= 10;

	public Label parseLabel(String labelString)
	{		
		Label result = new Label();
		
		Matcher matcher = this.labelStringPattern.matcher(labelString);
		
		if(matcher.matches())
		{
			if(matcher.group(LABELSTRING_EVENT) != null)
				result.event = matcher.group(LABELSTRING_EVENT).trim();
			
			if(matcher.group(LABELSTRING_CONDITION) != null)
				result.condition = this.splitConditions(matcher.group(LABELSTRING_CONDITION).trim());
			
			if(matcher.group(LABELSTRING_CONDITIONACTION) != null)
				result.conditionAction = matcher.group(LABELSTRING_CONDITIONACTION).trim();
			
			if(matcher.group(LABELSTRING_TRANSITIONACTION) != null)
				result.transitionAction = matcher.group(LABELSTRING_TRANSITIONACTION).trim();
		}
		
		return result;
	}
	
	protected String[] splitConditions(String condition)
	{
		List<String> conditions = new LinkedList<String>();
		
		int level = 0;
		int last = 0;
		for(int i=0; i < condition.length()-1; i++)
		{
			char currentChar = condition.charAt(i);
			if('(' == currentChar)
				level++;
			else if(')' == currentChar)
				level--;
			
			if(level == 0 &&  '&' == currentChar && '&' == condition.charAt(i+1) )
			{
				conditions.add(condition.substring(last, i));
				i += 2; // skip &&
				last = i;
			}					
		}
		//add last
		conditions.add(condition.substring(last));
		
		//Remove ()
		for(int i=0; i < conditions.size(); i++)
		{
			String cond = conditions.get(i).trim();
			if(cond.startsWith("(") && cond.endsWith(")"))
				cond = cond.substring(1, cond.length()-1);
			conditions.set(i, cond);
		}
		
		return conditions.toArray(new String[]{});
	}
}
