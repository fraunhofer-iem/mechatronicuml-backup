/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface RegionPropertiesEditionPart {

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
	 * @return the parentState
	 * 
	 */
	public EObject getParentState();

	/**
	 * Init the parentState
	 * @param settings the combo setting
	 */
	public void initParentState(EObjectFlatComboSettings settings);

	/**
	 * Defines a new parentState
	 * @param newValue the new parentState to set
	 * 
	 */
	public void setParentState(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setParentStateButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the parentState edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParentState(ViewerFilter filter);

	/**
	 * Adds the given filter to the parentState edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParentState(ViewerFilter filter);





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
