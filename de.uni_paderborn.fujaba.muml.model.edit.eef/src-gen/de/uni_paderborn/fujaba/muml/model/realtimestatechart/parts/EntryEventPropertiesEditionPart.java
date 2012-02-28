/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts;

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
public interface EntryEventPropertiesEditionPart {

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
	 * Init the clockResets
	 * @param settings settings for the clockResets ReferencesTable 
	 */
	public void initClockResets(ReferencesTableSettings settings);

	/**
	 * Update the clockResets
	 * @param newValue the clockResets to update
	 * 
	 */
	public void updateClockResets();

	/**
	 * Adds the given filter to the clockResets edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToClockResets(ViewerFilter filter);

	/**
	 * Adds the given filter to the clockResets edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToClockResets(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the clockResets table
	 * 
	 */
	public boolean isContainedInClockResetsTable(EObject element);





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
