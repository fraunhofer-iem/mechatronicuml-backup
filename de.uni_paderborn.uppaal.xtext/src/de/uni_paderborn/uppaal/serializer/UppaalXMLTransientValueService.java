package de.uni_paderborn.uppaal.serializer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;

import de.uni_paderborn.uppaal.NTA;
import de.uni_paderborn.uppaal.templates.AbstractTemplate;

public class UppaalXMLTransientValueService extends DefaultTransientValueService {
	
	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
	
		/*
		 * If the metamodel contains attributes that should not be serialised but are
		 * not transient, e.g. the (now removed) comment-attribute of AbstractTemplate,
		 * they can be made transient here. An example can be seen commented below where
		 * the aforementioned comment-attribute of AbstractTemplate is ignored for the
		 * serialization.
		 */

		
		//		if (owner instanceof AbstractTemplate)
		//		{
		//			// Ignore the comment field.
		//			if (feature instanceof EAttribute)
		//			{
		//				EAttribute attr = (EAttribute) feature;
		//				if ("comment".equals(attr.getName()))
		//					return true;
		//			}
		//		}
		
		if (owner instanceof NTA)
		{
			// Ignore the name field.
			if (feature instanceof EAttribute)
			{
				EAttribute attr = (EAttribute) feature;
				if ("name".equals(attr.getName()))
					return true;
			}
		}
		
		
		return super.isTransient(owner, feature, index);
	}

}
