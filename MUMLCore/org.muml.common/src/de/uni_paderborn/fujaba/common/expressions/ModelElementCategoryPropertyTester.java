package de.uni_paderborn.fujaba.common.expressions;

import org.eclipse.core.expressions.PropertyTester;

public class ModelElementCategoryPropertyTester extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		return true;
	}

}
