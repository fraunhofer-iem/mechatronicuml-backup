/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - initial API and implementation
 *   E.D.Willink (CEA List) - Bug 424057 - UML 2.5 CG *******************************************************************************/
package org.eclipse.ocl.pivot.internal.ecore.es2as;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIException;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.Import;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.NamedElement;
import org.eclipse.ocl.pivot.Namespace;
import org.eclipse.ocl.pivot.PivotFactory;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.internal.ecore.Ecore2Moniker;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
import org.eclipse.ocl.pivot.internal.resource.StandaloneProjectMap;
import org.eclipse.ocl.pivot.internal.utilities.AliasAdapter;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.internal.utilities.External2AS;
import org.eclipse.ocl.pivot.internal.utilities.PivotObjectImpl;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.LibraryConstants;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.pivot.resource.ProjectManager;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.NameUtil;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.ocl.pivot.utilities.PivotConstants;
import org.eclipse.ocl.pivot.utilities.PivotUtil;

public class Ecore2AS extends AbstractExternal2AS
{
	public static Ecore2AS getAdapter(@NonNull Resource resource, @NonNull EnvironmentFactoryInternal environmentFactory) {
		External2AS adapter = findAdapter(resource, environmentFactory);
		Ecore2AS castAdapter = (Ecore2AS) adapter;
		if (castAdapter == null) {
			castAdapter = new Ecore2AS(resource, environmentFactory);
		}
		return castAdapter;
	}

	/**
	 * Convert an (annotated) Ecore resource to a Pivot Model.
	 * @param alias 
	 * 
	 * @param ecoreResource the annotated Ecore resource
	 * 
	 * @return the Pivot root package
	 */
	public static @NonNull Model importFromEcore(@NonNull EnvironmentFactoryInternal environmentFactory, String alias, @NonNull Resource ecoreResource) {
		Ecore2AS conversion = getAdapter(ecoreResource, environmentFactory);
		return conversion.getASModel();
	}

	public static boolean isEcore(@NonNull Resource resource) {
		List<EObject> contents = resource.getContents();
		for (EObject content : contents) {
			if (content instanceof EPackage) {
				return true;
			}
		}
		return false;
	}

	public static boolean isNullFree(@NonNull ETypedElement eObject) {
		boolean isNullFree = false;
		EAnnotation eAnnotation = eObject.getEAnnotation(PivotConstants.COLLECTION_ANNOTATION_SOURCE);
		if (eAnnotation != null) {
			isNullFree = Boolean.valueOf(eAnnotation.getDetails().get(PivotConstants.COLLECTION_IS_NULL_FREE));
		}
		return isNullFree;
	}

	public static Ecore2AS loadFromEcore(@NonNull ASResource ecoreASResource, @NonNull URI ecoreURI) {
		EnvironmentFactoryInternal environmentFactory = PivotUtilInternal.getEnvironmentFactory(ecoreASResource);
		ResourceSet resourceSet = environmentFactory.getResourceSet();
		Resource ecoreResource = resourceSet.getResource(ecoreURI, true);
		if (ecoreResource == null) {
			return null;
		}
		Ecore2AS conversion = getAdapter(ecoreResource, environmentFactory);
		conversion.loadImports(ecoreResource);
//		if (asMetamodels != null) {
//			
//		}
		PivotMetamodelManager metamodelManager = environmentFactory.getMetamodelManager();
		conversion.pivotModel = PivotUtil.createModel(ecoreASResource.getURI().toString());
//		conversion.installImports();
		conversion.update(ecoreASResource, ClassUtil.nonNullEMF(ecoreResource.getContents()));
		
		AliasAdapter ecoreAdapter = AliasAdapter.findAdapter(ecoreResource);
		if (ecoreAdapter != null) {
			Map<EObject, String> ecoreAliasMap = ecoreAdapter.getAliasMap();
			AliasAdapter pivotAdapter = AliasAdapter.getAdapter(ecoreASResource);
			Map<EObject, String> pivotAliasMap = pivotAdapter.getAliasMap();
			for (EObject eObject : ecoreAliasMap.keySet()) {
				String alias = ecoreAliasMap.get(eObject);
				Element element = conversion.newCreateMap.get(eObject);
				pivotAliasMap.put(element, alias);
			}
		}
		metamodelManager.installResource(ecoreASResource);
		conversion.installImports();
		return conversion;
	}

/*	public static Ecore2AS createConverter(MetamodelManager metamodelManager, Resource ecoreResource) {
		EList<Adapter> eAdapters = ecoreResource.eAdapters();
		Ecore2AS conversion = (Ecore2AS) EcoreUtil.getAdapter(eAdapters, Ecore2AS.class);
		if (conversion == null) {
			conversion = new Ecore2AS(metamodelManager);
			eAdapters.add(conversion);
		}
		return conversion;
	} */

