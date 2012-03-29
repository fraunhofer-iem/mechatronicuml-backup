/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.PatternOccurrence;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.component.parts.PatternOccurrencePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternFactory;


// End of user code

/**
 * 
 * 
 */
public class PatternOccurrencePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for pattern EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings patternSettings;
	
	/**
	 * Settings for ports ReferencesTable
	 */
	private	ReferencesTableSettings portsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public PatternOccurrencePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject patternOccurrence, String editing_mode) {
		super(editingContext, patternOccurrence, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ComponentViewsRepository.class;
		partKey = ComponentViewsRepository.PatternOccurrence.class;
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
			final PatternOccurrence patternOccurrence = (PatternOccurrence)elt;
			final PatternOccurrencePropertiesEditionPart basePart = (PatternOccurrencePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ComponentViewsRepository.PatternOccurrence.Properties.pattern)) {
				// init part
				patternSettings = new EObjectFlatComboSettings(patternOccurrence, ComponentPackage.eINSTANCE.getPatternOccurrence_Pattern());
				basePart.initPattern(patternSettings);
				// set the button mode
				basePart.setPatternButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.PatternOccurrence.Properties.ports)) {
				portsSettings = new ReferencesTableSettings(patternOccurrence, ComponentPackage.eINSTANCE.getPatternOccurrence_Ports());
				basePart.initPorts(portsSettings);
			}
			// init filters
			basePart.addFilterToPattern(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof CoordinationPattern);
				}
			
			});
			// Start of user code for additional businessfilters for pattern
			// End of user code
			
			basePart.addFilterToPorts(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInPortsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToPorts(new EObjectFilter(ComponentPackage.eINSTANCE.getPort()));
			// Start of user code for additional businessfilters for ports
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
		if (editorKey == ComponentViewsRepository.PatternOccurrence.Properties.pattern) {
			return ComponentPackage.eINSTANCE.getPatternOccurrence_Pattern();
		}
		if (editorKey == ComponentViewsRepository.PatternOccurrence.Properties.ports) {
			return ComponentPackage.eINSTANCE.getPatternOccurrence_Ports();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PatternOccurrence patternOccurrence = (PatternOccurrence)semanticObject;
		if (ComponentViewsRepository.PatternOccurrence.Properties.pattern == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				patternSettings.setToReference((CoordinationPattern)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				CoordinationPattern eObject = PatternFactory.eINSTANCE.createCoordinationPattern();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				patternSettings.setToReference(eObject);
			}
		}
		if (ComponentViewsRepository.PatternOccurrence.Properties.ports == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Port) {
					portsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				portsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				portsSettings.move(event.getNewIndex(), (Port) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			PatternOccurrencePropertiesEditionPart basePart = (PatternOccurrencePropertiesEditionPart)editingPart;
			if (ComponentPackage.eINSTANCE.getPatternOccurrence_Pattern().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.PatternOccurrence.Properties.pattern))
				basePart.setPattern((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getPatternOccurrence_Ports().equals(msg.getFeature())  && isAccessible(ComponentViewsRepository.PatternOccurrence.Properties.ports))
				basePart.updatePorts();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ComponentViewsRepository.PatternOccurrence.Properties.pattern || key == ComponentViewsRepository.PatternOccurrence.Properties.ports;
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
