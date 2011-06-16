package de.uni_paderborn.fujaba.muml.common.sheet;

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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import de.uni_paderborn.fujaba.muml.common.celleditor.ParametersExtendedDialogCellEditor;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

public class CustomPropertySource extends PropertySource {

	private final boolean readOnlyOverride;

	public CustomPropertySource(Object object,
			IItemPropertySource itemPropertySource) {
		this(object, itemPropertySource, false);
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
					EStructuralFeature structuralFeature = (EStructuralFeature) feature;
					Class<?> instanceClass = structuralFeature.getEType()
							.getInstanceClass();
					if (instanceClass.isAssignableFrom(NaturalNumber.class)) {
						EDataType eDataType = EcorePackage.Literals.ESTRING;
						return createEDataTypeCellEditor(eDataType, parent);

					} else if (instanceClass.isAssignableFrom(EParameter.class)) {
						return new ParametersExtendedDialogCellEditor(parent,
								getLabelProvider(), (EObject) object, structuralFeature);
					}
				}
				return super.createPropertyEditor(parent);
			}
		};
	}
}
