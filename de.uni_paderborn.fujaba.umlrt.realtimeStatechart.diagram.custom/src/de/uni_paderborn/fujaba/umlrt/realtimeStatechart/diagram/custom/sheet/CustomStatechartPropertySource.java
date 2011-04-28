package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.sheet;

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

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Deadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;

public class CustomStatechartPropertySource extends PropertySource {

	public CustomStatechartPropertySource(Object object,
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
					if (reference.getContainerClass() == Deadline.class) {
						int featureId = reference.getFeatureID();
						switch (featureId) {
						case RealtimestatechartPackage.RELATIVE_DEADLINE__LOWER_BOUND:
						case RealtimestatechartPackage.RELATIVE_DEADLINE__UPPER_BOUND:
						case RealtimestatechartPackage.TRANSITION__GUARD:
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
