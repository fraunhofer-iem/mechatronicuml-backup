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
package de.uni_paderborn.fujaba.umlrt.model.pattern;

import org.eclipse.emf.ecore.EClass;

import de.uni_paderborn.fujaba.umlrt.model.component.ProvidedInterface;
import de.uni_paderborn.fujaba.umlrt.model.component.RequiredInterface;
import de.uni_paderborn.fujaba.umlrt.model.instance.DeploymentElement;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;


/**
 * No comment provided by developer, please add a comment to improve documentation.
 *
 * @author    $Author: alexfupp $
 * @version   $Revision: 2439 $ $Date: 2007-02-14 10:40:53 +0100 (Mi, 14 Feb 2007) $
 * 
 * @model
 */
public interface Channel extends DeploymentElement
{
	/**
	 * @model
	 */
   public EClass getInterfaceClass(); // UMLClass getInterfaceClass();

	/**
	 * @model
	 */
   public int getDirection();

	/**
	 * @model
	 */
   public String getName();

	/**
	 * @model
	 */
   public UMLRealtimeStatechart getStatechart();

	/**
	 * @model
	 */
   public ProvidedInterface getProvidedInterface();

	/**
	 * @model
	 */
   public PatternDiagram getDiagram();

	/**
	 * @model
	 */
   public RequiredInterface getRequiredInterface();

	/**
	 * @model
	 */
   public java.util.List<PortRole> getPortRoles();
}

/*
 * $Log$
 * Revision 1.12  2007/02/14 09:40:51  alexfupp
 * Adjustments to work with fujaba4eclipse.pattern.ui
 *
 * Revision 1.11  2006/11/23 09:09:39  mtt
 * organize imports
 *
 * Revision 1.10  2006/09/14 19:23:31  alexfupp
 * Fixed Compiler Errors
 *
 * Revision 1.9  2006/09/03 13:13:06  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.8  2006/08/13 20:47:28  alexfupp
 * imports organized
 *
 * Revision 1.7  2005/12/01 15:31:18  aseibel
 * bugfix
 *
 */
