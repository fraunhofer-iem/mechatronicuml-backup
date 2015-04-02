package de.fraunhofer.iem.m4a.iec61131.editor.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import de.fraunhofer.iem.m4a.IEC61131.IEC61131;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.IntegerLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.UnsignedInteger;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.PousFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.ProgramDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EUnsignedIntegerType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.types.UnsignedIntegerType;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StFactory;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StatementList;

public class CreateExampleHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();

		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
		    for (Iterator<Object> iterator = strucSelection.iterator(); iterator.hasNext();) {
		        Object element = iterator.next();
		        if (element != null & element instanceof IEC61131) {
					IEC61131 iec61131Factory = (IEC61131) element;
					
					// Declare Factories
					PousFactory pousFactory = PousFactory.eINSTANCE;
					StFactory structuredTextFactory = StFactory.eINSTANCE;
					ConfigurationsFactory configFactory = ConfigurationsFactory.eINSTANCE;
					LiteralsFactory literalsFactory = LiteralsFactory.eINSTANCE;
					TypesFactory typesFactory = TypesFactory.eINSTANCE;
					
					// Create statement lists
					StatementList statementListFB = structuredTextFactory.createStatementList();
					statementListFB.getStatments().add(structuredTextFactory.createNILStatement());
					
					StatementList statementListProg = structuredTextFactory.createStatementList();
					statementListProg.getStatments().add(structuredTextFactory.createNILStatement());
					
					// Create functionBlock
					FunctionBlockDeclaration fbDeclaration = pousFactory.createFunctionBlockDeclaration();
					fbDeclaration.setIdentifier("Pump");
					fbDeclaration.setBody(statementListFB);
					
					// Create programDeclaration
					ProgramDeclaration programDeclaration = pousFactory.createProgramDeclaration();
					programDeclaration.setIdentifier("PumpContrl");
					programDeclaration.setBody(statementListProg);
					
					// Create priority
					UnsignedInteger priority = literalsFactory.createUnsignedInteger();
					priority.setValue("1");
					
					// Create taskConfiguration
					TaskConfiguration taskConfig = configFactory.createTaskConfiguration();
					taskConfig.setIdentifier("PumpTaskConfig");
					taskConfig.setPriority(priority);
					
					// Create programConfiguration
					ProgramConfiguration programConfig = configFactory.createProgramConfiguration();
					programConfig.setIdentifier("PumpProgramConfig");
					programConfig.setProgram(programDeclaration);

					// Create resourceDeclaration
					ResourceDeclaration resourceDeclaration = configFactory.createResourceDeclaration();
					resourceDeclaration.setIdentifier("PumpResourceDecl");
					resourceDeclaration.getProgramConfigurations().add(programConfig);
					resourceDeclaration.getTaskConfigurations().add(taskConfig);
					
					// Create configurationDeclaration
					ConfigurationDeclaration configDeclaration = configFactory.createConfigurationDeclaration();
					configDeclaration.setIdentifier("PumpConfigDecl");
					configDeclaration.getResources().add(resourceDeclaration);
					
					// Add all elements to the root
					iec61131Factory.getLibraryDeclarations().add(fbDeclaration);
					iec61131Factory.getLibraryDeclarations().add(programDeclaration);
					iec61131Factory.getLibraryDeclarations().add(configDeclaration);
					
					Map<Object, Object> options = new HashMap<Object, Object>();
					options.put(XMLResource.OPTION_ENCODING, "UTF-8");
					try {
						iec61131Factory.eResource().save(options);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		    }
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
