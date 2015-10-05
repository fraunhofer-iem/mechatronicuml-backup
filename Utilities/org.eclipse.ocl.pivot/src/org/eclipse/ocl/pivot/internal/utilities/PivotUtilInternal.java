/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - initial API and implementation
 * 	 E.D.Willink (Obeo) - Bug 416287 - tuple-valued constraints
 * 	 E.D.Willink (CEA LIST) - Bug 425799 - validity view
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.utilities;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Constraint;
import org.eclipse.ocl.pivot.DataType;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.LambdaType;
import org.eclipse.ocl.pivot.LanguageExpression;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.Parameter;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.PivotTables;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.SelfType;
import org.eclipse.ocl.pivot.TemplateableElement;
import org.eclipse.ocl.pivot.TupleType;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.internal.ecore.es2as.Ecore2AS;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorManager;
import org.eclipse.ocl.pivot.internal.manager.MetamodelManagerInternal;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
import org.eclipse.ocl.pivot.internal.manager.PivotExecutorManager;
import org.eclipse.ocl.pivot.internal.resource.EnvironmentFactoryAdapter;
import org.eclipse.ocl.pivot.internal.resource.OCLAdapter;
import org.eclipse.ocl.pivot.internal.scoping.Attribution;
import org.eclipse.ocl.pivot.internal.scoping.NullAttribution;
import org.eclipse.ocl.pivot.library.LibraryFeature;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.EnvironmentFactory;
import org.eclipse.ocl.pivot.utilities.PivotConstants;
import org.eclipse.ocl.pivot.utilities.Pivotable;

public class PivotUtilInternal //extends PivotUtil
{	
	private static final Logger logger = Logger.getLogger(PivotUtilInternal.class);
	public static boolean noDebug = true;
	private static long startTime = System.currentTimeMillis();
	
	public static void debugPrintln(@Nullable Object string) {
		if (!noDebug) {
			System.out.printf("%6.3f [%s] %s\n", 0.001 * (System.currentTimeMillis() - startTime), Thread.currentThread().getName(), String.valueOf(string));
		}		
	}
	
	public static void debugReset() {
		startTime = System.currentTimeMillis();
		if (!noDebug) {
			System.out.println("");
		}		
	}

	public static @Nullable EnvironmentFactoryInternal findEnvironmentFactory(@Nullable EObject eObject) {
		if (eObject == null) {
			return null;
		}
		EObject eRoot = EcoreUtil.getRootContainer(eObject);
		if (eRoot == null) {
			return null;
		}
		Resource eResource = eRoot.eResource();
		if (eResource == null) {
			return null;
		}
		return findEnvironmentFactory(eResource);
	}

	public static @Nullable EnvironmentFactoryInternal findEnvironmentFactory(@NonNull Resource resource) {
		for (Adapter adapter : resource.eAdapters()) {
			if (adapter instanceof EnvironmentFactoryAdapter) {
				return ((EnvironmentFactoryAdapter)adapter).getEnvironmentFactory();
			}
		}
		ResourceSet resourceSet = resource.getResourceSet();
		if (resourceSet == null) {
			return null;
		}
		return findEnvironmentFactory(resourceSet);
	}

	public static @Nullable EnvironmentFactoryInternal findEnvironmentFactory(@NonNull ResourceSet resourceSet) {
		for (Adapter adapter : resourceSet.eAdapters()) {
			if (adapter instanceof EnvironmentFactoryAdapter) {
				return ((EnvironmentFactoryAdapter)adapter).getEnvironmentFactory();
			}
			else if (adapter instanceof PivotMetamodelManager) {
				return ((PivotMetamodelManager)adapter).getEnvironmentFactory();
			}
		}
		return null;
	}

	public static @Nullable PivotMetamodelManager findMetamodelManager(@NonNull Resource resource) {
		EnvironmentFactoryInternal environmentFactory = findEnvironmentFactory(resource);
		if (environmentFactory == null) {
			return null;
		}
		return environmentFactory.getMetamodelManager();
	}

	public static Type findTypeOf(@NonNull MetamodelManagerInternal metamodelManager, @NonNull EClassifier eClass) {
		Resource resource = eClass.eResource();
		if (resource != null) {
			External2AS adapter = Ecore2AS.findAdapter(resource, metamodelManager.getEnvironmentFactory());
			if (adapter != null) {
				Type type = adapter.getCreated(Type.class, eClass);
				if (type != null) {
					return type;
				}
			}
		}
		return null;
	}

