package org.muml.uppaal.adapter.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.EMFComparePrettyPrinter;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.After;
import org.junit.Test;

public abstract class Model2Model {
	
	public Model2Model(String source, String reference) {
		
		this.source = URI.createURI(source);
		this.reference = URI.createURI(reference);
		
	}
	
	protected URI source;
	protected URI reference;
	
	private Set<Resource> resources = new HashSet<Resource>();
	
	protected EObject getSource() {
		
		return loadEObjectFromURI(source);
		
	}
	
	protected EObject getReference(URI uri) {
		
		return loadEObjectFromURI(uri);
		
	}
	
	protected abstract EObject getTarget();
	
	@Test
	public void test() {
	    
	    EObject actual = getTarget();
		assertNotNull("Error while generating target model.", actual);
	    
	    EObject expected = getReference(reference);	    
	    assertNotNull("Error while loading reference model.", expected);
	    
	    assertNoDifferences(expected, actual);

	    assertValid(actual);
	    
	}

	protected EObject loadEObjectFromURI(URI uri) {
		
	    ResourceSet resSet = new ResourceSetImpl();
	    	   
	    Resource resource = resSet.getResource(uri.trimFragment(), true);
	
	    resources.add(resource);
	    
	    EObject result = null;
	    
	    if (uri.hasFragment()) {
	    	result = resource.getEObject(uri.fragment());
	    };
	    
	    return result != null ? result : resource.getContents().get(0);
		
	}

	protected static void assertNoDifferences(EObject expected, EObject actual) {
		
		// ignore identifiers
		IMatchEngine.Factory factory = new MatchEngineFactoryImpl(UseIdentifiers.NEVER);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(factory);
		IComparisonScope scope = new DefaultComparisonScope(expected, actual, null);
			
		// avoid order checking for unordered containments 
		IDiffProcessor diffProcessor = new DiffBuilder();
		IDiffEngine diffEngine = new DefaultDiffEngine(diffProcessor) {
			@Override
			protected FeatureFilter createFeatureFilter() {
				return new FeatureFilter() {
					@Override
					public boolean checkForOrderingChanges(EStructuralFeature feature) {
						return feature.isMany() && feature.isOrdered();
					}
				};
			}
		};		
		
		Comparison comparison = EMFCompare.builder().
				setMatchEngineFactoryRegistry(matchEngineRegistry).
				setDiffEngine(diffEngine).
				build().compare(scope);
		
		
		OutputStream stream = new OutputStream() {
						
			private StringBuilder builder = new StringBuilder();
	        
			@Override
	        public void write(int b) throws IOException {
	            builder.append((char) b );
	        }
	
			@Override
	        public String toString(){
	            return builder.toString();
	        }
	    
		};
		
		EMFComparePrettyPrinter.printDifferences(comparison, new PrintStream(stream));
		
		assertTrue(stream.toString(), comparison.getDifferences().isEmpty());
		
	}
	
	protected static void assertValid(EObject eObject) {
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
	    
		IStatus status = BasicDiagnostic.toIStatus(diagnostic);
		
		assertTrue(status.getMessage(), status.isOK());
		
	}
	
	@After
	public void tearDown() {
		
		for(Resource resource : resources) {
			resource.unload();
		}
		
		resources.clear();
		
	}

}