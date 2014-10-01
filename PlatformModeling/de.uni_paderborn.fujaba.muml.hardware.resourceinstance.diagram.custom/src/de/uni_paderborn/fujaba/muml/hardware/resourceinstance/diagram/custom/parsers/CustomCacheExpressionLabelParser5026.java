package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.parsers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.hardware.common.parsers.GeneralPlatformParser;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSizeUnit;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.MemoryResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.CacheInstanceLabelExpressionLabelParser5045;

/** A customized LabelParser which parses the data size and sets the values accordingly.
*
* @author adann
*/
public class CustomCacheExpressionLabelParser5026 extends
		CacheInstanceLabelExpressionLabelParser5045 {

	protected IStatus updateValues(EObject target, String newString) {

		try {
			Double value = GeneralPlatformParser.getValue(newString);
			DataSizeUnit unit = GeneralPlatformParser
					.getUnitDataSize(newString);

			DataSize dataSize = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataSize();
			dataSize.setValue(value);
			dataSize.setUnit(unit);
			((MemoryResourceInstance) target).setMemorySize(dataSize);
			return Status.OK_STATUS;

		} catch (NumberFormatException e) {
			return Status.CANCEL_STATUS;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return Status.OK_STATUS;

	}

}
