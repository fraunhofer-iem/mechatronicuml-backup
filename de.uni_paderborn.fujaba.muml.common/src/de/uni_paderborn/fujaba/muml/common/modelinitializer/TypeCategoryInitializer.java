package de.uni_paderborn.fujaba.muml.common.modelinitializer;

import org.eclipse.emf.ecore.EObject;

import de.fujaba.modelinstance.ModelElementCategory;
import de.fujaba.modelinstance.ModelinstanceFactory;
import de.fujaba.modelinstance.RootNode;
import de.fujaba.newwizard.initializer.IModelInitializer;
import de.uni_paderborn.fujaba.muml.model.types.PrimitiveDataType;
import de.uni_paderborn.fujaba.muml.model.types.PrimitiveTypes;
import de.uni_paderborn.fujaba.muml.model.types.TypesFactory;

public class TypeCategoryInitializer implements IModelInitializer {
	private static final String TYPES_CATEGORY_KEY = "de.uni_paderborn.fujaba.muml.types.category";
	private static final String TYPES_CATEGORY_NAME = "types";

	@Override
	public boolean supports(EObject object) {
		return object instanceof RootNode;
	}

	@Override
	public void initialize(EObject rootNode) {
		ModelElementCategory typesCategory = ModelinstanceFactory.eINSTANCE
				.createModelElementCategory();
		typesCategory.setName(TYPES_CATEGORY_NAME);
		typesCategory.setKey(TYPES_CATEGORY_KEY);

		for (PrimitiveTypes type : PrimitiveTypes.VALUES) {
			PrimitiveDataType primitiveDataType = TypesFactory.eINSTANCE
					.createPrimitiveDataType();
			primitiveDataType.setPrimitiveType(type);
			primitiveDataType.setName(type.getName());
			typesCategory.getModelElements().add(primitiveDataType);
		}

		// This cast is okay, because supports() already checked the type.
		((RootNode) rootNode).getCategories().add(typesCategory);
	}

}
