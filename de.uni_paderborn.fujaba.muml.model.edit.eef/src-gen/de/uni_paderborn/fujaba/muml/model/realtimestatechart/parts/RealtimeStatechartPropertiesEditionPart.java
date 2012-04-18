/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts;

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
public interface RealtimeStatechartPropertiesEditionPart {

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
	 * @return the behavioralElement
	 * 
	 */
	public EObject getBehavioralElement();

	/**
	 * Init the behavioralElement
	 * @param settings the combo setting
	 */
	public void initBehavioralElement(EObjectFlatComboSettings settings);

	/**
	 * Defines a new behavioralElement
	 * @param newValue the new behavioralElement to set
	 * 
	 */
	public void setBehavioralElement(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setBehavioralElementButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the behavioralElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToBehavioralElement(ViewerFilter filter);

	/**
	 * Adds the given filter to the behavioralElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToBehavioralElement(ViewerFilter filter);


	/**
	 * @return the embeddingRegion
	 * 
	 */
	public EObject getEmbeddingRegion();

	/**
	 * Init the embeddingRegion
	 * @param settings the combo setting
	 */
	public void initEmbeddingRegion(EObjectFlatComboSettings settings);

	/**
	 * Defines a new embeddingRegion
	 * @param newValue the new embeddingRegion to set
	 * 
	 */
	public void setEmbeddingRegion(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setEmbeddingRegionButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the embeddingRegion edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEmbeddingRegion(ViewerFilter filter);

	/**
	 * Adds the given filter to the embeddingRegion edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEmbeddingRegion(ViewerFilter filter);


	/**
	 * @return the history
	 * 
	 */
	public Boolean getHistory();

	/**
	 * Defines a new history
	 * @param newValue the new history to set
	 * 
	 */
	public void setHistory(Boolean newValue);


	/**
	 * @return the eventQueueSize
	 * 
	 */
	public String getEventQueueSize();

	/**
	 * Defines a new eventQueueSize
	 * @param newValue the new eventQueueSize to set
	 * 
	 */
	public void setEventQueueSize(String newValue);




	/**
	 * Init the operations
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOperations(ReferencesTableSettings settings);

	/**
	 * Update the operations
	 * @param newValue the operations to update
	 * 
	 */
	public void updateOperations();

	/**
	 * Adds the given filter to the operations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOperations(ViewerFilter filter);

	/**
	 * Adds the given filter to the operations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOperations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the operations table
	 * 
	 */
	public boolean isContainedInOperationsTable(EObject element);





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
