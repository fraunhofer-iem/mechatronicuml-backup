package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.custom.providers;

import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.custom.edit.parts.CustomAtomiccomponentEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.providers.ModelinstanceEditPartProvider;

/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomAtomiccomponentEditPartProvider extends
		ModelinstanceEditPartProvider {

	public CustomAtomiccomponentEditPartProvider() {
		setFactory(new CustomAtomiccomponentEditPartFactory());
		setAllowCaching(true);
	}

}
