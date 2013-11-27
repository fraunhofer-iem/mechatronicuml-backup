import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;

/**
 * Xpand is not able to correctly retrieve the EEnumLiteral's of an enum, as
 * their eMetaClass equals to the EEnum. Therefore we use this small helper
 * class.
 * 
 * @see http://www.eclipse.org/forums/index.php?t=msg&goto=501549&
 *      http://www.eclipse.org/forums/index.php?t=msg&goto=514063&
 * 
 * @author bingo
 * 
 */
public class EnumLiterals {

	/**
	 * Retrieve the Literal Values of the given enumeration.
	 * 
	 * @param enumeration
	 *            The Enumeration to use.
	 * @return A List of Integers representing the Literal Values.
	 */
	public static List<Integer> getEnumLiteralValues(EEnum enumeration) {
		List<Integer> values = new ArrayList<Integer>();
		for (EEnumLiteral enumLiterals : enumeration.getELiterals()) {
			values.add(new Integer(enumLiterals.getValue()));
		}
		return values;
	}

	/**
	 * Retrieve the Literal Name of "value" for the given enumeration.
	 * 
	 * @param enumeration
	 *            The Enumeration to use.
	 * @param value
	 *            The value to use.
	 * @return The Literal Name
	 */
	public static String getEnumLiteralName(EEnum enumeration, Integer value) {
		return enumeration.getEEnumLiteral(value).getName();
	}

	/**
	 * Retrieves the List of Annotations of the given enumeration value for the
	 * enumeration.
	 * 
	 * @param enumeration The enumeration to use
	 * @param value The enumeration value to use.
	 * @return The List of Annotations.
	 */
	public static List<EAnnotation> getEnumAnnotations(EEnum enumeration,
			Integer value) {
		return enumeration.getEEnumLiteral(value).getEAnnotations();
	}
}
