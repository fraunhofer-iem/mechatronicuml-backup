package de.uni_paderborn.fujaba.muml.common.sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

import de.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.multifeaturecreationdialog.MultiFeatureCreationDialog;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.multifeaturecreationdialog.parameter.ParameterTextParser;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.multifeaturecreationdialog.parameter.ParameterTextProvider;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

public class CustomPropertySource extends PropertySource {

	private final boolean readOnlyOverride;
	private AdapterFactory adapterFactory;

	public CustomPropertySource(Object object,
			IItemPropertySource itemPropertySource,
			AdapterFactory itemProvidersAdapterFactory) {
		this(object, itemPropertySource, false);
		this.adapterFactory = itemProvidersAdapterFactory;
	}

	public CustomPropertySource(Object object,
			IItemPropertySource itemPropertySource, boolean readOnlyOverride) {
		super(object, itemPropertySource);
		this.readOnlyOverride = readOnlyOverride;
	}

	protected IPropertyDescriptor createPropertyDescriptor(
			IItemPropertyDescriptor itemPropertyDescriptor) {

		return new PropertyDescriptor(this.object, itemPropertyDescriptor) {

			public CellEditor createPropertyEditor(Composite parent) {
				if (readOnlyOverride) {
					return null;
				}

				Object feature = itemPropertyDescriptor
						.getFeature(itemPropertyDescriptor);

				if (object instanceof EObject
						&& feature instanceof EStructuralFeature) {
					final EStructuralFeature structuralFeature = (EStructuralFeature) feature;
					Class<?> instanceClass = structuralFeature.getEType()
							.getInstanceClass();
					if (instanceClass.isAssignableFrom(NaturalNumber.class)) {
						EDataType eDataType = EcorePackage.Literals.ESTRING;
						return createEDataTypeCellEditor(eDataType, parent);

					} else if (instanceClass.isAssignableFrom(EParameter.class)) {

						return new ExtendedDialogCellEditor(parent,
								getLabelProvider()) {
							@Override
							protected Object openDialogBox(
									Control cellEditorWindow) {

								List<EClassifier> choices = getTypeClassifiers();
								List<EStructuralFeature> properties = new ArrayList<EStructuralFeature>();

								properties
										.add(EcorePackage.Literals.ENAMED_ELEMENT__NAME);
								properties
										.add(EcorePackage.Literals.ETYPED_ELEMENT__ETYPE);

								// Dialog creation
								MultiFeatureCreationDialog dialog = new MultiFeatureCreationDialog(
										PlatformUI.getWorkbench().getDisplay()
												.getActiveShell(),
										labelProvider,
										(EObject) object,
										structuralFeature,
										getTypeClassifiers(),
										adapterFactory,
										properties,
										new ParameterTextParser(choices),
										new ParameterTextProvider(labelProvider));

								// Open the dialog and retrieve the user
								// selection
								int result = dialog.open();
								labelProvider.dispose();
								if (result == Window.OK) {
									return dialog.getResult();
								}

								return null;
							}
						};
					}
				}
				return super.createPropertyEditor(parent);
			}
		};
	}

	private RootNode getRootNodeElement() {
		List<EObject> contents = ((EObject) object).eResource().getContents();
		if (!contents.isEmpty() && contents.get(0) instanceof RootNode) {
			return (RootNode) contents.get(0);
		}
		return null;
	}

	// TODO: Replace by getChoices() of EMF edit code.
	private List<EClassifier> getTypeClassifiers() {
		RootNode rootNode = getRootNodeElement();
		if (rootNode != null) {
			// We must convert this list into List<EClassifier>
			List<EDataType> ecoreDataTypes = rootNode.getEcoreDataTypes();

			EDataType[] array = ecoreDataTypes.toArray(new EDataType[] {});
			return Arrays.asList((EClassifier[]) array);
		}
		return null;
	}
}
