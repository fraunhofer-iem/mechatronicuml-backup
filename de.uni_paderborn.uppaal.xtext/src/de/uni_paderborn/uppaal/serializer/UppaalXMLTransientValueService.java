package de.uni_paderborn.uppaal.serializer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;

import de.uni_paderborn.uppaal.templates.AbstractTemplate;

public class UppaalXMLTransientValueService extends DefaultTransientValueService {
	
	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		
		if (owner instanceof AbstractTemplate)
		{
			// Ignore the comment field.
			if (feature instanceof EAttribute)
			{
				EAttribute attr = (EAttribute) feature;
				if ("comment".equals(attr.getName()))
					return true;
			}
		}
		
		return super.isTransient(owner, feature, index);
	}

}
