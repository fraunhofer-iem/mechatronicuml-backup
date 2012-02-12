/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.modeling.SDMPackage;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RegionPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class RegionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for parentState EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings parentStateSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RegionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject region, String editing_mode) {
		super(editingContext, region, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RealtimestatechartViewsRepository.class;
		partKey = RealtimestatechartViewsRepository.Region.class;
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
			final Region region = (Region)elt;
			final RegionPropertiesEditionPart basePart = (RegionPropertiesEditionPart)editingPart;
			// init values
			if (region.getName() != null && isAccessible(RealtimestatechartViewsRepository.Region.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), region.getName()));
			
			if (isAccessible(RealtimestatechartViewsRepository.Region.Properties.priority)) {
				basePart.setPriority(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), region.getPriority()));
			}
			
			if (isAccessible(RealtimestatechartViewsRepository.Region.Properties.parentState)) {
				// init part
				parentStateSettings = new EObjectFlatComboSettings(region, RealtimestatechartPackage.eINSTANCE.getRegion_ParentState());
				basePart.initParentState(parentStateSettings);
				// set the button mode
				basePart.setParentStateButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			basePart.addFilterToParentState(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof State);
				}
			
			});
			// Start of user code for additional businessfilters for parentState
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
		if (editorKey == RealtimestatechartViewsRepository.Region.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == RealtimestatechartViewsRepository.Region.Properties.priority) {
			return RealtimestatechartPackage.eINSTANCE.getPrioritizable_Priority();
		}
		if (editorKey == RealtimestatechartViewsRepository.Region.Properties.parentState) {
			return RealtimestatechartPackage.eINSTANCE.getRegion_ParentState();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Region region = (Region)semanticObject;
		if (RealtimestatechartViewsRepository.Region.Properties.name == event.getAffectedEditor()) {
			region.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (RealtimestatechartViewsRepository.Region.Properties.priority == event.getAffectedEditor()) {
			region.setPriority((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (RealtimestatechartViewsRepository.Region.Properties.parentState == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				parentStateSettings.setToReference((State)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				State eObject = RealtimestatechartFactory.eINSTANCE.createState();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				parentStateSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			RegionPropertiesEditionPart basePart = (RegionPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.Region.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RealtimestatechartPackage.eINSTANCE.getPrioritizable_Priority().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.Region.Properties.priority)) {
				if (msg.getNewValue() != null) {
					basePart.setPriority(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setPriority("");
				}
			}
			if (RealtimestatechartPackage.eINSTANCE.getRegion_ParentState().equals(msg.getFeature()) && basePart != null && isAccessible(RealtimestatechartViewsRepository.Region.Properties.parentState))
				basePart.setParentState((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RealtimestatechartViewsRepository.Region.Properties.name || key == RealtimestatechartViewsRepository.Region.Properties.parentState;
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
				if (RealtimestatechartViewsRepository.Region.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (RealtimestatechartViewsRepository.Region.Properties.priority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(RealtimestatechartPackage.eINSTANCE.getPrioritizable_Priority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RealtimestatechartPackage.eINSTANCE.getPrioritizable_Priority().getEAttributeType(), newValue);
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
