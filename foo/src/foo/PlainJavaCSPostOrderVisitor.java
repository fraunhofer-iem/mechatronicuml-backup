package foo;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS;

import bar.BarCSPostOrderVisitor;

public class PlainJavaCSPostOrderVisitor extends BarCSPostOrderVisitor {

	public PlainJavaCSPostOrderVisitor(@NonNull CS2ASConversion context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Continuation<?> visitCompleteOCLDocumentCS(@NonNull CompleteOCLDocumentCS csElement) {
		return null;
	}

}
