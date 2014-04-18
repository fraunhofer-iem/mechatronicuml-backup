package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.resource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;

/**
 * Base edit policy for all ResourceInstances that uses the CustomResourceFigure.
 *  Provides handling model notifications and updating the CustomResourceFigure accordingly. 
 * 
 * @author adann
 * 
 */
public class ResourceInstanceEditPolicy extends ResourceEditPolicy {
	
	/**
	 * Returns the kind of this ResourceInstance based
	 * on the kind of its ResourceType.
	 * 
	 */
	@Override
	protected de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource getResource(){
		EObject element = getSemanticElement();
		if (element != null) {
			return (de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource) element
					.eGet(HwresourceinstancePackage.Literals.RESOURCE_INSTANCE__RESOURCE_TYPE);
		}
		return null;
	}
	
	/**
	 * A ResourceInstance is an Instance.
	 * @return true
	 */
	@Override
	protected boolean isResourceInstance(){
		return true;
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		// TODO Auto-generated method stub
		EStructuralFeature feature = null;
		if (notification.getFeature() instanceof EStructuralFeature) {
			feature = (EStructuralFeature) notification.getFeature();
		}

		if (feature == HwresourceinstancePackage.Literals.RESOURCE_INSTANCE__RESOURCE_TYPE) {
			refreshIcon();
		}
		super.handleNotificationEvent(notification);
	}
	
	
	
	

}
