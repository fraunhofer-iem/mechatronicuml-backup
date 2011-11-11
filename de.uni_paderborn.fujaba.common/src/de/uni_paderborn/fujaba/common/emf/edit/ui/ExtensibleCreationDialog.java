package de.uni_paderborn.fujaba.common.emf.edit.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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

import de.uni_paderborn.fujaba.common.emf.edit.ui.extensions.IDialogExtension;

/**
 * 
 * @author bingo
 * 
 */
public class ExtensibleCreationDialog extends Dialog {
	
	private List<IDialogExtension> extensions = new ArrayList<IDialogExtension>();


	/**
	 * The StructuralFeature that we set the values for.
	 */
	private EStructuralFeature structuralFeature;

	
	/**
	 * The initial size for this dialog.
	 */
	private static final Point INITIAL_DIALOG_SIZE = new Point(500, 470);


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


	// Note: We store Listeners in order to be able to remove/add them
	// afterwards.



	// UI-Controls:



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
	 * @param currentValues
	 *            The current objects of the feature.
	 * @param adapterFactory
	 *            The adapter factory for content providers, item providers and
	 *            ItemPropertyDescriptors.
	 * @param textParser
	 *            The TextParser that is able to create objects represented by a
	 *            text.
	 * @param textProvider
	 *            The TextProvider that is able to build a text for a set of
	 *            objects.
	 * @param instanceClass
	 *            The instance class to create new objects.
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

		contentProvider = new AdapterFactoryContentProvider(adapterFactory);
	}
	
	
	public void addExtension(IDialogExtension extension) {
		extensions.add(extension);
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

	/**
	 * Create contents of the dialog window.
	 * 
	 * @param parent
	 *            the parent composite to contain the dialog area.
	 * @return The dialog area.
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(2, false));
		
		for (IDialogExtension extension : extensions) {
			Composite mainArea = new Composite(container, SWT.NONE);
			GridLayout gridLayoutMainArea = new GridLayout(1, false);
			mainArea.setLayout(gridLayoutMainArea);

			Composite buttonArea = new Composite(container, SWT.NONE);
			GridLayout gridLayoutButtonArea = new GridLayout(1, false);
			GridData gridDataButtonArea = new GridData(SWT.FILL, SWT.FILL, false, false,
					1, 1);
			gridLayoutButtonArea.marginTop = 7;
			buttonArea.setLayout(gridLayoutButtonArea);
			buttonArea.setLayoutData(gridDataButtonArea);
			
			extension.createMainArea(mainArea);
			extension.createButtonArea(buttonArea);
		}

		for (IDialogExtension extension : extensions) {
			extension.initialize();
		}

		return container;
	}




	@Override
	protected Point getInitialSize() {
		return INITIAL_DIALOG_SIZE;
	}

	@Override
	protected void okPressed() {
		for (IDialogExtension extension : extensions) {
			extension.okPressed();
		}
		super.okPressed();
	}

	@Override
	public boolean close() {
		contentProvider.dispose();
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

}
