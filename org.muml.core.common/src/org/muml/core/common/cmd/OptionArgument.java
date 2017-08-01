package org.muml.core.common.cmd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class OptionArgument<O extends Option<?>> {
		
	public abstract String getArgument();
	
	public List<String> getSegments() {
		
		List<String> segments = new ArrayList<String>();
				
		StringBuilder builder = new StringBuilder();
		
		builder.append(getArgument());
			
		List<? extends Parameter<?>> params = getParameters();
				
		for (Parameter<?> p : params) {
			
			builder.append(" ");
			
			if (p != null) {
			
				List<String> parSegments = p.getSegments();
				
				for (String s : parSegments) {
					builder.append(s);
					if (parSegments.indexOf(s) < parSegments.size()-1) {
						builder.append(" ");
					}
				}
				
			}
			
			if (params.indexOf(p) < params.size()-1) {
				builder.append(" ");
			}
			
		};
		
		if (builder.length() > 0) {
			segments.add(builder.toString());
		}
						
		return segments;
		
	}
	
	public List<? extends Parameter<?>> getParameters() {
		return Collections.emptyList();
	}
	
}
