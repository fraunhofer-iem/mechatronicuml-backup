package de.fraunhofer.iem.m4a.iec61131.editor.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionBlockVariableDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVariableDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramVariableDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInitDecl;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.UnsignedInteger;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.ProgramDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.NamedVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesFactory;

public class CreateNewVariable {
	@SuppressWarnings("unchecked")
	public static void createVariable(EObject selectedElement, String name, String value, ISelection selection) {		
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			
		    for (Iterator<Object> iterator = strucSelection.iterator(); iterator.hasNext();) {
		        Object element = iterator.next();
		        
		        if (element != null & element instanceof LibraryElement) {
		        	
	        		Boolean createNew = true;
	        		
					DeclarationsFactory declFactory = DeclarationsFactory.eINSTANCE;
					VariablesFactory varFactory = VariablesFactory.eINSTANCE;
					TypesFactory typesFactory = TypesFactory.eINSTANCE;
					LiteralsFactory literalsFactory = LiteralsFactory.eINSTANCE;
					
					NamedVariable varName = varFactory.createNamedVariable();
					varName.setIdentifier(name);
					
					UnsignedInteger integerLiteral = literalsFactory.createUnsignedInteger();
					integerLiteral.setValue(value);
					
					SimpleSpecInit simpleSpecInit = typesFactory.createSimpleSpecInit();
					simpleSpecInit.setValue(integerLiteral);
					
					Var2SpecInitDecl var2Spec = declFactory.createVar2SpecInitDecl();
					var2Spec.setVariableName(varName);
					var2Spec.setSpecInit(simpleSpecInit);
					
		        	if (element instanceof ProgramDeclaration){
		        		ProgramDeclaration libElement = (ProgramDeclaration)element;
		        		EList<ProgramVariableDeclaration> list = libElement.getDeclarations();
		        		
		        		for (ProgramVariableDeclaration listElement : list) {
		        			
							if(listElement instanceof InputVarContainer){
								createNew = false;
								InputVarContainer inputDecl = (InputVarContainer)listElement;
								
								inputDecl.getDeclarations().add(var2Spec);
							}
						}
		        		
		        		if(createNew){
							InputVarContainer inputVarContainer = declFactory.createInputVarContainer();
							inputVarContainer.getDeclarations().add(var2Spec);
							list.add(inputVarContainer);
		        		}
		        	}else if(element instanceof FunctionDeclaration){
		        		FunctionDeclaration libElement = (FunctionDeclaration)element;
		        		EList<FunctionVariableDeclaration> list = libElement.getDeclarations();
		        		
		        		for (FunctionVariableDeclaration listElement : list) {
		        			
							if(listElement instanceof InputVarContainer){
								createNew = false;
								InputVarContainer inputDecl = (InputVarContainer)listElement;
								
								inputDecl.getDeclarations().add(var2Spec);
							}
						}
		        		
		        		if(createNew){
							InputVarContainer inputVarContainer = declFactory.createInputVarContainer();
							inputVarContainer.getDeclarations().add(var2Spec);
							list.add(inputVarContainer);
		        		}
		        	}else if(element instanceof FunctionBlockDeclaration){
		        		FunctionBlockDeclaration libElement = (FunctionBlockDeclaration)element;
		        		EList<FunctionBlockVariableDeclaration> list = libElement.getDeclarations();
		        		
		        		for (FunctionBlockVariableDeclaration listElement : list) {
		        			
							if(listElement instanceof InputVarContainer){
								createNew = false;
								InputVarContainer inputDecl = (InputVarContainer)listElement;
								
								inputDecl.getDeclarations().add(var2Spec);
							}
						}
		        		
		        		if(createNew){
							InputVarContainer inputVarContainer = declFactory.createInputVarContainer();
							inputVarContainer.getDeclarations().add(var2Spec);
							list.add(inputVarContainer);
		        		}
		        	}
		        		
		        		
		        	Map<Object, Object> options = new HashMap<Object, Object>();
					options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		        	try {
						((LibraryElement)element).eResource().save(options);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
		    }
		}
	}
}
