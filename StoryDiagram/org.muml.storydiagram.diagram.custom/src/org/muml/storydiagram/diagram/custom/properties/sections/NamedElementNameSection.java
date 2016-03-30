package org.muml.storydiagram.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.core.CorePackage;

import de.upb.swt.core.ui.properties.sections.AbstractTextSection;

public class NamedElementNameSection extends AbstractTextSection {
	@Override
	protected EStructuralFeature getFeature() {
		return CorePackage.Literals.NAMED_ELEMENT__NAME;
	}

	@Override
	protected void postExecute() {
		refreshTitle();
	}

	@Override
	protected String getLabelText() {
		return "Name";
	}
}
