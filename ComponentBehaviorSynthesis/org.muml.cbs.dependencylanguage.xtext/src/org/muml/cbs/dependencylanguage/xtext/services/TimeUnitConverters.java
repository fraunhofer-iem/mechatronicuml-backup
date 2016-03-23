/**
 * @author Sebastian Goschin
 */
package org.muml.cbs.dependencylanguage.xtext.services;

import java.util.concurrent.TimeUnit;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;

public class TimeUnitConverters extends Ecore2XtextTerminalConverters {
	@ValueConverter(rule = "TimeUnit")
	public IValueConverter<TimeUnit> TimeUnit() {
		return new AbstractNullSafeConverter<TimeUnit>() {
			@Override
			protected TimeUnit internalToValue(String string, INode node) {
				if(string.equals("ns")) {
					return TimeUnit.NANOSECONDS;
				}
				if(string.equals("µs")) {
					return TimeUnit.MICROSECONDS;
				}
				if(string.equals("ms")) {
					return TimeUnit.MILLISECONDS;
				}
				if(string.equals("s")) {
					return TimeUnit.SECONDS;
				}
				if(string.equals("m")) {
					return TimeUnit.MINUTES;
				}
				if(string.equals("h")) {
					return TimeUnit.HOURS;
				}
				if(string.equals("D")) {
					return TimeUnit.DAYS;
				}
				return TimeUnit.MILLISECONDS;
			}

	
			@Override
			protected String internalToString(
					java.util.concurrent.TimeUnit value) {
				switch(value){
				case NANOSECONDS:
					return "ns";
				
				case DAYS:
					return "D";
				
				case HOURS:
					return "h";

				case MICROSECONDS:
					return "µs";
					
				case MILLISECONDS:
					return "ms";
					
				case MINUTES:
					return "m";
					
				case SECONDS:
					return "s";
					
				default:
					return "ms";
				}
			}
		};
	}
}
