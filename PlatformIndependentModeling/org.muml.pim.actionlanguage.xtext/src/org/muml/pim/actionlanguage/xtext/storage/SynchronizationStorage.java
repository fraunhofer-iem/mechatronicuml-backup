package org.muml.pim.actionlanguage.xtext.storage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.actionlanguage.xtext.common.LanguageResource;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.pim.realtimestatechart.Transition;

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
