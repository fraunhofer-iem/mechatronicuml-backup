/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
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
public interface HybridPortPropertiesEditionPart {

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
	 * Init the incomingConnectors
	 * @param settings settings for the incomingConnectors ReferencesTable 
	 */
	public void initIncomingConnectors(ReferencesTableSettings settings);

	/**
	 * Update the incomingConnectors
	 * @param newValue the incomingConnectors to update
	 * 
	 */
	public void updateIncomingConnectors();

	/**
	 * Adds the given filter to the incomingConnectors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIncomingConnectors(ViewerFilter filter);

	/**
	 * Adds the given filter to the incomingConnectors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIncomingConnectors(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the incomingConnectors table
	 * 
	 */
	public boolean isContainedInIncomingConnectorsTable(EObject element);




	/**
	 * Init the outgoingConnectors
	 * @param settings settings for the outgoingConnectors ReferencesTable 
	 */
	public void initOutgoingConnectors(ReferencesTableSettings settings);

	/**
	 * Update the outgoingConnectors
	 * @param newValue the outgoingConnectors to update
	 * 
	 */
	public void updateOutgoingConnectors();

	/**
	 * Adds the given filter to the outgoingConnectors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutgoingConnectors(ViewerFilter filter);

	/**
	 * Adds the given filter to the outgoingConnectors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutgoingConnectors(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outgoingConnectors table
	 * 
	 */
	public boolean isContainedInOutgoingConnectorsTable(EObject element);


	/**
	 * @return the component
	 * 
	 */
	public EObject getComponent();

	/**
	 * Init the component
	 * @param settings the combo setting
	 */
	public void initComponent(EObjectFlatComboSettings settings);

	/**
	 * Defines a new component
	 * @param newValue the new component to set
	 * 
	 */
	public void setComponent(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setComponentButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToComponent(ViewerFilter filter);

	/**
	 * Adds the given filter to the component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToComponent(ViewerFilter filter);


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
	 * @return the refines
	 * 
	 */
	public EObject getRefines();

	/**
	 * Init the refines
	 * @param settings the combo setting
	 */
	public void initRefines(EObjectFlatComboSettings settings);

	/**
	 * Defines a new refines
	 * @param newValue the new refines to set
	 * 
	 */
	public void setRefines(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setRefinesButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the refines edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRefines(ViewerFilter filter);

	/**
	 * Adds the given filter to the refines edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRefines(ViewerFilter filter);


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
	 * @return the kind
	 * 
	 */
	public Enumerator getKind();

	/**
	 * Init the kind
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initKind(Object input, Enumerator current);

	/**
	 * Defines a new kind
	 * @param newValue the new kind to set
	 * 
	 */
	public void setKind(Enumerator newValue);


	/**
	 * @return the type
	 * 
	 */
	public EObject getType();

	/**
	 * Init the type
	 * @param settings the combo setting
	 */
	public void initType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the type edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToType(ViewerFilter filter);

	/**
	 * Adds the given filter to the type edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToType(ViewerFilter filter);





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
