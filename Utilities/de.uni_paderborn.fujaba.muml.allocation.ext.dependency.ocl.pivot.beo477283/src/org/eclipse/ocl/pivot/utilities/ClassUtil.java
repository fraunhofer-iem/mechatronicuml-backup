/*******************************************************************************
 * Copyright (c) 2010, 2014 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.utilities;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public class ClassUtil
{	
	/**
	 * Return object cast to requiredClass.
	 * @param object to cast.
	 * @param requiredClass to cast to.
	 * @return cast object or null
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Object> T asClassOrNull(Object object, Class<T> requiredClass) {
		if (object == null)
			return null;
		if (requiredClass == null)
			return null;
		Class<?> objectClass = object.getClass();
		if (!objectClass.isAssignableFrom(objectClass))
			return null;
		return (T) object;
	}
	
	/**
	 * Return object cast to T without a check.
	 * <p>
	 * This enables type-checking to be suppressed on a single expression term
	 * avoiding the need for suppressing unchecked warnings throughout the rest
	 * of an invoking method.
	 * <p>
	 * Use as: asClassUnchecked(object, (ArbitrarilyComplicatedType)null)
	 *
	 * @param <T> required type
	 * @param object to cast
	 * @param requiredClassObject dummy argument: use null
	 * @return cast type
	 */
	@SuppressWarnings("unchecked")
	public static <T> T asClassUnchecked(Object object, T requiredClassObject) {
		return (T) object;
	}
	
	/**
	 * Return object cast to T without a check.
	 * <p>
	 * This enables type-checking to suppressed on a single expression term
	 * avoiding the need for suppressing unchecked warnings throughout the rest
	 * of an invoking method.
	 * <p>
	 * Use as: ArbitrarilyComplicatedType castObject = asClassUnchecked(object);
	 *
	 * @param <T> required type
	 * @param object to cast
	 * @return cast type
	 */
	@SuppressWarnings("unchecked")
	public static <T> T asClassUnchecked(Object object) {
		return (T) object;
	}

	/**
	 * Return the DomainConstants.AS_METAMODEL_ANNOTATION_SOURCE for ePackage or null if none.
	 */
	public static @Nullable EAnnotation basicGetMetamodelAnnotation(@NonNull EPackage ePackage) {
		EAnnotation asMetamodelAnnotation = ePackage.getEAnnotation(PivotConstants.AS_METAMODEL_ANNOTATION_SOURCE);
		return asMetamodelAnnotation;
	}

	/**
	 * Return the fully typed class of an object.
	 * @param <T> type
	 * @param object the object
	 * @return the class
	 */
	@SuppressWarnings("unchecked")
	public static <T> Class<T> getClass(T object) {
		if (object == null)
			return null;
		return (Class<T>) object.getClass();
	}

	/**
	 * Return the sourceURI annotation of eModelElement, creating and installing it if required.
	 */
	public static @NonNull EAnnotation getEAnnotation(@NonNull EModelElement eModelElement, String sourceURI) {
		EAnnotation eAnnotation = eModelElement.getEAnnotation(sourceURI);
		if (eAnnotation == null) {
			eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			eAnnotation.setSource(sourceURI);
			eModelElement.getEAnnotations().add(eAnnotation);
		}
		return eAnnotation;
	}

	/**
	 * Return the DomainConstants.AS_METAMODEL_ANNOTATION_SOURCE for ePackage, creating it if needed.
	 */
	public static @NonNull EAnnotation getMetamodelAnnotation(@NonNull EPackage ePackage) {
		EAnnotation eAnnotation = ePackage.getEAnnotation(PivotConstants.AS_METAMODEL_ANNOTATION_SOURCE);
		if (eAnnotation == null) {
			eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			eAnnotation.setSource(PivotConstants.AS_METAMODEL_ANNOTATION_SOURCE);
			ePackage.getEAnnotations().add(eAnnotation);
		}
		return eAnnotation;
	}

	/**
	 * Return anObject cast to aClass if type-safe or null otherwise.
	 * @param anObject for which cast required
	 * @param aClass the type to which cast required
	 * @return the non-null cast of anObject if safe
	 */
	@SuppressWarnings("unchecked")
	public static <T> T isInstanceOf(Object anObject, Class<T> aClass) {
		if (anObject == null)
			return null;
		Class<?> objectClass = anObject.getClass();
		if (aClass.isAssignableFrom(objectClass))
			return (T) anObject;
		else
			return null;
	}

	/**
	 * Return true if resource is a registered resource; hosting a compile Java model.
	 */
	public static boolean isRegistered(Resource resource) {
		if (resource == null) {
			return false;
		}
		return resource.getResourceSet() == null;
	}

	/**
	 * Return aT, checking the assertion that this call would not be necessary if EMF had comprehensive @NonNull annotations.
	 */
	public static @NonNull <T> T nonNullEMF(@Nullable T aT) {// FIXME remove once EMF guarantees non-null
		assert aT != null;
		return aT;
	}

	/**
	 * Check for an in appropriate model state which should have been detected by a model validation pass. Typical problems
	 * that nonNullModel detects are null mandatory model elements.
	 *<p>
	 * Return aT, checking the assertion that this call would not be necessary if the Ecore model was guaranteed to be valid.
	 */
	public static @NonNull <T> T nonNullModel(@Nullable T aT) {
		assert aT != null;			// FIXME Change to InvalidModelException
		return aT;
	}

	/**
	 * Return aT, checking the assertion that this call would not be necessary if the Pivot model was guaranteed to be valid.
	 */
	public static @NonNull <T> T nonNullPivot(@Nullable T aT) {
		assert aT != null;			// FIXME Change to InvalidModelException
		return aT;
	}

	/**
	 * Check for an in appropriate program state. This should not happen, but is not impossible. For instance
	 * a Resource should be contained in a ResourceSet, but that doesn't mean it always is.
	 *<p>
	 * If the inappropriate state really cannot happen, an assertion should be used instead to avoid non-debug
	 * run-time cost.
	 * <p>
	 * Return aT, throwing an IllegalStateException if null.
	 */
	public static @NonNull <T> T nonNullState(@Nullable T aT) {
		if (aT == null) {
			throw new IllegalStateException();
		}
		return aT;
	}

	/**
	 * Safely determines the relative order of <code>object</code> and
	 * <code>otherObject</code>, i.e. without throwing an exception if
	 * <code>object</code> is <code>null</code>.
	 */
	public static <T extends Comparable<T>> int safeCompareTo(@Nullable T object, @Nullable T otherObject) {
		if (object == null) {
			return otherObject == null ? 1 : 0;
		}
		else {
			return otherObject == null ? -1 : object.compareTo(otherObject);
		}
	}

	/**
	 * Safely determines whether <code>object</code> equals
	 * <code>otherObject</code>, i.e. without throwing an exception if
	 * <code>object</code> is <code>null</code>.
	 * 
	 * @param object
	 *            The first object to compare.
	 * @param otherObject
	 *            The second object to compare.
	 * @return <code>true</code> if <code>object</code> equals
	 *         <code>otherObject</code>; <code>false</code> otherwise.
	 */
	public static boolean safeEquals(@Nullable Object object, @Nullable Object otherObject) {
		return object == null
			? otherObject == null
			: object.equals(otherObject);
	}

	/**
	 * Sort aList using comparator, using an Ecollections.sort if aLIst is an EList.
	 */
	public static <T> void sort(@NonNull List<T> aList, @NonNull Comparator<T> comparator) {
		if (aList.size() > 1) {
			if (aList instanceof EList<?>) {
				ECollections.sort((EList<T>)aList, comparator);
			}
			else {
				Collections.sort(aList, comparator);
			}
		}
	}

	public static <T> T getAdapter(@NonNull Class<T> adapterClass, @NonNull Notifier notifier) {
		List<Adapter> eAdapters = nonNullEMF(notifier.eAdapters());
		return getAdapter(adapterClass, eAdapters);
	}

	public static <T> T getAdapter(@NonNull Class<T> adapterClass, @NonNull List<Adapter> eAdapters) {
		Adapter adapter = EcoreUtil.getAdapter(eAdapters, adapterClass);
		if (adapter == null) {
			return null;
		}
		if (!adapterClass.isAssignableFrom(adapter.getClass())) {
			throw new ClassCastException(adapter.getClass().getName() + " is not assignable to " + adapterClass.getName());
		}
		@SuppressWarnings("unchecked")
		T castAdapter = (T) adapter;
		return castAdapter;
	}
}
