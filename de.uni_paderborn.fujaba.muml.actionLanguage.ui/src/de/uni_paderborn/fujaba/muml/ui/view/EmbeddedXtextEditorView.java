package de.uni_paderborn.fujaba.muml.ui.view;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.storage.ActionStorage;
import de.uni_paderborn.fujaba.muml.storage.GuardStorage;
import de.uni_paderborn.fujaba.muml.storage.IModelStorage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitEvent;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoEventEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryEventEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitEventEditPart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart;
import de.uni_paderborn.fujaba.muml.ui.internal.ActionLanguageActivator;
import de.uni_paderborn.fujaba.muml.ui.xtfo.EmbeddedXtextEditor;

public class EmbeddedXtextEditorView extends ViewPart implements ISelectionListener {
	
	private static final String languageName = "de.uni_paderborn.fujaba.muml.ActionLanguage";
	
	private EmbeddedXtextEditor editor;
	private IModelStorage modelStorage;
	private IAction guardAction;
	private SaveModelListener saveModelListener;
	
	class GuardAction extends Action {
		public GuardAction() {
			super("guard expression", IAction.AS_CHECK_BOX);
			setEnabled(false);
		}
		
		public void run() {
			if (modelStorage != null) {
				Injector injector = ActionLanguageActivator.getInstance().getInjector(languageName);
				if (isChecked()) {
					modelStorage = new GuardStorage(modelStorage.getContainer());
					//injector = GuardLanguageUiModule.getInjector();
				} else {
					modelStorage = new ActionStorage(modelStorage.getContainer());
					//injector = ActionLanguageActivator.getInstance().getInjector(languageName);
				}
				LanguageResource.setInjector(injector);
				//editor.changeLanguage(injector);
 				editor.update(modelStorage.serialize());
			}
		}
	}
	
	class SaveModelListener implements IXtextModelListener {

		@Override
		public void modelChanged(XtextResource resource) {
			// using the resource directly isn't "thread safe"
			// because the resource might have been changed again after we
			// checked it via getErrors()...
			if (modelStorage != null) {
				try {
					String text = editor.getDocument().get();
					modelStorage.save(text);
					//System.out.println("valid");
				} catch (CoreException e) {
					//System.out.println("invalid");
					// text is invalid
				}
			}
		}
		
	}
	
	private void createEditor(Composite parent) {
		Injector injector = ActionLanguageActivator.getInstance().getInjector(languageName);
		LanguageResource.setInjector(injector);
		editor = new EmbeddedXtextEditor(parent, injector);
		saveModelListener = new SaveModelListener();
		editor.getDocument().addModelListener(saveModelListener);
	}
	
	private void createActions() {
		IToolBarManager manager = getViewSite().getActionBars().getToolBarManager();
		guardAction = new GuardAction();
		manager.add(guardAction);
	}

	@Override
	public void createPartControl(Composite parent) {
		createEditor(parent);
		createActions();
		getViewSite().getPage().addSelectionListener(this);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object object = structuredSelection.getFirstElement();
			updateModelStorage(object);
			if (modelStorage != null) {
				editor.update(modelStorage.serialize());
			} else {
				editor.update("// invalid element select");
			}
		}
	}
	
	@Override
	public void dispose() {
		editor.getDocument().removeModelListener(saveModelListener);
		getViewSite().getPage().removeSelectionListener(this);
		super.dispose();
	}
	
	private void updateModelStorage(Object object) {
		//System.out.println(object);
		boolean enableSwitchAction = false;
		//boolean wasGuard = modelStorage instanceof GuardStorage;
		if (object instanceof DoEventEditPart
				|| object instanceof EntryEventEditPart
				|| object instanceof ExitEventEditPart) {
			EObject model = (EObject) ((GraphicalEditPart) object).getAdapter(EObject.class);
			modelStorage = new ActionStorage(model);
		} else if (object instanceof DoEvent
				|| object instanceof EntryEvent
				|| object instanceof ExitEvent) {
			modelStorage = new ActionStorage((EObject) object);
		} else if (object instanceof TransitionEditPart) {
			EObject model = (EObject) ((ConnectionEditPart) object).getAdapter(EObject.class);
			if (guardAction.isChecked()) {
				modelStorage = new GuardStorage(model);
			} else {
				modelStorage = new ActionStorage(model);
			}
			enableSwitchAction = true;
		} else {
			// invalid selection
			modelStorage = null;
		}
		/*
		if (wasGuard && !(modelStorage instanceof GuardStorage)) {
			Injector injector = ActionLanguageActivator.getInstance().getInjector(languageName);
			ActionLanguageResource.setInjector(injector);
			editor.changeLanguage(injector);
		} else if (!wasGuard && modelStorage instanceof GuardStorage) {
			Injector injector = GuardLanguageUiModule.getInjector();
			ActionLanguageResource.setInjector(injector);
			editor.changeLanguage(injector);
		}*/
		guardAction.setEnabled(enableSwitchAction);
	}

}
