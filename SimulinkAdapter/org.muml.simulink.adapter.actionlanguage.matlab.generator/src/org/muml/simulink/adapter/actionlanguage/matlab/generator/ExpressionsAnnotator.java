package org.muml.simulink.adapter.actionlanguage.matlab.generator;

import java.io.BufferedReader;
import java.io.FileReader;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.expression.AbstractExpressionsUsingWorkflowComponent.GlobalVarDef;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.muml.mumlcore.CoreFactory;
import org.muml.mumlcore.CorePackage;
import org.muml.mumlcore.ExtendableElement;
import org.muml.mumlcore.expressions.Expression;
import org.muml.mumlcore.expressions.TextualExpression;
import org.muml.pim.actionlanguage.Block;
import org.muml.pim.behavior.Operation;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pim.behavior.Variable;
import org.muml.pim.realtimestatechart.*;
import org.muml.simulink.adapter.extension.ExtensionFactory;
import org.muml.simulink.adapter.extension.SimulinkAnnotationExtension;

@Deprecated
public class ExpressionsAnnotator extends AbstractWorkflowComponent {

	static EObject root;
	
	@Override
	public void checkConfiguration(Issues arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		
//		root = (EObject) ctx.get("model");
		
		for (TreeIterator<EObject> it = root.eAllContents(); it.hasNext();) {
			
			EObject eObject = it.next();		 						
			if (eObject instanceof Action || eObject instanceof Transition || eObject instanceof Operation || eObject instanceof ParameterBinding || eObject instanceof Variable || eObject instanceof Synchronization) {
				//only annotate Transitions with guards
				if (eObject instanceof Transition){ //Transition
					Transition t = (Transition)eObject;
					if(!(t.getGuard() == null)){
						if(!(t.getGuard() instanceof TextualExpression && !((TextualExpression)t.getGuard()).getLanguage().equals("embedded_matlab"))){
							String slotName = "e" + eObject.hashCode();					
							ctx.set(slotName, eObject);
						}
					}
				}
				//only annotate ParameterBindings for raised AsynchronousMessageEvents
				else if ((eObject instanceof ParameterBinding) && (eObject.eContainer() instanceof Message)){
//					if (!(eObject instanceof TextualExpression && !((TextualExpression)eObject).getLanguage().equals("embedded_matlab"))){
						String slotName = "e" + eObject.hashCode();					
						ctx.set(slotName, eObject);
//					}
				}
				
				//only annotate Synchronizations with selector condition
				else if (eObject instanceof Synchronization){
					Synchronization s = (Synchronization)eObject;
					if (s.getSelectorExpression() != null){
						String slotName = "e" + eObject.hashCode();						
						ctx.set(slotName, eObject);
					}
				}
				
				//only annotate Variables with an Initialze Expression
				else if(eObject instanceof Variable){
					Variable var = (Variable)eObject;
					if(var.getInitializeExpression() != null){
						String slotName = "e" + eObject.hashCode();					
						ctx.set(slotName, eObject);
					}
				}
				
				//don't annotate empty Actions (sometimes empty Block gets created)
				else if (eObject instanceof Action){
					Action a = (Action)eObject;
					Expression e = a.getExpressions().get(0);
					if (e!=null){
						if(e instanceof Block){
							Block b = (Block)e;
							if(!b.getExpressions().isEmpty()){
								String slotName = "e" + eObject.hashCode();	
								ctx.set(slotName, eObject);
							}
						}
						else if (!(e instanceof TextualExpression && !((TextualExpression)e).getLanguage().equals("embedded_matlab"))){
							String slotName = "e" + eObject.hashCode();				
							ctx.set(slotName, eObject);
						}
					}
				}
								
				else if ( !(eObject instanceof TextualExpression && !((TextualExpression)eObject).getLanguage().equals("embedded_matlab"))){
					String slotName = "e" + eObject.hashCode();				
					ctx.set(slotName, eObject);
				}
								
			}
			
		}
		
		for (String slotName : ctx.getSlotNames()) {
			
			if (slotName.equals("model")) {
				continue;
			}
			
			Generator gen = new Generator();
						
			gen.addMetaModel(new EmfRegistryMetaModel());
			
			
			String outletPath = "./src-gen";
			String outputFile = "matlab.txt";
			
			GlobalVarDef output = new GlobalVarDef();
			output.setName("output");
			output.setValue("'" + outputFile + "'");
			
			gen.addGlobalVarDef(output);
			
			Outlet outlet = new Outlet(outletPath);
			outlet.setOverwrite(true);
			
			gen.addOutlet(outlet);
			
				gen.setExpand("template::Template::main FOR " + slotName);
	
			 
			gen.invoke(ctx, monitor, issues);
			
			try {
			
				BufferedReader reader = new BufferedReader(new FileReader(outletPath + "/" + outputFile));
				StringBuffer buffer = new StringBuffer();
				
				String line;
				while ((line = reader.readLine()) != null) {
					
					buffer.append(line);
					
				}
								
				reader.close();
				
				ExtendableElement extendableElement = (ExtendableElement) ctx.get(slotName);
				
				SimulinkAnnotationExtension annotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
				
								
				annotation.setSource("ActionLanguage");
				annotation.getDetails().put("matlab", buffer.toString());
				
				extendableElement.getExtensions().add(annotation);
							
//				extendableElement.eResource().save(Collections.EMPTY_MAP);
								
			} catch(Exception e) {
				e.printStackTrace();
			}	
			
		}
		

	}
	
	public static void setRootNode(EObject obj){
		root = obj;
	}
	
	public static EObject getRootNode(){
		return root;
	}

}
