package org.muml.core.export.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.IColorProvider;

public class ColoredAdapterFactoryLabelProvider extends AdapterFactoryLabelProvider implements IColorProvider {
	public ColoredAdapterFactoryLabelProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
}