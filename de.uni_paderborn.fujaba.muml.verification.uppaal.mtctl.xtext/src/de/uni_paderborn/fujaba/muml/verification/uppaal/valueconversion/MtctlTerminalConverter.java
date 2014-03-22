package de.uni_paderborn.fujaba.muml.verification.uppaal.valueconversion;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;


public class MtctlTerminalConverter extends DefaultTerminalConverters {
	public MtctlTerminalConverter() {
	}
	
	@ValueConverter(rule = "SL_COMMENT")
	public IValueConverter<String> getSL_COMMENTRuleConverter() {
	  return new IValueConverter<String>() {
		@Override
		public String toValue(String string, INode node) throws ValueConverterException {
			return string.substring(2).trim();
		}

		@Override
		public String toString(String value) throws ValueConverterException {
			return "//"+value;
		}
	  };
	}
}
