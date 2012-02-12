/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.instance.parts.impl;

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
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.instance.parts.InstanceViewsRepository;
import de.uni_paderborn.fujaba.muml.model.instance.providers.InstanceMessages;


// End of user code

/**
 * 
 * 
 */
public class AssemblyInstancePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AssemblyInstancePropertiesEditionPart {

	protected EObjectFlatComboViewer source;
	protected EObjectFlatComboViewer target;
	protected EObjectFlatComboViewer connectorType;
	protected Text propagationDelayLowerBound;
	protected Text propagationDelayUpperBound;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AssemblyInstancePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence assemblyInstanceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = assemblyInstanceStep.addStep(InstanceViewsRepository.AssemblyInstance.Properties.class);
		propertiesStep.addStep(InstanceViewsRepository.AssemblyInstance.Properties.source);
		propertiesStep.addStep(InstanceViewsRepository.AssemblyInstance.Properties.target);
		propertiesStep.addStep(InstanceViewsRepository.AssemblyInstance.Properties.connectorType);
		propertiesStep.addStep(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound);
		propertiesStep.addStep(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound);
		
		
		composer = new PartComposer(assemblyInstanceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == InstanceViewsRepository.AssemblyInstance.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == InstanceViewsRepository.AssemblyInstance.Properties.source) {
					return createSourceFlatComboViewer(parent);
				}
				if (key == InstanceViewsRepository.AssemblyInstance.Properties.target) {
					return createTargetFlatComboViewer(parent);
				}
				if (key == InstanceViewsRepository.AssemblyInstance.Properties.connectorType) {
					return createConnectorTypeFlatComboViewer(parent);
				}
				if (key == InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound) {
					return createPropagationDelayLowerBoundText(parent);
				}
				if (key == InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound) {
					return createPropagationDelayUpperBoundText(parent);
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
		propertiesGroup.setText(InstanceMessages.AssemblyInstancePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createSourceFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, InstanceMessages.AssemblyInstancePropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.source, InstanceViewsRepository.SWT_KIND));
		source = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.source, InstanceViewsRepository.SWT_KIND));
		source.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		source.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.AssemblyInstance.Properties.source, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSource()));
			}

		});
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		source.setLayoutData(sourceData);
		source.setID(InstanceViewsRepository.AssemblyInstance.Properties.source);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.AssemblyInstance.Properties.source, InstanceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTargetFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, InstanceMessages.AssemblyInstancePropertiesEditionPart_TargetLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.target, InstanceViewsRepository.SWT_KIND));
		target = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.target, InstanceViewsRepository.SWT_KIND));
		target.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		target.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.AssemblyInstance.Properties.target, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTarget()));
			}

		});
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		target.setLayoutData(targetData);
		target.setID(InstanceViewsRepository.AssemblyInstance.Properties.target);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.AssemblyInstance.Properties.target, InstanceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createConnectorTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, InstanceMessages.AssemblyInstancePropertiesEditionPart_ConnectorTypeLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.connectorType, InstanceViewsRepository.SWT_KIND));
		connectorType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.connectorType, InstanceViewsRepository.SWT_KIND));
		connectorType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		connectorType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.AssemblyInstance.Properties.connectorType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getConnectorType()));
			}

		});
		GridData connectorTypeData = new GridData(GridData.FILL_HORIZONTAL);
		connectorType.setLayoutData(connectorTypeData);
		connectorType.setID(InstanceViewsRepository.AssemblyInstance.Properties.connectorType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.AssemblyInstance.Properties.connectorType, InstanceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPropagationDelayLowerBoundText(Composite parent) {
		SWTUtils.createPartLabel(parent, InstanceMessages.AssemblyInstancePropertiesEditionPart_PropagationDelayLowerBoundLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound, InstanceViewsRepository.SWT_KIND));
		propagationDelayLowerBound = new Text(parent, SWT.BORDER);
		GridData propagationDelayLowerBoundData = new GridData(GridData.FILL_HORIZONTAL);
		propagationDelayLowerBound.setLayoutData(propagationDelayLowerBoundData);
		propagationDelayLowerBound.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propagationDelayLowerBound.getText()));
			}

		});
		propagationDelayLowerBound.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propagationDelayLowerBound.getText()));
				}
			}

		});
		EditingUtils.setID(propagationDelayLowerBound, InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound);
		EditingUtils.setEEFtype(propagationDelayLowerBound, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound, InstanceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPropagationDelayUpperBoundText(Composite parent) {
		SWTUtils.createPartLabel(parent, InstanceMessages.AssemblyInstancePropertiesEditionPart_PropagationDelayUpperBoundLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound, InstanceViewsRepository.SWT_KIND));
		propagationDelayUpperBound = new Text(parent, SWT.BORDER);
		GridData propagationDelayUpperBoundData = new GridData(GridData.FILL_HORIZONTAL);
		propagationDelayUpperBound.setLayoutData(propagationDelayUpperBoundData);
		propagationDelayUpperBound.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propagationDelayUpperBound.getText()));
			}

		});
		propagationDelayUpperBound.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyInstancePropertiesEditionPartImpl.this, InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propagationDelayUpperBound.getText()));
				}
			}

		});
		EditingUtils.setID(propagationDelayUpperBound, InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound);
		EditingUtils.setEEFtype(propagationDelayUpperBound, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound, InstanceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#getSource()
	 * 
	 */
	public EObject getSource() {
		if (source.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) source.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#initSource(EObjectFlatComboSettings)
	 */
	public void initSource(EObjectFlatComboSettings settings) {
		source.setInput(settings);
		if (current != null) {
			source.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setSource(EObject newValue)
	 * 
	 */
	public void setSource(EObject newValue) {
		if (newValue != null) {
			source.setSelection(new StructuredSelection(newValue));
		} else {
			source.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setSourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSourceButtonMode(ButtonsModeEnum newValue) {
		source.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter) {
		source.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter) {
		source.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#getTarget()
	 * 
	 */
	public EObject getTarget() {
		if (target.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) target.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#initTarget(EObjectFlatComboSettings)
	 */
	public void initTarget(EObjectFlatComboSettings settings) {
		target.setInput(settings);
		if (current != null) {
			target.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setTarget(EObject newValue)
	 * 
	 */
	public void setTarget(EObject newValue) {
		if (newValue != null) {
			target.setSelection(new StructuredSelection(newValue));
		} else {
			target.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setTargetButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetButtonMode(ButtonsModeEnum newValue) {
		target.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter) {
		target.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		target.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#getConnectorType()
	 * 
	 */
	public EObject getConnectorType() {
		if (connectorType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) connectorType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#initConnectorType(EObjectFlatComboSettings)
	 */
	public void initConnectorType(EObjectFlatComboSettings settings) {
		connectorType.setInput(settings);
		if (current != null) {
			connectorType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setConnectorType(EObject newValue)
	 * 
	 */
	public void setConnectorType(EObject newValue) {
		if (newValue != null) {
			connectorType.setSelection(new StructuredSelection(newValue));
		} else {
			connectorType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setConnectorTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setConnectorTypeButtonMode(ButtonsModeEnum newValue) {
		connectorType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#addFilterConnectorType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToConnectorType(ViewerFilter filter) {
		connectorType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#addBusinessFilterConnectorType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToConnectorType(ViewerFilter filter) {
		connectorType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#getPropagationDelayLowerBound()
	 * 
	 */
	public String getPropagationDelayLowerBound() {
		return propagationDelayLowerBound.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setPropagationDelayLowerBound(String newValue)
	 * 
	 */
	public void setPropagationDelayLowerBound(String newValue) {
		if (newValue != null) {
			propagationDelayLowerBound.setText(newValue);
		} else {
			propagationDelayLowerBound.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#getPropagationDelayUpperBound()
	 * 
	 */
	public String getPropagationDelayUpperBound() {
		return propagationDelayUpperBound.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setPropagationDelayUpperBound(String newValue)
	 * 
	 */
	public void setPropagationDelayUpperBound(String newValue) {
		if (newValue != null) {
			propagationDelayUpperBound.setText(newValue);
		} else {
			propagationDelayUpperBound.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return InstanceMessages.AssemblyInstance_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
