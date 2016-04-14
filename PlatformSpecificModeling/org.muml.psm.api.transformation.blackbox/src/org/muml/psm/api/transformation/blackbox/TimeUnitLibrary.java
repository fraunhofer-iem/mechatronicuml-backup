package org.muml.psm.api.transformation.blackbox;

import java.util.concurrent.TimeUnit;

import org.muml.core.expressions.Expression;
import org.muml.core.expressions.common.CommonFactory;
import org.muml.core.expressions.common.LiteralExpression;
import org.muml.pim.valuetype.TimeValue;
import org.muml.pim.valuetype.ValuetypeFactory;

public class TimeUnitLibrary {

	public TimeUnitLibrary() {}
	
	public TimeValue createTimeValueWithMilleseconds(Expression value) {
		TimeValue ret = ValuetypeFactory.eINSTANCE.createTimeValue();
		
		ret.setUnit(TimeUnit.MILLISECONDS);
		ret.setValue(value);
		
		// return new TimeValue
		return ret;
	}
	
	public TimeUnit getTimeUnitMilliSeconds() {
		return TimeUnit.MILLISECONDS;
	}
	
	public boolean isTimeValueGreaterThan(TimeValue value, TimeValue compare) {
		TimeUnit value1= value.getUnit();
		TimeUnit value2= compare.getUnit();
		
		if (value1.equals(value2)) {
			if (value.getValue() instanceof LiteralExpression && compare.getValue() instanceof LiteralExpression) {
				int number1 = Integer.parseInt(((LiteralExpression)value.getValue()).getValue());
				int number2 = Integer.parseInt(((LiteralExpression)compare.getValue()).getValue());
				
				return number1 > number2;
			} else {
				return true; // TODO: compare real
			}
		} else {
			return isTimeUnitGreaterThan(value1, value2);
		}
	}
	
	public TimeValue addTimeValueTo(TimeValue timeValue1, TimeValue toAdd) {
		TimeValue ret = ValuetypeFactory.eINSTANCE.createTimeValue();
			// both have a LiteralExpression as value
			if (timeValue1.getValue() instanceof LiteralExpression && toAdd.getValue() instanceof LiteralExpression) {
				int value1 = Integer.parseInt( ((LiteralExpression) timeValue1.getValue()).getValue() );
				int value2 = Integer.parseInt( ((LiteralExpression) toAdd.getValue()).getValue() );
				TimeUnit unit1=timeValue1.getUnit();
				TimeUnit toAddUnit=toAdd.getUnit();
				value1 += toAddUnit.convert(value2, unit1);
	
				// create the new TimeValue
				LiteralExpression newValue = CommonFactory.eINSTANCE.createLiteralExpression();
				
				newValue.setValue(String.valueOf(value1));
				ret.setUnit(unit1);
				ret.setValue(newValue);
							
			}
			else{
				throw new IllegalArgumentException();
			}
			return ret;
	}
	
	private boolean isTimeUnitGreaterThan(TimeUnit value, TimeUnit compare) {
		if (value.equals(compare)) {
			return false;
		} else if (value.equals(TimeUnit.NANOSECONDS)) {
			return false;
		} else if (value.equals(TimeUnit.MICROSECONDS)) {
			return compare.equals(TimeUnit.NANOSECONDS);
		} else if (value.equals(TimeUnit.MILLISECONDS)) {
			return compare.equals(TimeUnit.NANOSECONDS)
					|| compare.equals(TimeUnit.MICROSECONDS);
		} else if (value.equals(TimeUnit.SECONDS)) {
			return compare.equals(TimeUnit.NANOSECONDS)
					|| compare.equals(TimeUnit.MICROSECONDS)
					|| compare.equals(TimeUnit.MILLISECONDS);
		} else if (value.equals(TimeUnit.MINUTES)) {
			return compare.equals(TimeUnit.NANOSECONDS)
					|| compare.equals(TimeUnit.MICROSECONDS)
					|| compare.equals(TimeUnit.MILLISECONDS)
					|| compare.equals(TimeUnit.SECONDS);
		} else if (value.equals(TimeUnit.HOURS)) {
			return compare.equals(TimeUnit.NANOSECONDS)
					|| compare.equals(TimeUnit.MICROSECONDS)
					|| compare.equals(TimeUnit.MILLISECONDS)
					|| compare.equals(TimeUnit.SECONDS)
					|| compare.equals(TimeUnit.MINUTES);
		} else if (value.equals(TimeUnit.DAYS)) {
			return true;
		}
		
		return false;
	}
	
}
