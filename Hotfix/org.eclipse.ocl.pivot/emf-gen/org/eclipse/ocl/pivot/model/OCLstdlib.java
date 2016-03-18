/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************
 * This code is 100% auto-generated
 * from: /org.eclipse.ocl.pivot/model/OCL-2.5.oclstdlib
 * by: org.eclipse.ocl.examples.build.xtend.generateOCLstdlib.xtend
 * and: org.eclipse.ocl.examples.build.GenerateOCLstdlibModel.mwe2
 *
 * Do not edit it.
 *******************************************************************************/
package	org.eclipse.ocl.pivot.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.*;
import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.Package;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.PackageId;
import org.eclipse.ocl.pivot.internal.library.StandardLibraryContribution;
import org.eclipse.ocl.pivot.internal.resource.ASResourceImpl;
import org.eclipse.ocl.pivot.internal.resource.OCLASResourceFactory;
import org.eclipse.ocl.pivot.internal.utilities.AS2XMIid;
import org.eclipse.ocl.pivot.internal.utilities.AbstractContents;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.MetamodelManager;
import org.eclipse.ocl.pivot.utilities.PivotConstants;
import org.eclipse.ocl.pivot.utilities.PivotUtil;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage;

/**
 * This is the http://www.eclipse.org/ocl/2015/Library Standard Library
 * auto-generated from /org.eclipse.ocl.pivot/model/OCL-2.5.oclstdlib.
 * It facilitates efficient library loading without the overheads of model reading.
 * <p>
 * This Standard Library may be registered as the definition of a Standard Library for
 * the OCL evaluation framework by invoking {@link #install}.
 * <p>
 * The Standard Library is normally activated when the MetamodelManager attempts
 * to locate a library type when its default Standard Library URI is the same
 * as this Standard Library.
 */
@SuppressWarnings({"nls", "unused"})
public class OCLstdlib extends ASResourceImpl
{
	/**
	 *	The static package-of-types pivot model of the Standard Library.
	 */
	private static OCLstdlib INSTANCE = null;
	
	/**
	 *	The URI of this Standard Library.
	 */
	public static final @NonNull String STDLIB_URI = "http://www.eclipse.org/ocl/2015/Library";

	/**
	 * Return the default http://www.eclipse.org/ocl/2015/Library standard Library Resource. 
	 *  This static definition auto-generated from /org.eclipse.ocl.pivot/model/OCL-2.5.oclstdlib
	 *  is used as the default when no overriding copy is registered.
	 * It cannot be unloaded or rather unloading has no effect.
	 */
	public static @NonNull OCLstdlib getDefault() {
		OCLstdlib oclstdlib = INSTANCE;
		if (oclstdlib == null) {
			Contents contents = new Contents("http://www.eclipse.org/ocl/2015/Library");
			oclstdlib = INSTANCE = new OCLstdlib(STDLIB_URI + PivotConstants.DOT_OCL_AS_FILE_EXTENSION, contents.getModel());
		}
		return oclstdlib;
	}

	/**
	 * Return the default http://www.eclipse.org/ocl/2015/Library standard Library model. 
	 *  This static definition auto-generated from /org.eclipse.ocl.pivot/model/OCL-2.5.oclstdlib
	 *  is used as the default when no overriding copy is registered. 
	 */
	public static @NonNull Model getDefaultModel() {
		Model model = (Model)(getDefault().getContents().get(0));
		assert model != null;
		return model;
	}

	/**
	 * Return the default http://www.eclipse.org/ocl/2015/Library standard Library package. 
	 *  This static definition auto-generated from /org.eclipse.ocl.pivot/model/OCL-2.5.oclstdlib
	 *  is used as the default when no overriding copy is registered. 
	 */
	public static @NonNull Package getDefaultPackage() {
		Package pkge = getDefaultModel().getOwnedPackages().get(0);
		assert pkge != null;
		return pkge;
	}

	/**
	 * Install this library in the {@link StandardLibraryContribution#REGISTRY}.
	 * This method may be invoked by standalone applications to replicate
	 * the registration that should appear as a standard_library plugin
	 * extension when running within Eclipse. 
	 */
	public static void install() {
		StandardLibraryContribution.REGISTRY.put(STDLIB_URI, new Loader());
	}

	/**
	 * Install this library in the {@link StandardLibraryContribution#REGISTRY}
	 * unless some other library contribution has already been installed.
	 */
	public static void lazyInstall() {
		if (StandardLibraryContribution.REGISTRY.get(STDLIB_URI) == null) {
			install();
		}
	}

	/**
	 * Unnstall this library from the {@link StandardLibraryContribution#REGISTRY}.
	 * This method may be invoked by standalone applications to release the library
	 * resources for garbage collection and memory leakage detection. 
	 */
	public static void uninstall() {
		StandardLibraryContribution.REGISTRY.remove(STDLIB_URI);
		INSTANCE = null;
	}
	
	/**
	 * The Loader shares the Standard Library instance whenever this default library
	 * is loaded from the registry of Standard Libraries populated by the standard_library 
	 * extension point.
	 */
	public static class Loader implements StandardLibraryContribution
	{
		@Override
		public @NonNull StandardLibraryContribution getContribution() {
			return this;
		}
		
		@Override
		public @NonNull Resource getResource() {
			return getDefault();
		}
	}
	
	/**
	 *	Construct a copy of the OCL Standard Library with specified resource URI,
	 *  and package name, prefix and namespace URI.
	 */
	public static @NonNull OCLstdlib create(@NonNull String asURI) {
		Contents contents = new Contents(asURI);
		return new OCLstdlib(asURI, contents.getModel());
	}
	
	/**
	 *	Construct an OCL Standard Library with specified resource URI and library content.
	 */
	private OCLstdlib(@NonNull String asURI, @NonNull Model libraryModel) {
		super(ClassUtil.nonNullState(URI.createURI(asURI)), OCLASResourceFactory.getInstance());
		assert PivotUtilInternal.isASURI(asURI);
		getContents().add(libraryModel);
	}

	/**
	 * Overridden to inhibit entry of the static shared instance in any ResourceSet.
	 */
	@Override
	public NotificationChain basicSetResourceSet(ResourceSet resourceSet, NotificationChain notifications) {
		if (this != INSTANCE) {
			return super.basicSetResourceSet(resourceSet, notifications);
		}
		else {
			return notifications;
		}
	}

	/**
	 * Overridden to inhibit unloading of the static shared instance.
	 */
	@Override
	protected void doUnload() {
		if (this != INSTANCE) {
			super.doUnload();
		}
	}

	/**
	 * Ensure xmi:ids are auto-generated before reference.
	 */
	@Override
	public EObject getEObject(String uriFragment) {
		if (getEObjectToIDMap().isEmpty()) {
			new AS2XMIid().assignIds(this, null);
		}
		return super.getEObject(uriFragment);
	}

	/**
	 * Overridden to trivialise loading of the static shared instance.
	 */
	@Override
	public void load(Map<?, ?> options) throws IOException {
		if (this != INSTANCE) {
			super.load(options);
		}
		else {
			setLoaded(true);
		}
	}

	/**
	 * Overridden to inhibit unloading of the static shared instance.
	 */
	@Override
	protected Notification setLoaded(boolean isLoaded) {
		if (isLoaded || (this != INSTANCE)) {
			return super.setLoaded(isLoaded);
		}
		else {
			return null;
		}
	}

	private static class Contents extends AbstractContents
	{
		private final @NonNull Model model;
		private final @NonNull Library ocl;
		private final @NonNull Package orphanage;

		private Contents(@NonNull String asURI)
		{
			model = createModel(asURI);
			ocl = createLibrary("ocl", "ocl", "http://www.eclipse.org/ocl/2015/Library", IdManager.METAMODEL);
			orphanage = createPackage("$$", "orphanage", "http://www.eclipse.org/ocl/2015/Orphanage", null);
			installPackages();
			installClassTypes();
			installPrimitiveTypes();
			installCollectionTypes();
			installMapTypes();
			installLambdaTypes();
			installTupleTypes();
			installOperations();
			installIterations();
			installCoercions();
			installProperties();
			installTemplateBindings();
			installPrecedences();
			installComments();
		}
		
		public @NonNull Model getModel() {
			return model;
		}
		
		private void installPackages() {
			model.getOwnedPackages().add(ocl);
			model.getOwnedPackages().add(orphanage);
		}
		
		private final @NonNull Class _Class = createClass("Class");
		private final @NonNull Class _Enumeration = createClass("Enumeration");
		private final @NonNull Class _EnumerationLiteral = createClass("EnumerationLiteral");
		private final @NonNull AnyType _OclAny = createAnyType("OclAny");
		private final @NonNull Class _OclComparable = createClass("OclComparable");
		private final @NonNull Class _OclElement = createClass("OclElement");
		private final @NonNull InvalidType _OclInvalid = createInvalidType("OclInvalid");
		private final @NonNull Class _OclLambda = createClass("OclLambda");
		private final @NonNull Class _OclMessage = createClass("OclMessage");
		private final @NonNull SelfType _OclSelf = createSelfType("OclSelf");
		private final @NonNull Class _OclState = createClass("OclState");
		private final @NonNull Class _OclSummable = createClass("OclSummable");
		private final @NonNull Class _OclTuple = createClass("OclTuple");
		private final @NonNull Class _OclType = createClass("OclType");
		private final @NonNull VoidType _OclVoid = createVoidType("OclVoid");
		private final @NonNull Class _State = createClass("State");
		private final @NonNull Class _Type = createClass("Type");
		
		private final @NonNull PrimitiveType _Boolean = createPrimitiveType("Boolean");
		private final @NonNull PrimitiveType _Integer = createPrimitiveType("Integer");
		private final @NonNull PrimitiveType _Real = createPrimitiveType("Real");
		private final @NonNull PrimitiveType _String = createPrimitiveType("String");
		private final @NonNull PrimitiveType _UnlimitedNatural = createPrimitiveType("UnlimitedNatural");
		
		private final @NonNull TemplateParameter tp_UnlimitedNatural_oclAsType_TT = createTemplateParameter("TT");
		private final @NonNull TemplateParameter tp_Bag_collectNested_V = createTemplateParameter("V");
		private final @NonNull TemplateParameter tp_Bag_collect_V = createTemplateParameter("V");
		private final @NonNull TemplateParameter tp_Bag_flatten_T2 = createTemplateParameter("T2");
		private final @NonNull TemplateParameter tp_Bag_selectByKind_TT = createTemplateParameter("TT");
		private final @NonNull TemplateParameter tp_Bag_selectByType_TT = createTemplateParameter("TT");
		private final @NonNull TemplateParameter tp_Bag_T = createTemplateParameter("T");
		private final @NonNull TemplateParameter tp_Collection_collectNested_V = createTemplateParameter("V");
		private final @NonNull TemplateParameter tp_Collection_collect_V = createTemplateParameter("V");
		private final @NonNull TemplateParameter tp_Collection_excludesAll_T2 = createTemplateParameter("T2");
		private final @NonNull TemplateParameter tp_Collection_flatten_T2 = createTemplateParameter("T2");
		private final @NonNull TemplateParameter tp_Collection_includesAll_T2 = createTemplateParameter("T2");
		private final @NonNull TemplateParameter tp_Collection_iterate_Tacc = createTemplateParameter("Tacc");
		private final @NonNull TemplateParameter tp_Collection_product_T2 = createTemplateParameter("T2");
		private final @NonNull TemplateParameter tp_Collection_selectByKind_TT = createTemplateParameter("TT");
		private final @NonNull TemplateParameter tp_Collection_selectByType_TT = createTemplateParameter("TT");
		private final @NonNull TemplateParameter tp_Collection_T = createTemplateParameter("T");
		private final @NonNull TemplateParameter tp_Map_excludesAll_K2 = createTemplateParameter("K2");
		private final @NonNull TemplateParameter tp_Map_excludesMap_K2 = createTemplateParameter("K2");
		private final @NonNull TemplateParameter tp_Map_excludesMap_V2 = createTemplateParameter("V2");
		private final @NonNull TemplateParameter tp_Map_excludingMap_K2 = createTemplateParameter("K2");
		private final @NonNull TemplateParameter tp_Map_excludingMap_V2 = createTemplateParameter("V2");
		private final @NonNull TemplateParameter tp_Map_includesAll_K2 = createTemplateParameter("K2");
		private final @NonNull TemplateParameter tp_Map_includesMap_K2 = createTemplateParameter("K2");
		private final @NonNull TemplateParameter tp_Map_includesMap_V2 = createTemplateParameter("V2");
		private final @NonNull TemplateParameter tp_Map_includingMap_K2 = createTemplateParameter("K2");
		private final @NonNull TemplateParameter tp_Map_includingMap_V2 = createTemplateParameter("V2");
		private final @NonNull TemplateParameter tp_Map_K = createTemplateParameter("K");
		private final @NonNull TemplateParameter tp_Map_V = createTemplateParameter("V");
		private final @NonNull TemplateParameter tp_OclAny_oclAsType_TT = createTemplateParameter("TT");
		private final @NonNull TemplateParameter tp_OclInvalid_oclAsType_TT = createTemplateParameter("TT");
		private final @NonNull TemplateParameter tp_OrderedCollection_T = createTemplateParameter("T");
		private final @NonNull TemplateParameter tp_OrderedSet_collectNested_V = createTemplateParameter("V");
		private final @NonNull TemplateParameter tp_OrderedSet_collect_V = createTemplateParameter("V");
		private final @NonNull TemplateParameter tp_OrderedSet_flatten_T2 = createTemplateParameter("T2");
		private final @NonNull TemplateParameter tp_OrderedSet_selectByKind_TT = createTemplateParameter("TT");
		private final @NonNull TemplateParameter tp_OrderedSet_selectByType_TT = createTemplateParameter("TT");
		private final @NonNull TemplateParameter tp_OrderedSet_T = createTemplateParameter("T");
		private final @NonNull TemplateParameter tp_Sequence_collectNested_V = createTemplateParameter("V");
		private final @NonNull TemplateParameter tp_Sequence_collect_V = createTemplateParameter("V");
		private final @NonNull TemplateParameter tp_Sequence_flatten_T2 = createTemplateParameter("T2");
		private final @NonNull TemplateParameter tp_Sequence_selectByKind_TT = createTemplateParameter("TT");
		private final @NonNull TemplateParameter tp_Sequence_selectByType_TT = createTemplateParameter("TT");
		private final @NonNull TemplateParameter tp_Sequence_T = createTemplateParameter("T");
		private final @NonNull TemplateParameter tp_Set_collectNested_V = createTemplateParameter("V");
		private final @NonNull TemplateParameter tp_Set_collect_V = createTemplateParameter("V");
		private final @NonNull TemplateParameter tp_Set_flatten_T2 = createTemplateParameter("T2");
		private final @NonNull TemplateParameter tp_Set_selectByKind_TT = createTemplateParameter("TT");
		private final @NonNull TemplateParameter tp_Set_selectByType_TT = createTemplateParameter("TT");
		private final @NonNull TemplateParameter tp_Set_T = createTemplateParameter("T");
		private final @NonNull TemplateParameter tp_UniqueCollection_T = createTemplateParameter("T");
		
		private final @NonNull TupleType _Tuple = createTupleType("Tuple",
			createProperty("first", tp_Collection_T),
			createProperty("second", tp_Collection_product_T2));
		
		private final @NonNull BagType _Bag_Bag_T = createBagType("Bag"/*T*/, "0", "*", tp_Bag_T);
		private final @NonNull CollectionType _Collection_Collection_T = createCollectionType("Collection"/*T*/, "0", "*", tp_Collection_T);
		private final @NonNull CollectionType _OrderedCollection_OrderedCollection_T = createCollectionType("OrderedCollection"/*T*/, "0", "*", tp_OrderedCollection_T);
		private final @NonNull OrderedSetType _OrderedSet_OrderedSet_T = createOrderedSetType("OrderedSet"/*T*/, "0", "*", tp_OrderedSet_T);
		private final @NonNull SequenceType _Sequence_Sequence_T = createSequenceType("Sequence"/*T*/, "0", "*", tp_Sequence_T);
		private final @NonNull SetType _Set_Set_T = createSetType("Set"/*T*/, "0", "*", tp_Set_T);
		private final @NonNull CollectionType _UniqueCollection_UniqueCollection_T = createCollectionType("UniqueCollection"/*T*/, "0", "*", tp_UniqueCollection_T);
		
