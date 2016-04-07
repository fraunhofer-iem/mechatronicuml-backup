/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.EMFEditPlugin;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintHolds;

/**
 * This is the item provider adapter for a {@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintHolds} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class StoryPatternConstraintHoldsItemProvider extends StoryPatternConstraintEvaluationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StoryPatternConstraintHoldsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns StoryPatternConstraintHolds.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StoryPatternConstraintHolds"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public String getText(final Object object) {
		String label = this.getString("_UI_StoryPatternConstraintHolds_type") + " ";
		final StoryPatternConstraintHolds<?, ?> storyPatternConstraintHolds = (StoryPatternConstraintHolds<?, ?>) object;

		final ComposedAdapterFactory factory = new ComposedAdapterFactory(
				EMFEditPlugin.getComposedAdapterFactoryDescriptorRegistry());

		if (storyPatternConstraintHolds.getConstraint() != null) {
			if (storyPatternConstraintHolds.getConstraint() instanceof EObject) {
				label += ((IItemLabelProvider) factory.adapt(storyPatternConstraintHolds.getConstraint(),
						IItemLabelProvider.class)).getText(storyPatternConstraintHolds.getConstraint());
			} else {
				label += storyPatternConstraintHolds.getConstraint().toString();
			}
		} else {
			label += "[null]";
		}

		label += " on ";

		if (storyPatternConstraintHolds.getStoryPattern() != null) {
			if (storyPatternConstraintHolds.getStoryPattern() instanceof EObject) {
				label += ((IItemLabelProvider) factory.adapt(storyPatternConstraintHolds.getStoryPattern(),
						IItemLabelProvider.class)).getText(storyPatternConstraintHolds.getStoryPattern());
			} else {
				label += storyPatternConstraintHolds.getStoryPattern().toString();
			}
		} else {
			label += "[null]";
		}

		return label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
