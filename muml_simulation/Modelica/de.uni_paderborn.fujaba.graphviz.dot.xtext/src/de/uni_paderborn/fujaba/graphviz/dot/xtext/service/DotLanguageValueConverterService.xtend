package de.uni_paderborn.fujaba.graphviz.dot.xtext.service

import com.google.inject.Inject
import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import de.uni_paderborn.fujaba.graphviz.dot.xtext.conversion.DotIDValueConverter

class DotLanguageValueConverterService extends Ecore2XtextTerminalConverters {
	@Inject
	DotIDValueConverter dotStringValueConverter
	
	@ValueConverter(rule = "DotID")
	public def IValueConverter<String> getDotID() {
		return dotStringValueConverter
	}
}