		private final @NonNull BagType _Bag_Bag_collectNested_V = createBagType(_Bag_Bag_T, tp_Bag_collectNested_V);
		private final @NonNull BagType _Bag_Bag_collect_V = createBagType(_Bag_Bag_T, tp_Bag_collect_V);
		private final @NonNull BagType _Bag_Bag_flatten_T2 = createBagType(_Bag_Bag_T, tp_Bag_flatten_T2);
		private final @NonNull BagType _Bag_Bag_selectByKind_TT_NullFree = createBagType(_Bag_Bag_T, tp_Bag_selectByKind_TT);
		private final @NonNull BagType _Bag_Bag_selectByType_TT_NullFree = createBagType(_Bag_Bag_T, tp_Bag_selectByType_TT);
		private final @NonNull BagType _Bag_Collection_T = createBagType(_Bag_Bag_T, tp_Collection_T);
		private final @NonNull BagType _Bag_Enumeration = createBagType(_Bag_Bag_T, _Enumeration);
		private final @NonNull BagType _Bag_Map_V = createBagType(_Bag_Bag_T, tp_Map_V);
		private final @NonNull BagType _Bag_Set_collectNested_V = createBagType(_Bag_Bag_T, tp_Set_collectNested_V);
		private final @NonNull BagType _Bag_Set_collect_V = createBagType(_Bag_Bag_T, tp_Set_collect_V);
		private final @NonNull CollectionType _Collection_Integer = createCollectionType(_Collection_Collection_T, _Integer);
		private final @NonNull CollectionType _Collection_String = createCollectionType(_Collection_Collection_T, _String);
		private final @NonNull CollectionType _Collection_Tuple = createCollectionType(_Collection_Collection_T, _Tuple);
		private final @NonNull CollectionType _Collection_Bag_collectNested_V = createCollectionType(_Collection_Collection_T, tp_Bag_collectNested_V);
		private final @NonNull CollectionType _Collection_Bag_collect_V = createCollectionType(_Collection_Collection_T, tp_Bag_collect_V);
		private final @NonNull CollectionType _Collection_Bag_flatten_T2 = createCollectionType(_Collection_Collection_T, tp_Bag_flatten_T2);
		private final @NonNull CollectionType _Collection_Bag_selectByKind_TT = createCollectionType(_Collection_Collection_T, tp_Bag_selectByKind_TT);
		private final @NonNull CollectionType _Collection_Bag_selectByType_TT = createCollectionType(_Collection_Collection_T, tp_Bag_selectByType_TT);
		private final @NonNull CollectionType _Collection_Bag_T = createCollectionType(_Collection_Collection_T, tp_Bag_T);
		private final @NonNull CollectionType _Collection_Collection_collectNested_V = createCollectionType(_Collection_Collection_T, tp_Collection_collectNested_V);
		private final @NonNull CollectionType _Collection_Collection_collect_V = createCollectionType(_Collection_Collection_T, tp_Collection_collect_V);
		private final @NonNull CollectionType _Collection_Collection_excludesAll_T2 = createCollectionType(_Collection_Collection_T, tp_Collection_excludesAll_T2);
		private final @NonNull CollectionType _Collection_Collection_flatten_T2 = createCollectionType(_Collection_Collection_T, tp_Collection_flatten_T2);
		private final @NonNull CollectionType _Collection_Collection_includesAll_T2 = createCollectionType(_Collection_Collection_T, tp_Collection_includesAll_T2);
		private final @NonNull CollectionType _Collection_Collection_product_T2 = createCollectionType(_Collection_Collection_T, tp_Collection_product_T2);
		private final @NonNull CollectionType _Collection_Collection_selectByKind_TT_NullFree = createCollectionType(_Collection_Collection_T, tp_Collection_selectByKind_TT);
		private final @NonNull CollectionType _Collection_Collection_selectByType_TT_NullFree = createCollectionType(_Collection_Collection_T, tp_Collection_selectByType_TT);
		private final @NonNull CollectionType _Collection_Collection_T_1 = createCollectionType(_Collection_Collection_T, tp_Collection_T);
		private final @NonNull CollectionType _Collection_EnumerationLiteral = createCollectionType(_Collection_Collection_T, _EnumerationLiteral);
		private final @NonNull CollectionType _Collection_Enumeration = createCollectionType(_Collection_Collection_T, _Enumeration);
		private final @NonNull CollectionType _Collection_Map_excludesAll_K2 = createCollectionType(_Collection_Collection_T, tp_Map_excludesAll_K2);
		private final @NonNull CollectionType _Collection_Map_includesAll_K2 = createCollectionType(_Collection_Collection_T, tp_Map_includesAll_K2);
		private final @NonNull CollectionType _Collection_Map_K = createCollectionType(_Collection_Collection_T, tp_Map_K);
		private final @NonNull CollectionType _Collection_Map_V = createCollectionType(_Collection_Collection_T, tp_Map_V);
		private final @NonNull CollectionType _Collection_OclAny = createCollectionType(_Collection_Collection_T, _OclAny);
		private final @NonNull CollectionType _Collection_OclElement = createCollectionType(_Collection_Collection_T, _OclElement);
		private final @NonNull CollectionType _Collection_OclSelf = createCollectionType(_Collection_Collection_T, _OclSelf);
		private final @NonNull CollectionType _Collection_OrderedCollection_T = createCollectionType(_Collection_Collection_T, tp_OrderedCollection_T);
		private final @NonNull CollectionType _Collection_OrderedSet_collectNested_V = createCollectionType(_Collection_Collection_T, tp_OrderedSet_collectNested_V);
		private final @NonNull CollectionType _Collection_OrderedSet_collect_V = createCollectionType(_Collection_Collection_T, tp_OrderedSet_collect_V);
		private final @NonNull CollectionType _Collection_OrderedSet_flatten_T2 = createCollectionType(_Collection_Collection_T, tp_OrderedSet_flatten_T2);
		private final @NonNull CollectionType _Collection_OrderedSet_selectByKind_TT = createCollectionType(_Collection_Collection_T, tp_OrderedSet_selectByKind_TT);
		private final @NonNull CollectionType _Collection_OrderedSet_selectByType_TT = createCollectionType(_Collection_Collection_T, tp_OrderedSet_selectByType_TT);
		private final @NonNull CollectionType _Collection_OrderedSet_T = createCollectionType(_Collection_Collection_T, tp_OrderedSet_T);
		private final @NonNull CollectionType _Collection_Sequence_collectNested_V = createCollectionType(_Collection_Collection_T, tp_Sequence_collectNested_V);
		private final @NonNull CollectionType _Collection_Sequence_collect_V = createCollectionType(_Collection_Collection_T, tp_Sequence_collect_V);
		private final @NonNull CollectionType _Collection_Sequence_flatten_T2 = createCollectionType(_Collection_Collection_T, tp_Sequence_flatten_T2);
		private final @NonNull CollectionType _Collection_Sequence_selectByKind_TT = createCollectionType(_Collection_Collection_T, tp_Sequence_selectByKind_TT);
		private final @NonNull CollectionType _Collection_Sequence_selectByType_TT = createCollectionType(_Collection_Collection_T, tp_Sequence_selectByType_TT);
		private final @NonNull CollectionType _Collection_Sequence_T = createCollectionType(_Collection_Collection_T, tp_Sequence_T);
		private final @NonNull CollectionType _Collection_Set_collectNested_V = createCollectionType(_Collection_Collection_T, tp_Set_collectNested_V);
		private final @NonNull CollectionType _Collection_Set_collect_V = createCollectionType(_Collection_Collection_T, tp_Set_collect_V);
		private final @NonNull CollectionType _Collection_Set_flatten_T2 = createCollectionType(_Collection_Collection_T, tp_Set_flatten_T2);
		private final @NonNull CollectionType _Collection_Set_selectByKind_TT = createCollectionType(_Collection_Collection_T, tp_Set_selectByKind_TT);
		private final @NonNull CollectionType _Collection_Set_selectByType_TT = createCollectionType(_Collection_Collection_T, tp_Set_selectByType_TT);
		private final @NonNull CollectionType _Collection_Set_T = createCollectionType(_Collection_Collection_T, tp_Set_T);
		private final @NonNull CollectionType _Collection_UniqueCollection_T = createCollectionType(_Collection_Collection_T, tp_UniqueCollection_T);
		private final @NonNull CollectionType _OrderedCollection_Integer = createCollectionType(_OrderedCollection_OrderedCollection_T, _Integer);
		private final @NonNull CollectionType _OrderedCollection_String = createCollectionType(_OrderedCollection_OrderedCollection_T, _String);
		private final @NonNull CollectionType _OrderedCollection_Bag_T = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_Bag_T);
		private final @NonNull CollectionType _OrderedCollection_Collection_T = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_Collection_T);
		private final @NonNull CollectionType _OrderedCollection_EnumerationLiteral = createCollectionType(_OrderedCollection_OrderedCollection_T, _EnumerationLiteral);
		private final @NonNull CollectionType _OrderedCollection_OrderedSet_collectNested_V = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_OrderedSet_collectNested_V);
		private final @NonNull CollectionType _OrderedCollection_OrderedSet_collect_V = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_OrderedSet_collect_V);
		private final @NonNull CollectionType _OrderedCollection_OrderedSet_flatten_T2 = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_OrderedSet_flatten_T2);
		private final @NonNull CollectionType _OrderedCollection_OrderedSet_selectByKind_TT = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_OrderedSet_selectByKind_TT);
		private final @NonNull CollectionType _OrderedCollection_OrderedSet_selectByType_TT = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_OrderedSet_selectByType_TT);
		private final @NonNull CollectionType _OrderedCollection_OrderedSet_T = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_OrderedSet_T);
		private final @NonNull CollectionType _OrderedCollection_Sequence_collectNested_V = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_Sequence_collectNested_V);
		private final @NonNull CollectionType _OrderedCollection_Sequence_collect_V = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_Sequence_collect_V);
		private final @NonNull CollectionType _OrderedCollection_Sequence_flatten_T2 = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_Sequence_flatten_T2);
		private final @NonNull CollectionType _OrderedCollection_Sequence_selectByKind_TT = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_Sequence_selectByKind_TT);
		private final @NonNull CollectionType _OrderedCollection_Sequence_selectByType_TT = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_Sequence_selectByType_TT);
		private final @NonNull CollectionType _OrderedCollection_Sequence_T = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_Sequence_T);
		private final @NonNull CollectionType _OrderedCollection_Set_T = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_Set_T);
		private final @NonNull CollectionType _OrderedCollection_UniqueCollection_T = createCollectionType(_OrderedCollection_OrderedCollection_T, tp_UniqueCollection_T);
		private final @NonNull OrderedSetType _OrderedSet_Collection_T = createOrderedSetType(_OrderedSet_OrderedSet_T, tp_Collection_T);
		private final @NonNull OrderedSetType _OrderedSet_EnumerationLiteral = createOrderedSetType(_OrderedSet_OrderedSet_T, _EnumerationLiteral);
		private final @NonNull OrderedSetType _OrderedSet_OrderedSet_flatten_T2 = createOrderedSetType(_OrderedSet_OrderedSet_T, tp_OrderedSet_flatten_T2);
		private final @NonNull OrderedSetType _OrderedSet_OrderedSet_selectByKind_TT_NullFree = createOrderedSetType(_OrderedSet_OrderedSet_T, tp_OrderedSet_selectByKind_TT);
		private final @NonNull OrderedSetType _OrderedSet_OrderedSet_selectByType_TT_NullFree = createOrderedSetType(_OrderedSet_OrderedSet_T, tp_OrderedSet_selectByType_TT);
		private final @NonNull OrderedSetType _OrderedSet_Sequence_T = createOrderedSetType(_OrderedSet_OrderedSet_T, tp_Sequence_T);
		private final @NonNull OrderedSetType _OrderedSet_Set_T = createOrderedSetType(_OrderedSet_OrderedSet_T, tp_Set_T);
		private final @NonNull OrderedSetType _OrderedSet_UniqueCollection_T = createOrderedSetType(_OrderedSet_OrderedSet_T, tp_UniqueCollection_T);
		private final @NonNull SequenceType _Sequence_Integer_NullFree = createSequenceType(_Sequence_Sequence_T, _Integer);
		private final @NonNull SequenceType _Sequence_String = createSequenceType(_Sequence_Sequence_T, _String);
		private final @NonNull SequenceType _Sequence_Bag_T = createSequenceType(_Sequence_Sequence_T, tp_Bag_T);
		private final @NonNull SequenceType _Sequence_Collection_T = createSequenceType(_Sequence_Sequence_T, tp_Collection_T);
		private final @NonNull SequenceType _Sequence_OrderedSet_collectNested_V = createSequenceType(_Sequence_Sequence_T, tp_OrderedSet_collectNested_V);
		private final @NonNull SequenceType _Sequence_OrderedSet_collect_V = createSequenceType(_Sequence_Sequence_T, tp_OrderedSet_collect_V);
		private final @NonNull SequenceType _Sequence_Sequence_collectNested_V = createSequenceType(_Sequence_Sequence_T, tp_Sequence_collectNested_V);
		private final @NonNull SequenceType _Sequence_Sequence_collect_V = createSequenceType(_Sequence_Sequence_T, tp_Sequence_collect_V);
		private final @NonNull SequenceType _Sequence_Sequence_flatten_T2 = createSequenceType(_Sequence_Sequence_T, tp_Sequence_flatten_T2);
		private final @NonNull SequenceType _Sequence_Sequence_selectByKind_TT_NullFree = createSequenceType(_Sequence_Sequence_T, tp_Sequence_selectByKind_TT);
		private final @NonNull SequenceType _Sequence_Sequence_selectByType_TT_NullFree = createSequenceType(_Sequence_Sequence_T, tp_Sequence_selectByType_TT);
		private final @NonNull SetType _Set_Tuple_NullFree = createSetType(_Set_Set_T, _Tuple);
		private final @NonNull SetType _Set_Bag_T = createSetType(_Set_Set_T, tp_Bag_T);
		private final @NonNull SetType _Set_Collection_T = createSetType(_Set_Set_T, tp_Collection_T);
		private final @NonNull SetType _Set_Map_K = createSetType(_Set_Set_T, tp_Map_K);
		private final @NonNull SetType _Set_OclElement_NullFree = createSetType(_Set_Set_T, _OclElement);
		private final @NonNull SetType _Set_OclSelf_NullFree = createSetType(_Set_Set_T, _OclSelf);
		private final @NonNull SetType _Set_OclSelf = createSetType(_Set_Set_T, _OclSelf);
		private final @NonNull SetType _Set_Set_flatten_T2 = createSetType(_Set_Set_T, tp_Set_flatten_T2);
		private final @NonNull SetType _Set_Set_selectByKind_TT_NullFree = createSetType(_Set_Set_T, tp_Set_selectByKind_TT);
		private final @NonNull SetType _Set_Set_selectByType_TT_NullFree = createSetType(_Set_Set_T, tp_Set_selectByType_TT);
		private final @NonNull SetType _Set_UniqueCollection_T = createSetType(_Set_Set_T, tp_UniqueCollection_T);
		private final @NonNull CollectionType _UniqueCollection_Tuple = createCollectionType(_UniqueCollection_UniqueCollection_T, _Tuple);
		private final @NonNull CollectionType _UniqueCollection_Bag_T = createCollectionType(_UniqueCollection_UniqueCollection_T, tp_Bag_T);
		private final @NonNull CollectionType _UniqueCollection_Collection_T = createCollectionType(_UniqueCollection_UniqueCollection_T, tp_Collection_T);
		private final @NonNull CollectionType _UniqueCollection_EnumerationLiteral = createCollectionType(_UniqueCollection_UniqueCollection_T, _EnumerationLiteral);
		private final @NonNull CollectionType _UniqueCollection_Map_K = createCollectionType(_UniqueCollection_UniqueCollection_T, tp_Map_K);
		private final @NonNull CollectionType _UniqueCollection_OclAny = createCollectionType(_UniqueCollection_UniqueCollection_T, _OclAny);
		private final @NonNull CollectionType _UniqueCollection_OclElement = createCollectionType(_UniqueCollection_UniqueCollection_T, _OclElement);
		private final @NonNull CollectionType _UniqueCollection_OclSelf = createCollectionType(_UniqueCollection_UniqueCollection_T, _OclSelf);
		private final @NonNull CollectionType _UniqueCollection_OrderedSet_flatten_T2 = createCollectionType(_UniqueCollection_UniqueCollection_T, tp_OrderedSet_flatten_T2);
		private final @NonNull CollectionType _UniqueCollection_OrderedSet_selectByKind_TT = createCollectionType(_UniqueCollection_UniqueCollection_T, tp_OrderedSet_selectByKind_TT);
		private final @NonNull CollectionType _UniqueCollection_OrderedSet_selectByType_TT = createCollectionType(_UniqueCollection_UniqueCollection_T, tp_OrderedSet_selectByType_TT);
		private final @NonNull CollectionType _UniqueCollection_OrderedSet_T = createCollectionType(_UniqueCollection_UniqueCollection_T, tp_OrderedSet_T);
		private final @NonNull CollectionType _UniqueCollection_Sequence_T = createCollectionType(_UniqueCollection_UniqueCollection_T, tp_Sequence_T);
		private final @NonNull CollectionType _UniqueCollection_Set_flatten_T2 = createCollectionType(_UniqueCollection_UniqueCollection_T, tp_Set_flatten_T2);
		private final @NonNull CollectionType _UniqueCollection_Set_selectByKind_TT = createCollectionType(_UniqueCollection_UniqueCollection_T, tp_Set_selectByKind_TT);
		private final @NonNull CollectionType _UniqueCollection_Set_selectByType_TT = createCollectionType(_UniqueCollection_UniqueCollection_T, tp_Set_selectByType_TT);
		private final @NonNull CollectionType _UniqueCollection_Set_T = createCollectionType(_UniqueCollection_UniqueCollection_T, tp_Set_T);
		private final @NonNull CollectionType _UniqueCollection_UniqueCollection_T_1 = createCollectionType(_UniqueCollection_UniqueCollection_T, tp_UniqueCollection_T);
		
		private final @NonNull MapType _Map_Map_K_Map_V = createMapType("Map"/*K V*/, tp_Map_K, tp_Map_V);
		private final @NonNull MapType _Map_Map_excludesMap_K2_Map_excludesMap_V2 = createMapType(_Map_Map_K_Map_V, tp_Map_excludesMap_K2, tp_Map_excludesMap_V2);
		private final @NonNull MapType _Map_Map_excludingMap_K2_Map_excludingMap_V2 = createMapType(_Map_Map_K_Map_V, tp_Map_excludingMap_K2, tp_Map_excludingMap_V2);
		private final @NonNull MapType _Map_Map_includesMap_K2_Map_includesMap_V2 = createMapType(_Map_Map_K_Map_V, tp_Map_includesMap_K2, tp_Map_includesMap_V2);
		private final @NonNull MapType _Map_Map_includingMap_K2_Map_includingMap_V2 = createMapType(_Map_Map_K_Map_V, tp_Map_includingMap_K2, tp_Map_includingMap_V2);
		
		private void installClassTypes() {
			List<Class> ownedClasses;
			List<Class> superClasses;
			Class type;
		
			ownedClasses = ocl.getOwnedClasses();
			ownedClasses.add(type = _Class);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Enumeration);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _EnumerationLiteral);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _OclAny);
			ownedClasses.add(type = _OclComparable);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _OclElement);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _OclInvalid);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclVoid);
			ownedClasses.add(type = _OclLambda);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _OclMessage);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _OclSelf);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _OclState);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _OclSummable);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _OclTuple);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _OclType);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _OclVoid);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _State);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclState);
			ownedClasses.add(type = _Type);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclType);
		}
		
		private void installPrimitiveTypes() {
			List<Class> ownedClasses;
			PrimitiveType type;
		
			ownedClasses = ocl.getOwnedClasses();
			ownedClasses.add(type = _Boolean);
			type.getSuperClasses().add(_OclAny);
			ownedClasses.add(type = _Integer);
			type.getSuperClasses().add(_Real);
			ownedClasses.add(type = _Real);
			type.getSuperClasses().add(_OclComparable);
			type.getSuperClasses().add(_OclSummable);
			ownedClasses.add(type = _String);
			type.getSuperClasses().add(_OclComparable);
			type.getSuperClasses().add(_OclSummable);
			ownedClasses.add(type = _UnlimitedNatural);
			type.getSuperClasses().add(_OclComparable);
		}
		
		private void installCollectionTypes() {
			List<Class> ownedClasses;
			List<Class> superClasses;
			CollectionType type;
		
			ownedClasses = ocl.getOwnedClasses();
			ownedClasses.add(type = _Bag_Bag_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Bag_T);
			ownedClasses.add(type = _Collection_Collection_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _OrderedCollection_OrderedCollection_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OrderedCollection_T);
			ownedClasses.add(type = _OrderedSet_OrderedSet_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_OrderedSet_T);
			superClasses.add(_UniqueCollection_OrderedSet_T);
			ownedClasses.add(type = _Sequence_Sequence_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Sequence_T);
			ownedClasses.add(type = _Set_Set_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Set_T);
			ownedClasses.add(type = _UniqueCollection_UniqueCollection_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_UniqueCollection_T);
		
			ownedClasses = orphanage.getOwnedClasses();
			ownedClasses.add(type = _Bag_Bag_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Bag_collectNested_V);
			ownedClasses.add(type = _Bag_Bag_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Bag_collect_V);
			ownedClasses.add(type = _Bag_Bag_flatten_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Bag_flatten_T2);
			ownedClasses.add(type = _Bag_Bag_selectByKind_TT_NullFree);
			type.setIsNullFree(true);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Bag_selectByKind_TT);
			ownedClasses.add(type = _Bag_Bag_selectByType_TT_NullFree);
			type.setIsNullFree(true);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Bag_selectByType_TT);
			ownedClasses.add(type = _Bag_Collection_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Collection_T_1);
			ownedClasses.add(type = _Bag_Enumeration);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Enumeration);
			ownedClasses.add(type = _Bag_Map_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Map_V);
			ownedClasses.add(type = _Bag_Set_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Set_collectNested_V);
			ownedClasses.add(type = _Bag_Set_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Set_collect_V);
			ownedClasses.add(type = _Collection_Integer);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_String);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Tuple);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Bag_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Bag_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Bag_flatten_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Bag_selectByKind_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Bag_selectByType_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Bag_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Collection_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Collection_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Collection_excludesAll_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Collection_flatten_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Collection_includesAll_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Collection_product_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Collection_selectByKind_TT_NullFree);
			type.setIsNullFree(true);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Collection_selectByType_TT_NullFree);
			type.setIsNullFree(true);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Collection_T_1);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_EnumerationLiteral);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Enumeration);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Map_excludesAll_K2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Map_includesAll_K2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Map_K);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Map_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_OclAny);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_OclElement);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_OclSelf);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_OrderedCollection_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_OrderedSet_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_OrderedSet_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_OrderedSet_flatten_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_OrderedSet_selectByKind_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_OrderedSet_selectByType_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_OrderedSet_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Sequence_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Sequence_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Sequence_flatten_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Sequence_selectByKind_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Sequence_selectByType_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Sequence_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Set_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Set_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Set_flatten_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Set_selectByKind_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Set_selectByType_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_Set_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Collection_UniqueCollection_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _OrderedCollection_Integer);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Integer);
			ownedClasses.add(type = _OrderedCollection_String);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_String);
			ownedClasses.add(type = _OrderedCollection_Bag_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Bag_T);
			ownedClasses.add(type = _OrderedCollection_Collection_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Collection_T_1);
			ownedClasses.add(type = _OrderedCollection_EnumerationLiteral);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_EnumerationLiteral);
			ownedClasses.add(type = _OrderedCollection_OrderedSet_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OrderedSet_collectNested_V);
			ownedClasses.add(type = _OrderedCollection_OrderedSet_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OrderedSet_collect_V);
			ownedClasses.add(type = _OrderedCollection_OrderedSet_flatten_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OrderedSet_flatten_T2);
			ownedClasses.add(type = _OrderedCollection_OrderedSet_selectByKind_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OrderedSet_selectByKind_TT);
			ownedClasses.add(type = _OrderedCollection_OrderedSet_selectByType_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OrderedSet_selectByType_TT);
			ownedClasses.add(type = _OrderedCollection_OrderedSet_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OrderedSet_T);
			ownedClasses.add(type = _OrderedCollection_Sequence_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Sequence_collectNested_V);
			ownedClasses.add(type = _OrderedCollection_Sequence_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Sequence_collect_V);
			ownedClasses.add(type = _OrderedCollection_Sequence_flatten_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Sequence_flatten_T2);
			ownedClasses.add(type = _OrderedCollection_Sequence_selectByKind_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Sequence_selectByKind_TT);
			ownedClasses.add(type = _OrderedCollection_Sequence_selectByType_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Sequence_selectByType_TT);
			ownedClasses.add(type = _OrderedCollection_Sequence_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Sequence_T);
			ownedClasses.add(type = _OrderedCollection_Set_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Set_T);
			ownedClasses.add(type = _OrderedCollection_UniqueCollection_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_UniqueCollection_T);
			ownedClasses.add(type = _OrderedSet_Collection_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Collection_T);
			superClasses.add(_UniqueCollection_Collection_T);
			ownedClasses.add(type = _OrderedSet_EnumerationLiteral);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_EnumerationLiteral);
			superClasses.add(_UniqueCollection_EnumerationLiteral);
			ownedClasses.add(type = _OrderedSet_OrderedSet_flatten_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_OrderedSet_flatten_T2);
			superClasses.add(_UniqueCollection_OrderedSet_flatten_T2);
			ownedClasses.add(type = _OrderedSet_OrderedSet_selectByKind_TT_NullFree);
			type.setIsNullFree(true);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_OrderedSet_selectByKind_TT);
			superClasses.add(_UniqueCollection_OrderedSet_selectByKind_TT);
			ownedClasses.add(type = _OrderedSet_OrderedSet_selectByType_TT_NullFree);
			type.setIsNullFree(true);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_OrderedSet_selectByType_TT);
			superClasses.add(_UniqueCollection_OrderedSet_selectByType_TT);
			ownedClasses.add(type = _OrderedSet_Sequence_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Sequence_T);
			superClasses.add(_UniqueCollection_Sequence_T);
			ownedClasses.add(type = _OrderedSet_Set_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Set_T);
			superClasses.add(_UniqueCollection_Set_T);
			ownedClasses.add(type = _OrderedSet_UniqueCollection_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_UniqueCollection_T);
			superClasses.add(_UniqueCollection_UniqueCollection_T_1);
			ownedClasses.add(type = _Sequence_Integer_NullFree);
			type.setIsNullFree(true);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Integer);
			ownedClasses.add(type = _Sequence_String);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_String);
			ownedClasses.add(type = _Sequence_Bag_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Bag_T);
			ownedClasses.add(type = _Sequence_Collection_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Collection_T);
			ownedClasses.add(type = _Sequence_OrderedSet_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_OrderedSet_collectNested_V);
			ownedClasses.add(type = _Sequence_OrderedSet_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_OrderedSet_collect_V);
			ownedClasses.add(type = _Sequence_Sequence_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Sequence_collectNested_V);
			ownedClasses.add(type = _Sequence_Sequence_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Sequence_collect_V);
			ownedClasses.add(type = _Sequence_Sequence_flatten_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Sequence_flatten_T2);
			ownedClasses.add(type = _Sequence_Sequence_selectByKind_TT_NullFree);
			type.setIsNullFree(true);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Sequence_selectByKind_TT);
			ownedClasses.add(type = _Sequence_Sequence_selectByType_TT_NullFree);
			type.setIsNullFree(true);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Sequence_selectByType_TT);
			ownedClasses.add(type = _Set_Tuple_NullFree);
			type.setIsNullFree(true);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Tuple);
			ownedClasses.add(type = _Set_Bag_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Bag_T);
			ownedClasses.add(type = _Set_Collection_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Collection_T);
			ownedClasses.add(type = _Set_Map_K);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Map_K);
			ownedClasses.add(type = _Set_OclElement_NullFree);
			type.setIsNullFree(true);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_OclElement);
			ownedClasses.add(type = _Set_OclSelf_NullFree);
			type.setIsNullFree(true);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_OclSelf);
			ownedClasses.add(type = _Set_OclSelf);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_OclSelf);
			ownedClasses.add(type = _Set_Set_flatten_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Set_flatten_T2);
			ownedClasses.add(type = _Set_Set_selectByKind_TT_NullFree);
			type.setIsNullFree(true);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Set_selectByKind_TT);
			ownedClasses.add(type = _Set_Set_selectByType_TT_NullFree);
			type.setIsNullFree(true);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Set_selectByType_TT);
			ownedClasses.add(type = _Set_UniqueCollection_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_UniqueCollection_T_1);
			ownedClasses.add(type = _UniqueCollection_Tuple);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Tuple);
			ownedClasses.add(type = _UniqueCollection_Bag_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Bag_T);
			ownedClasses.add(type = _UniqueCollection_Collection_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Collection_T_1);
			ownedClasses.add(type = _UniqueCollection_EnumerationLiteral);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_EnumerationLiteral);
			ownedClasses.add(type = _UniqueCollection_Map_K);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Map_K);
			ownedClasses.add(type = _UniqueCollection_OclAny);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OclAny);
			ownedClasses.add(type = _UniqueCollection_OclElement);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OclElement);
			ownedClasses.add(type = _UniqueCollection_OclSelf);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OclSelf);
			ownedClasses.add(type = _UniqueCollection_OrderedSet_flatten_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OrderedSet_flatten_T2);
			ownedClasses.add(type = _UniqueCollection_OrderedSet_selectByKind_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OrderedSet_selectByKind_TT);
			ownedClasses.add(type = _UniqueCollection_OrderedSet_selectByType_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OrderedSet_selectByType_TT);
			ownedClasses.add(type = _UniqueCollection_OrderedSet_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OrderedSet_T);
			ownedClasses.add(type = _UniqueCollection_Sequence_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Sequence_T);
			ownedClasses.add(type = _UniqueCollection_Set_flatten_T2);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Set_flatten_T2);
			ownedClasses.add(type = _UniqueCollection_Set_selectByKind_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Set_selectByKind_TT);
			ownedClasses.add(type = _UniqueCollection_Set_selectByType_TT);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Set_selectByType_TT);
			ownedClasses.add(type = _UniqueCollection_Set_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Set_T);
			ownedClasses.add(type = _UniqueCollection_UniqueCollection_T_1);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_UniqueCollection_T);
		}
		
		private void installMapTypes() {
			List<Class> ownedClasses;
			List<Class> superClasses;
			MapType type;
		
			ownedClasses = ocl.getOwnedClasses();
			ownedClasses.add(type = _Map_Map_K_Map_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
		
			ownedClasses = orphanage.getOwnedClasses();
			ownedClasses.add(type = _Map_Map_excludesMap_K2_Map_excludesMap_V2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Map_Map_excludingMap_K2_Map_excludingMap_V2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Map_Map_includesMap_K2_Map_includesMap_V2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
			ownedClasses.add(type = _Map_Map_includingMap_K2_Map_includingMap_V2);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclAny);
		}
		
		private void installTupleTypes() {
			final List<Class> orphanTypes = orphanage.getOwnedClasses();
			TupleType type;
			List<Class> superClasses;
			orphanTypes.add(type = _Tuple);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclTuple);
		}
		
		private final @NonNull LambdaType _Lambda_Bag_T = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Bag_T_1 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Bag_T_2 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Bag_T_3 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Bag_T_4 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Collection_T = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Collection_T_1 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Collection_T_2 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Collection_T_3 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Collection_T_4 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_OrderedSet_T = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_OrderedSet_T_1 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_OrderedSet_T_2 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_OrderedSet_T_3 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_OrderedSet_T_4 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Sequence_T = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Sequence_T_1 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Sequence_T_2 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Sequence_T_3 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Sequence_T_4 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Set_T = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Set_T_1 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Set_T_2 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Set_T_3 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_Set_T_4 = createLambdaType("Lambda");
		private final @NonNull LambdaType _Lambda_UniqueCollection_T = createLambdaType("Lambda");
		
		private void installLambdaTypes() {
			final List<Class> orphanTypes = orphanage.getOwnedClasses();
			LambdaType type;
			List<Class> superClasses;
			orphanTypes.add(type = _Lambda_Bag_T);
			type.setContextType(tp_Bag_T);
			type.setResultType(_Boolean);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Bag_T_1);
			type.setContextType(tp_Bag_T);
			type.setResultType(tp_Bag_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Bag_T_2);
			type.setContextType(tp_Bag_T);
			type.setResultType(tp_Bag_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Bag_T_3);
			type.setContextType(tp_Bag_T);
			type.setResultType(_OclAny);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Bag_T_4);
			type.setContextType(tp_Bag_T);
			type.setResultType(_Set_Bag_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Collection_T);
			type.setContextType(tp_Collection_T);
			type.setResultType(_Boolean);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Collection_T_1);
			type.setContextType(tp_Collection_T);
			type.setResultType(tp_Collection_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Collection_T_2);
			type.setContextType(tp_Collection_T);
			type.setResultType(tp_Collection_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Collection_T_3);
			type.setContextType(tp_Collection_T);
			type.setResultType(tp_Collection_iterate_Tacc);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Collection_T_4);
			type.setContextType(tp_Collection_T);
			type.setResultType(_OclAny);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_OrderedSet_T);
			type.setContextType(tp_OrderedSet_T);
			type.setResultType(_Boolean);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_OrderedSet_T_1);
			type.setContextType(tp_OrderedSet_T);
			type.setResultType(_OclAny);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_OrderedSet_T_2);
			type.setContextType(tp_OrderedSet_T);
			type.setResultType(_OrderedSet_OrderedSet_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_OrderedSet_T_3);
			type.setContextType(tp_OrderedSet_T);
			type.setResultType(tp_OrderedSet_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_OrderedSet_T_4);
			type.setContextType(tp_OrderedSet_T);
			type.setResultType(tp_OrderedSet_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Sequence_T);
			type.setContextType(tp_Sequence_T);
			type.setResultType(_Boolean);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Sequence_T_1);
			type.setContextType(tp_Sequence_T);
			type.setResultType(_OclAny);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Sequence_T_2);
			type.setContextType(tp_Sequence_T);
			type.setResultType(_OrderedSet_Sequence_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Sequence_T_3);
			type.setContextType(tp_Sequence_T);
			type.setResultType(tp_Sequence_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Sequence_T_4);
			type.setContextType(tp_Sequence_T);
			type.setResultType(tp_Sequence_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Set_T);
			type.setContextType(tp_Set_T);
			type.setResultType(_Boolean);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Set_T_1);
			type.setContextType(tp_Set_T);
			type.setResultType(_OclAny);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Set_T_2);
			type.setContextType(tp_Set_T);
			type.setResultType(_Set_Set_T);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Set_T_3);
			type.setContextType(tp_Set_T);
			type.setResultType(tp_Set_collectNested_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_Set_T_4);
			type.setContextType(tp_Set_T);
			type.setResultType(tp_Set_collect_V);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
			orphanTypes.add(type = _Lambda_UniqueCollection_T);
			type.setContextType(tp_UniqueCollection_T);
			type.setResultType(_OclAny);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclLambda);
		}
		
		private final @NonNull Operation op_Boolean__lt__gt_ = createOperation("<>", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		private final @NonNull Operation op_Boolean__eq_ = createOperation("=", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		private final @NonNull Operation op_Boolean_allInstances = createOperation("allInstances", _Set_OclSelf_NullFree, "org.eclipse.ocl.pivot.library.logical.BooleanAllInstancesOperation", org.eclipse.ocl.pivot.library.logical.BooleanAllInstancesOperation.INSTANCE);
		private final @NonNull Operation op_Boolean_and = createOperation("and", _Boolean, "org.eclipse.ocl.pivot.library.logical.BooleanAndOperation", org.eclipse.ocl.pivot.library.logical.BooleanAndOperation.INSTANCE);
		private final @NonNull Operation op_Boolean_implies = createOperation("implies", _Boolean, "org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation", org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation.INSTANCE);
		private final @NonNull Operation op_Boolean_not = createOperation("not", _Boolean, "org.eclipse.ocl.pivot.library.logical.BooleanNotOperation", org.eclipse.ocl.pivot.library.logical.BooleanNotOperation.INSTANCE);
		private final @NonNull Operation op_Boolean_or = createOperation("or", _Boolean, "org.eclipse.ocl.pivot.library.logical.BooleanOrOperation", org.eclipse.ocl.pivot.library.logical.BooleanOrOperation.INSTANCE);
		private final @NonNull Operation op_Boolean_toString = createOperation("toString", _String, "org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation.INSTANCE);
		private final @NonNull Operation op_Boolean_xor = createOperation("xor", _Boolean, "org.eclipse.ocl.pivot.library.logical.BooleanXorOperation", org.eclipse.ocl.pivot.library.logical.BooleanXorOperation.INSTANCE);
		private final @NonNull Operation op_Integer__mul_ = createOperation("*", _Integer, "org.eclipse.ocl.pivot.library.numeric.NumericTimesOperation", org.eclipse.ocl.pivot.library.numeric.NumericTimesOperation.INSTANCE);
		private final @NonNull Operation op_Integer__add_ = createOperation("+", _Integer, "org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation", org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation.INSTANCE);
		private final @NonNull Operation op_Integer__neg_ = createOperation("-", _Integer, "org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation", org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation.INSTANCE);
		private final @NonNull Operation op_Integer__neg__1 = createOperation("-", _Integer, "org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation", org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation.INSTANCE);
		private final @NonNull Operation op_Integer__div_ = createOperation("/", _Real, "org.eclipse.ocl.pivot.library.numeric.NumericDivideOperation", org.eclipse.ocl.pivot.library.numeric.NumericDivideOperation.INSTANCE);
		private final @NonNull Operation op_Integer_abs = createOperation("abs", _Integer, "org.eclipse.ocl.pivot.library.numeric.NumericAbsOperation", org.eclipse.ocl.pivot.library.numeric.NumericAbsOperation.INSTANCE);
		private final @NonNull Operation op_Integer_div = createOperation("div", _Integer, "org.eclipse.ocl.pivot.library.numeric.NumericDivOperation", org.eclipse.ocl.pivot.library.numeric.NumericDivOperation.INSTANCE);
		private final @NonNull Operation op_Integer_max = createOperation("max", _Integer, "org.eclipse.ocl.pivot.library.numeric.NumericMaxOperation", org.eclipse.ocl.pivot.library.numeric.NumericMaxOperation.INSTANCE);
		private final @NonNull Operation op_Integer_min = createOperation("min", _Integer, "org.eclipse.ocl.pivot.library.numeric.NumericMinOperation", org.eclipse.ocl.pivot.library.numeric.NumericMinOperation.INSTANCE);
		private final @NonNull Operation op_Integer_mod = createOperation("mod", _Integer, "org.eclipse.ocl.pivot.library.numeric.NumericModOperation", org.eclipse.ocl.pivot.library.numeric.NumericModOperation.INSTANCE);
		private final @NonNull Operation op_Integer_toString = createOperation("toString", _String, "org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation.INSTANCE);
		private final @NonNull Operation op_Integer_toUnlimitedNatural = createOperation("toUnlimitedNatural", _UnlimitedNatural, "org.eclipse.ocl.pivot.library.numeric.IntegerToUnlimitedNaturalOperation", org.eclipse.ocl.pivot.library.numeric.IntegerToUnlimitedNaturalOperation.INSTANCE);
		private final @NonNull Operation op_Real__mul_ = createOperation("*", _Real, "org.eclipse.ocl.pivot.library.numeric.NumericTimesOperation", org.eclipse.ocl.pivot.library.numeric.NumericTimesOperation.INSTANCE);
		private final @NonNull Operation op_Real__add_ = createOperation("+", _Real, "org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation", org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation.INSTANCE);
		private final @NonNull Operation op_Real__neg_ = createOperation("-", _Real, "org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation", org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation.INSTANCE);
		private final @NonNull Operation op_Real__neg__1 = createOperation("-", _Real, "org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation", org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation.INSTANCE);
		private final @NonNull Operation op_Real__div_ = createOperation("/", _Real, "org.eclipse.ocl.pivot.library.numeric.NumericDivideOperation", org.eclipse.ocl.pivot.library.numeric.NumericDivideOperation.INSTANCE);
		private final @NonNull Operation op_Real__lt__gt_ = createOperation("<>", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		private final @NonNull Operation op_Real__eq_ = createOperation("=", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		private final @NonNull Operation op_Real_abs = createOperation("abs", _Real, "org.eclipse.ocl.pivot.library.numeric.NumericAbsOperation", org.eclipse.ocl.pivot.library.numeric.NumericAbsOperation.INSTANCE);
		private final @NonNull Operation op_Real_floor = createOperation("floor", _Integer, "org.eclipse.ocl.pivot.library.numeric.NumericFloorOperation", org.eclipse.ocl.pivot.library.numeric.NumericFloorOperation.INSTANCE);
		private final @NonNull Operation op_Real_max = createOperation("max", _Real, "org.eclipse.ocl.pivot.library.numeric.NumericMaxOperation", org.eclipse.ocl.pivot.library.numeric.NumericMaxOperation.INSTANCE);
		private final @NonNull Operation op_Real_min = createOperation("min", _Real, "org.eclipse.ocl.pivot.library.numeric.NumericMinOperation", org.eclipse.ocl.pivot.library.numeric.NumericMinOperation.INSTANCE);
		private final @NonNull Operation op_Real_round = createOperation("round", _Integer, "org.eclipse.ocl.pivot.library.numeric.NumericRoundOperation", org.eclipse.ocl.pivot.library.numeric.NumericRoundOperation.INSTANCE);
		private final @NonNull Operation op_Real_toString = createOperation("toString", _String, "org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation.INSTANCE);
		private final @NonNull Operation op_String__add_ = createOperation("+", _String, "org.eclipse.ocl.pivot.library.string.StringConcatOperation", org.eclipse.ocl.pivot.library.string.StringConcatOperation.INSTANCE);
		private final @NonNull Operation op_String__lt_ = createOperation("<", _Boolean, "org.eclipse.ocl.pivot.library.string.StringLessThanOperation", org.eclipse.ocl.pivot.library.string.StringLessThanOperation.INSTANCE);
		private final @NonNull Operation op_String__lt__eq_ = createOperation("<=", _Boolean, "org.eclipse.ocl.pivot.library.string.StringLessThanEqualOperation", org.eclipse.ocl.pivot.library.string.StringLessThanEqualOperation.INSTANCE);
		private final @NonNull Operation op_String__lt__gt_ = createOperation("<>", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		private final @NonNull Operation op_String__eq_ = createOperation("=", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		private final @NonNull Operation op_String__gt_ = createOperation(">", _Boolean, "org.eclipse.ocl.pivot.library.string.StringGreaterThanOperation", org.eclipse.ocl.pivot.library.string.StringGreaterThanOperation.INSTANCE);
		private final @NonNull Operation op_String__gt__eq_ = createOperation(">=", _Boolean, "org.eclipse.ocl.pivot.library.string.StringGreaterThanEqualOperation", org.eclipse.ocl.pivot.library.string.StringGreaterThanEqualOperation.INSTANCE);
		private final @NonNull Operation op_String_at = createOperation("at", _String, "org.eclipse.ocl.pivot.library.string.StringAtOperation", org.eclipse.ocl.pivot.library.string.StringAtOperation.INSTANCE);
		private final @NonNull Operation op_String_characters = createOperation("characters", _Sequence_String, "org.eclipse.ocl.pivot.library.string.StringCharactersOperation", org.eclipse.ocl.pivot.library.string.StringCharactersOperation.INSTANCE);
		private final @NonNull Operation op_String_compareTo = createOperation("compareTo", _Integer, "org.eclipse.ocl.pivot.library.string.StringCompareToOperation", org.eclipse.ocl.pivot.library.string.StringCompareToOperation.INSTANCE);
		private final @NonNull Operation op_String_concat = createOperation("concat", _String, "org.eclipse.ocl.pivot.library.string.StringConcatOperation", org.eclipse.ocl.pivot.library.string.StringConcatOperation.INSTANCE);
		private final @NonNull Operation op_String_endsWith = createOperation("endsWith", _Boolean, "org.eclipse.ocl.pivot.library.string.StringEndsWithOperation", org.eclipse.ocl.pivot.library.string.StringEndsWithOperation.INSTANCE);
		private final @NonNull Operation op_String_equalsIgnoreCase = createOperation("equalsIgnoreCase", _Boolean, "org.eclipse.ocl.pivot.library.string.StringEqualsIgnoreCaseOperation", org.eclipse.ocl.pivot.library.string.StringEqualsIgnoreCaseOperation.INSTANCE);
		private final @NonNull Operation op_String_indexOf = createOperation("indexOf", _Integer, "org.eclipse.ocl.pivot.library.string.StringIndexOfOperation", org.eclipse.ocl.pivot.library.string.StringIndexOfOperation.INSTANCE);
		private final @NonNull Operation op_String_lastIndexOf = createOperation("lastIndexOf", _Integer, "org.eclipse.ocl.pivot.library.string.StringLastIndexOfOperation", org.eclipse.ocl.pivot.library.string.StringLastIndexOfOperation.INSTANCE);
		private final @NonNull Operation op_String_matches = createOperation("matches", _Boolean, "org.eclipse.ocl.pivot.library.string.StringMatchesOperation", org.eclipse.ocl.pivot.library.string.StringMatchesOperation.INSTANCE);
		private final @NonNull Operation op_String_replaceAll = createOperation("replaceAll", _String, "org.eclipse.ocl.pivot.library.string.StringReplaceAllOperation", org.eclipse.ocl.pivot.library.string.StringReplaceAllOperation.INSTANCE);
		private final @NonNull Operation op_String_replaceFirst = createOperation("replaceFirst", _String, "org.eclipse.ocl.pivot.library.string.StringReplaceFirstOperation", org.eclipse.ocl.pivot.library.string.StringReplaceFirstOperation.INSTANCE);
		private final @NonNull Operation op_String_size = createOperation("size", _Integer, "org.eclipse.ocl.pivot.library.string.StringSizeOperation", org.eclipse.ocl.pivot.library.string.StringSizeOperation.INSTANCE);
		private final @NonNull Operation op_String_startsWith = createOperation("startsWith", _Boolean, "org.eclipse.ocl.pivot.library.string.StringStartsWithOperation", org.eclipse.ocl.pivot.library.string.StringStartsWithOperation.INSTANCE);
		private final @NonNull Operation op_String_substituteAll = createOperation("substituteAll", _String, "org.eclipse.ocl.pivot.library.string.StringSubstituteAllOperation", org.eclipse.ocl.pivot.library.string.StringSubstituteAllOperation.INSTANCE);
		private final @NonNull Operation op_String_substituteFirst = createOperation("substituteFirst", _String, "org.eclipse.ocl.pivot.library.string.StringSubstituteFirstOperation", org.eclipse.ocl.pivot.library.string.StringSubstituteFirstOperation.INSTANCE);
		private final @NonNull Operation op_String_substring = createOperation("substring", _String, "org.eclipse.ocl.pivot.library.string.StringSubstringOperation", org.eclipse.ocl.pivot.library.string.StringSubstringOperation.INSTANCE);
		private final @NonNull Operation op_String_toBoolean = createOperation("toBoolean", _Boolean, "org.eclipse.ocl.pivot.library.string.StringToBooleanOperation", org.eclipse.ocl.pivot.library.string.StringToBooleanOperation.INSTANCE);
		private final @NonNull Operation op_String_toInteger = createOperation("toInteger", _Integer, "org.eclipse.ocl.pivot.library.string.StringToIntegerOperation", org.eclipse.ocl.pivot.library.string.StringToIntegerOperation.INSTANCE);
		private final @NonNull Operation op_String_toLower = createOperation("toLower", _String, "org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation", org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation.INSTANCE);
		private final @NonNull Operation op_String_toLowerCase = createOperation("toLowerCase", _String, "org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation", org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation.INSTANCE);
		private final @NonNull Operation op_String_toReal = createOperation("toReal", _Real, "org.eclipse.ocl.pivot.library.string.StringToRealOperation", org.eclipse.ocl.pivot.library.string.StringToRealOperation.INSTANCE);
		private final @NonNull Operation op_String_toString = createOperation("toString", _String, "org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation.INSTANCE);
		private final @NonNull Operation op_String_toUpper = createOperation("toUpper", _String, "org.eclipse.ocl.pivot.library.string.StringToUpperCaseOperation", org.eclipse.ocl.pivot.library.string.StringToUpperCaseOperation.INSTANCE);
		private final @NonNull Operation op_String_toUpperCase = createOperation("toUpperCase", _String, "org.eclipse.ocl.pivot.library.string.StringToUpperCaseOperation", org.eclipse.ocl.pivot.library.string.StringToUpperCaseOperation.INSTANCE);
		private final @NonNull Operation op_String_tokenize = createOperation("tokenize", _Sequence_String, "org.eclipse.ocl.pivot.library.string.StringTokenizeOperation", org.eclipse.ocl.pivot.library.string.StringTokenizeOperation.INSTANCE);
		private final @NonNull Operation op_String_tokenize_1 = createOperation("tokenize", _Sequence_String, "org.eclipse.ocl.pivot.library.string.StringTokenizeOperation", org.eclipse.ocl.pivot.library.string.StringTokenizeOperation.INSTANCE);
		private final @NonNull Operation op_String_tokenize_2 = createOperation("tokenize", _Sequence_String, "org.eclipse.ocl.pivot.library.string.StringTokenizeOperation", org.eclipse.ocl.pivot.library.string.StringTokenizeOperation.INSTANCE);
		private final @NonNull Operation op_String_trim = createOperation("trim", _String, "org.eclipse.ocl.pivot.library.string.StringTrimOperation", org.eclipse.ocl.pivot.library.string.StringTrimOperation.INSTANCE);
		private final @NonNull Operation op_UnlimitedNatural_max = createOperation("max", _UnlimitedNatural, "org.eclipse.ocl.pivot.library.numeric.UnlimitedNaturalMaxOperation", org.eclipse.ocl.pivot.library.numeric.UnlimitedNaturalMaxOperation.INSTANCE);
		private final @NonNull Operation op_UnlimitedNatural_min = createOperation("min", _UnlimitedNatural, "org.eclipse.ocl.pivot.library.numeric.UnlimitedNaturalMinOperation", org.eclipse.ocl.pivot.library.numeric.UnlimitedNaturalMinOperation.INSTANCE);
		private final @NonNull Operation op_UnlimitedNatural_oclAsType = createOperation("oclAsType", tp_UnlimitedNatural_oclAsType_TT, "org.eclipse.ocl.pivot.library.numeric.UnlimitedNaturalOclAsTypeOperation", org.eclipse.ocl.pivot.library.numeric.UnlimitedNaturalOclAsTypeOperation.INSTANCE, tp_UnlimitedNatural_oclAsType_TT);
		private final @NonNull Operation op_UnlimitedNatural_toInteger = createOperation("toInteger", _Integer, "org.eclipse.ocl.pivot.library.numeric.UnlimitedNaturalToIntegerOperation", org.eclipse.ocl.pivot.library.numeric.UnlimitedNaturalToIntegerOperation.INSTANCE);
		private final @NonNull Operation op_Bag__lt__gt_ = createOperation("<>", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		private final @NonNull Operation op_Bag__eq_ = createOperation("=", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		private final @NonNull Operation op_Bag_excluding = createOperation("excluding", _Bag_Bag_T, "org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation", org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation.INSTANCE);
		private final @NonNull Operation op_Bag_excludingAll = createOperation("excludingAll", _Bag_Bag_T, "org.eclipse.ocl.pivot.library.collection.CollectionExcludingAllOperation", org.eclipse.ocl.pivot.library.collection.CollectionExcludingAllOperation.INSTANCE);
		private final @NonNull Operation op_Bag_flatten = createOperation("flatten", _Bag_Bag_flatten_T2, "org.eclipse.ocl.pivot.library.collection.CollectionFlattenOperation", org.eclipse.ocl.pivot.library.collection.CollectionFlattenOperation.INSTANCE, tp_Bag_flatten_T2);
		private final @NonNull Operation op_Bag_including = createOperation("including", _Bag_Bag_T, "org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation", org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation.INSTANCE);
		private final @NonNull Operation op_Bag_includingAll = createOperation("includingAll", _Bag_Bag_T, "org.eclipse.ocl.pivot.library.collection.CollectionIncludingAllOperation", org.eclipse.ocl.pivot.library.collection.CollectionIncludingAllOperation.INSTANCE);
		private final @NonNull Operation op_Bag_selectByKind = createOperation("selectByKind", _Bag_Bag_selectByKind_TT_NullFree, "org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation", org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation.INSTANCE, tp_Bag_selectByKind_TT);
		private final @NonNull Operation op_Bag_selectByType = createOperation("selectByType", _Bag_Bag_selectByType_TT_NullFree, "org.eclipse.ocl.pivot.library.collection.CollectionSelectByTypeOperation", org.eclipse.ocl.pivot.library.collection.CollectionSelectByTypeOperation.INSTANCE, tp_Bag_selectByType_TT);
		private final @NonNull Operation op_Collection__lt__gt_ = createOperation("<>", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		private final @NonNull Operation op_Collection__eq_ = createOperation("=", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		private final @NonNull Operation op_Collection_asBag = createOperation("asBag", _Bag_Collection_T, "org.eclipse.ocl.pivot.library.collection.CollectionAsBagOperation", org.eclipse.ocl.pivot.library.collection.CollectionAsBagOperation.INSTANCE);
		private final @NonNull Operation op_Collection_asOrderedSet = createOperation("asOrderedSet", _OrderedSet_Collection_T, "org.eclipse.ocl.pivot.library.collection.CollectionAsOrderedSetOperation", org.eclipse.ocl.pivot.library.collection.CollectionAsOrderedSetOperation.INSTANCE);
		private final @NonNull Operation op_Collection_asSequence = createOperation("asSequence", _Sequence_Collection_T, "org.eclipse.ocl.pivot.library.collection.CollectionAsSequenceOperation", org.eclipse.ocl.pivot.library.collection.CollectionAsSequenceOperation.INSTANCE);
		private final @NonNull Operation op_Collection_asSet = createOperation("asSet", _Set_Collection_T, "org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation", org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation.INSTANCE);
		private final @NonNull Operation op_Collection_count = createOperation("count", _Integer, "org.eclipse.ocl.pivot.library.collection.CollectionCountOperation", org.eclipse.ocl.pivot.library.collection.CollectionCountOperation.INSTANCE);
		private final @NonNull Operation op_Collection_excludes = createOperation("excludes", _Boolean, "org.eclipse.ocl.pivot.library.collection.CollectionExcludesOperation", org.eclipse.ocl.pivot.library.collection.CollectionExcludesOperation.INSTANCE);
		private final @NonNull Operation op_Collection_excludesAll = createOperation("excludesAll", _Boolean, "org.eclipse.ocl.pivot.library.collection.CollectionExcludesAllOperation", org.eclipse.ocl.pivot.library.collection.CollectionExcludesAllOperation.INSTANCE, tp_Collection_excludesAll_T2);
		private final @NonNull Operation op_Collection_excluding = createOperation("excluding", _Collection_Collection_T, "org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation", org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation.INSTANCE);
		private final @NonNull Operation op_Collection_excludingAll = createOperation("excludingAll", _Collection_Collection_T, "org.eclipse.ocl.pivot.library.collection.CollectionExcludingAllOperation", org.eclipse.ocl.pivot.library.collection.CollectionExcludingAllOperation.INSTANCE);
		private final @NonNull Operation op_Collection_flatten = createOperation("flatten", _Collection_Collection_flatten_T2, "org.eclipse.ocl.pivot.library.collection.CollectionFlattenOperation", org.eclipse.ocl.pivot.library.collection.CollectionFlattenOperation.INSTANCE, tp_Collection_flatten_T2);
		private final @NonNull Operation op_Collection_includes = createOperation("includes", _Boolean, "org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation", org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation.INSTANCE);
		private final @NonNull Operation op_Collection_includesAll = createOperation("includesAll", _Boolean, "org.eclipse.ocl.pivot.library.collection.CollectionIncludesAllOperation", org.eclipse.ocl.pivot.library.collection.CollectionIncludesAllOperation.INSTANCE, tp_Collection_includesAll_T2);
		private final @NonNull Operation op_Collection_including = createOperation("including", _Collection_Collection_T, "org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation", org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation.INSTANCE);
		private final @NonNull Operation op_Collection_includingAll = createOperation("includingAll", _Collection_Collection_T, "org.eclipse.ocl.pivot.library.collection.CollectionIncludingAllOperation", org.eclipse.ocl.pivot.library.collection.CollectionIncludingAllOperation.INSTANCE);
		private final @NonNull Operation op_Collection_intersection = createOperation("intersection", _Bag_Collection_T, "org.eclipse.ocl.pivot.library.collection.CollectionIntersectionOperation", org.eclipse.ocl.pivot.library.collection.CollectionIntersectionOperation.INSTANCE);
		private final @NonNull Operation op_Collection_intersection_1 = createOperation("intersection", _Set_Collection_T, "org.eclipse.ocl.pivot.library.collection.CollectionIntersectionOperation", org.eclipse.ocl.pivot.library.collection.CollectionIntersectionOperation.INSTANCE);
		private final @NonNull Operation op_Collection_isEmpty = createOperation("isEmpty", _Boolean, "org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation", org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation.INSTANCE);
		private final @NonNull Operation op_Collection_max = createOperation("max", tp_Collection_T, "org.eclipse.ocl.pivot.library.collection.CollectionMaxOperation", org.eclipse.ocl.pivot.library.collection.CollectionMaxOperation.INSTANCE);
		private final @NonNull Operation op_Collection_min = createOperation("min", tp_Collection_T, "org.eclipse.ocl.pivot.library.collection.CollectionMinOperation", org.eclipse.ocl.pivot.library.collection.CollectionMinOperation.INSTANCE);
		private final @NonNull Operation op_Collection_notEmpty = createOperation("notEmpty", _Boolean, "org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation", org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation.INSTANCE);
		private final @NonNull Operation op_Collection_product = createOperation("product", _Set_Tuple_NullFree, "org.eclipse.ocl.pivot.library.collection.CollectionProductOperation", org.eclipse.ocl.pivot.library.collection.CollectionProductOperation.INSTANCE, tp_Collection_product_T2);
		private final @NonNull Operation op_Collection_selectByKind = createOperation("selectByKind", _Collection_Collection_selectByKind_TT_NullFree, "org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation", org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation.INSTANCE, tp_Collection_selectByKind_TT);
		private final @NonNull Operation op_Collection_selectByType = createOperation("selectByType", _Collection_Collection_selectByType_TT_NullFree, "org.eclipse.ocl.pivot.library.collection.CollectionSelectByTypeOperation", org.eclipse.ocl.pivot.library.collection.CollectionSelectByTypeOperation.INSTANCE, tp_Collection_selectByType_TT);
		private final @NonNull Operation op_Collection_size = createOperation("size", _Integer, "org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation", org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation.INSTANCE);
		private final @NonNull Operation op_Collection_sum = createOperation("sum", tp_Collection_T, "org.eclipse.ocl.pivot.library.collection.CollectionSumOperation", org.eclipse.ocl.pivot.library.collection.CollectionSumOperation.INSTANCE);
		private final @NonNull Operation op_Collection_union = createOperation("union", _Bag_Collection_T, "org.eclipse.ocl.pivot.library.collection.CollectionUnionOperation", org.eclipse.ocl.pivot.library.collection.CollectionUnionOperation.INSTANCE);
		private final @NonNull Operation op_Enumeration_allInstances = createOperation("allInstances", _Set_OclSelf_NullFree, "org.eclipse.ocl.pivot.library.enumeration.EnumerationAllInstancesOperation", org.eclipse.ocl.pivot.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
		private final @NonNull Operation op_Map__lt__gt_ = createOperation("<>", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		private final @NonNull Operation op_Map__eq_ = createOperation("=", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		private final @NonNull Operation op_Map_at = createOperation("at", tp_Map_V, "org.eclipse.ocl.pivot.library.map.MapAtOperation", org.eclipse.ocl.pivot.library.map.MapAtOperation.INSTANCE);
		private final @NonNull Operation op_Map_excludes = createOperation("excludes", _Boolean, "org.eclipse.ocl.pivot.library.map.MapExcludesOperation", org.eclipse.ocl.pivot.library.map.MapExcludesOperation.INSTANCE);
		private final @NonNull Operation op_Map_excludes_1 = createOperation("excludes", _Boolean, "org.eclipse.ocl.pivot.library.map.MapExcludesPairOperation", org.eclipse.ocl.pivot.library.map.MapExcludesPairOperation.INSTANCE);
		private final @NonNull Operation op_Map_excludesAll = createOperation("excludesAll", _Boolean, "org.eclipse.ocl.pivot.library.map.MapExcludesAllOperation", org.eclipse.ocl.pivot.library.map.MapExcludesAllOperation.INSTANCE, tp_Map_excludesAll_K2);
		private final @NonNull Operation op_Map_excludesMap = createOperation("excludesMap", _Boolean, "org.eclipse.ocl.pivot.library.map.MapExcludesMapOperation", org.eclipse.ocl.pivot.library.map.MapExcludesMapOperation.INSTANCE, tp_Map_excludesMap_K2, tp_Map_excludesMap_V2);
		private final @NonNull Operation op_Map_excludesValue = createOperation("excludesValue", _Boolean, "org.eclipse.ocl.pivot.library.map.MapExcludesValueOperation", org.eclipse.ocl.pivot.library.map.MapExcludesValueOperation.INSTANCE);
		private final @NonNull Operation op_Map_excluding = createOperation("excluding", _Map_Map_K_Map_V, "org.eclipse.ocl.pivot.library.map.MapExcludingOperation", org.eclipse.ocl.pivot.library.map.MapExcludingOperation.INSTANCE);
		private final @NonNull Operation op_Map_excluding_1 = createOperation("excluding", _Map_Map_K_Map_V, "org.eclipse.ocl.pivot.library.map.MapExcludingPairOperation", org.eclipse.ocl.pivot.library.map.MapExcludingPairOperation.INSTANCE);
		private final @NonNull Operation op_Map_excludingAll = createOperation("excludingAll", _Map_Map_K_Map_V, "org.eclipse.ocl.pivot.library.map.MapExcludingAllOperation", org.eclipse.ocl.pivot.library.map.MapExcludingAllOperation.INSTANCE);
		private final @NonNull Operation op_Map_excludingMap = createOperation("excludingMap", _Map_Map_K_Map_V, "org.eclipse.ocl.pivot.library.map.MapExcludingMapOperation", org.eclipse.ocl.pivot.library.map.MapExcludingMapOperation.INSTANCE, tp_Map_excludingMap_K2, tp_Map_excludingMap_V2);
		private final @NonNull Operation op_Map_includes = createOperation("includes", _Boolean, "org.eclipse.ocl.pivot.library.map.MapIncludesOperation", org.eclipse.ocl.pivot.library.map.MapIncludesOperation.INSTANCE);
		private final @NonNull Operation op_Map_includes_1 = createOperation("includes", _Boolean, "org.eclipse.ocl.pivot.library.map.MapIncludesPairOperation", org.eclipse.ocl.pivot.library.map.MapIncludesPairOperation.INSTANCE);
		private final @NonNull Operation op_Map_includesAll = createOperation("includesAll", _Boolean, "org.eclipse.ocl.pivot.library.map.MapIncludesAllOperation", org.eclipse.ocl.pivot.library.map.MapIncludesAllOperation.INSTANCE, tp_Map_includesAll_K2);
		private final @NonNull Operation op_Map_includesMap = createOperation("includesMap", _Boolean, "org.eclipse.ocl.pivot.library.map.MapIncludesMapOperation", org.eclipse.ocl.pivot.library.map.MapIncludesMapOperation.INSTANCE, tp_Map_includesMap_K2, tp_Map_includesMap_V2);
		private final @NonNull Operation op_Map_includesValue = createOperation("includesValue", _Boolean, "org.eclipse.ocl.pivot.library.map.MapIncludesValueOperation", org.eclipse.ocl.pivot.library.map.MapIncludesValueOperation.INSTANCE);
		private final @NonNull Operation op_Map_including = createOperation("including", _Map_Map_K_Map_V, "org.eclipse.ocl.pivot.library.map.MapIncludingPairOperation", org.eclipse.ocl.pivot.library.map.MapIncludingPairOperation.INSTANCE);
		private final @NonNull Operation op_Map_includingMap = createOperation("includingMap", _Map_Map_K_Map_V, "org.eclipse.ocl.pivot.library.map.MapIncludingMapOperation", org.eclipse.ocl.pivot.library.map.MapIncludingMapOperation.INSTANCE, tp_Map_includingMap_K2, tp_Map_includingMap_V2);
		private final @NonNull Operation op_Map_isEmpty = createOperation("isEmpty", _Boolean, "org.eclipse.ocl.pivot.library.map.MapIsEmptyOperation", org.eclipse.ocl.pivot.library.map.MapIsEmptyOperation.INSTANCE);
		private final @NonNull Operation op_Map_keys = createOperation("keys", _Set_Map_K, "org.eclipse.ocl.pivot.library.map.MapKeysOperation", org.eclipse.ocl.pivot.library.map.MapKeysOperation.INSTANCE);
		private final @NonNull Operation op_Map_notEmpty = createOperation("notEmpty", _Boolean, "org.eclipse.ocl.pivot.library.map.MapNotEmptyOperation", org.eclipse.ocl.pivot.library.map.MapNotEmptyOperation.INSTANCE);
		private final @NonNull Operation op_Map_size = createOperation("size", _Integer, "org.eclipse.ocl.pivot.library.map.MapSizeOperation", org.eclipse.ocl.pivot.library.map.MapSizeOperation.INSTANCE);
		private final @NonNull Operation op_Map_values = createOperation("values", _Bag_Map_V, "org.eclipse.ocl.pivot.library.map.MapValuesOperation", org.eclipse.ocl.pivot.library.map.MapValuesOperation.INSTANCE);
		private final @NonNull Operation op_OclAny__lt__gt_ = createOperation("<>", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		private final @NonNull Operation op_OclAny__eq_ = createOperation("=", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		private final @NonNull Operation op_OclAny_oclAsSet = createOperation("oclAsSet", _Set_OclSelf_NullFree, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
		private final @NonNull Operation op_OclAny_oclAsType = createOperation("oclAsType", tp_OclAny_oclAsType_TT, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation.INSTANCE, tp_OclAny_oclAsType_TT);
		private final @NonNull Operation op_OclAny_oclIsInState = createOperation("oclIsInState", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsInStateOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsInStateOperation.INSTANCE);
		private final @NonNull Operation op_OclAny_oclIsInvalid = createOperation("oclIsInvalid", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsInvalidOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
		private final @NonNull Operation op_OclAny_oclIsKindOf = createOperation("oclIsKindOf", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE);
		private final @NonNull Operation op_OclAny_oclIsNew = createOperation("oclIsNew", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyUnsupportedOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
		private final @NonNull Operation op_OclAny_oclIsTypeOf = createOperation("oclIsTypeOf", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE);
		private final @NonNull Operation op_OclAny_oclIsUndefined = createOperation("oclIsUndefined", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsUndefinedOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
		private final @NonNull Operation op_OclAny_oclLog = createOperation("oclLog", _OclSelf, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclLogOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclLogOperation.INSTANCE);
		private final @NonNull Operation op_OclAny_oclLog_1 = createOperation("oclLog", _OclSelf, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclLogOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclLogOperation.INSTANCE);
		private final @NonNull Operation op_OclAny_oclType = createOperation("oclType", _OclSelf, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclTypeOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclTypeOperation.INSTANCE);
		private final @NonNull Operation op_OclAny_toString = createOperation("toString", _String, "org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation.INSTANCE);
		private final @NonNull Operation op_OclComparable__lt_ = createOperation("<", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation", org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation.INSTANCE);
		private final @NonNull Operation op_OclComparable__lt__eq_ = createOperation("<=", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation.INSTANCE);
		private final @NonNull Operation op_OclComparable__gt_ = createOperation(">", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation", org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation.INSTANCE);
		private final @NonNull Operation op_OclComparable__gt__eq_ = createOperation(">=", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation.INSTANCE);
		private final @NonNull Operation op_OclComparable_compareTo = createOperation("compareTo", _Integer, "org.eclipse.ocl.pivot.library.oclany.OclComparableCompareToOperation", org.eclipse.ocl.pivot.library.oclany.OclComparableCompareToOperation.INSTANCE);
		private final @NonNull Operation op_OclElement_allInstances = createOperation("allInstances", _Set_OclSelf_NullFree, "org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation", org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation.INSTANCE);
		private final @NonNull Operation op_OclElement_oclContainer = createOperation("oclContainer", _OclElement, "org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation", org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation.INSTANCE);
		private final @NonNull Operation op_OclElement_oclContents = createOperation("oclContents", _Set_OclElement_NullFree, "org.eclipse.ocl.pivot.library.classifier.ClassifierOclContentsOperation", org.eclipse.ocl.pivot.library.classifier.ClassifierOclContentsOperation.INSTANCE);
		private final @NonNull Operation op_OclInvalid__lt__gt_ = createOperation("<>", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		private final @NonNull Operation op_OclInvalid__eq_ = createOperation("=", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		private final @NonNull Operation op_OclInvalid_allInstances = createOperation("allInstances", _Set_OclSelf, "org.eclipse.ocl.pivot.library.oclinvalid.OclInvalidAllInstancesOperation", org.eclipse.ocl.pivot.library.oclinvalid.OclInvalidAllInstancesOperation.INSTANCE);
		private final @NonNull Operation op_OclInvalid_and = createOperation("and", _Boolean, "org.eclipse.ocl.pivot.library.logical.BooleanAndOperation", org.eclipse.ocl.pivot.library.logical.BooleanAndOperation.INSTANCE);
		private final @NonNull Operation op_OclInvalid_implies = createOperation("implies", _Boolean, "org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation", org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation.INSTANCE);
		private final @NonNull Operation op_OclInvalid_oclAsSet = createOperation("oclAsSet", _Set_OclSelf_NullFree, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
		private final @NonNull Operation op_OclInvalid_oclAsType = createOperation("oclAsType", tp_OclInvalid_oclAsType_TT, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation.INSTANCE, tp_OclInvalid_oclAsType_TT);
		private final @NonNull Operation op_OclInvalid_oclIsInvalid = createOperation("oclIsInvalid", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsInvalidOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
		private final @NonNull Operation op_OclInvalid_oclIsKindOf = createOperation("oclIsKindOf", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE);
		private final @NonNull Operation op_OclInvalid_oclIsTypeOf = createOperation("oclIsTypeOf", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE);
		private final @NonNull Operation op_OclInvalid_oclIsUndefined = createOperation("oclIsUndefined", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsUndefinedOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
		private final @NonNull Operation op_OclInvalid_oclType = createOperation("oclType", _OclSelf, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclTypeOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclTypeOperation.INSTANCE);
		private final @NonNull Operation op_OclInvalid_or = createOperation("or", _Boolean, "org.eclipse.ocl.pivot.library.logical.BooleanAndOperation", org.eclipse.ocl.pivot.library.logical.BooleanAndOperation.INSTANCE);
		private final @NonNull Operation op_OclInvalid_toString = createOperation("toString", _String, "org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation.INSTANCE);
		private final @NonNull Operation op_OclMessage_hasReturned = createOperation("hasReturned", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyUnsupportedOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
		private final @NonNull Operation op_OclMessage_isOperationCall = createOperation("isOperationCall", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyUnsupportedOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
		private final @NonNull Operation op_OclMessage_isSignalSent = createOperation("isSignalSent", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyUnsupportedOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
		private final @NonNull Operation op_OclMessage_result = createOperation("result", _OclAny, "org.eclipse.ocl.pivot.library.oclany.OclAnyUnsupportedOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
		private final @NonNull Operation op_OclSummable_sum = createOperation("sum", _OclSelf, null, null);
		private final @NonNull Operation op_OclSummable_zero = createOperation("zero", _OclSelf, null, null);
		private final @NonNull Operation op_OclTuple__lt__gt_ = createOperation("<>", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		private final @NonNull Operation op_OclTuple__eq_ = createOperation("=", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		private final @NonNull Operation op_OclType_conformsTo = createOperation("conformsTo", _Boolean, "org.eclipse.ocl.pivot.library.classifier.OclTypeConformsToOperation", org.eclipse.ocl.pivot.library.classifier.OclTypeConformsToOperation.INSTANCE);
		private final @NonNull Operation op_OclVoid__lt__gt_ = createOperation("<>", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		private final @NonNull Operation op_OclVoid__eq_ = createOperation("=", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		private final @NonNull Operation op_OclVoid_allInstances = createOperation("allInstances", _Set_OclSelf, "org.eclipse.ocl.pivot.library.oclvoid.OclVoidAllInstancesOperation", org.eclipse.ocl.pivot.library.oclvoid.OclVoidAllInstancesOperation.INSTANCE);
		private final @NonNull Operation op_OclVoid_and = createOperation("and", _Boolean, "org.eclipse.ocl.pivot.library.oclvoid.OclVoidAndOperation", org.eclipse.ocl.pivot.library.oclvoid.OclVoidAndOperation.INSTANCE);
		private final @NonNull Operation op_OclVoid_implies = createOperation("implies", _Boolean, "org.eclipse.ocl.pivot.library.oclvoid.OclVoidImpliesOperation", org.eclipse.ocl.pivot.library.oclvoid.OclVoidImpliesOperation.INSTANCE);
		private final @NonNull Operation op_OclVoid_oclIsInvalid = createOperation("oclIsInvalid", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsInvalidOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
		private final @NonNull Operation op_OclVoid_oclIsUndefined = createOperation("oclIsUndefined", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsUndefinedOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
		private final @NonNull Operation op_OclVoid_or = createOperation("or", _Boolean, "org.eclipse.ocl.pivot.library.oclvoid.OclVoidOrOperation", org.eclipse.ocl.pivot.library.oclvoid.OclVoidOrOperation.INSTANCE);
		private final @NonNull Operation op_OclVoid_toString = createOperation("toString", _String, "org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation.INSTANCE);
		private final @NonNull Operation op_OrderedCollection_at = createOperation("at", tp_OrderedCollection_T, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionAtOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionAtOperation.INSTANCE);
		private final @NonNull Operation op_OrderedCollection_first = createOperation("first", tp_OrderedCollection_T, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation.INSTANCE);
		private final @NonNull Operation op_OrderedCollection_indexOf = createOperation("indexOf", _Integer, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionIndexOfOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionIndexOfOperation.INSTANCE);
		private final @NonNull Operation op_OrderedCollection_last = createOperation("last", tp_OrderedCollection_T, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionLastOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionLastOperation.INSTANCE);
		private final @NonNull Operation op_OrderedSet__neg_ = createOperation("-", _OrderedSet_OrderedSet_T, "org.eclipse.ocl.pivot.library.collection.SetMinusOperation", org.eclipse.ocl.pivot.library.collection.SetMinusOperation.INSTANCE);
		private final @NonNull Operation op_OrderedSet__lt__gt_ = createOperation("<>", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		private final @NonNull Operation op_OrderedSet__eq_ = createOperation("=", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		private final @NonNull Operation op_OrderedSet_append = createOperation("append", _OrderedSet_OrderedSet_T, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionAppendOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionAppendOperation.INSTANCE);
		private final @NonNull Operation op_OrderedSet_appendAll = createOperation("appendAll", _OrderedSet_OrderedSet_T, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionAppendAllOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionAppendAllOperation.INSTANCE);
		private final @NonNull Operation op_OrderedSet_excluding = createOperation("excluding", _OrderedSet_OrderedSet_T, "org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation", org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation.INSTANCE);
		private final @NonNull Operation op_OrderedSet_excludingAll = createOperation("excludingAll", _OrderedSet_OrderedSet_T, "org.eclipse.ocl.pivot.library.collection.CollectionExcludingAllOperation", org.eclipse.ocl.pivot.library.collection.CollectionExcludingAllOperation.INSTANCE);
		private final @NonNull Operation op_OrderedSet_flatten = createOperation("flatten", _OrderedSet_OrderedSet_flatten_T2, "org.eclipse.ocl.pivot.library.collection.CollectionFlattenOperation", org.eclipse.ocl.pivot.library.collection.CollectionFlattenOperation.INSTANCE, tp_OrderedSet_flatten_T2);
		private final @NonNull Operation op_OrderedSet_including = createOperation("including", _OrderedSet_OrderedSet_T, "org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation", org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation.INSTANCE);
		private final @NonNull Operation op_OrderedSet_insertAt = createOperation("insertAt", _OrderedSet_OrderedSet_T, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionInsertAtOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
		private final @NonNull Operation op_OrderedSet_prepend = createOperation("prepend", _OrderedSet_OrderedSet_T, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionPrependOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionPrependOperation.INSTANCE);
		private final @NonNull Operation op_OrderedSet_prependAll = createOperation("prependAll", _OrderedSet_OrderedSet_T, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionPrependAllOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionPrependAllOperation.INSTANCE);
		private final @NonNull Operation op_OrderedSet_reverse = createOperation("reverse", _OrderedSet_OrderedSet_T, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionReverseOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionReverseOperation.INSTANCE);
		private final @NonNull Operation op_OrderedSet_selectByKind = createOperation("selectByKind", _OrderedSet_OrderedSet_selectByKind_TT_NullFree, "org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation", org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation.INSTANCE, tp_OrderedSet_selectByKind_TT);
		private final @NonNull Operation op_OrderedSet_selectByType = createOperation("selectByType", _OrderedSet_OrderedSet_selectByType_TT_NullFree, "org.eclipse.ocl.pivot.library.collection.CollectionSelectByTypeOperation", org.eclipse.ocl.pivot.library.collection.CollectionSelectByTypeOperation.INSTANCE, tp_OrderedSet_selectByType_TT);
		private final @NonNull Operation op_OrderedSet_subOrderedSet = createOperation("subOrderedSet", _OrderedSet_OrderedSet_T, "org.eclipse.ocl.pivot.library.collection.OrderedSetSubOrderedSetOperation", org.eclipse.ocl.pivot.library.collection.OrderedSetSubOrderedSetOperation.INSTANCE);
		private final @NonNull Operation op_Sequence__lt__gt_ = createOperation("<>", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		private final @NonNull Operation op_Sequence__eq_ = createOperation("=", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		private final @NonNull Operation op_Sequence_append = createOperation("append", _Sequence_Sequence_T, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionAppendOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionAppendOperation.INSTANCE);
		private final @NonNull Operation op_Sequence_appendAll = createOperation("appendAll", _Sequence_Sequence_T, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionAppendAllOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionAppendAllOperation.INSTANCE);
		private final @NonNull Operation op_Sequence_excluding = createOperation("excluding", _Sequence_Sequence_T, "org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation", org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation.INSTANCE);
		private final @NonNull Operation op_Sequence_excludingAll = createOperation("excludingAll", _Sequence_Sequence_T, "org.eclipse.ocl.pivot.library.collection.CollectionExcludingAllOperation", org.eclipse.ocl.pivot.library.collection.CollectionExcludingAllOperation.INSTANCE);
		private final @NonNull Operation op_Sequence_flatten = createOperation("flatten", _Sequence_Sequence_flatten_T2, "org.eclipse.ocl.pivot.library.collection.CollectionFlattenOperation", org.eclipse.ocl.pivot.library.collection.CollectionFlattenOperation.INSTANCE, tp_Sequence_flatten_T2);
		private final @NonNull Operation op_Sequence_including = createOperation("including", _Sequence_Sequence_T, "org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation", org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation.INSTANCE);
		private final @NonNull Operation op_Sequence_insertAt = createOperation("insertAt", _Sequence_Sequence_T, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionInsertAtOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
		private final @NonNull Operation op_Sequence_prepend = createOperation("prepend", _Sequence_Sequence_T, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionPrependOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionPrependOperation.INSTANCE);
		private final @NonNull Operation op_Sequence_prependAll = createOperation("prependAll", _Sequence_Sequence_T, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionPrependAllOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionPrependAllOperation.INSTANCE);
		private final @NonNull Operation op_Sequence_reverse = createOperation("reverse", _Sequence_Sequence_T, "org.eclipse.ocl.pivot.library.collection.OrderedCollectionReverseOperation", org.eclipse.ocl.pivot.library.collection.OrderedCollectionReverseOperation.INSTANCE);
		private final @NonNull Operation op_Sequence_selectByKind = createOperation("selectByKind", _Sequence_Sequence_selectByKind_TT_NullFree, "org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation", org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation.INSTANCE, tp_Sequence_selectByKind_TT);
		private final @NonNull Operation op_Sequence_selectByType = createOperation("selectByType", _Sequence_Sequence_selectByType_TT_NullFree, "org.eclipse.ocl.pivot.library.collection.CollectionSelectByTypeOperation", org.eclipse.ocl.pivot.library.collection.CollectionSelectByTypeOperation.INSTANCE, tp_Sequence_selectByType_TT);
		private final @NonNull Operation op_Sequence_subSequence = createOperation("subSequence", _Sequence_Sequence_T, "org.eclipse.ocl.pivot.library.collection.SequenceSubSequenceOperation", org.eclipse.ocl.pivot.library.collection.SequenceSubSequenceOperation.INSTANCE);
		private final @NonNull Operation op_Set__neg_ = createOperation("-", _Set_Set_T, "org.eclipse.ocl.pivot.library.collection.SetMinusOperation", org.eclipse.ocl.pivot.library.collection.SetMinusOperation.INSTANCE);
		private final @NonNull Operation op_Set__lt__gt_ = createOperation("<>", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		private final @NonNull Operation op_Set__eq_ = createOperation("=", _Boolean, "org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		private final @NonNull Operation op_Set_excluding = createOperation("excluding", _Set_Set_T, "org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation", org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation.INSTANCE);
		private final @NonNull Operation op_Set_excludingAll = createOperation("excludingAll", _Set_Set_T, "org.eclipse.ocl.pivot.library.collection.CollectionExcludingAllOperation", org.eclipse.ocl.pivot.library.collection.CollectionExcludingAllOperation.INSTANCE);
		private final @NonNull Operation op_Set_flatten = createOperation("flatten", _Set_Set_flatten_T2, "org.eclipse.ocl.pivot.library.collection.CollectionFlattenOperation", org.eclipse.ocl.pivot.library.collection.CollectionFlattenOperation.INSTANCE, tp_Set_flatten_T2);
		private final @NonNull Operation op_Set_including = createOperation("including", _Set_Set_T, "org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation", org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation.INSTANCE);
		private final @NonNull Operation op_Set_includingAll = createOperation("includingAll", _Set_Set_T, "org.eclipse.ocl.pivot.library.collection.CollectionIncludingAllOperation", org.eclipse.ocl.pivot.library.collection.CollectionIncludingAllOperation.INSTANCE);
		private final @NonNull Operation op_Set_selectByKind = createOperation("selectByKind", _Set_Set_selectByKind_TT_NullFree, "org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation", org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation.INSTANCE, tp_Set_selectByKind_TT);
		private final @NonNull Operation op_Set_selectByType = createOperation("selectByType", _Set_Set_selectByType_TT_NullFree, "org.eclipse.ocl.pivot.library.collection.CollectionSelectByTypeOperation", org.eclipse.ocl.pivot.library.collection.CollectionSelectByTypeOperation.INSTANCE, tp_Set_selectByType_TT);
		private final @NonNull Operation op_Type_conformsTo = createOperation("conformsTo", _Boolean, "org.eclipse.ocl.pivot.library.classifier.OclTypeConformsToOperation", org.eclipse.ocl.pivot.library.classifier.OclTypeConformsToOperation.INSTANCE);
		private final @NonNull Operation op_UniqueCollection__neg_ = createOperation("-", _UniqueCollection_UniqueCollection_T, "org.eclipse.ocl.pivot.library.collection.SetMinusOperation", org.eclipse.ocl.pivot.library.collection.SetMinusOperation.INSTANCE);
		private final @NonNull Operation op_UniqueCollection_intersection = createOperation("intersection", _Set_UniqueCollection_T, "org.eclipse.ocl.pivot.library.collection.CollectionIntersectionOperation", org.eclipse.ocl.pivot.library.collection.CollectionIntersectionOperation.INSTANCE);
		private final @NonNull Operation op_UniqueCollection_symmetricDifference = createOperation("symmetricDifference", _Set_UniqueCollection_T, "org.eclipse.ocl.pivot.library.collection.SetSymmetricDifferenceOperation", org.eclipse.ocl.pivot.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
		private final @NonNull Operation op_UniqueCollection_union = createOperation("union", _Set_UniqueCollection_T, "org.eclipse.ocl.pivot.library.collection.CollectionUnionOperation", org.eclipse.ocl.pivot.library.collection.CollectionUnionOperation.INSTANCE);
		
		private void installOperations() {
			List<Operation> ownedOperations;
			List<Parameter> ownedParameters;
			Operation operation;
			Parameter parameter;
		
			ownedOperations = _Boolean.getOwnedOperations();
			ownedOperations.add(operation = op_Boolean__lt__gt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_Boolean__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_Boolean_allInstances);
			operation.setIsStatic(true);
			ownedOperations.add(operation = op_Boolean_and);
			operation.setIsInvalidating(true);
			operation.setIsRequired(false);
			operation.setIsValidating(true);
			operation.setBodyExpression(createExpressionInOCL(_Boolean, "if self.oclIsInvalid() then\n\t\t        if b.oclIsInvalid() then self\n\t\t        else if b = false then false\n\t\t        else self\n\t\t        endif endif\n\t\t      else if self = false then false\n\t\t      else if b.oclIsInvalid() then b\n\t\t      else if b = false then false\n\t\t      else if self = null then null\n\t\t      else if b = null then null\n\t\t      else true\n\t\t      endif endif endif endif endif endif"));
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("b", _Boolean, false));
			ownedOperations.add(operation = op_Boolean_implies);
			operation.setIsInvalidating(true);
			operation.setIsRequired(false);
			operation.setIsValidating(true);
			operation.setBodyExpression(createExpressionInOCL(_Boolean, "if self.oclIsInvalid() then\n\t\t        if b.oclIsInvalid() then self\n\t\t        else if b = true then true\n\t\t        else self\n\t\t        endif endif\n\t\t      else if self = false then true\n\t\t      else if b.oclIsInvalid() then b\n\t\t      else if b = true then true\n\t\t      else if self = null then null\n\t\t      else if b = null then b\n\t\t      else false\n\t\t      endif endif endif endif endif endif"));
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("b", _Boolean, false));
			ownedOperations.add(operation = op_Boolean_not);
			operation.setIsRequired(false);
			operation.setBodyExpression(createExpressionInOCL(_Boolean, "if self.oclIsInvalid() then self\n\t\t      else if self = null then null\n\t\t      else self = false\n\t\t      endif endif"));
			ownedOperations.add(operation = op_Boolean_or);
			operation.setIsInvalidating(true);
			operation.setIsRequired(false);
			operation.setIsValidating(true);
			operation.setBodyExpression(createExpressionInOCL(_Boolean, "if self.oclIsInvalid() then\n\t\t        if b.oclIsInvalid() then self\n\t\t\t    else if b = true then true\n\t\t        else self\n\t\t        endif endif\n\t\t      else if self = true then true\n\t\t\t  else if b.oclIsInvalid() then b\n\t\t\t  else if b = true then true\n\t\t\t  else if self = null then null\n\t\t\t  else if b = null then null\n\t\t      else false\n\t\t      endif endif endif endif endif endif"));
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("b", _Boolean, false));
			ownedOperations.add(operation = op_Boolean_toString);
			ownedOperations.add(operation = op_Boolean_xor);
			operation.setIsRequired(false);
			operation.setBodyExpression(createExpressionInOCL(_Boolean, "if self.oclIsInvalid() then self\n\t\t      else if b.oclIsInvalid() then b\n\t\t      else if self = null then null\n\t\t      else if b = null then null\n\t\t      else self <> b\n\t\t      endif endif endif endif"));
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("b", _Boolean, false));
		
			ownedOperations = _Integer.getOwnedOperations();
			ownedOperations.add(operation = op_Integer__mul_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("i", _OclSelf, false));
			ownedOperations.add(operation = op_Integer__add_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("i", _OclSelf, false));
			ownedOperations.add(operation = op_Integer__neg_);
			ownedOperations.add(operation = op_Integer__neg__1);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("i", _OclSelf, false));
			ownedOperations.add(operation = op_Integer__div_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("i", _OclSelf, false));
			ownedOperations.add(operation = op_Integer_abs);
			ownedOperations.add(operation = op_Integer_div);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("i", _Integer, false));
			ownedOperations.add(operation = op_Integer_max);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("i", _OclSelf, false));
			ownedOperations.add(operation = op_Integer_min);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("i", _OclSelf, false));
			ownedOperations.add(operation = op_Integer_mod);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("i", _Integer, false));
			ownedOperations.add(operation = op_Integer_toString);
			ownedOperations.add(operation = op_Integer_toUnlimitedNatural);
		
			ownedOperations = _Real.getOwnedOperations();
			ownedOperations.add(operation = op_Real__mul_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("r", _OclSelf, false));
			ownedOperations.add(operation = op_Real__add_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("r", _OclSelf, false));
			ownedOperations.add(operation = op_Real__neg_);
			ownedOperations.add(operation = op_Real__neg__1);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("r", _OclSelf, false));
			ownedOperations.add(operation = op_Real__div_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("r", _OclSelf, false));
			ownedOperations.add(operation = op_Real__lt__gt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_Real__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_Real_abs);
			ownedOperations.add(operation = op_Real_floor);
			ownedOperations.add(operation = op_Real_max);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("r", _OclSelf, false));
			ownedOperations.add(operation = op_Real_min);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("r", _OclSelf, false));
			ownedOperations.add(operation = op_Real_round);
			ownedOperations.add(operation = op_Real_toString);
		
			ownedOperations = _String.getOwnedOperations();
			ownedOperations.add(operation = op_String__add_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _String, false));
			ownedOperations.add(operation = op_String__lt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _OclSelf, false));
			ownedOperations.add(operation = op_String__lt__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _OclSelf, false));
			ownedOperations.add(operation = op_String__lt__gt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_String__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_String__gt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _OclSelf, false));
			ownedOperations.add(operation = op_String__gt__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _OclSelf, false));
			ownedOperations.add(operation = op_String_at);
			operation.setIsInvalidating(true);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("i", _Integer, false));
			ownedOperations.add(operation = op_String_characters);
			ownedOperations.add(operation = op_String_compareTo);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("that", _OclSelf, false));
			ownedOperations.add(operation = op_String_concat);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _String, false));
			ownedOperations.add(operation = op_String_endsWith);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _String, false));
			ownedOperations.add(operation = op_String_equalsIgnoreCase);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _String, false));
			ownedOperations.add(operation = op_String_indexOf);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _String, false));
			ownedOperations.add(operation = op_String_lastIndexOf);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _String, false));
			ownedOperations.add(operation = op_String_matches);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("regex", _String, false));
			ownedOperations.add(operation = op_String_replaceAll);
			operation.setIsInvalidating(true);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("regex", _String, false));
			ownedParameters.add(parameter = createParameter("replacement", _String, false));
			ownedOperations.add(operation = op_String_replaceFirst);
			operation.setIsInvalidating(true);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("regex", _String, false));
			ownedParameters.add(parameter = createParameter("replacement", _String, false));
			ownedOperations.add(operation = op_String_size);
			ownedOperations.add(operation = op_String_startsWith);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _String, false));
			ownedOperations.add(operation = op_String_substituteAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("oldSubstring", _String, false));
			ownedParameters.add(parameter = createParameter("newSubstring", _String, false));
			ownedOperations.add(operation = op_String_substituteFirst);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("oldSubstring", _String, false));
			ownedParameters.add(parameter = createParameter("newSubstring", _String, false));
			ownedOperations.add(operation = op_String_substring);
			operation.setIsInvalidating(true);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lower", _Integer, false));
			ownedParameters.add(parameter = createParameter("upper", _Integer, false));
			ownedOperations.add(operation = op_String_toBoolean);
			operation.setIsInvalidating(true);
			ownedOperations.add(operation = op_String_toInteger);
			operation.setIsInvalidating(true);
			ownedOperations.add(operation = op_String_toLower);
			ownedOperations.add(operation = op_String_toLowerCase);
			ownedOperations.add(operation = op_String_toReal);
			operation.setIsInvalidating(true);
			ownedOperations.add(operation = op_String_toString);
			ownedOperations.add(operation = op_String_toUpper);
			ownedOperations.add(operation = op_String_toUpperCase);
			ownedOperations.add(operation = op_String_tokenize);
			ownedOperations.add(operation = op_String_tokenize_1);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("delimiters", _String, false));
			ownedOperations.add(operation = op_String_tokenize_2);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("delimiters", _String, false));
			ownedParameters.add(parameter = createParameter("returnDelimiters", _Boolean, false));
			ownedOperations.add(operation = op_String_trim);
		
			ownedOperations = _UnlimitedNatural.getOwnedOperations();
			ownedOperations.add(operation = op_UnlimitedNatural_max);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("i", _OclSelf, false));
			ownedOperations.add(operation = op_UnlimitedNatural_min);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("i", _OclSelf, false));
			ownedOperations.add(operation = op_UnlimitedNatural_oclAsType);
			operation.setIsInvalidating(true);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", tp_UnlimitedNatural_oclAsType_TT, false));
			parameter.setIsTypeof(true);
			ownedOperations.add(operation = op_UnlimitedNatural_toInteger);
			operation.setIsInvalidating(true);
		
			ownedOperations = _Bag_Bag_T.getOwnedOperations();
			ownedOperations.add(operation = op_Bag__lt__gt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_Bag__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_Bag_excluding);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", _OclAny, false));
			ownedOperations.add(operation = op_Bag_excludingAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("objects", _Collection_OclAny, true));
			ownedOperations.add(operation = op_Bag_flatten);
			ownedOperations.add(operation = op_Bag_including);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", tp_Bag_T, false));
			ownedOperations.add(operation = op_Bag_includingAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("objects", _Collection_Bag_T, true));
			ownedOperations.add(operation = op_Bag_selectByKind);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", tp_Bag_selectByKind_TT, false));
			parameter.setIsTypeof(true);
			ownedOperations.add(operation = op_Bag_selectByType);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", tp_Bag_selectByType_TT, false));
			parameter.setIsTypeof(true);
		
			ownedOperations = _Collection_Collection_T.getOwnedOperations();
			ownedOperations.add(operation = op_Collection__lt__gt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_Collection__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_Collection_asBag);
			ownedOperations.add(operation = op_Collection_asOrderedSet);
			ownedOperations.add(operation = op_Collection_asSequence);
			ownedOperations.add(operation = op_Collection_asSet);
			ownedOperations.add(operation = op_Collection_count);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", _OclAny, false));
			ownedOperations.add(operation = op_Collection_excludes);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", _OclAny, false));
			ownedOperations.add(operation = op_Collection_excludesAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("c2", _Collection_Collection_excludesAll_T2, true));
			ownedOperations.add(operation = op_Collection_excluding);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", _OclAny, false));
			ownedOperations.add(operation = op_Collection_excludingAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("objects", _Collection_OclAny, true));
			ownedOperations.add(operation = op_Collection_flatten);
			ownedOperations.add(operation = op_Collection_includes);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", _OclAny, false));
			ownedOperations.add(operation = op_Collection_includesAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("c2", _Collection_Collection_includesAll_T2, true));
			ownedOperations.add(operation = op_Collection_including);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", tp_Collection_T, false));
			ownedOperations.add(operation = op_Collection_includingAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("objects", _Collection_Collection_T, true));
			ownedOperations.add(operation = op_Collection_intersection);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("c", _Collection_Collection_T, true));
			ownedOperations.add(operation = op_Collection_intersection_1);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("u", _UniqueCollection_Collection_T, true));
			ownedOperations.add(operation = op_Collection_isEmpty);
			ownedOperations.add(operation = op_Collection_max);
			ownedOperations.add(operation = op_Collection_min);
			ownedOperations.add(operation = op_Collection_notEmpty);
			ownedOperations.add(operation = op_Collection_product);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("c2", _Collection_Collection_product_T2, true));
			ownedOperations.add(operation = op_Collection_selectByKind);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", tp_Collection_selectByKind_TT, false));
			parameter.setIsTypeof(true);
			ownedOperations.add(operation = op_Collection_selectByType);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", tp_Collection_selectByType_TT, false));
			parameter.setIsTypeof(true);
			ownedOperations.add(operation = op_Collection_size);
			ownedOperations.add(operation = op_Collection_sum);
			ownedOperations.add(operation = op_Collection_union);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("c", _Collection_Collection_T, true));
		
			ownedOperations = _Enumeration.getOwnedOperations();
			ownedOperations.add(operation = op_Enumeration_allInstances);
			operation.setIsStatic(true);
		
			ownedOperations = _Map_Map_K_Map_V.getOwnedOperations();
			ownedOperations.add(operation = op_Map__lt__gt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_Map__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_Map_at);
			operation.setIsInvalidating(true);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("key", _OclAny, false));
			ownedOperations.add(operation = op_Map_excludes);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("key", _OclAny, false));
			ownedOperations.add(operation = op_Map_excludes_1);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("key", _OclAny, false));
			ownedParameters.add(parameter = createParameter("value", _OclAny, false));
			ownedOperations.add(operation = op_Map_excludesAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("coll", _Collection_Map_excludesAll_K2, true));
			ownedOperations.add(operation = op_Map_excludesMap);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("map", _Map_Map_excludesMap_K2_Map_excludesMap_V2, false));
			ownedOperations.add(operation = op_Map_excludesValue);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("value", _OclAny, false));
			ownedOperations.add(operation = op_Map_excluding);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("key", _OclAny, false));
			ownedOperations.add(operation = op_Map_excluding_1);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("key", _OclAny, false));
			ownedParameters.add(parameter = createParameter("value", _OclAny, false));
			ownedOperations.add(operation = op_Map_excludingAll);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("keys", _Collection_OclAny, true));
			ownedOperations.add(operation = op_Map_excludingMap);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("map", _Map_Map_excludingMap_K2_Map_excludingMap_V2, false));
			ownedOperations.add(operation = op_Map_includes);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("key", _OclAny, false));
			ownedOperations.add(operation = op_Map_includes_1);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("key", _OclAny, false));
			ownedParameters.add(parameter = createParameter("value", _OclAny, false));
			ownedOperations.add(operation = op_Map_includesAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("coll", _Collection_Map_includesAll_K2, true));
			ownedOperations.add(operation = op_Map_includesMap);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("map", _Map_Map_includesMap_K2_Map_includesMap_V2, false));
			ownedOperations.add(operation = op_Map_includesValue);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("value", _OclAny, false));
			ownedOperations.add(operation = op_Map_including);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("key", tp_Map_K, false));
			ownedParameters.add(parameter = createParameter("value", tp_Map_V, false));
			ownedOperations.add(operation = op_Map_includingMap);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("map", _Map_Map_includingMap_K2_Map_includingMap_V2, false));
			ownedOperations.add(operation = op_Map_isEmpty);
			ownedOperations.add(operation = op_Map_keys);
			ownedOperations.add(operation = op_Map_notEmpty);
			ownedOperations.add(operation = op_Map_size);
			ownedOperations.add(operation = op_Map_values);
		
			ownedOperations = _OclAny.getOwnedOperations();
			ownedOperations.add(operation = op_OclAny__lt__gt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_OclAny__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_OclAny_oclAsSet);
			ownedOperations.add(operation = op_OclAny_oclAsType);
			operation.setIsInvalidating(true);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", tp_OclAny_oclAsType_TT, false));
			parameter.setIsTypeof(true);
			ownedOperations.add(operation = op_OclAny_oclIsInState);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("statespec", _OclState, false));
			ownedOperations.add(operation = op_OclAny_oclIsInvalid);
			operation.setIsValidating(true);
			ownedOperations.add(operation = op_OclAny_oclIsKindOf);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", _OclType, false));
			ownedOperations.add(operation = op_OclAny_oclIsNew);
			ownedOperations.add(operation = op_OclAny_oclIsTypeOf);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", _OclType, false));
			ownedOperations.add(operation = op_OclAny_oclIsUndefined);
			operation.setIsValidating(true);
			ownedOperations.add(operation = op_OclAny_oclLog);
			operation.setIsRequired(false);
			ownedOperations.add(operation = op_OclAny_oclLog_1);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("message", _String, false));
			ownedOperations.add(operation = op_OclAny_oclType);
			operation.setIsTypeof(true);
			ownedOperations.add(operation = op_OclAny_toString);
		
			ownedOperations = _OclComparable.getOwnedOperations();
			ownedOperations.add(operation = op_OclComparable__lt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("that", _OclSelf, false));
			ownedOperations.add(operation = op_OclComparable__lt__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("that", _OclSelf, false));
			ownedOperations.add(operation = op_OclComparable__gt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("that", _OclSelf, false));
			ownedOperations.add(operation = op_OclComparable__gt__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("that", _OclSelf, false));
			ownedOperations.add(operation = op_OclComparable_compareTo);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("that", _OclSelf, false));
		
			ownedOperations = _OclElement.getOwnedOperations();
			ownedOperations.add(operation = op_OclElement_allInstances);
			operation.setIsStatic(true);
			ownedOperations.add(operation = op_OclElement_oclContainer);
			operation.setIsRequired(false);
			ownedOperations.add(operation = op_OclElement_oclContents);
		
			ownedOperations = _OclInvalid.getOwnedOperations();
			ownedOperations.add(operation = op_OclInvalid__lt__gt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_OclInvalid__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_OclInvalid_allInstances);
			operation.setIsStatic(true);
			ownedOperations.add(operation = op_OclInvalid_and);
			operation.setIsRequired(false);
			operation.setIsValidating(true);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("b", _Boolean, false));
			ownedOperations.add(operation = op_OclInvalid_implies);
			operation.setIsRequired(false);
			operation.setIsValidating(true);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("b", _Boolean, false));
			ownedOperations.add(operation = op_OclInvalid_oclAsSet);
			ownedOperations.add(operation = op_OclInvalid_oclAsType);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", tp_OclInvalid_oclAsType_TT, false));
			parameter.setIsTypeof(true);
			ownedOperations.add(operation = op_OclInvalid_oclIsInvalid);
			operation.setIsValidating(true);
			ownedOperations.add(operation = op_OclInvalid_oclIsKindOf);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", _OclType, false));
			ownedOperations.add(operation = op_OclInvalid_oclIsTypeOf);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", _OclType, false));
			ownedOperations.add(operation = op_OclInvalid_oclIsUndefined);
			operation.setIsValidating(true);
			ownedOperations.add(operation = op_OclInvalid_oclType);
			operation.setIsTypeof(true);
			ownedOperations.add(operation = op_OclInvalid_or);
			operation.setIsRequired(false);
			operation.setIsValidating(true);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("b", _Boolean, false));
			ownedOperations.add(operation = op_OclInvalid_toString);
		
			ownedOperations = _OclMessage.getOwnedOperations();
			ownedOperations.add(operation = op_OclMessage_hasReturned);
			ownedOperations.add(operation = op_OclMessage_isOperationCall);
			ownedOperations.add(operation = op_OclMessage_isSignalSent);
			ownedOperations.add(operation = op_OclMessage_result);
			operation.setIsRequired(false);
		
			ownedOperations = _OclSummable.getOwnedOperations();
			ownedOperations.add(operation = op_OclSummable_sum);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("that", _OclSelf, false));
			ownedOperations.add(operation = op_OclSummable_zero);
			operation.setIsRequired(false);
		
			ownedOperations = _OclTuple.getOwnedOperations();
			ownedOperations.add(operation = op_OclTuple__lt__gt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_OclTuple__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
		
			ownedOperations = _OclType.getOwnedOperations();
			ownedOperations.add(operation = op_OclType_conformsTo);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type2", _OclType, false));
		
			ownedOperations = _OclVoid.getOwnedOperations();
			ownedOperations.add(operation = op_OclVoid__lt__gt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_OclVoid__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_OclVoid_allInstances);
			operation.setIsStatic(true);
			ownedOperations.add(operation = op_OclVoid_and);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("b", _Boolean, false));
			ownedOperations.add(operation = op_OclVoid_implies);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("b", _Boolean, false));
			ownedOperations.add(operation = op_OclVoid_oclIsInvalid);
			operation.setIsValidating(true);
			ownedOperations.add(operation = op_OclVoid_oclIsUndefined);
			operation.setIsValidating(true);
			ownedOperations.add(operation = op_OclVoid_or);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("b", _Boolean, false));
			ownedOperations.add(operation = op_OclVoid_toString);
		
			ownedOperations = _OrderedCollection_OrderedCollection_T.getOwnedOperations();
			ownedOperations.add(operation = op_OrderedCollection_at);
			operation.setIsInvalidating(true);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("index", _Integer, false));
			ownedOperations.add(operation = op_OrderedCollection_first);
			operation.setIsInvalidating(true);
			operation.setIsRequired(false);
			ownedOperations.add(operation = op_OrderedCollection_indexOf);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("obj", _OclAny, false));
			ownedOperations.add(operation = op_OrderedCollection_last);
			operation.setIsInvalidating(true);
			operation.setIsRequired(false);
		
			ownedOperations = _OrderedSet_OrderedSet_T.getOwnedOperations();
			ownedOperations.add(operation = op_OrderedSet__neg_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _UniqueCollection_OclAny, true));
			ownedOperations.add(operation = op_OrderedSet__lt__gt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_OrderedSet__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_OrderedSet_append);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", tp_OrderedSet_T, false));
			ownedOperations.add(operation = op_OrderedSet_appendAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("objects", _OrderedCollection_OrderedSet_T, true));
			ownedOperations.add(operation = op_OrderedSet_excluding);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", _OclAny, false));
			ownedOperations.add(operation = op_OrderedSet_excludingAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("objects", _Collection_OclAny, true));
			ownedOperations.add(operation = op_OrderedSet_flatten);
			ownedOperations.add(operation = op_OrderedSet_including);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", tp_OrderedSet_T, false));
			ownedOperations.add(operation = op_OrderedSet_insertAt);
			operation.setIsInvalidating(true);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("index", _Integer, false));
			ownedParameters.add(parameter = createParameter("object", tp_OrderedSet_T, false));
			ownedOperations.add(operation = op_OrderedSet_prepend);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", tp_OrderedSet_T, false));
			ownedOperations.add(operation = op_OrderedSet_prependAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("objects", _OrderedCollection_OrderedSet_T, true));
			ownedOperations.add(operation = op_OrderedSet_reverse);
			ownedOperations.add(operation = op_OrderedSet_selectByKind);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", tp_OrderedSet_selectByKind_TT, false));
			parameter.setIsTypeof(true);
			ownedOperations.add(operation = op_OrderedSet_selectByType);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", tp_OrderedSet_selectByType_TT, false));
			parameter.setIsTypeof(true);
			ownedOperations.add(operation = op_OrderedSet_subOrderedSet);
			operation.setIsInvalidating(true);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lower", _Integer, false));
			ownedParameters.add(parameter = createParameter("upper", _Integer, false));
		
			ownedOperations = _Sequence_Sequence_T.getOwnedOperations();
			ownedOperations.add(operation = op_Sequence__lt__gt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_Sequence__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_Sequence_append);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", tp_Sequence_T, false));
			ownedOperations.add(operation = op_Sequence_appendAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("objects", _OrderedCollection_Sequence_T, true));
			ownedOperations.add(operation = op_Sequence_excluding);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", _OclAny, false));
			ownedOperations.add(operation = op_Sequence_excludingAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("objects", _Collection_OclAny, true));
			ownedOperations.add(operation = op_Sequence_flatten);
			ownedOperations.add(operation = op_Sequence_including);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", tp_Sequence_T, false));
			ownedOperations.add(operation = op_Sequence_insertAt);
			operation.setIsInvalidating(true);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("index", _Integer, false));
			ownedParameters.add(parameter = createParameter("object", tp_Sequence_T, false));
			ownedOperations.add(operation = op_Sequence_prepend);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", tp_Sequence_T, false));
			ownedOperations.add(operation = op_Sequence_prependAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("objects", _OrderedCollection_Sequence_T, true));
			ownedOperations.add(operation = op_Sequence_reverse);
			ownedOperations.add(operation = op_Sequence_selectByKind);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", tp_Sequence_selectByKind_TT, false));
			parameter.setIsTypeof(true);
			ownedOperations.add(operation = op_Sequence_selectByType);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", tp_Sequence_selectByType_TT, false));
			parameter.setIsTypeof(true);
			ownedOperations.add(operation = op_Sequence_subSequence);
			operation.setIsInvalidating(true);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lower", _Integer, false));
			ownedParameters.add(parameter = createParameter("upper", _Integer, false));
		
			ownedOperations = _Set_Set_T.getOwnedOperations();
			ownedOperations.add(operation = op_Set__neg_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _UniqueCollection_OclAny, true));
			ownedOperations.add(operation = op_Set__lt__gt_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_Set__eq_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object2", _OclSelf, false));
			ownedOperations.add(operation = op_Set_excluding);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", _OclAny, false));
			ownedOperations.add(operation = op_Set_excludingAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("objects", _Collection_OclAny, true));
			ownedOperations.add(operation = op_Set_flatten);
			ownedOperations.add(operation = op_Set_including);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("object", tp_Set_T, false));
			ownedOperations.add(operation = op_Set_includingAll);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("objects", _Collection_Set_T, true));
			ownedOperations.add(operation = op_Set_selectByKind);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", tp_Set_selectByKind_TT, false));
			parameter.setIsTypeof(true);
			ownedOperations.add(operation = op_Set_selectByType);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type", tp_Set_selectByType_TT, false));
			parameter.setIsTypeof(true);
		
			ownedOperations = _Type.getOwnedOperations();
			ownedOperations.add(operation = op_Type_conformsTo);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("type2", _Type, false));
		
			ownedOperations = _UniqueCollection_UniqueCollection_T.getOwnedOperations();
			ownedOperations.add(operation = op_UniqueCollection__neg_);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _UniqueCollection_OclAny, true));
			ownedOperations.add(operation = op_UniqueCollection_intersection);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("c", _Collection_UniqueCollection_T, true));
			ownedOperations.add(operation = op_UniqueCollection_symmetricDifference);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _UniqueCollection_OclAny, true));
			ownedOperations.add(operation = op_UniqueCollection_union);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("s", _UniqueCollection_UniqueCollection_T, true));
		}
		
		private final @NonNull Iteration it_Bag_closure = createIteration("closure", _Set_Bag_T, "org.eclipse.ocl.pivot.library.iterator.ClosureIteration", org.eclipse.ocl.pivot.library.iterator.ClosureIteration.INSTANCE);
		private final @NonNull Iteration it_Bag_collectNested = createIteration("collectNested", _Bag_Bag_collectNested_V, "org.eclipse.ocl.pivot.library.iterator.CollectNestedIteration", org.eclipse.ocl.pivot.library.iterator.CollectNestedIteration.INSTANCE, tp_Bag_collectNested_V);
		private final @NonNull Iteration it_Bag_collect = createIteration("collect", _Bag_Bag_collect_V, "org.eclipse.ocl.pivot.library.iterator.CollectIteration", org.eclipse.ocl.pivot.library.iterator.CollectIteration.INSTANCE, tp_Bag_collect_V);
		private final @NonNull Iteration it_Bag_reject = createIteration("reject", _Bag_Bag_T, "org.eclipse.ocl.pivot.library.iterator.RejectIteration", org.eclipse.ocl.pivot.library.iterator.RejectIteration.INSTANCE);
		private final @NonNull Iteration it_Bag_select = createIteration("select", _Bag_Bag_T, "org.eclipse.ocl.pivot.library.iterator.SelectIteration", org.eclipse.ocl.pivot.library.iterator.SelectIteration.INSTANCE);
		private final @NonNull Iteration it_Bag_sortedBy = createIteration("sortedBy", _Sequence_Bag_T, "org.eclipse.ocl.pivot.library.iterator.SortedByIteration", org.eclipse.ocl.pivot.library.iterator.SortedByIteration.INSTANCE);
		private final @NonNull Iteration it_Collection_any = createIteration("any", tp_Collection_T, "org.eclipse.ocl.pivot.library.iterator.AnyIteration", org.eclipse.ocl.pivot.library.iterator.AnyIteration.INSTANCE);
		private final @NonNull Iteration it_Collection_collectNested = createIteration("collectNested", _Collection_Collection_collectNested_V, "org.eclipse.ocl.pivot.library.iterator.CollectNestedIteration", org.eclipse.ocl.pivot.library.iterator.CollectNestedIteration.INSTANCE, tp_Collection_collectNested_V);
		private final @NonNull Iteration it_Collection_collect = createIteration("collect", _Collection_Collection_collect_V, "org.eclipse.ocl.pivot.library.iterator.CollectIteration", org.eclipse.ocl.pivot.library.iterator.CollectIteration.INSTANCE, tp_Collection_collect_V);
		private final @NonNull Iteration it_Collection_exists = createIteration("exists", _Boolean, "org.eclipse.ocl.pivot.library.iterator.ExistsIteration", org.eclipse.ocl.pivot.library.iterator.ExistsIteration.INSTANCE);
		private final @NonNull Iteration it_Collection_exists_1 = createIteration("exists", _Boolean, "org.eclipse.ocl.pivot.library.iterator.ExistsIteration", org.eclipse.ocl.pivot.library.iterator.ExistsIteration.INSTANCE);
		private final @NonNull Iteration it_Collection_forAll = createIteration("forAll", _Boolean, "org.eclipse.ocl.pivot.library.iterator.ForAllIteration", org.eclipse.ocl.pivot.library.iterator.ForAllIteration.INSTANCE);
		private final @NonNull Iteration it_Collection_forAll_1 = createIteration("forAll", _Boolean, "org.eclipse.ocl.pivot.library.iterator.ForAllIteration", org.eclipse.ocl.pivot.library.iterator.ForAllIteration.INSTANCE);
		private final @NonNull Iteration it_Collection_isUnique = createIteration("isUnique", _Boolean, "org.eclipse.ocl.pivot.library.iterator.IsUniqueIteration", org.eclipse.ocl.pivot.library.iterator.IsUniqueIteration.INSTANCE);
		private final @NonNull Iteration it_Collection_iterate = createIteration("iterate", tp_Collection_iterate_Tacc, "org.eclipse.ocl.pivot.library.iterator.IterateIteration", org.eclipse.ocl.pivot.library.iterator.IterateIteration.INSTANCE, tp_Collection_iterate_Tacc);
		private final @NonNull Iteration it_Collection_one = createIteration("one", _Boolean, "org.eclipse.ocl.pivot.library.iterator.OneIteration", org.eclipse.ocl.pivot.library.iterator.OneIteration.INSTANCE);
		private final @NonNull Iteration it_Collection_reject = createIteration("reject", _Collection_Collection_T, "org.eclipse.ocl.pivot.library.iterator.RejectIteration", org.eclipse.ocl.pivot.library.iterator.RejectIteration.INSTANCE);
		private final @NonNull Iteration it_Collection_select = createIteration("select", _Collection_Collection_T, "org.eclipse.ocl.pivot.library.iterator.SelectIteration", org.eclipse.ocl.pivot.library.iterator.SelectIteration.INSTANCE);
		private final @NonNull Iteration it_Collection_sortedBy = createIteration("sortedBy", _Sequence_Collection_T, "org.eclipse.ocl.pivot.library.iterator.SortedByIteration", org.eclipse.ocl.pivot.library.iterator.SortedByIteration.INSTANCE);
		private final @NonNull Iteration it_OrderedSet_closure = createIteration("closure", _OrderedSet_OrderedSet_T, "org.eclipse.ocl.pivot.library.iterator.ClosureIteration", org.eclipse.ocl.pivot.library.iterator.ClosureIteration.INSTANCE);
		private final @NonNull Iteration it_OrderedSet_collectNested = createIteration("collectNested", _Sequence_OrderedSet_collectNested_V, "org.eclipse.ocl.pivot.library.iterator.CollectNestedIteration", org.eclipse.ocl.pivot.library.iterator.CollectNestedIteration.INSTANCE, tp_OrderedSet_collectNested_V);
		private final @NonNull Iteration it_OrderedSet_collect = createIteration("collect", _Sequence_OrderedSet_collect_V, "org.eclipse.ocl.pivot.library.iterator.CollectIteration", org.eclipse.ocl.pivot.library.iterator.CollectIteration.INSTANCE, tp_OrderedSet_collect_V);
		private final @NonNull Iteration it_OrderedSet_reject = createIteration("reject", _OrderedSet_OrderedSet_T, "org.eclipse.ocl.pivot.library.iterator.RejectIteration", org.eclipse.ocl.pivot.library.iterator.RejectIteration.INSTANCE);
		private final @NonNull Iteration it_OrderedSet_select = createIteration("select", _OrderedSet_OrderedSet_T, "org.eclipse.ocl.pivot.library.iterator.SelectIteration", org.eclipse.ocl.pivot.library.iterator.SelectIteration.INSTANCE);
		private final @NonNull Iteration it_OrderedSet_sortedBy = createIteration("sortedBy", _OrderedSet_OrderedSet_T, "org.eclipse.ocl.pivot.library.iterator.SortedByIteration", org.eclipse.ocl.pivot.library.iterator.SortedByIteration.INSTANCE);
		private final @NonNull Iteration it_Sequence_closure = createIteration("closure", _OrderedSet_Sequence_T, "org.eclipse.ocl.pivot.library.iterator.ClosureIteration", org.eclipse.ocl.pivot.library.iterator.ClosureIteration.INSTANCE);
		private final @NonNull Iteration it_Sequence_collectNested = createIteration("collectNested", _Sequence_Sequence_collectNested_V, "org.eclipse.ocl.pivot.library.iterator.CollectNestedIteration", org.eclipse.ocl.pivot.library.iterator.CollectNestedIteration.INSTANCE, tp_Sequence_collectNested_V);
		private final @NonNull Iteration it_Sequence_collect = createIteration("collect", _Sequence_Sequence_collect_V, "org.eclipse.ocl.pivot.library.iterator.CollectIteration", org.eclipse.ocl.pivot.library.iterator.CollectIteration.INSTANCE, tp_Sequence_collect_V);
		private final @NonNull Iteration it_Sequence_reject = createIteration("reject", _Sequence_Sequence_T, "org.eclipse.ocl.pivot.library.iterator.RejectIteration", org.eclipse.ocl.pivot.library.iterator.RejectIteration.INSTANCE);
		private final @NonNull Iteration it_Sequence_select = createIteration("select", _Sequence_Sequence_T, "org.eclipse.ocl.pivot.library.iterator.SelectIteration", org.eclipse.ocl.pivot.library.iterator.SelectIteration.INSTANCE);
		private final @NonNull Iteration it_Sequence_sortedBy = createIteration("sortedBy", _Sequence_Sequence_T, "org.eclipse.ocl.pivot.library.iterator.SortedByIteration", org.eclipse.ocl.pivot.library.iterator.SortedByIteration.INSTANCE);
		private final @NonNull Iteration it_Set_closure = createIteration("closure", _Set_Set_T, "org.eclipse.ocl.pivot.library.iterator.ClosureIteration", org.eclipse.ocl.pivot.library.iterator.ClosureIteration.INSTANCE);
		private final @NonNull Iteration it_Set_collectNested = createIteration("collectNested", _Bag_Set_collectNested_V, "org.eclipse.ocl.pivot.library.iterator.CollectNestedIteration", org.eclipse.ocl.pivot.library.iterator.CollectNestedIteration.INSTANCE, tp_Set_collectNested_V);
		private final @NonNull Iteration it_Set_collect = createIteration("collect", _Bag_Set_collect_V, "org.eclipse.ocl.pivot.library.iterator.CollectIteration", org.eclipse.ocl.pivot.library.iterator.CollectIteration.INSTANCE, tp_Set_collect_V);
		private final @NonNull Iteration it_Set_reject = createIteration("reject", _Set_Set_T, "org.eclipse.ocl.pivot.library.iterator.RejectIteration", org.eclipse.ocl.pivot.library.iterator.RejectIteration.INSTANCE);
		private final @NonNull Iteration it_Set_select = createIteration("select", _Set_Set_T, "org.eclipse.ocl.pivot.library.iterator.SelectIteration", org.eclipse.ocl.pivot.library.iterator.SelectIteration.INSTANCE);
		private final @NonNull Iteration it_Set_sortedBy = createIteration("sortedBy", _OrderedSet_Set_T, "org.eclipse.ocl.pivot.library.iterator.SortedByIteration", org.eclipse.ocl.pivot.library.iterator.SortedByIteration.INSTANCE);
		private final @NonNull Iteration it_UniqueCollection_sortedBy = createIteration("sortedBy", _OrderedSet_UniqueCollection_T, "org.eclipse.ocl.pivot.library.iterator.SortedByIteration", org.eclipse.ocl.pivot.library.iterator.SortedByIteration.INSTANCE);
		
		private void installIterations() {
			List<Operation> ownedIterations;
			List<Parameter> ownedParameters;
			Iteration iteration;
			Parameter parameter;
		
			ownedIterations = _Bag_Bag_T.getOwnedOperations();
			ownedIterations.add(iteration = it_Bag_closure);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Bag_T, true));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Bag_T_4, false));
			ownedIterations.add(iteration = it_Bag_collectNested);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Bag_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Bag_T_1, false));
			ownedIterations.add(iteration = it_Bag_collect);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Bag_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Bag_T_2, false));
			ownedIterations.add(iteration = it_Bag_reject);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Bag_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Bag_T, true));
			ownedIterations.add(iteration = it_Bag_select);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Bag_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Bag_T, true));
			ownedIterations.add(iteration = it_Bag_sortedBy);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Bag_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Bag_T_3, false));
		
			ownedIterations = _Collection_Collection_T.getOwnedOperations();
			ownedIterations.add(iteration = it_Collection_any);
			iteration.setIsInvalidating(true);
			iteration.setIsRequired(false);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Collection_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("body", _Lambda_Collection_T, true));
			ownedIterations.add(iteration = it_Collection_collectNested);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Collection_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Collection_T_1, false));
			ownedIterations.add(iteration = it_Collection_collect);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Collection_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Collection_T_2, false));
			ownedIterations.add(iteration = it_Collection_exists);
			iteration.setIsRequired(false);
			iteration.setIsValidating(true);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Collection_T, false));
			ownedParameters.add(parameter = createParameter("j", tp_Collection_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Collection_T, false));
			ownedIterations.add(iteration = it_Collection_exists_1);
			iteration.setIsRequired(false);
			iteration.setIsValidating(true);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Collection_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Collection_T, false));
			ownedIterations.add(iteration = it_Collection_forAll);
			iteration.setIsRequired(false);
			iteration.setIsValidating(true);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Collection_T, false));
			ownedParameters.add(parameter = createParameter("j", tp_Collection_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Collection_T, false));
			ownedIterations.add(iteration = it_Collection_forAll_1);
			iteration.setIsRequired(false);
			iteration.setIsValidating(true);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Collection_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Collection_T, false));
			ownedIterations.add(iteration = it_Collection_isUnique);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Collection_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Collection_T_4, false));
			ownedIterations.add(iteration = it_Collection_iterate);
			iteration.setIsRequired(false);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Collection_T, false));
			ownedParameters = iteration.getOwnedAccumulators();
			ownedParameters.add(parameter = createParameter("acc", tp_Collection_iterate_Tacc, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Collection_T_3, false));
			ownedIterations.add(iteration = it_Collection_one);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Collection_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Collection_T, true));
			ownedIterations.add(iteration = it_Collection_reject);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Collection_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Collection_T, true));
			ownedIterations.add(iteration = it_Collection_select);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Collection_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Collection_T, true));
			ownedIterations.add(iteration = it_Collection_sortedBy);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Collection_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Collection_T_4, false));
		
			ownedIterations = _OrderedSet_OrderedSet_T.getOwnedOperations();
			ownedIterations.add(iteration = it_OrderedSet_closure);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_OrderedSet_T, true));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_OrderedSet_T_2, false));
			ownedIterations.add(iteration = it_OrderedSet_collectNested);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_OrderedSet_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_OrderedSet_T_3, false));
			ownedIterations.add(iteration = it_OrderedSet_collect);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_OrderedSet_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_OrderedSet_T_4, false));
			ownedIterations.add(iteration = it_OrderedSet_reject);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_OrderedSet_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_OrderedSet_T, true));
			ownedIterations.add(iteration = it_OrderedSet_select);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_OrderedSet_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_OrderedSet_T, true));
			ownedIterations.add(iteration = it_OrderedSet_sortedBy);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_OrderedSet_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_OrderedSet_T_1, false));
		
			ownedIterations = _Sequence_Sequence_T.getOwnedOperations();
			ownedIterations.add(iteration = it_Sequence_closure);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Sequence_T, true));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Sequence_T_2, false));
			ownedIterations.add(iteration = it_Sequence_collectNested);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Sequence_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Sequence_T_3, false));
			ownedIterations.add(iteration = it_Sequence_collect);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Sequence_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Sequence_T_4, false));
			ownedIterations.add(iteration = it_Sequence_reject);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Sequence_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Sequence_T, true));
			ownedIterations.add(iteration = it_Sequence_select);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Sequence_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Sequence_T, true));
			ownedIterations.add(iteration = it_Sequence_sortedBy);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Sequence_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Sequence_T_1, false));
		
			ownedIterations = _Set_Set_T.getOwnedOperations();
			ownedIterations.add(iteration = it_Set_closure);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Set_T, true));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Set_T_2, false));
			ownedIterations.add(iteration = it_Set_collectNested);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Set_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Set_T_3, false));
			ownedIterations.add(iteration = it_Set_collect);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Set_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Set_T_4, false));
			ownedIterations.add(iteration = it_Set_reject);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Set_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Set_T, true));
			ownedIterations.add(iteration = it_Set_select);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Set_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Set_T, true));
			ownedIterations.add(iteration = it_Set_sortedBy);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_Set_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_Set_T_1, false));
		
			ownedIterations = _UniqueCollection_UniqueCollection_T.getOwnedOperations();
			ownedIterations.add(iteration = it_UniqueCollection_sortedBy);
			ownedParameters = iteration.getOwnedIterators();
			ownedParameters.add(parameter = createParameter("i", tp_UniqueCollection_T, false));
			ownedParameters = iteration.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("lambda", _Lambda_UniqueCollection_T, false));
		}
		
		private void installCoercions() {
			List<Operation> ownedCoercions;
			Operation coercion;
			ownedCoercions = _Integer.getCoercions();
			ownedCoercions.add(coercion = op_Integer_toUnlimitedNatural);
		}
		
		private final @NonNull Property pr_Collection_elementType = createProperty("elementType", tp_Collection_T);
		private final @NonNull Property pr_Collection_lower = createProperty("lower", _Integer);
		private final @NonNull Property pr_Collection_upper = createProperty("upper", _Integer);
		private final @NonNull Property pr_Enumeration_allLiterals = createProperty("allLiterals", _OrderedSet_EnumerationLiteral);
		private final @NonNull Property pr_EnumerationLiteral_Enumeration_allLiterals = createProperty("Enumeration", _Bag_Enumeration);
		private final @NonNull Property pr_Map_keyType = createProperty("keyType", tp_Map_K);
		private final @NonNull Property pr_Map_valueType = createProperty("valueType", tp_Map_V);
		
		private void installProperties() {
			List<Property> ownedProperties;
			Property property;
		
			ownedProperties = _Collection_Collection_T.getOwnedProperties();
			ownedProperties.add(property = pr_Collection_elementType);
			property.setIsResolveProxies(true);
			property.setIsStatic(true);
			property.setImplementationClass("org.eclipse.ocl.pivot.library.collection.CollectionElementTypeProperty");
			property.setImplementation(org.eclipse.ocl.pivot.library.collection.CollectionElementTypeProperty.INSTANCE);
			ownedProperties.add(property = pr_Collection_lower);
			property.setIsResolveProxies(true);
			property.setIsStatic(true);
			property.setImplementationClass("org.eclipse.ocl.pivot.library.collection.CollectionLowerProperty");
			property.setImplementation(org.eclipse.ocl.pivot.library.collection.CollectionLowerProperty.INSTANCE);
			ownedProperties.add(property = pr_Collection_upper);
			property.setIsResolveProxies(true);
			property.setIsStatic(true);
			property.setImplementationClass("org.eclipse.ocl.pivot.library.collection.CollectionUpperProperty");
			property.setImplementation(org.eclipse.ocl.pivot.library.collection.CollectionUpperProperty.INSTANCE);
		
			ownedProperties = _Enumeration.getOwnedProperties();
			ownedProperties.add(property = pr_Enumeration_allLiterals);
			property.setIsResolveProxies(true);
			property.setIsStatic(true);
			property.setOpposite(pr_EnumerationLiteral_Enumeration_allLiterals);
			property.setImplementationClass("org.eclipse.ocl.pivot.library.enumeration.EnumerationOwnedLiteralProperty");
			property.setImplementation(org.eclipse.ocl.pivot.library.enumeration.EnumerationOwnedLiteralProperty.INSTANCE);
		
			ownedProperties = _EnumerationLiteral.getOwnedProperties();
			ownedProperties.add(property = pr_EnumerationLiteral_Enumeration_allLiterals);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Enumeration_allLiterals);
		
			ownedProperties = _Map_Map_K_Map_V.getOwnedProperties();
			ownedProperties.add(property = pr_Map_keyType);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setIsStatic(true);
			property.setImplementationClass("org.eclipse.ocl.pivot.library.map.MapKeyTypeProperty");
			property.setImplementation(org.eclipse.ocl.pivot.library.map.MapKeyTypeProperty.INSTANCE);
			ownedProperties.add(property = pr_Map_valueType);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setIsStatic(true);
			property.setImplementationClass("org.eclipse.ocl.pivot.library.map.MapValueTypeProperty");
			property.setImplementation(org.eclipse.ocl.pivot.library.map.MapValueTypeProperty.INSTANCE);
		}
		
		private void installTemplateBindings() {
			_Bag_Bag_collectNested_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Bag_T, tp_Bag_collectNested_V)));
			_Bag_Bag_collect_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Bag_T, tp_Bag_collect_V)));
			_Bag_Bag_flatten_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Bag_T, tp_Bag_flatten_T2)));
			_Bag_Bag_selectByKind_TT_NullFree.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Bag_T, tp_Bag_selectByKind_TT)));
			_Bag_Bag_selectByType_TT_NullFree.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Bag_T, tp_Bag_selectByType_TT)));
			_Bag_Collection_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Bag_T, tp_Collection_T)));
			_Bag_Enumeration.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Bag_T, _Enumeration)));
			_Bag_Map_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Bag_T, tp_Map_V)));
			_Bag_Set_collectNested_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Bag_T, tp_Set_collectNested_V)));
			_Bag_Set_collect_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Bag_T, tp_Set_collect_V)));
			_Collection_Integer.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, _Integer)));
			_Collection_String.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, _String)));
			_Collection_Tuple.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, _Tuple)));
			_Collection_Bag_collectNested_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Bag_collectNested_V)));
			_Collection_Bag_collect_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Bag_collect_V)));
			_Collection_Bag_flatten_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Bag_flatten_T2)));
			_Collection_Bag_selectByKind_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Bag_selectByKind_TT)));
			_Collection_Bag_selectByType_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Bag_selectByType_TT)));
			_Collection_Bag_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Bag_T)));
			_Collection_Collection_collectNested_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Collection_collectNested_V)));
			_Collection_Collection_collect_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Collection_collect_V)));
			_Collection_Collection_excludesAll_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Collection_excludesAll_T2)));
			_Collection_Collection_flatten_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Collection_flatten_T2)));
			_Collection_Collection_includesAll_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Collection_includesAll_T2)));
			_Collection_Collection_product_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Collection_product_T2)));
			_Collection_Collection_selectByKind_TT_NullFree.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Collection_selectByKind_TT)));
			_Collection_Collection_selectByType_TT_NullFree.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Collection_selectByType_TT)));
			_Collection_Collection_T_1.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Collection_T)));
			_Collection_EnumerationLiteral.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, _EnumerationLiteral)));
			_Collection_Enumeration.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, _Enumeration)));
			_Collection_Map_excludesAll_K2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Map_excludesAll_K2)));
			_Collection_Map_includesAll_K2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Map_includesAll_K2)));
			_Collection_Map_K.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Map_K)));
			_Collection_Map_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Map_V)));
			_Collection_OclAny.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, _OclAny)));
			_Collection_OclElement.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, _OclElement)));
			_Collection_OclSelf.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, _OclSelf)));
			_Collection_OrderedCollection_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_OrderedCollection_T)));
			_Collection_OrderedSet_collectNested_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_OrderedSet_collectNested_V)));
			_Collection_OrderedSet_collect_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_OrderedSet_collect_V)));
			_Collection_OrderedSet_flatten_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_OrderedSet_flatten_T2)));
			_Collection_OrderedSet_selectByKind_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_OrderedSet_selectByKind_TT)));
			_Collection_OrderedSet_selectByType_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_OrderedSet_selectByType_TT)));
			_Collection_OrderedSet_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_OrderedSet_T)));
			_Collection_Sequence_collectNested_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Sequence_collectNested_V)));
			_Collection_Sequence_collect_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Sequence_collect_V)));
			_Collection_Sequence_flatten_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Sequence_flatten_T2)));
			_Collection_Sequence_selectByKind_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Sequence_selectByKind_TT)));
			_Collection_Sequence_selectByType_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Sequence_selectByType_TT)));
			_Collection_Sequence_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Sequence_T)));
			_Collection_Set_collectNested_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Set_collectNested_V)));
			_Collection_Set_collect_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Set_collect_V)));
			_Collection_Set_flatten_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Set_flatten_T2)));
			_Collection_Set_selectByKind_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Set_selectByKind_TT)));
			_Collection_Set_selectByType_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Set_selectByType_TT)));
			_Collection_Set_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_Set_T)));
			_Collection_UniqueCollection_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Collection_T, tp_UniqueCollection_T)));
			_Map_Map_excludesMap_K2_Map_excludesMap_V2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Map_K, tp_Map_excludesMap_K2),
						createTemplateParameterSubstitution(tp_Map_V, tp_Map_excludesMap_V2)));
			_Map_Map_excludingMap_K2_Map_excludingMap_V2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Map_K, tp_Map_excludingMap_K2),
						createTemplateParameterSubstitution(tp_Map_V, tp_Map_excludingMap_V2)));
			_Map_Map_includesMap_K2_Map_includesMap_V2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Map_K, tp_Map_includesMap_K2),
						createTemplateParameterSubstitution(tp_Map_V, tp_Map_includesMap_V2)));
			_Map_Map_includingMap_K2_Map_includingMap_V2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Map_K, tp_Map_includingMap_K2),
						createTemplateParameterSubstitution(tp_Map_V, tp_Map_includingMap_V2)));
			_OrderedCollection_Integer.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, _Integer)));
			_OrderedCollection_String.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, _String)));
			_OrderedCollection_Bag_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_Bag_T)));
			_OrderedCollection_Collection_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_Collection_T)));
			_OrderedCollection_EnumerationLiteral.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, _EnumerationLiteral)));
			_OrderedCollection_OrderedSet_collectNested_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_OrderedSet_collectNested_V)));
			_OrderedCollection_OrderedSet_collect_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_OrderedSet_collect_V)));
			_OrderedCollection_OrderedSet_flatten_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_OrderedSet_flatten_T2)));
			_OrderedCollection_OrderedSet_selectByKind_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_OrderedSet_selectByKind_TT)));
			_OrderedCollection_OrderedSet_selectByType_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_OrderedSet_selectByType_TT)));
			_OrderedCollection_OrderedSet_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_OrderedSet_T)));
			_OrderedCollection_Sequence_collectNested_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_Sequence_collectNested_V)));
			_OrderedCollection_Sequence_collect_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_Sequence_collect_V)));
			_OrderedCollection_Sequence_flatten_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_Sequence_flatten_T2)));
			_OrderedCollection_Sequence_selectByKind_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_Sequence_selectByKind_TT)));
			_OrderedCollection_Sequence_selectByType_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_Sequence_selectByType_TT)));
			_OrderedCollection_Sequence_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_Sequence_T)));
			_OrderedCollection_Set_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_Set_T)));
			_OrderedCollection_UniqueCollection_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedCollection_T, tp_UniqueCollection_T)));
			_OrderedSet_Collection_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedSet_T, tp_Collection_T)));
			_OrderedSet_EnumerationLiteral.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedSet_T, _EnumerationLiteral)));
			_OrderedSet_OrderedSet_flatten_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedSet_T, tp_OrderedSet_flatten_T2)));
			_OrderedSet_OrderedSet_selectByKind_TT_NullFree.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedSet_T, tp_OrderedSet_selectByKind_TT)));
			_OrderedSet_OrderedSet_selectByType_TT_NullFree.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedSet_T, tp_OrderedSet_selectByType_TT)));
			_OrderedSet_Sequence_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedSet_T, tp_Sequence_T)));
			_OrderedSet_Set_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedSet_T, tp_Set_T)));
			_OrderedSet_UniqueCollection_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_OrderedSet_T, tp_UniqueCollection_T)));
			_Sequence_Integer_NullFree.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Sequence_T, _Integer)));
			_Sequence_String.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Sequence_T, _String)));
			_Sequence_Bag_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Sequence_T, tp_Bag_T)));
			_Sequence_Collection_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Sequence_T, tp_Collection_T)));
			_Sequence_OrderedSet_collectNested_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Sequence_T, tp_OrderedSet_collectNested_V)));
			_Sequence_OrderedSet_collect_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Sequence_T, tp_OrderedSet_collect_V)));
			_Sequence_Sequence_collectNested_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Sequence_T, tp_Sequence_collectNested_V)));
			_Sequence_Sequence_collect_V.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Sequence_T, tp_Sequence_collect_V)));
			_Sequence_Sequence_flatten_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Sequence_T, tp_Sequence_flatten_T2)));
			_Sequence_Sequence_selectByKind_TT_NullFree.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Sequence_T, tp_Sequence_selectByKind_TT)));
			_Sequence_Sequence_selectByType_TT_NullFree.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Sequence_T, tp_Sequence_selectByType_TT)));
			_Set_Tuple_NullFree.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Set_T, _Tuple)));
			_Set_Bag_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Set_T, tp_Bag_T)));
			_Set_Collection_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Set_T, tp_Collection_T)));
			_Set_Map_K.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Set_T, tp_Map_K)));
			_Set_OclElement_NullFree.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Set_T, _OclElement)));
			_Set_OclSelf_NullFree.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Set_T, _OclSelf)));
			_Set_OclSelf.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Set_T, _OclSelf)));
			_Set_Set_flatten_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Set_T, tp_Set_flatten_T2)));
			_Set_Set_selectByKind_TT_NullFree.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Set_T, tp_Set_selectByKind_TT)));
			_Set_Set_selectByType_TT_NullFree.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Set_T, tp_Set_selectByType_TT)));
			_Set_UniqueCollection_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_Set_T, tp_UniqueCollection_T)));
			_UniqueCollection_Tuple.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, _Tuple)));
			_UniqueCollection_Bag_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, tp_Bag_T)));
			_UniqueCollection_Collection_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, tp_Collection_T)));
			_UniqueCollection_EnumerationLiteral.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, _EnumerationLiteral)));
			_UniqueCollection_Map_K.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, tp_Map_K)));
			_UniqueCollection_OclAny.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, _OclAny)));
			_UniqueCollection_OclElement.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, _OclElement)));
			_UniqueCollection_OclSelf.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, _OclSelf)));
			_UniqueCollection_OrderedSet_flatten_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, tp_OrderedSet_flatten_T2)));
			_UniqueCollection_OrderedSet_selectByKind_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, tp_OrderedSet_selectByKind_TT)));
			_UniqueCollection_OrderedSet_selectByType_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, tp_OrderedSet_selectByType_TT)));
			_UniqueCollection_OrderedSet_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, tp_OrderedSet_T)));
			_UniqueCollection_Sequence_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, tp_Sequence_T)));
			_UniqueCollection_Set_flatten_T2.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, tp_Set_flatten_T2)));
			_UniqueCollection_Set_selectByKind_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, tp_Set_selectByKind_TT)));
			_UniqueCollection_Set_selectByType_TT.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, tp_Set_selectByType_TT)));
			_UniqueCollection_Set_T.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, tp_Set_T)));
			_UniqueCollection_UniqueCollection_T_1.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(tp_UniqueCollection_T, tp_UniqueCollection_T)));
		}
		
		private void installPrecedences() {
			List<Precedence> ownedPrecedences;
		
			final Precedence prec_ADDITIVE = createPrecedence("ADDITIVE", AssociativityKind.LEFT);
			final Precedence prec_AND = createPrecedence("AND", AssociativityKind.LEFT);
			final Precedence prec_EQUALITY = createPrecedence("EQUALITY", AssociativityKind.LEFT);
			final Precedence prec_IMPLIES = createPrecedence("IMPLIES", AssociativityKind.LEFT);
			final Precedence prec_MULTIPLICATIVE = createPrecedence("MULTIPLICATIVE", AssociativityKind.LEFT);
			final Precedence prec_NAVIGATION = createPrecedence("NAVIGATION", AssociativityKind.LEFT);
			final Precedence prec_OR = createPrecedence("OR", AssociativityKind.LEFT);
			final Precedence prec_RELATIONAL = createPrecedence("RELATIONAL", AssociativityKind.LEFT);
			final Precedence prec_UNARY = createPrecedence("UNARY", AssociativityKind.LEFT);
			final Precedence prec_XOR = createPrecedence("XOR", AssociativityKind.LEFT);
		
			ownedPrecedences = ocl.getOwnedPrecedences();
			ownedPrecedences.add(prec_NAVIGATION);
			ownedPrecedences.add(prec_UNARY);
			ownedPrecedences.add(prec_MULTIPLICATIVE);
			ownedPrecedences.add(prec_ADDITIVE);
			ownedPrecedences.add(prec_RELATIONAL);
			ownedPrecedences.add(prec_EQUALITY);
			ownedPrecedences.add(prec_AND);
			ownedPrecedences.add(prec_OR);
			ownedPrecedences.add(prec_XOR);
			ownedPrecedences.add(prec_IMPLIES);
		
			op_Boolean__lt__gt_.setPrecedence(prec_EQUALITY);
			op_Boolean__eq_.setPrecedence(prec_EQUALITY);
			op_Boolean_and.setPrecedence(prec_AND);
			op_Boolean_implies.setPrecedence(prec_IMPLIES);
			op_Boolean_not.setPrecedence(prec_UNARY);
			op_Boolean_or.setPrecedence(prec_OR);
			op_Boolean_xor.setPrecedence(prec_XOR);
			op_Integer__mul_.setPrecedence(prec_MULTIPLICATIVE);
			op_Integer__add_.setPrecedence(prec_ADDITIVE);
			op_Integer__neg_.setPrecedence(prec_UNARY);
			op_Integer__neg__1.setPrecedence(prec_ADDITIVE);
			op_Integer__div_.setPrecedence(prec_MULTIPLICATIVE);
			op_Real__mul_.setPrecedence(prec_MULTIPLICATIVE);
			op_Real__add_.setPrecedence(prec_ADDITIVE);
			op_Real__neg_.setPrecedence(prec_UNARY);
			op_Real__neg__1.setPrecedence(prec_ADDITIVE);
			op_Real__div_.setPrecedence(prec_MULTIPLICATIVE);
			op_Real__lt__gt_.setPrecedence(prec_EQUALITY);
			op_Real__eq_.setPrecedence(prec_EQUALITY);
			op_String__add_.setPrecedence(prec_ADDITIVE);
			op_String__lt_.setPrecedence(prec_RELATIONAL);
			op_String__lt__eq_.setPrecedence(prec_RELATIONAL);
			op_String__lt__gt_.setPrecedence(prec_EQUALITY);
			op_String__eq_.setPrecedence(prec_EQUALITY);
			op_String__gt_.setPrecedence(prec_RELATIONAL);
			op_String__gt__eq_.setPrecedence(prec_RELATIONAL);
			op_Bag__lt__gt_.setPrecedence(prec_EQUALITY);
			op_Bag__eq_.setPrecedence(prec_EQUALITY);
			op_Collection__lt__gt_.setPrecedence(prec_EQUALITY);
			op_Collection__eq_.setPrecedence(prec_EQUALITY);
			op_Map__lt__gt_.setPrecedence(prec_EQUALITY);
			op_Map__eq_.setPrecedence(prec_EQUALITY);
			op_OclAny__lt__gt_.setPrecedence(prec_EQUALITY);
			op_OclAny__eq_.setPrecedence(prec_EQUALITY);
			op_OclComparable__lt_.setPrecedence(prec_RELATIONAL);
			op_OclComparable__lt__eq_.setPrecedence(prec_RELATIONAL);
			op_OclComparable__gt_.setPrecedence(prec_RELATIONAL);
			op_OclComparable__gt__eq_.setPrecedence(prec_RELATIONAL);
			op_OclInvalid__lt__gt_.setPrecedence(prec_EQUALITY);
			op_OclInvalid__eq_.setPrecedence(prec_EQUALITY);
			op_OclInvalid_and.setPrecedence(prec_AND);
			op_OclInvalid_implies.setPrecedence(prec_IMPLIES);
			op_OclInvalid_or.setPrecedence(prec_OR);
			op_OclTuple__lt__gt_.setPrecedence(prec_EQUALITY);
			op_OclTuple__eq_.setPrecedence(prec_EQUALITY);
			op_OclVoid__lt__gt_.setPrecedence(prec_EQUALITY);
			op_OclVoid__eq_.setPrecedence(prec_EQUALITY);
			op_OclVoid_and.setPrecedence(prec_AND);
			op_OclVoid_implies.setPrecedence(prec_IMPLIES);
			op_OclVoid_or.setPrecedence(prec_OR);
			op_OrderedSet__neg_.setPrecedence(prec_ADDITIVE);
			op_OrderedSet__lt__gt_.setPrecedence(prec_EQUALITY);
			op_OrderedSet__eq_.setPrecedence(prec_EQUALITY);
			op_Sequence__lt__gt_.setPrecedence(prec_EQUALITY);
			op_Sequence__eq_.setPrecedence(prec_EQUALITY);
			op_Set__neg_.setPrecedence(prec_ADDITIVE);
			op_Set__lt__gt_.setPrecedence(prec_EQUALITY);
			op_Set__eq_.setPrecedence(prec_EQUALITY);
			op_UniqueCollection__neg_.setPrecedence(prec_ADDITIVE);
		}
		
		private void installComments() {
			installComment(op_Boolean__lt__gt_, "Returns oclText[true] if the logical value of oclText[self] is the not same as the numeric value of object2, oclText[false] otherwise.");
			installComment(op_Boolean__eq_, "Returns oclText[true] if the logical value of oclText[self] is the same as the numeric value of object2, oclText[false] otherwise.");
			installComment(op_Boolean_allInstances, "Returns oclText[Set{false, true}].");
			installComment(op_Boolean_and, "oclText[false] if either oclText[self] or oclText[b] is oclText[false].\nOtherwise oclText[invalid] if either oclText[self] or oclText[b] is oclText[invalid] .\nOtherwise oclText[null] if either oclText[self] or oclText[b] is oclText[null].\nOtherwise oclText[true].");
			installComment(op_Boolean_implies, "oclText[true] if oclText[self] is oclText[false], or if oclText[b] is oclText[true].\nOtherwise oclText[invalid] if either oclText[self] or oclText[b] is oclText[invalid].\nOtherwise oclText[null] if either oclText[self] or oclText[b] is oclText[null].\nOtherwise oclText[false].");
			installComment(op_Boolean_not, "oclText[true] if oclText[self] is oclText[false].\noclText[false] if oclText[self] is oclText[true].\noclText[null] if oclText[self] is oclText[null].\nOtherwise oclText[invalid].");
			installComment(op_Boolean_or, "oclText[true] if either oclText[self] or oclText[b] is oclText[true].\nOtherwise oclText[invalid] if either oclText[self] or oclText[b] is oclText[invalid].\nOtherwise oclText[null] if either oclText[self] or oclText[b] is oclText[null].\nOtherwise oclText[false].");
			installComment(op_Boolean_toString, "Converts oclText[self] to a string value.");
			installComment(op_Boolean_xor, "oclText[true] if oclText[self] is oclText[true] and oclText[b] is oclText[false], or if oclText[self] is oclText[false] and oclText[b] is oclText[true].\noclText[false] if oclText[self] is oclText[true] and oclText[b] is oclText[true], or if oclText[self] is oclText[false] and oclText[b] is oclText[false].\nOtherwise oclText[invalid] if either oclText[self] or oclText[b] is oclText[invalid].\nOtherwise oclText[null].");
			installComment(op_Integer__mul_, "The value of the multiplication of oclText[self] and i.");
			installComment(op_Integer__add_, "The value of the addition of oclText[self] and i.");
			installComment(op_Integer__neg_, "The negative value of oclText[self].");
			installComment(op_Integer__neg__1, "The value of the subtraction of i from oclText[self].");
			installComment(op_Integer__div_, "The value of oclText[self] divided by i.\nEvaluates to oclText[invalid] if r is equal to zero.");
			installComment(op_Integer_abs, "The absolute value of oclText[self].");
			installComment(op_Integer_div, "The number of times that i fits completely within oclText[self].");
			installComment(op_Integer_max, "The maximum of oclText[self] an i.");
			installComment(op_Integer_min, "The minimum of oclText[self] an i.");
			installComment(op_Integer_mod, "The result is oclText[self] modulo i.");
			installComment(op_Integer_toString, "Converts oclText[self] to a string value.");
			installComment(op_Integer_toUnlimitedNatural, "Converts a non-negative oclText[self] to an UnlimitedNatural value. A negative oclText[self] is converted to oclText[invalid].\nAn automatic coersion may be synthesized if the coercion enables an operation reference to be resolved\nin an expression where no operation was available without coercion.");
			installComment(op_Real__mul_, "The value of the multiplication of oclText[self] and r.");
			installComment(op_Real__add_, "The value of the addition of oclText[self] and r.");
			installComment(op_Real__neg_, "The negative value of oclText[self].");
			installComment(op_Real__neg__1, "The value of the subtraction of r from oclText[self].");
			installComment(op_Real__div_, "The value of oclText[self] divided by r. Evaluates to oclText[invalid] if r is equal to zero.");
			installComment(op_Real__lt__gt_, "Returns oclText[true] if the numeric value of oclText[self] is the not the same as the numeric value of object2, oclText[false] otherwise.");
			installComment(op_Real__eq_, "Returns oclText[true] if the numeric value of oclText[self] is the same as the numeric value of object2, oclText[false] otherwise.");
			installComment(op_Real_abs, "The absolute value of oclText[self].");
			installComment(op_Real_floor, "The largest integer that is less than or equal to oclText[self].");
			installComment(op_Real_max, "The maximum of oclText[self] and r.");
			installComment(op_Real_min, "The minimum of oclText[self] and r.");
			installComment(op_Real_round, "The integer that is closest to oclText[self]. When there are two such integers, the largest one.");
			installComment(op_Real_toString, "Converts oclText[self] to a string value.");
			installComment(op_String__add_, "The concatenation of oclText[self] and s.");
			installComment(op_String__lt_, "True if oclText[self] is less than s, using the locale defined by looking up oclLocale in the current environment.");
			installComment(op_String__lt__eq_, "True if oclText[self] is less than or equal to s, using the locale defined by looking up oclLocale in the current environment.");
			installComment(op_String__gt_, "True if oclText[self] is greater than s, using the locale defined by looking up oclLocale in the current environment.");
			installComment(op_String__gt__eq_, "True if oclText[self] is greater than or equal to s, using the locale defined by looking up oclLocale in the current environment.");
			installComment(op_String_at, "Queries the character at position i in oclText[self].");
			installComment(op_String_characters, "Obtains the characters of oclText[self] as a sequence.");
			installComment(op_String_compareTo, "The comparison of oclText[self] with oclText[that]. -ve if less than, 0 if equal, +ve if greater than.");
			installComment(op_String_concat, "The concatenation of oclText[self] and s.");
			installComment(op_String_endsWith, "Returns true if oclText[self] ends with the string s.\nEvery string ends with the empty string.");
			installComment(op_String_equalsIgnoreCase, "Queries whether s and oclText[self] are equivalent under case-insensitive collation.");
			installComment(op_String_indexOf, "Queries the first index in oclText[self] at which s is a substring of oclText[self], or zero if s is not a substring of oclText[self].\nThe empty string is a substring of every string at index 1 (and also at all other indexes).");
			installComment(op_String_lastIndexOf, "Queries the last in oclText[self] at which s is a substring of oclText[self], or zero if s is not a substring of oclText[self].\nThe empty string is a substring of every string at index oclText[self]-size()+1 (and also at all other indexes).");
			installComment(op_String_matches, "Use a regular expression match and return true if self matches regex, false otherwise.");
			installComment(op_String_replaceAll, "Return a string derived from self by replacing all matches of regex by replacement.");
			installComment(op_String_replaceFirst, "Return a string derived from self by replacing the first match of regex by replacement.");
			installComment(op_String_size, "The number of characters in oclText[self].");
			installComment(op_String_startsWith, "Returns true if oclText[self] starts with the string s.\nEvery string starts with the empty string.");
			installComment(op_String_substituteAll, "Return a string derived from self by replacing all occurrences of oldSubstring by newSubstring.");
			installComment(op_String_substituteFirst, "Return a string derived from self by replacing the first occurrence of oldSubstring by newSubstring.\nReturns invalid if there is no first occurrence.");
			installComment(op_String_substring, "The sub-string of oclText[self] starting at character number lower, up to and including character number upper. Character numbers run from 1 to self.size().");
			installComment(op_String_toBoolean, "Converts oclText[self] to a boolean value.");
			installComment(op_String_toInteger, "Converts oclText[self] to an Integer value.");
			installComment(op_String_toLower, "This is a deprecated variant of toLowerCase() preserving compatibility with traditional Eclipse OCL behaviour.");
			installComment(op_String_toLowerCase, "Converts oclText[self] to lower case, using the locale defined by looking up oclLocale in the current environment.\nOtherwise, returns the same string as oclText[self].");
			installComment(op_String_toReal, "Converts oclText[self] to a Real[1] value.");
			installComment(op_String_toString, "Returns oclText[self].");
			installComment(op_String_toUpper, "This is a deprecated variant of toUpperCase() preserving compatibility with traditional Eclipse OCL behaviour.");
			installComment(op_String_toUpperCase, "Converts oclText[self] to upper case, using the locale defined by looking up oclLocale in the current environment.\nOtherwise, returns the same string as oclText[self].");
			installComment(op_String_tokenize, "Partition oclText[self] into a sequence substrings separated by any of space, line-feed, carriage-return, form-feed and horizontal-tab delimiters.\nThe delimiters are omitted from the return.");
			installComment(op_String_tokenize_1, "Partition oclText[self] into a sequence substrings separated by characters in the delimiters. The delimiters are omitted from the return.");
			installComment(op_String_tokenize_2, "Partition oclText[self] into a sequence substrings separated by characters in the delimiters. If returnDelimeters is\ntrue the returned sequence includes the delimiters, otherwise the delimiters are omitted.");
			installComment(op_String_trim, "Return oclText[self] with leading and trailing whitespace removed.");
			installComment(op_UnlimitedNatural_max, "The maximum of oclText[self] an i.");
			installComment(op_UnlimitedNatural_min, "The minimum of oclText[self] an i.");
			installComment(op_UnlimitedNatural_oclAsType, "Evaluates to oclText[self], where oclText[self] is of the type identified by T.\nThe type T may be any classifier defined in the UML model;\nif the actual type of oclText[self] at evaluation time does not conform to T,\nthen the oclAsType operation evaluates to oclText[invalid].\n\nThe standard behavior is redefined for UnlimitedNatural. Numeric values may be converted to\nReal or Integer, but the e[unlimited] value may not.\nConversion of e[unlimited] to Real or Integer returns oclText[invalid].");
			installComment(op_UnlimitedNatural_toInteger, "Converts oclText[self] to an Integer value unless oclText[self] is oclText[unlimited] in which oclText[self] is converted to oclText[invalid].");
			installComment(ocl, "This clause describes the OCL Standard Library of predefined types, their operations, and predefined expression templates in the OCL.\nThis sub clause contains all standard types defined within OCL, including all the operations defined on those types.\nFor each operation the signature and a description of the semantics is given.\nWithin the description, the reserved word \u2018result\u2019 is used to refer to the value that results from evaluating the operation.\nIn several places, post conditions are used to describe properties of the result.\nWhen there is more than one postcondition, all postconditions must be true.\nA similar thing is true for multiple preconditions.\nIf these are used, the operation is only defined if all preconditions evaluate to oclText[true].\n\nheading:1[Introduction]\n\nThe structure, syntax, and semantics of the OCL is defined in Clauses 8 (\u201CAbstract Syntax\u201D), 9 (\u201CConcrete Syntax\u201D),\nand 10 (\u201CSemantics Described using UML\u201D).\nThis sub clause adds another part to the OCL definition: a library of predefined types and operations.\nAny implementation of OCL must include this library package. This approach has also been taken by e.g., the Java definition,\nwhere the language definition and the standard libraries are both mandatory parts of the complete language definition.\n\nThe OCL standard library defines a number of types.\nIt includes several primitive types: UnlimitedNatural, Integer, Real, String, and Boolean.\nThese are familiar from many other languages. The second part of the standard library consists of the collection types.\nThey are Bag, Set, Sequence, and Collection where Collection is an abstract type.\nNote that all types defined in the OCL standard library are instances of an abstract syntax class.\nThe OCL standard library exists at the modeling level, also referred to as the M1 level, where the abstract syntax is the metalevel or M2 level.\n\nNext to definitions of types the OCL standard library defines a number of template expressions.\nMany operations defined on collections map not on the abstract syntax metaclass FeatureCallExp, but on the IteratorExp.\nFor each of these a template expression that defines the name and format of the expression is defined in 11.8, Predefined Iterator Expressions.\n\nThe Standard Library may be extended with new types, new operations and new iterators.\nIn particular new operations can be defined for collections.\n\nCertain String operations depend on the prevailing locale to ensure that Strings are collated and characters are case-converted\nin an appropriate fashion.\nA locale is defined as a concatenation of up to three character sequences separated by underscores,\nwith the first sequence identifying the language and the second sequence identifying the country.\nThe third sequence is empty but may encode an implementation-specific variant.\nTrailing empty strings and separators may be omitted.\n\nThe character sequences for languages are defined by ISO 639.\n\nThe character sequences for countries are defined by ISO 3166.\n\n\u2018fr_CA\u2019 therefore identifies the locale for the French language in the Canada country.\n\nComparison of strings and consequently the collation order of Collection::sortedBy()\nconforms to the Unicode Collation algorithm defined by Unicode Technical Standard#10.\n\nThe locale is \u2018en_us\u2019 by default but may be configured by a property constraint on OclAny::oclLocale.\n\nThe prevailing locale is defined by the prevailing value of oclLocale within the current environment;\nit may therefore be changed temporarily by using a Let expression.\nlet oclLocale : String = \u2018fr_CA\u2019 in aString.toUpperCase()\n\nheading:1[Iterators]\n\nThis sub clause defines the standard OCL iterator expressions.\nIn the abstract syntax these are all instances of IteratorExp.\nThese iterator expressions always have a collection expression as their source,\nas is defined in the well-formedness rules in Clause 8 (\u201CAbstract Syntax\u201D).\nThe defined iterator expressions are shown per source collection type.\nThe semantics of each iterator expression is defined through a mapping from the iterator to the \u2018iterate\u2019 construct.\nThis means that the semantics of the iterator expressions do not need to be defined separately in the semantics sub clauses.\n\nIn all of the following OCL expressions, the lefthand side of the equals sign is the IteratorExp to be defined,\nand the righthand side of the equals sign is the equivalent as an IterateExp.\nThe names source, body, and iterator refer to the role names in the abstract syntax:\n\nsource\tThe source expression of the IteratorExp.\n\nbody\tThe body expression of the IteratorExp.\n\niterator\tThe iterator variable of the IteratorExp.\n\nresult\tThe result variable of the IterateExp.\n\nheading:2[Extending the Standard Library with Iterator Expressions]\n\nIt is possible to add new iterator expressions in the standard library.\nIf this is done the semantics of a new iterator should be defined by mapping it to existing constructs,\nin the same way the semantics of pre-defined iterators is done (see sub clause 11.9)");
			installComment(op_Bag__eq_, "True if oclText[self] and bag contain the same elements, the same number of times.");
			installComment(it_Bag_closure, "The closure of applying body transitively to every distinct element of the source collection.");
			installComment(it_Bag_collectNested, "The Bag of elements which results from applying body to every member of the source nonordered collection.");
			installComment(op_Bag_excluding, "The bag containing all elements of oclText[self] apart from all occurrences of object.");
			installComment(op_Bag_excludingAll, "The bag containing all elements of oclText[self] apart from all occurrences of all objects.");
			installComment(op_Bag_flatten, "Redefines the Collection operation. If the element type is not a collection type, this results in the same bag as oclText[self].\nIf the element type is a collection type, the result is the bag containing all the elements of all the recursively flattened elements of oclText[self].");
			installComment(op_Bag_including, "The bag containing all elements of oclText[self] plus object.");
			installComment(op_Bag_includingAll, "The bag containing all elements of oclText[self] and objects.");
			installComment(it_Bag_reject, "The sub-bag of the source bag for which body is oclText[false].\n\noclCode[self->reject(iterator | body) = self->select(iterator | not body)].");
			installComment(it_Bag_select, "The sub-bag of the source bag for which body is oclText[true].\n\noclCode[self->select(iterator | body) =\nself->iterate(iterator; result : Bag(T) = Bag{} |\nif body then result->including(iterator)\nelse result\nendif)]");
			installComment(it_Bag_sortedBy, "Results in the Sequence containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c then a < c).");
			installComment(op_Collection__lt__gt_, "True if c is not equal to oclText[self].");
			installComment(op_Collection__eq_, "True if c is a collection of the same kind as oclText[self] and contains the same elements in the same quantities and in the same order,\nin the case of an ordered collection type.");
			installComment(it_Collection_any, "Returns any element in the e[source] collection for which e[body] evaluates to oclText[true].\nReturns oclText[invalid] if the e[body] evaluates to oclText[invalid] for any element,\notherwise if there are one or more elements for which the e[body] is oclText[true],\nan indeterminate choice of one of them is returned, otherwise the result is oclText[invalid].\n\nlet source : Collection(T) = ..., body : Lambda T() : Boolean = ... in\nsource->any(iterator | body) = source->select(iterator | body)->asSequence()->first()");
			installComment(op_Collection_asBag, "The Bag that contains all the elements from oclText[self].");
			installComment(op_Collection_asOrderedSet, "An OrderedSet that contains all the elements from oclText[self], with duplicates removed,\nin an order dependent on the particular concrete collection type.");
			installComment(op_Collection_asSequence, "A Sequence that contains all the elements from oclText[self], in an order dependent on the particular concrete collection type.");
			installComment(op_Collection_asSet, "The Set containing all the elements from oclText[self], with duplicates removed.");
			installComment(it_Collection_collectNested, "The Collection of elements which results from applying body to every member of the source collection.");
			installComment(it_Collection_collect, "The Collection of elements that results from applying body to every member of the source set.\nThe result is flattened. Notice that this is based on collectNested, which can be of different type depending on the type of source.\ncollectNested is defined individually for each subclass of CollectionType.");
			installComment(op_Collection_count, "The number of times that object occurs in the collection oclText[self].");
			installComment(pr_Collection_elementType, "Evaluates to the type of the collection elements.");
			installComment(op_Collection_excludes, "True if object is not an element of oclText[self], oclText[false] otherwise.");
			installComment(op_Collection_excludesAll, "Does oclText[self] contain none of the elements of c2 ?");
			installComment(op_Collection_excluding, "The collection containing all elements of oclText[self] apart from object.");
			installComment(op_Collection_excludingAll, "The collection containing all elements of oclText[self] apart from all occurrences of all objects.");
			installComment(it_Collection_exists_1, "Results in oclText[true] if body evaluates to oclText[true] for at least one element in the source collection.");
			installComment(op_Collection_flatten, "If the element type is not a collection type, this results in the same collection as oclText[self].\nIf the element type is a collection type, the result is a collection containing all the elements of all the recursively flattened elements of oclText[self].");
			installComment(it_Collection_forAll_1, "Results in oclText[true] if the body expression evaluates to oclText[true] for each element in the source collection; otherwise, result is oclText[false].");
			installComment(op_Collection_includes, "True if object is an element of oclText[self], oclText[false] otherwise.");
			installComment(op_Collection_includesAll, "Does oclText[self] contain all the elements of c2 ?");
			installComment(op_Collection_including, "The collection containing all elements of oclText[self] plus object.");
			installComment(op_Collection_includingAll, "The collection containing all elements of oclText[self] and objects.");
			installComment(op_Collection_intersection, "The intersection of oclText[self] and bag; the bag of all elements that are in both oclText[self] and c.");
			installComment(op_Collection_intersection_1, "The intersection of oclText[self] and a unique collection; the set of all elements that are in both oclText[self] and u.");
			installComment(op_Collection_isEmpty, "Is oclText[self] the empty collection?\n\nNote: oclText[null->isEmpty()] returns oclText[true] in virtue of the implicit casting from oclText[null] to oclText[Bag{}].");
			installComment(it_Collection_isUnique, "Results in oclText[true] if body evaluates to a different value for each element in the source collection; otherwise, result is oclText[false].");
			installComment(pr_Collection_lower, "Evaluates to the lower bound on the number of collection elements.");
			installComment(op_Collection_max, "The element with the maximum value of all elements in oclText[self].\nElements must be of a type supporting the max operation.\nThe max operation - supported by the elements - must take one parameter of type T and be both associative and commutative.\nUnlimitedNatural, Integer and Real fulfill this condition.");
			installComment(op_Collection_min, "The element with the minimum value of all elements in oclText[self].\nElements must be of a type supporting the min operation.\nThe min operation - supported by the elements - must take one parameter of type T and be both associative and commutative.\nUnlimitedNatural, Integer and Real fulfill this condition.");
			installComment(op_Collection_notEmpty, "Is oclText[self] not the empty collection?\n\noclText[null->notEmpty()] returns oclText[false] in virtue of the implicit casting from oclText[null] to oclText[Bag{}].");
			installComment(it_Collection_one, "Results in oclText[true] if there is exactly one element in the source collection for which body is oclText[true].");
			installComment(op_Collection_product, "The cartesian product operation of oclText[self] and c2.");
			installComment(it_Collection_reject, "The sub-collection of the source collection for which body is oclText[false].");
			installComment(it_Collection_select, "The sub-collection of the source collection for which body is oclText[true].");
			installComment(op_Collection_size, "The number of elements in the collection oclText[self].");
			installComment(it_Collection_sortedBy, "Results in the Collection containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c then a < c).");
			installComment(op_Collection_sum, "The addition of all elements in oclText[self].\nElements must be of an oclText[OclSummable] type to provide the zero() and sum() operations.\nThe e[sum] operation must be both associative: a.sum(b).sum(c) = a.sum(b.sum(c)), and commutative: a.sum(b) = b.sum(a).\nInteger and Real fulfill this condition.\n\nIf the e[sum] operation is not both associative and commutative, the e[sum] expression is not well-formed,\nwhich may result in unpredictable results during evaluation.\nIf an implementation is able to detect a lack of associativity or commutativity,\nthe implementation may bypass the evaluation and return an oclText[invalid] result.");
			installComment(op_Collection_union, "The bag consisting of all elements in oclText[self] and all elements in c.");
			installComment(pr_Collection_upper, "Evaluates to the upper bound on the number of collection elements.");
			installComment(_Enumeration, "The Enumeration type is the type of an OrderedSet of EnumerationLiteral.");
			installComment(op_Enumeration_allInstances, "Return a set of all enumeration values of oclText[self].");
			installComment(pr_Enumeration_allLiterals, "Evaluates to the literals of the enumeration.");
			installComment(_EnumerationLiteral, "The standard type EnumerationLiteral represents a named constant value of an Enumeration.");
			installComment(op_Map__eq_, "Evaluates to oclText[true] if oclText[self] and s contain the same elements.");
			installComment(op_Map_at, "The value of the map at oclText[key].");
			installComment(op_Map_excludes, "True if oclText[key] is not one of the keys of oclText[self], oclText[false] otherwise.");
			installComment(op_Map_excludes_1, "True if oclText[key] and oclText[value] are not a key-value pair of oclText[self], oclText[false] otherwise.");
			installComment(op_Map_excludesAll, "True if none of the elements of oclText[coll] are keys of oclText[self], oclText[false] otherwise.");
			installComment(op_Map_excludesMap, "True if none of the key-value pairs of oclText[map] are also key-value pairs of oclText[self], oclText[false] otherwise.");
			installComment(op_Map_excludesValue, "True if oclText[value] is not one of the values of oclText[self], oclText[false] otherwise.");
			installComment(op_Map_excluding, "The map containing all key-value pairs of oclText[self] except any whose key is oclText[key].");
			installComment(op_Map_excluding_1, "The map containing all key-value pairs of oclText[self] except any whose key is oclText[key] and whose value is oclText[key].");
			installComment(op_Map_excludingAll, "The map containing all key-value pairs of oclText[self] except any whose key is included in oclText[keys].");
			installComment(op_Map_excludingMap, "The map containing all key-value pairs of oclText[self] except any which is also included in oclText[map].");
			installComment(op_Map_includes, "True if oclText[key] is one of the keys of oclText[self], oclText[false] otherwise.");
			installComment(op_Map_includes_1, "True if oclText[key] and oclText[value] are a key-value pair of oclText[self], oclText[false] otherwise.");
			installComment(op_Map_includesAll, "True if all the elements of oclText[coll] are keys of oclText[self], oclText[false] otherwise.");
			installComment(op_Map_includesMap, "True if all of the key-value pairs of oclText[map] are also key-value pairs of oclText[self], oclText[false] otherwise.");
			installComment(op_Map_includesValue, "True if oclText[value] is one of the values of oclText[self], oclText[false] otherwise.");
			installComment(op_Map_including, "The map containing all of the key-value pairs of oclText[self] and an additional key-value pair for oclText[key] and oclText[value].\nIf oclText[key] is already a key of oclText[self], the old value pair is replaced by oclText[value].");
			installComment(op_Map_includingMap, "The map containing all of the key-value pairs of oclText[self] and oclText[map].\nThe values associated with key-value pairs in oclText[map] replace those in oclText[self] where the same key is used by both maps.");
			installComment(op_Map_isEmpty, "True if oclText[self] is the empty map, oclText[false] otherwise.");
			installComment(pr_Map_keyType, "The key type of the key-value pairs of oclText[self].");
			installComment(op_Map_keys, "A Set comprising all the keys of the key-value pairs in oclText[self].");
			installComment(op_Map_notEmpty, "True if oclText[self] not the empty map, oclText[false] otherwise.");
			installComment(op_Map_size, "The number of key-value pairs in oclText[self].");
			installComment(pr_Map_valueType, "The value type of the key-value pairs of oclText[self].");
			installComment(op_Map_values, "The Bag comprising all the values of the key-value pairs in oclText[self].");
			installComment(_OclAny, "The number of elements in the collection oclText[self].essions.\nOclAny is itself an instance of the metatype AnyType.\n\nAll classes in a UML model inherit all operations defined on OclAny.\nTo avoid name conflicts between properties in the model and the properties inherited from OclAny,\nall names on the properties of OclAny start with \u2018ocl.\u2019\nAlthough theoretically there may still be name conflicts, they can be avoided.\nOne can also use qualification by OclAny (name of the type) to explicitly refer to the OclAny properties.\n\nOperations of OclAny, where the instance of OclAny is called object.");
			installComment(op_OclAny__lt__gt_, "True if oclText[self] is a different object from object2. Infix operator.");
			installComment(op_OclAny__eq_, "True if oclText[self] is the same object as object2. Infix operator.");
			installComment(op_OclAny_oclAsSet, "Returns a Set with oclText[self] as the sole content, unless oclText[self] is oclText[null] in which case returns an empty set,");
			installComment(op_OclAny_oclAsType, "Evaluates to oclText[self], where oclText[self] is of the type identified by T.\nThe type T may be any classifier defined in the UML model;\nif the actual type of oclText[self] at evaluation time does not conform to T,\nthen the oclAsType operation evaluates to oclText[invalid].\n\nIn the case of feature redefinition, casting an object to a supertype of its actual type\ndoes not access the supertype\u2019s definition of the feature;\naccording to the semantics of redefinition, the redefined feature simply does not exist for the object.\nHowever, when casting to a supertype, any features additionally defined by the subtype are suppressed.");
			installComment(op_OclAny_oclIsInState, "Evaluates to oclText[true] if the oclText[self] is in the state identified by statespec.");
			installComment(op_OclAny_oclIsInvalid, "Evaluates to oclText[true] if the oclText[self] is equal to OclInvalid.");
			installComment(op_OclAny_oclIsKindOf, "Evaluates to oclText[true] if the type of oclText[self] conforms to t.\nThat is, oclText[self] is of type t or a subtype of t.");
			installComment(op_OclAny_oclIsNew, "Can only be used in a postcondition.\nEvaluates to oclText[true] if the oclText[self] is created during performing the operation (for instance, it didn\u2019t exist at precondition time).");
			installComment(op_OclAny_oclIsTypeOf, "Evaluates to oclText[true] if oclText[self] is of the type t but not a subtype of t");
			installComment(op_OclAny_oclIsUndefined, "Evaluates to oclText[true] if the oclText[self] is equal to oclText[invalid] or equal to oclText[null].");
			installComment(op_OclAny_oclLog, "Evaluates to the self, with the side effect of generating a log message comprising self.");
			installComment(op_OclAny_oclLog_1, "Evaluates to the self, with the side effect of generating a log message comprising message followed by self.");
			installComment(op_OclAny_oclType, "Evaluates to the type of which oclText[self] is an instance.");
			installComment(op_OclAny_toString, "Returns a string representation of oclText[self].");
			installComment(_OclComparable, "The type OclComparable defines the compareTo operation used by the sortedBy iteration. Only types that provide a derived\ncompareTo implementation may be sorted.");
			installComment(op_OclComparable__lt_, "True if oclText[self] is less than oclText[that].");
			installComment(op_OclComparable__lt__eq_, "True if oclText[self] is less than or equal to oclText[that].");
			installComment(op_OclComparable__gt_, "True if oclText[self] is greater than oclText[that].");
			installComment(op_OclComparable__gt__eq_, "True if oclText[self] is greater than or equal to oclText[that].");
			installComment(op_OclComparable_compareTo, "Return -ve, 0, +ve according to whether self is less than, equal to , or greater than that.\n\nThe compareTo operation should be commutative.");
			installComment(_OclElement, "The type OclElement is the implicit supertype of any user-defined type that has no explicit supertypes. Operations defined\nfor OclElement are therefore applicable to all user-defined types.");
			installComment(op_OclElement_allInstances, "Return a set of all instances of the type and derived types of self.");
			installComment(op_OclElement_oclContainer, "Returns the object for which self is a composed content or null if there is no such object.");
			installComment(op_OclElement_oclContents, "Returns the composed contents of self.");
			installComment(_OclInvalid, "The type OclInvalid is a type that conforms to all other types.\nIt has one single instance, identified as  oclText[invalid].\nAny property call applied on invalid results in oclText[invalid], except for the operations oclIsUndefined() and oclIsInvalid().\nOclInvalid is itself an instance of the metatype InvalidType.");
			installComment(op_OclInvalid__lt__gt_, "Returns oclText[invalid].");
			installComment(op_OclInvalid__eq_, "Returns oclText[invalid].");
			installComment(op_OclInvalid_allInstances, "Returns oclText[invalid].");
			installComment(op_OclInvalid_toString, "Returns \'invalid\'.");
			installComment(_OclLambda, "The type OclLambda is the implicit supertype of all Lambda types. The operations defined for OclLambda\ntherefore apply to all lambda expressions.");
			installComment(_OclMessage, "OclMessage\nThis sub clause contains the definition of the standard type OclMessage.\nAs defined in this sub clause, each ocl message type is actually a template type with one parameter.\n\u2018T\u2019 denotes the parameter.\nA concrete ocl message type is created by substituting an operation or signal for the T.\n\nThe predefined type OclMessage is an instance of MessageType.\nEvery OclMessage is fully determined by either the operation, or signal given as parameter.\nNote that there is conceptually an undefined (infinite) number of these types,\nas each is determined by a different operation or signal.\nThese types are unnamed. Every type has as attributes the name of the operation or signal,\nand either all formal parameters of the operation, or all attributes of the signal.\nOclMessage is itself an instance of the metatype MessageType.\n\nOclMessage has a number of predefined operations, as shown in the OCL Standard Library.");
			installComment(op_OclMessage_hasReturned, "True if type of template parameter is an operation call, and the called operation has returned a value.\nThis implies the fact that the message has been sent. False in all other cases.");
			installComment(op_OclMessage_isOperationCall, "Returns oclText[true] if the OclMessage represents the sending of a UML Operation call.");
			installComment(op_OclMessage_isSignalSent, "Returns oclText[true] if the OclMessage represents the sending of a UML Signal.");
			installComment(op_OclMessage_result, "Returns the result of the called operation, if type of template parameter is an operation call,\nand the called operation has returned a value. Otherwise the oclText[invalid] value is returned.");
			installComment(_OclSelf, "The pseudo-type OclSelf denotes the statically determinate type of oclText[self] in Operation\nand Iteration signatures. Instances of OclSelf are never created.");
			installComment(_OclSummable, "The type OclSummable defines the sum and zero operations used by the Collection::sum iteration. Only types that provide derived\nsum and zero implementations may be summed.");
			installComment(op_OclSummable_sum, "Return the sum of self and that.\n\nThe sum operation should be associative.");
			installComment(op_OclSummable_zero, "Return the \'zero\' value of self to initialize a summation.\n\nzero().sum(self) = self.");
			installComment(_OclTuple, "The type OclTuple is the implicit supertype of all Tuple types. The operations defined for OclTuple\ntherefore apply to all tuples.");
			installComment(_OclType, "The type OclType is the implicit supertype of any UML type. Operations defined\nfor OclType are therefore applicable to all UML types.");
			installComment(op_OclType_conformsTo, "Returns true if type2 conforms to self.");
			installComment(_OclVoid, "The type OclVoid is a type that conforms to all other types except OclInvalid.\nIt has one single instance, identified as oclText[null], that corresponds with the UML LiteralNull value specification.\nAny property call applied on oclText[null] results in oclText[invalid], except for the\noclIsUndefined(), oclIsInvalid(), =(OclAny) and <>(OclAny) operations.\nHowever, by virtue of the implicit conversion to a collection literal,\nan expression evaluating to oclText[null] can be used as source of collection operations (such as \u2018isEmpty\u2019).\nIf the source is the oclText[null] literal, it is implicitly converted to Bag{}.\n\nOclVoid is itself an instance of the metatype VoidType.");
			installComment(op_OclVoid__eq_, "Redefines the OclAny operation, returning oclText[true] if object is oclText[null], oclText[invalid]\nif object is oclText[invalid], oclText[false] otherwise.");
			installComment(op_OclVoid_allInstances, "Returns oclText[Set{null}].");
			installComment(op_OclVoid_toString, "Returns oclText[null].");
			installComment(op_OrderedCollection_at, "The i-th element of ordered collection.");
			installComment(op_OrderedCollection_first, "The first element in oclText[self].");
			installComment(op_OrderedCollection_indexOf, "The index of object obj in the ordered collection.");
			installComment(op_OrderedCollection_last, "The last element in oclText[self].");
			installComment(op_OrderedSet__neg_, "The elements of oclText[self], which are not in s.");
			installComment(op_OrderedSet_append, "The set of elements, consisting of all elements of oclText[self], followed by object.");
			installComment(op_OrderedSet_appendAll, "The set of elements, consisting of all elements of oclText[self], followed by objects.");
			installComment(it_OrderedSet_closure, "The closure of applying body transitively to every distinct element of the source collection.");
			installComment(it_OrderedSet_collectNested, "The sequence of elements that results from applying body to every member of the source ordered collection.");
			installComment(op_OrderedSet_excluding, "The ordered set  containing all elements of oclText[self] apart from object.\n\nThe order of the remaining elements is not changed.");
			installComment(op_OrderedSet_excludingAll, "The ordered set containing all elements of oclText[self] apart from all occurrences of all objects.");
			installComment(op_OrderedSet_including, "The ordered set containing all elements of oclText[self] plus object added as the last element if not already present.");
			installComment(op_OrderedSet_insertAt, "The ordered set consisting of oclText[self] with object present at position index.");
			installComment(op_OrderedSet_prepend, "The sequence consisting of object, followed by all elements in oclText[self].");
			installComment(op_OrderedSet_prependAll, "The sequence consisting of objects, followed by all elements in oclText[self].");
			installComment(it_OrderedSet_reject, "The ordered set of the source ordered set for which body is oclText[false].");
			installComment(op_OrderedSet_reverse, "The ordered set of elements with same elements but with the opposite order.");
			installComment(it_OrderedSet_select, "The ordered set of the source ordered set for which body is oclText[true]");
			installComment(it_OrderedSet_sortedBy, "Results in the ordered set containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c, then a < c).");
			installComment(op_OrderedSet_subOrderedSet, "The sub-set of oclText[self] starting at number lower, up to and including element number upper.");
			installComment(op_Sequence__eq_, "True if oclText[self] contains the same elements as s in the same order.");
			installComment(op_Sequence_append, "The sequence of elements, consisting of all elements of oclText[self], followed by object.");
			installComment(op_Sequence_appendAll, "The sequence of elements, consisting of all elements of oclText[self], followed by objects.");
			installComment(it_Sequence_closure, "The closure of applying body transitively to every distinct element of the source collection.");
			installComment(it_Sequence_collectNested, "The sequence of elements that results from applying body to every member of the source ordered collection.");
			installComment(op_Sequence_excluding, "The sequence containing all elements of oclText[self] apart from all occurrences of object.\n\nThe order of the remaining elements is not changed.");
			installComment(op_Sequence_excludingAll, "The sequence containing all elements of oclText[self] apart from all occurrences of all objects.");
			installComment(op_Sequence_flatten, "Redefines the Collection operation. If the element type is not a collection type, this results in the same sequence as oclText[self].\nIf the element type is a collection type, the result is the sequence containing all the elements\nof all the recursively flattened elements of oclText[self]. The order of the elements is partial.");
			installComment(op_Sequence_including, "The sequence containing all elements of oclText[self] plus object added as the last element.");
			installComment(op_Sequence_insertAt, "The sequence consisting of oclText[self] with object inserted at position index.");
			installComment(op_Sequence_prepend, "The sequence consisting of object, followed by all elements in oclText[self].");
			installComment(op_Sequence_prependAll, "The sequence consisting of objects, followed by all elements in oclText[self].");
			installComment(it_Sequence_reject, "The subsequence of the source sequence for which body is oclText[false].");
			installComment(op_Sequence_reverse, "The sequence containing the same elements but with the opposite order.");
			installComment(it_Sequence_select, "The subsequence of the source sequence for which body is oclText[true].");
			installComment(it_Sequence_sortedBy, "Results in the Sequence containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c then a < c).");
			installComment(op_Sequence_subSequence, "The sub-sequence of oclText[self] starting at number lower, up to and including element number upper.");
			installComment(op_Set__neg_, "The elements of oclText[self], which are not in s.");
			installComment(op_Set__eq_, "Evaluates to oclText[true] if oclText[self] and s contain the same elements.");
			installComment(it_Set_closure, "The closure of applying body transitively to every distinct element of the source collection.");
			installComment(it_Set_collectNested, "The Bag of elements which results from applying body to every member of the source nonordered collection.");
			installComment(op_Set_excluding, "The set containing all elements of oclText[self] without object.");
			installComment(op_Set_excludingAll, "The set containing all elements of oclText[self] apart from all occurrences of all objects.");
			installComment(op_Set_flatten, "Redefines the Collection operation. If the element type is not a collection type, this results in the same set as oclText[self].\nIf the element type is a collection type, the result is the set containing all the elements of all the recursively flattened elements of oclText[self].");
			installComment(op_Set_including, "The set containing all elements of oclText[self] plus object.");
			installComment(op_Set_includingAll, "The set containing all elements of oclText[self] and objects.");
			installComment(it_Set_reject, "The subset of the source set for which body is oclText[false].");
			installComment(it_Set_select, "The subset of set for which expr is oclText[true].");
			installComment(it_Set_sortedBy, "Results in the ordered set containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c, then a < c).");
			installComment(_Type, "The UML Type is the supertype of anything that may be used as a type.");
			installComment(op_Type_conformsTo, "Returns true if type2 conforms to self.");
			installComment(op_UniqueCollection__neg_, "The elements of oclText[self], which are not in s.");
			installComment(op_UniqueCollection_intersection, "The intersection of oclText[self] and c (i.e., the set of all elements that are in both oclText[self] and c).");
			installComment(it_UniqueCollection_sortedBy, "Results in the ordered set containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c, then a < c).");
			installComment(op_UniqueCollection_symmetricDifference, "The set containing all the elements that are in oclText[self] or s, but not in both.");
			installComment(op_UniqueCollection_union, "The set consisting of all elements in oclText[self] and all elements in s.");
		}
	}
}
