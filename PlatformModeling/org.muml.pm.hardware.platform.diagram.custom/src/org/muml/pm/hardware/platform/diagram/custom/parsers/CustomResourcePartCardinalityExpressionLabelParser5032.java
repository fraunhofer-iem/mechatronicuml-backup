package org.muml.pm.hardware.platform.diagram.custom.parsers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pm.hardware.common.parsers.GeneralPlatformParser;
import org.muml.pm.hardware.hwplatform.ResourcePart;
import org.muml.pm.hardware.platform.diagram.parsers.ResourcePartLabelExpressionLabelParser5047;

/**
 * A customized LabelParser which parses the {@link Cardinality} and sets the
 * values accordingly.
 * 
 * @author adann
 */
public class CustomResourcePartCardinalityExpressionLabelParser5032
		extends ResourcePartLabelExpressionLabelParser5047 {

	@Override
	protected IStatus updateValues(EObject target, String newString) {

		int lowerBound;
		int upperBound;
		try {
			lowerBound = GeneralPlatformParser.getLowerBound(newString);
			upperBound = GeneralPlatformParser.getUpperBound(newString);
			Cardinality cardinality = org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			cardinality
					.setLowerBound(org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
							.createNaturalNumber());
			cardinality
					.setUpperBound(org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE
							.createNaturalNumber());
			cardinality.getLowerBound().setValue(lowerBound);
			cardinality.getUpperBound().setValue(upperBound);
			((ResourcePart) target).setCardinality(cardinality);
			return Status.OK_STATUS;

		} catch (NumberFormatException e) {
			return Status.CANCEL_STATUS;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return Status.OK_STATUS;

	}

}
