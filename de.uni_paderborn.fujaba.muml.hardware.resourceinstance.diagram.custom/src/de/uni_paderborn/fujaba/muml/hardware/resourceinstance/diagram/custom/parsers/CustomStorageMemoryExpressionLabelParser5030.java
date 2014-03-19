package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.parsers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.hardware.common.parsers.GeneralPlatformParser;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSizeUnit;
import de.uni_paderborn.fujaba.muml.hardware.platform.StorageMemoryInstance;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.parsers.StorageMemoryInstanceLabelExpressionLabelParser5030;

/**
 * A customized LabelParser which parses the data size and sets the values
 * accordingly.
 * 
 * @author adann
 */
public class CustomStorageMemoryExpressionLabelParser5030 extends
		StorageMemoryInstanceLabelExpressionLabelParser5030 {

	@Override
	protected IStatus updateValues(EObject target, String newString) {

		try {
			Double value = GeneralPlatformParser.getValue(newString);
			DataSizeUnit unit = GeneralPlatformParser
					.getUnitDataSize(newString);

			DataSize dataSize = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory.eINSTANCE
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
