package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.parsers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.RegionLabelExpressionLabelParser5063;

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
