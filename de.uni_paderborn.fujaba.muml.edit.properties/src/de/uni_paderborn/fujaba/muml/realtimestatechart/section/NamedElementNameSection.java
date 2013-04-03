package de.uni_paderborn.fujaba.muml.realtimestatechart.section;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.CorePackage;

import de.upb.swt.core.ui.properties.sections.AbstractTextSection;
import de.upb.swt.core.ui.properties.util.State;

public class NamedElementNameSection extends AbstractTextSection {
	@Override
	protected boolean isMultiLine() {
		return false;
	}

	@Override
	public EStructuralFeature getFeature() {
		return CorePackage.Literals.NAMED_ELEMENT__NAME;
	}

	@Override
	protected String getLabelText() {
		return "Name";
	}
	

	protected State validate(String value) {
		if ("err".equalsIgnoreCase(value)){
			return State.error("Name must not be 'err'!");
		}
		return State.NONE;
	}
}
