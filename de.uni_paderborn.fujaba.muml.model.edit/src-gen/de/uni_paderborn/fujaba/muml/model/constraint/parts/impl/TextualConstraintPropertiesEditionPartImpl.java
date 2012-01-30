/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.constraint.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.uni_paderborn.fujaba.muml.model.constraint.parts.ConstraintViewsRepository;
import de.uni_paderborn.fujaba.muml.model.constraint.parts.TextualConstraintPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.constraint.providers.ConstraintMessages;


// End of user code

/**
 * 
 * 
 */
public class TextualConstraintPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TextualConstraintPropertiesEditionPart {

	protected EMFComboViewer correctness;
	protected Button background;
	protected EObjectFlatComboViewer constrainableElement;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TextualConstraintPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence textualConstraintStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = textualConstraintStep.addStep(ConstraintViewsRepository.TextualConstraint.Properties.class);
		propertiesStep.addStep(ConstraintViewsRepository.TextualConstraint.Properties.correctness);
		propertiesStep.addStep(ConstraintViewsRepository.TextualConstraint.Properties.background);
		propertiesStep.addStep(ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement);
		
		
		composer = new PartComposer(textualConstraintStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ConstraintViewsRepository.TextualConstraint.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ConstraintViewsRepository.TextualConstraint.Properties.correctness) {
					return createCorrectnessEMFComboViewer(parent);
				}
				if (key == ConstraintViewsRepository.TextualConstraint.Properties.background) {
					return createBackgroundCheckbox(parent);
				}
				if (key == ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement) {
					return createConstrainableElementFlatComboViewer(parent);
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
		propertiesGroup.setText(ConstraintMessages.TextualConstraintPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createCorrectnessEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ConstraintMessages.TextualConstraintPropertiesEditionPart_CorrectnessLabel, propertiesEditionComponent.isRequired(ConstraintViewsRepository.TextualConstraint.Properties.correctness, ConstraintViewsRepository.SWT_KIND));
		correctness = new EMFComboViewer(parent);
		correctness.setContentProvider(new ArrayContentProvider());
		correctness.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData correctnessData = new GridData(GridData.FILL_HORIZONTAL);
		correctness.getCombo().setLayoutData(correctnessData);
		correctness.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualConstraintPropertiesEditionPartImpl.this, ConstraintViewsRepository.TextualConstraint.Properties.correctness, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getCorrectness()));
			}

		});
		correctness.setID(ConstraintViewsRepository.TextualConstraint.Properties.correctness);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConstraintViewsRepository.TextualConstraint.Properties.correctness, ConstraintViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBackgroundCheckbox(Composite parent) {
		background = new Button(parent, SWT.CHECK);
		background.setText(ConstraintMessages.TextualConstraintPropertiesEditionPart_BackgroundLabel);
		background.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualConstraintPropertiesEditionPartImpl.this, ConstraintViewsRepository.TextualConstraint.Properties.background, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(background.getSelection())));
			}

		});
		GridData backgroundData = new GridData(GridData.FILL_HORIZONTAL);
		backgroundData.horizontalSpan = 2;
		background.setLayoutData(backgroundData);
		EditingUtils.setID(background, ConstraintViewsRepository.TextualConstraint.Properties.background);
		EditingUtils.setEEFtype(background, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConstraintViewsRepository.TextualConstraint.Properties.background, ConstraintViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createConstrainableElementFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ConstraintMessages.TextualConstraintPropertiesEditionPart_ConstrainableElementLabel, propertiesEditionComponent.isRequired(ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement, ConstraintViewsRepository.SWT_KIND));
		constrainableElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement, ConstraintViewsRepository.SWT_KIND));
		constrainableElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		constrainableElement.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualConstraintPropertiesEditionPartImpl.this, ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getConstrainableElement()));
			}

		});
		GridData constrainableElementData = new GridData(GridData.FILL_HORIZONTAL);
		constrainableElement.setLayoutData(constrainableElementData);
		constrainableElement.setID(ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement, ConstraintViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.parts.TextualConstraintPropertiesEditionPart#getCorrectness()
	 * 
	 */
	public Enumerator getCorrectness() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) correctness.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.parts.TextualConstraintPropertiesEditionPart#initCorrectness(EEnum eenum, Enumerator current)
	 */
	public void initCorrectness(EEnum eenum, Enumerator current) {
		correctness.setInput(eenum.getELiterals());
		correctness.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.parts.TextualConstraintPropertiesEditionPart#setCorrectness(Enumerator newValue)
	 * 
	 */
	public void setCorrectness(Enumerator newValue) {
		correctness.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.parts.TextualConstraintPropertiesEditionPart#getBackground()
	 * 
	 */
	public Boolean getBackground() {
		return Boolean.valueOf(background.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.parts.TextualConstraintPropertiesEditionPart#setBackground(Boolean newValue)
	 * 
	 */
	public void setBackground(Boolean newValue) {
		if (newValue != null) {
			background.setSelection(newValue.booleanValue());
		} else {
			background.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.parts.TextualConstraintPropertiesEditionPart#getConstrainableElement()
	 * 
	 */
	public EObject getConstrainableElement() {
		if (constrainableElement.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) constrainableElement.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.parts.TextualConstraintPropertiesEditionPart#initConstrainableElement(EObjectFlatComboSettings)
	 */
	public void initConstrainableElement(EObjectFlatComboSettings settings) {
		constrainableElement.setInput(settings);
		if (current != null) {
			constrainableElement.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.parts.TextualConstraintPropertiesEditionPart#setConstrainableElement(EObject newValue)
	 * 
	 */
	public void setConstrainableElement(EObject newValue) {
		if (newValue != null) {
			constrainableElement.setSelection(new StructuredSelection(newValue));
		} else {
			constrainableElement.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.parts.TextualConstraintPropertiesEditionPart#setConstrainableElementButtonMode(ButtonsModeEnum newValue)
	 */
	public void setConstrainableElementButtonMode(ButtonsModeEnum newValue) {
		constrainableElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.parts.TextualConstraintPropertiesEditionPart#addFilterConstrainableElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToConstrainableElement(ViewerFilter filter) {
		constrainableElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.parts.TextualConstraintPropertiesEditionPart#addBusinessFilterConstrainableElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToConstrainableElement(ViewerFilter filter) {
		constrainableElement.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ConstraintMessages.TextualConstraint_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
