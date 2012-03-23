/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.core.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;



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
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initPrimitiveType(Object input, Enumerator current);

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
