package org.muml.graphviz.dot.xtext.service

import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EObject
import org.muml.graphviz.dot.DotPackage

class DotLanguageTransientValueService extends DefaultTransientValueService {
	
	override def boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		if (feature == DotPackage.eINSTANCE.dotGraph_Cluster) {
			// no need to serialize this feature: it is constructed from the DotGraphID
			// (during the parsing) and serialization takes care that the DotGraphID is
			// prefixed with "cluster"
			true
		} else {
			super.isTransient(owner, feature, index)
		}
	}
	
}