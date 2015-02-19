package de.uni_paderborn.fujaba.muml.storage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;

public class SynchronizationStorage extends ModelStorage<Synchronization> {
	private static final String name = "selector";

	public SynchronizationStorage(EObject model) {
		super(model);
		if (!(model instanceof Transition)) {
			throw new IllegalArgumentException("invalid model type");
		}
		Synchronization synchronization = ((Transition) model).getSynchronization();
		if (synchronization == null) {
			synchronization = addSynchronization(model);
		}
		setModel(synchronization);
	}
	
	private Synchronization addSynchronization(EObject model) {
		Synchronization synchronization = RealtimestatechartFactory.eINSTANCE.createSynchronization();
		setFeature(model, RealtimestatechartPackage.Literals.TRANSITION__SYNCHRONIZATION,
				synchronization);
		return synchronization;
	}

	@Override
	public InputStream getContents() throws CoreException {
		String text = "";
		Expression expression = getModel().getSelectorExpression();
		if (expression != null) {
			text = LanguageResource.serializeEObject(expression, getContainer());
		}
		return new ByteArrayInputStream(text.getBytes());
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	protected EStructuralFeature getFeature() {
		return RealtimestatechartPackage.Literals.SYNCHRONIZATION__SELECTOR_EXPRESSION;
	}

}
