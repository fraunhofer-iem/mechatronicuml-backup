package de.uni_paderborn.fujaba.muml.properties.msgtype.section;
public class MessageTypeRepositoryMessageTypesSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {
	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage.eINSTANCE
				.getMessageTypeRepository_MessageTypes();
	}
	@Override
	protected String getLabelText() {
		return "MessageTypes";
	}
	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}
}