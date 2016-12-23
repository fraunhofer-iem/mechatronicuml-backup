package org.muml.pm.hardware.common.edit.policies.resource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwresourceinstance.ActuatorInstance;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;
import org.muml.pm.hardware.hwresourceinstance.SensorInstance;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;

/**
 * Base edit policy for all {@link ResourceInstancePart}s that uses the CustomResourceFigure.
 *  Provides handling model notifications and updating the CustomResourceFigure accordingly. 
 * 
 * @author adann
 * 
 */
public class ResourcePartEditPolicy extends ResourceEditPolicy {
	
	/**
	 * Returns whether this is a {@link StructuredResourceInstance}, a {@link SensorInstance} or a {@link ActuatorInstance}
	 *  based on its corresponding {@link ResourceInstance}.
	 */
	@Override
	protected EObject getElement(){
		EObject element = getSemanticElement();
		if (element != null) {
				ResourceInstance instance=(ResourceInstance) element.eGet(HwplatformPackage.Literals.RESOURCE_PART__RESOURCE_TYPE);
		if(instance!=null){
			return instance.getResourceType();
		}
		}
		return null;
	}
	
	/**
	 * A ResourceInstancePart is always an instance.
	 * @return true
	 */
	@Override
	protected boolean isResourceInstance(){
		return true;
	}
	
	/**
	 * Updates the visualization of a ResourceInstancePart if the type is changed.
	 */
	@Override
	public void handleNotificationEvent(Notification notification) {
		EStructuralFeature feature = null;
		if (notification.getFeature() instanceof EStructuralFeature) {
			feature = (EStructuralFeature) notification.getFeature();
		}

		if (feature == HwplatformPackage.Literals.RESOURCE_PART__RESOURCE_TYPE) {
			refreshIcon();
		}
		super.handleNotificationEvent(notification);
	}
	
	
	

}
