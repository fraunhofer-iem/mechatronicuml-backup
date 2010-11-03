/*
 * The FUJABA ToolSuite project:
 *
 *   FUJABA is the acronym for 'From Uml to Java And Back Again'
 *   and originally aims to provide an environment for round-trip
 *   engineering using UML as visual programming language. During
 *   the last years, the environment has become a base for several
 *   research activities, e.g. distributed software, database
 *   systems, modelling mechanical and electrical systems and
 *   their simulation. Thus, the environment has become a project,
 *   where this source code is part of. Further details are avail-
 *   able via http://www.fujaba.de
 *
 *      Copyright (C) 1997-2004 Fujaba Development Group
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free
 *   Software Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 *   MA 02111-1307, USA or download the license under
 *   http://www.gnu.org/copyleft/lesser.html
 *
 * WARRANTY:
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 * Contact adress:
 *
 *   Fujaba Management Board
 *   Software Engineering Group
 *   University of Paderborn
 *   Warburgerstr. 100
 *   D-33098 Paderborn
 *   Germany
 *
 *   URL  : http://www.fujaba.de
 *   email: info@fujaba.de
 *
 */
package de.uni_paderborn.fujaba.umlrt.model.component;


import java.awt.TrayIcon.MessageType;

import org.eclipse.emf.ecore.EClass;

import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstanceDiagram;
import de.uni_paderborn.fujaba.umlrt.model.part.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.model.part.Part;
import de.uni_paderborn.fujaba.umlrt.model.part.PartDiagram;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;


/**
 * Abstract super class for all components that can be inserted into a component diagram.
 * 
 * @author $Author: chrisheinzemann $
 * @version $Revision: 3164 $ $Date: 2008-08-06 16:13:22 +0200 (Mi, 06 Aug 2008) $
 */
	/**
	 * @model
	 */
public interface Component

{
   public final static String SYSTEM_STEREOTYPE = "system";
   
	/**
	 * @model
	 */
   public UMLRealtimeStatechart getUMLRealtimeStatechart();

	/**
	 * @model
	 */
   public java.util.List<Port> getPorts();

	/**
	 * @model
	 */
   public java.util.List<ComponentInstance> getComponentInstances();

	/**
	 * @model
	 */
   public ComponentDiagram getComponentDiagram();

	/**
	 * @model
	 */
   public ComponentInstanceDiagram getComponentInstanceDiagram();

//	/**
//	 * @model
//	 */
//   public InterfaceXMLDataHolder getInterfaceXMLDataHolder();

	/**
	 * @model
	 */
   public String getName();

	/**
	 * @model
	 */
   public ComponentDiagram getParentElement();

//	/**
//	 * @model
//	 */
//   public UMLComponentToUMLClass getUMLComponentToUMLClass();

	/**
	 * @model
	 */
   public EClass getEClass(); // UMLClass getUMLClass();

	/**
	 * @model
	 */
   public java.util.List<ComponentPart> getReferencingComponentParts();

	/**
	 * @model
	 */
   public java.util.List<Part> getParts();

	/**
	 * @model
	 */
   public PartDiagram getPartDiagram ();

//	/**
//	 * @model
//	 */
//   public java.util.List<ComponentActivityDiagram> getRules();

	/**
	 * @model
	 */
   public java.util.List<MessageType> getUnassignedIncomingMessagess();

	/**
	 * @model
	 */
   public java.util.List<EClass> getMustImplementProvidedInterfaces();// java.util.List<MessageInterface> getMustImplementProvidedInterfaces();

	/**
	 * @model
	 */
   public java.util.List<EClass> getMustImplementRequiredInterfaces();// java.util.List<MessageInterface> getMustImplementRequiredInterfaces();

	/**
	 * @model
	 */
   public CompType getType();


   public enum CompType {
	      TYPE_SOFTWARE_COMPONENT,
	      TYPE_HARDWARE_COMPONENT,
	      TYPE_HYBRID_COMPONENT;
	   }
}

