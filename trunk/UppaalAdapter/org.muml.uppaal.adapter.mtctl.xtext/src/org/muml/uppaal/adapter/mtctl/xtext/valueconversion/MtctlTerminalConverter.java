package org.muml.uppaal.adapter.mtctl.xtext.valueconversion;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;


public class MtctlTerminalConverter extends DefaultTerminalConverters {
	private HashMap<String, TimeUnit> strToTimeUnit = new HashMap<String, TimeUnit>();
	private HashMap<TimeUnit, String> timeUnitToStr = new HashMap<TimeUnit, String>();
	
	public MtctlTerminalConverter() { 
		TimeUnit[] timeUnits = {TimeUnit.DAYS, TimeUnit.HOURS, TimeUnit.MICROSECONDS,
				TimeUnit.MILLISECONDS, TimeUnit.MINUTES, TimeUnit.NANOSECONDS, TimeUnit.SECONDS};
		String[] timeUnitStrings = {"days", "hrs", "µsecs", "msecs", "mins", "nsecs", "secs"};
		
		for (int i=0;i<timeUnits.length;i++) {
			strToTimeUnit.put(timeUnitStrings[i], timeUnits[i]);
			timeUnitToStr.put(timeUnits[i], timeUnitStrings[i]);
		}
	}
	
	@ValueConverter(rule = "SL_COMMENT")
	public IValueConverter<String> getSL_COMMENTRuleConverter() {
	  return new IValueConverter<String>() {
		@Override
		public String toValue(String string, INode node) throws ValueConverterException {
			return string.substring(2).trim();
		}

		@Override
		public String toString(String value) throws ValueConverterException {
			return "//"+value;
		}
	  };
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
