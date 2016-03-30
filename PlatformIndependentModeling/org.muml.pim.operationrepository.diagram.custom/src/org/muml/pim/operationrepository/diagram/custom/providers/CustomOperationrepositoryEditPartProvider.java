package org.muml.pim.operationrepository.diagram.custom.providers;

import org.muml.pim.operationrepository.diagram.custom.edit.parts.CustomOperationRepositoryEditPartFactory;
import org.muml.pim.operationrepository.diagram.providers.MumlEditPartProvider;

public class CustomOperationrepositoryEditPartProvider extends MumlEditPartProvider{

	public CustomOperationrepositoryEditPartProvider() {
		setFactory(new CustomOperationRepositoryEditPartFactory());
		setAllowCaching(true);
	}
}