	/**
	 * Convert an (annotated) Ecore object to a pivot element. 
	 * 
	 * @param eObject the annotated Ecore object
	 * 
	 * @return the pivot element
	 */
	public static Element importFromEcore(@NonNull EnvironmentFactoryInternal environmentFactory, String alias, @NonNull EObject eObject) {
		Resource ecoreResource = ClassUtil.nonNullEMF(eObject.eResource());
		Ecore2AS conversion = getAdapter(ecoreResource, environmentFactory);
		@SuppressWarnings("unused")
		Model pivotModel = conversion.getASModel();
		return conversion.newCreateMap.get(eObject);
	}

	/**
	 * Mapping of source Ecore objects to their resulting pivot element in a previous conversion.
	 */
	private Map<String, Element> oldIdMap = null;

	/**
	 * Mapping of source Ecore objects to their resulting pivot element in the current conversion.
	 */
	private Map<EObject, Element> newCreateMap = null;

	/**
	 * Set of all Ecore objects requiring further work during the reference pass.
	 */
	private Set<EObject> referencers = null;
	
	/**
	 * Set of all converters used during session.
	 */
	private Set<Ecore2AS> allConverters = new HashSet<Ecore2AS>();
	
	/**
	 * List of all generic types.
	 */
	private List<EGenericType> genericTypes = null;
	
	private List<Resource.Diagnostic> errors = null;
	
	protected final @NonNull Resource ecoreResource;
	
	protected Model pivotModel = null;						// Set by importResource
	protected final Ecore2ASDeclarationSwitch declarationPass = new Ecore2ASDeclarationSwitch(this);	
	protected final Ecore2ASReferenceSwitch referencePass = new Ecore2ASReferenceSwitch(this);
	private HashMap<EClassifier, Type> ecore2asMap = null;
	private URI ecoreURI = null;
	
	/**
	 * All imported EPackages identified by AS_METAMODEL_ANNOTATION_SOURCE annotations.
	 */
	private Set<EPackage> asMetamodels = null;

	/**
	 * All imported EObjects identified as IMPORT_ANNOTATION_SOURCE annotations.
	 */
	private Set<EObject> importedEObjects = null;
	
	public Ecore2AS(@NonNull Resource ecoreResource, @NonNull EnvironmentFactoryInternal environmentFactory) {
		super(environmentFactory);
		this.ecoreResource = ecoreResource;
		this.environmentFactory.addExternal2AS(this);
	}
	
	protected void addCreated(EObject eObject, Element pivotElement) {
		@SuppressWarnings("unused")
		Element oldElement = newCreateMap.put(eObject, pivotElement);
//		if (eObject instanceof ENamedElement) {
//			assert (oldElement == null) || (oldElement == pivotElement) || ((oldElement instanceof DataType) && (((DataType)oldElement).getBehavioralType() == pivotElement));
//		}
//		else {
//			assert oldElement == null;
//		}
	}

	@Override
	public void addGenericType(@NonNull EGenericType eObject) {
		genericTypes.add(eObject);
	}
	
	@Override
	public void addMapping(@NonNull EObject eObject, @NonNull Element pivotElement) {
		if (pivotElement instanceof PivotObjectImpl) {
			((PivotObjectImpl)pivotElement).setESObject(eObject);
		}
		Element pivotElement1 = pivotElement;
		if (eObject instanceof EDataType) {
			Type pivotType = getEcore2ASMap().get(eObject);
			if (pivotType != null) {  		// If eObject is a known synonym such as EString
				pivotElement1 = pivotType;	// remap to the library type
			}
		}
//		Element pivotElement2 = pivotElement;
//		if (pivotElement instanceof DataType) {
//			Type behavioralType = ((DataType)pivotElement).getBehavioralType();
//			if (behavioralType != null) {
//				pivotElement2 = behavioralType;
//			}
//		}
//		assert pivotElement1 == pivotElement2;
		addCreated(eObject, pivotElement1);
	}

