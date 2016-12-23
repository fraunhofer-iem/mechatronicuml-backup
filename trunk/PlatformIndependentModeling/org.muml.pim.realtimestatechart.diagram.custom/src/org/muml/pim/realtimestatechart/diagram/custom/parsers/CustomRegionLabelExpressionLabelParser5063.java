package org.muml.pim.realtimestatechart.diagram.custom.parsers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.diagram.parsers.RegionLabelExpressionLabelParser5063;

/**
 * @generated
 */
public class CustomRegionLabelExpressionLabelParser5063 extends
		RegionLabelExpressionLabelParser5063 {

	protected IStatus updateValues(EObject target, String newString)
			throws ExecutionException {
		Region region  =(Region) target;
		if (region.getEmbeddedStatechart() != null) {
			region.getEmbeddedStatechart().setName(newString);
		}
		return Status.OK_STATUS;
	}

}
