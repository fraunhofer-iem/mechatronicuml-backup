package de.uni_paderborn.fujaba.muml.operationrepository.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.operationrepository.diagram.custom.edit.parts.CustomOperationRepositoryEditPartFactory;
import de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlEditPartProvider;

public class CustomOperationrepositoryEditPartProvider extends MumlEditPartProvider{

	public CustomOperationrepositoryEditPartProvider() {
		setFactory(new CustomOperationRepositoryEditPartFactory());
		setAllowCaching(true);
	}
}
