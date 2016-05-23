package org.muml.emm.execute;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.options.ParsingOptions;
import org.muml.emm.Constraint;
import org.muml.emm.CreateClass;
import org.muml.emm.CreateInitializer;
import org.muml.emm.FeatureInitializer;
import org.muml.emm.IdentityFeatureInitializer;
import org.muml.emm.Mapping;
import org.muml.emm.Migrator;
import org.muml.emm.OclExpression;
import org.muml.emm.SetFeatureInitializer;
import org.muml.emm.release.Release;
import org.muml.emm.release.ReleaseSet;

public class MigrationExecuter {
    public static org.eclipse.ocl.ecore.OCL OCL_ECORE = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
	protected ResourceSet resourceSet = new ResourceSetImpl();
	protected UuidXMIFactoryImpl xmiFactory = new UuidXMIFactoryImpl();
	protected List<Migrator> migrators = new ArrayList<Migrator>();
	protected Map<String, EPackage> nsUriToEPackage = new HashMap<String, EPackage>();
	protected Map<EClass, List<Mapping>> mappings = new HashMap<EClass, List<Mapping>>();
	protected Map<OclExpression, Query<EClassifier, ?, ?>> expressions = new HashMap<OclExpression, Query<EClassifier, ?, ?>>();
	protected IProgressMonitor monitor;
	
