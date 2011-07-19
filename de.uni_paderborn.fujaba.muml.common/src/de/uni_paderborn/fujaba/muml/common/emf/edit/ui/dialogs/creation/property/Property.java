package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;

/**
 * A Property to show in the MultiFeatureCreationDialog.
 * 
 * @author bingo
 * 
 */
public class Property {
	/**
	 * The structural feature of the property.
	 */
	protected EStructuralFeature feature;

	protected Resource resource;

	protected TransactionalEditingDomain editingDomain;
	
	protected String displayName;


	/**
	 * The AdapterFactory to create an ItemPropertyDescritor.
	 */
	protected AdapterFactory adapterFactory;

	/**
	 * The property editor to use.
	 */
	private AbstractPropertyEditor propertyEditor;

	/**
	 * Constructs this Property.
	 * 
	 * @param feature
	 *            The structural feature of this property.
	 * @param propertyEditor
	 *            The property editor to use.
	 */
	public Property(Resource resource, EStructuralFeature feature,
			AdapterFactory adapterFactory, AbstractPropertyEditor propertyEditor) {
		this.resource = resource;
		this.feature = feature;
		this.propertyEditor = propertyEditor;
		this.adapterFactory = adapterFactory;
		editingDomain = TransactionUtil.getEditingDomain(resource);

		propertyEditor.init(this);
	}
	
	/**
	 * Gets the structural feature of this property.
	 * 
	 * @return The structural feature.
	 */
	public EStructuralFeature getFeature() {
		return feature;
	}

	/**
	 * Gets the property editor of this property.
	 * 
	 * @return The property editor.
	 */
	public AbstractPropertyEditor getPropertyEditor() {
		return propertyEditor;
	}

	/**
	 * Creates the display name for this property.
	 * 
	 * @return The display name.
	 */
	public String getDisplayName() {
		if (displayName == null) {
			displayName = feature.getName().substring(0, 1).toUpperCase()
				+ feature.getName().substring(1);
		}
		return displayName;
	}
	

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Collection<?> getReachableObjects() {
		// partly copied from
		// org.eclipse.emf.edit.provider.ItemPropertyDescriptor
		if (feature != null) {
			if (feature instanceof EReference) {
				Collection<EObject> result = getReachableObjectsOfType(
						resource, feature.getEType());
				if (!feature.isMany() && !result.contains(null)) {
					result.add(null);
				}
				return result;
			} else if (feature.getEType() instanceof EEnum) {
				EEnum eEnum = (EEnum) feature.getEType();
				List<Enumerator> enumerators = new ArrayList<Enumerator>();
				for (EEnumLiteral eEnumLiteral : eEnum.getELiterals()) {
					enumerators.add(eEnumLiteral.getInstance());
				}
				return enumerators;
			} else {
				EDataType eDataType = (EDataType) feature.getEType();
				List<String> enumeration = ExtendedMetaData.INSTANCE
						.getEnumerationFacet(eDataType);
				if (!enumeration.isEmpty()) {
					List<Object> enumerators = new ArrayList<Object>();
					for (String enumerator : enumeration) {
						enumerators.add(EcoreUtil.createFromString(eDataType,
								enumerator));
					}
					return enumerators;
				}
			}
		}
		return Collections.EMPTY_LIST;
	}

	public static Collection<EObject> getReachableObjectsOfType(
			Resource resource, EClassifier eType) {
		// Partly copied from
		// org.eclipse.emf.edit.provider.ItemPropertyDescriptor
		Collection<EObject> visited = new HashSet<EObject>();
		Collection<EObject> result = new ArrayList<EObject>();
		List<Resource> resources;
		if (resource.getResourceSet() != null) {
			resources = resource.getResourceSet().getResources();
		} else {
			resources = Arrays.asList((new Resource[] { resource }));
		}
		for (Resource curResource : resources) {
			for (Object topLevelObject : curResource.getContents()) {
				if (topLevelObject instanceof EObject) {
					ItemPropertyDescriptor.collectReachableObjectsOfType(
							visited, result, (EObject) topLevelObject, eType);
				}
			}
		}
		return result;
	}

	/**
	 * Sets the current value for the object passed.
	 * 
	 * @param object
	 *            The object to set the value for.
	 * @throws ExecutionException
	 */
	public void setPropertyValue(final EObject object, final Object value)
			throws ExecutionException {
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				"MultiFeatureCreationDialog -> setPropertyValue()",
				Collections.EMPTY_LIST) {
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				IItemPropertyDescriptor itemPropertyDescriptor = getItemPropertyDescriptor(object);
				if (itemPropertyDescriptor != null) {
					itemPropertyDescriptor.setPropertyValue(object, value);
				}

				return CommandResult.newOKCommandResult();
			}
		};

		OperationHistoryFactory.getOperationHistory().execute(command, null,
				null);
		// } catch (ExecutionException e) {
		// // FujabaNewwizardPlugin.getDefault().logError(
		////					"Unable to create model and diagram", e); //$NON-NLS-1$
		// }
		//

	}

	private IItemPropertyDescriptor getItemPropertyDescriptor(EObject object) {
		IItemPropertySource ips = (IItemPropertySource) adapterFactory.adapt(
				object, IItemPropertySource.class);
		if (ips != null) {
			List<IItemPropertyDescriptor> itemPropertyDescriptors = ips
					.getPropertyDescriptors(object);
			for (IItemPropertyDescriptor itemPropertyDescriptor : itemPropertyDescriptors) {
				if (isValidItemPropertyDescriptor(itemPropertyDescriptor,
						object)) {
					return itemPropertyDescriptor;
				}
			}
		}
		return null;
	}

	protected boolean isValidItemPropertyDescriptor(
			IItemPropertyDescriptor itemPropertyDescriptor, Object object) {
		return itemPropertyDescriptor.getFeature(object).equals(feature);
	}

}
