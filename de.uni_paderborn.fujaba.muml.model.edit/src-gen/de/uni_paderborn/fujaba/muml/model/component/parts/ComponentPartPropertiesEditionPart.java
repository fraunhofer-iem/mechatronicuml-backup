/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.parts;

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
public interface ComponentPartPropertiesEditionPart {

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
	 * @return the componentType
	 * 
	 */
	public EObject getComponentType();

	/**
	 * Init the componentType
	 * @param settings the combo setting
	 */
	public void initComponentType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new componentType
	 * @param newValue the new componentType to set
	 * 
	 */
	public void setComponentType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setComponentTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the componentType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToComponentType(ViewerFilter filter);

	/**
	 * Adds the given filter to the componentType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToComponentType(ViewerFilter filter);


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
	 * Init the fromRev
	 * @param settings settings for the fromRev ReferencesTable 
	 */
	public void initFromRev(ReferencesTableSettings settings);

	/**
	 * Update the fromRev
	 * @param newValue the fromRev to update
	 * 
	 */
	public void updateFromRev();

	/**
	 * Adds the given filter to the fromRev edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFromRev(ViewerFilter filter);

	/**
	 * Adds the given filter to the fromRev edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFromRev(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the fromRev table
	 * 
	 */
	public boolean isContainedInFromRevTable(EObject element);




	/**
	 * Init the toRev
	 * @param settings settings for the toRev ReferencesTable 
	 */
	public void initToRev(ReferencesTableSettings settings);

	/**
	 * Update the toRev
	 * @param newValue the toRev to update
	 * 
	 */
	public void updateToRev();

	/**
	 * Adds the given filter to the toRev edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToToRev(ViewerFilter filter);

	/**
	 * Adds the given filter to the toRev edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToToRev(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the toRev table
	 * 
	 */
	public boolean isContainedInToRevTable(EObject element);




	/**
	 * Init the delegation
	 * @param settings settings for the delegation ReferencesTable 
	 */
	public void initDelegation(ReferencesTableSettings settings);

	/**
	 * Update the delegation
	 * @param newValue the delegation to update
	 * 
	 */
	public void updateDelegation();

	/**
	 * Adds the given filter to the delegation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDelegation(ViewerFilter filter);

	/**
	 * Adds the given filter to the delegation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDelegation(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the delegation table
	 * 
	 */
	public boolean isContainedInDelegationTable(EObject element);





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
