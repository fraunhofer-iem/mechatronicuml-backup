/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts;

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
public interface ClockConstraintPropertiesEditionPart {

	/**
	 * @return the clock
	 * 
	 */
	public EObject getClock();

	/**
	 * Init the clock
	 * @param settings the combo setting
	 */
	public void initClock(EObjectFlatComboSettings settings);

	/**
	 * Defines a new clock
	 * @param newValue the new clock to set
	 * 
	 */
	public void setClock(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setClockButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the clock edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToClock(ViewerFilter filter);

	/**
	 * Adds the given filter to the clock edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToClock(ViewerFilter filter);


	/**
	 * @return the operator
	 * 
	 */
	public Enumerator getOperator();

	/**
	 * Init the operator
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initOperator(EEnum eenum, Enumerator current);

	/**
	 * Defines a new operator
	 * @param newValue the new operator to set
	 * 
	 */
	public void setOperator(Enumerator newValue);





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
