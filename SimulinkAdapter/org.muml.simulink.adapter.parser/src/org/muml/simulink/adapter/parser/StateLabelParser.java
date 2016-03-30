package org.muml.simulink.adapter.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A parser for the Stateflow labelString attribute
 */
public class StateLabelParser 
{	
	public class LabelString
	{
		String name 		= null;
		String entryAction 	= null;
		String duringAction = null;
		String exitAction 	= null;
	}

	private final Pattern labelStringPattern = Pattern.compile("(.*?)((\\\\n((entry:(.*?))|(during:(.*?))|(exit:(.*?))))+)?");
	
	private static final int LABELSTRING_NAME 			= 1;
	private static final int LABELSTRING_ENTRY_ACTION 	= 6;
	private static final int LABELSTRING_DURING_ACTION 	= 8;
	private static final int LABELSTRING_EXIT_ACTION 	= 10;
		
	/**
	 * Parses an labelString attribute from Stateflow and returns the parts extracted
	 * from it.
	 * @param labelString
	 * @return LabelString
	 */
	public LabelString parseLabelString(String labelString)
	{
		LabelString result = new LabelString();
				
		Matcher labelMatcher = this.labelStringPattern.matcher(labelString);
		if(labelMatcher.matches())
		{
			if(labelMatcher.group(LABELSTRING_NAME) != null)
				result.name =  labelMatcher.group(LABELSTRING_NAME).trim();
			
			if(labelMatcher.group(LABELSTRING_ENTRY_ACTION) != null)
				result.entryAction = labelMatcher.group(LABELSTRING_ENTRY_ACTION).trim();
			
			if(labelMatcher.group(LABELSTRING_DURING_ACTION ) != null)
				result.duringAction = labelMatcher.group(LABELSTRING_DURING_ACTION).trim();
			
			if(labelMatcher.group(LABELSTRING_EXIT_ACTION) != null)
				result.exitAction= labelMatcher.group(LABELSTRING_EXIT_ACTION).trim();		
		}
		return result;
	}

}
