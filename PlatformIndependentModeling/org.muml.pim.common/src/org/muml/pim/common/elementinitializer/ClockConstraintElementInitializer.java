package org.muml.pim.common.elementinitializer;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.common.emf.edit.ui.elementinitializer.IElementInitializer;
import org.muml.mumlcore.expressions.common.ComparingOperator;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;

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
