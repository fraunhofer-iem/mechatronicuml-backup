package org.muml.cbs.dependencylanguage.xtext.naming;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.muml.cbs.dependencylanguage.SynthesizableBehavior;
import org.muml.core.NamedElement;

import de.uni_paderborn.fujaba.muml.behavior.BehavioralElement;
import de.uni_paderborn.fujaba.muml.behavior.Operation;
import de.uni_paderborn.fujaba.muml.behavior.Variable;
import de.uni_paderborn.fujaba.muml.component.StaticAtomicComponent;
import de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;

public class MumlQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider{

	/*
	 * Creates QualifiedNames for States, Clocks, Variables and Operations
	 */
	public QualifiedName qualifiedName(NamedElement element){
		BasicEList<String>path = new BasicEList<String>();
		NamedElement oldElement = null;
		while(!element.equals(oldElement)){
			oldElement = element;
			if(element instanceof RealtimeStatechart){
				RealtimeStatechart statechart = ((RealtimeStatechart)element);
				BehavioralElement bElement = statechart.getBehavioralElement();
				if (statechart.getBehavioralElement()!=null && bElement instanceof DiscreteInteractionEndpoint){
					path.add(0,((NamedElement)bElement).getName());
					break;
				}
				
				if(statechart.getParentRegion()!=null){
					path.add(0,statechart.getParentRegion().getName());
					element = statechart.getParentRegion().getParentState();
					continue;
				}
				else{
					if(statechart.getBehavioralElement()!=null){
//						if (bElement instanceof DiscreteInteractionEndpoint){
//							path.add(0,((NamedElement)bElement).getName());
//							break;
//						}
						if(bElement instanceof SynthesizableBehavior){
							path.add(0,"inner");
							break;
						}
						if (bElement instanceof StaticAtomicComponent){
							path.add(0,"error");
							break;
						}
						//This should never been reached. The scope shall only provide ports and inner RealtimeStatecharts.
						path.add(0,"unknown");
					}
					else{
						//This should never been reached. Each RealtimeStatechart should have either a ParentRegion or a BehavioralElement.
						path.add(0,"null");
					}
					break;
				}
			}
			path.add(0,element.getName());
			if(element instanceof State){
				element= ((State)element).getParentStatechart();
				continue;
			}
			if(element instanceof Clock){
				element = ((Clock)element).getStatechart();
				continue;
			}
			if(element instanceof Variable || element instanceof Operation){
				if(element.eContainer() instanceof NamedElement){
					element = (NamedElement) element.eContainer();
					continue;
				}
				else {
					throw new UnsupportedOperationException(element.eContainer()+" was expected to be of Type NamedElement!");
				}
			}
			if(element instanceof SynchronizationChannel){
				element = ((SynchronizationChannel)element).getState();
			}
		}
		return QualifiedName.create(path);
	}
	
	public QualifiedName qualifiedName(Transition transition){
		QualifiedName qname= qualifiedName(transition.getStatechart());
		String priority = "(" + transition.getPriority() + ")";
		String source = "";
		String target = "";
		if(transition.getSource()!=null){
			source = transition.getSource().getName();
		}
		if(transition.getTarget()!=null){
			target = transition.getTarget().getName();
		}
		qname = qname.append(source + priority + "-->" + target);
		return qname;
	}
}
