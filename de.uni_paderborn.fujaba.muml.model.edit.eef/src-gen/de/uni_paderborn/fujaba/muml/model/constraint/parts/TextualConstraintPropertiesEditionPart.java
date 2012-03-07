/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.constraint.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface TextualConstraintPropertiesEditionPart {

	/**
	 * @return the correctness
	 * 
	 */
	public Enumerator getCorrectness();

	/**
	 * Init the correctness
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initCorrectness(EEnum eenum, Enumerator current);

	/**
	 * Defines a new correctness
	 * @param newValue the new correctness to set
	 * 
	 */
	public void setCorrectness(Enumerator newValue);


	/**
	 * @return the background
	 * 
	 */
	public Boolean getBackground();

	/**
	 * Defines a new background
	 * @param newValue the new background to set
	 * 
	 */
	public void setBackground(Boolean newValue);


	/**
	 * @return the constrainableElement
	 * 
	 */
	public EObject getConstrainableElement();

	/**
	 * Init the constrainableElement
	 * @param settings the combo setting
	 */
	public void initConstrainableElement(EObjectFlatComboSettings settings);

	/**
	 * Defines a new constrainableElement
	 * @param newValue the new constrainableElement to set
	 * 
	 */
	public void setConstrainableElement(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setConstrainableElementButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the constrainableElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToConstrainableElement(ViewerFilter filter);

	/**
	 * Adds the given filter to the constrainableElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToConstrainableElement(ViewerFilter filter);





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
