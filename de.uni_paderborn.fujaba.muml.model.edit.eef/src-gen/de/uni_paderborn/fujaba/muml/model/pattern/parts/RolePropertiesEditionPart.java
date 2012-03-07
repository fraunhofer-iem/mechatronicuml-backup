/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.pattern.parts;

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
public interface RolePropertiesEditionPart {

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
	 * @return the behavior
	 * 
	 */
	public EObject getBehavior();

	/**
	 * Init the behavior
	 * @param settings the combo setting
	 */
	public void initBehavior(EObjectFlatComboSettings settings);

	/**
	 * Defines a new behavior
	 * @param newValue the new behavior to set
	 * 
	 */
	public void setBehavior(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setBehaviorButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the behavior edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToBehavior(ViewerFilter filter);

	/**
	 * Adds the given filter to the behavior edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToBehavior(ViewerFilter filter);


	/**
	 * @return the incomingRoleConnector
	 * 
	 */
	public EObject getIncomingRoleConnector();

	/**
	 * Init the incomingRoleConnector
	 * @param settings the combo setting
	 */
	public void initIncomingRoleConnector(EObjectFlatComboSettings settings);

	/**
	 * Defines a new incomingRoleConnector
	 * @param newValue the new incomingRoleConnector to set
	 * 
	 */
	public void setIncomingRoleConnector(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setIncomingRoleConnectorButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the incomingRoleConnector edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIncomingRoleConnector(ViewerFilter filter);

	/**
	 * Adds the given filter to the incomingRoleConnector edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIncomingRoleConnector(ViewerFilter filter);


	/**
	 * @return the coordinationPattern
	 * 
	 */
	public EObject getCoordinationPattern();

	/**
	 * Init the coordinationPattern
	 * @param settings the combo setting
	 */
	public void initCoordinationPattern(EObjectFlatComboSettings settings);

	/**
	 * Defines a new coordinationPattern
	 * @param newValue the new coordinationPattern to set
	 * 
	 */
	public void setCoordinationPattern(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setCoordinationPatternButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the coordinationPattern edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCoordinationPattern(ViewerFilter filter);

	/**
	 * Adds the given filter to the coordinationPattern edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCoordinationPattern(ViewerFilter filter);


	/**
	 * @return the senderMessageInterface
	 * 
	 */
	public EObject getSenderMessageInterface();

	/**
	 * Init the senderMessageInterface
	 * @param settings the combo setting
	 */
	public void initSenderMessageInterface(EObjectFlatComboSettings settings);

	/**
	 * Defines a new senderMessageInterface
	 * @param newValue the new senderMessageInterface to set
	 * 
	 */
	public void setSenderMessageInterface(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSenderMessageInterfaceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the senderMessageInterface edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSenderMessageInterface(ViewerFilter filter);

	/**
	 * Adds the given filter to the senderMessageInterface edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSenderMessageInterface(ViewerFilter filter);


	/**
	 * @return the receiverMessageInterface
	 * 
	 */
	public EObject getReceiverMessageInterface();

	/**
	 * Init the receiverMessageInterface
	 * @param settings the combo setting
	 */
	public void initReceiverMessageInterface(EObjectFlatComboSettings settings);

	/**
	 * Defines a new receiverMessageInterface
	 * @param newValue the new receiverMessageInterface to set
	 * 
	 */
	public void setReceiverMessageInterface(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setReceiverMessageInterfaceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the receiverMessageInterface edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReceiverMessageInterface(ViewerFilter filter);

	/**
	 * Adds the given filter to the receiverMessageInterface edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReceiverMessageInterface(ViewerFilter filter);




	/**
	 * Init the port
	 * @param settings settings for the port ReferencesTable 
	 */
	public void initPort(ReferencesTableSettings settings);

	/**
	 * Update the port
	 * @param newValue the port to update
	 * 
	 */
	public void updatePort();

	/**
	 * Adds the given filter to the port edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPort(ViewerFilter filter);

	/**
	 * Adds the given filter to the port edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPort(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the port table
	 * 
	 */
	public boolean isContainedInPortTable(EObject element);


	/**
	 * @return the adaptationBehavior
	 * 
	 */
	public EObject getAdaptationBehavior();

	/**
	 * Init the adaptationBehavior
	 * @param settings the combo setting
	 */
	public void initAdaptationBehavior(EObjectFlatComboSettings settings);

	/**
	 * Defines a new adaptationBehavior
	 * @param newValue the new adaptationBehavior to set
	 * 
	 */
	public void setAdaptationBehavior(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setAdaptationBehaviorButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the adaptationBehavior edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAdaptationBehavior(ViewerFilter filter);

	/**
	 * Adds the given filter to the adaptationBehavior edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAdaptationBehavior(ViewerFilter filter);


	/**
	 * @return the roleAndAdaptationBehavior
	 * 
	 */
	public EObject getRoleAndAdaptationBehavior();

	/**
	 * Init the roleAndAdaptationBehavior
	 * @param settings the combo setting
	 */
	public void initRoleAndAdaptationBehavior(EObjectFlatComboSettings settings);

	/**
	 * Defines a new roleAndAdaptationBehavior
	 * @param newValue the new roleAndAdaptationBehavior to set
	 * 
	 */
	public void setRoleAndAdaptationBehavior(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setRoleAndAdaptationBehaviorButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the roleAndAdaptationBehavior edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRoleAndAdaptationBehavior(ViewerFilter filter);

	/**
	 * Adds the given filter to the roleAndAdaptationBehavior edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRoleAndAdaptationBehavior(ViewerFilter filter);


	/**
	 * @return the ordered
	 * 
	 */
	public Boolean getOrdered();

	/**
	 * Defines a new ordered
	 * @param newValue the new ordered to set
	 * 
	 */
	public void setOrdered(Boolean newValue);


	/**
	 * @return the orderVariable
	 * 
	 */
	public EObject getOrderVariable();

	/**
	 * Init the orderVariable
	 * @param settings the combo setting
	 */
	public void initOrderVariable(EObjectFlatComboSettings settings);

	/**
	 * Defines a new orderVariable
	 * @param newValue the new orderVariable to set
	 * 
	 */
	public void setOrderVariable(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setOrderVariableButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the orderVariable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOrderVariable(ViewerFilter filter);

	/**
	 * Adds the given filter to the orderVariable edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOrderVariable(ViewerFilter filter);


	/**
	 * @return the outgoingRoleConnector
	 * 
	 */
	public EObject getOutgoingRoleConnector();

	/**
	 * Init the outgoingRoleConnector
	 * @param settings the combo setting
	 */
	public void initOutgoingRoleConnector(EObjectFlatComboSettings settings);

	/**
	 * Defines a new outgoingRoleConnector
	 * @param newValue the new outgoingRoleConnector to set
	 * 
	 */
	public void setOutgoingRoleConnector(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setOutgoingRoleConnectorButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the outgoingRoleConnector edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutgoingRoleConnector(ViewerFilter filter);

	/**
	 * Adds the given filter to the outgoingRoleConnector edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutgoingRoleConnector(ViewerFilter filter);





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