	@SuppressWarnings("null")
	public static @NonNull URI getASURI(@NonNull URI uri) {
		if (uri.fragment() != null) {
			logger.error("Unexpected fragment ignored for '" + uri.toString() + "'");
			uri = uri.trimFragment();
		}
		URI asURI = uri.appendFileExtension(PivotConstants.OCL_AS_FILE_EXTENSION);
		if (!isASURI(asURI)) {
			asURI = uri.appendSegment(PivotConstants.DOT_OCL_AS_FILE_EXTENSION);
		}
		assert isASURI(asURI);
		return asURI;
	}

	public static @NonNull Attribution getAttribution(@NonNull EObject eObject) {
		if (eObject.eIsProxy()) {			// Shouldn't happen, but certainly does during development
			logger.warn("getAttribution for proxy " + eObject);
			return NullAttribution.INSTANCE;
		}
		else {
			EClass eClass = eObject.eClass();
			Attribution attribution = Attribution.REGISTRY.get(eClass);
			if (attribution == null) {
				for (EClass superClass = eClass; superClass.getESuperTypes().size() > 0;) {
					superClass = superClass.getESuperTypes().get(0);
					attribution = Attribution.REGISTRY.get(superClass);
					if (attribution != null) {
						break;
					}
				}
				if (attribution == null) {
					attribution = NullAttribution.INSTANCE;
				}
				Attribution.REGISTRY.put(eClass, attribution);
			}
			return attribution;
		}
	}

	@Deprecated // Use getType
	public static @NonNull Type getBehavioralType(@NonNull Type type) {		// FIXME fold this into normal code
		if (type instanceof DataType) {
			DataType dataType = (DataType)type;
			Type behavioralType = dataType.getBehavioralClass();
			if (behavioralType != null) {
				return behavioralType;
			}
		}
		return type;
	}

	@Deprecated // Use getType
	public static @NonNull Type getBehavioralType(@NonNull TypedElement element) {
		return PivotUtilInternal.getBehavioralType(ClassUtil.nonNullState(element.getType()));
	}

	/**
	 * Trim a surrounding "result=(...)" to convert a UML BodyCondition to an OCL BodyExpression.
	 */
	@SuppressWarnings("null")
	public static @NonNull String getBodyExpression(@NonNull String umlBody) {
		String s = umlBody.trim();
		if (s.startsWith(PivotConstants.RESULT_NAME)) {
			s = s.substring(6).trim();
			if (s.startsWith("=")) {
				s = s.substring(1).trim();
				if (s.startsWith("(") && s.endsWith(")")) {
					s = s.substring(1, s.length()-1); //.trim();
				}
				return s;
			}
		}
		return umlBody;
	}

	public static @NonNull EnvironmentFactoryInternal getEnvironmentFactory(@NonNull Resource resource) {
		EnvironmentFactoryInternal environmentFactory = PivotUtilInternal.findEnvironmentFactory(resource);
		if (environmentFactory == null) {
			ResourceSet resourceSet = resource.getResourceSet();
			if (resourceSet != null) {
				environmentFactory = OCLAdapter.createEnvironmentFactory(resourceSet);
			}
			else {
				environmentFactory = OCLAdapter.createEnvironmentFactory(resource);
			}
		}
		return environmentFactory;
	}

	public static @NonNull Evaluator getEvaluator(@NonNull EObject eObject) {
		Resource asResource = eObject.eResource();
		if (asResource != null) {
			EnvironmentFactory environmentFactory = findEnvironmentFactory(asResource);
			if (environmentFactory != null) {
				return new PivotExecutorManager(environmentFactory, eObject);
			}
		}
		return new EcoreExecutorManager(eObject, PivotTables.LIBRARY);
	}

	public static @Nullable LibraryFeature getImplementation(@NonNull Operation localOperation) {
		LibraryFeature libraryFeature = localOperation.getImplementation();
		if (libraryFeature != null) {
			return libraryFeature;
		}
		String implementationClassName = localOperation.getImplementationClass();
		if (implementationClassName != null) {
			ClassLoader classLoader = localOperation.getClass().getClassLoader();
			if (classLoader != null) {
				try {
					Class<?> theClass = classLoader.loadClass(implementationClassName);
					if (theClass != null) {
						Field field = theClass.getField("INSTANCE");
						return (LibraryFeature) field.get(null);
					}
				} catch (Exception e) {
				}
			}
		}
		return null;
	}