/*
 * $Log$
 * Revision 1.72  2008/08/06 14:13:22  chrisheinzemann
 * components need an internal interface to store unassigned messages as they will be deleted when the project is saved
 *
 * Revision 1.71  2008/07/23 15:39:11  chrisheinzemann
 * guarded against NPE
 *
 * Revision 1.70  2008/07/23 07:56:58  chrisheinzemann
 * name of the associated class is changed when the component name changes
 *
 * Revision 1.69  2008/07/21 10:52:57  chrisheinzemann
 * auto-generated name of statechart is adapted to new component name after renaming the component
 *
 * Revision 1.68  2008/07/16 14:35:37  chrisheinzemann
 * guarded against NPE
 *
 * Revision 1.67  2008/07/09 15:15:41  cytom
 * deprecated the 1 to n association ComponentDiagram[components ----- componentDiagram]Component, instead the n to m association FDiagram[elements ----- diagrams]FElement is used
 * to ease programming the methods Component.getFirstComponentDiagram() and ComponentDiagram.getFirstComponent() are added
 *
 * Revision 1.66  2008/06/27 09:14:02  chrisheinzemann
 * added data structures for mandatory interfaces
 *
 * Revision 1.65  2008/06/19 12:02:53  cytom
 * api-changes/-fixes in umlrt2: ConstraintApplicable is an obsolete subset of already implemented FIncrement, so some similar/equal fields/methods exists two times in Constraint and Component with slightly different name, in this first step they get deprecated, next step is to remove them ...
 *
 * Revision 1.64  2008/06/04 14:40:39  cytom
 * implemented an behaviour for setConstraint(null), now all constraints get removed, alternativly we have to remember the previously set constraint and remove only it, but the general problem is the coexistence of setConstraint and addToConstraint ....
 *
 * Revision 1.63  2008/05/30 20:27:22  cytom
 * adapted to changes in FEmptyIterator
 *
 * Revision 1.62  2008/05/29 16:22:22  cytom
 * used FPropHashSet for constraints + made hashsets type-safe + added property annotations
 *
 * Revision 1.61  2008/05/15 09:27:19  chrisheinzemann
 * support for adding messages to a component that are not assigned to an interface
 *
 * Revision 1.60  2008/05/13 14:24:19  chrisheinzemann
 * improved javadoc documentation
 *
 * Revision 1.59  2008/05/08 11:06:59  chrome
 * removed obsolete association
 *
 * Revision 1.58  2008/02/15 17:36:44  chrome
 * last refactorings:
 * - renamed Composite -> Part
 * - SoftwareComponentVariable/Instance
 *
 * Revision 1.57  2008/01/31 21:19:04  chrome
 * - Updated Params and Arguments
 * - Introduced Composite as superclass of Parts and ConnectorTypes
 * - Mapping rules for Params and Aguments
 *
 * Revision 1.56  2007/12/12 14:10:27  chrome
 * provided <<system>>-stereotype
 *
 * Revision 1.55  2007/12/09 15:37:49  mtt
 * toString methods
 *
 * Revision 1.54  2007/11/03 11:44:01  chrome
 * some changes on associations between ComponentType/-Part and ComponentVariable
 *
 * Revision 1.53  2007/11/02 16:44:11  chrome
 * added association between Component and ComponentVariable
 *
 * Revision 1.52  2007/10/31 13:21:12  chrome
 * - first version of transformation metamodel
 * - little corrections in model file
 *
 * Revision 1.51  2007/10/27 13:59:38  chrome
 * changed many associations to compositions
 *  - Delegation- and AssemlblyTypes are deleted if related Port(-Parts) are deleted
 *  - Deleting a Component results in deleting all embedded and referencing Parts and ConnectorTypes
 *
 * Revision 1.50  2007/10/19 13:37:36  chrome
 * changed package structure
 *
 * Revision 1.49  2007/10/18 14:12:50  chrome
 * - Introduced PartDiagram
 * - Changed responsibilities of HierarchicalComponentDiagram
 * Revision 1.48 2007/10/11 15:30:31 chrome First buggy version of
 * ComponentParts Revision 1.47 2007/09/25 18:37:30 alexfupp implemented getParentElement()
 * 
 * Revision 1.46 2007/04/30 12:17:07 mtt add unparse module name
 * 
 * Revision 1.45 2007/04/24 10:26:41 sluzar Fix f�r Bug 898 und Bug 912 Bei der ComponentInstance
 * n�tigen Konstruktor hinzugef�gt Beim Assembly die Interfaces beim L�schvorgang auf null
 * gesetzt
 * 
 * Revision 1.44 2007/04/20 16:39:12 mtt reference from Component to Class refactored using
 * MetaModelIntegration-Pattern
 * 
 * Revision 1.43 2007/04/16 14:07:49 mtt readded standalone gui, compilable using Fujaba 5
 * 
 * Revision 1.42 2006/11/30 13:43:38 alexfupp fix duplication of port instances while loading models
 * 
 * Revision 1.41 2006/11/24 14:36:54 mtt class structure changes to allow distinction between
 * software and hardware models
 * 
 * Revision 1.40 2006/10/05 12:21:45 mtt component is not a class anymore but has a class
 * 
 * Revision 1.39 2006/09/03 19:12:28 alexfupp Fixes for becoming compatibel to Fujaba5 (using
 * factories and using getProject instead of UMLProject.get())
 * 
 * Revision 1.38 2006/08/13 20:47:27 alexfupp imports organized
 * 
 * Revision 1.37 2006/01/30 21:27:40 cytom added firing of property events in setName methods of
 * Component and ComponentInstance, the events are used in UMLRT2ForEclipse to update their figures
 * on name change
 * 
 */
