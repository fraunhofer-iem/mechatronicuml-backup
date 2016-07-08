/*
 * generated by Xtext
 */
package org.muml.graphviz.dot.xtext;

import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.serializer.tokens.IValueSerializer;
import org.muml.graphviz.dot.xtext.conversion.DotIDValueConverter;
import org.muml.graphviz.dot.xtext.serializer.DotLanguageValueSerializer;
import org.muml.graphviz.dot.xtext.service.DotLanguageTransientValueService;
import org.muml.graphviz.dot.xtext.service.DotLanguageValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class DotLanguageRuntimeModule extends org.muml.graphviz.dot.xtext.AbstractDotLanguageRuntimeModule {
	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return DotLanguageValueConverterService.class;
	}
	
	public Class<? extends DotIDValueConverter> bindDOTSTRINGValueConverter() {
		return DotIDValueConverter.class;
	}
	
	public Class<? extends IValueSerializer> bindIValueSerializer() {
		return DotLanguageValueSerializer.class;
	}
	
	public Class<? extends ITransientValueService> bindITransientValueService() {
		return DotLanguageTransientValueService.class;
	}
}