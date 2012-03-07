/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;



// End of user code

/**
 * 
 * 
 */
public interface DoEventPropertiesEditionPart {

	/**
	 * @return the kind
	 * 
	 */
	public Enumerator getKind();

	/**
	 * Init the kind
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initKind(EEnum eenum, Enumerator current);

	/**
	 * Defines a new kind
	 * @param newValue the new kind to set
	 * 
	 */
	public void setKind(Enumerator newValue);


	/**
	 * @return the periodLower
	 * 
	 */
	public String getPeriodLower();

	/**
	 * Defines a new periodLower
	 * @param newValue the new periodLower to set
	 * 
	 */
	public void setPeriodLower(String newValue);


	/**
	 * @return the periodUpper
	 * 
	 */
	public String getPeriodUpper();

	/**
	 * Defines a new periodUpper
	 * @param newValue the new periodUpper to set
	 * 
	 */
	public void setPeriodUpper(String newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods

// End of user code

}
