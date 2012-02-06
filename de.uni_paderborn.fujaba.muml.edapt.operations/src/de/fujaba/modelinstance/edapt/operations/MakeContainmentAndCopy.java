package de.fujaba.modelinstance.edapt.operations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edapt.declaration.EdaptConstraint;
import org.eclipse.emf.edapt.declaration.EdaptOperation;
import org.eclipse.emf.edapt.declaration.EdaptParameter;
import org.eclipse.emf.edapt.declaration.OperationImplementation;
import org.eclipse.emf.edapt.migration.Instance;
import org.eclipse.emf.edapt.migration.Metamodel;
import org.eclipse.emf.edapt.migration.Model;

// copied from org.eclipse.emf.edapt.declaration.simple.MakeContainment and modified.

@EdaptOperation(identifier = "makeContainmentAndCopy", label = "Make Reference Containment (Copy Instances)", description = "In the metamodel, a reference is made containment. In the model, its values are replaced by copies. Difference to \"Make Containment\": References are correctly set also for deep copies.")
public class MakeContainmentAndCopy extends OperationImplementation {

	/** {@description} */
	@EdaptParameter(main = true, description = "The reference")
	public EReference reference;

	/** {@description} */
	@EdaptConstraint(restricts = "reference", description = "The reference must not already be containment.")
	public boolean checkReferenceNotContainment(EReference reference) {
		return !reference.isContainment();
	}

	/** {@inheritDoc} */
	@Override
	public void execute(Metamodel metamodel, Model model) {
		EClass contextClass = reference.getEContainingClass();

		// metamodel adaptation
		reference.setContainment(true);

		// model migration
		for (Instance instance : model.getAllInstances(contextClass)) {
			if (reference.isMany()) {
				List<Instance> values = instance.unset(reference);
				for (Instance value : values) {
					instance.add(reference, new InstanceCopier(value).copy());
				}
			} else {
				Instance value = instance.unset(reference);
				if (value != null) {
					instance.set(reference, new InstanceCopier(value).copy());
				}
			}
		}
	}

	/**
	 * This class can be used to deeply copy instances. It was written, because
	 * the method InstanceImpl.copy() does not restore references correctly for
	 * deep copied instances.
	 * 
	 * @author bingo
	 * 
	 */
	private class InstanceCopier {
		private Instance instance;

		public InstanceCopier(Instance instance) {
			this.instance = instance;
		}

		public Instance copy() {

			// mapping of originals to copies
			Map<Instance, Instance> map = new HashMap<Instance, Instance>();

			// copy tree structure
			Instance copy = copyTree(instance, map);

			// copy cross references
			copyReferences(instance, map);

			// // BEGIN ADDED FUNCTIONALITY
			for (Instance original : map.keySet()) {
				copyReferences(original, map);
			}
			// // END ADDED FUNCTIONALITY

			return copy;
		}

		/** Copy the tree structure with an instance as root. */
		private Instance copyTree(Instance original, Map<Instance, Instance> map) {
			EClass eClass = original.getEClass();
			Instance copi = instance.getType().getModel().newInstance(eClass);
			for (EReference reference : eClass.getEAllReferences()) {
				if (reference.isContainment()) {
					if (reference.isMany()) {
						for (Instance child : original.getLinks(reference)) {
							copi.add(reference, copyTree(child, map));
						}
					} else {
						Instance child = original.get(reference);
						if (child != null) {
							copi.set(reference, copyTree(child, map));
						}
					}
				}
			}
			for (EAttribute attribute : eClass.getEAllAttributes()) {
				copi.set(attribute, original.get(attribute));
			}
			map.put(original, copi);
			return copi;
		}

		/** Copy cross references of an instance. */
		private void copyReferences(Instance original,
				Map<Instance, Instance> map) {
			EClass eClass = original.getEClass();
			Instance copi = map.get(original);
			for (EReference reference : eClass.getEAllReferences()) {
				if (!reference.isContainment()) {
					if (reference.isMany()) {
						if (reference.getEOpposite() == null
								|| reference.getEOpposite().isMany()) {
							for (Instance ref : original.getLinks(reference)) {
								if (map.get(ref) != null) {
									ref = map.get(ref);
								}
								copi.add(reference, ref);
							}
						}
					} else {
						if (reference.getEOpposite() == null
								|| !reference.getEOpposite().isContainment()) {
							Instance ref = original.get(reference);
							if (ref != null) {
								if (map.get(ref) != null) {
									ref = map.get(ref);
								}
								copi.set(reference, ref);
							}
						}
					}
				}
			}
		}

	}
}
