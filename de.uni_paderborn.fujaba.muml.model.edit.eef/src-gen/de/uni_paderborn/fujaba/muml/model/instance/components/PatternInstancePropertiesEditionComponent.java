/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.instance.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.model.component.ComponentFactory;
import de.uni_paderborn.fujaba.muml.model.component.PatternOccurrence;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PatternInstance;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.parts.InstanceViewsRepository;
import de.uni_paderborn.fujaba.muml.model.instance.parts.PatternInstancePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class PatternInstancePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for portInstances ReferencesTable
	 */
	private	ReferencesTableSettings portInstancesSettings;
	
	/**
	 * Settings for patternOccurrence EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings patternOccurrenceSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public PatternInstancePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject patternInstance, String editing_mode) {
		super(editingContext, patternInstance, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = InstanceViewsRepository.class;
		partKey = InstanceViewsRepository.PatternInstance.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	@Override
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final PatternInstance patternInstance = (PatternInstance)elt;
			final PatternInstancePropertiesEditionPart basePart = (PatternInstancePropertiesEditionPart)editingPart;
			// init values
			if (patternInstance.getName() != null && isAccessible(InstanceViewsRepository.PatternInstance.Properties.name)) {
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), patternInstance.getName()));
			}
			
			if (isAccessible(InstanceViewsRepository.PatternInstance.Properties.portInstances)) {
				portInstancesSettings = new ReferencesTableSettings(patternInstance, InstancePackage.eINSTANCE.getPatternInstance_PortInstances());
				basePart.initPortInstances(portInstancesSettings);
			}
			if (isAccessible(InstanceViewsRepository.PatternInstance.Properties.patternOccurrence)) {
				// init part
				patternOccurrenceSettings = new EObjectFlatComboSettings(patternInstance, InstancePackage.eINSTANCE.getPatternInstance_PatternOccurrence());
				basePart.initPatternOccurrence(patternOccurrenceSettings);
				// set the button mode
				basePart.setPatternOccurrenceButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToPortInstances(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				@Override
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject) {
						return (!basePart.isContainedInPortInstancesTable((EObject)element));
					}
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToPortInstances(new EObjectFilter(InstancePackage.eINSTANCE.getPortInstance()));
			// Start of user code for additional businessfilters for portInstances
			// End of user code
			
			basePart.addFilterToPatternOccurrence(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof PatternOccurrence);
				}
			
			});
			// Start of user code for additional businessfilters for patternOccurrence
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
	@Override
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == InstanceViewsRepository.PatternInstance.Properties.name) {
			return CorePackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == InstanceViewsRepository.PatternInstance.Properties.portInstances) {
			return InstancePackage.eINSTANCE.getPatternInstance_PortInstances();
		}
		if (editorKey == InstanceViewsRepository.PatternInstance.Properties.patternOccurrence) {
			return InstancePackage.eINSTANCE.getPatternInstance_PatternOccurrence();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	@Override
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PatternInstance patternInstance = (PatternInstance)semanticObject;
		if (InstanceViewsRepository.PatternInstance.Properties.name == event.getAffectedEditor()) {
			patternInstance.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (InstanceViewsRepository.PatternInstance.Properties.portInstances == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof PortInstance) {
					portInstancesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				portInstancesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				portInstancesSettings.move(event.getNewIndex(), (PortInstance) event.getNewValue());
			}
		}
		if (InstanceViewsRepository.PatternInstance.Properties.patternOccurrence == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				patternOccurrenceSettings.setToReference(event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				PatternOccurrence eObject = ComponentFactory.eINSTANCE.createPatternOccurrence();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				patternOccurrenceSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			PatternInstancePropertiesEditionPart basePart = (PatternInstancePropertiesEditionPart)editingPart;
			if (CorePackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(InstanceViewsRepository.PatternInstance.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (InstancePackage.eINSTANCE.getPatternInstance_PortInstances().equals(msg.getFeature())  && isAccessible(InstanceViewsRepository.PatternInstance.Properties.portInstances)) {
				basePart.updatePortInstances();
			}
			if (InstancePackage.eINSTANCE.getPatternInstance_PatternOccurrence().equals(msg.getFeature()) && basePart != null && isAccessible(InstanceViewsRepository.PatternInstance.Properties.patternOccurrence)) {
				basePart.setPatternOccurrence((EObject)msg.getNewValue());
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	@Override
	public boolean isRequired(Object key, int kind) {
		return key == InstanceViewsRepository.PatternInstance.Properties.name || key == InstanceViewsRepository.PatternInstance.Properties.portInstances || key == InstanceViewsRepository.PatternInstance.Properties.patternOccurrence;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	@Override
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (InstanceViewsRepository.PatternInstance.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CorePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CorePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
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