	@SuppressWarnings("null")
	public static @NonNull URI getNonASURI(@NonNull URI uri) {
		assert isASURI(uri);
		return uri.trimFileExtension();
	}

	public static @NonNull <T extends Element> T getNonNullAst(@NonNull Class<T> pivotClass, @NonNull Pivotable pivotableElement) {
//		if (pivotableElement == null) {
//			return null;
//		}
		Element pivotElement = pivotableElement.getPivot();
		if (pivotElement == null) {
			throw new IllegalStateException("Null pivotElementfor a " + pivotClass.getName());
		}
		if (!pivotClass.isAssignableFrom(pivotElement.getClass())) {
			throw new ClassCastException(pivotElement.getClass().getName() + " is not assignable to " + pivotClass.getName());
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) pivotElement;
		return castElement;
	}

	/**
	 * Return a URI based on the nsURI of the immediate parent package.
	 */
	public static String getNsURI(@NonNull EModelElement element) {
		if (element instanceof EPackage) {
			String nsURI = ((EPackage)element).getNsURI();
			if (nsURI != null) {
				return nsURI;
			}
		}
		StringBuilder s = new StringBuilder();
		getNsURI(s, element);
		return s.toString();
	}

	/**
	 * Return a URI based on the nsURI of the immediate parent package.
	 */
	public static String getNsURI(@NonNull Element element) {
		if (element instanceof org.eclipse.ocl.pivot.Package) {
			String nsURI = ((org.eclipse.ocl.pivot.Package)element).getURI();
			if (nsURI != null) {
				return nsURI;
			}
		}
		StringBuilder s = new StringBuilder();
		s.append("u_r_i:");
		getNsURI(s, element);
		return s.toString();
	}

	private static void getNsURI(@NonNull StringBuilder s, @NonNull EObject element) {
		if (element instanceof org.eclipse.ocl.pivot.Package) {
			String nsURI = ((org.eclipse.ocl.pivot.Package)element).getURI();
			if (nsURI != null) {
				s.append(nsURI);
				return;
			}
		}
		else if (element instanceof Model) {
			String nsURI = ((Model)element).getExternalURI();
			if (nsURI != null) {
				s.append(nsURI);
				return;
			}
		}
		else if (element instanceof EPackage) {
			String nsURI = ((EPackage)element).getNsURI();
			if (nsURI != null) {
				s.append(nsURI);
				return;
			}
		}
		EObject eContainer = element.eContainer();
		if ((eContainer instanceof org.eclipse.ocl.pivot.Package) || (eContainer instanceof Model)) {
			String nsURI = ((org.eclipse.ocl.pivot.Package)element).getURI();
			if (nsURI != null) {
				s.append(nsURI);
				s.append("#/");
			}
			else {
				@SuppressWarnings("null")
				@NonNull EObject eContainer2 = eContainer;
				getNsURI(s, eContainer2);
			}
		}
		else if (eContainer instanceof EPackage) {
			String nsURI = ((EPackage)element).getNsURI();
			if (nsURI != null) {
				s.append(nsURI);
				s.append("#/");
			}
			else {
				getNsURI(s, eContainer);
			}
		}
		else if (eContainer == null) {
			String name = null;
			if (element instanceof org.eclipse.ocl.pivot.Package) {
				name = ((org.eclipse.ocl.pivot.Package)element).getName();
			}
			else if (element instanceof EPackage) {
				name = ((EPackage)element).getName();
			}
			if (name == null) {
				name = "$null$";
			}
			s.append(name);
			return;
		}
		else {
			getNsURI(s, eContainer);
		}
		EReference eFeature = element.eContainmentFeature();
		s.append("@");
		s.append(eFeature.getName());
		if (eFeature.isMany()) {
			int index = ((List<?>) eContainer.eGet(element.eContainingFeature())).indexOf(element);
			s.append(".");
			s.append(index);
		}
	}

