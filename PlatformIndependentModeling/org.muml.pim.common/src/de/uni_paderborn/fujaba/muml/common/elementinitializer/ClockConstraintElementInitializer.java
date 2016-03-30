package de.uni_paderborn.fujaba.muml.common.elementinitializer;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.common.emf.edit.ui.elementinitializer.IElementInitializer;
import org.muml.core.expressions.common.ComparingOperator;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;

/**
 * Initialize a ClockConstraint by setting its operator to LESS_OR_EQUAL.
 * 
 * @author bingo
 *
 */
public class ClockConstraintElementInitializer implements IElementInitializer {

	@Override
	public void initialize(EObject object) {
		object.eSet(
				RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__OPERATOR,
				ComparingOperator.LESS_OR_EQUAL);
	}
}
