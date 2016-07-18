package org.muml.pim.common.modelinitializer;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.ModelinstanceFactory;
import org.muml.core.modelinstance.RootNode;
import org.muml.core.modelinstance.ui.initializer.IModelInitializer;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.pim.types.PrimitiveTypes;
import org.muml.pim.types.TypesFactory;

public class DefaultCategoriesInitializer implements IModelInitializer {

	@Override
	public boolean supports(EObject object) {
		return object instanceof RootNode;
	}

	@Override
	public void initialize(EObject element) {
		RootNode rootNode = (RootNode) element; // cast is okay, because supports() checked it.
		
		Map<String, String> map = new HashMap<String, String>();
		// we have a dedicated initializer for the type category
		// map.put("org.muml.types.category", "types");
		map.put("org.muml.pim.protocol.category", "protocol");
		map.put("org.muml.pim.components.category", "component");
		map.put("org.muml.pim.realtimestatechart.category", "realtimestatechart");
		map.put("org.muml.pim.messagetype.category", "msgtype");
		map.put("org.muml.pim.instance.category", "instance");
		map.put("org.muml.pim.pattern.category", "pattern");
		
		for (String key : map.keySet()) {
			boolean found = false;
			for (ModelElementCategory category : rootNode.getCategories()) {
				if (key.equals(category.getKey())) {
					found = true;
					break;
				}
			}
			if (!found) {
				ModelElementCategory category = ModelinstanceFactory.eINSTANCE
						.createModelElementCategory();
				category.setKey(key);
				category.setName(map.get(key));
				rootNode.getCategories().add(category);
			}
		}
	}

}
