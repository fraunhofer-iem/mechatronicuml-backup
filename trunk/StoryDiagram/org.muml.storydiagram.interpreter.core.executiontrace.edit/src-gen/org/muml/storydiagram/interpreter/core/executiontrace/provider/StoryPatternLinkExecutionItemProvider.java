/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution;

/**
 * This is the item provider adapter for a {@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StoryPatternLinkExecutionItemProvider extends ExecutionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPatternLinkExecutionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addStoryPatternLinkPropertyDescriptor(object);
			addSourceStoryPatternObjectPropertyDescriptor(object);
			addTargetStoryPatternObjectPropertyDescriptor(object);
			addSourceObjectPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Story Pattern Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStoryPatternLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StoryPatternLinkExecution_storyPatternLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StoryPatternLinkExecution_storyPatternLink_feature", "_UI_StoryPatternLinkExecution_type"),
				 ExecutiontracePackage.Literals.STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Story Pattern Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceStoryPatternObjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StoryPatternLinkExecution_sourceStoryPatternObject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StoryPatternLinkExecution_sourceStoryPatternObject_feature", "_UI_StoryPatternLinkExecution_type"),
				 ExecutiontracePackage.Literals.STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Story Pattern Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetStoryPatternObjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StoryPatternLinkExecution_targetStoryPatternObject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StoryPatternLinkExecution_targetStoryPatternObject_feature", "_UI_StoryPatternLinkExecution_type"),
				 ExecutiontracePackage.Literals.STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceObjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StoryPatternLinkExecution_sourceObject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StoryPatternLinkExecution_sourceObject_feature", "_UI_StoryPatternLinkExecution_type"),
				 ExecutiontracePackage.Literals.STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		StoryPatternLinkExecution<?, ?> storyPatternLinkExecution = (StoryPatternLinkExecution<?, ?>)object;
		return getString("_UI_StoryPatternLinkExecution_type") + " " + storyPatternLinkExecution.getExecutionStartedTimeStamp();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(StoryPatternLinkExecution.class)) {
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK:
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT:
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT:
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
