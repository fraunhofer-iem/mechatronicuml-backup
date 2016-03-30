package org.muml.core.common.emf.edit.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.muml.core.common.emf.edit.ui.extensions.IDialogExtension;

/**
 * 
 * @author bingo
 * 
 */
public class ExtensibleCreationDialog extends Dialog {

	public final static String EXTENSION_GROUP_ALWAYS_VISIBLE = "always visible";
	public final static String EXTENSION_GROUP_DEFAULT = "default";
	public final static String EXTENSION_GROUP_XTEXT_PARSER = "XTextParser";

	private Composite container;

//	private IRefreshProhibitedPropertySection mainPropertySection;

	private Map<Object, List<IDialogExtension>> groupToExtensions = new LinkedHashMap<Object, List<IDialogExtension>>();

	/**
	 * The StructuralFeature that we set the values for.
	 */
	private EStructuralFeature structuralFeature;

	/**
	 * The initial size for this dialog.
	 */
	private static final Point INITIAL_DIALOG_SIZE = new Point(550, 500);

	/**
	 * The LabelProvider used to get Labels for Parameters and typeClassifiers.
	 */
	private ILabelProvider labelProvider;

	/**
	 * The ContentProvider to access items of an ItemProvider.
	 */
	private IContentProvider contentProvider;

	/**
	 * The Object containing the StructuralFeature, we are setting the values
	 * for.
	 */
	private EObject containerObject;

	private AdapterFactory adapterFactory;

	/**
	 * Constructs this ExtensibleCreationDialog.
	 * 
	 * @param parentShell
	 *            The parent shell to use for this Dialog.
	 * @param labelProvider
	 *            The LabelProvider to use in order to create element names.
	 * @param containerObject
	 *            The object containing the <code>structuralFeature</code>.
	 * @param structuralFeature
	 *            The StructuralFeature to set values for.
	 * @param adapterFactory
	 *            The adapter factory for content providers, item providers and
	 *            ItemPropertyDescriptors.
	 * 
	 */
	public ExtensibleCreationDialog(Shell parentShell,
			ILabelProvider labelProvider, EObject containerObject,
			EStructuralFeature structuralFeature,
			AdapterFactory adapterFactory) {
		super(parentShell);
		setShellStyle(getShellStyle() | SWT.RESIZE | SWT.MAX);
		this.labelProvider = labelProvider;
		this.structuralFeature = structuralFeature;
		this.containerObject = containerObject;
//		this.mainPropertySection = mainPropertySection;
		this.adapterFactory = adapterFactory;

		contentProvider = new AdapterFactoryContentProvider(adapterFactory);
	}

	public void addExtension(IDialogExtension extension, Object group) {
		getExtensionsInGroup(group).add(extension);
	}

	public List<IDialogExtension> getExtensionsInGroup(Object group) {
		List<IDialogExtension> extensions = groupToExtensions.get(group);
		if (extensions == null) {
			extensions = new ArrayList<IDialogExtension>();
			groupToExtensions.put(group, extensions);
		}
		return extensions;
	}
	private static Object getWrappedValue(Object value) {
		if (value instanceof ItemPropertyDescriptor.PropertyValueWrapper) {
			value = ((ItemPropertyDescriptor.PropertyValueWrapper) value)
					.getEditableValue(value);
		}
		return value;
	}

	public Collection<Object> getRegisteredGroups() {
		return groupToExtensions.keySet();
	}

	public Map<Object, List<IDialogExtension>> getGroupMap() {
		return groupToExtensions;
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText(EMFEditUIPlugin.INSTANCE.getString(
				"_UI_FeatureEditorDialog_title",
				new Object[] { structuralFeature.getName(),
						labelProvider.getText(containerObject) }));
		shell.setImage(labelProvider.getImage(containerObject));
	}

