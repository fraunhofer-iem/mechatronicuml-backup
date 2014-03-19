package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.parsers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.hardware.common.parsers.GeneralPlatformParser;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.Frequency;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.FrequencyUnit;
import de.uni_paderborn.fujaba.muml.hardware.platform.ProgrammableLogicDeviceInstance;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5027;
/** A customized LabelParser which parses the frequency and sets the values accordingly.
*
* @author adann
*/
public class CustomPLDExpressionLabelParser5027 extends ProgrammableLogicDeviceInstanceLabelExpressionLabelParser5027{

	@Override
	protected IStatus updateValues(EObject target, String newString) {

		try {
			Double value=GeneralPlatformParser.getValue(newString);
			FrequencyUnit unit= GeneralPlatformParser.getUnitFrequency(newString);
			
					
			Frequency frequency=de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE.createFrequency();		
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
