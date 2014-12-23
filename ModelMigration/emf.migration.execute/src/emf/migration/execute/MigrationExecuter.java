package emf.migration.execute;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import migration.Constraint;
import migration.CreateClass;
import migration.CreateInitializer;
import migration.FeatureInitializer;
import migration.IdentityFeatureInitializer;
import migration.Mapping;
import migration.Migrator;
import migration.OclExpression;
import migration.SetFeatureInitializer;

import org.eclipse.core.resources.IFile;
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
import org.eclipse.emf.ecore.xmi.XMLResource;
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

public class MigrationExecuter {
    public static org.eclipse.ocl.ecore.OCL OCL_ECORE = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
	protected ResourceSet resourceSet = new ResourceSetImpl();
	protected UuidXMIFactoryImpl xmiFactory = new UuidXMIFactoryImpl();
	protected List<Migrator> migrators = new ArrayList<Migrator>();
	protected Map<String, EPackage> nsUriToEPackage = new HashMap<String, EPackage>();
	protected Map<EClass, List<Mapping>> mappings = new HashMap<EClass, List<Mapping>>();
	protected Map<OclExpression, Query<EClassifier, ?, ?>> expressions = new HashMap<OclExpression, Query<EClassifier, ?, ?>>();
	
	
	public MigrationExecuter(List<URI> migratorURIs) {
		for (URI uri : migratorURIs) {
			Resource resource = resourceSet.getResource(uri, true);
			if (resource != null) {
				for (EObject contents : resource.getContents()) {
					if (contents instanceof Migrator) {
						migrators.add((Migrator) contents);
					}
				}
			}
		}
		EcoreUtil.resolveAll(resourceSet);
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
		}
	}

	public void execute(ISelection selection) {
		EPackage.Registry delegate = resourceSet.getPackageRegistry();
		resourceSet.setPackageRegistry(new EPackageRegistryImpl(delegate) {
			private static final long serialVersionUID = 1L;
			  public EPackage getEPackage(String nsURI){
				  EPackage p = nsUriToEPackage.get(nsURI);
				  if (p != null) {
					  return p;
				  }

				  //return EcorePackage.eINSTANCE;
				  EPackage pack = super.getEPackage(nsURI);
				  if (pack != null) {
					  throw new UnsupportedOperationException("No Migrator found for Package \"" + pack.getName() + "\".");
				  }
				  return pack;
			  }
		});
		resourceSet.getLoadOptions().put(
				XMLResource.OPTION_MISSING_PACKAGE_HANDLER,
				new XMLResource.MissingPackageHandler() {
					@Override
					public EPackage getPackage(String nsURI) {
						return nsUriToEPackage.get(nsURI);
					}
				});

		List<Resource> resources = new ArrayList<Resource>();

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
					resources.add(resourceSet.getResource(uri, true));
				}
			}
		}
		if (!resources.isEmpty()) {
			execute(resources);
			for (Resource resource : resources) {
				resourceSet.getResources().remove(resource);
			}
		}
	}

	public void execute(List<Resource> resources) {
		MigrationCopier copier = new MigrationCopier();

		List<Resource> targetResources = new ArrayList<Resource>();
		ResourceSet targetResourceSet = new ResourceSetImpl();
		targetResourceSet.setResourceFactoryRegistry(resourceSet.getResourceFactoryRegistry());
		
		for (Resource sourceResource : resources) {
			Resource targetResource = targetResourceSet.createResource(sourceResource.getURI());
			targetResources.add(targetResource);
			Collection<EObject> copies = copier.copyAll(sourceResource.getContents());
			copier.copyIds((XMIResource) sourceResource, (XMIResource) targetResource);
			targetResource.getContents().addAll(copies);
		}
		copier.copyReferences();

		for (Resource resource : targetResources) {
			try {
				resource.save(Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
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

	public class MigrationCopier extends LinkedHashMap<EObject, EObject> {
		private static final long serialVersionUID = 1L;

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
			for (EObject source : keySet()) {
				EObject target = get(source);
				String id = sourceResource.getID(source);
				targetResource.setID(target, id);
			}	
		}

		public EObject copy(EObject source) {
			if (source == null) {
				return null;
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
				put(source, target);
				for (Mapping mapping : findMappings(source, true, true)) {
					execute(mapping, source, target);
				}
				return target;
			}
			return source;
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
			EStructuralFeature targetFeature = initializer.getTargetFeature();
			return targetFeature != null && targetFeature.isChangeable() && !targetFeature.isDerived();
		}

		protected void executeCreate(CreateInitializer create, EObject source, EObject target) {
			if (!checkConstraints(create, source)) {
				return;
			}
			List<Object> targetValues = readFeature(target, create.getTargetFeature());
			EObject created = EcoreUtil.create(create.getTargetClass());
			for (FeatureInitializer initializer : create.getFeatureInitializers()) {
				execute(initializer, source, created);
			}
			targetValues.add(created);
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
			if (!eObject.eIsSet(feature)) {
				return new ArrayList<Object>();
			}
			return toCollection(eObject.eGet(feature, true));
		}

		protected void writeFeature(EObject eObject, EStructuralFeature feature, List<Object> values) {
			if (feature.isMany()) {
				eObject.eSet(feature, values);
			} else if (values.isEmpty()) {
				eObject.eUnset(feature);
			} else {
				eObject.eSet(feature, values.get(0));
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
						Object copyValue = get(value);
						boolean isBidirectional = targetReference.getEOpposite() != null;
						if (isBidirectional && targetValues.contains(copyValue)) {
							// Move implemented by remove & add.
							// TODO: Will this reorder the opposite side again, or does EMF recognize it as a move?
							targetValues.remove(copyValue);
							targetValues.add(index, copyValue);
						} else {
							targetValues.add(index, copyValue);
							++index;
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
			for (Map.Entry<EObject, EObject> entry : entrySet()) {
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
			List<Mapping> mappings = this.mappings.get(type);
			if (mappings != null) {
				for (Mapping mapping : mappings) {
					if (!executable || checkConstraints(mapping, source)) {
						foundMappings.add(mapping);
					}
				}
			}
		}
		return foundMappings;
	}
}
