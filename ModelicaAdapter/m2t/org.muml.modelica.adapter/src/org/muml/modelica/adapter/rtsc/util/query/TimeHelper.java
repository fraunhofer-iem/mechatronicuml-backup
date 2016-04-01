package org.muml.modelica.adapter.rtsc.util.query;

import org.muml.pim.valuetype.TimeValue;

public class TimeHelper {
	public double getFactor(TimeValue timeValue) {
		if (timeValue == null || timeValue.getUnit() == null) {
			return 1;
		}
		switch (timeValue.getUnit()) {
		case DAYS:
			return 86.400;
		case HOURS:
			return 3600;
		case MINUTES:
			return 60;
		case SECONDS:
			return 1;
		case MILLISECONDS:
			return Math.pow(10, -3);
		case MICROSECONDS:
			return Math.pow(10, -6);
		case NANOSECONDS:
			return Math.pow(10, -9);
		default:
			// should not happen
			return 1;
		}
	}
}