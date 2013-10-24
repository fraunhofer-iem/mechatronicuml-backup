package de.uni_paderborn.fujaba.muml.hardware.common.parsers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRateUnit;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSizeUnit;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.FrequencyUnit;

/**
 *  This class contains text-parser methods which are used by several text-parses of the platform editors.
 * @author adann
 *
 */
public class GeneralPlatformParser {

	public static Integer getLowerBound(String cardinality)
			throws NumberFormatException {
		String lowerBound;
		if (Pattern.matches("[0-9]+\\.\\.[0-9]+", cardinality)) {
			lowerBound = GeneralPlatformParser.substringBefore(
					cardinality.trim(), ".");
			return Integer.parseInt(lowerBound);
		} else {
			throw new NumberFormatException();
		}
	}

	public static Integer getUpperBound(String cardinality)
			throws NumberFormatException {
		String upperBound;
		if (Pattern.matches("[0-9]+\\.\\.[0-9]+", cardinality)) {
			upperBound = GeneralPlatformParser.substringAfter(
					cardinality.trim(), "..");
			return Integer.parseInt(upperBound);
		} else {
			throw new NumberFormatException();
		}

	}

	protected static String getUnit(String string) {
		String unit;
		if (Pattern.matches("[0-9]+\\.?[0-9]*.*[a-zA-Z]+", string)) {
			Matcher matcher = Pattern.compile("[a-zA-Z]+").matcher(string);
			matcher.find();
			matcher.group();
			unit = string.substring(matcher.start(), matcher.end());
			return unit;
		}

		else {
			throw new IllegalArgumentException();
		}
	}

	public static Double getValue(String string) {
		String value;
		if (Pattern.matches("[0-9]+\\.?[0-9]*.*[a-zA-Z]+", string)) {
			Matcher matcher = Pattern.compile("[0-9]+\\.?[0-9]*").matcher(
					string);
			matcher.find();
			matcher.group();
			value = string.substring(matcher.start(), matcher.end());
			return Double.parseDouble(value);
		}

		else {
			throw new IllegalArgumentException();
		}
	}

	public static DataSizeUnit getUnitDataSize(String string) {
		String unitAsString = GeneralPlatformParser.getUnit(string);
		DataSizeUnit unit = DataSizeUnit.BIT;
		if (unitAsString.equalsIgnoreCase("bit")) {
			unit = DataSizeUnit.BIT;
		} 
		if (unitAsString.equalsIgnoreCase("byte")) {
			unit = DataSizeUnit.BYTE;
		}
		else if (unitAsString.equalsIgnoreCase("kb")) {
			unit = DataSizeUnit.KBYTE;
		} else if (unitAsString.equalsIgnoreCase("mb")) {
			unit = DataSizeUnit.MBYTE;
		} else if (unitAsString.equalsIgnoreCase("gb")) {
			unit = DataSizeUnit.GBYTE;
		}
		return unit;
	}

	public static DataRateUnit getUnitDataRate(String string) {
		String unitAsString = GeneralPlatformParser.getUnit(string);
		DataRateUnit unit = DataRateUnit.BS;
				
			if(unitAsString.equalsIgnoreCase("bs")){
				unit=DataRateUnit.BS;
			}
			else if(unitAsString.equalsIgnoreCase("kbs")){
				unit=DataRateUnit.KBS;
			}
			else if(unitAsString.equalsIgnoreCase("mbs")){
				unit=DataRateUnit.MBS;
			}
			return unit;
	}
	
	public static FrequencyUnit getUnitFrequency(String string) {
		String unitAsString = GeneralPlatformParser.getUnit(string);
		FrequencyUnit unit = FrequencyUnit.HZ;
				
			if(unitAsString.equalsIgnoreCase("hz")){
				unit=FrequencyUnit.HZ;
			}
			else if(unitAsString.equalsIgnoreCase("mhz")){
				unit=FrequencyUnit.MHZ;
			}
			else if(unitAsString.equalsIgnoreCase("ghz")){
				unit=FrequencyUnit.GHZ;
			}
			return unit;
	}

	/**
	 * Returns the substring before the first occurrence of a delimiter. The
	 * delimiter is not part of the result.
	 * 
	 * @param string
	 *            String to get a substring from.
	 * @param delimiter
	 *            String to search for.
	 * @return Substring before the first occurrence of the delimiter.
	 */
	public static String substringBefore(String string, String delimiter) {
		int pos = string.indexOf(delimiter);

		return pos >= 0 ? string.substring(0, pos) : string;
	}

	/**
	 * Returns the substring after the first occurrence of a delimiter. The
	 * delimiter is not part of the result.
	 * 
	 * @param string
	 *            String to get a substring from.
	 * @param delimiter
	 *            String to search for.
	 * @return Substring after the last occurrence of the delimiter.
	 */
	public static String substringAfter(String string, String delimiter) {
		int pos = string.indexOf(delimiter);

		return pos >= 0 ? string.substring(pos + delimiter.length()) : "";
	}

}
