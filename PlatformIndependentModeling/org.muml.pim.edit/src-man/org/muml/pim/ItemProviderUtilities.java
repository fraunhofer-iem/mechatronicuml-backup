package org.muml.pim;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.muml.core.NamedElement;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.pim.component.PortPart;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;

public class ItemProviderUtilities {
		
	public static final int MAX_NAME_LENGTH = 10;
	public static final String ELLIPSES = "[...]";
	private static final String UNKNOWN_NAME_LITERAL = "[unknown]";
	private static final String DELIMITER = ".";
	
	private static final List<EClass> HIDDEN_CLASSES = Arrays.asList(new EClass[] { RealtimestatechartPackage.Literals.REGION });

	public static String getFullyQualifiedName(EObject object) {

		StringBuffer buffer = new StringBuffer();
		
		EObject currentObject = object;
		while (null != currentObject && currentObject.eClass() != null && false == (currentObject instanceof ModelElementCategory)) {
			if (!HIDDEN_CLASSES.contains(currentObject.eClass()) || object == currentObject) {
				buffer.insert(0, getName(currentObject));
				buffer.insert(0, DELIMITER);
			}
			currentObject = currentObject.eContainer();
		}
		return buffer.substring(DELIMITER.length());
	}
	
	public static String getFullyQualifiedName(Object object) {
		if (object instanceof EObject) {
			return getFullyQualifiedName((EObject) object);
		}
		return getShortenedString(object.toString());
	}
	
	public static String getShortenedString(String text) {
		String firstLine = text.split("\n")[0];
		
		if (firstLine.length() > MAX_NAME_LENGTH) {
			firstLine = firstLine.substring(0, MAX_NAME_LENGTH - ELLIPSES.length()) + ELLIPSES;
		}
		
		return firstLine;
	}

	public static String getName(EObject object) {
		if (object instanceof PortPart) {
			PortPart portPart = (PortPart) object;
			if (portPart.getPortType() != null) {
				return getName(portPart.getPortType());
			}
		}
		
		if (object instanceof NamedElement) {
			if (((NamedElement) object).getName()!= null) {
				return ((NamedElement) object).getName();
			}
			return UNKNOWN_NAME_LITERAL;
		}		
		EAttribute nameFeature = null;
		if (object.eClass() != null) {
			for (EAttribute feature : object.eClass().getEAllAttributes()) {
				if (feature.getEAttributeType() == EcorePackage.Literals.ESTRING) {
					nameFeature = feature;
				}
			}
			if (!object.eClass().getEAllAttributes().isEmpty()) {
				nameFeature = object.eClass().getEAllAttributes().get(0);
			}
		}
		if (nameFeature != null) {
			return object.eGet(nameFeature).toString();
		}
		
		return UNKNOWN_NAME_LITERAL;
	}
	
	

}