	public MigrationExecuter(List<URI> migratorURIs, IProgressMonitor monitor) {
		resourceSet.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore"), URI.createURI("http://www.eclipse.org/emf/2002/Ecore"));
		resourceSet.getURIConverter().getURIMap().put(URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore"), URI.createURI("http://www.eclipse.org/emf/2002/Ecore"));
		((ResourceSetImpl)resourceSet).setURIResourceMap(new HashMap<URI, Resource>());
		((ResourceSetImpl)resourceSet).getURIResourceMap().put(URI.createURI("http://www.eclipse.org/emf/2002/Ecore"), EcorePackage.eINSTANCE.eResource());
		((ResourceSetImpl)resourceSet).getURIResourceMap().put(URI.createURI("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore"), EcorePackage.eINSTANCE.eResource());
		((ResourceSetImpl)resourceSet).getURIResourceMap().put(URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore"), EcorePackage.eINSTANCE.eResource());
		this.monitor = monitor;
		monitor.beginTask("Migration", 2);
		IProgressMonitor initializeMonitor = new SubProgressMonitor(monitor, 1);
		initializeMonitor.beginTask("Initializing...", 3);
		try {
			IProgressMonitor loadMonitor = new SubProgressMonitor(initializeMonitor, 1);
			loadMonitor.beginTask("Loading Models...", migratorURIs.size());
			for (URI uri : migratorURIs) {
				Resource resource = resourceSet.getResource(uri, true);
				if (resource != null) {
					for (EObject contents : resource.getContents()) {
						if (contents instanceof Migrator) {
							migrators.add((Migrator) contents);
						}
					}
				}
				loadMonitor.worked(1);
			}
			loadMonitor.done();

			IProgressMonitor resolveMonitor = new SubProgressMonitor(initializeMonitor, 1);
			resolveMonitor.beginTask("Resolving Proxies...", resourceSet.getResources().size());
			  List<Resource> resources = resourceSet.getResources();
			for (int i = 0; i < resources.size(); ++i) {
				EcoreUtil.resolveAll(resources.get(i));
				resolveMonitor.worked(1);
		    }
			resolveMonitor.done();
			
			IProgressMonitor prepareMonitor = new SubProgressMonitor(initializeMonitor, 1);
			prepareMonitor.beginTask("Preparing efficient migration...", migrators.size());
			for (Migrator migrator : migrators) {
				for (EPackage p : migrator.getSourcePackages()) {
					nsUriToEPackage.put(p.getNsURI(), p);
				}
				for (EPackage p : migrator.getTargetPackages()) {
					nsUriToEPackage.put(p.getNsURI(), p);
				}
				for (Mapping mapping : migrator.getMappings()) {
					EClass sourceEClass = mapping.getSourceClass();
					if (!mappings.containsKey(sourceEClass)) {
						mappings.put(sourceEClass, new ArrayList<Mapping>());
					}
					mappings.get(sourceEClass).add(mapping);		
				}
				prepareMonitor.worked(1);
			}
			prepareMonitor.done();
	
		} finally {
			initializeMonitor.done();
		}
	
		//resourceSet.setURIConverter(new URICon);
	}

	public List<Release> execute(ISelection selection) {
		List<Release> migratedReleases = new ArrayList<Release>();
		
		IProgressMonitor executeMonitor = new SubProgressMonitor(monitor, 1);
		try {
			EPackage.Registry delegate = resourceSet.getPackageRegistry();
			resourceSet.setPackageRegistry(new EPackageRegistryImpl(delegate) {
				private static final long serialVersionUID = 1L;
				  public EPackage getEPackage(String nsURI){
					  EPackage p = nsUriToEPackage.get(nsURI);
					  if (p != null) {
						  return p;
					  }
					  EPackage pack = super.getEPackage(nsURI);
					  if (pack != null) {
						  throw new UnsupportedOperationException("No Migrator found for Package \"" + pack.getNsURI() + "\". Did you also register an extension for it?");
					  }
					  return pack;
				  }
			});
//			resourceSet.getLoadOptions().put(
//					XMLResource.OPTION_MISSING_PACKAGE_HANDLER,
//					new XMLResource.MissingPackageHandler() {
//						@Override
//						public EPackage getPackage(String nsURI) {
//							return nsUriToEPackage.get(nsURI);
//						}
//					});
	
			List<Resource> initialResources = new ArrayList<Resource>(resourceSet.getResources());
	
			List<Release> releases = null;
			Release currentRelease = null;
			do {
				if (selection instanceof IStructuredSelection) {
					Iterator<?> iterator = ((IStructuredSelection) selection)
							.iterator();
					while (iterator.hasNext()) {
						Object object = iterator.next();
						if (object instanceof IFile) {
							IFile iFile = (IFile) object;
							Map<String, Object> m = resourceSet
									.getResourceFactoryRegistry()
									.getExtensionToFactoryMap();
							m.put(iFile.getFileExtension(), xmiFactory);
							URI uri = URI.createPlatformResourceURI(iFile.getFullPath()
									.toString(), true);
							Resource resource = resourceSet.getResource(uri, true);
							EcoreUtil.resolveAll(resource);
						}
					}
				}
				
				List<Resource> resources = new ArrayList<Resource>();
				for (Resource resource : resourceSet.getResources()) {
					if (!initialResources.contains(resource)) {
						resources.add(resource);
					}
				}
	
				// Search for releases that could have an impact on our files
				if (releases == null) {
					releases = new ArrayList<Release>();
					Set<ReleaseSet> releaseSets = new LinkedHashSet<ReleaseSet>();
					for (Resource resource : resources) {
						for (EObject content : resource.getContents()) {
							List<Migrator> migrators = new ArrayList<Migrator>();
							if (content.eClass() != null && content.eClass().getEPackage() != null) {
								EPackage p = content.eClass().getEPackage();
								for (Migrator m : this.migrators) {
									if (m.getSourcePackages().contains(p)) {
										migrators.add(m);
									}
								}
							}
							List<Mapping> classMappings = mappings.get(content.eClass());
							if (classMappings != null) {
								for (Mapping mapping : classMappings) {
									if (mapping.getMigrator() != null) {
										migrators.add(mapping.getMigrator());
									}
								}
							}
							for (Migrator migrator : migrators) {
								Release release = migrator.getRelease();
								if (release != null) {
									if (release.getReleaseSet() != null) {
										releaseSets.add(release.getReleaseSet());
									}
								}
							}
						}
					}
					for (ReleaseSet releaseSet : releaseSets) {
						releases.addAll(releaseSet.getReleases());
					}
					if (releases.isEmpty()) {
						break;
					}
					executeMonitor.beginTask("Migrating...", releases.size());
				}
	
				// Get the first release and process it
				currentRelease = releases.get(0);
				releases.remove(0);
				executeMonitor.subTask("Migrating Release " + getReleaseLabel(currentRelease));
				
				if (!resources.isEmpty()) {
					if (execute(resources, currentRelease)) {
						migratedReleases.add(currentRelease);
					} else {
						continue;
					}
				}
				for (Resource resource : new ArrayList<Resource>(resourceSet.getResources())) {
					if (!initialResources.contains(resource)) {
						resourceSet.getResources().remove(resource);
					}
				}
				executeMonitor.worked(1);
			} while (!releases.isEmpty());
		} finally {
			executeMonitor.done();
		}
		
		return migratedReleases;
	}

	public static String getReleaseLabel(Release release) {
		StringBuffer buf = new StringBuffer();
		if (release.getReleaseSet() != null && release.getReleaseSet().getName() != null) {
			buf.append(release.getReleaseSet().getName());
		}
		buf.append(' ');
		if (release.getName() != null && !release.getName().isEmpty()) {
			buf.append(release.getName());
		} else {
			buf.append("<unnamed>");
		}
		return buf.toString();
	}

	protected boolean execute(List<Resource> resources, Release release) {
		MigrationCopier copier = new MigrationCopier(release);

		List<Resource> targetResources = new ArrayList<Resource>();
		ResourceSet targetResourceSet = new ResourceSetImpl();
		targetResourceSet.setResourceFactoryRegistry(resourceSet.getResourceFactoryRegistry());
		
		for (Resource sourceResource : resources) {
			Collection<EObject> copies = copier.copyAll(sourceResource.getContents());
			if (!copier.isEmpty()) {
				Resource targetResource = targetResourceSet.createResource(sourceResource.getURI());
				((XMIResource) targetResource).setEncoding(((XMIResource) sourceResource).getEncoding());
				targetResource.getContents().addAll(copies);
				copier.copyIds((XMIResource) sourceResource, (XMIResource) targetResource);
				targetResources.add(targetResource);
			}
		}
		copier.copyReferences();

		for (Resource resource : targetResources) {
			if (resource.getURI().isPlatformResource()) {
				try {
					resource.save(Collections.emptyMap());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return !copier.isEmpty();
	}

	public class UuidXMIFactoryImpl extends XMIResourceFactoryImpl {
		@Override
		public Resource createResource(URI uri) {
			return new XMIResourceImpl(uri) {
				@Override
				protected boolean useUUIDs() {
					return true;
				}
			};
		}
	}
	
	public class SourceToTarget {
		public SourceToTarget(EObject source, EObject target) {
			this.source = source;
			this.target = target;
		}
		public EObject source;
		public EObject target;
	}

	public class MigrationCopier {
		protected Release release;
		protected LinkedHashMap<EObject, EObject> copies = new LinkedHashMap<EObject, EObject>();
		protected Map<CreateInitializer, SourceToTarget> created = new LinkedHashMap<CreateInitializer, SourceToTarget>();
		protected List<EObject> uncopied = new ArrayList<EObject>();
		
		public MigrationCopier(Release release) {
			this.release = release; 
		}
		public boolean isEmpty() {
			return copies.isEmpty();
		}
		public <T> Collection<T> copyAll(Collection<? extends T> eObjects) {
			Collection<T> result = new ArrayList<T>(eObjects.size());
			for (Object object : eObjects) {
				@SuppressWarnings("unchecked")
				T t = (T) copy((EObject) object);
				if (t != null) {
					result.add(t);
				}
			}
			return result;
		}

		public void copyIds(XMIResource sourceResource, XMIResource targetResource) {
			for (EObject source : copies.keySet()) {
				EObject target = copies.get(source);
				String id = sourceResource.getID(source);
				targetResource.setID(target, id);
			}	
		}

		public EObject copy(EObject source) {
			if (source == null) {
				return null;
			}
			
			if (source.eClass().getName().equals("RealtimeStatechartInstance") || source.eClass().getEPackage().getName().contains("runtime")) {
				System.out.println("test");
			}

			// Create Target
			EObject target = null;
			EClass targetEClass = null;
			Mapping targetMapping = findMapping(source, true, false);
			if (targetMapping != null) {
				targetEClass = targetMapping.getTargetClass();
			}
			if (targetEClass != null) {
				target = EcoreUtil.create(targetEClass);
			}

			if (target != null) {
				copies.put(source, target);
				for (Mapping mapping : findMappings(source, true, true)) {
					execute(mapping, source, target);
				}
				return target;
			}
			
			// No mappings found - We return source, but we try to migrate contents.
			if (source.eClass() != null) {
				uncopied.add(source);
				for (EReference reference : source.eClass().getEAllReferences()) {
					if (reference.isContainment()) {
						migrateFeature(source, reference);
					}
				}
			}
			return source;
		}

		private void migrateFeature(EObject source, EStructuralFeature feature) {
			List<Object> originalValues = readFeature(source, feature);
			List<Object> migratedValues = migrate(originalValues, feature);
			writeFeature(source, feature, migratedValues);			
		}
		public void execute(CreateClass createClass, EObject source, EObject target) {
			for (FeatureInitializer initializer : createClass.getFeatureInitializers()) {
				EStructuralFeature targetFeature = initializer.getTargetFeature();
				if (canExecute(initializer, source, target) && !isCrossReference(targetFeature)) {
					execute(initializer, source, target);
				}
			}
		}

		public void execute(FeatureInitializer initializer, EObject source, EObject target) {
			if (initializer instanceof IdentityFeatureInitializer) {
				executeIdentity((IdentityFeatureInitializer) initializer, source, target);
			} else if (initializer instanceof SetFeatureInitializer) {
				executeSet((SetFeatureInitializer) initializer, source, target);
			} else if (initializer instanceof CreateInitializer) {
				executeCreate((CreateInitializer) initializer, source, target);
			}
		}

		protected boolean isCrossReference(EStructuralFeature feature) {
			if (feature instanceof EReference) {
				EReference reference = (EReference) feature;
				return !reference.isContainment() && !reference.isContainer();
			}
			return false;
		}

		protected boolean canExecute(FeatureInitializer initializer, EObject source, EObject target) {
			return isValidFeature(initializer.getTargetFeature());
		}

		protected boolean isValidFeature(EStructuralFeature targetFeature) {
			return targetFeature != null && targetFeature.isChangeable() && !targetFeature.isDerived();
		}
		protected void executeCreate(CreateInitializer create, EObject source, EObject target) {
			if (!checkConstraints(create, source)) {
				return;
			}
			List<Object> targetValues = readFeature(target, create.getTargetFeature());
			EObject newObject = EcoreUtil.create(create.getTargetClass());
			created.put(create, new SourceToTarget(source, newObject));
			for (FeatureInitializer initializer : create.getFeatureInitializers()) {
				execute(initializer, source, newObject);
			}
			targetValues.add(newObject);
			writeFeature(target, create.getTargetFeature(), targetValues);
		}

		protected void executeSet(SetFeatureInitializer set, EObject source, EObject target) {
			List<Object> targetValues = readFeature(target, set.getTargetFeature());

			// evaluate ocl and add values.
			Object result = evaluateOcl(set, source);
			Collection<Object> values = toCollection(result);
			
			// Migrate values
			targetValues.addAll(migrate(values, set.getTargetFeature()));

			writeFeature(target, set.getTargetFeature(), targetValues);
		}

		protected List<Object> toCollection(Object object) {
			if (object instanceof Collection) {
				return new ArrayList<Object>((Collection<?>) object);
			} else if (object != null) {
				return new ArrayList<Object>(Collections.singletonList(object));
			}
			return new ArrayList<Object>();
		}

		public void executeIdentity(IdentityFeatureInitializer identity, EObject source, EObject target) {			
			List<Object> sourceValues = readFeature(source, identity.getSourceFeature());
			List<Object> targetValues = readFeature(target, identity.getTargetFeature());
			targetValues.addAll(migrate(sourceValues, identity.getTargetFeature()));
			writeFeature(target, identity.getTargetFeature(), targetValues);
		}

		protected List<Object> readFeature(EObject eObject, EStructuralFeature feature) {
			Object value = null;
			try {
				value = eObject.eGet(feature, true);
				if (!eObject.eIsSet(feature)) {
					return new ArrayList<Object>();
				}
			} catch (Exception e) {
				// java.lang.IllegalArgumentException: The feature 'null' is not a valid feature
				// -> Problem: Feature that is referenced in migrator does not really exist (metamodel had changed after migrator was created).

				// java.lang.ClassCastException:
				// -> Multiple XMI files that reference each other; one already uses a different metamodel version.

				e.printStackTrace();
			}
			return toCollection(value);
		}

		protected void writeFeature(EObject eObject, EStructuralFeature feature, List<Object> values) {
			if (feature.isDerived() || !feature.isChangeable()) {
				return;
			}
			try {
				if (feature.isMany()) {
					if (values.contains(null)) {
						System.out.println("null?");
					}
					eObject.eSet(feature, values);
				} else if (values.isEmpty()) {
					eObject.eUnset(feature);
				} else {
					eObject.eSet(feature, values.get(0));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public List<Object> migrate(Collection<Object> sourceValues, EStructuralFeature targetFeature) {
			ArrayList<Object> targetValues = new ArrayList<Object>();
			int index = 0;
			for (Object value : sourceValues) {
				if (targetFeature instanceof EAttribute && ((EAttribute) targetFeature).getEAttributeType() instanceof EEnum) {
					EEnum targetEnum = (EEnum) ((EAttribute) targetFeature).getEAttributeType();

					String literal = "";
					if (value instanceof EEnumLiteral) {
						EEnumLiteral sourceLiteral = (EEnumLiteral) value;
						literal = sourceLiteral.getLiteral();
					} else if (value instanceof String) {
						literal = (String) value;
					}

					targetValues.add(index++, targetEnum.getEEnumLiteralByLiteral(literal));
				} else if (value instanceof EObject && targetFeature instanceof EReference) {
					EReference targetReference = (EReference) targetFeature;
					if (targetReference.isContainment()) {
						Object target = copy((EObject) value);
						if (target != null) {
							targetValues.add(index++, target);
						}
					} else if (!targetReference.isContainment() && !targetReference.isContainer()) {
						Object copyValue = copies.get(value);
						if (copyValue == null) {
							if (targetReference.getEType().isInstance(value)) {
								copyValue = value;
							}
						}
						if (copyValue != null) {
							boolean isBidirectional = targetReference.getEOpposite() != null;
							if (isBidirectional && targetValues.contains(copyValue)) {
								// Move implemented by remove & add.
								// TODO: Will this reorder the opposite side again, or does EMF recognize it as a move?
								int oldIndex = targetValues.indexOf(copyValue);
								targetValues.remove(copyValue);
								if (oldIndex < index) {
									targetValues.add(index - 1, copyValue);
								} else {
									targetValues.add(index, copyValue);
								}
							} else {
								targetValues.add(index, copyValue);
								++index;
							}
						}
					}
				
				} else {
					targetValues.add(index, value);
					index++;
				}
			}
			return targetValues;
		}

		public void copyReferences() {
			for (Map.Entry<EObject, EObject> entry : copies.entrySet()) {
				EObject source = entry.getKey();
				EObject target = entry.getValue();
				for (Mapping mapping : findMappings(source, true, true)) {
					for (FeatureInitializer initializer : mapping.getFeatureInitializers()) {
						EStructuralFeature targetFeature = initializer.getTargetFeature();
						if (canExecute(initializer, source, target) && isCrossReference(targetFeature) && !(initializer instanceof CreateInitializer)) {
							execute(initializer, source, target);
						}
					}
				}
			}
			for (Map.Entry<CreateInitializer, SourceToTarget> entry : created.entrySet()) {
				CreateInitializer create = entry.getKey();
				EObject source = entry.getValue().source;
				EObject target = entry.getValue().target;
				for (FeatureInitializer initializer : create.getFeatureInitializers()) {
					EStructuralFeature targetFeature = initializer.getTargetFeature();
					if (canExecute(initializer, source, target) && isCrossReference(targetFeature) && !(initializer instanceof CreateInitializer)) {
						execute(initializer, source, target);
					}
				}
			}

			// The "uncopied" collection is filled with source values for that there are no mappings.
			// The following code would migrate without a mapping, which is not what we want, so disabled now.
//			for (EObject source : uncopied) {
//				for (EReference reference : source.eClass().getEAllReferences()) {
//					if (isCrossReference(reference) && isValidFeature(reference)) {
//						migrateFeature(source, reference);
//					}
//				}
//			}
		}
		

		protected Mapping findMapping(EObject source, boolean executable, boolean superTypes) {
			List<Mapping> mappings = findMappings(source, executable, superTypes);
			if (mappings != null && !mappings.isEmpty()) {
				return mappings.get(0);
			}
			return null;
		}

		protected List<Mapping> findMappings(EObject source, boolean executable, boolean superTypes) {
			List<EClass> types = new ArrayList<EClass>();
			types.add(source.eClass());
			if (superTypes) {
				types.addAll(source.eClass().getEAllSuperTypes());
			}
			List<Mapping> foundMappings = new ArrayList<Mapping>();
			for (EClass type : types) {
				List<Mapping> mappings = MigrationExecuter.this.mappings.get(type);
				if (mappings != null) {
					for (Mapping mapping : mappings) {
						if (mapping.getMigrator().getRelease() == release) {
							if (!executable || checkConstraints(mapping, source)) {
								foundMappings.add(mapping);
							}
						}
					}
				}
			}
			return foundMappings;
		}
	}

	protected boolean checkConstraints(CreateClass createClass, EObject source) {
		for (Constraint constraint : createClass.getConstraints()) {
			Object result = evaluateOcl(constraint, source);
			Collection<?> results;
			if (result instanceof Collection) {
				results = (Collection<?>) result;
			} else {
				results = Collections.singletonList(result);
			}
			for (Object value : results) {
				if (!Boolean.TRUE.equals(value)) {
					return false;
				}
			}
		}
		return true;
	}

	public Object evaluateOcl(OclExpression expression, Object object) {
		Query<EClassifier, ?, ?> query = getQuery(expression);
		if (query != null) {
			return query.evaluate(object);
		}
		return null;
	}

	protected Query<org.eclipse.emf.ecore.EClassifier, ?, ?> createQuery(
			EClassifier context, String ocl) throws ParserException {
		org.eclipse.ocl.ecore.OCL.Helper helper = OCL_ECORE.createOCLHelper();
		helper.setContext(context);
		ParsingOptions.setOption(helper.getEnvironment(),
				ParsingOptions.implicitRootClass(helper.getEnvironment()),
				EcorePackage.Literals.EOBJECT);
		OCLExpression oclExpression = helper.createQuery(ocl);
		if (oclExpression != null) {
			return OCL_ECORE.createQuery(oclExpression);
		}
		return null;
	}

	public Query<org.eclipse.emf.ecore.EClassifier, ?, ?> getQuery(OclExpression expression) {
		if (!expressions.containsKey(expression)) {
			Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = null;
			try {
				query = createQuery(expression.getContext(), expression.getOcl());
			} catch (ParserException e) {
				e.printStackTrace();
			}
			expressions.put(expression, query);
			return query;
		}
		return expressions.get(expression);
	}

}
