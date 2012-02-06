package de.uni_paderborn.fujaba.muml.edapt.operations;

import java.util.ArrayList;
import java.util.Collection;

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

@EdaptOperation(identifier = "makeContainmentAndMove", label = "Make Reference Containment (Move Instances)", description = "In the metamodel, a reference is made containment. In the model, the values are moved into the containment reference.")
public class MakeContainmentAndMove extends OperationImplementation {

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
				Collection<Instance> values = instance.unset(reference);
				for (Instance value : values) {
					moveValue(instance, value);
				}
			} else {
				Instance value = instance.unset(reference);
				if (value != null) {
					moveValue(instance, value);
				}
			}
		}
	}

	private void moveValue(Instance instance, Instance value) {
		// Remove the value from its old container
		if (!value.getContainerReference().isMany()) {
			// If it is NOT a many-feature, it is as simple as unsetting the feature value.
			value.getContainer().unset(value.getContainerReference());
		} else {
			// Get the contained children of the former container
			Collection<Instance> children = value.getContainer().get(value.getContainerReference());
			
			// Create a simple ArrayList, which we are allowed to modify
			Collection<Instance> modifiableChildren = new ArrayList<Instance>(children); 
			
			// Remove this value from that former container
			modifiableChildren.remove(value);
			
			// Update the list of children contained in the old container
			value.getContainer().set(value.getContainerReference(), modifiableChildren);
		}
		
		// Put the value into the new container
		instance.set(reference, value);
	}
}