	public static String getSpecificationRole(@NonNull LanguageExpression specification) {
		EReference eContainmentFeature = specification.eContainmentFeature();
		if (eContainmentFeature == PivotPackage.Literals.NAMESPACE__OWNED_CONSTRAINTS) {
			return PivotConstantsInternal.OWNED_CONSTRAINT_ROLE;
		}
		else if (eContainmentFeature == PivotPackage.Literals.PROPERTY__OWNED_EXPRESSION) {
			return PivotConstantsInternal.DEFAULT_EXPRESSION_ROLE;
		}
		else if (eContainmentFeature == PivotPackage.Literals.OPERATION__BODY_EXPRESSION) {
			return PivotConstantsInternal.BODY_EXPRESSION_ROLE;
		}
		else if (eContainmentFeature == PivotPackage.Literals.OPERATION__OWNED_PRECONDITIONS) {
			return PivotConstantsInternal.PRECONDITION_ROLE;
		}
		else if (eContainmentFeature == PivotPackage.Literals.OPERATION__OWNED_POSTCONDITIONS) {
			return PivotConstantsInternal.POSTCONDITION_ROLE;
		}
		else {
			return PivotConstantsInternal.UNKNOWN_ROLE;
		}
	}

	public static String getStereotype(@NonNull Constraint object) {
		EStructuralFeature eContainingFeature = object.eContainingFeature();
		if (eContainingFeature == PivotPackage.Literals.CLASS__OWNED_INVARIANTS) {
			return PivotConstants.INVARIANT_NAME;
		}
		else if (eContainingFeature == PivotPackage.Literals.OPERATION__BODY_EXPRESSION) {
			return PivotConstants.BODY_NAME;
		}
		else if (eContainingFeature == PivotPackage.Literals.OPERATION__OWNED_POSTCONDITIONS) {
			return PivotConstants.POSTCONDITION_NAME;
		}
		else if (eContainingFeature == PivotPackage.Literals.OPERATION__OWNED_PRECONDITIONS) {
			return PivotConstants.PRECONDITION_NAME;
		}
		else if (eContainingFeature == PivotPackage.Literals.PROPERTY__OWNED_EXPRESSION) {
			return PivotConstants.DERIVATION_NAME;
		}
		return "";
	}

	public static @Nullable Type getType(@Nullable TypedElement typedElement) {
		if (typedElement == null) {
			return null;
		}
		Type type = typedElement.getType();
		if (type == null) {
			return null;
		}
		type = getType(type);
		if (type instanceof SelfType) {
			if (typedElement instanceof Parameter) {
				Operation operation = ((Parameter)typedElement).getOwningOperation();
				if (operation != null) {
					org.eclipse.ocl.pivot.Class selfType = operation.getOwningClass();
					if (selfType != null) {
						type = selfType;
					}
				}
			}
		}
		return type;
	}

	public static @NonNull Type getType(@NonNull Type type) {
		if (type instanceof LambdaType) {
			Type resultType = ((LambdaType)type).getResultType();
			if (resultType != null) {
				type = resultType;
			}
		}
		else if (type instanceof DataType) {
			Type behavioralType = ((DataType)type).getBehavioralClass();
			if (behavioralType != null) {
				type = behavioralType;
			}
		}
		return type;
	}

	public static boolean isASURI(@Nullable String uri) {
		return (uri != null) && uri.endsWith("as");
	}

	public static boolean isASURI(@Nullable URI uri) {
		return (uri != null) && isASURI(uri.toString());
	}

	/**
	 * Return true if the sole purpose of asPackage is to host implicit opposite properties.
	 */
	public static boolean isImplicitPackage(@NonNull org.eclipse.ocl.pivot.Package asPackage) {
		boolean hasImplicits = false;
		if (!asPackage.getOwnedAnnotations().isEmpty()) {
			return false;
		}
		if (!asPackage.getOwnedComments().isEmpty()) {
			return false;
		}
		if (!asPackage.getOwnedConstraints().isEmpty()) {
			return false;
		}
		if (!asPackage.getOwnedExtensions().isEmpty()) {
			return false;
		}
		if (!asPackage.getOwnedInstances().isEmpty()) {
			return false;
		}
		if (!asPackage.getOwnedPackages().isEmpty()) {
			return false;
		}
		for (org.eclipse.ocl.pivot.Class asClass : asPackage.getOwnedClasses()) {
			if (!asClass.getOwnedAnnotations().isEmpty()) {
				return false;
			}
			if (!asClass.getOwnedBehaviors().isEmpty()) {
				return false;
			}
			if (!asClass.getOwnedBindings().isEmpty()) {
				return false;
			}
			if (!asClass.getOwnedComments().isEmpty()) {
				return false;
			}
			if (!asClass.getOwnedConstraints().isEmpty()) {
				return false;
			}
			if (!asClass.getOwnedExtensions().isEmpty()) {
				return false;
			}
			if (!asClass.getOwnedInvariants().isEmpty()) {
				return false;
			}
			if (!asClass.getOwnedOperations().isEmpty()) {
				return false;
			}
			for (Property asProperty : asClass.getOwnedProperties()) {
				if (!asProperty.isIsImplicit()) {
					return false;
				}
				hasImplicits = true;
			}
		}
		return hasImplicits;
	}

