package de.uni_paderborn.fujaba.muml.common.modelinitializer;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.ModelinstanceFactory;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.newwizard.initializer.IModelInitializer;
import de.uni_paderborn.fujaba.muml.model.core.CoreFactory;
import de.uni_paderborn.fujaba.muml.model.core.PrimitiveDataType;
import de.uni_paderborn.fujaba.muml.model.core.PrimitiveTypes;

public class TypeCategoryInitializer implements IModelInitializer {
	private static final String TYPES_CATEGORY_KEY = "de.uni_paderborn.fujaba.muml.types.category";
	private static final String TYPES_CATEGORY_NAME = "types";

	@Override
	public void initialize(RootNode rootNode) {
		ModelElementCategory typesCategory = ModelinstanceFactory.eINSTANCE
				.createModelElementCategory();
		typesCategory.setName(TYPES_CATEGORY_NAME);
		typesCategory.setKey(TYPES_CATEGORY_KEY);

		for (PrimitiveTypes type : PrimitiveTypes.VALUES) {
			PrimitiveDataType primitiveDataType = CoreFactory.eINSTANCE
					.createPrimitiveDataType();
			primitiveDataType.setPrimitiveType(type);
			primitiveDataType.setName(type.getName());
			typesCategory.getModelElements().add(primitiveDataType);
		}

		rootNode.getCategories().add(typesCategory);
	}

}
