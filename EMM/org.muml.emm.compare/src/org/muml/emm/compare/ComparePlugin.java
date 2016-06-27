package org.muml.emm.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.WeightProvider;
import org.eclipse.emf.compare.match.eobject.WeightProviderDescriptorRegistryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.muml.emm.IdentityFeatureInitializer;
import org.muml.emm.Mapping;
import org.muml.emm.MigrationFactory;
import org.muml.emm.Migrator;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ComparePlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.muml.emm.compare"; //$NON-NLS-1$

	// The shared instance
	private static ComparePlugin plugin;
	
	/**
	 * The constructor
	 */
	public ComparePlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static ComparePlugin getDefault() {
		return plugin;
	}


	public static void createDefaultMappings(final Migrator migrator) {
		IMatchEngine.Factory.Registry registry = MatchEngineFactoryRegistryImpl.createStandaloneInstance();
		WeightProvider.Descriptor.Registry weightProviderRegistry = WeightProviderDescriptorRegistryImpl.createStandaloneInstance();
		final IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE,
				weightProviderRegistry);
		final IComparisonFactory comparisonFactory = new DefaultComparisonFactory(
				new DefaultEqualityHelperFactory());
		final IMatchEngine customMatchEngine = new DefaultMatchEngine(matcher, comparisonFactory) {
			protected void match(Comparison comparison, IComparisonScope scope, org.eclipse.emf.ecore.EObject left, org.eclipse.emf.ecore.EObject right, org.eclipse.emf.ecore.EObject origin, org.eclipse.emf.common.util.Monitor monitor) {
				if (left == migrator && right == migrator) {
					List<EObject> leftEObjects = new ArrayList<EObject>();
					List<EObject> rightEObjects = new ArrayList<EObject>();
					for (EPackage p : migrator.getSourcePackages()) {
						leftEObjects.addAll(getAllContents(p));
					}
					for (EPackage p : migrator.getTargetPackages()) {
						rightEObjects.addAll(getAllContents(p));
					}
					final Iterator<? extends EObject> leftIterator = leftEObjects.iterator();
					final Iterator<? extends EObject> rightIterator = rightEObjects.iterator();
					final Iterator<? extends EObject> originIterator = new ArrayList<EClass>().iterator();
					getEObjectMatcher().createMatches(comparison, leftIterator, rightIterator, originIterator, monitor);					
				} else {
					super.match(comparison, scope, left, right, origin, monitor);
				}
			};
		};
		IMatchEngine.Factory engineFactory = new MatchEngineFactoryImpl() {
		  public IMatchEngine getMatchEngine() {
		    return customMatchEngine;
		  }
		};
		engineFactory.setRanking(20); // default engine ranking is 10, must be higher to override.
		registry.add(engineFactory);
		
		IComparisonScope scope = new DefaultComparisonScope(migrator, migrator, null);
		final Comparison comparison = EMFCompare.builder().setMatchEngineFactoryRegistry(registry).build().compare(scope);
		comparison.getEquivalences();
		
		final List<Mapping> newMappings = new ArrayList<Mapping>();
		for (Match classMatch : comparison.getMatches()) {
			if (classMatch.getLeft() instanceof EClass && classMatch.getRight() instanceof EClass) {
				Mapping mapping = MigrationFactory.eINSTANCE.createMapping();
				EClass leftClass = (EClass) classMatch.getLeft();
				EClass rightClass = (EClass) classMatch.getRight();
				mapping.setSourceClass(leftClass);
				
				if (!rightClass.isAbstract()) {
					mapping.setTargetClass(rightClass);
				}
				
//						for (Diff diff : classMatch.getDifferences()) {
//							if (diff instanceof AttributeChange) {
//							
//							}
//						}
				for (Match featureMatch : classMatch.getSubmatches()) {
					EStructuralFeature leftFeature = (EStructuralFeature) featureMatch.getLeft();
					EStructuralFeature rightFeature = (EStructuralFeature) featureMatch.getRight();

					// Features must be in the correct class
					if (leftFeature != null && !leftFeature.getEContainingClass().isSuperTypeOf(leftClass)) {
						leftFeature = null;
					}
					if (rightFeature != null && !rightFeature.getEContainingClass().isSuperTypeOf(rightClass)) {
						rightFeature = null;
					}
					if (leftFeature == null && rightFeature == null) {
						continue;
					}
					
					// Right Side must be changable!
					if (rightFeature != null && (!rightFeature.isChangeable() || rightFeature.isDerived())) {
						continue;
					}
					IdentityFeatureInitializer identityInitializer = MigrationFactory.eINSTANCE.createIdentityFeatureInitializer();
					identityInitializer.setSourceFeature(leftFeature);
					identityInitializer.setTargetFeature(rightFeature);
					mapping.getFeatureInitializers().add(identityInitializer);
				}
				if (!hasMapping(migrator, mapping)) {
					newMappings.add(mapping);
				}
			}
		}
		
		if (!newMappings.isEmpty()) {	
			EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(migrator);
			editingDomain.getCommandStack().execute(new ChangeCommand(migrator) {
	
				@Override
				protected void doExecute() {
					migrator.getMappings().addAll(newMappings);
				}
			});
		}		
		
	}

	protected static Collection<EObject> getAllContents(EPackage p) {
		List<EObject> allContents= new ArrayList<EObject>();
		TreeIterator<?> iterator = EcoreUtil.getAllProperContents(p, false);
		while (iterator.hasNext()) {
			Object o = iterator.next();
			if (o instanceof EClass || o instanceof EStructuralFeature) {
				allContents.add((EObject) o);
			}
		}
		return allContents;
	}

	public static boolean hasMapping(Migrator migrator, Mapping mapping) {
		for (Mapping existingMapping : migrator.getMappings()) {
			if (isMappingEqual(existingMapping, mapping)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isMappingEqual(Mapping a, Mapping b) {
		return a.getSourceClass() == b.getSourceClass();
		
	}

}
