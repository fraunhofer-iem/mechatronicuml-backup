package org.muml.pim.common.modelinitializer;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.ModelinstanceFactory;
import org.muml.core.modelinstance.RootNode;
import org.muml.core.modelinstance.ui.initializer.IModelInitializer;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.pim.types.PrimitiveTypes;
import org.muml.pim.types.TypesFactory;

public class TypeCategoryInitializer implements IModelInitializer {
	private static final String TYPES_CATEGORY_KEY = "org.muml.types.category";
	private static final String TYPES_CATEGORY_NAME = "types";

	@Override
	public boolean supports(EObject object) {
		if (object instanceof RootNode) {
			return true;
		}
		if (object instanceof ModelElementCategory) {
			ModelElementCategory category = (ModelElementCategory) object;
			if (category.getKey() == TYPES_CATEGORY_KEY) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void initialize(EObject element) {
		ModelElementCategory typesCategory = null;
		if (element instanceof ModelElementCategory) {
			if (TYPES_CATEGORY_KEY.equals(((ModelElementCategory) element).getKey())) {
				typesCategory = (ModelElementCategory) element;
			}
		}
		
		if (element instanceof RootNode && typesCategory == null) {
			typesCategory = ModelinstanceFactory.eINSTANCE.createModelElementCategory();
			typesCategory.setName(TYPES_CATEGORY_NAME);
			typesCategory.setKey(TYPES_CATEGORY_KEY);
			((RootNode) element).getCategories().add(typesCategory);
		}

		// Deactivated, because of Shared Primitive Types; see MUML #1008
//		for (PrimitiveTypes type : PrimitiveTypes.VALUES) {
//			PrimitiveDataType primitiveDataType = TypesFactory.eINSTANCE
//					.createPrimitiveDataType();
//			primitiveDataType.setPrimitiveType(type);
//			primitiveDataType.setName(type.getName().toLowerCase());
//			typesCategory.getModelElements().add(primitiveDataType);
//		}
	}

}
