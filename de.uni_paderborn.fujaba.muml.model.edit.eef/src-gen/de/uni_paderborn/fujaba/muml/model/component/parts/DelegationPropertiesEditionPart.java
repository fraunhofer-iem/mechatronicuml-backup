/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.parts;

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
public interface DelegationPropertiesEditionPart {

	/**
	 * @return the fromPort
	 * 
	 */
	public EObject getFromPort();

	/**
	 * Init the fromPort
	 * @param settings the combo setting
	 */
	public void initFromPort(EObjectFlatComboSettings settings);

	/**
	 * Defines a new fromPort
	 * @param newValue the new fromPort to set
	 * 
	 */
	public void setFromPort(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setFromPortButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the fromPort edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFromPort(ViewerFilter filter);

	/**
	 * Adds the given filter to the fromPort edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFromPort(ViewerFilter filter);


	/**
	 * @return the toPort
	 * 
	 */
	public EObject getToPort();

	/**
	 * Init the toPort
	 * @param settings the combo setting
	 */
	public void initToPort(EObjectFlatComboSettings settings);

	/**
	 * Defines a new toPort
	 * @param newValue the new toPort to set
	 * 
	 */
	public void setToPort(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setToPortButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the toPort edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToToPort(ViewerFilter filter);

	/**
	 * Adds the given filter to the toPort edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToToPort(ViewerFilter filter);


	/**
	 * @return the parentComponent
	 * 
	 */
	public EObject getParentComponent();

	/**
	 * Init the parentComponent
	 * @param settings the combo setting
	 */
	public void initParentComponent(EObjectFlatComboSettings settings);

	/**
	 * Defines a new parentComponent
	 * @param newValue the new parentComponent to set
	 * 
	 */
	public void setParentComponent(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setParentComponentButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the parentComponent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParentComponent(ViewerFilter filter);

	/**
	 * Adds the given filter to the parentComponent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParentComponent(ViewerFilter filter);


	/**
	 * @return the componentPart
	 * 
	 */
	public EObject getComponentPart();

	/**
	 * Init the componentPart
	 * @param settings the combo setting
	 */
	public void initComponentPart(EObjectFlatComboSettings settings);

	/**
	 * Defines a new componentPart
	 * @param newValue the new componentPart to set
	 * 
	 */
	public void setComponentPart(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setComponentPartButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the componentPart edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToComponentPart(ViewerFilter filter);

	/**
	 * Adds the given filter to the componentPart edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToComponentPart(ViewerFilter filter);





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
