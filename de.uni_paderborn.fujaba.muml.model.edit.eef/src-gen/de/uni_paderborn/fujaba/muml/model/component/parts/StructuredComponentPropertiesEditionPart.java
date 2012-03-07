/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface StructuredComponentPropertiesEditionPart {

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
	 * Init the referencingComponentParts
	 * @param settings settings for the referencingComponentParts ReferencesTable 
	 */
	public void initReferencingComponentParts(ReferencesTableSettings settings);

	/**
	 * Update the referencingComponentParts
	 * @param newValue the referencingComponentParts to update
	 * 
	 */
	public void updateReferencingComponentParts();

	/**
	 * Adds the given filter to the referencingComponentParts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencingComponentParts(ViewerFilter filter);

	/**
	 * Adds the given filter to the referencingComponentParts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencingComponentParts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the referencingComponentParts table
	 * 
	 */
	public boolean isContainedInReferencingComponentPartsTable(EObject element);


	/**
	 * @return the componentType
	 * 
	 */
	public Enumerator getComponentType();

	/**
	 * Init the componentType
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initComponentType(EEnum eenum, Enumerator current);

	/**
	 * Defines a new componentType
	 * @param newValue the new componentType to set
	 * 
	 */
	public void setComponentType(Enumerator newValue);





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
