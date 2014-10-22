package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource;

public class ResourceInstanceTypePropertyDescriptor  extends ItemPropertyDescriptor{
	
	//TODO: Use this instead of string matching for selecting resource types
	
//	public static final Map<EClass, EClass> map;
//
//	static {
//	  Map<String, String> m = new HashMap<EClass, EClass>();
//	  m.put("key1","value1");  
//	  m.put("key2","value2");  
//	  map = Collections.unmodifiableMap(m);
//	}
	
	
	
	public ResourceInstanceTypePropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}
	/**
	 * Filters the ResourceTypes for a given ResourceInstance based on the name of the resourceType
	 * If class name of ResourceInstance or the supertype of the resourceinstance corresponds to a ResourceType
	 * then the value is shown as a choice
	 * TODO: Maybe remove the logic with a HashMap ResourceInstance to allowed Resource Type
	 */
	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		EObject eobject = (EObject) object;
		String classNameOfObject = eobject.eClass().getName().replace("Instance", "");
		String classNameOfSuperClass = "";
		if(!eobject.eClass().getEAllSuperTypes().isEmpty()){
			int indexOflastSuperType = eobject.eClass().getEAllSuperTypes().size()-1;
			classNameOfSuperClass = eobject.eClass().getEAllSuperTypes().get(indexOflastSuperType).getName().replace("Instance", "");
		}
		List<Resource> resourceTypes = new ArrayList<Resource>();
		for (Object value : super.getChoiceOfValues(object)) {
			if(value==null){
				continue;
			}
			String classNameOfValue = ((EObject) value).eClass().getName();
			if(classNameOfValue.contains(classNameOfObject)){
				resourceTypes.add((Resource) value);
				continue;
			}
			/**
			 * if the name of the super class is Resource, it is to general to make a decision
			 */
			if(classNameOfValue.contains(classNameOfSuperClass) && !classNameOfSuperClass.equalsIgnoreCase("Resource")){
				resourceTypes.add((Resource) value);
			}
//			if (value instanceof StructuredResourceInstance || value instanceof DeviceInstance) {
//				resourcInstances.add((ResourceInstance) value);
//			}
		}
		return resourceTypes;
	}
}
