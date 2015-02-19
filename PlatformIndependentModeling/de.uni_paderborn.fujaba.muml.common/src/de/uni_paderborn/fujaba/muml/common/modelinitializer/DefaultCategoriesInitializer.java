package de.uni_paderborn.fujaba.muml.common.modelinitializer;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.ModelinstanceFactory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.modelinstance.ui.initializer.IModelInitializer;
import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;
import de.uni_paderborn.fujaba.muml.types.PrimitiveTypes;
import de.uni_paderborn.fujaba.muml.types.TypesFactory;

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
		// map.put("de.uni_paderborn.fujaba.muml.types.category", "types");
		map.put("de.uni_paderborn.fujaba.muml.protocol.category", "protocol");
		map.put("de.uni_paderborn.fujaba.muml.components.category", "component");
		map.put("de.uni_paderborn.fujaba.muml.realtimestatechart.category", "realtimestatechart");
		map.put("de.uni_paderborn.fujaba.muml.messagetype.category", "msgtype");
		map.put("de.uni_paderborn.fujaba.muml.instance.category", "instance");

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
