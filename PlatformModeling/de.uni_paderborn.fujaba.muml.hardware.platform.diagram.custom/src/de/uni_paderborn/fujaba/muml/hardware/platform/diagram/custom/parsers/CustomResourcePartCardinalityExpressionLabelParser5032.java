package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.parsers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.hardware.common.parsers.GeneralPlatformParser;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.ResourcePart;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.ResourcePartLabelExpressionLabelParser5047;
import de.uni_paderborn.fujaba.muml.valuetype.Cardinality;

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
			Cardinality cardinality = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			cardinality
					.setLowerBound(de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
							.createNaturalNumber());
			cardinality
					.setUpperBound(de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
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