	public static boolean isLibraryType(@NonNull Type type) {	// FIXME org.eclipse.ocl.pivot.Class
		if (type instanceof LambdaType) {
			return false;
		}
		else if (type instanceof TupleType) {
			return false;			
		}
		else if (type instanceof TemplateableElement){
			return ((TemplateableElement)type).getOwnedBindings().isEmpty();			
		}
		else {
			return false;
		}
	}
	
	public static boolean isValidIdentifier(@Nullable String value) {
		if (value == null) {
			return false;
		}
		int iMax = value.length();
		for (int i = 0; i < iMax; i++) {
			char c = value.charAt(i);
			if (('A' <= c) && (c <= 'Z')) {					
			}
			else if (('a' <= c) && (c <= 'z')) {					
			}
			else if (c == '_') {					
			}
			else if (('0' <= c) && (c <= '9') && (i > 0)) {					
			}
			else {
				return false;
			}
		}
		return true;
	}

	public static <T extends EObject> void refreshList(@Nullable List<? super T> oldElements, @Nullable List<? extends T> newElements) {
		if (oldElements == null) {
			return;			// Never happens but avoids need for null validation in caller
		}
		if (newElements == null) {
			if (oldElements.size() > 0) {
				oldElements.clear();
			}
			return;
		}
		for (int k = newElements.size(); k-- > 0; ) {
			T newElement = newElements.get(k);
			if (newElement.eIsProxy()) {
				oldElements.remove(newElement);			// Lose oldContent before adding possible 'duplicates'
			}
		}
		for (int k = oldElements.size(); k-- > 0; ) {
			Object oldElement = oldElements.get(k);
			if (!newElements.contains(oldElement)) {
				oldElements.remove(k);			// Lose oldContent before adding possible 'duplicates'
			}
		}
		int newMax = newElements.size();
		for (int i = 0; i < newMax; i++) {					// Invariant: lists are equal up to index i
			T newElement = newElements.get(i);
			int oldMax = oldElements.size();
			boolean reused = false;;
			for (int j = i; j < oldMax; j++) {
				Object oldElement = oldElements.get(j);
				if (oldElement == newElement) {
					if (j != i) {
						oldElements.remove(j);
						oldElements.add(i, newElement);
					}
					reused = true;
					break;
				}
			}
			if (!reused) {
				if (i < oldMax) {
					oldElements.add(i, newElement);
				}
				else {
					oldElements.add(newElement);
				}
			}
			assert newElements.get(i) == oldElements.get(i);
		}
		for (int k = oldElements.size(); k > newMax; ) {
			oldElements.remove(--k);
		}
		assert newElements.size() == oldElements.size();
	}

	public static <T extends EObject> void refreshSet(@Nullable List<? super T> oldElements, @Nullable Collection<? extends T> newElements) {
		if (oldElements == null) {
			return;			// Never happens but avoids need for null validation in caller
		}
		if (newElements == null) {
			oldElements.clear();
			return;
		}
		for (int i = oldElements.size(); i-- > 0;) {	// Remove any oldElements not in newElements
			Object oldElement = oldElements.get(i);
			if (!newElements.contains(oldElement)) {
				oldElements.remove(i);
			}
		}
		for (T newElement : newElements) {				// Add any newElements not in oldElements
			if (!newElement.eIsProxy() && !oldElements.contains(newElement)) {
				oldElements.add(newElement);
			}
		}
	}

	/**
	 * Detach object from its container so that a child-stealing detection is avoided when attaching to a new container.
	 */
	public static void resetContainer(@NonNull EObject eObject) {
		EStructuralFeature eContainingFeature = eObject.eContainingFeature();
		if (eContainingFeature != null) {
			EObject eContainer = eObject.eContainer();
			if (eContainer != null) {
				if (!eContainingFeature.isMany()) {
					eContainer.eSet(eContainingFeature, null);
				}
				else {
					Object objects = eContainer.eGet(eContainingFeature);
					if (objects instanceof List<?>) {
						((List<?>)objects).remove(eObject);
					}
				}
			}
		}
	}
}
