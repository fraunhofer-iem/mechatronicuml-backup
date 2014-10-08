package de.uni_paderborn.fujaba.simulink.wizard;


import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.msgtype.MessageType;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel;

public class NameAnalysis 
{	
	@SuppressWarnings("rawtypes")
	public final Class[] problematicDotSpaceOrBracketType = new Class[]{//Region.class, 
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
		if(model instanceof Component)
		{
			if(this.nameIsProblematic(((Component)model).getName()))
				return true;
		}
		
		if(this.isPotentialDotSpaceOrBracketProbematicType(model))
		{
			if(this.nameContainsDot(((NamedElement) model).getName()))
				return true;
		}
		
		TreeIterator<EObject> it = EcoreUtil.getAllContents(model, true);
		while(it.hasNext())
			if(this.hasProblematicNames(it.next()))
				return true;
		
		return false;
	}
	
	/**
	 * Replaces problematic names of components in the given model
	 */
	public void replaceProblematicNames(EObject model)
	{
		if(model instanceof Component)
		{
			Component comp = (Component) model;
			if(this.nameIsProblematic(comp.getName()))
				comp.setName(this.replaceName(comp.getName()));
		}		
		
		if(this.isPotentialDotSpaceOrBracketProbematicType(model))
		{
			NamedElement elem = (NamedElement) model;
			if(this.nameContainsDot(elem.getName()))
				elem.setName(this.replaceDot(elem.getName()));
			if(this.nameContainsSpace(elem.getName()))
				elem.setName(this.replaceSpace(elem.getName()));
			if(this.nameContainsBracket(elem.getName())){
				elem.setName(this.replaceOpenBracket(elem.getName()));
				elem.setName(this.replaceCloseBracket(elem.getName()));
			}
		}		
		
		TreeIterator<EObject> it = EcoreUtil.getAllContents(model, true);
		while(it.hasNext())
			this.replaceProblematicNames(it.next());	
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
	private boolean nameIsProblematic(String name)
	{		
		if(name == null || name.matches("^[A-Za-z][A-Za-z0-9]{0,59}$"))
			return false;		
		return true;
	}
	
	private String replaceName(String name)
	{
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