	@Override
	protected Model basicGetPivotModel() {
		return pivotModel;
	}

	protected @NonNull URI createPivotURI() {
		URI uri = ecoreResource.getURI();
		if (uri == null) {
			throw new IllegalStateException("Missing resource URI");
		}
		return PivotUtilInternal.getASURI(uri);
	}

	@Override
	public void error(@Nullable String message) {
		if (errors == null) {
			errors = new ArrayList<Resource.Diagnostic>();
		}
		errors.add(new XMIException(message));
	}

	public <T extends Element> T getASElement(@NonNull Class<T> requiredClass, @NonNull EObject eObject) {
		if (pivotModel == null) {
			getASModel();
		}
		Element element = newCreateMap.get(eObject);
		if (element == null) {
			Resource resource = eObject.eResource();
			if ((resource != ecoreResource) && (resource != null)) {
				Ecore2AS converter = getAdapter(resource, environmentFactory);
				if (allConverters.add(converter)) {
					converter.getASModel();
					for (Map.Entry<EObject, Element> entry : converter.newCreateMap.entrySet()) {
						newCreateMap.put(entry.getKey(), entry.getValue());
					}
				}
			}
			element = newCreateMap.get(eObject);
		}
		if (element == null) {
			error("Unresolved " + eObject);
		}
		else if (!requiredClass.isAssignableFrom(element.getClass())) {
			throw new ClassCastException(element.getClass().getName() + " is not assignable to " + requiredClass.getName());
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) element;
		return castElement;
	}

	@Override
	public @NonNull Model getASModel() {
		Model pivotModel2 = pivotModel;
		if (pivotModel2 == null) {
			loadImports(ecoreResource);
			pivotModel2 = pivotModel = importObjects(ClassUtil.nonNullEMF(ecoreResource.getContents()), createPivotURI());
			@SuppressWarnings("null") @NonNull Resource asResource = pivotModel2.eResource();
			AliasAdapter ecoreAdapter = AliasAdapter.findAdapter(ecoreResource);
			if (ecoreAdapter != null) {
				Map<EObject, String> ecoreAliasMap = ecoreAdapter.getAliasMap();
				AliasAdapter pivotAdapter = AliasAdapter.getAdapter(asResource);
				Map<EObject, String> pivotAliasMap = pivotAdapter.getAliasMap();
				for (EObject eObject : ecoreAliasMap.keySet()) {
					String alias = ecoreAliasMap.get(eObject);
					Element element = newCreateMap.get(eObject);
					pivotAliasMap.put(element, alias);
				}
			}
			metamodelManager.installResource(asResource);
			installImports();
		}
		return pivotModel2;
	}

	public @Nullable <T extends Element> T getASOfEcore(@NonNull Class<T> requiredClass, @NonNull EObject eObject) {
		if (pivotModel == null) {
			getASModel();
		}
		Element element = newCreateMap.get(eObject);
		if (element == null) {
			return null;
		}
		if (!requiredClass.isAssignableFrom(element.getClass())) {
			throw new ClassCastException(element.getClass().getName() + " is not assignable to " + requiredClass.getName());
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) element;
		return castElement;
	}

	public Type getASType(@NonNull EObject eObject) {
			Element pivotElement = newCreateMap.get(eObject);
			if (pivotElement == null) {
				Resource resource = eObject.eResource();
				if ((resource != ecoreResource) && (resource != null)) {
					Ecore2AS converter = getAdapter(resource, environmentFactory);
					if (allConverters.add(converter)) {
						converter.getASModel();
	//					allEClassifiers.addAll(converter.allEClassifiers);
	//					allNames.addAll(converter.allNames);
						for (Map.Entry<EObject, Element> entry : converter.newCreateMap.entrySet()) {
							newCreateMap.put(entry.getKey(), entry.getValue());
						}
					}
				}
				pivotElement = newCreateMap.get(eObject);
			}
			if (pivotElement == null) {
				error("Unresolved " + eObject);
			}
			else if (!(pivotElement instanceof Type)) {
				error("Incompatible " + eObject);
			}
			else {
				return (Type) pivotElement;
			}
			return null;
		}

