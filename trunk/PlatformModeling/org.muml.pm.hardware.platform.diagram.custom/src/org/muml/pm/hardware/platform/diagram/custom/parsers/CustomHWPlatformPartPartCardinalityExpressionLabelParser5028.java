package org.muml.pm.hardware.platform.diagram.custom.parsers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pm.hardware.common.parsers.GeneralPlatformParser;
import org.muml.pm.hardware.hwplatform.HWPlatformPart;
import org.muml.pm.hardware.platform.diagram.parsers.HWPlatformPartLabelExpressionLabelParser5043;

/**
 * A customized LabelParser which parses the {@link Cardinality} and sets the
 * values accordingly.
 * 
 * @author adann
 */
public class CustomHWPlatformPartPartCardinalityExpressionLabelParser5028 extends
		HWPlatformPartLabelExpressionLabelParser5043 {

	
	@Override
	protected IStatus updateValues(EObject target, String newString) {

		int lowerBound;
		int upperBound;
		try {
			lowerBound=GeneralPlatformParser.getLowerBound(newString);
			upperBound=GeneralPlatformParser.getUpperBound(newString);
			Cardinality cardinality=org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE.createCardinality();
			cardinality.setLowerBound(org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE.createNaturalNumber());
			cardinality.setUpperBound(org.muml.pim.valuetype.ValuetypeFactory.eINSTANCE.createNaturalNumber());
			cardinality.getLowerBound().setValue(lowerBound);
			cardinality.getUpperBound().setValue(upperBound);
			((HWPlatformPart) target).setCardinality(cardinality);
			return Status.OK_STATUS;
		}
		catch (NumberFormatException e){
			return Status.CANCEL_STATUS;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return Status.OK_STATUS;

	}

}
