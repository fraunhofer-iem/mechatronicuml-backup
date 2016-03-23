package org.muml.cbs.dependencylanguage.synthesis.qvtoblackbox;

import org.eclipse.emf.ecore.EObject;
import org.muml.cbs.dependencylanguage.xtext.common.DependencyModelLanguageResource;

import de.uni_paderborn.fujaba.muml.common.LanguageResource;

public class XTextSerializerBlackbox {
		public String serializeActionLanguage(EObject obj){
			return LanguageResource.serializeEObjectSafe(obj, obj);
		}
		public String serializeDependencyLanguage(EObject obj){
			return DependencyModelLanguageResource.serializeEObjectSafe(obj, obj);
		}
}
