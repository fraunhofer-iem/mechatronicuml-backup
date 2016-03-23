package org.muml.ape.runtime.wizard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

public class ElementSelectionWizardPage extends WizardPage {

	private Object defaultElement;
	private List<Object> selectedElements = new ArrayList<Object>();
	private TreeViewer treeViewer;
	private AdapterFactory adapterFactory;
	private Collection<?> choices;
	private Collection<Resource> resources = new ArrayList<Resource>();
	private String filterText = null;
	private List<String> filterWords = new ArrayList<String>();
	private Collection<Object> filteredChoices;
	private Collection<Object> allFilteredChoices = new ArrayList<Object>();
	private Collection<IElementValidator> elementValidators = new ArrayList<IElementValidator>();
	private ViewerFilter treeViewerFilter = new ViewerFilter() {

		@Override
		public boolean select(Viewer viewer, Object parentElement,
				Object element) {
			return allFilteredChoices.contains(element);
		}
		
	};
	private boolean multi;
	public static final String MESSAGE_NO_ELEMENTS_FOUND = "No results found";

	public ElementSelectionWizardPage(AdapterFactory adapterFactory, Collection<?> choices, Object defaultElement, boolean multi) {
		super("Element selection");
		this.multi = multi;
		setTitle("Select existing Element");
		setDescription("Select an existing element to be added.");
		this.adapterFactory = adapterFactory;
		this.choices = new ArrayList<Object>(choices);
		this.choices.remove(null);
		this.defaultElement = defaultElement;
	}

