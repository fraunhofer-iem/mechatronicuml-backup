/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.modeling.expressions.ComparingOperator;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.ClockConstraintPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ClockConstraintPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for clock EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings clockSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ClockConstraintPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject clockConstraint, String editing_mode) {
		super(editingContext, clockConstraint, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RealtimestatechartViewsRepository.class;
		partKey = RealtimestatechartViewsRepository.ClockConstraint.class;
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
			final ClockConstraint clockConstraint = (ClockConstraint)elt;
			final ClockConstraintPropertiesEditionPart basePart = (ClockConstraintPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RealtimestatechartViewsRepository.ClockConstraint.Properties.clock)) {
				// init part
				clockSettings = new EObjectFlatComboSettings(clockConstraint, RealtimestatechartPackage.eINSTANCE.getClockConstraint_Clock());
				basePart.initClock(clockSettings);
				// set the button mode
				basePart.setClockButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(RealtimestatechartViewsRepository.ClockConstraint.Properties.operator)) {
				basePart.initOperator((EEnum) RealtimestatechartPackage.eINSTANCE.getClockConstraint_Operator().getEType(), clockConstraint.getOperator());
			}
			// init filters
			basePart.addFilterToClock(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Clock);
				}
			
			});
			// Start of user code for additional businessfilters for clock
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
	protected EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == RealtimestatechartViewsRepository.ClockConstraint.Properties.clock) {
			return RealtimestatechartPackage.eINSTANCE.getClockConstraint_Clock();
		}
		if (editorKey == RealtimestatechartViewsRepository.ClockConstraint.Properties.operator) {
			return RealtimestatechartPackage.eINSTANCE.getClockConstraint_Operator();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ClockConstraint clockConstraint = (ClockConstraint)semanticObject;
		if (RealtimestatechartViewsRepository.ClockConstraint.Properties.clock == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				clockSettings.setToReference((Clock)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Clock eObject = RealtimestatechartFactory.eINSTANCE.createClock();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				clockSettings.setToReference(eObject);
			}
		}
		if (RealtimestatechartViewsRepository.ClockConstraint.Properties.operator == event.getAffectedEditor()) {
			clockConstraint.setOperator((ComparingOperator)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ClockConstraintPropertiesEditionPart basePart = (ClockConstraintPropertiesEditionPart)editingPart;
			if (RealtimestatechartPackage.eINSTANCE.getClockConstraint_Clock().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.ClockConstraint.Properties.clock))
				basePart.setClock((EObject)msg.getNewValue());
			if (RealtimestatechartPackage.eINSTANCE.getClockConstraint_Operator().equals(msg.getFeature()) && isAccessible(RealtimestatechartViewsRepository.ClockConstraint.Properties.operator))
				basePart.setOperator((Enumerator)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RealtimestatechartViewsRepository.ClockConstraint.Properties.clock || key == RealtimestatechartViewsRepository.ClockConstraint.Properties.operator;
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
				if (RealtimestatechartViewsRepository.ClockConstraint.Properties.operator == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RealtimestatechartPackage.eINSTANCE.getClockConstraint_Operator().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RealtimestatechartPackage.eINSTANCE.getClockConstraint_Operator().getEAttributeType(), newValue);
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
