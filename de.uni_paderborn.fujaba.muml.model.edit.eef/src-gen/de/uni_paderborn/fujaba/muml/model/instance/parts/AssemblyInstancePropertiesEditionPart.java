/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.instance.parts;

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
public interface AssemblyInstancePropertiesEditionPart {

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
	 * @return the connectorType
	 * 
	 */
	public EObject getConnectorType();

	/**
	 * Init the connectorType
	 * @param settings the combo setting
	 */
	public void initConnectorType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new connectorType
	 * @param newValue the new connectorType to set
	 * 
	 */
	public void setConnectorType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setConnectorTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the connectorType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToConnectorType(ViewerFilter filter);

	/**
	 * Adds the given filter to the connectorType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToConnectorType(ViewerFilter filter);


	/**
	 * @return the propagationDelayLowerBound
	 * 
	 */
	public String getPropagationDelayLowerBound();

	/**
	 * Defines a new propagationDelayLowerBound
	 * @param newValue the new propagationDelayLowerBound to set
	 * 
	 */
	public void setPropagationDelayLowerBound(String newValue);


	/**
	 * @return the propagationDelayUpperBound
	 * 
	 */
	public String getPropagationDelayUpperBound();

	/**
	 * Defines a new propagationDelayUpperBound
	 * @param newValue the new propagationDelayUpperBound to set
	 * 
	 */
	public void setPropagationDelayUpperBound(String newValue);





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
