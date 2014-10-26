package de.uni_paderborn.fujaba.muml.swplatform.oslanguage.valueconverter;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;


public class SWPlatformTerminalConverter extends DefaultTerminalConverters {
	private HashMap<String, TimeUnit> strToTimeUnit = new HashMap<String, TimeUnit>();
	private HashMap<TimeUnit, String> timeUnitToStr = new HashMap<TimeUnit, String>();
	
	public SWPlatformTerminalConverter() { 
		TimeUnit[] timeUnits = {TimeUnit.DAYS, TimeUnit.HOURS, TimeUnit.MICROSECONDS,
				TimeUnit.MILLISECONDS, TimeUnit.MINUTES, TimeUnit.NANOSECONDS, TimeUnit.SECONDS};
		String[] timeUnitStrings = {"days", "hours", "µs", "ms", "m", "ns", "s"};
		
		for (int i=0;i<timeUnits.length;i++) {
			strToTimeUnit.put(timeUnitStrings[i], timeUnits[i]);
			timeUnitToStr.put(timeUnits[i], timeUnitStrings[i]);
		}
	}
	
	@ValueConverter(rule = "TimeUnitExpr")
	public IValueConverter<TimeUnit> getTimeUnitExprConverter() {
		return new IValueConverter<TimeUnit>() {
			
			@Override
			public TimeUnit toValue(String string, INode node) throws ValueConverterException {
				return strToTimeUnit.get(string);
			}
			
			@Override
			public String toString(TimeUnit value)
					throws ValueConverterException {
				return timeUnitToStr.get(value);
			}
		};
	}
}
