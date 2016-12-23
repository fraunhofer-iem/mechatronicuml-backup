package org.muml.pm.hardware.resourceinstance.diagram.custom.parsers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.muml.pm.hardware.common.parsers.GeneralPlatformParser;
import org.muml.pm.hardware.hwresourceinstance.StorageMemoryInstance;
import org.muml.pm.hardware.hwvaluetype.DataSize;
import org.muml.pm.hardware.hwvaluetype.DataSizeUnit;
import org.muml.pm.hardware.resourceinstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5063;

/**
 * A customized LabelParser which parses the data size and sets the values
 * accordingly.
 * 
 * @author adann
 */
public class CustomStorageMemoryExpressionLabelParser5030 extends
		StorageMemoryInstanceLabelExpressionLabelParser5063 {

	@Override
	protected IStatus updateValues(EObject target, String newString) {

		try {
			Double value = GeneralPlatformParser.getValue(newString);
			DataSizeUnit unit = GeneralPlatformParser
					.getUnitDataSize(newString);

			DataSize dataSize = org.muml.pm.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
					.createDataSize();
			dataSize.setValue(value);
			dataSize.setUnit(unit);
			((StorageMemoryInstance) target).setMemorySize(dataSize);
			return Status.OK_STATUS;

		} catch (NumberFormatException e) {
			return Status.CANCEL_STATUS;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return Status.OK_STATUS;

	}

}
