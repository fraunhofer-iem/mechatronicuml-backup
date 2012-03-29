/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.instance.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.muml.model.instance.parts.InstanceViewsRepository;
import de.uni_paderborn.fujaba.muml.model.instance.parts.PatternInstancePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.instance.providers.InstanceMessages;


// End of user code

/**
 * 
 * 
 */
public class PatternInstancePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PatternInstancePropertiesEditionPart {

	protected Text name;
	protected ReferencesTable portInstances;
	protected List<ViewerFilter> portInstancesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> portInstancesFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer patternOccurrence;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PatternInstancePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence patternInstanceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = patternInstanceStep.addStep(InstanceViewsRepository.PatternInstance.Properties.class);
		propertiesStep.addStep(InstanceViewsRepository.PatternInstance.Properties.name);
		propertiesStep.addStep(InstanceViewsRepository.PatternInstance.Properties.portInstances);
		propertiesStep.addStep(InstanceViewsRepository.PatternInstance.Properties.patternOccurrence);
		
		
		composer = new PartComposer(patternInstanceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == InstanceViewsRepository.PatternInstance.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == InstanceViewsRepository.PatternInstance.Properties.name) {
					return createNameText(parent);
				}
				if (key == InstanceViewsRepository.PatternInstance.Properties.portInstances) {
					return createPortInstancesAdvancedReferencesTable(parent);
				}
				if (key == InstanceViewsRepository.PatternInstance.Properties.patternOccurrence) {
					return createPatternOccurrenceFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(InstanceMessages.PatternInstancePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, InstanceMessages.PatternInstancePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.PatternInstance.Properties.name, InstanceViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PatternInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.PatternInstance.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PatternInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.PatternInstance.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, InstanceViewsRepository.PatternInstance.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.PatternInstance.Properties.name, InstanceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createPortInstancesAdvancedReferencesTable(Composite parent) {
		this.portInstances = new ReferencesTable(InstanceMessages.PatternInstancePropertiesEditionPart_PortInstancesLabel, new ReferencesTableListener() {
			public void handleAdd() { addPortInstances(); }
			public void handleEdit(EObject element) { editPortInstances(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { movePortInstances(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromPortInstances(element); }
			public void navigateTo(EObject element) { }
		});
		this.portInstances.setHelpText(propertiesEditionComponent.getHelpContent(InstanceViewsRepository.PatternInstance.Properties.portInstances, InstanceViewsRepository.SWT_KIND));
		this.portInstances.createControls(parent);
		this.portInstances.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PatternInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.PatternInstance.Properties.portInstances, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData portInstancesData = new GridData(GridData.FILL_HORIZONTAL);
		portInstancesData.horizontalSpan = 3;
		this.portInstances.setLayoutData(portInstancesData);
		this.portInstances.disableMove();
		portInstances.setID(InstanceViewsRepository.PatternInstance.Properties.portInstances);
		portInstances.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addPortInstances() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(portInstances.getInput(), portInstancesFilters, portInstancesBusinessFilters,
		"portInstances", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PatternInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.PatternInstance.Properties.portInstances,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				portInstances.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void movePortInstances(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PatternInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.PatternInstance.Properties.portInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		portInstances.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromPortInstances(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PatternInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.PatternInstance.Properties.portInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		portInstances.refresh();
	}

	/**
	 * 
	 */
	protected void editPortInstances(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				portInstances.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createPatternOccurrenceFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, InstanceMessages.PatternInstancePropertiesEditionPart_PatternOccurrenceLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.PatternInstance.Properties.patternOccurrence, InstanceViewsRepository.SWT_KIND));
		patternOccurrence = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.PatternInstance.Properties.patternOccurrence, InstanceViewsRepository.SWT_KIND));
		patternOccurrence.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		patternOccurrence.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PatternInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.PatternInstance.Properties.patternOccurrence, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getPatternOccurrence()));
			}

		});
		GridData patternOccurrenceData = new GridData(GridData.FILL_HORIZONTAL);
		patternOccurrence.setLayoutData(patternOccurrenceData);
		patternOccurrence.setID(InstanceViewsRepository.PatternInstance.Properties.patternOccurrence);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.PatternInstance.Properties.patternOccurrence, InstanceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.PatternInstancePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.PatternInstancePropertiesEditionPart#setName(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.PatternInstancePropertiesEditionPart#initPortInstances(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initPortInstances(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		portInstances.setContentProvider(contentProvider);
		portInstances.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.PatternInstancePropertiesEditionPart#updatePortInstances()
	 * 
	 */
	public void updatePortInstances() {
	portInstances.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.PatternInstancePropertiesEditionPart#addFilterPortInstances(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPortInstances(ViewerFilter filter) {
		portInstancesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.PatternInstancePropertiesEditionPart#addBusinessFilterPortInstances(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPortInstances(ViewerFilter filter) {
		portInstancesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.PatternInstancePropertiesEditionPart#isContainedInPortInstancesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPortInstancesTable(EObject element) {
		return ((ReferencesTableSettings)portInstances.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.PatternInstancePropertiesEditionPart#getPatternOccurrence()
	 * 
	 */
	public EObject getPatternOccurrence() {
		if (patternOccurrence.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) patternOccurrence.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.PatternInstancePropertiesEditionPart#initPatternOccurrence(EObjectFlatComboSettings)
	 */
	public void initPatternOccurrence(EObjectFlatComboSettings settings) {
		patternOccurrence.setInput(settings);
		if (current != null) {
			patternOccurrence.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.PatternInstancePropertiesEditionPart#setPatternOccurrence(EObject newValue)
	 * 
	 */
	public void setPatternOccurrence(EObject newValue) {
		if (newValue != null) {
			patternOccurrence.setSelection(new StructuredSelection(newValue));
		} else {
			patternOccurrence.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.PatternInstancePropertiesEditionPart#setPatternOccurrenceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPatternOccurrenceButtonMode(ButtonsModeEnum newValue) {
		patternOccurrence.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.PatternInstancePropertiesEditionPart#addFilterPatternOccurrence(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPatternOccurrence(ViewerFilter filter) {
		patternOccurrence.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.PatternInstancePropertiesEditionPart#addBusinessFilterPatternOccurrence(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPatternOccurrence(ViewerFilter filter) {
		patternOccurrence.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return InstanceMessages.PatternInstance_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
