package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.custom.providers;

import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.custom.edit.parts.CustomAtomiccomponentEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.providers.AtomiccomponentEditPartProvider;

/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomAtomiccomponentEditPartProvider extends
		AtomiccomponentEditPartProvider {

	public CustomAtomiccomponentEditPartProvider() {
		setFactory(new CustomAtomiccomponentEditPartFactory());
		setAllowCaching(true);
	}

}
