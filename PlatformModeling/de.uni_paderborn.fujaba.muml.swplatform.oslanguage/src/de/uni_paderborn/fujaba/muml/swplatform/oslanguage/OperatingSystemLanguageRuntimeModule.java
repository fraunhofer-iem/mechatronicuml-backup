/*
 * generated by Xtext
 */
package de.uni_paderborn.fujaba.muml.swplatform.oslanguage;

import org.eclipse.xtext.conversion.IValueConverterService;

import de.uni_paderborn.fujaba.muml.swplatform.oslanguage.valueconverter.SWPlatformTerminalConverter;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class OperatingSystemLanguageRuntimeModule extends de.uni_paderborn.fujaba.muml.swplatform.oslanguage.AbstractOperatingSystemLanguageRuntimeModule {
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		// TODO Auto-generated method stub
		return SWPlatformTerminalConverter.class;
	}

}
