/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.provider;


import de.uni_paderborn.fujaba.umlrt.model.behavior.BehaviorFactory;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentFactory;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;

import de.uni_paderborn.fujaba.umlrt.model.instance.InstanceFactory;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifaceFactory;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternFactory;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.provider.FujabaRealtimeStatechartItemProvider;
import de.uni_paderborn.fujaba.umlrt.model.core.provider.AbstractStatechartItemProvider;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechartFactory;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechartPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.expressions.ExpressionsFactory;
import org.storydriven.modeling.calls.CallsFactory;
import org.storydriven.modeling.patterns.PatternsFactory;
import org.storydriven.modeling.templates.TemplatesFactory;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimeStatechartItemProvider
	extends FujabaRealtimeStatechartItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechartItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns RealtimeStatechart.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RealtimeStatechart"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RealtimeStatechart)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RealtimeStatechart_type") :
			getString("_UI_RealtimeStatechart_type") + " " + label;
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

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CorePackage.Literals.ABSTRACT_STATECHART__UML_REALTIME_START_STATE ||
			childFeature == CorePackage.Literals.ABSTRACT_STATECHART__VERTICES ||
			childFeature == CorePackage.Literals.ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE ||
			childFeature == CorePackage.Literals.ABSTRACT_STATECHART__PROVIDED_MSG_IFACE ||
			childFeature == CorePackage.Literals.ABSTRACT_STATECHART__REQUIRED_MSG_IFACE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RealtimeStatechartEditPlugin.INSTANCE;
	}

}
