/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.core.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;



// End of user code

/**
 * 
 * 
 */
public interface PrimitiveDataTypePropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the comment
	 * 
	 */
	public String getComment();

	/**
	 * Defines a new comment
	 * @param newValue the new comment to set
	 * 
	 */
	public void setComment(String newValue);


	/**
	 * @return the primitiveType
	 * 
	 */
	public Enumerator getPrimitiveType();

	/**
	 * Init the primitiveType
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initPrimitiveType(EEnum eenum, Enumerator current);

	/**
	 * Defines a new primitiveType
	 * @param newValue the new primitiveType to set
	 * 
	 */
	public void setPrimitiveType(Enumerator newValue);





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
