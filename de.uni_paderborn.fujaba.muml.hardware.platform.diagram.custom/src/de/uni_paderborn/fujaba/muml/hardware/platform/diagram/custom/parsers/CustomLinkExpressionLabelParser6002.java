package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.parsers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.hardware.common.parsers.GeneralPlatformParser;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRateUnit;
import de.uni_paderborn.fujaba.muml.hardware.platform.Link;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.parsers.LinkLabelExpressionLabelParser6002;

/**
 * A customized LabelParser which parses the bandwidth and sets the values
 * accordingly.
 * 
 * @author adann
 */
public class CustomLinkExpressionLabelParser6002 extends
		LinkLabelExpressionLabelParser6002 {

	@Override
	protected IStatus updateValues(EObject target, String newString) {

		Double value;
		DataRateUnit unit;
		try {
			value = GeneralPlatformParser.getValue(newString);
			unit = GeneralPlatformParser.getUnitDataRate(newString);
			DataRate dataRate = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataRate();
			dataRate.setValue(value);
			dataRate.setUnit(unit);
			((Link) target).setBandwidth(dataRate);
			return Status.OK_STATUS;
		} catch (NumberFormatException e) {
			return Status.CANCEL_STATUS;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return Status.OK_STATUS;

	}

}
