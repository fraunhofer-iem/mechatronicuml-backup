package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.sheet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AdvancedPropertySection;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

/**
 * @generated
 */
public class MumlPropertySection extends AdvancedPropertySection
		implements
		IPropertySourceProvider,
		de.uni_paderborn.fujaba.common.emf.edit.ui.IRefreshProhibitedPropertySection {

	/**
	 * @generated
	 */
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object,
					IItemPropertySource.class);
			if (ips != null) {
				EditingDomain ed = getEditingDomainFor(object);
				return new de.uni_paderborn.fujaba.muml.common.emf.edit.provider.CustomPropertySource(
						object, ips, af, ed, this, this);
			}
		}
		if (object instanceof IAdaptable) {
			return (IPropertySource) ((IAdaptable) object)
					.getAdapter(IPropertySource.class);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected IPropertySourceProvider getPropertySourceProvider() {
		return this;
	}

	/**
	 * Modify/unwrap selection.
	 * @generated
	 */
	protected Object transformSelection(Object selected) {

		if (selected instanceof EditPart) {
			Object model = ((EditPart) selected).getModel();
			return model instanceof View ? ((View) model).getElement() : null;
		}
		if (selected instanceof View) {
			return ((View) selected).getElement();
		}
		if (selected instanceof IAdaptable) {
			View view = (View) ((IAdaptable) selected).getAdapter(View.class);
			if (view != null) {
				return view.getElement();
			}
		}
		return selected;
	}

	/**
	 * @generated
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection.isEmpty()
				|| false == selection instanceof StructuredSelection) {
			super.setInput(part, selection);
			return;
		}
		final StructuredSelection structuredSelection = ((StructuredSelection) selection);
		ArrayList transformedSelection = new ArrayList(
				structuredSelection.size());
		for (Iterator it = structuredSelection.iterator(); it.hasNext();) {
			Object r = transformSelection(it.next());
			if (r != null) {
				transformedSelection.add(r);
			}
		}
		super.setInput(part, new StructuredSelection(transformedSelection));
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
							de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin.ID,
							true);
			List<AdapterFactory> negativePriorityFactories = de.uni_paderborn.fujaba.common.FujabaCommonPlugin
					.getInstance()
					.getCustomItemProviderAdapterFactories(
							de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin.ID,
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

	/**
	 * @generated
	 */
	private int refreshProhibitions = 0;

	/**
	 * @generated
	 */
	@Override
	public void refresh() {
		if (refreshProhibitions <= 0) {
			super.refresh();
		}
	}

	/**
	 * @generated
	 */
	@Override
	public synchronized void pushRefreshProhibition() {
		this.refreshProhibitions++;
	}

	/**
	 * @generated
	 */
	@Override
	public synchronized void popRefreshProhibition() {
		this.refreshProhibitions--;
	}

}
