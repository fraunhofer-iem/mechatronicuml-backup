/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.deployment.parts;

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
public interface HardwarePortPropertiesEditionPart {

	/**
	 * @return the hardwareNode
	 * 
	 */
	public EObject getHardwareNode();

	/**
	 * Init the hardwareNode
	 * @param settings the combo setting
	 */
	public void initHardwareNode(EObjectFlatComboSettings settings);

	/**
	 * Defines a new hardwareNode
	 * @param newValue the new hardwareNode to set
	 * 
	 */
	public void setHardwareNode(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setHardwareNodeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the hardwareNode edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToHardwareNode(ViewerFilter filter);

	/**
	 * Adds the given filter to the hardwareNode edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToHardwareNode(ViewerFilter filter);


	/**
	 * @return the outgoingCommunicationLink
	 * 
	 */
	public EObject getOutgoingCommunicationLink();

	/**
	 * Init the outgoingCommunicationLink
	 * @param settings the combo setting
	 */
	public void initOutgoingCommunicationLink(EObjectFlatComboSettings settings);

	/**
	 * Defines a new outgoingCommunicationLink
	 * @param newValue the new outgoingCommunicationLink to set
	 * 
	 */
	public void setOutgoingCommunicationLink(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setOutgoingCommunicationLinkButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the outgoingCommunicationLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutgoingCommunicationLink(ViewerFilter filter);

	/**
	 * Adds the given filter to the outgoingCommunicationLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutgoingCommunicationLink(ViewerFilter filter);


	/**
	 * @return the incomingCommunicationLink
	 * 
	 */
	public EObject getIncomingCommunicationLink();

	/**
	 * Init the incomingCommunicationLink
	 * @param settings the combo setting
	 */
	public void initIncomingCommunicationLink(EObjectFlatComboSettings settings);

	/**
	 * Defines a new incomingCommunicationLink
	 * @param newValue the new incomingCommunicationLink to set
	 * 
	 */
	public void setIncomingCommunicationLink(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setIncomingCommunicationLinkButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the incomingCommunicationLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIncomingCommunicationLink(ViewerFilter filter);

	/**
	 * Adds the given filter to the incomingCommunicationLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIncomingCommunicationLink(ViewerFilter filter);




	/**
	 * Init the deployedPortInstance
	 * @param settings settings for the deployedPortInstance ReferencesTable 
	 */
	public void initDeployedPortInstance(ReferencesTableSettings settings);

	/**
	 * Update the deployedPortInstance
	 * @param newValue the deployedPortInstance to update
	 * 
	 */
	public void updateDeployedPortInstance();

	/**
	 * Adds the given filter to the deployedPortInstance edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDeployedPortInstance(ViewerFilter filter);

	/**
	 * Adds the given filter to the deployedPortInstance edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDeployedPortInstance(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the deployedPortInstance table
	 * 
	 */
	public boolean isContainedInDeployedPortInstanceTable(EObject element);





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
