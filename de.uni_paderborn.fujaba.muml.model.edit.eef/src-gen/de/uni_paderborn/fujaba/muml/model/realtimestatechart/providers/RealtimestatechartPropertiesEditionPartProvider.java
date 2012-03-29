/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.AbsoluteDeadlinePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.ActionPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.AsynchronousMessageEventPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.ClockConstraintPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.ClockPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.DoEventPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.EntryEventPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.EntryPointPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.ExitEventPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.ExitPointPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.MessagePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.RealtimeStatechartPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.RegionPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.RelativeDeadlinePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.StateEntryPointPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.StateExitPointPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.StatePropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.SynchronizationChannelPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.SynchronizationPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms.TransitionPropertiesEditionPartForm;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.AbsoluteDeadlinePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.ActionPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.AsynchronousMessageEventPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.ClockConstraintPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.ClockPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.DoEventPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.EntryEventPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.EntryPointPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.ExitEventPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.ExitPointPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.MessagePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.RealtimeStatechartPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.RegionPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.RelativeDeadlinePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.StateEntryPointPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.StateExitPointPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.StatePropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.SynchronizationChannelPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.SynchronizationPropertiesEditionPartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl.TransitionPropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class RealtimestatechartPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == RealtimestatechartViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == RealtimestatechartViewsRepository.AbsoluteDeadline.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new AbsoluteDeadlinePropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new AbsoluteDeadlinePropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.RelativeDeadline.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new RelativeDeadlinePropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new RelativeDeadlinePropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.Clock.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new ClockPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new ClockPropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.Region.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new RegionPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new RegionPropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.State.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new StatePropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new StatePropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.Transition.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new TransitionPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new TransitionPropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.ClockConstraint.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new ClockConstraintPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new ClockConstraintPropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.Action.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new ActionPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new ActionPropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.AsynchronousMessageEvent.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new AsynchronousMessageEventPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new AsynchronousMessageEventPropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.DoEvent.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new DoEventPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new DoEventPropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.SynchronizationChannel.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new SynchronizationChannelPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new SynchronizationChannelPropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.Synchronization.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new SynchronizationPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new SynchronizationPropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.RealtimeStatechart_.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new RealtimeStatechartPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new RealtimeStatechartPropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.Message.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new MessagePropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new MessagePropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.EntryEvent.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new EntryEventPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new EntryEventPropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.ExitEvent.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new ExitEventPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new ExitEventPropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.EntryPoint.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new EntryPointPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new EntryPointPropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.ExitPoint.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new ExitPointPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new ExitPointPropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.StateEntryPoint.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new StateEntryPointPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new StateEntryPointPropertiesEditionPartForm(component);
		}
		if (key == RealtimestatechartViewsRepository.StateExitPoint.class) {
			if (kind == RealtimestatechartViewsRepository.SWT_KIND)
				return new StateExitPointPropertiesEditionPartImpl(component);
			if (kind == RealtimestatechartViewsRepository.FORM_KIND)
				return new StateExitPointPropertiesEditionPartForm(component);
		}
		return null;
	}

}
