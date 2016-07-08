package foo

import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion
import org.eclipse.ocl.xtext.basecs.util.AbstractExtendingBaseCSVisitor
import org.eclipse.ocl.xtext.basecs.util.VisitableCS

class TestCSPostOrderVisitor extends AbstractExtendingBaseCSVisitor<Object, Object> {
	
	new(CS2ASConversion context) {
		super(context)
	}
	
	/*public def override Continuation<?> visitCompleteOCLDocumentCS(CompleteOCLDocumentCS csElement) {
		return null;
	}*/
	
	override visiting(VisitableCS visitable) {
		throw new UnsupportedOperationException("TODO: MH: auto-generated method stub")
	}
	
}