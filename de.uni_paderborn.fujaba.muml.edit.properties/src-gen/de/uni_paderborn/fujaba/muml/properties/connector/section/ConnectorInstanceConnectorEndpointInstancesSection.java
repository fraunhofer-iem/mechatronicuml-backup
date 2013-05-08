package de.uni_paderborn.fujaba.muml.properties.connector.section;

public class ConnectorInstanceConnectorEndpointInstancesSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
				.getConnectorInstance_ConnectorEndpointInstances();
	}

	@Override
	protected String getLabelText() {
		return "ConnectorEndpointInstances";
	}

	@Override
	protected java.util.List<Object> getItems() {
		java.util.List<Object> nodes = new java.util.ArrayList<Object>();
		nodes.add(null);

		org.eclipse.emf.common.util.TreeIterator<Object> it = org.eclipse.emf.ecore.util.EcoreUtil
				.getAllContents(getEditingDomain().getResourceSet(), true);
		while (it.hasNext()) {
			Object element = (Object) it.next();
			if (element instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance) {
				nodes.add(element);
			}
		}

		return nodes;
	}

}
