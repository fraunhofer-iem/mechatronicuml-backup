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
public interface TransitionPropertiesEditionPart {

	/**
	 * @return the priority
	 * 
	 */
	public String getPriority();

	/**
	 * Defines a new priority
	 * @param newValue the new priority to set
	 * 
	 */
	public void setPriority(String newValue);


	/**
	 * @return the target
	 * 
	 */
	public EObject getTarget();

	/**
	 * Init the target
	 * @param settings the combo setting
	 */
	public void initTarget(EObjectFlatComboSettings settings);

	/**
	 * Defines a new target
	 * @param newValue the new target to set
	 * 
	 */
	public void setTarget(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTargetButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the target edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter);

	/**
	 * Adds the given filter to the target edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter);


	/**
	 * @return the source
	 * 
	 */
	public EObject getSource();

	/**
	 * Init the source
	 * @param settings the combo setting
	 */
	public void initSource(EObjectFlatComboSettings settings);

	/**
	 * Defines a new source
	 * @param newValue the new source to set
	 * 
	 */
	public void setSource(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSourceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the source edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter);

	/**
	 * Adds the given filter to the source edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter);


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
	 * Init the clockConstraints
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initClockConstraints(ReferencesTableSettings settings);

	/**
	 * Update the clockConstraints
	 * @param newValue the clockConstraints to update
	 * 
	 */
	public void updateClockConstraints();

	/**
	 * Adds the given filter to the clockConstraints edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToClockConstraints(ViewerFilter filter);

	/**
	 * Adds the given filter to the clockConstraints edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToClockConstraints(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the clockConstraints table
	 * 
	 */
	public boolean isContainedInClockConstraintsTable(EObject element);




	/**
	 * Init the absoluteDeadlines
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAbsoluteDeadlines(ReferencesTableSettings settings);

	/**
	 * Update the absoluteDeadlines
	 * @param newValue the absoluteDeadlines to update
	 * 
	 */
	public void updateAbsoluteDeadlines();

	/**
	 * Adds the given filter to the absoluteDeadlines edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAbsoluteDeadlines(ViewerFilter filter);

	/**
	 * Adds the given filter to the absoluteDeadlines edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAbsoluteDeadlines(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the absoluteDeadlines table
	 * 
	 */
	public boolean isContainedInAbsoluteDeadlinesTable(EObject element);


	/**
	 * @return the blockable
	 * 
	 */
	public Boolean getBlockable();

	/**
	 * Defines a new blockable
	 * @param newValue the new blockable to set
	 * 
	 */
	public void setBlockable(Boolean newValue);




	/**
	 * Init the events
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initEvents(ReferencesTableSettings settings);

	/**
	 * Update the events
	 * @param newValue the events to update
	 * 
	 */
	public void updateEvents();

	/**
	 * Adds the given filter to the events edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEvents(ViewerFilter filter);

	/**
	 * Adds the given filter to the events edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEvents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the events table
	 * 
	 */
	public boolean isContainedInEventsTable(EObject element);





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