	/**
	 * Return the baseURI of ecoreResource against which its imports should be resolved.
	 */
	protected @Nullable URI getBaseURI(@NonNull Resource ecoreResource) {
		URI ecoreURI = ecoreResource.getURI();
		if (ecoreURI == null) {
			return null;
		}
		if (ClassUtil.isRegistered(ecoreResource)) {
			ProjectManager projectManager = environmentFactory.getProjectManager();
			StandaloneProjectMap.IPackageDescriptor packageDescriptor = projectManager.getPackageDescriptor(ecoreURI);
			if (packageDescriptor == null) {
				return null;
			}
			return packageDescriptor.getResourceDescriptor().getPlatformPluginURI();
		}
		else {
			if (!ecoreURI.isHierarchical() || ecoreURI.isRelative()) {
				return null;
			}
			return ecoreURI;
		}
	}

	public @Nullable Element getCreated(@NonNull EObject eObject) {
		return newCreateMap.get(eObject);
	}

	@Override
	public @Nullable <T extends Element> T getCreated(@NonNull Class<T> requiredClass, @NonNull EObject eObject) {
		return getASOfEcore(requiredClass, eObject);
	}

	@Override
	public @Nullable Map<EObject, Element> getCreatedMap() {
		return newCreateMap;
	}

	public @NonNull Map<EClassifier, Type> getEcore2ASMap() {
		HashMap<EClassifier, Type> ecore2asMap2 = ecore2asMap;
		if (ecore2asMap2 == null) {
			ecore2asMap2 = ecore2asMap = new HashMap<EClassifier, Type>();
			initializeEcore2ASMap();
		}
		return ecore2asMap2;
	}

	public @Nullable Resource getEcoreResource() {
		return ecoreResource;
	}

	@Override
	public @Nullable Resource getResource() {
		return ecoreResource;
	}

	@Override
	public @NonNull URI getURI() {
		return ClassUtil.nonNullEMF(ecoreResource.getURI());
	}

	public @NonNull Model importObjects(@NonNull Collection<EObject> ecoreContents, @NonNull URI pivotURI) {
		EPackage libraryEPackage = isLibrary(ecoreContents);
		if (libraryEPackage != null) {
			newCreateMap = new HashMap<EObject, Element>();
			org.eclipse.ocl.pivot.Package asLibrary = standardLibrary.getPackage();
			newCreateMap.put(libraryEPackage, asLibrary);
			List<org.eclipse.ocl.pivot.Class> ownedType = asLibrary.getOwnedClasses();
//			int prefix = LibraryConstants.ECORE_STDLIB_PREFIX.length();
			for (@SuppressWarnings("null")@NonNull EClassifier eClassifier : libraryEPackage.getEClassifiers()) {
				String name = environmentFactory.getTechnology().getOriginalName(eClassifier); //.substring(prefix);
				Type asType = NameUtil.getNameable(ownedType, name);
				newCreateMap.put(eClassifier, asType);
			}
			Model containingRoot = PivotUtil.getContainingModel(asLibrary);
			return ClassUtil.nonNullModel(containingRoot);
		}
		@NonNull ASResource asResource = metamodelManager.getResource(pivotURI, ASResource.ECORE_CONTENT_TYPE);
//		try {
			if ((metamodelManager.getLibraryResource() == null) && isPivot(ecoreContents)) {
				String nsURI = ((EPackage)ecoreContents.iterator().next()).getNsURI();
				if (nsURI != null) {
					String stdlibASUri = LibraryConstants.STDLIB_URI + PivotConstants.DOT_OCL_AS_FILE_EXTENSION;
					OCLstdlib library = OCLstdlib.create(stdlibASUri);
					metamodelManager.installResource(library);
//					metamodelManager.installAs(nsURI, OCLstdlibTables.PACKAGE);
				}
			}
			URI uri = ecoreURI != null ? ecoreURI : ecoreResource.getURI();
			Model pivotModel2 = null;
			if (asResource.getContents().size() > 0) { 
				EObject eObject = asResource.getContents().get(0);
				if (eObject instanceof Model) {
					pivotModel2 = (Model) eObject;
				}
			}
			if (pivotModel2 == null) {
				pivotModel2 = pivotModel = PivotUtil.createModel(uri.toString());
			}
			pivotModel = pivotModel2;
//			installImports();
			update(asResource, ecoreContents);
//		}
//		catch (Exception e) {
//			if (errors == null) {
//				errors = new ArrayList<Resource.Diagnostic>();
//			}
//			errors.add(new XMIException("Failed to load '" + pivotURI + "'", e));
//		}
		if (errors != null) {
			asResource.getErrors().addAll(errors);
		}
		return pivotModel2;
	}

