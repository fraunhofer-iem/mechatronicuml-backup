package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbstractUMLRealtimeEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeArgument;

/**
 * @author $Author: alhawash $
 * @last author $Author: alhawash $
 * @version $Revision: 3533 $ $Date: 2009-03-17 17:54:39 +0100 (Di, 17 Mrz 2009) $
 * @generated
 */
public abstract class AbstractUMLRealtimeEventImpl implements AbstractUMLRealtimeEvent
{
	/**
	 * @generated
	 */
	public String getEventTypeName(){return null;}

	/**
	 * @generated
	 */
	public String getInstance(){return null;}

	/**
	 * @generated
	 */
	public String getName(){return null;}

	/**
	 * @generated
	 */
	abstract public String getFullEventName();

	/**
	 * @generated
	 */
	public java.util.List<UMLRealtimeArgument> getRtArguments(){return null;}

	
	/*
	 * User-defined methods.
	 */
	
	/**
	 * No comment provided by developer, please add a comment to improve documentation.
	 *
	 * @return   No description provided
	 */
	public String toString()
	{
//		if (Utility.isNullOrEmpty (instance))
//		{
//			if (name == null)
//			{
//				return "";
//			}
//			return name;
//		}
//		return  (instance + "." + name);
		return null;
	}	   
//	/**
//	 * {@inheritDoc}
//	 *
//	 * @param v  No description provided
//	 * @param s  No description provided
//	 * @return   No description provided
//	 */
//	public String accept (UMLRealtimeStatechartVisitorInterface v, String s)
//	{
//		return v.visit (this, s);
//	}


}
