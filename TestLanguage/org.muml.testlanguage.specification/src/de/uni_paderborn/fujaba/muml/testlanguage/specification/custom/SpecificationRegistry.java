package de.uni_paderborn.fujaba.muml.testlanguage.specification.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class SpecificationRegistry {

	private static List<String> specificationClasses = new ArrayList<String>();

	public static List<String> getSpecificationClasses() {
		return SpecificationRegistry.specificationClasses;
	}

	public static void addSpecificationClasses(String... classNames) {
		SpecificationRegistry.specificationClasses.addAll(Arrays
				.asList(classNames));
	}

	static {
		SpecificationRegistry.addSpecificationClasses("AssertDiagnosticTrace",
				"AssertResult", "AssertBool", "LoadModel", "CompareModels",
				"SaveModel", "Transformation", "ValidateModel",
				"ExecuteUPPAAL", "PrimitiveString", "CheckMTCTL");
	}
}
