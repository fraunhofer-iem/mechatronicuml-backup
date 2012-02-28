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
public interface HardwareNodePropertiesEditionPart {

	/**
	 * @return the deployment
	 * 
	 */
	public EObject getDeployment();

	/**
	 * Init the deployment
	 * @param settings the combo setting
	 */
	public void initDeployment(EObjectFlatComboSettings settings);

	/**
	 * Defines a new deployment
	 * @param newValue the new deployment to set
	 * 
	 */
	public void setDeployment(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDeploymentButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the deployment edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDeployment(ViewerFilter filter);

	/**
	 * Adds the given filter to the deployment edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDeployment(ViewerFilter filter);




	/**
	 * Init the deployedInstances
	 * @param settings settings for the deployedInstances ReferencesTable 
	 */
	public void initDeployedInstances(ReferencesTableSettings settings);

	/**
	 * Update the deployedInstances
	 * @param newValue the deployedInstances to update
	 * 
	 */
	public void updateDeployedInstances();

	/**
	 * Adds the given filter to the deployedInstances edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDeployedInstances(ViewerFilter filter);

	/**
	 * Adds the given filter to the deployedInstances edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDeployedInstances(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the deployedInstances table
	 * 
	 */
	public boolean isContainedInDeployedInstancesTable(EObject element);





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
