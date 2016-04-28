package org.muml.storydiagram.diagram.custom.properties.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.mumlcore.CorePackage;
import org.muml.storydiagram.diagram.custom.ResourceManager;
import org.muml.storydiagram.diagram.custom.util.ActivityUtil;
import org.muml.storydiagram.diagram.custom.util.EcoreTextUtil;
import org.muml.storydiagram.patterns.PatternsPackage;

import de.upb.swt.core.ui.properties.sections.AbstractComboSection;

public class PrimitiveVariableClassifierSection extends AbstractComboSection<EDataType> {
	@Override
	protected List<EDataType> getItems() {
		List<EDataType> items = new ArrayList<EDataType>();
		items.add(null);

		items.addAll(ResourceManager.get(ActivityUtil.getActivity(getElement())).getEDataTypes());

		return items;
	}

	@Override
	protected String getLabelText() {
		return "Type";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return CorePackage.Literals.TYPED_ELEMENT__GENERIC_TYPE;
	}

	@Override
	protected String getText(EDataType element) {
		return EcoreTextUtil.getQualifiedText(element);
	}
}
