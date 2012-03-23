/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.msgiface.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface MessageInterfacePropertiesEditionPart {

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
	 * Init the superType
	 * @param settings settings for the superType ReferencesTable 
	 */
	public void initSuperType(ReferencesTableSettings settings);

	/**
	 * Update the superType
	 * @param newValue the superType to update
	 * 
	 */
	public void updateSuperType();

	/**
	 * Adds the given filter to the superType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSuperType(ViewerFilter filter);

	/**
	 * Adds the given filter to the superType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSuperType(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the superType table
	 * 
	 */
	public boolean isContainedInSuperTypeTable(EObject element);





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
