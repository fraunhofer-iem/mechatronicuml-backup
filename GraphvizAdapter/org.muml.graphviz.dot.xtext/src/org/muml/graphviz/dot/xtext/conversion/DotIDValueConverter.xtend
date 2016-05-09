package org.muml.graphviz.dot.xtext.conversion

import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException

class DotIDValueConverter implements IValueConverter<String> {
	
	override def toValue(String string, INode node) throws ValueConverterException {
		return if (string != null && string.length >= 2
			&& string.startsWith("\"") && string.endsWith("\"")
		)
			string.substring(1, string.length - 1)
		else
			string
	}
	
	override def String toString(String value) {
		val quote = !#["!", " "].filter[s | value != null && value.indexOf(s) > 0].isEmpty
		return if (quote) "\"" + value + "\"" else value
	}
}