	public void initializeEcore2ASMap() {
		ecore2asMap.put(EcorePackage.Literals.EBOOLEAN, standardLibrary.getBooleanType());
		ecore2asMap.put(EcorePackage.Literals.EBIG_INTEGER, standardLibrary.getIntegerType());
		ecore2asMap.put(EcorePackage.Literals.EBIG_DECIMAL, standardLibrary.getRealType());
		ecore2asMap.put(EcorePackage.Literals.ESTRING, standardLibrary.getStringType());
	}

	protected void installImports() {
		URI baseURI = getBaseURI(ecoreResource);
		List<Import> allImports = pivotModel.getOwnedImports();
		for (EObject eContent : ecoreResource.getContents()) {
			if (eContent instanceof EModelElement) {
				EAnnotation importAnnotation = ((EModelElement)eContent).getEAnnotation(PivotConstants.IMPORT_ANNOTATION_SOURCE);
				if (importAnnotation != null) {
					EMap<String, String> details = importAnnotation.getDetails();
					for (String key : details.keySet()) {
						URI uri = URI.createURI(details.get(key));
						if (baseURI != null) {
							uri = uri.resolve(baseURI);
						}
						try {
							assert uri != null;
							Element importedObject = metamodelManager.loadResource(uri, null, ecoreResource.getResourceSet());
							if (importedObject instanceof Namespace) {
								Import anImport = PivotFactory.eINSTANCE.createImport();
								anImport.setName(key);
								anImport.setImportedNamespace((Namespace) importedObject);
								allImports.add(anImport);
							}
						} catch (ParserException e) {
							error(e.getMessage());
						}
					}
				}
			}
		}
	}

	protected EPackage isLibrary(@NonNull Collection<EObject> ecoreContents) {
		if (ecoreContents.size() != 1) {
			return null;
		}
		EObject ecoreRoot = ecoreContents.iterator().next();
		if (!(ecoreRoot instanceof EPackage)) {
			return null;
		}
		EPackage ecorePackage = (EPackage) ecoreRoot;
		EAnnotation asLibraryAnnotation = ecorePackage.getEAnnotation(PivotConstants.AS_LIBRARY_ANNOTATION_SOURCE);
		return asLibraryAnnotation != null ? ecorePackage : null;
	}

	protected boolean isPivot(@NonNull Collection<EObject> ecoreContents) {
		if (ecoreContents.size() != 1) {
			return false;
		}
		EObject ecoreRoot = ecoreContents.iterator().next();
		if (!(ecoreRoot instanceof EPackage)) {
			return false;
		}
		EPackage ecorePackage = (EPackage) ecoreRoot;
		if (ClassUtil.basicGetMetamodelAnnotation(ecorePackage) != null) {
			return true;
		}
		// FIXME Following code should be redundant
		if (ecorePackage.getEClassifier(PivotPackage.Literals.ENUMERATION_LITERAL.getName()) == null) {
			return false;
		}
		if (ecorePackage.getEClassifier(PivotPackage.Literals.EXPRESSION_IN_OCL.getName()) == null) {
			return false;
		}
		if (ecorePackage.getEClassifier(PivotPackage.Literals.OPERATION_CALL_EXP.getName()) == null) {
			return false;
		}
		if (ecorePackage.getEClassifier(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION.getName()) == null) {
			return false;
		}
		return true;
	}

