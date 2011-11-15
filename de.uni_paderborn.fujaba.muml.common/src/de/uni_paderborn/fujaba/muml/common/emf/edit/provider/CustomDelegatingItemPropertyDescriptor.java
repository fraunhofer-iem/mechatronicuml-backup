package de.uni_paderborn.fujaba.muml.common.emf.edit.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import de.uni_paderborn.fujaba.common.descriptor.DelegatingItemPropertyDescriptor;

/**
 * Customized version of the DelegatingItemPropertyDescriptor. It additionally
 * accepts a ResourceSet for getChoiceOfValues().
 * 
 * @author bingo
 * 
 */
public class CustomDelegatingItemPropertyDescriptor extends
		DelegatingItemPropertyDescriptor {

	/**
	 * The ResourcSet to use for getting choices.
	 */
	protected ResourceSet resourceSet;

	/**
	 * Creates this CustomDelegatingItemPropertyDescriptor.
	 * 
	 * @param delegation
	 *            The IItemPropertyDescriptor to delegate all uncustomized calls
	 *            to.
	 * @param resourceSet
	 *            The ResourceSet to use for getChoiceOfValues().
	 */
	public CustomDelegatingItemPropertyDescriptor(
			IItemPropertyDescriptor delegation, ResourceSet resourceSet) {
		super(delegation);
		this.resourceSet = resourceSet;
	}

	/**
	 * Customized version of getChoiceOfValues(), which uses the ResourceSet to
	 * get choices for objects that are not contained in any Resource yet (which
	 * is the case, if they are newly created in the CreationDialog).
	 * 
	 * @param object
	 *            The object to get choices for.
	 * @return The choices for the object.
	 */
	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		if (object instanceof EObject && ((EObject) object).eResource() == null) {
			EReference[] parentReferences = getParentReferences(object);
			Object feature = getFeature(object);
			if (object instanceof EObject) {
				if (parentReferences != null) {
					Collection<Object> result = new UniqueEList<Object>();
					for (int i = 0; i < parentReferences.length; ++i) {
						result.addAll(getReachableObjectsOfType(
								(EObject) object,
								parentReferences[i].getEType(), resourceSet));
					}
					return result;
				} else if (feature != null) {
					if (feature instanceof EReference) {
						Collection<EObject> result = getReachableObjectsOfType(
								(EObject) object,
								((EStructuralFeature) feature).getEType(),
								resourceSet);
						if (!((EStructuralFeature) feature).isMany()
								&& !result.contains(null)) {
							result.add(null);
						}
						return result;
					}
				}
			}
		}

		// Let the DelegatingItemPropertyDescriptor implementation delegate the
		// call
		return super.getChoiceOfValues(object);
	}

	// Copied from ItemPropertyDescriptor and customized
	/**
	 * This yields all reachable references from object with a meta object which
	 * indicates that it is a subtype of type.
	 */
	public Collection<EObject> getReachableObjectsOfType(EObject object,
			EClassifier type, ResourceSet resourceSet) {
		LinkedList<EObject> itemQueue = new LinkedList<EObject>();
		Collection<EObject> visited = new HashSet<EObject>();
		Collection<EObject> result = new ArrayList<EObject>();
		Resource resource = object.eResource();
		if (resource != null || resourceSet != null) {
			if (resource != null && resource.getResourceSet() != null) {
				resourceSet = resource.getResourceSet();
			}
			if (resourceSet != null) {
				for (TreeIterator<?> i = resourceSet.getAllContents(); i
						.hasNext();) {
					Object child = i.next();
					if (child instanceof EObject) {
						collectReachableObjectsOfType(visited, itemQueue,
								result, (EObject) child, type);
						i.prune();
					}
				}
			} else {
				for (EObject eObject : resource.getContents()) {
					collectReachableObjectsOfType(visited, itemQueue, result,
							eObject, type);
				}
			}
		} else {
			collectReachableObjectsOfType(visited, itemQueue, result,
					EcoreUtil.getRootContainer(object), type);
		}

		while (!itemQueue.isEmpty()) {
			EObject nextItem = itemQueue.removeFirst();
			collectReachableObjectsOfType(visited, itemQueue, result, nextItem,
					type);
		}

		return result;
	}

	// Copied from ItemPropertyDescriptor and made accessible
	/**
	 * This will visit all reachable references from object except those in
	 * visited and add them to the queue. The queue is processed outside this
	 * recursive traversal to avoid stack overflows. It updates visited and adds
	 * to result any object with a meta object that indicates that it is a
	 * subtype of type.
	 */
	protected void collectReachableObjectsOfType(Collection<EObject> visited,
			LinkedList<EObject> itemQueue, Collection<EObject> result,
			EObject object, EClassifier type) {
		if (visited.add(object)) {
			if (type.isInstance(object)) {
				result.add(object);
			}

			// Don't traverse the structure of the EcorePackage's EObject EClass
			// instance.
			// This avoids pulling in all the EcorePackage's meta data simply
			// because EObject was used.
			//
			if (object != EcorePackage.Literals.EOBJECT) {
				EClass eClass = object.eClass();
				for (EStructuralFeature eStructuralFeature : eClass
						.getEAllStructuralFeatures()) {
					if (!eStructuralFeature.isDerived()) {
						if (eStructuralFeature instanceof EReference) {
							EReference eReference = (EReference) eStructuralFeature;
							if (eReference.isMany()) {
								@SuppressWarnings("unchecked")
								List<EObject> list = ((List<EObject>) object
										.eGet(eReference));
								itemQueue.addAll(list);
							} else {
								EObject eObject = (EObject) object
										.eGet(eReference);

								// Explicitly exclude walking up the container
								// reference for EClassifiers of the
								// EcorePackage instance
								// except for EClass instances (other than
								// EObject which was excluded above already).
								// This avoids pulling in all the EcorePackage's
								// meta data simply because an EDataType was
								// used.
								//
								if (eObject != null
										&& (eObject != EcorePackage.eINSTANCE
												|| eStructuralFeature != EcorePackage.Literals.ECLASSIFIER__EPACKAGE || object instanceof EClass)) {
									itemQueue.addLast(eObject);
								}
							}
						} else if (FeatureMapUtil
								.isFeatureMap(eStructuralFeature)) {
							for (FeatureMap.Entry entry : (FeatureMap) object
									.eGet(eStructuralFeature)) {
								if (entry.getEStructuralFeature() instanceof EReference
										&& entry.getValue() != null) {
									itemQueue.addLast((EObject) entry
											.getValue());
								}
							}
						}
					}
				}
			}
		}
	}

}