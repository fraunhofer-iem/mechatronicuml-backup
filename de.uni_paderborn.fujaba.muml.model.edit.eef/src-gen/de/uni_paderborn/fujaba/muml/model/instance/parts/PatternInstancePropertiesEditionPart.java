/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.instance.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface PatternInstancePropertiesEditionPart {

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
	 * Init the portInstances
	 * @param settings settings for the portInstances ReferencesTable 
	 */
	public void initPortInstances(ReferencesTableSettings settings);

	/**
	 * Update the portInstances
	 * @param newValue the portInstances to update
	 * 
	 */
	public void updatePortInstances();

	/**
	 * Adds the given filter to the portInstances edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPortInstances(ViewerFilter filter);

	/**
	 * Adds the given filter to the portInstances edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPortInstances(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the portInstances table
	 * 
	 */
	public boolean isContainedInPortInstancesTable(EObject element);


	/**
	 * @return the patternOccurrence
	 * 
	 */
	public EObject getPatternOccurrence();

	/**
	 * Init the patternOccurrence
	 * @param settings the combo setting
	 */
	public void initPatternOccurrence(EObjectFlatComboSettings settings);

	/**
	 * Defines a new patternOccurrence
	 * @param newValue the new patternOccurrence to set
	 * 
	 */
	public void setPatternOccurrence(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setPatternOccurrenceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the patternOccurrence edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPatternOccurrence(ViewerFilter filter);

	/**
	 * Adds the given filter to the patternOccurrence edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPatternOccurrence(ViewerFilter filter);





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