	/**
	 * Load all transitively referenced *.ecore files and identify any EPackages identified
	 * as OCL AS Metamodels.
	 */
	protected void loadImports(@NonNull Resource ecoreResource) {
		URI baseURI = getBaseURI(ecoreResource);
		for (EObject eContent : ecoreResource.getContents()) {
			if (eContent instanceof EPackage) {
				loadImports((EPackage)eContent, baseURI);
			}
		}
		if ((asMetamodels != null) && (metamodelManager.getLibraryResource() == null)) {
			String nsURI = asMetamodels.iterator().next().getNsURI();
			if (nsURI != null) {
//				String stdlibASUri = LibraryConstants.STDLIB_URI + PivotConstants.DOT_OCL_AS_FILE_EXTENSION;
				OCLstdlib library = OCLstdlib.getDefault(); //create(stdlibASUri, "ocl", "ocl", nsURI);
//				metamodelManager.addPackageNsURISynonym(OCLstdlib.STDLIB_URI, PivotConstants.METAMODEL_URI);
				metamodelManager.installResource(library);
//				metamodelManager.installAs(nsURI, OCLstdlibTables.PACKAGE);
			}
		}
	}
	protected void loadImports(@NonNull EPackage ePackage, @Nullable URI baseURI) {
		if (ClassUtil.basicGetMetamodelAnnotation(ePackage) != null) {
			if (asMetamodels == null) {
				asMetamodels = new HashSet<EPackage>();
			}
			asMetamodels.add(ePackage);
		}
		EAnnotation importAnnotation = ePackage.getEAnnotation(PivotConstants.IMPORT_ANNOTATION_SOURCE);
		if (importAnnotation != null) {
			EMap<String, String> details = importAnnotation.getDetails();
			for (String key : details.keySet()) {
				URI uri = URI.createURI(details.get(key));
				if (baseURI != null) {
					uri = uri.resolve(baseURI);
				}
				assert uri != null;
				ResourceSet resourceSet = environmentFactory.getResourceSet();
				EObject importedEObject = null;
				String fragment = uri.fragment();
				if (fragment == null) {
					importedEObject = resourceSet.getPackageRegistry().getEPackage(uri.toString());
				}
				else {
					importedEObject = resourceSet.getEObject(uri, true);
				}
				if (importedEObject != null) {
					if (importedEObjects == null) {
						importedEObjects = new HashSet<EObject>();
					}
					if (importedEObjects.add(importedEObject) && (importedEObject instanceof EPackage)) {
						Resource importedResource = importedEObject.eResource();
						if (importedResource != null) {
							URI baseURI2 = getBaseURI(importedResource);
							loadImports((EPackage)importedEObject, baseURI2);
						}
					}
				}
			}
		}
		for (EPackage eSubPackage : ePackage.getESubpackages()) {
			if (eSubPackage != null) {
				loadImports(eSubPackage, baseURI);
			}
		}
	}

	@Override
	public void queueReference(@NonNull EObject eObject) {
		referencers.add(eObject);
	}

/*	protected void refreshAnnotation(NamedElement pivotElement, String key, String value) {
		String source = PIVOT_URI;
		Annotation pivotAnnotation = null;
		for (Annotation annotation : pivotElement.getOwnedAnnotation()) {
			if (annotation.getName().equals(source)) {
				pivotAnnotation = annotation;
				break;
			}
		}
		if (pivotAnnotation == null) {
			pivotAnnotation = PivotFactory.eINSTANCE.createAnnotation();
			pivotAnnotation.setName(source);
			pivotElement.getOwnedAnnotation().add(pivotAnnotation);
		}
		Detail pivotDetail = PivotFactory.eINSTANCE.createDetail();
		pivotDetail.setName(key);
		pivotDetail.getValue().add(value);
		pivotAnnotation.getOwnedDetail().add(pivotDetail);
	} */

	@Override
	public @NonNull <T extends NamedElement> T refreshElement(@NonNull Class<T> pivotClass, EClass pivotEClass, @NonNull EModelElement eModelElement) {
		EObject pivotElement = null;
		if (oldIdMap != null) {
			String id = ((XMLResource)eModelElement.eResource()).getID(eModelElement);
			if (id != null) {
				pivotElement = oldIdMap.get(id);
				if ((pivotElement != null) && (pivotElement.eClass() != pivotEClass)) {
					pivotElement = null;
				}
			}
		}
		if (pivotElement == null) {
			EFactory eFactoryInstance = pivotEClass.getEPackage().getEFactoryInstance();
			pivotElement = eFactoryInstance.create(pivotEClass);
		}
		if (!pivotClass.isAssignableFrom(pivotElement.getClass())) {
			throw new ClassCastException();
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) pivotElement;
		Element oldElement = newCreateMap.put(eModelElement, castElement);
		assert oldElement == null;
		return castElement;
	}
	
