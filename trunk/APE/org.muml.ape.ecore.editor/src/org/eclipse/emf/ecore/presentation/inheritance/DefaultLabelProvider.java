package org.eclipse.emf.ecore.presentation.inheritance;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider.FontAndColorProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

public class DefaultLabelProvider extends FontAndColorProvider {

	public DefaultLabelProvider(AdapterFactory adapterFactory, Viewer viewer) {
		super(adapterFactory, viewer);
	}

	@Override
	public Font getFont(Object object) {
		return super.getFont(getObject(object));
	}
	
	@Override
	public Font getFont(Object object, int columnIndex) {
		return super.getFont(getObject(object), columnIndex);
	}
	
	@Override
	public Color getBackground(Object object) {
		return super.getBackground(getObject(object));
	}
	
	@Override
	public Color getBackground(Object object, int columnIndex) {
		return super.getBackground(getObject(object), columnIndex);
	}
	
	@Override
	public Color getForeground(Object object) {
		return super.getForeground(getObject(object));
	}
	
	@Override
	public Color getForeground(Object object, int columnIndex) {
		return super.getForeground(getObject(object), columnIndex);
	}
	
	@Override
	public Image getColumnImage(Object object, int columnIndex) {
		return super.getColumnImage(getObject(object), columnIndex);
	}
	
	@Override
	public String getColumnText(Object object, int columnIndex) {
		return super.getColumnText(getObject(object), columnIndex);
	}
	
	@Override
	public Image getImage(Object object) {
		return super.getImage(getObject(object));
	}
	
	@Override
	public String getText(Object object) {
		return super.getText(getObject(object));
	}

	protected Object getObject(Object object) {
		return object;
	}
}
