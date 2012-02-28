/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.deployment.parts.forms;

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

import de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.deployment.providers.DeploymentMessages;


// End of user code

/**
 * 
 * 
 */
public class DeploymentPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, DeploymentPropertiesEditionPart {

	protected EObjectFlatComboViewer componentInstanceConfiguration;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DeploymentPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence deployment_Step = new BindingCompositionSequence(propertiesEditionComponent);
		deployment_Step
			.addStep(DeploymentViewsRepository.Deployment_.Properties.class)
			.addStep(DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration);
		
		
		composer = new PartComposer(deployment_Step) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DeploymentViewsRepository.Deployment_.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration) {
					return createComponentInstanceConfigurationFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(DeploymentMessages.DeploymentPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createComponentInstanceConfigurationFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, DeploymentMessages.DeploymentPropertiesEditionPart_ComponentInstanceConfigurationLabel, propertiesEditionComponent.isRequired(DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration, DeploymentViewsRepository.FORM_KIND));
		componentInstanceConfiguration = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration, DeploymentViewsRepository.FORM_KIND));
		widgetFactory.adapt(componentInstanceConfiguration);
		componentInstanceConfiguration.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData componentInstanceConfigurationData = new GridData(GridData.FILL_HORIZONTAL);
		componentInstanceConfiguration.setLayoutData(componentInstanceConfigurationData);
		componentInstanceConfiguration.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DeploymentPropertiesEditionPartForm.this, DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getComponentInstanceConfiguration()));
			}

		});
		componentInstanceConfiguration.setID(DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DeploymentViewsRepository.Deployment_.Properties.componentInstanceConfiguration, DeploymentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentPropertiesEditionPart#getComponentInstanceConfiguration()
	 * 
	 */
	public EObject getComponentInstanceConfiguration() {
		if (componentInstanceConfiguration.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) componentInstanceConfiguration.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentPropertiesEditionPart#initComponentInstanceConfiguration(EObjectFlatComboSettings)
	 */
	public void initComponentInstanceConfiguration(EObjectFlatComboSettings settings) {
		componentInstanceConfiguration.setInput(settings);
		if (current != null) {
			componentInstanceConfiguration.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentPropertiesEditionPart#setComponentInstanceConfiguration(EObject newValue)
	 * 
	 */
	public void setComponentInstanceConfiguration(EObject newValue) {
		if (newValue != null) {
			componentInstanceConfiguration.setSelection(new StructuredSelection(newValue));
		} else {
			componentInstanceConfiguration.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentPropertiesEditionPart#setComponentInstanceConfigurationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setComponentInstanceConfigurationButtonMode(ButtonsModeEnum newValue) {
		componentInstanceConfiguration.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentPropertiesEditionPart#addFilterComponentInstanceConfiguration(ViewerFilter filter)
	 * 
	 */
	public void addFilterToComponentInstanceConfiguration(ViewerFilter filter) {
		componentInstanceConfiguration.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.parts.DeploymentPropertiesEditionPart#addBusinessFilterComponentInstanceConfiguration(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToComponentInstanceConfiguration(ViewerFilter filter) {
		componentInstanceConfiguration.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DeploymentMessages.Deployment_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
