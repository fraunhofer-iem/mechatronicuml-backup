package org.muml.simulink.test;

import static org.junit.Assert.fail;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.ocl.ecore.delegate.OCLDelegateDomain;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;
import org.junit.BeforeClass;



public abstract class TestBase {

	/**
	 * Registers all factories(OCL and stuff)
	 */
	@BeforeClass
	public static void init()
	{
		String oclDelegateURI = OCLDelegateDomain.OCL_DELEGATE_URI;
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI, new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,	new OCLValidationDelegateFactory.Global());
	}		
	
	protected static void assertModelIsNotValid(EObject model)
	{
		assertModelIsNotValid(null, model);
	}
	
	
	/**
	 * Asserts whether the given model is invalid or valid
	 * @param message
	 * @param model
	 */
	protected static void assertModelIsNotValid(String message, EObject model)
	{
		BasicDiagnostic chain = new BasicDiagnostic();
		if(Diagnostician.INSTANCE.validate(model,chain))
		{
			if(message == null)
				fail("Model is valid");
			else
				fail(message);
		}
	}
	
	protected static void assertModelIsValid(EObject model)
	{
		assertModelIsValid(null, model);
	}
	
	/**
	 * If no message is given, it gives the cause for the failure.
	 * @param message
	 * @param model
	 */
	protected static void assertModelIsValid(String message, EObject model)
	{
		BasicDiagnostic chain = new BasicDiagnostic();
		if(!Diagnostician.INSTANCE.validate(model,chain))
		{
			if(message == null)
			{
				StringBuffer failMsg = new StringBuffer();
				for(Diagnostic diag: chain.getChildren())
					failMsg.append(diag.getMessage() + " ");
				fail("Model is not valid: " + failMsg);
			}
			else
			{
				fail(message);
			}
		}
	}
}
