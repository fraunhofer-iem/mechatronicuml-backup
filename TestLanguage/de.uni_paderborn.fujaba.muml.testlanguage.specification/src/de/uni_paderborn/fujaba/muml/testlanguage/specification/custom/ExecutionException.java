package de.uni_paderborn.fujaba.muml.testlanguage.specification.custom;

public class ExecutionException extends Exception {

	private static final long serialVersionUID = 1643838983512434286L;
	
	Exception wrappedException = null;
	
	public ExecutionException(String message)
	{
		super(message);
	}
	
	public ExecutionException(Exception exception)
	{
		super();
		this.wrappedException = exception;
	}
	
	@Override
	public String getMessage()
	{
		String out;
		if (this.wrappedException != null)
		{
			out = wrappedException.getMessage();
		}
		else
		{
			out = super.getMessage();
		}
		
		// Do we have a result?
		if (out == null)
		{
			return "An unspecified error occured.";
		}
		
		// Trim the result if it is too long. This is necessary because
		// the framework that later adds the markers has a certain limit
		// and will otherwise disrupt the validation. See:
		// org.eclipse.core.internal.resources.MarkerInfo.checkValidAttribute()
		if (out.length() > 10000) {
			out = out.substring(0, 10000);
		}
		
		return out;
	}
	
	@Override
	public void printStackTrace()
	{
		if (this.wrappedException != null)
		{
			this.wrappedException.printStackTrace();
		}
		else
		{
			super.printStackTrace();
		}
	}

}
