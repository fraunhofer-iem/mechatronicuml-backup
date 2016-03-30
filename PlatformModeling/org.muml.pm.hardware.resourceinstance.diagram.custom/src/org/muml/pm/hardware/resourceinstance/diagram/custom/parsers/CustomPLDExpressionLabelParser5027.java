package org.muml.pm.hardware.resourceinstance.diagram.custom.parsers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.muml.pm.hardware.common.parsers.GeneralPlatformParser;
import org.muml.pm.hardware.hwresourceinstance.ProgrammableLogicDeviceInstance;
import org.muml.pm.hardware.hwvaluetype.Frequency;
import org.muml.pm.hardware.hwvaluetype.FrequencyUnit;
import org.muml.pm.hardware.resourceinstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5049;
/** A customized LabelParser which parses the frequency and sets the values accordingly.
*
* @author adann
*/
public class CustomPLDExpressionLabelParser5027 extends ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5049{

	@Override
	protected IStatus updateValues(EObject target, String newString) {

		try {
			Double value=GeneralPlatformParser.getValue(newString);
			FrequencyUnit unit= GeneralPlatformParser.getUnitFrequency(newString);
			
					
			Frequency frequency=org.muml.pm.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE.createFrequency();		
			frequency.setValue(value);
			frequency.setUnit(unit);
			((ProgrammableLogicDeviceInstance) target).setFrequency(frequency);
			return Status.OK_STATUS;

		} catch (NumberFormatException e) {
			return Status.CANCEL_STATUS;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return Status.OK_STATUS;

	}



}
