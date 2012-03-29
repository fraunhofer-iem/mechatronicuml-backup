/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.parts.impl;

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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.component.parts.PatternOccurrencePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.component.providers.ComponentMessages;


// End of user code

/**
 * 
 * 
 */
public class PatternOccurrencePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PatternOccurrencePropertiesEditionPart {

	protected EObjectFlatComboViewer pattern;
	protected ReferencesTable ports;
	protected List<ViewerFilter> portsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> portsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PatternOccurrencePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence patternOccurrenceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = patternOccurrenceStep.addStep(ComponentViewsRepository.PatternOccurrence.Properties.class);
		propertiesStep.addStep(ComponentViewsRepository.PatternOccurrence.Properties.pattern);
		propertiesStep.addStep(ComponentViewsRepository.PatternOccurrence.Properties.ports);
		
		
		composer = new PartComposer(patternOccurrenceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ComponentViewsRepository.PatternOccurrence.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ComponentViewsRepository.PatternOccurrence.Properties.pattern) {
					return createPatternFlatComboViewer(parent);
				}
				if (key == ComponentViewsRepository.PatternOccurrence.Properties.ports) {
					return createPortsAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(ComponentMessages.PatternOccurrencePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createPatternFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.PatternOccurrencePropertiesEditionPart_PatternLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.PatternOccurrence.Properties.pattern, ComponentViewsRepository.SWT_KIND));
		pattern = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.PatternOccurrence.Properties.pattern, ComponentViewsRepository.SWT_KIND));
		pattern.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		pattern.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PatternOccurrencePropertiesEditionPartImpl.this, ComponentViewsRepository.PatternOccurrence.Properties.pattern, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getPattern()));
			}

		});
		GridData patternData = new GridData(GridData.FILL_HORIZONTAL);
		pattern.setLayoutData(patternData);
		pattern.setID(ComponentViewsRepository.PatternOccurrence.Properties.pattern);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.PatternOccurrence.Properties.pattern, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createPortsAdvancedReferencesTable(Composite parent) {
		this.ports = new ReferencesTable(ComponentMessages.PatternOccurrencePropertiesEditionPart_PortsLabel, new ReferencesTableListener() {
			public void handleAdd() { addPorts(); }
			public void handleEdit(EObject element) { editPorts(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { movePorts(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromPorts(element); }
			public void navigateTo(EObject element) { }
		});
		this.ports.setHelpText(propertiesEditionComponent.getHelpContent(ComponentViewsRepository.PatternOccurrence.Properties.ports, ComponentViewsRepository.SWT_KIND));
		this.ports.createControls(parent);
		this.ports.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PatternOccurrencePropertiesEditionPartImpl.this, ComponentViewsRepository.PatternOccurrence.Properties.ports, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData portsData = new GridData(GridData.FILL_HORIZONTAL);
		portsData.horizontalSpan = 3;
		this.ports.setLayoutData(portsData);
		this.ports.disableMove();
		ports.setID(ComponentViewsRepository.PatternOccurrence.Properties.ports);
		ports.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addPorts() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(ports.getInput(), portsFilters, portsBusinessFilters,
		"ports", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PatternOccurrencePropertiesEditionPartImpl.this, ComponentViewsRepository.PatternOccurrence.Properties.ports,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				ports.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void movePorts(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PatternOccurrencePropertiesEditionPartImpl.this, ComponentViewsRepository.PatternOccurrence.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		ports.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromPorts(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PatternOccurrencePropertiesEditionPartImpl.this, ComponentViewsRepository.PatternOccurrence.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		ports.refresh();
	}

	/**
	 * 
	 */
	protected void editPorts(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				ports.refresh();
			}
		}
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.PatternOccurrencePropertiesEditionPart#getPattern()
	 * 
	 */
	public EObject getPattern() {
		if (pattern.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) pattern.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.PatternOccurrencePropertiesEditionPart#initPattern(EObjectFlatComboSettings)
	 */
	public void initPattern(EObjectFlatComboSettings settings) {
		pattern.setInput(settings);
		if (current != null) {
			pattern.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.PatternOccurrencePropertiesEditionPart#setPattern(EObject newValue)
	 * 
	 */
	public void setPattern(EObject newValue) {
		if (newValue != null) {
			pattern.setSelection(new StructuredSelection(newValue));
		} else {
			pattern.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.PatternOccurrencePropertiesEditionPart#setPatternButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPatternButtonMode(ButtonsModeEnum newValue) {
		pattern.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.PatternOccurrencePropertiesEditionPart#addFilterPattern(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPattern(ViewerFilter filter) {
		pattern.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.PatternOccurrencePropertiesEditionPart#addBusinessFilterPattern(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPattern(ViewerFilter filter) {
		pattern.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.PatternOccurrencePropertiesEditionPart#initPorts(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initPorts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ports.setContentProvider(contentProvider);
		ports.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.PatternOccurrencePropertiesEditionPart#updatePorts()
	 * 
	 */
	public void updatePorts() {
	ports.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.PatternOccurrencePropertiesEditionPart#addFilterPorts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPorts(ViewerFilter filter) {
		portsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.PatternOccurrencePropertiesEditionPart#addBusinessFilterPorts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPorts(ViewerFilter filter) {
		portsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.PatternOccurrencePropertiesEditionPart#isContainedInPortsTable(EObject element)
	 * 
	 */
	public boolean isContainedInPortsTable(EObject element) {
		return ((ReferencesTableSettings)ports.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ComponentMessages.PatternOccurrence_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
