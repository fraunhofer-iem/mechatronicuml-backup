package org.muml.testlanguage.diagram.custom.sheet;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.muml.testlanguage.specification.SpecificationPackage;

public class TestLanguagePropertySource extends PropertySource {

	public TestLanguagePropertySource(Object object,
			IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
	}

	@Override
	protected IPropertyDescriptor createPropertyDescriptor(
			IItemPropertyDescriptor itemPropertyDescriptor) {

		SpecificationPackage pkg = SpecificationPackage.eINSTANCE;
		Object feature = itemPropertyDescriptor.getFeature(object);
		if (pkg.getLoadModel_Uri().equals(feature)) {
			return new LoadUriPropertyDescriptor(this.object,
					itemPropertyDescriptor);
		} else if (pkg.getSaveModel_Uri().equals(feature)) {
			return new SaveUriPropertyDescriptor(this.object,
					itemPropertyDescriptor);
		} else if (pkg.getTransformation_Uri().equals(feature)) {
			return new ChooseTransformationPropertyDescriptor(this.object,
					itemPropertyDescriptor);
		}

		return super.createPropertyDescriptor(itemPropertyDescriptor);
	}
}
