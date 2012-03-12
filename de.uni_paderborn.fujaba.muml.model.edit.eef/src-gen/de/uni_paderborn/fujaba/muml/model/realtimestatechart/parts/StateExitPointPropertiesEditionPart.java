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
public interface StateExitPointPropertiesEditionPart {

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
	 * Init the outgoingTransitions
	 * @param settings settings for the outgoingTransitions ReferencesTable 
	 */
	public void initOutgoingTransitions(ReferencesTableSettings settings);

	/**
	 * Update the outgoingTransitions
	 * @param newValue the outgoingTransitions to update
	 * 
	 */
	public void updateOutgoingTransitions();

	/**
	 * Adds the given filter to the outgoingTransitions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutgoingTransitions(ViewerFilter filter);

	/**
	 * Adds the given filter to the outgoingTransitions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutgoingTransitions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outgoingTransitions table
	 * 
	 */
	public boolean isContainedInOutgoingTransitionsTable(EObject element);




	/**
	 * Init the incomingTransitions
	 * @param settings settings for the incomingTransitions ReferencesTable 
	 */
	public void initIncomingTransitions(ReferencesTableSettings settings);

	/**
	 * Update the incomingTransitions
	 * @param newValue the incomingTransitions to update
	 * 
	 */
	public void updateIncomingTransitions();

	/**
	 * Adds the given filter to the incomingTransitions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIncomingTransitions(ViewerFilter filter);

	/**
	 * Adds the given filter to the incomingTransitions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIncomingTransitions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the incomingTransitions table
	 * 
	 */
	public boolean isContainedInIncomingTransitionsTable(EObject element);


	/**
	 * @return the statechart
	 * 
	 */
	public EObject getStatechart();

	/**
	 * Init the statechart
	 * @param settings the combo setting
	 */
	public void initStatechart(EObjectFlatComboSettings settings);

	/**
	 * Defines a new statechart
	 * @param newValue the new statechart to set
	 * 
	 */
	public void setStatechart(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setStatechartButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the statechart edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToStatechart(ViewerFilter filter);

	/**
	 * Adds the given filter to the statechart edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToStatechart(ViewerFilter filter);


	/**
	 * @return the state
	 * 
	 */
	public EObject getState();

	/**
	 * Init the state
	 * @param settings the combo setting
	 */
	public void initState(EObjectFlatComboSettings settings);

	/**
	 * Defines a new state
	 * @param newValue the new state to set
	 * 
	 */
	public void setState(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setStateButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the state edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToState(ViewerFilter filter);

	/**
	 * Adds the given filter to the state edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToState(ViewerFilter filter);




	/**
	 * Init the exitPoint
	 * @param settings settings for the exitPoint ReferencesTable 
	 */
	public void initExitPoint(ReferencesTableSettings settings);

	/**
	 * Update the exitPoint
	 * @param newValue the exitPoint to update
	 * 
	 */
	public void updateExitPoint();

	/**
	 * Adds the given filter to the exitPoint edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToExitPoint(ViewerFilter filter);

	/**
	 * Adds the given filter to the exitPoint edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToExitPoint(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the exitPoint table
	 * 
	 */
	public boolean isContainedInExitPointTable(EObject element);





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
