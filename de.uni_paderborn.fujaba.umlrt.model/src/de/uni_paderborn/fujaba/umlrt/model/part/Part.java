/**
 * 
 */
package de.uni_paderborn.fujaba.umlrt.model.part;


import de.uni_paderborn.fujaba.umlrt.model.component.Component;


/**
 * @author chrome
 * @author Last editor: $chrome$
 * @version $Revision: 2869 $ $Date: 2008-02-25 21:41:18 +0100 (Mo, 25 Feb 2008) $
 * 
 * @model abstract="true"
 */
public interface Part // extends ASGElement
{
//	/**
//	 * @model
//	 */
//   public java.util.List<ReturnDeclaration> getClassifyingPartReturnDeclarations();

	/**
	 * @model
	 */
   public String getName();

//	/**
//	 * @model
//	 */
//   public java.util.List<ComplexParam> getParams();

	/**
	 * @model
	 */
   public Component getParentComponent();

	/**
	 * @model
	 */
   public PartDiagram getPartDiagram();
}

/*
 * $Log$
 * Revision 1.2  2008/02/25 20:41:04  chrome
 * - return values for transformations
 * - several bugfixes
 * Revision 1.1 2008/02/15 17:36:44 chrome last refactorings: - renamed
 * Composite -> Part - SoftwareComponentVariable/Instance Revision 1.1 2008/01/31 21:19:03 chrome -
 * Updated Params and Arguments - Introduced Composite as superclass of Parts and ConnectorTypes -
 * Mapping rules for Params and Aguments
 * 
 */