/*******************************************************************************
 * Copyright (c) 2016 Fraunhofer IEM.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Johannes Geismann - initial implementation
 *    David Schmelter - migration to MechatronicUML 1.0, APP4MC 0.7.x
 *******************************************************************************/
package org.muml.pim.runnable.transformation.blackbox;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.muml.pim.valuetype.TimeValue;

public class TimeHelper {

	@Operation(contextual = true)
	public static Double getFactor(TimeValue timeValue) {

		if (timeValue == null || timeValue.getUnit() == null) {
			return 1.0d;
		}
		switch (timeValue.getUnit()) {
		case DAYS:
			return 86400000.0d;
		case HOURS:
			return 3600000.0d;
		case MINUTES:
			return 60000.0d;
		case SECONDS:
			return 1000.0d;
		case MILLISECONDS:
			return 1.0d;
		case MICROSECONDS:
			return Math.pow(10, -3);
		case NANOSECONDS:
			return Math.pow(10, -6);
		default:
			// should not happen
			return 1.0d;
		}
	}
}
