/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.instance.parts;

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
public interface ContinuousPortInstancePropertiesEditionPart {

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
	 * @return the portType
	 * 
	 */
	public EObject getPortType();

	/**
	 * Init the portType
	 * @param settings the combo setting
	 */
	public void initPortType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new portType
	 * @param newValue the new portType to set
	 * 
	 */
	public void setPortType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setPortTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the portType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPortType(ViewerFilter filter);

	/**
	 * Adds the given filter to the portType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPortType(ViewerFilter filter);


	/**
	 * @return the componentInstance
	 * 
	 */
	public EObject getComponentInstance();

	/**
	 * Init the componentInstance
	 * @param settings the combo setting
	 */
	public void initComponentInstance(EObjectFlatComboSettings settings);

	/**
	 * Defines a new componentInstance
	 * @param newValue the new componentInstance to set
	 * 
	 */
	public void setComponentInstance(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setComponentInstanceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the componentInstance edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToComponentInstance(ViewerFilter filter);

	/**
	 * Adds the given filter to the componentInstance edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToComponentInstance(ViewerFilter filter);




	/**
	 * Init the incomingConnectorInstances
	 * @param settings settings for the incomingConnectorInstances ReferencesTable 
	 */
	public void initIncomingConnectorInstances(ReferencesTableSettings settings);

	/**
	 * Update the incomingConnectorInstances
	 * @param newValue the incomingConnectorInstances to update
	 * 
	 */
	public void updateIncomingConnectorInstances();

	/**
	 * Adds the given filter to the incomingConnectorInstances edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIncomingConnectorInstances(ViewerFilter filter);

	/**
	 * Adds the given filter to the incomingConnectorInstances edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIncomingConnectorInstances(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the incomingConnectorInstances table
	 * 
	 */
	public boolean isContainedInIncomingConnectorInstancesTable(EObject element);




	/**
	 * Init the outgoingConnectorInstances
	 * @param settings settings for the outgoingConnectorInstances ReferencesTable 
	 */
	public void initOutgoingConnectorInstances(ReferencesTableSettings settings);

	/**
	 * Update the outgoingConnectorInstances
	 * @param newValue the outgoingConnectorInstances to update
	 * 
	 */
	public void updateOutgoingConnectorInstances();

	/**
	 * Adds the given filter to the outgoingConnectorInstances edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutgoingConnectorInstances(ViewerFilter filter);

	/**
	 * Adds the given filter to the outgoingConnectorInstances edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutgoingConnectorInstances(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outgoingConnectorInstances table
	 * 
	 */
	public boolean isContainedInOutgoingConnectorInstancesTable(EObject element);





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
