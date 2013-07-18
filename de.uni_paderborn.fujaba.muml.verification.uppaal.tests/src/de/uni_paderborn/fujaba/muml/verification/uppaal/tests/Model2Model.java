package de.uni_paderborn.fujaba.muml.verification.uppaal.tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.EMFComparePrettyPrinter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;

public abstract class Model2Model {
	
	public Model2Model(String source, String reference) {
		
		this.source = URI.createURI(source);
		this.reference = URI.createURI(reference);
		
	}
	
	private URI source;
	private URI reference;
	
	protected EObject getSource() {
		
		return loadEObjectFromURI(source);
		
	}
	
	protected EObject getReference() {
		
		return loadEObjectFromURI(reference);
		
	}
	
	protected abstract EObject getTarget();
	
	@Test
	public void test() {
		
		EObject expected = getReference();
	    EObject actual = getTarget();
	    
	    assertNoDifferences(expected, actual);
	    
	    assertValid(actual);
	    
	}

	protected static EObject loadEObjectFromURI(URI uri) {
		
	    ResourceSet resSet = new ResourceSetImpl();
	    	    
	    Resource resource = resSet.getResource(uri.trimFragment(), true);
	    
	    EObject result = null;
	    
	    if (uri.hasFragment()) {
	    	result = resource.getEObject(uri.fragment());
	    };
	    
	    return result != null ? result : resource.getContents().get(0);
		
	}

	protected static void assertNoDifferences(EObject actual, EObject expected) {
			 
		IComparisonScope scope = new DefaultComparisonScope(expected, actual, null);
		Comparison comparison = EMFCompare.builder().build().compare(scope);
	 		
		OutputStream stream = new OutputStream() {
						
			private StringBuilder string = new StringBuilder();
	        @Override
	        public void write(int b) throws IOException {
	            this.string.append((char) b );
	        }
	
	        public String toString(){
	            return this.string.toString();
	        }
	    
		};
		
		EMFComparePrettyPrinter.printDifferences(comparison, new PrintStream(stream));
		
		assertTrue(stream.toString(), comparison.getDifferences().isEmpty());
		
	}
	
	protected static void assertValid(EObject eObject) {
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
	    assertTrue(BasicDiagnostic.toIStatus(diagnostic).isOK());
		
	}

}