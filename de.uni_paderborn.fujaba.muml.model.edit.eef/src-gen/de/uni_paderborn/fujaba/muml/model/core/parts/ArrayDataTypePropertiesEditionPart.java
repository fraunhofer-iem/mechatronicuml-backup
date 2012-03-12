/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.core.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;



// End of user code

/**
 * 
 * 
 */
public interface ArrayDataTypePropertiesEditionPart {

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
	 * @return the cardinality
	 * 
	 */
	public EList getCardinality();

	/**
	 * Defines a new cardinality
	 * @param newValue the new cardinality to set
	 * 
	 */
	public void setCardinality(EList newValue);

	/**
	 * Add a value to the cardinality multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToCardinality(Object newValue);

	/**
	 * Remove a value to the cardinality multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToCardinality(Object newValue);





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