	protected Type resolveDataType(@NonNull EDataType eClassifier) {
		Type pivotType = getEcore2ASMap().get(eClassifier);
		if (pivotType == null) {
			pivotType = getASType(eClassifier);
		}
		return pivotType;
	}

	protected Type resolveGenericType(@NonNull Map<String, Type> resolvedSpecializations, @NonNull EGenericType eGenericType) {
		List<EGenericType> eTypeArguments = eGenericType.getETypeArguments();
		assert !eGenericType.getETypeArguments().isEmpty();
		EClassifier eClassifier = eGenericType.getEClassifier();
		List<ETypeParameter> eTypeParameters = eClassifier.getETypeParameters();
		assert eTypeParameters.size() == eTypeArguments.size();
		Type unspecializedPivotType = getASType(eClassifier);
		if (unspecializedPivotType == null) {
			return null;
		}
 		List<Type> templateArguments = new ArrayList<Type>();
		for (EGenericType eTypeArgument : eTypeArguments) {
			if (eTypeArgument != null) {
				Type typeArgument = resolveType(resolvedSpecializations, eTypeArgument);
				templateArguments.add(typeArgument);
			}
		}
		org.eclipse.ocl.pivot.Class unspecializedPivotClass = unspecializedPivotType.isClass(); 
		assert unspecializedPivotClass != null;			// FIXME
		return metamodelManager.getLibraryType(unspecializedPivotClass, templateArguments);
	}

	protected Type resolveSimpleType(@NonNull EClassifier eClassifier) {
		return getASType(eClassifier);
	}

	protected Type resolveType(@NonNull Map<String, Type> resolvedSpecializations, @NonNull EGenericType eGenericType) {
		Type pivotType = getCreated(Type.class, eGenericType);
		if (pivotType != null) {
			return pivotType;
		}
		EClassifier eClassifier = eGenericType.getEClassifier();
		ETypeParameter eTypeParameter = eGenericType.getETypeParameter();
		List<EGenericType> eTypeArguments = eGenericType.getETypeArguments();
		if (eTypeParameter != null) {
			pivotType = resolveTypeParameter(eGenericType);
		}
		else if (eClassifier == null) {
			pivotType = resolveWildcardType(eGenericType);
		}
		else if (!eTypeArguments.isEmpty()) {
			String ecoreMoniker = Ecore2Moniker.toString(eGenericType);
			pivotType = resolvedSpecializations.get(ecoreMoniker);
			if (pivotType == null) {
				pivotType = resolveGenericType(resolvedSpecializations, eGenericType);
				resolvedSpecializations.put(ecoreMoniker, pivotType);
			}
		}
		else if (eClassifier instanceof EDataType) {
			assert eGenericType.getETypeArguments().isEmpty();
			pivotType = resolveDataType((EDataType) eClassifier);
		}
		else { 
			assert eGenericType.getETypeArguments().isEmpty();
			pivotType = resolveSimpleType(eClassifier);
		}
		newCreateMap.put(eGenericType, pivotType);
		return pivotType;
	}

	protected Type resolveTypeParameter(@NonNull EGenericType eGenericType) {
		EClassifier eClassifier = eGenericType.getEClassifier();
		ETypeParameter eTypeParameter = eGenericType.getETypeParameter();
		List<EGenericType> eTypeArguments = eGenericType.getETypeArguments();
		assert eClassifier == null;
		assert eTypeArguments.isEmpty();
		Type pivotType = null;
		if (eTypeParameter != null) {
			pivotType = getCreated(Type.class, eTypeParameter);
		}
		return pivotType;
	}

