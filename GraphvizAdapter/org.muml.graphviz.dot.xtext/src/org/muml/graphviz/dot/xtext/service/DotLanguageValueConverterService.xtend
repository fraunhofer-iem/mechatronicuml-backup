package org.muml.graphviz.dot.xtext.service

import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.muml.graphviz.dot.xtext.conversion.DotGraphIDValueConverter
import org.muml.graphviz.dot.xtext.conversion.DotIDValueConverter

@Singleton
class DotLanguageValueConverterService extends Ecore2XtextTerminalConverters {
	@Inject
	DotIDValueConverter dotIDValueConverter
	
	@Inject
	DotGraphIDValueConverter dotGraphIDValueConverter
	
	@ValueConverter(rule = "DotID")
	public def IValueConverter<String> getDotID() {
		return dotIDValueConverter
	}
	
	@ValueConverter(rule = "DotGraphID")
	public def IValueConverter<String> getDotGraphID() {
		return dotGraphIDValueConverter
	}
	
	public def void setSemanticObject(EObject semanticObject) {
		dotGraphIDValueConverter.semanticObject = semanticObject
	}
}