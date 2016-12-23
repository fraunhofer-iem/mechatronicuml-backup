package org.muml.pim.actionlanguage.xtext.ui.view;
//
//import org.eclipse.core.runtime.CoreException;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
//import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
//import org.eclipse.jface.action.Action;
//import org.eclipse.jface.action.IAction;
//import org.eclipse.jface.action.IMenuCreator;
//import org.eclipse.jface.action.IToolBarManager;
//import org.eclipse.jface.viewers.ISelection;
//import org.eclipse.jface.viewers.IStructuredSelection;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.events.SelectionEvent;
//import org.eclipse.swt.events.SelectionListener;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.Control;
//import org.eclipse.swt.widgets.Menu;
//import org.eclipse.swt.widgets.MenuItem;
//import org.eclipse.ui.ISelectionListener;
//import org.eclipse.ui.IWorkbenchPart;
//import org.eclipse.ui.part.ViewPart;
//import org.eclipse.xtext.resource.XtextResource;
//import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
//
//import com.google.inject.Injector;
//
//import org.muml.pim.common.LanguageResource;
//import org.muml.pim.realtimestatechart.DoEvent;
//import org.muml.pim.realtimestatechart.EntryEvent;
//import org.muml.pim.realtimestatechart.ExitEvent;
//import org.muml.pim.realtimestatechart.diagram.edit.parts.DoEventEditPart;
//import org.muml.pim.realtimestatechart.diagram.edit.parts.EntryEventEditPart;
//import org.muml.pim.realtimestatechart.diagram.edit.parts.ExitEventEditPart;
//import org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart;
//import de.uni_paderborn.fujaba.muml.storage.ActionStorage;
//import de.uni_paderborn.fujaba.muml.storage.GuardStorage;
//import de.uni_paderborn.fujaba.muml.storage.IModelStorage;
//import de.uni_paderborn.fujaba.muml.storage.SynchronizationStorage;
//import de.uni_paderborn.fujaba.muml.ui.internal.ActionLanguageActivator;
//import de.uni_paderborn.fujaba.muml.ui.xtfo.EmbeddedXtextEditor;
//
//public class EmbeddedXtextEditorView extends ViewPart implements ISelectionListener {
//	
//	private static final String languageName = "org.muml.pim.actionlanguage";
//	
//	private EmbeddedXtextEditor editor;
//	private IModelStorage modelStorage;
//	private TransitionExpressionSelector transitionExpressionSelector;
//	private SaveModelListener saveModelListener;
//	
//	class TransitionExpressionSelector extends Action implements SelectionListener {
//		private static final String actionSelection = "action expr";
//		private static final String guardSelection = "guard expr";
//		private static final String selectorSelection = "selector";
//		private String currentSelection = actionSelection;
//		
//		public TransitionExpressionSelector() {
//			super(selectorSelection, IAction.AS_DROP_DOWN_MENU);
//			//setEnabled(false);
//			setMenuCreator(new IMenuCreator() {
//				private Menu menu;
//
//				@Override
//				public void dispose() {
//					if (menu != null) {
//						for (MenuItem menuItem : menu.getItems()) {
//							menuItem.dispose();
//						}
//						menu.dispose();
//					}
//				}
//
//				@Override
//				public Menu getMenu(Control parent) {
//					if (menu != null) {
//						menu.dispose();
//					}
//					menu = new Menu(parent);
//					addMenuItem(actionSelection);
//					addMenuItem(guardSelection);
//					addMenuItem(selectorSelection);
//					return menu;
//				}
//				
//				private void addMenuItem(String name) {
//					MenuItem menuItem = new MenuItem(menu, SWT.RADIO);
//					menuItem.setText(name);
//					menuItem.addSelectionListener(TransitionExpressionSelector.this);
//				}
//
//				@Override
//				public Menu getMenu(Menu parent) {
//					// TODO Auto-generated method stub
//					return null;
//				}
//				
//			});
//			setText(actionSelection);
//		}
//
//		@Override
//		public void widgetSelected(SelectionEvent e) {
//			currentSelection = ((MenuItem) e.widget).getText();
//			setText(currentSelection);
//			if (modelStorage != null) {
//				Injector injector = ActionLanguageActivator.getInstance().getInjector(languageName);
//				LanguageResource.setInjector(injector);
//				setSelectedModelStorage(modelStorage.getContainer());
//				//editor.changeLanguage(injector);
// 				editor.update(modelStorage.serialize());
//			}
//		}
//
//		@Override
//		public void widgetDefaultSelected(SelectionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("default: " + e);
//		}
//		
//		public void setSelectedModelStorage(EObject object) {
//			if (currentSelection.equals(actionSelection)) {
//				modelStorage = new ActionStorage(object);
//				//injector = GuardLanguageUiModule.getInjector();
//			} else if (currentSelection.equals(guardSelection)) {
//				modelStorage = new GuardStorage(object);
//				//injector = ActionLanguageActivator.getInstance().getInjector(languageName);
//			} else {
//				modelStorage = new SynchronizationStorage(object);
//			}
//		}
//	}
//	
//	class SaveModelListener implements IXtextModelListener {
//
//		@Override
//		public void modelChanged(XtextResource resource) {
//			// using the resource directly isn't "thread safe"
//			// because the resource might have been changed again after we
//			// checked it via getErrors()...
//			if (modelStorage != null) {
//				try {
//					String text = editor.getDocument().get();
//					modelStorage.save(text);
//					//System.out.println("valid");
//				} catch (CoreException e) {
//					//System.out.println("invalid");
//					// text is invalid
//				}
//			}
//		}
//		
//	}
//	
//	private void createEditor(Composite parent) {
//		Injector injector = ActionLanguageActivator.getInstance().getInjector(languageName);
//		LanguageResource.setInjector(injector);
//		editor = new EmbeddedXtextEditor(parent, injector);
//		saveModelListener = new SaveModelListener();
//		editor.getDocument().addModelListener(saveModelListener);
//	}
//	
//	private void createActions() {
//		IToolBarManager manager = getViewSite().getActionBars().getToolBarManager();
//		transitionExpressionSelector = new TransitionExpressionSelector();
//		manager.add(transitionExpressionSelector);
//	}
//
//	@Override
//	public void createPartControl(Composite parent) {
//		createEditor(parent);
//		createActions();
//		getViewSite().getPage().addSelectionListener(this);
//	}
//
//	@Override
//	public void setFocus() {
//		// TODO Auto-generated method stub
//	}
//
//	@Override
//	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
//		if (selection instanceof IStructuredSelection) {
//			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
//			Object object = structuredSelection.getFirstElement();
//			updateModelStorage(object);
//			if (modelStorage != null) {
//				editor.update(modelStorage.serialize());
//			} else {
//				editor.update("// invalid element select");
//			}
//		}
//	}
//	
//	@Override
//	public void dispose() {
//		editor.getDocument().removeModelListener(saveModelListener);
//		getViewSite().getPage().removeSelectionListener(this);
//		super.dispose();
//	}
//	
//	private void updateModelStorage(Object object) {
//		//System.out.println(object);
//		boolean enableSwitchAction = false;
//		//boolean wasGuard = modelStorage instanceof GuardStorage;
//		if (object instanceof DoEventEditPart
//				|| object instanceof EntryEventEditPart
//				|| object instanceof ExitEventEditPart) {
//			EObject model = (EObject) ((GraphicalEditPart) object).getAdapter(EObject.class);
//			modelStorage = new ActionStorage(model);
//		} else if (object instanceof DoEvent
//				|| object instanceof EntryEvent
//				|| object instanceof ExitEvent) {
//			modelStorage = new ActionStorage((EObject) object);
//		} else if (object instanceof TransitionEditPart) {
//			EObject model = (EObject) ((ConnectionEditPart) object).getAdapter(EObject.class);
//			transitionExpressionSelector.setSelectedModelStorage(model);
//			enableSwitchAction = true;
//		} else {
//			// invalid selection
//			modelStorage = null;
//		}
//		/*
//		if (wasGuard && !(modelStorage instanceof GuardStorage)) {
//			Injector injector = ActionLanguageActivator.getInstance().getInjector(languageName);
//			ActionLanguageResource.setInjector(injector);
//			editor.changeLanguage(injector);
//		} else if (!wasGuard && modelStorage instanceof GuardStorage) {
//			Injector injector = GuardLanguageUiModule.getInjector();
//			ActionLanguageResource.setInjector(injector);
//			editor.changeLanguage(injector);
//		}*/
//		transitionExpressionSelector.setEnabled(enableSwitchAction);
//	}
//
//}
