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
public interface MessagePropertiesEditionPart {

	/**
	 * @return the instanceOf
	 * 
	 */
	public EObject getInstanceOf_();

	/**
	 * Init the instanceOf
	 * @param settings the combo setting
	 */
	public void initInstanceOf_(EObjectFlatComboSettings settings);

	/**
	 * Defines a new instanceOf
	 * @param newValue the new instanceOf to set
	 * 
	 */
	public void setInstanceOf_(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setInstanceOf_ButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the instanceOf edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInstanceOf_(ViewerFilter filter);

	/**
	 * Adds the given filter to the instanceOf edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInstanceOf_(ViewerFilter filter);





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
