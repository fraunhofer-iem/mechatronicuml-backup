package de.uni_paderborn.fujaba.muml.properties.connector.section;

public class MessageBufferBufferSizeSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractGroupSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
				.getMessageBuffer_BufferSize();
	}

	@Override
	protected String getLabelText() {
		return "BufferSize";
	}

	public MessageBufferBufferSizeSection() {

		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.NaturalNumberValueSection());

		addSection(new de.uni_paderborn.fujaba.muml.properties.valuetype.section.NaturalNumberInfinitySection());

	}

}
