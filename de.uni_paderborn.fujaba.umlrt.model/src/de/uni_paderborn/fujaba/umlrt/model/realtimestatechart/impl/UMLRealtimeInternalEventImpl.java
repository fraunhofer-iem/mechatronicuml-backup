package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import java.util.List;

import org.eclipse.emf.ecore.EOperation;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeArgument;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeInternalEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;

/**
 * <pre>
 *                		  	 n          	    internalEvents          	0..1
 * UMLRealtimeInternalEvent ---------------------------------------------------- UMLRealtimeTransition
 *                		   uMLRealtimeInternalEvents      uMLRealtimeTransition
 *                
 *                 			*                      		     instanceOf                           1 
 * UMLRealtimeInternalEvent ------------------------------------------------------------------------- UMLRealtimeInternalEventInstanceOfUMLMethod
 *                   		uMLRealtimeInternalEvents      uMLRealtimeInternalEventInstanceOfUMLMethod 
 *
 *			            0..n         arguments      	    0..1
 * UMLRealtimeArgument ------------------------------------------- UMLRealtimeInternalEvent
 *           		    rtArguments   {ordered}    revInternalEvent
 *
 *              		  0..1   	result			0..1
 * UMLRealtimeArgument --------------------------------- UMLRealtimeInternalEvent
 *              		  resultArg      revResultEvent
 * </pre>
 *
 * 
 * @author $Author: alhawash $
 * @last author $Author: alhawash $
 * @version $Revision: 3533 $ $Date: 2009-03-17 17:54:39 +0100 (Di, 17 Mrz 2009) $
 * @generated
 */
public class UMLRealtimeInternalEventImpl implements UMLRealtimeInternalEvent {

	/**
	 * @generated
	 */
	public UMLRealtimeTransition getUMLRealtimeTransition(){return null;}

	/**
	 * @generated
	 */
	public EOperation getEOperation(){return null;} // UMLMethod getUMLMethod(){return null;}

	/**
	 * @generated
	 */
	public UMLRealtimeArgument getResultArg(){return null;}

	/**
	 * @generated
	 */
	public String getEventTypeName() {
		return null;
	}

	/**
	 * @generated
	 */
	public String getInstance() {
		return null;
	}

	/**
	 * @generated
	 */
	public List<UMLRealtimeArgument> getRtArguments() {
		return null;
	}
			
	/*
	 * User defined. 
	 */
	
//	/*
//	 * @see de.uni_paderborn.fujaba.umlrt.realtimestatechart.AbstractUMLRealtimeEvent#getName()
//	 */
//	@Override
	public String getName() 
	{
//		 if(this.uMLRealtimeInternalEventInstanceOfUMLMethod != null && !"INVALID".equals(super.getName()))
//		 {
//			 if (INTERNAL_EVENT_PROPERTY.equals(getEventTypeName())) 
//				 return this.getFullEventName();
//			 else
//				 return "no_method_assigned"; 
//		 }
//		 return super.getName();
		return null;
	}
//	
//	@Override
	public String getFullEventName()
	{
//      if(this.uMLRealtimeInternalEventInstanceOfUMLMethod == null || "INVALID".equals(super.getName())) return super.getName();
//		String entry = "";
//		if(resultArg != null)
//			if(resultArg.getAssignedUMLAttr() != null)
//				entry = resultArg.getAssignedUMLAttr().getName() + " " + resultArg.getRtArgumentOperator() + " ";
//			else entry += getResultArg().getRtArgumentStatement() + " == ";
//		
//		// add methodName and parameter-values
//		entry += getUMLMethod().getName() + "( ";
//		// collect parameters if exist
//		if(sizeOfRtArguments() == 0 && getUMLMethod().sizeOfParam() > 0) return getSignature();
//		Iterator<UMLRealtimeArgument> argumentsIter = iteratorOfRtArguments();
//		while(argumentsIter.hasNext())
//		{
//			UMLRealtimeArgument arg = argumentsIter.next();
//			entry += arg.getRtArgumentStatement() + ", ";
//		}
//		
//		int lastIndexOfComma = entry.lastIndexOf(',') >= 0 ? entry.lastIndexOf(',') : entry.length();
//		entry = entry.substring(0, lastIndexOfComma) + " )";
//		return entry;
		return null;
	}
//
//	/**
//	 * Returns a message signature of this message type in the format required
//	 * by Code-gen and Model Checking plugIn.
//	 * @return
//	 */
	public String getSignature()
	{
//		UMLMethod method = getUMLMethod();
//		String result = super.getName() + "(";
//		Iterator<UMLParam> it = method.iteratorOfParam();
//		while(it.hasNext())
//		{
//			UMLParam param = (UMLParam) it.next();
//			result = result + param.getName() + ":" + param.getParamType().getName() + ", ";
//		}
//		//remove last comma and space if params have been added
//		if (method.sizeOfParam() > 0)
//			result = result.substring(0, result.length()-2);
//
//		result = result + ")";
//
//		return result;
		return null;
	}
//	/**
//	 * Get the a clone of the current UMLRealtimeEvent object
//	 *
//	 * @param rtsc      No description provided
//	 * @param newEvent  No description provided
//	 * @return          The cloned realtimeinternalevent value
//	 */
	public Object clone (UMLRealtimeStatechart rtsc, UMLRealtimeInternalEventImpl newEvent)
	{
//		FProject project=rtsc.getProject();
//		//begin cloning
//		newEvent.setInstance (this.getInstance());
//		newEvent.setName (this.getName());
//
//		//clone UMLRealtimeTransition
//		if (this.getUMLRealtimeTransition() != null)
//		{
//			if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeTransition().hashCode()))
//			{
//				UMLRealtimeTransition tmpTransition = (UMLRealtimeTransition) rtsc.addToCloneObservationMap (this.getUMLRealtimeTransition().hashCode(), project.getFromFactories(UMLRealtimeTransition.class).create(true));
//				newEvent.setUMLRealtimeTransition ((UMLRealtimeTransition) this.getUMLRealtimeTransition().clone (rtsc, tmpTransition));
//			}
//			else
//			{
//				newEvent.setUMLRealtimeTransition ((UMLRealtimeTransition) rtsc.getFromCloneObservationMap (this.getUMLRealtimeTransition().hashCode()));
//			}
//		}
//		return newEvent;
		return null;
	}

}