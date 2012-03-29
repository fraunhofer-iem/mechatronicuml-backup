/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.core.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.uni_paderborn.fujaba.muml.model.core.parts.CoreViewsRepository;
import de.uni_paderborn.fujaba.muml.model.core.parts.ParameterBindingPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.core.providers.CoreMessages;


// End of user code

/**
 * 
 * 
 */
public class ParameterBindingPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ParameterBindingPropertiesEditionPart {

	protected EObjectFlatComboViewer parameter;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ParameterBindingPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence parameterBindingStep = new BindingCompositionSequence(propertiesEditionComponent);
		parameterBindingStep
			.addStep(CoreViewsRepository.ParameterBinding.Properties.class)
			.addStep(CoreViewsRepository.ParameterBinding.Properties.parameter);
		
		
		composer = new PartComposer(parameterBindingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CoreViewsRepository.ParameterBinding.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CoreViewsRepository.ParameterBinding.Properties.parameter) {
					return createParameterFlatComboViewer(parent);
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
		propertiesGroup.setText(CoreMessages.ParameterBindingPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createParameterFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, CoreMessages.ParameterBindingPropertiesEditionPart_ParameterLabel, propertiesEditionComponent.isRequired(CoreViewsRepository.ParameterBinding.Properties.parameter, CoreViewsRepository.SWT_KIND));
		parameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CoreViewsRepository.ParameterBinding.Properties.parameter, CoreViewsRepository.SWT_KIND));
		parameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parameter.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterBindingPropertiesEditionPartImpl.this, CoreViewsRepository.ParameterBinding.Properties.parameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParameter()));
			}

		});
		GridData parameterData = new GridData(GridData.FILL_HORIZONTAL);
		parameter.setLayoutData(parameterData);
		parameter.setID(CoreViewsRepository.ParameterBinding.Properties.parameter);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreViewsRepository.ParameterBinding.Properties.parameter, CoreViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ParameterBindingPropertiesEditionPart#getParameter()
	 * 
	 */
	public EObject getParameter() {
		if (parameter.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) parameter.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ParameterBindingPropertiesEditionPart#initParameter(EObjectFlatComboSettings)
	 */
	public void initParameter(EObjectFlatComboSettings settings) {
		parameter.setInput(settings);
		if (current != null) {
			parameter.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ParameterBindingPropertiesEditionPart#setParameter(EObject newValue)
	 * 
	 */
	public void setParameter(EObject newValue) {
		if (newValue != null) {
			parameter.setSelection(new StructuredSelection(newValue));
		} else {
			parameter.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ParameterBindingPropertiesEditionPart#setParameterButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParameterButtonMode(ButtonsModeEnum newValue) {
		parameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ParameterBindingPropertiesEditionPart#addFilterParameter(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParameter(ViewerFilter filter) {
		parameter.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ParameterBindingPropertiesEditionPart#addBusinessFilterParameter(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParameter(ViewerFilter filter) {
		parameter.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CoreMessages.ParameterBinding_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
