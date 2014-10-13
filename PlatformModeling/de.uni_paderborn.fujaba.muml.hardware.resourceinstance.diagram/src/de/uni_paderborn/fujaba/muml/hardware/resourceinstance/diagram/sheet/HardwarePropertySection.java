package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.sheet;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.tooling.runtime.sheet.DefaultPropertySection;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

/**
 * @generated
 */
public class HardwarePropertySection extends DefaultPropertySection implements
		IPropertySourceProvider {

	/**
	 * Modify/unwrap selection.
	 * @generated
	 */
	@Override
	protected Object transformSelection(Object selected) {
		selected = /*super.*/transformSelectionToDomain(selected);
		return selected;
	}

	/**
	 * @generated
	 */
	protected AdapterFactory getAdapterFactory(Object object) {
		AdapterFactoryEditingDomain editingDomain = getEditingDomainFor(object);
		if (editingDomain != null) {
			AdapterFactory defaultFactory = editingDomain.getAdapterFactory();
			List<AdapterFactory> positivePriorityFactories = de.uni_paderborn.fujaba.common.FujabaCommonPlugin
					.getInstance()
					.getCustomItemProviderAdapterFactories(
							de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin.ID,
							true);
			List<AdapterFactory> negativePriorityFactories = de.uni_paderborn.fujaba.common.FujabaCommonPlugin
					.getInstance()
					.getCustomItemProviderAdapterFactories(
							de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin.ID,
							false);

			// Put all factories into one composed adapter factory.
			List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
			factories.addAll(positivePriorityFactories);
			factories.add(defaultFactory);
			factories.addAll(negativePriorityFactories);
			return new ComposedAdapterFactory(factories);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected AdapterFactoryEditingDomain getEditingDomainFor(Object object) {
		if (getEditingDomain() instanceof AdapterFactoryEditingDomain) {
			return (AdapterFactoryEditingDomain) getEditingDomain();
		}
		return (AdapterFactoryEditingDomain) TransactionUtil
				.getEditingDomain(object);
	}

}
