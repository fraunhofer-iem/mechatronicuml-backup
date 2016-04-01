
package org.muml.ontology.properties.constraint;

public class CreationConstraintContributor
		extends
			org.muml.ape.runtime.constraint.DefaultCreationConstraintContributor {

	public CreationConstraintContributor() {

		{
			final org.eclipse.emf.ecore.EClass myClass = org.muml.ontology.OntologyPackage.eINSTANCE
					.getOntologyExtension();
			final org.eclipse.emf.ecore.EReference opposite = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final org.eclipse.emf.ecore.EClass oppositeClass = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement();
			final org.eclipse.ocl.ecore.OCLExpression expression = org.muml.ape.runtime.RuntimePlugin
					.createOCLExpression(
							"self.oclIsKindOf(muml::component::Port) or self.oclIsKindOf(muml::component::Component) or self.oclIsKindOf(muml::component::ComponentPart) or self.oclIsKindOf(muml::component::PortPart)",
							opposite, oppositeClass);
			final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
					.createQuery(expression);
			if (expression != null) {
				org.muml.ape.runtime.filter.ICreationFilter filter = new org.muml.ape.runtime.filter.ICreationFilter() {
	
					@Override
					public boolean select(Object object, org.eclipse.emf.ecore.EClass eClass) {
						return !eClass.isSuperTypeOf(myClass)
								|| (object != null && Boolean.TRUE.equals(query.evaluate(object)));
					}
	
				};
				if (filter != null) {
					addConstraintFilter(opposite, filter);
				}
			}
		}

	}

}