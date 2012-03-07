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
public interface StatePropertiesEditionPart {

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
	 * Init the invariants
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initInvariants(ReferencesTableSettings settings);

	/**
	 * Update the invariants
	 * @param newValue the invariants to update
	 * 
	 */
	public void updateInvariants();

	/**
	 * Adds the given filter to the invariants edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInvariants(ViewerFilter filter);

	/**
	 * Adds the given filter to the invariants edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInvariants(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the invariants table
	 * 
	 */
	public boolean isContainedInInvariantsTable(EObject element);


	/**
	 * @return the initial
	 * 
	 */
	public Boolean getInitial();

	/**
	 * Defines a new initial
	 * @param newValue the new initial to set
	 * 
	 */
	public void setInitial(Boolean newValue);


	/**
	 * @return the final
	 * 
	 */
	public Boolean getFinal_();

	/**
	 * Defines a new final
	 * @param newValue the new final to set
	 * 
	 */
	public void setFinal_(Boolean newValue);


	/**
	 * @return the urgent
	 * 
	 */
	public Boolean getUrgent();

	/**
	 * Defines a new urgent
	 * @param newValue the new urgent to set
	 * 
	 */
	public void setUrgent(Boolean newValue);





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
