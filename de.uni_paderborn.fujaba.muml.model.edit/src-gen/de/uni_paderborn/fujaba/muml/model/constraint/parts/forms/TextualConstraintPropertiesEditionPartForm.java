/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.constraint.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
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
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.uni_paderborn.fujaba.muml.model.constraint.parts.ConstraintViewsRepository;
import de.uni_paderborn.fujaba.muml.model.constraint.parts.TextualConstraintPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.constraint.providers.ConstraintMessages;


// End of user code

/**
 * 
 * 
 */
public class TextualConstraintPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, TextualConstraintPropertiesEditionPart {

	protected EMFComboViewer correctness;
	protected Button background;
	protected EObjectFlatComboViewer constrainableElement;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TextualConstraintPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence textualConstraintStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = textualConstraintStep.addStep(ConstraintViewsRepository.TextualConstraint.Properties.class);
		propertiesStep.addStep(ConstraintViewsRepository.TextualConstraint.Properties.correctness);
		propertiesStep.addStep(ConstraintViewsRepository.TextualConstraint.Properties.background);
		propertiesStep.addStep(ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement);
		
		
		composer = new PartComposer(textualConstraintStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ConstraintViewsRepository.TextualConstraint.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ConstraintViewsRepository.TextualConstraint.Properties.correctness) {
					return createCorrectnessEMFComboViewer(widgetFactory, parent);
				}
				if (key == ConstraintViewsRepository.TextualConstraint.Properties.background) {
					return createBackgroundCheckbox(widgetFactory, parent);
				}
				if (key == ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement) {
					return createConstrainableElementFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(ConstraintMessages.TextualConstraintPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createCorrectnessEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ConstraintMessages.TextualConstraintPropertiesEditionPart_CorrectnessLabel, propertiesEditionComponent.isRequired(ConstraintViewsRepository.TextualConstraint.Properties.correctness, ConstraintViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualConstraintPropertiesEditionPartForm.this, ConstraintViewsRepository.TextualConstraint.Properties.correctness, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getCorrectness()));
			}

		});
		correctness.setID(ConstraintViewsRepository.TextualConstraint.Properties.correctness);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConstraintViewsRepository.TextualConstraint.Properties.correctness, ConstraintViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBackgroundCheckbox(FormToolkit widgetFactory, Composite parent) {
		background = widgetFactory.createButton(parent, ConstraintMessages.TextualConstraintPropertiesEditionPart_BackgroundLabel, SWT.CHECK);
		background.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualConstraintPropertiesEditionPartForm.this, ConstraintViewsRepository.TextualConstraint.Properties.background, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(background.getSelection())));
			}

		});
		GridData backgroundData = new GridData(GridData.FILL_HORIZONTAL);
		backgroundData.horizontalSpan = 2;
		background.setLayoutData(backgroundData);
		EditingUtils.setID(background, ConstraintViewsRepository.TextualConstraint.Properties.background);
		EditingUtils.setEEFtype(background, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConstraintViewsRepository.TextualConstraint.Properties.background, ConstraintViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createConstrainableElementFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ConstraintMessages.TextualConstraintPropertiesEditionPart_ConstrainableElementLabel, propertiesEditionComponent.isRequired(ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement, ConstraintViewsRepository.FORM_KIND));
		constrainableElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement, ConstraintViewsRepository.FORM_KIND));
		widgetFactory.adapt(constrainableElement);
		constrainableElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData constrainableElementData = new GridData(GridData.FILL_HORIZONTAL);
		constrainableElement.setLayoutData(constrainableElementData);
		constrainableElement.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TextualConstraintPropertiesEditionPartForm.this, ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConstrainableElement()));
			}

		});
		constrainableElement.setID(ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement, ConstraintViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