	protected Type resolveWildcardType(@NonNull EGenericType eGenericType) {
		assert eGenericType.getETypeArguments().isEmpty();
		assert eGenericType.getEClassifier() == null;
		EClassifier eClassifier = eGenericType.getERawType();
		assert eClassifier == EcorePackage.Literals.EJAVA_OBJECT;
/*			WildcardTypeRefCS csTypeRef = BaseCSFactory.eINSTANCE.createWildcardTypeRefCS();
			setOriginalMapping(csTypeRef, eObject);
//			csTypeRef.setExtends(doSwitchAll(eGenericType.getExtends()));
//			csTypeRef.setSuper(doSwitchAll(eGenericType.getSuper()));
			return csTypeRef; */
		return metamodelManager.createWildcardType(null, null);		// FIXME bounds
/*		org.eclipse.ocl.pivot.Class pivotElement = PivotFactory.eINSTANCE.createClass();
		String name = PivotConstants.WILDCARD_NAME;
		EStructuralFeature eFeature = eGenericType.eContainmentFeature();
		if ((eFeature != null) && eFeature.isMany()) {
			EObject eContainer = eGenericType.eContainer();
			List<?> list = (List<?>)eContainer.eGet(eGenericType.eContainingFeature());
			int index = list.indexOf(eGenericType);
			if (index != 0) {
				name += index;
			}
		}
		pivotElement.setName(name);		
		return pivotElement; */
	}

	public void setEcoreURI(URI ecoreURI) {
		this.ecoreURI = ecoreURI;
	}

	@Override
	public String toString() {
		return String.valueOf(ecoreResource.getURI());
	}

	public void update(@NonNull Resource asResource, @NonNull Collection<EObject> ecoreContents) {
		newCreateMap = new HashMap<EObject, Element>();
		referencers = new HashSet<EObject>();
		genericTypes = new ArrayList<EGenericType>();
		PivotUtilInternal.refreshList(asResource.getContents(), Collections.singletonList(pivotModel));
		List<org.eclipse.ocl.pivot.Package> newPackages = new ArrayList<org.eclipse.ocl.pivot.Package>();
		for (EObject eObject : ecoreContents) {
			EClass eClass = eObject.eClass();
			if (eClass.getEPackage() != EcorePackage.eINSTANCE) {
				error("Non Ecore " + eClass.getName() + " for Ecore2AS.update");
			}
			else {
				Object pivotElement = declarationPass.doInPackageSwitch(eObject);
				if (pivotElement instanceof org.eclipse.ocl.pivot.Package) {
					newPackages.add((org.eclipse.ocl.pivot.Package) pivotElement);
				}
				else {
					error("Bad ecore content");
				}
			}
		}
		PivotUtilInternal.refreshList(pivotModel.getOwnedPackages(), newPackages);
		Map<String, Type> resolvedSpecializations = new HashMap<String, Type>();
		for (EGenericType eGenericType : genericTypes) {
			if (eGenericType != null) {
				Type pivotType = resolveType(resolvedSpecializations, eGenericType);
				newCreateMap.put(eGenericType, pivotType);
			}
		}
		for (EObject eObject : referencers) {
			referencePass.doInPackageSwitch(eObject);
		}
		for (EObject eObject : referencers) {
			if (eObject instanceof EReference) {
				Property pivotElement = getCreated(Property.class, eObject);
				if (pivotElement != null) {
					Property oppositeProperty = pivotElement.getOpposite();
					if ((oppositeProperty == null) && (eObject.eContainer() instanceof EClass)) {		// Skip annotation references
						metamodelManager.installPropertyDeclaration(pivotElement);
					}
				}
			}
		}
		referencers = null;
		genericTypes = null;
		oldIdMap = new HashMap<String, Element>();
		for (EObject ecoreContent : ecoreContents) {
			Resource resource = ecoreContent.eResource();
			if (resource instanceof XMLResource) {
				XMLResource xmlResource = (XMLResource) resource;
				String id = xmlResource.getID(ecoreContent);
				if (id != null) {
					Element element = newCreateMap.get(ecoreContent);
					if (element != null) {
						oldIdMap.put(id, element);
					}
				}
				for (TreeIterator<EObject> tit = ecoreContent.eAllContents(); tit.hasNext(); ) {
					EObject eObject = tit.next();
					id = xmlResource.getID(eObject);
					if (id != null) {
						Element element = newCreateMap.get(eObject);
						if (element != null) {
							oldIdMap.put(id, element);
						}
					}
				}
			}
		}
	}
}
