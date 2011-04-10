package de.uni_paderborn.fujaba.umlrt.model.adapter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

public class DerivedAttributeAdapter extends DependantAttributeAdapter {
	protected final EStructuralFeature derivedFeature;
	protected int eventType;
	
	public DerivedAttributeAdapter(EObject source,
			EStructuralFeature derivedFeature, int eventType) {
		super();
		this.eventType = eventType;
		this.derivedFeature = derivedFeature;
		this.source = (InternalEObject) source;
		source.eAdapters().add(this);
	}

	private final InternalEObject source;

	@Override
	protected void notifyDependantAttributeChange() {

		if (source.eNotificationRequired()) {
			source.eNotify(new ENotificationImpl(source, eventType,
					derivedFeature, null, source.eGet(derivedFeature, true,
							true)));
		}
	}

}
