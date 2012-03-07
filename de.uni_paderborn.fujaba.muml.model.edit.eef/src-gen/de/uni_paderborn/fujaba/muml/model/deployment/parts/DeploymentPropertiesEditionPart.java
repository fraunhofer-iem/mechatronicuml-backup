/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.deployment.parts;

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
public interface DeploymentPropertiesEditionPart {

	/**
	 * @return the componentInstanceConfiguration
	 * 
	 */
	public EObject getComponentInstanceConfiguration();

	/**
	 * Init the componentInstanceConfiguration
	 * @param settings the combo setting
	 */
	public void initComponentInstanceConfiguration(EObjectFlatComboSettings settings);

	/**
	 * Defines a new componentInstanceConfiguration
	 * @param newValue the new componentInstanceConfiguration to set
	 * 
	 */
	public void setComponentInstanceConfiguration(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setComponentInstanceConfigurationButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the componentInstanceConfiguration edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToComponentInstanceConfiguration(ViewerFilter filter);

	/**
	 * Adds the given filter to the componentInstanceConfiguration edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToComponentInstanceConfiguration(ViewerFilter filter);





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
