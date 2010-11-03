package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import org.eclipse.emf.ecore.EOperation;

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
 * 
 * @model
 */
public interface UMLRealtimeInternalEvent extends AbstractUMLRealtimeEvent {

	/**
	 * @model
	 */
	public UMLRealtimeTransition getUMLRealtimeTransition();

	/**
	 * @model
	 */
	public EOperation getEOperation(); // UMLMethod getUMLMethod();

	/**
	 * @model
	 */
	public UMLRealtimeArgument getResultArg();
}