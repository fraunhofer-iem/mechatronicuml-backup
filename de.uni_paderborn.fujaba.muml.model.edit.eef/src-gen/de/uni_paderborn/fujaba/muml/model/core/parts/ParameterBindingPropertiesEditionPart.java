/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.core.parts;

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
public interface ParameterBindingPropertiesEditionPart {

	/**
	 * @return the parameter
	 * 
	 */
	public EObject getParameter();

	/**
	 * Init the parameter
	 * @param settings the combo setting
	 */
	public void initParameter(EObjectFlatComboSettings settings);

	/**
	 * Defines a new parameter
	 * @param newValue the new parameter to set
	 * 
	 */
	public void setParameter(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setParameterButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the parameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParameter(ViewerFilter filter);

	/**
	 * Adds the given filter to the parameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParameter(ViewerFilter filter);





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
