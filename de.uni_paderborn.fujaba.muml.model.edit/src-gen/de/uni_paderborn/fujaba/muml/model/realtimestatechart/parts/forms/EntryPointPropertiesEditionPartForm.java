/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.providers.RealtimestatechartMessages;


// End of user code

/**
 * 
 * 
 */
public class EntryPointPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, EntryPointPropertiesEditionPart {

	protected Text name;
		protected ReferencesTable outgoingTransitions;
		protected List<ViewerFilter> outgoingTransitionsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> outgoingTransitionsFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable incomingTransitions;
		protected List<ViewerFilter> incomingTransitionsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> incomingTransitionsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer statechart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EntryPointPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence entryPointStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = entryPointStep.addStep(RealtimestatechartViewsRepository.EntryPoint.Properties.class);
		propertiesStep.addStep(RealtimestatechartViewsRepository.EntryPoint.Properties.name);
		propertiesStep.addStep(RealtimestatechartViewsRepository.EntryPoint.Properties.outgoingTransitions);
		propertiesStep.addStep(RealtimestatechartViewsRepository.EntryPoint.Properties.incomingTransitions);
		propertiesStep.addStep(RealtimestatechartViewsRepository.EntryPoint.Properties.statechart);
		
		
		composer = new PartComposer(entryPointStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RealtimestatechartViewsRepository.EntryPoint.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.EntryPoint.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.EntryPoint.Properties.outgoingTransitions) {
					return createOutgoingTransitionsReferencesTable(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.EntryPoint.Properties.incomingTransitions) {
					return createIncomingTransitionsReferencesTable(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.EntryPoint.Properties.statechart) {
					return createStatechartFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(RealtimestatechartMessages.EntryPointPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, RealtimestatechartMessages.EntryPointPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.EntryPoint.Properties.name, RealtimestatechartViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EntryPointPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.EntryPoint.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EntryPointPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.EntryPoint.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, RealtimestatechartViewsRepository.EntryPoint.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.EntryPoint.Properties.name, RealtimestatechartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createOutgoingTransitionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.outgoingTransitions = new ReferencesTable(RealtimestatechartMessages.EntryPointPropertiesEditionPart_OutgoingTransitionsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addOutgoingTransitions(); }
			public void handleEdit(EObject element) { editOutgoingTransitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoingTransitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoingTransitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoingTransitions.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.EntryPoint.Properties.outgoingTransitions, RealtimestatechartViewsRepository.FORM_KIND));
		this.outgoingTransitions.createControls(parent, widgetFactory);
		this.outgoingTransitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EntryPointPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.EntryPoint.Properties.outgoingTransitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingTransitionsData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingTransitionsData.horizontalSpan = 3;
		this.outgoingTransitions.setLayoutData(outgoingTransitionsData);
		this.outgoingTransitions.disableMove();
		outgoingTransitions.setID(RealtimestatechartViewsRepository.EntryPoint.Properties.outgoingTransitions);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EntryPointPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.EntryPoint.Properties.outgoingTransitions,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EntryPointPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.EntryPoint.Properties.outgoingTransitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoingTransitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoingTransitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EntryPointPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.EntryPoint.Properties.outgoingTransitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.incomingTransitions = new ReferencesTable(RealtimestatechartMessages.EntryPointPropertiesEditionPart_IncomingTransitionsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIncomingTransitions(); }
			public void handleEdit(EObject element) { editIncomingTransitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncomingTransitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncomingTransitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.incomingTransitions.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.EntryPoint.Properties.incomingTransitions, RealtimestatechartViewsRepository.FORM_KIND));
		this.incomingTransitions.createControls(parent, widgetFactory);
		this.incomingTransitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EntryPointPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.EntryPoint.Properties.incomingTransitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingTransitionsData = new GridData(GridData.FILL_HORIZONTAL);
		incomingTransitionsData.horizontalSpan = 3;
		this.incomingTransitions.setLayoutData(incomingTransitionsData);
		this.incomingTransitions.disableMove();
		incomingTransitions.setID(RealtimestatechartViewsRepository.EntryPoint.Properties.incomingTransitions);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EntryPointPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.EntryPoint.Properties.incomingTransitions,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EntryPointPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.EntryPoint.Properties.incomingTransitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incomingTransitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncomingTransitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EntryPointPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.EntryPoint.Properties.incomingTransitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		FormUtils.createPartLabel(widgetFactory, parent, RealtimestatechartMessages.EntryPointPropertiesEditionPart_StatechartLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.EntryPoint.Properties.statechart, RealtimestatechartViewsRepository.FORM_KIND));
		statechart = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.EntryPoint.Properties.statechart, RealtimestatechartViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EntryPointPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.EntryPoint.Properties.statechart, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getStatechart()));
			}

		});
		statechart.setID(RealtimestatechartViewsRepository.EntryPoint.Properties.statechart);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.EntryPoint.Properties.statechart, RealtimestatechartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#setName(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#initOutgoingTransitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#updateOutgoingTransitions()
	 * 
	 */
	public void updateOutgoingTransitions() {
	outgoingTransitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#addFilterOutgoingTransitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoingTransitions(ViewerFilter filter) {
		outgoingTransitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#addBusinessFilterOutgoingTransitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoingTransitions(ViewerFilter filter) {
		outgoingTransitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#isContainedInOutgoingTransitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutgoingTransitionsTable(EObject element) {
		return ((ReferencesTableSettings)outgoingTransitions.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#initIncomingTransitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#updateIncomingTransitions()
	 * 
	 */
	public void updateIncomingTransitions() {
	incomingTransitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#addFilterIncomingTransitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncomingTransitions(ViewerFilter filter) {
		incomingTransitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#addBusinessFilterIncomingTransitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncomingTransitions(ViewerFilter filter) {
		incomingTransitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#isContainedInIncomingTransitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingTransitionsTable(EObject element) {
		return ((ReferencesTableSettings)incomingTransitions.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#getStatechart()
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#initStatechart(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#setStatechart(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#setStatechartButtonMode(ButtonsModeEnum newValue)
	 */
	public void setStatechartButtonMode(ButtonsModeEnum newValue) {
		statechart.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#addFilterStatechart(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStatechart(ViewerFilter filter) {
		statechart.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.EntryPointPropertiesEditionPart#addBusinessFilterStatechart(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStatechart(ViewerFilter filter) {
		statechart.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RealtimestatechartMessages.EntryPoint_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
