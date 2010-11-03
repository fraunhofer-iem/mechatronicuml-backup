package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;


import org.eclipse.emf.ecore.EAttribute;


/**
 * <p>
 * This is the implementation of an argument used by a <code>UMLRealtimeInternalEvent</code>. Because of the
 * fact that a <code>UMLRealtimeInternalEvent</code> represents a method call, the <code>UMLRealtimeArgument</code>
 * object can be
 *	1- either an instance of a parameter ( <code>UMLParam</code>) or be a result of a method
 *		 call (or both).
 *	2- or representative for a fix value (see Assignments and Conditions and explanation of
 *		the Attribute rtArgumentOperator)  
 * </p>
 * 
 * <pre>
 *              		  0..n       assignedTo    		    0..1 
 * UMLRealtimeArgument ------------------------------------------ UMLRealtimeArgumentAssignedToUMLAttr
 *              		  assignedArguments      uMLAttrReference 
 *
 *               		0..n     instanceOf    		 0..1
 *  UMLRealtimeArgument ------------------------------------ UMLRealtimeArgumentInstanceOfUMLParam
 *               		argInstances      instanceOfParamRef
 *
 *               		0..n   object    0..1
 *  UMLRealtimeArgument ----------------------- UMLSequenceDiagramObject
 *               		revObject      object
 *
 *			               0..n         arguments          0..1
 * UMLRealtimeArgument ------------------------------------------------ AbstractUMLRealtimeEvent
 *           		     arguments   {ordered}    abstractUMLRealtimeEvent
 *
 *              		0..1   result    0..1
 * UMLRealtimeArgument ----------------------- UMLRealtimeInternalEvent
 *              		result      revResult
 * </pre>
 * 
 * @author $Author: cytom $
 * @last author $Author: cytom $
 * @version $Revision: 3556 $ $Date: 2009-03-22 01:09:39 +0100 (So, 22 Mrz 2009) $
 * 
 * @model
 */
public interface UMLRealtimeArgument // extends UMLDiagramItem
{
	/**
	 * <pre>
	 *               		0..n   attribute    0..1
	 *  UMLRealtimeArgument --------------------------> UMLAttr
	 *               		revArgument			attr
	 *               
	 * <p>
	 * Sets the statement representing this argument. The statement can be an identifier or a
	 * literal. Here are some examples: <code>obj</code> (identifier), <code>'a'</code> (<code>char</code>),
	 * <code>"Text"</code> (<code>String</code>), <code>5</code> (<code>int</code>),
	 * <code>5.0f</code> (<code>float</code>),...
	 * </p>
	 * <p>
	 * <strong>WARNING!</strong> If a <code>UMLAttr</code> is set, then its
	 * object name is returned as the statement representing the argument and setting a new statement
	 * has no effect as long as the <code>UMLAttr</code> is set.
	 * The Value will be obtained from the Attribute later in the simulation
	 * Example : method1( String, String, int) : void - and there is an integer-Attribute 'attr1' in the same Class 
	 * 	--> instances of this method can be : method1("one", "two", 3) or method1("one", "two", attr1)
	 *   
	 * </p>
	 * 
	 * </pre>
	 * 
	 * @model
	 */
   public EAttribute getEAttribute();// UMLAttr getUMLAttr();

	/**
	 * @model
	 */
   public AbstractUMLRealtimeEvent getAbstractUMLRealtimeEvent();

	/**
	 * @model
	 */
   public UMLRealtimeInternalEvent getRevResultEvent();

   /**
    * The name should be used, with this argument is a ResultArgument and is not
    * assigned to any attribute. The name serve in this case to identify this argument and
    * eventually assign it to a local variable or some thing. In other cases make the name
    * nothing important.
    * 
    * @model
    */
   public String getName();
   /**
    * Returns the <code>UMLAttr</code> object that this argument is to Assign to or
    * <code>null</code> if no parameter is referenced. This is only a helper method that uses the
    * <code>UMLArgumentAssignedToUMLAttr</code> object to return the referenced parameter.
    * 
    * @return the <code>UMLAttr</code> object that this argument is to Assign to or
    *         <code>null</code> if no parameter is referenced.
    * @see #setAssignedUMLAttr(UMLAttr)
    * @see #getAssignedUMLAttrReference()
    * @see #setUMLAttrRef(UMLRealtimeArgumentAssignedToUMLAttr)
    * 
    * @model
    */
   public EAttribute getAssignedEAttribute(); // UMLAttr getAssignedUMLAttr();
   /**
    * This String define what to do with the Value of this Argument.
    * There are three Cases.
    * 1-	first and simple: this argument is just a parameter (e.g. in method-parameter, or 
    * 		it is on the left-side of a condition e.g.)
    * 		in this case the operator make nonsense, and should be set on "", so that this
    * 		operator will be ignored
    * 
    * 2-	second: This argument is in case of an assignment. 
    * 		(Assumption: This argument is on the right-side) for example:
    * 		+= if the value of this argument should be added to an attribute-value (replacing i.g. i++)
    * 		:= if the value of this argument should assignment to the attribute (i.e. replacing the old value)
    * 		-= for subtraction	i = attrValue - i
    * 		*= for multiplicity	i = attrValue * i
    * 		/= for division 	i = attrValue / i
    * 		%= for modulo		i = attrValue % i, and so on
    * 
    * 3-	third: This argument is in case of a condition.
    * 		(Assumption: This argument is on the right-side) for example:
    * 		== if the value of this argument should equal the value of an another argument or an
    * 			attribute value. 
    * 		<> if the value of this argument should unequal the value of an another argument or an
    * 			attribute value.
    * 		>, >= for smaller and smaller-or-equal
    * 		<, <= for larger and larger-or-equal
    * For intuitive and graphical understanding, see the class
    * "ModifyUMLRealtimeTransitionWizardPage" (the tabs "Assignments" and "Conditions")
    * 
    * @model
    */
   public String getRtArgumentOperator();
   /**
    * <p>
    * Returns the statement representing this argument. The statement can be an identifier or a
    * literal. Here are some examples: <code>obj</code> (identifier), <code>'a'</code> (<code>char</code>),
    * <code>"Text"</code> (<code>String</code>), <code>5</code> (<code>int</code>),
    * <code>5.0f</code> (<code>float</code>),...
    * </p>
    * <p>
    * <strong>WARNING!</strong> If a <code>UMLAttr</code> is set, then its
    * attribute name is returned as the statement representing the argument and setting a new statement
    * has no effect as long as the <code>UMLAttr</code> is set.
    * </p>
    * 
    * @return the statement representing this argument
    * 
    * @model
    */
   public String getRtArgumentStatement();

   
   /**
    * Returns the <code>UMLParam</code> object that this argument is instance of or
    * <code>null</code> if no parameter is referenced. This is only a helper method that uses the
    * <code>UMLArgumentInstanceOfUMLParam</code> object to return the referenced parameter.
    * 
    * @return the <code>UMLParam</code> object that this argument is instance of or
    *         <code>null</code> if no parameter is referenced.
    * @see #setUMLParam(UMLParam)
    * @see #getInstanceOfRef()
    * @see #setInstanceOfRef(UMLRealtimeArgumentInstanceOfUMLParam)
    * 
    * @model
    */
//   public UMLParam getUMLParam();
   
}
