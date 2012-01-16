/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.component.providers.ComponentMessages;


// End of user code

/**
 * 
 * 
 */
public class DelegationPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, DelegationPropertiesEditionPart {

	protected EObjectFlatComboViewer fromPort;
	protected EObjectFlatComboViewer toPort;
	protected EObjectFlatComboViewer parentComponent;
	protected EObjectFlatComboViewer componentPart;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DelegationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence delegationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = delegationStep.addStep(ComponentViewsRepository.Delegation.Properties.class);
		propertiesStep.addStep(ComponentViewsRepository.Delegation.Properties.fromPort);
		propertiesStep.addStep(ComponentViewsRepository.Delegation.Properties.toPort);
		propertiesStep.addStep(ComponentViewsRepository.Delegation.Properties.parentComponent);
		propertiesStep.addStep(ComponentViewsRepository.Delegation.Properties.componentPart);
		
		
		composer = new PartComposer(delegationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ComponentViewsRepository.Delegation.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ComponentViewsRepository.Delegation.Properties.fromPort) {
					return createFromPortFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.Delegation.Properties.toPort) {
					return createToPortFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.Delegation.Properties.parentComponent) {
					return createParentComponentFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.Delegation.Properties.componentPart) {
					return createComponentPartFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(ComponentMessages.DelegationPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createFromPortFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.DelegationPropertiesEditionPart_FromPortLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Delegation.Properties.fromPort, ComponentViewsRepository.FORM_KIND));
		fromPort = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Delegation.Properties.fromPort, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(fromPort);
		fromPort.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData fromPortData = new GridData(GridData.FILL_HORIZONTAL);
		fromPort.setLayoutData(fromPortData);
		fromPort.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelegationPropertiesEditionPartForm.this, ComponentViewsRepository.Delegation.Properties.fromPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getFromPort()));
			}

		});
		fromPort.setID(ComponentViewsRepository.Delegation.Properties.fromPort);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Delegation.Properties.fromPort, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createToPortFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.DelegationPropertiesEditionPart_ToPortLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Delegation.Properties.toPort, ComponentViewsRepository.FORM_KIND));
		toPort = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Delegation.Properties.toPort, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(toPort);
		toPort.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData toPortData = new GridData(GridData.FILL_HORIZONTAL);
		toPort.setLayoutData(toPortData);
		toPort.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelegationPropertiesEditionPartForm.this, ComponentViewsRepository.Delegation.Properties.toPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getToPort()));
			}

		});
		toPort.setID(ComponentViewsRepository.Delegation.Properties.toPort);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Delegation.Properties.toPort, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createParentComponentFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.DelegationPropertiesEditionPart_ParentComponentLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Delegation.Properties.parentComponent, ComponentViewsRepository.FORM_KIND));
		parentComponent = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Delegation.Properties.parentComponent, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(parentComponent);
		parentComponent.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData parentComponentData = new GridData(GridData.FILL_HORIZONTAL);
		parentComponent.setLayoutData(parentComponentData);
		parentComponent.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelegationPropertiesEditionPartForm.this, ComponentViewsRepository.Delegation.Properties.parentComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getParentComponent()));
			}

		});
		parentComponent.setID(ComponentViewsRepository.Delegation.Properties.parentComponent);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Delegation.Properties.parentComponent, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createComponentPartFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.DelegationPropertiesEditionPart_ComponentPartLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Delegation.Properties.componentPart, ComponentViewsRepository.FORM_KIND));
		componentPart = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Delegation.Properties.componentPart, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(componentPart);
		componentPart.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData componentPartData = new GridData(GridData.FILL_HORIZONTAL);
		componentPart.setLayoutData(componentPartData);
		componentPart.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelegationPropertiesEditionPartForm.this, ComponentViewsRepository.Delegation.Properties.componentPart, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getComponentPart()));
			}

		});
		componentPart.setID(ComponentViewsRepository.Delegation.Properties.componentPart);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Delegation.Properties.componentPart, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#getFromPort()
	 * 
	 */
	public EObject getFromPort() {
		if (fromPort.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) fromPort.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#initFromPort(EObjectFlatComboSettings)
	 */
	public void initFromPort(EObjectFlatComboSettings settings) {
		fromPort.setInput(settings);
		if (current != null) {
			fromPort.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#setFromPort(EObject newValue)
	 * 
	 */
	public void setFromPort(EObject newValue) {
		if (newValue != null) {
			fromPort.setSelection(new StructuredSelection(newValue));
		} else {
			fromPort.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#setFromPortButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFromPortButtonMode(ButtonsModeEnum newValue) {
		fromPort.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#addFilterFromPort(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFromPort(ViewerFilter filter) {
		fromPort.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#addBusinessFilterFromPort(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFromPort(ViewerFilter filter) {
		fromPort.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#getToPort()
	 * 
	 */
	public EObject getToPort() {
		if (toPort.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) toPort.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#initToPort(EObjectFlatComboSettings)
	 */
	public void initToPort(EObjectFlatComboSettings settings) {
		toPort.setInput(settings);
		if (current != null) {
			toPort.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#setToPort(EObject newValue)
	 * 
	 */
	public void setToPort(EObject newValue) {
		if (newValue != null) {
			toPort.setSelection(new StructuredSelection(newValue));
		} else {
			toPort.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#setToPortButtonMode(ButtonsModeEnum newValue)
	 */
	public void setToPortButtonMode(ButtonsModeEnum newValue) {
		toPort.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#addFilterToPort(ViewerFilter filter)
	 * 
	 */
	public void addFilterToToPort(ViewerFilter filter) {
		toPort.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#addBusinessFilterToPort(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToToPort(ViewerFilter filter) {
		toPort.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#getParentComponent()
	 * 
	 */
	public EObject getParentComponent() {
		if (parentComponent.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) parentComponent.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#initParentComponent(EObjectFlatComboSettings)
	 */
	public void initParentComponent(EObjectFlatComboSettings settings) {
		parentComponent.setInput(settings);
		if (current != null) {
			parentComponent.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#setParentComponent(EObject newValue)
	 * 
	 */
	public void setParentComponent(EObject newValue) {
		if (newValue != null) {
			parentComponent.setSelection(new StructuredSelection(newValue));
		} else {
			parentComponent.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#setParentComponentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParentComponentButtonMode(ButtonsModeEnum newValue) {
		parentComponent.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#addFilterParentComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParentComponent(ViewerFilter filter) {
		parentComponent.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#addBusinessFilterParentComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParentComponent(ViewerFilter filter) {
		parentComponent.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#getComponentPart()
	 * 
	 */
	public EObject getComponentPart() {
		if (componentPart.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) componentPart.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#initComponentPart(EObjectFlatComboSettings)
	 */
	public void initComponentPart(EObjectFlatComboSettings settings) {
		componentPart.setInput(settings);
		if (current != null) {
			componentPart.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#setComponentPart(EObject newValue)
	 * 
	 */
	public void setComponentPart(EObject newValue) {
		if (newValue != null) {
			componentPart.setSelection(new StructuredSelection(newValue));
		} else {
			componentPart.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#setComponentPartButtonMode(ButtonsModeEnum newValue)
	 */
	public void setComponentPartButtonMode(ButtonsModeEnum newValue) {
		componentPart.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#addFilterComponentPart(ViewerFilter filter)
	 * 
	 */
	public void addFilterToComponentPart(ViewerFilter filter) {
		componentPart.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.DelegationPropertiesEditionPart#addBusinessFilterComponentPart(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToComponentPart(ViewerFilter filter) {
		componentPart.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ComponentMessages.Delegation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
