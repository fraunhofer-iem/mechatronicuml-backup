/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.deployment.parts.forms;

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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwareNodePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.deployment.providers.DeploymentMessages;


// End of user code

/**
 * 
 * 
 */
public class HardwareNodePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, HardwareNodePropertiesEditionPart {

	protected EObjectFlatComboViewer deployment;
		protected ReferencesTable deployedInstances;
		protected List<ViewerFilter> deployedInstancesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> deployedInstancesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public HardwareNodePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence hardwareNodeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = hardwareNodeStep.addStep(DeploymentViewsRepository.HardwareNode.Properties.class);
		propertiesStep.addStep(DeploymentViewsRepository.HardwareNode.Properties.deployment_);
		propertiesStep.addStep(DeploymentViewsRepository.HardwareNode.Properties.deployedInstances);
		
		
		composer = new PartComposer(hardwareNodeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DeploymentViewsRepository.HardwareNode.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DeploymentViewsRepository.HardwareNode.Properties.deployment_) {
					return createDeploymentFlatComboViewer(parent, widgetFactory);
				}
				if (key == DeploymentViewsRepository.HardwareNode.Properties.deployedInstances) {
					return createDeployedInstancesReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(DeploymentMessages.HardwareNodePropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createDeploymentFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, DeploymentMessages.HardwareNodePropertiesEditionPart_DeploymentLabel, propertiesEditionComponent.isRequired(DeploymentViewsRepository.HardwareNode.Properties.deployment_, DeploymentViewsRepository.FORM_KIND));
		deployment = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DeploymentViewsRepository.HardwareNode.Properties.deployment_, DeploymentViewsRepository.FORM_KIND));
		widgetFactory.adapt(deployment);
		deployment.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData deploymentData = new GridData(GridData.FILL_HORIZONTAL);
		deployment.setLayoutData(deploymentData);
		deployment.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HardwareNodePropertiesEditionPartForm.this, DeploymentViewsRepository.HardwareNode.Properties.deployment_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDeployment()));
			}

		});
		deployment.setID(DeploymentViewsRepository.HardwareNode.Properties.deployment_);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DeploymentViewsRepository.HardwareNode.Properties.deployment_, DeploymentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createDeployedInstancesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.deployedInstances = new ReferencesTable(DeploymentMessages.HardwareNodePropertiesEditionPart_DeployedInstancesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addDeployedInstances(); }
			public void handleEdit(EObject element) { editDeployedInstances(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDeployedInstances(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDeployedInstances(element); }
			public void navigateTo(EObject element) { }
		});
		this.deployedInstances.setHelpText(propertiesEditionComponent.getHelpContent(DeploymentViewsRepository.HardwareNode.Properties.deployedInstances, DeploymentViewsRepository.FORM_KIND));
		this.deployedInstances.createControls(parent, widgetFactory);
		this.deployedInstances.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HardwareNodePropertiesEditionPartForm.this, DeploymentViewsRepository.HardwareNode.Properties.deployedInstances, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData deployedInstancesData = new GridData(GridData.FILL_HORIZONTAL);
		deployedInstancesData.horizontalSpan = 3;
		this.deployedInstances.setLayoutData(deployedInstancesData);
		this.deployedInstances.disableMove();
		deployedInstances.setID(DeploymentViewsRepository.HardwareNode.Properties.deployedInstances);
		deployedInstances.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addDeployedInstances() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(deployedInstances.getInput(), deployedInstancesFilters, deployedInstancesBusinessFilters,
		"deployedInstances", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HardwareNodePropertiesEditionPartForm.this, DeploymentViewsRepository.HardwareNode.Properties.deployedInstances,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				deployedInstances.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveDeployedInstances(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HardwareNodePropertiesEditionPartForm.this, DeploymentViewsRepository.HardwareNode.Properties.deployedInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		deployedInstances.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDeployedInstances(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HardwareNodePropertiesEditionPartForm.this, DeploymentViewsRepository.HardwareNode.Properties.deployedInstances, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		deployedInstances.refresh();
	}

	/**
	 * 
	 */
	protected void editDeployedInstances(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				deployedInstances.refresh();
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
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwareNodePropertiesEditionPart#getDeployment()
	 * 
	 */
	public EObject getDeployment() {
		if (deployment.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) deployment.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwareNodePropertiesEditionPart#initDeployment(EObjectFlatComboSettings)
	 */
	public void initDeployment(EObjectFlatComboSettings settings) {
		deployment.setInput(settings);
		if (current != null) {
			deployment.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwareNodePropertiesEditionPart#setDeployment(EObject newValue)
	 * 
	 */
	public void setDeployment(EObject newValue) {
		if (newValue != null) {
			deployment.setSelection(new StructuredSelection(newValue));
		} else {
			deployment.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwareNodePropertiesEditionPart#setDeploymentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDeploymentButtonMode(ButtonsModeEnum newValue) {
		deployment.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwareNodePropertiesEditionPart#addFilterDeployment(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDeployment(ViewerFilter filter) {
		deployment.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwareNodePropertiesEditionPart#addBusinessFilterDeployment(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDeployment(ViewerFilter filter) {
		deployment.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwareNodePropertiesEditionPart#initDeployedInstances(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDeployedInstances(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		deployedInstances.setContentProvider(contentProvider);
		deployedInstances.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwareNodePropertiesEditionPart#updateDeployedInstances()
	 * 
	 */
	public void updateDeployedInstances() {
	deployedInstances.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwareNodePropertiesEditionPart#addFilterDeployedInstances(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDeployedInstances(ViewerFilter filter) {
		deployedInstancesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwareNodePropertiesEditionPart#addBusinessFilterDeployedInstances(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDeployedInstances(ViewerFilter filter) {
		deployedInstancesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.HardwareNodePropertiesEditionPart#isContainedInDeployedInstancesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDeployedInstancesTable(EObject element) {
		return ((ReferencesTableSettings)deployedInstances.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DeploymentMessages.HardwareNode_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
