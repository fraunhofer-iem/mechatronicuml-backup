package de.uni_paderborn.fujaba.muml.properties.component.section;
public class ComponentPartMultiPartSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractTextSection {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
				.getComponentPart_MultiPart();
	}
	@Override
	protected String getLabelText() {
		return "MultiPart";
	}
	@Override
	protected boolean isMultiLine() {
		return false;
	}
}