package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.resource;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;

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
	protected de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType getResourceType(){
		EObject element = getSemanticElement();
		if (element != null) {
			return (de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType) element
					.eGet(PlatformPackage.Literals.RESOURCE_INSTANCE__RESOURCE_TYPE);
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
	
	
	
	

}
