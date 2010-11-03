package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeArgument;


/**
 * @author $Author: alhawash $
 * @last author $Author: alhawash $
 * @version $Revision: 3533 $ $Date: 2009-03-17 17:54:39 +0100 (Di, 17 Mrz 2009) $
 * 
 * @model abstract="true"
 */
public interface AbstractUMLRealtimeEvent // extends UMLDiagramItem {
{
	/**
	 * @model
	 */
	public String getEventTypeName();

	/**
	 * @model
	 */
	public String getInstance();

	/**
	 * @model
	 */
	public String getName();

	/**
	 * @model abstract="true"
	 */
	public String getFullEventName();

	/**
	 * @model
	 */
	public java.util.List<UMLRealtimeArgument> getRtArguments();

}
