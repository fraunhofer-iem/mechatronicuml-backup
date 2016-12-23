package org.muml.simulink.adapter.wizard;


import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.core.NamedElement;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.component.Component;
import org.muml.pim.component.Port;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.SynchronizationChannel;

public class NameAnalysis 
{	
	@SuppressWarnings("rawtypes")
	public final Class[] problematicDotSpaceOrBracketType = new Class[]{ 
														SynchronizationChannel.class,
														MessageType.class,
														ComponentInstance.class,
														Parameter.class,
														Port.class,
														Clock.class,
														RealtimeStatechart.class};
	
	/**
	 * Checks whether the given model has problematic names.
	 */
	public boolean hasProblematicNames(EObject model)
	{
		TreeIterator<EObject> it = EcoreUtil.getAllContents(model, true);
		while(it.hasNext())
			if(nameOfObjectIsProblematic(it.next()))
				return true;
		
		return false;
	}
	
	/**
	 * Checks whether a given object as a problematic name.
	 * @param obj
	 * @return
	 */
	private boolean nameOfObjectIsProblematic(EObject obj){
		if(obj instanceof Component || obj instanceof ComponentInstance)
		{
			if(this.componentNameIsProblematic(((NamedElement)obj).getName()))
				return true;
		}
		
		if(this.isPotentialDotSpaceOrBracketProbematicType(obj))
		{
			String name = ((NamedElement) obj).getName();
			
			if(nameContainsDot(name) || nameContainsSpace(name) || nameContainsBracket(name))
				return true;
		}
		
		return false;
	}
	
	/**
	 * Replaces problematic names of model elements in the given model
	 */
	public void replaceProblematicNames(EObject model)
	{
		TreeIterator<EObject> it = EcoreUtil.getAllContents(model, true);
		while(it.hasNext())
			this.replaceProblematicNameOfObject(it.next());	
	}
	
	/**
	 * Replace problematic name of model element.
	 * @param obj
	 */
	private void replaceProblematicNameOfObject(EObject obj){
		if(obj instanceof Component || obj instanceof ComponentInstance)
		{
			NamedElement compElem = (NamedElement) obj;
			if(this.componentNameIsProblematic(compElem.getName()))
				compElem.setName(this.replaceNameOfComponent(compElem.getName()));
		}		
		
		if(this.isPotentialDotSpaceOrBracketProbematicType(obj))
		{
			NamedElement elem = (NamedElement) obj;
			if(this.nameContainsDot(elem.getName()))
				elem.setName(this.replaceDot(elem.getName()));
			if(this.nameContainsSpace(elem.getName()))
				elem.setName(this.replaceSpace(elem.getName()));
			if(this.nameContainsBracket(elem.getName())){
				elem.setName(this.replaceOpenBracket(elem.getName()));
				elem.setName(this.replaceCloseBracket(elem.getName()));
			}
		}
	}
	
	/**
	 * http://www.mathworks.de/help/toolbox/simulink/mdl_gd/ar_0001filenames.html
	 * http://www.mathworks.de/help/toolbox/simulink/mdl_gd/jc_0201usablecharactersforsubsystemnames.html
	 * http://www.mathworks.de/help/toolbox/simulink/mdl_gd/jc_0211usablecharactersforinportblocksandoutportblocks.html
	 * http://www.mathworks.de/help/toolbox/simulink/mdl_gd/jc_0221usablecharactersforsignallinenames.html
	 * http://www.mathworks.de/help/toolbox/simulink/mdl_gd/jc_0231usablecharactersforblocknames.html
	 * 
	 * "Name Length Requirement
	 *  The name of a referenced model must contain fewer than 60 characters, exclusive of the .mdl suffix. An error occurs if the name of a referenced model is too long."
	 */
	private boolean componentNameIsProblematic(String name)
	{
		//components may not be named "system"
		if (name.toLowerCase().equals("system")){
			return true;
		}
		
		if(name == null || name.matches("^[A-Za-z][A-Za-z0-9]{0,59}$")){
			return false;
		}
		return true;
	}
	
	private String replaceNameOfComponent(String name)
	{
		//special case: name must not be "system" -> prefix with "_"
		if(name.toLowerCase().equals("system")){
			return "_" + name;
		}
		
		//in all other cases, check characters
		StringBuilder retval = new StringBuilder(name.length());
				
		//Replace characters
		char c = name.charAt(0);
		for(int i=0; i < name.length(); i++)
		{
			c = name.charAt(i);
			if(c == '\u00DC') retval.append("Ue");
			else if(c == '\u00FC') retval.append("ue");
			else if(c == '\u00C4') retval.append("Ae");
			else if(c == '\u00E4') retval.append("ae");
			else if(c == '\u00D6') retval.append("Oe");
			else if(c == '\u00F6') retval.append("oe");
			else if(c == '\u00df') retval.append("ss");
			else if( (48 <= c && c <= 57) /*0-9*/ 
					|| (65 <= c && c <= 90) /*A-Z*/
					|| (97 <= c && c <= 122) /*a-z*/)
				retval.append(c);
		}
		
		//First char no 0-9
		c = retval.charAt(0);
		while((48 <= c && c <= 57) /*0-9*/ )
		{
			retval.replace(0, 1, "");
			c = retval.charAt(0);
		}
		
		//Trim to 60 chars
		if(retval.length() > 60)
			retval.replace(60 , retval.length() , "");
		return retval.toString();
	}
	
	private boolean nameContainsDot(String name)
	{
		if(name == null)
			return false;
		return name.contains(".");
	}
	
	private String replaceDot(String name)
	{
		return name.replace(".", "_");
	}
	
	private boolean nameContainsSpace(String name)
	{
		if(name == null)
			return false;
		return name.contains(" ");
	}
	
	private String replaceSpace(String name)
	{
		return name.replace(" ", "_");
	}
	
	private boolean nameContainsBracket(String name)
	{
		if(name == null)
			return false;
		return name.contains(")") || name.contains(")");
	}
	
	private String replaceOpenBracket(String name)
	{		
		return name.replace("(", "_");
	}
	
	private String replaceCloseBracket(String name)
	{
		return name.replace(")", "_");
	}
	
	private boolean isPotentialDotSpaceOrBracketProbematicType(EObject object)
	{
		for(Class<?> c:this.problematicDotSpaceOrBracketType)
			if(c.isInstance(object))
				return true;
		return false;
	}

}
