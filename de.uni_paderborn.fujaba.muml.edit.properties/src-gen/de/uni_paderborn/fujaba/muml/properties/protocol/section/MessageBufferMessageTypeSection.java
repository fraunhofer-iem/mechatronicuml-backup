package de.uni_paderborn.fujaba.muml.properties.protocol.section;
public class MessageBufferMessageTypeSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
				.getMessageBuffer_MessageType();
	}
	@Override
	protected String getLabelText() {
		return "MessageType";
	}
	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}
}