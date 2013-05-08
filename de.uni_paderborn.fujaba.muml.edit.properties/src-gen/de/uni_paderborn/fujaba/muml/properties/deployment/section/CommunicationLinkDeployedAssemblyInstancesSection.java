package de.uni_paderborn.fujaba.muml.properties.deployment.section;

public class CommunicationLinkDeployedAssemblyInstancesSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.deployment.DeploymentPackage.eINSTANCE
				.getCommunicationLink_DeployedAssemblyInstances();
	}

	@Override
	protected String getLabelText() {
		return "DeployedAssemblyInstances";
	}

	@Override
	protected java.util.List<Object> getItems() {
		java.util.List<Object> nodes = new java.util.ArrayList<Object>();
		nodes.add(null);

		org.eclipse.emf.common.util.TreeIterator<Object> it = org.eclipse.emf.ecore.util.EcoreUtil
				.getAllContents(getEditingDomain().getResourceSet(), true);
		while (it.hasNext()) {
			Object element = (Object) it.next();
			if (element instanceof de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance) {
				nodes.add(element);
			}
		}

		return nodes;
	}

}
