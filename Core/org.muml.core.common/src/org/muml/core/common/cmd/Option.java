package org.muml.core.common.cmd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Option<C extends Command> extends Parameter<C> {
	
	public abstract String getOption();
	
	public String getSign() {
		return "-";
	}
	
	public List<? extends OptionArgument<? extends Option<C>>> getArguments() {
		return Collections.emptyList();
	}
	
	@Override
	public List<String> getSegments() {
		return getSegmentsInternal();
	}
	
	public List<String> getSegmentsInternal() {
		
		List<String> segments = new ArrayList<String>();
		segments.add(getSign() + getOption());
		
		StringBuilder builder = new StringBuilder();
		
		List<? extends OptionArgument<? extends Option<C>>> args = getArguments();
		
		for (OptionArgument<? extends Option<C>> a : args) {
			
			if (a != null) {
			
				List<String> argSegments = a.getSegments();
				
				for (String s : argSegments) {
					builder.append(s);
	
					if (argSegments.indexOf(s) < argSegments.size()-1) {
						builder.append(" ");
					}
	
				}
				
				if (args.indexOf(a) < args.size()-1) {
					builder.append(" ");
				}
				
			}	
			
		};
		
		if (builder.length() > 0) {
			segments.add(builder.toString());
		}
		
		return segments;
		
	}

}
