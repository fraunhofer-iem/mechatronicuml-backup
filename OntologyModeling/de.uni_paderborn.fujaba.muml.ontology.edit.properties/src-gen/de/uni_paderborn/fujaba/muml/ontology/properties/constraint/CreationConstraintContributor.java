package de.uni_paderborn.fujaba.muml.ontology.properties.constraint;

public class CreationConstraintContributor
		extends
			de.uni_paderborn.fujaba.properties.runtime.constraint.DefaultCreationConstraintContributor {

	public CreationConstraintContributor() {

		{
			final org.eclipse.emf.ecore.EClass myClass = de.uni_paderborn.fujaba.muml.ontology.OntologyPackage.eINSTANCE
					.getOntologyExtension();
			final org.eclipse.emf.ecore.EReference opposite = org.storydriven.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final org.eclipse.emf.ecore.EClass oppositeClass = org.storydriven.core.CorePackage.eINSTANCE
					.getExtendableElement();
			final org.eclipse.ocl.ecore.OCLExpression expression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
					.createOCLExpression(
							"self.oclIsKindOf(muml::component::Port)",
							opposite, oppositeClass);
			final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin.OCL_ECORE
					.createQuery(expression);
			de.uni_paderborn.fujaba.properties.runtime.filter.ICreationFilter filter = new de.uni_paderborn.fujaba.properties.runtime.filter.ICreationFilter() {

				@Override
				public boolean select(Object object,
						org.eclipse.emf.ecore.EClass eClass) {
					return !eClass.isSuperTypeOf(myClass)
							|| (object != null && Boolean.TRUE.equals(query
									.evaluate(object)));
				}

			};
			if (filter != null) {
				addConstraintFilter(opposite, filter);
			}
		}

	}

}
