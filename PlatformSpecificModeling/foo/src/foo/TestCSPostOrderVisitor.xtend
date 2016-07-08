package foo

import org.eclipse.ocl.xtext.completeocl.cs2as.CompleteOCLCSPostOrderVisitor
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS
import org.eclipse.ocl.xtext.base.cs2as.Continuation

class TestCSPostOrderVisitor extends CompleteOCLCSPostOrderVisitor {
	
	new(CS2ASConversion context) {
		super(context)
	}
	
	public def override Continuation<?> visitCompleteOCLDocumentCS(CompleteOCLDocumentCS csElement) {
		return null;
	}
	
}