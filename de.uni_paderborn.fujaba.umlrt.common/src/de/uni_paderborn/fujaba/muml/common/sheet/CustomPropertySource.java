package de.uni_paderborn.fujaba.muml.common.sheet;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import de.uni_paderborn.fujaba.muml.model.core.Cardinality;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;

public class CustomPropertySource extends PropertySource {

	public CustomPropertySource(Object object,
			IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
		
	}

	protected IPropertyDescriptor createPropertyDescriptor(
			IItemPropertyDescriptor itemPropertyDescriptor) {

		return new PropertyDescriptor(this.object, itemPropertyDescriptor) {

			public CellEditor createPropertyEditor(Composite composite) {

				Object feature = itemPropertyDescriptor
						.getFeature(itemPropertyDescriptor);
				if (feature instanceof EReference) {
					EReference reference = (EReference) feature;
					if (reference.getContainerClass() == Cardinality.class) {
						int featureId = reference.getFeatureID();
						switch (featureId) {
						case CorePackage.CARDINALITY__LOWER_BOUND:
						case CorePackage.CARDINALITY__UPPER_BOUND:
							EDataType eDataType = EcorePackage.Literals.ESTRING;
							return createEDataTypeCellEditor(eDataType,
									composite);
						}
					}
				}
				return super.createPropertyEditor(composite);
			}
		};
	}
}
