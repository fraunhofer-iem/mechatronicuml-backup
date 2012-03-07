/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms;

// Start of user code for imports

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.ExitEventPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.providers.RealtimestatechartMessages;


// End of user code

/**
 * 
 * 
 */
public class ExitEventPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ExitEventPropertiesEditionPart {

	protected EMFComboViewer kind;
		protected ReferencesTable clockResets;
		protected List<ViewerFilter> clockResetsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> clockResetsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ExitEventPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence exitEventStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = exitEventStep.addStep(RealtimestatechartViewsRepository.ExitEvent.Properties.class);
		propertiesStep.addStep(RealtimestatechartViewsRepository.ExitEvent.Properties.kind);
		propertiesStep.addStep(RealtimestatechartViewsRepository.ExitEvent.Properties.clockResets);
		
		
		composer = new PartComposer(exitEventStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RealtimestatechartViewsRepository.ExitEvent.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.ExitEvent.Properties.kind) {
					return createKindEMFComboViewer(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.ExitEvent.Properties.clockResets) {
					return createClockResetsReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(RealtimestatechartMessages.ExitEventPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createKindEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, RealtimestatechartMessages.ExitEventPropertiesEditionPart_KindLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.ExitEvent.Properties.kind, RealtimestatechartViewsRepository.FORM_KIND));
		kind = new EMFComboViewer(parent);
		kind.setContentProvider(new ArrayContentProvider());
		kind.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData kindData = new GridData(GridData.FILL_HORIZONTAL);
		kind.getCombo().setLayoutData(kindData);
		kind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExitEventPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.ExitEvent.Properties.kind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		kind.setID(RealtimestatechartViewsRepository.ExitEvent.Properties.kind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.ExitEvent.Properties.kind, RealtimestatechartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createClockResetsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.clockResets = new ReferencesTable(RealtimestatechartMessages.ExitEventPropertiesEditionPart_ClockResetsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addClockResets(); }
			public void handleEdit(EObject element) { editClockResets(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveClockResets(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromClockResets(element); }
			public void navigateTo(EObject element) { }
		});
		this.clockResets.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.ExitEvent.Properties.clockResets, RealtimestatechartViewsRepository.FORM_KIND));
		this.clockResets.createControls(parent, widgetFactory);
		this.clockResets.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExitEventPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.ExitEvent.Properties.clockResets, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData clockResetsData = new GridData(GridData.FILL_HORIZONTAL);
		clockResetsData.horizontalSpan = 3;
		this.clockResets.setLayoutData(clockResetsData);
		this.clockResets.disableMove();
		clockResets.setID(RealtimestatechartViewsRepository.ExitEvent.Properties.clockResets);
		clockResets.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addClockResets() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(clockResets.getInput(), clockResetsFilters, clockResetsBusinessFilters,
		"clockResets", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExitEventPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.ExitEvent.Properties.clockResets,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				clockResets.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveClockResets(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExitEventPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.ExitEvent.Properties.clockResets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		clockResets.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromClockResets(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExitEventPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.ExitEvent.Properties.clockResets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		clockResets.refresh();
	}

	/**
	 * 
	 */
	protected void editClockResets(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				clockResets.refresh();
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.ExitEventPropertiesEditionPart#getKind()
	 * 
	 */
	public Enumerator getKind() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) kind.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.ExitEventPropertiesEditionPart#initKind(EEnum eenum, Enumerator current)
	 */
	public void initKind(EEnum eenum, Enumerator current) {
		kind.setInput(eenum.getELiterals());
		kind.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.ExitEventPropertiesEditionPart#setKind(Enumerator newValue)
	 * 
	 */
	public void setKind(Enumerator newValue) {
		kind.modelUpdating(new StructuredSelection(newValue));
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.ExitEventPropertiesEditionPart#initClockResets(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initClockResets(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		clockResets.setContentProvider(contentProvider);
		clockResets.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.ExitEventPropertiesEditionPart#updateClockResets()
	 * 
	 */
	public void updateClockResets() {
	clockResets.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.ExitEventPropertiesEditionPart#addFilterClockResets(ViewerFilter filter)
	 * 
	 */
	public void addFilterToClockResets(ViewerFilter filter) {
		clockResetsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.ExitEventPropertiesEditionPart#addBusinessFilterClockResets(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToClockResets(ViewerFilter filter) {
		clockResetsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.ExitEventPropertiesEditionPart#isContainedInClockResetsTable(EObject element)
	 * 
	 */
	public boolean isContainedInClockResetsTable(EObject element) {
		return ((ReferencesTableSettings)clockResets.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RealtimestatechartMessages.ExitEvent_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
