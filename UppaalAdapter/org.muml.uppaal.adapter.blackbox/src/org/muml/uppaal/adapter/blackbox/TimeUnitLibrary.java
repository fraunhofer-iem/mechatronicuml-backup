package org.muml.uppaal.adapter.blackbox;

import java.util.concurrent.TimeUnit;

public class TimeUnitLibrary {

	public TimeUnitLibrary() {}
	
	public int getUpscaleFactor(TimeUnit sourceTimeUnit, TimeUnit targetTimeUnit) {
		if(sourceTimeUnit == null || targetTimeUnit == null)
			throw new IllegalArgumentException("null argument was given");
		return (int)targetTimeUnit.convert(1l, sourceTimeUnit);
	}
	
}
