package org.muml.pim.siriusproperties.custom.embeddedxtexteditor;

import java.util.List;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFCustomWidgetController;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.muml.core.common.xtext.ILoadResult;
import org.muml.pim.actionlanguage.xtext.common.LanguageResource;

public class XtextPartialViewerController extends AbstractEEFCustomWidgetController {
	private EObject element;
	private String featureName;
	private Consumer<List<Notification>> listener = notifications -> notify(notifications);
	private XtextPartialViewerLifecycleManager manager;
	
	public XtextPartialViewerController(EEFCustomWidgetDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter, String featureName, XtextPartialViewerLifecycleManager manager) {
		super(description, variableManager, interpreter, contextAdapter);
		this.featureName = featureName;
		contextAdapter.registerModelChangeListener(listener);
		this.manager = manager;
	}

	private void notify(List<Notification> notifications) {
		for (Notification notification :  notifications) {
			if (notification.getNotifier() == element) {
				manager.update();
			}
		}
	}

	@Override
	protected EEFCustomWidgetDescription getDescription() {
		return this.description;
	}

	@Override
	public void refresh() {
		super.refresh();
		this.newEval().call("var:self", newElement -> setElement((EObject) newElement));
	}

	public String getFeatureName() {
		return featureName;
	}

	public String readModelValue() {
		EStructuralFeature feature = element.eClass().getEStructuralFeature(featureName);
		String text = null;
		if (feature != null) {
			Object value = element.eGet(feature);
			if (value instanceof String) {
				text = (String) value;
			}
			if (feature instanceof EReference && !feature.isMany()) {
				text = LanguageResource.serializeEObjectSafe((EObject) value, element);
			}
		}
		if (text == null) {
			text = "";
		}
		return text;
	}

	public IStatus persistModelValue(String text) {
		return editingContextAdapter.performModelChange(new Runnable() {
			@Override
			public void run() {
				Object newValue = null;
				EStructuralFeature feature = element.eClass().getEStructuralFeature(featureName);
				if (feature != null) {
					if (feature.getEType() == EcorePackage.eINSTANCE.getEString()) {
						newValue = text;
					} else if (feature instanceof EReference && !feature.isMany()) {
						ILoadResult loadResult = LanguageResource.loadFromString(text, element);
						newValue = loadResult.getEObject();
					}
					element.eSet(feature, newValue);
				}
			}
		});
		
	}

	public void setElement(EObject element) {
		if (this.element != element) {
			this.element = element;
			manager.update();
		}
	}
}
