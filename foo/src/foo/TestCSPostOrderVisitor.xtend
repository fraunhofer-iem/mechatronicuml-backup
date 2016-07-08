package foo

import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion
import org.eclipse.ocl.xtext.base.cs2as.Continuation
import org.eclipse.ocl.xtext.essentialocl.cs2as.EssentialOCLCSPostOrderVisitor
import org.eclipse.ocl.xtext.essentialoclcs.ContextCS

//class TestCSPostOrderVisitor extends AbstractExtendingBaseCSVisitor<Object, Object> {
class TestCSPostOrderVisitor extends EssentialOCLCSPostOrderVisitor {
	
	new(CS2ASConversion context) {
		super(context)
	}
	
	/*public def override Continuation<?> visitCompleteOCLDocumentCS(CompleteOCLDocumentCS csElement) {
		return null;
	}*/
	
	public def override Continuation<?> visitContextCS(ContextCS csContext) {
		return null
	}
	
	/*override visiting(VisitableCS visitable) {
		throw new UnsupportedOperationException("TODO: MH: auto-generated method stub")
	}
	
	def override Object visitAttributeCS(AttributeCS object) {
		return visitStructuralFeatureCS(object);
	}*/
	
}