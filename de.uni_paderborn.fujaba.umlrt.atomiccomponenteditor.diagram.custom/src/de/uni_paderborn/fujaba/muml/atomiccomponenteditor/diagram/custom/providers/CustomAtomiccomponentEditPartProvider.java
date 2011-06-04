package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.custom.edit.parts.CustomAtomiccomponentEditPartFactory;
import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.UmlrtEditPartProvider;

/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomAtomiccomponentEditPartProvider extends
		UmlrtEditPartProvider {

	public CustomAtomiccomponentEditPartProvider() {
		setFactory(new CustomAtomiccomponentEditPartFactory());
		setAllowCaching(true);
	}

}
