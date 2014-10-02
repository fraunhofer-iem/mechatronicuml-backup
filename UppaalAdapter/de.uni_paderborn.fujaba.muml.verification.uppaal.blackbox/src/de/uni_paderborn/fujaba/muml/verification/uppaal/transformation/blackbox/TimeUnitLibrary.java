package de.uni_paderborn.fujaba.muml.verification.uppaal.transformation.blackbox;

import java.util.concurrent.TimeUnit;

import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

public class TimeUnitLibrary {

	public TimeUnitLibrary() {}
	
	public int getUpscaleFactor(TimeUnit sourceTimeUnit, TimeUnit targetTimeUnit) {
		if(sourceTimeUnit == null || targetTimeUnit == null)
			throw new IllegalArgumentException("null argument was given");
		return (int)targetTimeUnit.convert(1l, sourceTimeUnit);
	}
	
}
