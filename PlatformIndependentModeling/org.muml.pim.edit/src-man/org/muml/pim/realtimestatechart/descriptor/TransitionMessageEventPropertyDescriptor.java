package org.muml.pim.realtimestatechart.descriptor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.core.common.descriptor.DefaultChainedPropertyDescriptor;
import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.pim.realtimestatechart.EventKind;

public class TransitionMessageEventPropertyDescriptor extends
		DefaultChainedPropertyDescriptor {

	private EventKind eventKind;

	public TransitionMessageEventPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	
	public void setEventKind(EventKind eventKind) {
		this.eventKind = eventKind;
	}

	@Override
	public Object createObject() {
		AsynchronousMessageEvent messageEvent = (AsynchronousMessageEvent) super
				.createObject();
		messageEvent.setKind(eventKind);
		return messageEvent;
	}

	@Override
	public void doSetValue(Object object, Object newValue) {
		Object oldValue = super.doGetValue((EObject) object,
				(EStructuralFeature) getFeature(object));

		List<AsynchronousMessageEvent> newEvents = new ArrayList<AsynchronousMessageEvent>();

		@SuppressWarnings("unchecked")
		List<AsynchronousMessageEvent> events = (List<AsynchronousMessageEvent>) oldValue;
		for (AsynchronousMessageEvent event : events) {
			if (event.getKind() != eventKind) {
				newEvents.add(event);
			}
		}
		newEvents.add((AsynchronousMessageEvent) newValue);

		super.doSetValue(object, newEvents);
	}

	@Override
	public Object doGetValue(EObject object, EStructuralFeature feature) {
		List<?> events = (List<?>) super.doGetValue(object, feature);
		if (events != null) {
			for (Object o : events) {
				AsynchronousMessageEvent event = (AsynchronousMessageEvent) o;
				if (event.getKind() == eventKind) {
					return event;
				}
			}
		}
		return null;
	}

	@Override
	public String getMyId(Object object) {
		// Identifiers for TriggerMessageEvents and RaiseMessageEvents
		// are the same, we have to make them unique.
		return eventKind.toString() + super.getMyId(object);
	}

}