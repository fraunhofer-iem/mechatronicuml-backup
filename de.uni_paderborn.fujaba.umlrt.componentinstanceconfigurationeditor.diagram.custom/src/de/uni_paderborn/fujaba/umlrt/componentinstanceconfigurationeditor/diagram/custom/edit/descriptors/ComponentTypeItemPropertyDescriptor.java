package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.descriptors;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.edit.commands.UpdateComponentInstanceChildrenCommand;
import de.uni_paderborn.fujaba.umlrt.model.component.Component;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;

public class ComponentTypeItemPropertyDescriptor extends ItemPropertyDescriptor {

	public ComponentTypeItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	/**
	 * Copied from super class ItemPropertyDescriptor and modified to also
	 * execute our UpdateComponentInstanceChildrenCommand.
	 */
	@Override
	public void setPropertyValue(Object object, Object value) {

		EObject eObject = (EObject) object;
		EditingDomain editingDomain = getEditingDomain(object);

		if (parentReferences != null) {
			Command removeCommand = null;
			for (int i = 0; i < parentReferences.length; ++i) {
				Object oldValue = eObject.eGet(parentReferences[i]);
				if (oldValue != null) {
					final EReference parentReference = parentReferences[i];
					if (oldValue == value) {
						return;
					} else if (parentReference.getEType().isInstance(value)) {
						if (editingDomain == null) {
							eObject.eSet(parentReference, value);
							getUpdateCommand((ComponentInstance) object,
									(Component) value).execute();
						} else {
							CompoundCommand compoundCommand = new CompoundCommand();

							compoundCommand.append(SetCommand.create(
									editingDomain, getCommandOwner(eObject),
									parentReference, value));

							compoundCommand.append(getUpdateCommand(
									(ComponentInstance) object,
									(Component) value));
							editingDomain.getCommandStack().execute(
									compoundCommand);
						}
						return;
					} else {
						if (editingDomain == null) {
							eObject.eSet(parentReference, null);
							getUpdateCommand((ComponentInstance) object, null)
									.execute();
						} else {
							removeCommand = SetCommand.create(editingDomain,
									getCommandOwner(eObject), parentReference,
									null);
						}
						break;
					}
				}
			}

			for (int i = 0; i < parentReferences.length; ++i) {
				final EReference parentReference = parentReferences[i];
				if (parentReference.getEType().isInstance(value)) {
					if (editingDomain == null) {
						eObject.eSet(parentReferences[i], value);
					} else {
						if (removeCommand != null) {
							final CompoundCommand compoundCommand = new CompoundCommand(
									CompoundCommand.LAST_COMMAND_ALL);
							compoundCommand.append(removeCommand);
							compoundCommand.append(SetCommand.create(
									editingDomain, getCommandOwner(eObject),
									parentReference, value));
							compoundCommand.append(getUpdateCommand(
									(ComponentInstance) object,
									(Component) value));
							editingDomain.getCommandStack().execute(
									compoundCommand);
						} else {
							CompoundCommand compoundCommand = new CompoundCommand();

							compoundCommand.append(SetCommand.create(
									editingDomain, getCommandOwner(eObject),
									parentReference, value));

							compoundCommand.append(getUpdateCommand(
									(ComponentInstance) object,
									(Component) value));
							editingDomain.getCommandStack().execute(
									compoundCommand);
						}
					}
					break;
				}
			}
		} else {
			if (editingDomain == null) {
				eObject.eSet(feature, value);
				getUpdateCommand((ComponentInstance) object, (Component) value);
			} else {
				CompoundCommand compoundCommand = new CompoundCommand();

				compoundCommand.append(SetCommand.create(
						editingDomain, getCommandOwner(eObject),
						feature, value));

				compoundCommand.append(getUpdateCommand(
						(ComponentInstance) object,
						(Component) value));
				editingDomain.getCommandStack().execute(
						compoundCommand);
			}
		}
	}

	private Command getUpdateCommand(ComponentInstance object, Component value) {
		return new UpdateComponentInstanceChildrenCommand(object, value);
	}

}
