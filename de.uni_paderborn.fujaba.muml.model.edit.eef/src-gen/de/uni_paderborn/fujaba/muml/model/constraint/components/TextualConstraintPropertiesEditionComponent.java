/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.constraint.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.model.constraint.Correctness;
import de.uni_paderborn.fujaba.muml.model.constraint.TextualConstraint;
import de.uni_paderborn.fujaba.muml.model.constraint.parts.ConstraintViewsRepository;
import de.uni_paderborn.fujaba.muml.model.constraint.parts.TextualConstraintPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;


// End of user code

/**
 * 
 * 
 */
public class TextualConstraintPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for constrainableElement EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings constrainableElementSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TextualConstraintPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject textualConstraint, String editing_mode) {
		super(editingContext, textualConstraint, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ConstraintViewsRepository.class;
		partKey = ConstraintViewsRepository.TextualConstraint.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final TextualConstraint textualConstraint = (TextualConstraint)elt;
			final TextualConstraintPropertiesEditionPart basePart = (TextualConstraintPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ConstraintViewsRepository.TextualConstraint.Properties.correctness)) {
				basePart.initCorrectness(EEFUtils.choiceOfValues(textualConstraint, ConstraintPackage.eINSTANCE.getConstraint_Correctness()), textualConstraint.getCorrectness());
			}
			if (isAccessible(ConstraintViewsRepository.TextualConstraint.Properties.background)) {
				basePart.setBackground(textualConstraint.isBackground());
			}
			if (isAccessible(ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement)) {
				// init part
				constrainableElementSettings = new EObjectFlatComboSettings(textualConstraint, ConstraintPackage.eINSTANCE.getConstraint_ConstrainableElement());
				basePart.initConstrainableElement(constrainableElementSettings);
				// set the button mode
				basePart.setConstrainableElementButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			basePart.addFilterToConstrainableElement(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof ConstrainableElement);
				}
			
			});
			// Start of user code for additional businessfilters for constrainableElement
			// End of user code
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ConstraintViewsRepository.TextualConstraint.Properties.correctness) {
			return ConstraintPackage.eINSTANCE.getConstraint_Correctness();
		}
		if (editorKey == ConstraintViewsRepository.TextualConstraint.Properties.background) {
			return ConstraintPackage.eINSTANCE.getConstraint_Background();
		}
		if (editorKey == ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement) {
			return ConstraintPackage.eINSTANCE.getConstraint_ConstrainableElement();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TextualConstraint textualConstraint = (TextualConstraint)semanticObject;
		if (ConstraintViewsRepository.TextualConstraint.Properties.correctness == event.getAffectedEditor()) {
			textualConstraint.setCorrectness((Correctness)event.getNewValue());
		}
		if (ConstraintViewsRepository.TextualConstraint.Properties.background == event.getAffectedEditor()) {
			textualConstraint.setBackground((Boolean)event.getNewValue());
		}
		if (ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				constrainableElementSettings.setToReference((ConstrainableElement)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, constrainableElementSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			TextualConstraintPropertiesEditionPart basePart = (TextualConstraintPropertiesEditionPart)editingPart;
			if (ConstraintPackage.eINSTANCE.getConstraint_Correctness().equals(msg.getFeature()) && isAccessible(ConstraintViewsRepository.TextualConstraint.Properties.correctness))
				basePart.setCorrectness((Correctness)msg.getNewValue());
			
			if (ConstraintPackage.eINSTANCE.getConstraint_Background().equals(msg.getFeature()) && basePart != null && isAccessible(ConstraintViewsRepository.TextualConstraint.Properties.background))
				basePart.setBackground((Boolean)msg.getNewValue());
			
			if (ConstraintPackage.eINSTANCE.getConstraint_ConstrainableElement().equals(msg.getFeature()) && basePart != null && isAccessible(ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement))
				basePart.setConstrainableElement((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ConstraintViewsRepository.TextualConstraint.Properties.constrainableElement;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (ConstraintViewsRepository.TextualConstraint.Properties.correctness == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ConstraintPackage.eINSTANCE.getConstraint_Correctness().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConstraintPackage.eINSTANCE.getConstraint_Correctness().getEAttributeType(), newValue);
				}
				if (ConstraintViewsRepository.TextualConstraint.Properties.background == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ConstraintPackage.eINSTANCE.getConstraint_Background().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ConstraintPackage.eINSTANCE.getConstraint_Background().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
