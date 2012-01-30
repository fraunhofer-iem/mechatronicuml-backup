/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.providers.RealtimestatechartMessages;


// End of user code

/**
 * 
 * 
 */
public class StatePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, StatePropertiesEditionPart {

	protected Text name;
		protected ReferencesTable outgoingTransitions;
		protected List<ViewerFilter> outgoingTransitionsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> outgoingTransitionsFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable incomingTransitions;
		protected List<ViewerFilter> incomingTransitionsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> incomingTransitionsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer statechart;
	protected ReferencesTable invariants;
	protected List<ViewerFilter> invariantsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> invariantsFilters = new ArrayList<ViewerFilter>();
	protected Button initial;
	protected Button final_;
	protected Button urgent;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public StatePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence stateStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = stateStep.addStep(RealtimestatechartViewsRepository.State.Properties.class);
		propertiesStep.addStep(RealtimestatechartViewsRepository.State.Properties.name);
		propertiesStep.addStep(RealtimestatechartViewsRepository.State.Properties.outgoingTransitions);
		propertiesStep.addStep(RealtimestatechartViewsRepository.State.Properties.incomingTransitions);
		propertiesStep.addStep(RealtimestatechartViewsRepository.State.Properties.statechart);
		propertiesStep.addStep(RealtimestatechartViewsRepository.State.Properties.invariants);
		propertiesStep.addStep(RealtimestatechartViewsRepository.State.Properties.initial);
		propertiesStep.addStep(RealtimestatechartViewsRepository.State.Properties.final_);
		propertiesStep.addStep(RealtimestatechartViewsRepository.State.Properties.urgent);
		
		
		composer = new PartComposer(stateStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RealtimestatechartViewsRepository.State.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.State.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.State.Properties.outgoingTransitions) {
					return createOutgoingTransitionsReferencesTable(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.State.Properties.incomingTransitions) {
					return createIncomingTransitionsReferencesTable(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.State.Properties.statechart) {
					return createStatechartFlatComboViewer(parent, widgetFactory);
				}
				if (key == RealtimestatechartViewsRepository.State.Properties.invariants) {
					return createInvariantsTableComposition(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.State.Properties.initial) {
					return createInitialCheckbox(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.State.Properties.final_) {
					return createFinal_Checkbox(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.State.Properties.urgent) {
					return createUrgentCheckbox(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(RealtimestatechartMessages.StatePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, RealtimestatechartMessages.StatePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.State.Properties.name, RealtimestatechartViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, RealtimestatechartViewsRepository.State.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.State.Properties.name, RealtimestatechartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createOutgoingTransitionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.outgoingTransitions = new ReferencesTable(RealtimestatechartMessages.StatePropertiesEditionPart_OutgoingTransitionsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addOutgoingTransitions(); }
			public void handleEdit(EObject element) { editOutgoingTransitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoingTransitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoingTransitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoingTransitions.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.State.Properties.outgoingTransitions, RealtimestatechartViewsRepository.FORM_KIND));
		this.outgoingTransitions.createControls(parent, widgetFactory);
		this.outgoingTransitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.outgoingTransitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingTransitionsData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingTransitionsData.horizontalSpan = 3;
		this.outgoingTransitions.setLayoutData(outgoingTransitionsData);
		this.outgoingTransitions.disableMove();
		outgoingTransitions.setID(RealtimestatechartViewsRepository.State.Properties.outgoingTransitions);
		outgoingTransitions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutgoingTransitions() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outgoingTransitions.getInput(), outgoingTransitionsFilters, outgoingTransitionsBusinessFilters,
		"outgoingTransitions", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.outgoingTransitions,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outgoingTransitions.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutgoingTransitions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.outgoingTransitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoingTransitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoingTransitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.outgoingTransitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outgoingTransitions.refresh();
	}

	/**
	 * 
	 */
	protected void editOutgoingTransitions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outgoingTransitions.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIncomingTransitionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.incomingTransitions = new ReferencesTable(RealtimestatechartMessages.StatePropertiesEditionPart_IncomingTransitionsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIncomingTransitions(); }
			public void handleEdit(EObject element) { editIncomingTransitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncomingTransitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncomingTransitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.incomingTransitions.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.State.Properties.incomingTransitions, RealtimestatechartViewsRepository.FORM_KIND));
		this.incomingTransitions.createControls(parent, widgetFactory);
		this.incomingTransitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.incomingTransitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingTransitionsData = new GridData(GridData.FILL_HORIZONTAL);
		incomingTransitionsData.horizontalSpan = 3;
		this.incomingTransitions.setLayoutData(incomingTransitionsData);
		this.incomingTransitions.disableMove();
		incomingTransitions.setID(RealtimestatechartViewsRepository.State.Properties.incomingTransitions);
		incomingTransitions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIncomingTransitions() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(incomingTransitions.getInput(), incomingTransitionsFilters, incomingTransitionsBusinessFilters,
		"incomingTransitions", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.incomingTransitions,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				incomingTransitions.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIncomingTransitions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.incomingTransitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incomingTransitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncomingTransitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.incomingTransitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		incomingTransitions.refresh();
	}

	/**
	 * 
	 */
	protected void editIncomingTransitions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				incomingTransitions.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createStatechartFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, RealtimestatechartMessages.StatePropertiesEditionPart_StatechartLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.State.Properties.statechart, RealtimestatechartViewsRepository.FORM_KIND));
		statechart = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.State.Properties.statechart, RealtimestatechartViewsRepository.FORM_KIND));
		widgetFactory.adapt(statechart);
		statechart.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData statechartData = new GridData(GridData.FILL_HORIZONTAL);
		statechart.setLayoutData(statechartData);
		statechart.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.statechart, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getStatechart()));
			}

		});
		statechart.setID(RealtimestatechartViewsRepository.State.Properties.statechart);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.State.Properties.statechart, RealtimestatechartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createInvariantsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.invariants = new ReferencesTable(RealtimestatechartMessages.StatePropertiesEditionPart_InvariantsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.invariants, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				invariants.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.invariants, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				invariants.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.invariants, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				invariants.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.invariants, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				invariants.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.invariantsFilters) {
			this.invariants.addFilter(filter);
		}
		this.invariants.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.State.Properties.invariants, RealtimestatechartViewsRepository.FORM_KIND));
		this.invariants.createControls(parent, widgetFactory);
		this.invariants.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.invariants, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData invariantsData = new GridData(GridData.FILL_HORIZONTAL);
		invariantsData.horizontalSpan = 3;
		this.invariants.setLayoutData(invariantsData);
		this.invariants.setLowerBound(0);
		this.invariants.setUpperBound(-1);
		invariants.setID(RealtimestatechartViewsRepository.State.Properties.invariants);
		invariants.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createInitialCheckbox(FormToolkit widgetFactory, Composite parent) {
		initial = widgetFactory.createButton(parent, RealtimestatechartMessages.StatePropertiesEditionPart_InitialLabel, SWT.CHECK);
		initial.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.initial, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(initial.getSelection())));
			}

		});
		GridData initialData = new GridData(GridData.FILL_HORIZONTAL);
		initialData.horizontalSpan = 2;
		initial.setLayoutData(initialData);
		EditingUtils.setID(initial, RealtimestatechartViewsRepository.State.Properties.initial);
		EditingUtils.setEEFtype(initial, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.State.Properties.initial, RealtimestatechartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFinal_Checkbox(FormToolkit widgetFactory, Composite parent) {
		final_ = widgetFactory.createButton(parent, RealtimestatechartMessages.StatePropertiesEditionPart_Final_Label, SWT.CHECK);
		final_.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.final_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(final_.getSelection())));
			}

		});
		GridData final_Data = new GridData(GridData.FILL_HORIZONTAL);
		final_Data.horizontalSpan = 2;
		final_.setLayoutData(final_Data);
		EditingUtils.setID(final_, RealtimestatechartViewsRepository.State.Properties.final_);
		EditingUtils.setEEFtype(final_, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.State.Properties.final_, RealtimestatechartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createUrgentCheckbox(FormToolkit widgetFactory, Composite parent) {
		urgent = widgetFactory.createButton(parent, RealtimestatechartMessages.StatePropertiesEditionPart_UrgentLabel, SWT.CHECK);
		urgent.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatePropertiesEditionPartForm.this, RealtimestatechartViewsRepository.State.Properties.urgent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(urgent.getSelection())));
			}

		});
		GridData urgentData = new GridData(GridData.FILL_HORIZONTAL);
		urgentData.horizontalSpan = 2;
		urgent.setLayoutData(urgentData);
		EditingUtils.setID(urgent, RealtimestatechartViewsRepository.State.Properties.urgent);
		EditingUtils.setEEFtype(urgent, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.State.Properties.urgent, RealtimestatechartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization

// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#initOutgoingTransitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutgoingTransitions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outgoingTransitions.setContentProvider(contentProvider);
		outgoingTransitions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#updateOutgoingTransitions()
	 * 
	 */
	public void updateOutgoingTransitions() {
	outgoingTransitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#addFilterOutgoingTransitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoingTransitions(ViewerFilter filter) {
		outgoingTransitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#addBusinessFilterOutgoingTransitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoingTransitions(ViewerFilter filter) {
		outgoingTransitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#isContainedInOutgoingTransitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutgoingTransitionsTable(EObject element) {
		return ((ReferencesTableSettings)outgoingTransitions.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#initIncomingTransitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIncomingTransitions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incomingTransitions.setContentProvider(contentProvider);
		incomingTransitions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#updateIncomingTransitions()
	 * 
	 */
	public void updateIncomingTransitions() {
	incomingTransitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#addFilterIncomingTransitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncomingTransitions(ViewerFilter filter) {
		incomingTransitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#addBusinessFilterIncomingTransitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncomingTransitions(ViewerFilter filter) {
		incomingTransitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#isContainedInIncomingTransitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingTransitionsTable(EObject element) {
		return ((ReferencesTableSettings)incomingTransitions.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#getStatechart()
	 * 
	 */
	public EObject getStatechart() {
		if (statechart.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) statechart.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#initStatechart(EObjectFlatComboSettings)
	 */
	public void initStatechart(EObjectFlatComboSettings settings) {
		statechart.setInput(settings);
		if (current != null) {
			statechart.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#setStatechart(EObject newValue)
	 * 
	 */
	public void setStatechart(EObject newValue) {
		if (newValue != null) {
			statechart.setSelection(new StructuredSelection(newValue));
		} else {
			statechart.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#setStatechartButtonMode(ButtonsModeEnum newValue)
	 */
	public void setStatechartButtonMode(ButtonsModeEnum newValue) {
		statechart.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#addFilterStatechart(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStatechart(ViewerFilter filter) {
		statechart.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#addBusinessFilterStatechart(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStatechart(ViewerFilter filter) {
		statechart.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#initInvariants(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initInvariants(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		invariants.setContentProvider(contentProvider);
		invariants.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#updateInvariants()
	 * 
	 */
	public void updateInvariants() {
	invariants.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#addFilterInvariants(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInvariants(ViewerFilter filter) {
		invariantsFilters.add(filter);
		if (this.invariants != null) {
			this.invariants.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#addBusinessFilterInvariants(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInvariants(ViewerFilter filter) {
		invariantsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#isContainedInInvariantsTable(EObject element)
	 * 
	 */
	public boolean isContainedInInvariantsTable(EObject element) {
		return ((ReferencesTableSettings)invariants.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#getInitial()
	 * 
	 */
	public Boolean getInitial() {
		return Boolean.valueOf(initial.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#setInitial(Boolean newValue)
	 * 
	 */
	public void setInitial(Boolean newValue) {
		if (newValue != null) {
			initial.setSelection(newValue.booleanValue());
		} else {
			initial.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#getFinal_()
	 * 
	 */
	public Boolean getFinal_() {
		return Boolean.valueOf(final_.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#setFinal_(Boolean newValue)
	 * 
	 */
	public void setFinal_(Boolean newValue) {
		if (newValue != null) {
			final_.setSelection(newValue.booleanValue());
		} else {
			final_.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#getUrgent()
	 * 
	 */
	public Boolean getUrgent() {
		return Boolean.valueOf(urgent.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StatePropertiesEditionPart#setUrgent(Boolean newValue)
	 * 
	 */
	public void setUrgent(Boolean newValue) {
		if (newValue != null) {
			urgent.setSelection(newValue.booleanValue());
		} else {
			urgent.setSelection(false);
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RealtimestatechartMessages.State_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
