package de.uni_paderborn.fujaba.muml.testlanguage.diagram.custom.sheet;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.ui.views.properties.IPropertySource;

import de.uni_paderborn.fujaba.muml.testlanguage.Input;
import de.uni_paderborn.fujaba.muml.testlanguage.Node;
import de.uni_paderborn.fujaba.muml.testlanguage.Output;
import de.uni_paderborn.fujaba.muml.testlanguage.diagram.sheet.TestLanguagePropertySection;

public class TestLanguagePropertySectionOverride extends
		TestLanguagePropertySection {

	@Override
	public IPropertySource getPropertySource(Object object) {
		
		if (object instanceof Node) {
			object = ((Node) object).getSpecification();
		} else if (object instanceof Input) {
			object = ((Input) object).getNode().getSpecification();
		} else if (object instanceof Output) {
			object = ((Output) object).getNode().getSpecification();
		}
		
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object, IItemPropertySource.class);
			if (ips != null) {
				return new TestLanguagePropertySource(object, ips);
			}
		}

		return super.getPropertySource(object);
	}

}
