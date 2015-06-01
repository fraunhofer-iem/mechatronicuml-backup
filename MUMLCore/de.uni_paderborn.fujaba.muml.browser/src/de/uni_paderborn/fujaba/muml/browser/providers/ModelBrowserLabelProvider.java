package de.uni_paderborn.fujaba.muml.browser.providers;

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

import de.uni_paderborn.fujaba.muml.browser.items.ProgressNavigatorItem;

public class ModelBrowserLabelProvider extends LabelProvider implements IColorProvider,
		IFontProvider, IStyledLabelProvider, ICommonLabelProvider {
	private WorkbenchLabelProvider labelProvider = new WorkbenchLabelProvider();
	
	public ModelBrowserLabelProvider() {
		
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
		return labelProvider.getText(element);
	}


	@Override
	public StyledString getStyledText(final Object element) {
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
		return labelProvider.getStyledText(element);
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof ProgressNavigatorItem) {
			return ((ProgressNavigatorItem) element).getCurrentImage();
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