	public IItemPropertyDescriptor getItemPropertyDescriptor() {
		IItemPropertySource ips = (IItemPropertySource) adapterFactory.adapt(
				containerObject, IItemPropertySource.class);
		if (ips != null) {
			return ips
					.getPropertyDescriptor(containerObject, structuralFeature);
		}
		return null;
	}
	
	public boolean isManyProperty() {
		return getItemPropertyDescriptor().isMany(containerObject);
	}

	/**
	 * Create contents of the dialog window.
	 * 
	 * @param parent
	 *            the parent composite to contain the dialog area.
	 * @return The dialog area.
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(2, false));

		for (List<IDialogExtension> extensions : groupToExtensions.values()) {
			for (IDialogExtension extension : extensions) {
				Composite mainArea = new Composite(container, SWT.NONE);
				GridLayout gridLayoutMainArea = new GridLayout(1, false);
				mainArea.setLayout(gridLayoutMainArea);

				Composite buttonArea = new Composite(container, SWT.NONE);
				GridLayout gridLayoutButtonArea = new GridLayout(1, false);
				GridData gridDataButtonArea = new GridData(SWT.FILL, SWT.FILL,
						false, false, 1, 1);
				gridLayoutButtonArea.marginTop = 7;
				buttonArea.setLayout(gridLayoutButtonArea);
				buttonArea.setLayoutData(gridDataButtonArea);

				extension.createMainArea(mainArea);
				extension.createButtonArea(buttonArea);
			}
		}

		for (List<IDialogExtension> extensions : groupToExtensions.values()) {
			for (IDialogExtension extension : extensions) {
				extension.initialize();
			}
		}

		return container;
	}

	@Override
	protected Point getInitialSize() {
		return INITIAL_DIALOG_SIZE;
	}

	@Override
	public boolean close() {
		// Execute everything within a try-catch block to prevent problems to
		// close the window.
		try {

			// Begin added because of #204
			for (List<IDialogExtension> extensions : groupToExtensions.values()) {
				for (IDialogExtension extension : extensions) {
					extension.close();
				}
			}

			// Hack to force notification
			IItemPropertyDescriptor descriptor = getItemPropertyDescriptor();
			if (descriptor != null) {
				Object newValue = getWrappedValue(descriptor
							.getPropertyValue(containerObject));
				if (!descriptor.isMany(containerObject)) {
					
					descriptor.setPropertyValue(containerObject, null);
					descriptor.setPropertyValue(containerObject, newValue);

				} else {
					// save newValue in a list otherwise it will be lost
					// after the first setPropertyValue call
					List<?> valueList = new ArrayList<Object>(
							(List<?>) newValue);
					descriptor.setPropertyValue(containerObject,
							Collections.EMPTY_LIST);
					
					descriptor.setPropertyValue(containerObject, valueList);
				}
			}
			// End added

			for (List<IDialogExtension> extensions : groupToExtensions.values()) {
				for (IDialogExtension extension : extensions) {
					extension.dispose();
				}
			}
			contentProvider.dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return super.close();
	}

	public ILabelProvider getLabelProvider() {
		return labelProvider;
	}

	public IContentProvider getContentProvider() {
		return contentProvider;
	}

	public EStructuralFeature getStructuralFeature() {
		return structuralFeature;
	}

	public EObject getContainerObject() {
		return containerObject;
	}

	public void setPropertyValue(Object value) {

		IItemPropertyDescriptor itemPropertyDescriptor = getItemPropertyDescriptor();

		if (value instanceof Collection && !itemPropertyDescriptor.isMany(containerObject)) {
			Collection<?> collection = (Collection<?>) value;
			if (collection.isEmpty()) {
				value = null;
			} else {
				value = ((Collection<?>) value).iterator().next();
			}
		}
		
		if (itemPropertyDescriptor != null) {
			itemPropertyDescriptor.setPropertyValue(containerObject, value);
		}
	}

	public void layout() {
		container.layout(false);
	}

}