	@Override
	public void createControl(Composite parent) {

		Composite container = new Composite(parent, SWT.NULL);
		container.setLayout(new FillLayout(SWT.VERTICAL));
		FormToolkit toolkit = new FormToolkit(container.getDisplay());

		ScrolledForm form = toolkit.createScrolledForm(container);
		// toolkit.paintBordersFor(form);
		// toolkit.decorateFormHeading(form.getForm());
		// form.setText("Eclipse Forms API Example");
		form.getBody().setLayout(new GridLayout(2, false));

		Label label = toolkit.createLabel(form.getBody(), "Search:");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));

		final Text text = toolkit.createText(form.getBody(), "", SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		text.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				setFilter(text.getText());
			}
			
		});

		int style = SWT.BORDER;
		if (multi) {
			style |= SWT.MULTI;
		}
		final Tree tree = toolkit.createTree(form.getBody(), style);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		treeViewer = new TreeViewer(tree);
		treeViewer.setContentProvider(new ITreeContentProvider() {

			@Override
			public void dispose() {
			}

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}

			@Override
			public Object[] getElements(Object inputElement) {
				if (inputElement instanceof Collection) {
					return ((Collection<?>) inputElement).toArray();
				}
				return new Object[] { inputElement };
			}

			@Override
			public Object[] getChildren(Object parentElement) {
				if (parentElement instanceof Resource) {
					return ((Resource) parentElement).getContents().toArray();
				} else if (parentElement instanceof EObject) {
					return ((EObject) parentElement).eContents().toArray();
				}
				return new Object[] { };
			}

			@Override
			public Object getParent(Object element) {
				if (element instanceof Resource) {
					return null;
				} else if (element instanceof EObject) {
					return ((EObject) element).eContainer();
				}
				return null;
			}

			@Override
			public boolean hasChildren(Object element) {
				return getChildren(element).length > 0;
			}
			
		});
		treeViewer.setLabelProvider(new TreeViewerLabelProvider(adapterFactory));
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				selectedElements.clear();

				Object newElement = null;
				if (event.getSelection() instanceof IStructuredSelection) {
					Iterator<?> it = ((IStructuredSelection) event.getSelection())
							.iterator();
					while (it.hasNext()) {
						newElement = it.next();

						boolean valid = choices.contains(newElement);
						String newError = null;
						for (IElementValidator validator : elementValidators) {
							String validationError = validator.validate(newElement);
							if (validationError != null) {
								newError = validationError;
								break;
							}
						}
						if (newError != null) {
							valid = false;
						}
						setErrorMessage(newError);
						setPageComplete(valid);

						if (valid) {
							selectedElements.add(newElement);
						}
					}
				}
				
			}

		});
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				// TODO: Execute WizardDialog.okPressed() here 
			}
		});
		tree.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == 0) {
					return;
				}
				text.setFocus();
				text.setText(String.valueOf(e.character));
				text.setSelection(1);
				e.doit = false;
			}
		});
		
		setFilter("");
		
		
	
		setControl(container);

	}

	public void setFilter(String filter) {
		if (filter == null) {
			filter = "";
		}
		if (this.filterText == null || !filter.equals(this.filterText)) {
			this.filterText = filter;
			filterWords = getWords(filter); 
			
			// Save previous filtered choices to be able to compare them to the new choices
			List<Object> previousFilteredChoices = new ArrayList<Object>();
			if (filteredChoices != null) {
				previousFilteredChoices.addAll(filteredChoices);
			}
			
			// Recalculate filtered choices
			recalculateFilteredObjects();
			
			// Check if it changed
			if (previousFilteredChoices.equals(filteredChoices)) {
				// nothing to do, if the list of filtered choices did not change
				return;
			}
			
			// It changed, now apply the new choices as input for the treeViewer
			if (resources.isEmpty()) {
				treeViewer.setFilters(new ViewerFilter[] { });
				treeViewer.setInput(MESSAGE_NO_ELEMENTS_FOUND);
				treeViewer.getTree().setEnabled(false);
			} else {
				treeViewer.setFilters(new ViewerFilter[] { treeViewerFilter } );
				treeViewer.setInput(resources);
				treeViewer.getTree().setEnabled(true);
			}
			
			// Select default element or first element
			boolean selected = false;
			if (defaultElement != null) {
				selected = selectElement(defaultElement);
			}
			if (!selected) {
				selectFirst();
			}
		}
	}

	private static List<String> getWords(String text) {
		List<String> words = new ArrayList<String>();
		StringBuffer currentWord = new StringBuffer();
		boolean newWord = false;
		for (int p = 0; p < text.length(); p++) {
			char ch = text.charAt(p);
			if (Character.isWhitespace(ch)) {
				newWord = true;
			} else {
				if (newWord && currentWord.length() > 0) {
					words.add(currentWord.toString());
					currentWord = new StringBuffer();
				}
				currentWord.append(ch);
				newWord = false;
			}
		}
		if (currentWord.length() > 0) {
			words.add(currentWord.toString());
		}
		return words;
	}

	private void recalculateFilteredObjects() {
		filteredChoices = new ArrayList<Object>();
		allFilteredChoices = new ArrayList<Object>();
		resources.clear();
		for (Object choice : choices) {
			if (filterSelect(choice)) {
				filteredChoices.add(choice);
				
				if (choice instanceof EObject) {
					EObject element = (EObject) choice;
					if (!resources.contains(element.eResource())) {
						resources.add(element.eResource());
						allFilteredChoices.add(element.eResource());
					}
					do {
						allFilteredChoices.add(element);
						element = element.eContainer();
					} while (element != null);
				}
			}
		}
	}

	private boolean filterSelect(Object choice) {
		if (filterWords.isEmpty()) {
			return true;
		}
		if (false == choice instanceof EObject) { // this also works as null check
			return false;
		}
		
		EObject element = (EObject) choice;
		EClass eClass = element.eClass();
		if (eClass == null) {
			return false;
		}
		for (EAttribute attribute : eClass.getEAllAttributes()) {
			Object attributeValue = element.eGet(attribute);
			if (attributeValue != null) {
				String stringValue = attributeValue.toString();
				boolean valid = true;
				for (String filterWord : filterWords) {
					if (!stringValue.toLowerCase().contains(filterWord) && !eClass.getName().toLowerCase().contains(filterWord) && !element.toString().contains(filterWord)) {
						valid = false;
						break;
					}
				}
				if (valid) {
					return true;
				}
			}
		}
		
		return false;
	}

	
	public boolean selectFirst() {
		if (!filteredChoices.isEmpty()) {
			Object firstElement = filteredChoices.iterator().next();
			return selectElement(firstElement);
		}
		return false;
	}
	public boolean selectElement(Object element) {
		if (filteredChoices.contains(element)) {
			treeViewer.expandAll();
			treeViewer.setSelection(new StructuredSelection(element), true);
			treeViewer.reveal(element);
			return true;
		}
		return false;
	}
	

	public List<Object> getElements() {
		return selectedElements;
	}
	
	
	public interface IElementValidator {
		String validate(Object element);
	}
	
	public void addElementValidator(IElementValidator validator) {
		elementValidators.add(validator);
	}	
	
	public void removeElementValidator(IElementValidator validator) {
		elementValidators.remove(validator);
	}

	private class TreeViewerLabelProvider extends AdapterFactoryLabelProvider implements IColorProvider {

		public TreeViewerLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}
		
		@Override
		public String getText(Object object) {
			if (object instanceof String) {
				return (String) object;
			}
			return super.getText(object);
		}
		
		@Override
		public Image getImage(Object object) {
			if (MESSAGE_NO_ELEMENTS_FOUND.equals(object)) {
				return null;
			}
			return super.getImage(object);
		}
		
		@Override
		public Color getForeground(Object object) {
			if (!choices.contains(object)) {
				return Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY);
			}
			return super.getForeground(object);
		}
		
	}
}
