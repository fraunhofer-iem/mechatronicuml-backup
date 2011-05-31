package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.custom.providers;

import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.custom.edit.parts.CustomAtomiccomponentEditPartFactory;
import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.diagram.providers.MumlinstanceEditPartProvider;

/**
 * Our custom EditPartProvider, which uses the customized EditPartFactory.
 * 
 * @author bingo
 * 
 */
public class CustomAtomiccomponentEditPartProvider extends
		MumlinstanceEditPartProvider {

	public CustomAtomiccomponentEditPartProvider() {
		setFactory(new CustomAtomiccomponentEditPartFactory());
		setAllowCaching(true);
	}

}
