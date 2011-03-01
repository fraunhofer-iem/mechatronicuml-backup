package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.sheet;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
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
import org.eclipse.ui.views.properties.IPropertySource;

import de.uni_paderborn.fujaba.umlrt.model.core.Cardinality;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.sheet.StructuredcomponentPropertySection;

public class CustomStructuredcomponentPropertySection extends
		StructuredcomponentPropertySection {
	/**
	 * @generated
	 */
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object,
					IItemPropertySource.class);
			if (ips != null) {
				return new PropertySource(object, ips) {

					protected IPropertyDescriptor createPropertyDescriptor(
							IItemPropertyDescriptor itemPropertyDescriptor) {

						return new PropertyDescriptor(this.object,
								itemPropertyDescriptor) {

							public CellEditor createPropertyEditor(
									Composite composite) {

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
											return createEDataTypeCellEditor(
													eDataType, composite);
										}
									}
								}
								return super.createPropertyEditor(composite);
							}
						};
					}
				};
			}
		}
//		if (object instanceof IAdaptable) {
//			return (IPropertySource) ((IAdaptable) object)
//					.getAdapter(IPropertySource.class);
//		}
//		return null;
		return super.getPropertySource(object);
	}
}
