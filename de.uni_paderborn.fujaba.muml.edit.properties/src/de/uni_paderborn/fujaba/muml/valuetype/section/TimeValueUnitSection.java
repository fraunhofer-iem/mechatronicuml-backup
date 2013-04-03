package de.uni_paderborn.fujaba.muml.valuetype.section;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;
import de.upb.swt.core.ui.properties.sections.AbstractComboSection;

public class TimeValueUnitSection extends AbstractComboSection<TimeUnit>  {

	@Override
	protected String getLabelText() {
		return "Unit";
	}

	@Override
	public EStructuralFeature getFeature() {
		return ValuetypePackage.Literals.TIME_VALUE__UNIT;
	}

	@Override
	protected List<TimeUnit> getItems() {
		return Arrays.asList(TimeUnit.values());
	}

}
