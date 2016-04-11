package org.muml.core.browser.providers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.muml.common.editingdomain.registry.MumlEditingDomainRegistry;

import org.muml.core.browser.items.ProgressNavigatorItem;

public class ModelBrowserLabelProvider extends LabelProvider implements IColorProvider,
		IFontProvider, IStyledLabelProvider, ICommonLabelProvider {
	private WorkbenchLabelProvider labelProvider = new WorkbenchLabelProvider();

	private Map<TransactionalEditingDomain, AdapterFactoryLabelProvider> adapterFactoryLabelProviders = new HashMap<TransactionalEditingDomain, AdapterFactoryLabelProvider>();
	
	public AdapterFactoryLabelProvider getAdapterFactoryLabelProvder(TransactionalEditingDomain editingDomain) {
		if (editingDomain != null) {
			if (!adapterFactoryLabelProviders.containsKey(editingDomain)) {
				AdapterFactory adapterFactory = ((AdapterFactoryEditingDomain)editingDomain).getAdapterFactory();
				adapterFactoryLabelProviders.put(editingDomain, new AdapterFactoryLabelProvider(adapterFactory));
			}
			return adapterFactoryLabelProviders.get(editingDomain);
		}
		return null;
	}
	
	
	@Override
	public void addListener(ILabelProviderListener listener) {
		super.addListener(listener);
		labelProvider.addListener(listener);
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		super.removeListener(listener);
		labelProvider.removeListener(listener);
	}

	@Override
	public void dispose() {
		super.dispose();
		labelProvider.dispose();
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return labelProvider.isLabelProperty(element, property);
	}


	@Override
	public String getText(Object element) {
		if (element instanceof Notifier) {
			AdapterFactoryLabelProvider labelProvider = getAdapterFactoryLabelProvder(MumlEditingDomainRegistry.INSTANCE.getEditingDomainDispatch(element, true));
			if (labelProvider != null) {
				return labelProvider.getText(element);
			}
		}
		if (element instanceof IFile) {
			IFile iFile = (IFile) element;
			URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
			TransactionalEditingDomain editingDomain = MumlEditingDomainRegistry.INSTANCE.getEditingDomain(uri, true);
			if (editingDomain != null) {
				Resource resource = editingDomain.getResourceSet().getResource(uri, false);
				if (resource != null) {
					if (resource.getContents().size() == 1) {
						return getText(resource.getContents().get(0));
					}
				}
			}
		}
		return labelProvider.getText(element);
	}


	@Override
	public StyledString getStyledText(final Object element) {
		if (element instanceof Notifier) {
			AdapterFactoryLabelProvider labelProvider = getAdapterFactoryLabelProvder(MumlEditingDomainRegistry.INSTANCE.getEditingDomainDispatch(element, true));
			if (labelProvider != null) {
				return labelProvider.getStyledText(element);
			}
		}
		if (element instanceof ProgressNavigatorItem) {
			StyledString styledString = new StyledString();
			styledString.append("Loading...", new Styler() {
				@Override
				public void applyStyles(TextStyle textStyle) {
					textStyle.font = JFaceResources.getFontRegistry().getItalic(JFaceResources.DEFAULT_FONT);
				}
			});
			return styledString;
		}
		if (element instanceof IFile) {
			IFile iFile = (IFile) element;
			URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
			TransactionalEditingDomain editingDomain = MumlEditingDomainRegistry.INSTANCE.getEditingDomain(uri, true);
			if (editingDomain != null) {
				Resource resource = editingDomain.getResourceSet().getResource(uri, false);
				if (resource != null) {
					if (resource.getContents().size() == 1) {
						return getStyledText(resource.getContents().get(0));
					}
				}
			}
		}
		return labelProvider.getStyledText(element);
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof Notifier) {
			AdapterFactoryLabelProvider labelProvider = getAdapterFactoryLabelProvder(MumlEditingDomainRegistry.INSTANCE.getEditingDomainDispatch(element, true));
			if (labelProvider != null) {
				return labelProvider.getImage(element);
			}
		}
		if (element instanceof ProgressNavigatorItem) {
			return ((ProgressNavigatorItem) element).getCurrentImage();
		}
		if (element instanceof IFile) {
			IFile iFile = (IFile) element;
			URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
			TransactionalEditingDomain editingDomain = MumlEditingDomainRegistry.INSTANCE.getEditingDomain(uri, true);
			if (editingDomain != null) {
				Resource resource = editingDomain.getResourceSet().getResource(uri, false);
				if (resource != null) {
					if (resource.getContents().size() == 1) {
						return getImage(resource.getContents().get(0));
					}
				}
			}
		}
		return labelProvider.getImage(element);
	}

	@Override
	public Font getFont(Object element) {
		return labelProvider.getFont(element);
	}

	@Override
	public Color getForeground(Object element) {
		return labelProvider.getForeground(element);
	}

	@Override
	public Color getBackground(Object element) {
		return labelProvider.getBackground(element);
	}

	@Override
	public void restoreState(IMemento aMemento) {

	}

	@Override
	public void saveState(IMemento aMemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescription(Object anElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ICommonContentExtensionSite aConfig) {
		// TODO Auto-generated method stub
		//this.
		//String viewerId = aConfig.getService().getViewerDescriptor().getViewerId();

		//System.out.println(viewerId);
	}
}
