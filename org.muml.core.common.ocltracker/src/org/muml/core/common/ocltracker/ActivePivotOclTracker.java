package org.muml.core.common.ocltracker;

import java.util.ArrayList;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.tooling.runtime.ocl.tracker.OclTrackerBase;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.utilities.ParserException;

public class ActivePivotOclTracker extends OclTrackerBase {
	
	private static final String idPrefix = "ActivePivotOclTracker#SemanticModel";
	
	private Registrator registrator;
	private NotificationListener listener;
	private DependencyCollector dependencyCollector;
	private boolean initialized;
	private boolean cached;
	private Object evaluationResult;

	public ActivePivotOclTracker(String expressionBody, boolean cached) {
		super(expressionBody);
		dependencyCollector = new DependencyCollector();
		initialized = false;
		this.cached = cached;
	}
	
	protected boolean isInitialized() {
		return initialized;
	}
	
	protected boolean isCached() {
		return cached;
	}

	@Override
	public void installListeners(TransactionalEditingDomain domain, NotificationListener listener,
			Registrator registrator) {
		this.registrator = registrator;
		this.listener = listener;
		registerListeners();
	}
	
	private static String getNameFor(int i) {
		return idPrefix + i;
	}

	@Override
	public void uninstallListeners() {
		if (registrator == null) {
			// this codepath is used!
			return;
		}
		for (int i = 0; i < dependencyCollector.getCollectedObjects().size(); i++) {
			registrator.unregisterListener(getNameFor(i));
		}
	}

	@Override
	public Object getValue() {
		if (!isInitialized() || !isCached()) {
			doInitialize();
		}
		return evaluationResult;
	}

	@Override
	public boolean handleNotification(Notification notification) {
		Object notifier = notification.getNotifier();
		if (!(notifier instanceof EObject)) {
			throw new IllegalStateException("expected notifier of type EObject");
		}
		Set<EStructuralFeature> dependencySet = dependencyCollector
				.getDependencies((EObject) notifier);
		if (dependencySet.contains(notification.getFeature())) {
			doInitialize();
			return true;
		}
		return false;
	}

	@Override
	protected void doInitialize() {
		uninstallListeners();
		dependencyCollector.clear();
		evaluateOCL();
		registerListeners();
		initialized = true;
	}
	
	protected void evaluateOCL() {
		// XXX: this is probably quite expensive (building the complete model
		// in the background etc.) - we could improve by caching the ocl object
		DependencyCollectingPivotEnvironmentFactory factory = new DependencyCollectingPivotEnvironmentFactory();
		DependencyCollectingOCLInternal ocl = factory.createOCL();
		ExpressionInOCL expression;
		try {
			expression = ocl.createQuery(getContext().eClass(), getExpressionBody());
		} catch (ParserException e) {
			throw new RuntimeException(e);
		}
		evaluationResult = ocl.evaluate(getContext(), expression, dependencyCollector);
	}
	
	protected void registerListeners() {
		if (registrator == null) {
			return;
		}
		ArrayList<EObject> list = new ArrayList<EObject>(dependencyCollector
				.getCollectedObjects());
		for (int i = 0; i < list.size(); i++) {
			registrator.registerListener(getNameFor(i), listener, list.get(i));
		}
	}

}
