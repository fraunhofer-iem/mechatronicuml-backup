package de.uni_paderborn.fujaba.muml.realtimestatechart.section;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.CorePackage;

import de.upb.swt.core.ui.properties.sections.AbstractTextSection;

public class NamedElementNameSection extends AbstractTextSection {
	@Override
	protected boolean isMultiLine() {
		return false;
	}

	@Override
	protected EStructuralFeature getFeature() {
		return CorePackage.Literals.NAMED_ELEMENT__NAME;
	}

	@Override
	protected String getLabelText() {
		return "Name";
	}
}
