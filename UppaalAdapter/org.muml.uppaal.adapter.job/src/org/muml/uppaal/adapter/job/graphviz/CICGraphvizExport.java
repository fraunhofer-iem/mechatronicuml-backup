package org.muml.uppaal.adapter.job.graphviz;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.core.NamedElement;
import org.muml.core.reachanalysis.core.export.ApplicationSpecificDecorator;
import org.muml.core.reachanalysis.core.export.GraphVizExport;
import org.muml.core.reachanalysis.core.export.GraphVizExportFileTypes;
import org.muml.core.reachanalysis.reachabilitygraph.ActionTransition;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.pim.connector.ConnectorInstance;
import org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.PortConnectorInstance;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.uppaal.adapter.extension.verificationextension.ClockBinding;
import org.muml.uppaal.adapter.extension.verificationextension.ClockBindingsExtension;
import org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage;
import org.muml.uppaal.adapter.job.graphviz.html.GraphvizHTMLTable;
import org.muml.uppaal.adapter.job.graphviz.html.GraphvizHTMLTableCell;
import org.muml.uppaal.adapter.job.graphviz.html.GraphvizHTMLTableRow;
import org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CICZoneGraphState;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.DelayTransition;
import org.muml.verification.core.runtime.MessageOnConnector;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;
import org.muml.verification.core.runtime.RuntimeAssemblyConnectorInstance;
import org.muml.verification.core.runtime.RuntimeBehavioralElement;
import org.muml.verification.core.runtime.RuntimeComponentInstance;
import org.muml.verification.core.runtime.RuntimeConnectorInstance;
import org.muml.verification.core.runtime.RuntimeDiscreteMultiPortInstance;
import org.muml.verification.core.runtime.RuntimeDiscreteSinglePortInstance;
import org.muml.verification.core.runtime.RuntimeMessage;
import org.muml.verification.core.runtime.RuntimeMessageBuffer;
import org.muml.verification.core.runtime.RuntimeParameter;
import org.muml.verification.core.runtime.VariableBinding;

public class CICGraphvizExport extends GraphVizExport {
	
	private CICZoneGraphState cicState;
	private CICZoneGraphState predecessorCicState;

	public CICGraphvizExport(ApplicationSpecificDecorator decorator) {
		super(decorator);
		super.setType(GraphVizExportFileTypes.SVG);
		predecessorCicState = null;
	}

	@Override
	public String getStateLabel(ReachabilityGraphState state) {

		if (state instanceof CICZoneGraphState)
			cicState = (CICZoneGraphState) state;
		else
			return null;

		StringBuffer result = new StringBuffer();
		result.append("<");

		// Get the cic of the predecessor state
		ComponentInstanceConfiguration predecessorCic = null;
		if (predecessorCicState != null)
			predecessorCic = (ComponentInstanceConfiguration) getPredecessor(
					cicState.getCic(), predecessorCicState.getCic());

		result.append(createCICTable(cicState.getCic(), predecessorCic)
				.toGraphVizHTMLString());
		result.append(">\n");

		// Set current State as predecessor
		predecessorCicState = cicState;

		return result.toString();
	}
	
	@Override
	protected String getTransitionLabel(ReachabilityGraphTransition transition) {
		if (transition instanceof DelayTransition) {
			return "delay";
		}
		else if(transition instanceof ActionTransition)
			return "action";
		return super.getTransitionLabel(transition);
	}

	protected GraphvizHTMLTable createCICTable(
			ComponentInstanceConfiguration cic,
			ComponentInstanceConfiguration predecessor) {

		GraphvizHTMLTable table = new GraphvizHTMLTable();
		table.addBGColor("bisque");
		table.addCellBorder("0");
		GraphvizHTMLTableRow nameRow = new GraphvizHTMLTableRow();
		GraphvizHTMLTableCell nameCell = new GraphvizHTMLTableCell();
		nameCell.addLabel(cic.getName());
		nameCell.addColspan("" + cic.getComponentInstances().size());
		nameRow.addTableCell(nameCell);
		table.addTableRow(nameRow);

		GraphvizHTMLTableRow ciRow = new GraphvizHTMLTableRow();
		table.addTableRow(ciRow);

		// ComponentInstances
		for (ComponentInstance ci : cic.getComponentInstances()) {
			GraphvizHTMLTableCell ciCell = new GraphvizHTMLTableCell();

			// get predecessor
			RuntimeComponentInstance ciPre = null;
			if (predecessor != null)
				ciPre = (RuntimeComponentInstance) getPredecessor(ci,
						predecessor.getComponentInstances());

			GraphvizHTMLTable ciTable = createCiTable(
					(RuntimeComponentInstance) ci, ciPre);
			ciCell.addTable(ciTable);
			ciRow.addTableCell(ciCell);
		}

		for (PortConnectorInstance pCI : cic.getPortConnectorInstances()) {
			// We currently don't support RuntimeDelegationConnectors (there is
			// even no such element in RuntimeModel)
			if (pCI instanceof RuntimeAssemblyConnectorInstance) {
				GraphvizHTMLTableRow pCIRow = new GraphvizHTMLTableRow();
				table.addTableRow(pCIRow);
				GraphvizHTMLTableCell pCICell = new GraphvizHTMLTableCell();
				pCIRow.addTableCell(pCICell);

				// get predecessor
				RuntimeAssemblyConnectorInstance pCIPre = null;
				if (predecessor != null)
					pCIPre = (RuntimeAssemblyConnectorInstance) getPredecessor(
							pCI, predecessor.getPortConnectorInstances());

				pCICell.addTable(createAssemblyConnectorInstanceTable(
						(RuntimeAssemblyConnectorInstance) pCI, pCIPre));
				pCICell.addColspan("" + cic.getComponentInstances().size());
			}
		}
		if (predecessor == null && predecessorCicState != null)
			table.markChanged();
		return table;
	}

	protected GraphvizHTMLTable createCiTable(RuntimeComponentInstance ci,
			RuntimeComponentInstance predecessor) {
		GraphvizHTMLTable ciTable = new GraphvizHTMLTable();
		ciTable.addBGColor("grey");
		ciTable.addCellBorder("0");
		GraphvizHTMLTableRow nameRow = new GraphvizHTMLTableRow();
		GraphvizHTMLTableCell nameCell = new GraphvizHTMLTableCell();
		nameCell.addLabel(ci.getName());
		nameRow.addTableCell(nameCell);
		ciTable.addTableRow(nameRow);

		// Behavior
//		RealtimeStatechartInstance rtscI = getRealtimeStatechartInstance(ci,
//				cicState);
//		if (rtscI != null) {
//			GraphvizHTMLTableRow behaviorRow = new GraphvizHTMLTableRow();
//			ciTable.addTableRow(behaviorRow);
//			GraphvizHTMLTableCell behaviorCell = new GraphvizHTMLTableCell();
//			behaviorRow.addTableCell(behaviorCell);
//
//			// get predecessor
//			RealtimeStatechartInstance rtscIPre = null;
//			if (predecessor != null)
//				rtscIPre = (RealtimeStatechartInstance) getPredecessor(
//						rtscI,
//						getRealtimeStatechartInstance(predecessor,
//								predecessorCicState));
//
//			behaviorCell.addTable(createRealtimeStatechartInstanceTable(rtscI,
//					rtscIPre));
//
//		}

		for (PortInstance pi : ci.getPortInstances()) {
			GraphvizHTMLTableRow piRow = new GraphvizHTMLTableRow();
			GraphvizHTMLTableCell piCell = new GraphvizHTMLTableCell();

			GraphvizHTMLTable piTable = null;
			if (pi instanceof RuntimeDiscreteMultiPortInstance) {

				// get predecessor
				RuntimeDiscreteMultiPortInstance piPre = null;
				if (predecessor != null)
					piPre = (RuntimeDiscreteMultiPortInstance) getPredecessor(
							pi,
							getPredecessor(pi, predecessor.getPortInstances()));

				piTable = createMultiPortTable(
						(RuntimeDiscreteMultiPortInstance) pi, piPre);
			}

			if (pi instanceof RuntimeDiscreteSinglePortInstance
					&& ((RuntimeDiscreteSinglePortInstance) pi)
							.getMultiInteractionEndpointInstance() == null) {

				// get predecessor
				RuntimeDiscreteSinglePortInstance piPre = null;
				if (predecessor != null)
					piPre = (RuntimeDiscreteSinglePortInstance) getPredecessor(
							pi,
							getPredecessor(pi, predecessor.getPortInstances()));

				piTable = createSinglePortTable(
						(RuntimeDiscreteSinglePortInstance) pi, piPre);
			}

			if (piTable != null) {
				piCell.addTable(piTable);
				piRow.addTableCell(piCell);
				ciTable.addTableRow(piRow);
			}
		}
		if (predecessor == null && predecessorCicState != null)
			ciTable.markChanged();
		return ciTable;
	}

	protected GraphvizHTMLTable createAssemblyConnectorInstanceTable(
			RuntimeAssemblyConnectorInstance rAC,
			RuntimeAssemblyConnectorInstance predecessor) {
		GraphvizHTMLTable rACTable = new GraphvizHTMLTable();
		rACTable.addBGColor("cornsilk1");
		rACTable.addCellBorder("0");
		GraphvizHTMLTableRow nameRow = new GraphvizHTMLTableRow();
		GraphvizHTMLTableCell nameCell = new GraphvizHTMLTableCell();
		nameCell.addLabel("Connector between "
				+ rAC.getConnectorEndpointInstances().get(0).getName()
				+ " and "
				+ rAC.getConnectorEndpointInstances().get(1).getName());
		nameRow.addTableCell(nameCell);
		rACTable.addTableRow(nameRow);

		if (rAC.getTransientMessages().isEmpty()) {
			GraphvizHTMLTableCell mOCCell = new GraphvizHTMLTableCell();
			mOCCell.addLabel("<i>no messages in transit</i>");
			GraphvizHTMLTableRow mOCRow = new GraphvizHTMLTableRow();
			rACTable.addTableRow(mOCRow);
			mOCRow.addTableCell(mOCCell);
		} else {
			for (MessageOnConnector mOC : rAC.getTransientMessages()) {
				GraphvizHTMLTableRow mOCRow = new GraphvizHTMLTableRow();
				rACTable.addTableRow(mOCRow);
	
				// get predecessor
				MessageOnConnector mOCPre = null;
				if (predecessor != null)
					mOCPre = (MessageOnConnector) getPredecessor(mOC,
							predecessor.getTransientMessages());
	
				GraphvizHTMLTableCell mOCCell = createMessageOnConnectorCell(mOC,
						mOCPre);
				mOCRow.addTableCell(mOCCell);
			}
		}

		if (predecessor == null && predecessorCicState != null)
			rACTable.markChanged();

		return rACTable;
	}

	protected GraphvizHTMLTableCell createMessageOnConnectorCell(
			MessageOnConnector theMessage, MessageOnConnector predecessor) {
		// get predecessor
		RuntimeMessage rMPre = null;
		if (predecessor != null)
			rMPre = predecessor.getMessage();

		GraphvizHTMLTableCell mOCCell = createRuntimeMessageCell(
				theMessage.getMessage(), rMPre);
		mOCCell.addLabel(mOCCell.getLabel() + "&nbsp;to "
				+ theMessage.getReceiver().getName());

		if (predecessor == null && predecessorCicState != null)
			mOCCell.markChanged();
		return mOCCell;

	}

	protected GraphvizHTMLTable createMultiPortTable(
			RuntimeDiscreteMultiPortInstance pi,
			RuntimeDiscreteMultiPortInstance predecessor) {
		GraphvizHTMLTable piTable = new GraphvizHTMLTable();
		piTable.addBGColor("antiquewhite1");
		piTable.addCellBorder("0");
		GraphvizHTMLTableRow nameRow = new GraphvizHTMLTableRow();
		GraphvizHTMLTableCell nameCell = new GraphvizHTMLTableCell();
		nameCell.addLabel(pi.getName());
		nameRow.addTableCell(nameCell);
		piTable.addTableRow(nameRow);

		// Behavior
		if (getRealtimeStatechartInstance(pi, cicState) != null) {
			GraphvizHTMLTableRow rtscIRow = new GraphvizHTMLTableRow();
			piTable.addTableRow(rtscIRow);
			GraphvizHTMLTableCell rtscICell = new GraphvizHTMLTableCell();
			rtscIRow.addTableCell(rtscICell);

			// get predecessor
			RealtimeStatechartInstance rtscIPre = null;
			if (predecessor != null)
				rtscIPre = (RealtimeStatechartInstance) getPredecessor(
						getRealtimeStatechartInstance(pi, cicState),
						getRealtimeStatechartInstance(predecessor,
								predecessorCicState));

			GraphvizHTMLTable rtscITable = createRealtimeStatechartInstanceTable(
					getRealtimeStatechartInstance(pi, cicState), rtscIPre);
			rtscICell.addTable(rtscITable);
		}

		// SubPorts
		for (DiscreteSingleInteractionEndpointInstance sP : pi
				.getSubInteractionEndpointInstances()) {
			RuntimeDiscreteSinglePortInstance curPortInstance = (RuntimeDiscreteSinglePortInstance) sP;
			GraphvizHTMLTableRow sPRow = new GraphvizHTMLTableRow();
			piTable.addTableRow(sPRow);
			GraphvizHTMLTableCell mBCell = new GraphvizHTMLTableCell();
			sPRow.addTableCell(mBCell);

			// get predecessor
			RuntimeDiscreteSinglePortInstance sPPre = null;
			if (predecessor != null)
				sPPre = (RuntimeDiscreteSinglePortInstance) getPredecessor(
						curPortInstance,
						predecessor.getSubInteractionEndpointInstances());

			GraphvizHTMLTable sPTable = createSinglePortTable(curPortInstance,
					sPPre);
			mBCell.addTable(sPTable);
		}

		if (predecessor == null && predecessorCicState != null)
			piTable.markChanged();

		return piTable;
	}

	protected GraphvizHTMLTable createSinglePortTable(
			RuntimeDiscreteSinglePortInstance pi,
			RuntimeDiscreteSinglePortInstance predecessor) {
		GraphvizHTMLTable piTable = new GraphvizHTMLTable();
		piTable.addBGColor("orange");
		piTable.addCellBorder("0");
		GraphvizHTMLTableRow nameRow = new GraphvizHTMLTableRow();
		GraphvizHTMLTableCell nameCell = new GraphvizHTMLTableCell();
		nameCell.addLabel(pi.getName());
		nameRow.addTableCell(nameCell);
		piTable.addTableRow(nameRow);

		// Behavior
		if (getRealtimeStatechartInstance(pi, cicState) != null) {
			GraphvizHTMLTableRow rtscIRow = new GraphvizHTMLTableRow();
			piTable.addTableRow(rtscIRow);
			GraphvizHTMLTableCell rtscICell = new GraphvizHTMLTableCell();
			rtscIRow.addTableCell(rtscICell);

			// get predecessor
			RealtimeStatechartInstance rtscIPre = null;
			if (predecessor != null)
				rtscIPre = (RealtimeStatechartInstance) getPredecessor(
						getRealtimeStatechartInstance(pi, cicState),
						getRealtimeStatechartInstance(predecessor,
								predecessorCicState));

			GraphvizHTMLTable rtscITable = createRealtimeStatechartInstanceTable(
					getRealtimeStatechartInstance(pi, cicState), rtscIPre);
			rtscICell.addTable(rtscITable);
		}

		// MessageBuffer
		for (RuntimeMessageBuffer mB : pi.getMessageBuffer()) {
			GraphvizHTMLTableRow mBRow = new GraphvizHTMLTableRow();
			piTable.addTableRow(mBRow);
			GraphvizHTMLTableCell mBCell = new GraphvizHTMLTableCell();
			mBRow.addTableCell(mBCell);

			// get predecessor
			RuntimeMessageBuffer mBPre = null;
			if (predecessor != null)
				mBPre = (RuntimeMessageBuffer) getPredecessor(mB,
						predecessor.getMessageBuffer());

			GraphvizHTMLTable mBTable = createMessageBufferTable(mB, mBPre);
			mBCell.addTable(mBTable);
		}

		if (predecessor == null && predecessorCicState != null)
			piTable.markChanged();
		return piTable;
	}

	protected GraphvizHTMLTable createMessageBufferTable(
			RuntimeMessageBuffer mB, RuntimeMessageBuffer predecessor) {
		GraphvizHTMLTable mBTable = new GraphvizHTMLTable();
		mBTable.addBGColor("palegoldenrod");
		mBTable.addCellBorder("0");
		GraphvizHTMLTableRow nameRow = new GraphvizHTMLTableRow();
		GraphvizHTMLTableCell nameCell = new GraphvizHTMLTableCell();
		nameCell.addLabel("Incoming Buffer: " + mB.getMessageBuffer().getName());
		nameRow.addTableCell(nameCell);
		mBTable.addTableRow(nameRow);

		// RuntimeMessages
		if (mB.getMessages().isEmpty()) {
			GraphvizHTMLTableCell rMCell = new GraphvizHTMLTableCell();
			rMCell.addLabel("<i>empty</i>");
			GraphvizHTMLTableRow rMRow = new GraphvizHTMLTableRow();
			mBTable.addTableRow(rMRow);
			rMRow.addTableCell(rMCell);
		} else {
			for (RuntimeMessage rM : mB.getMessages()) {
				GraphvizHTMLTableRow rMRow = new GraphvizHTMLTableRow();
				mBTable.addTableRow(rMRow);

				// get predecessor
				RuntimeMessage rMPre = null;
				if (predecessor != null)
					rMPre = getPredecessor(rM, predecessor.getMessages(), predecessor);

				GraphvizHTMLTableCell rMCell = createRuntimeMessageCell(rM, rMPre);
				rMRow.addTableCell(rMCell);
			}
		}

		return mBTable;
	}

	protected GraphvizHTMLTable createRealtimeStatechartInstanceTable(
			RealtimeStatechartInstance rtscI,
			RealtimeStatechartInstance predecessor) {
		GraphvizHTMLTable rtscITable = new GraphvizHTMLTable();
		rtscITable.addBGColor("lightblue");
		rtscITable.addCellBorder("0");
		GraphvizHTMLTableRow nameRow = new GraphvizHTMLTableRow();
		GraphvizHTMLTableCell nameCell = new GraphvizHTMLTableCell();
		String rtscIName = "";
		if (rtscI.getInstanceOf().getName() != null)
			rtscIName = rtscI.getInstanceOf().getName();
		nameCell.addLabel(rtscIName);
		nameRow.addTableCell(nameCell);
		rtscITable.addTableRow(nameRow);

		// active State/Transition

		GraphvizHTMLTableRow activeRow = new GraphvizHTMLTableRow();
		GraphvizHTMLTableCell activeCell = new GraphvizHTMLTableCell();
		if (rtscI.getActiveVertex() != null) {
			activeCell.addLabel("Active State: "
					+ rtscI.getActiveVertex().getName());
			// mark if vertex has changed
			if (predecessor != null
					&& predecessor.getActiveVertex() != rtscI.getActiveVertex())
				activeCell.markChanged();
		}
		if (rtscI.getActiveTransition() != null) {
			Transition activeTransition = rtscI.getActiveTransition();
			activeCell.addLabel("Active Transition: "
					+ activeTransition.getSource().getName() + " &#8594;"
					+ activeTransition.getTarget().getName());
			// mark if transition has changed
			if (predecessor != null
					&& predecessor.getActiveTransition() != rtscI
							.getActiveTransition())
				activeCell.markChanged();
		}

		activeRow.addTableCell(activeCell);
		rtscITable.addTableRow(activeRow);

		// VariableBindings
		if (!rtscI.getVariableBindings().isEmpty()) {
			GraphvizHTMLTableRow vBRow = new GraphvizHTMLTableRow();
			rtscITable.addTableRow(vBRow);
			GraphvizHTMLTableCell vBCell = new GraphvizHTMLTableCell();
			vBRow.addTableCell(vBCell);

			vBCell.addTable(createVariableBindingTable(rtscI, predecessor));
		}

		// ClockValues
		ClockBindingsExtension cbExtension = (ClockBindingsExtension) rtscI
				.getExtension(VerificationExtensionPackage.eINSTANCE
						.getClockBindingsExtension());

		if (cbExtension != null) {
			GraphvizHTMLTableRow cBRow = new GraphvizHTMLTableRow();
			rtscITable.addTableRow(cBRow);
			GraphvizHTMLTableCell cBCell = new GraphvizHTMLTableCell();
			cBRow.addTableCell(cBCell);

			// get predecessor
			ClockBindingsExtension cbExtensionPre = null;
			if (predecessor != null)
				cbExtensionPre = (ClockBindingsExtension) predecessor
						.getExtension(VerificationExtensionPackage.eINSTANCE
								.getClockBindingsExtension());

			cBCell.addTable(createClockBindingTable(cbExtension, cbExtensionPre));
		}

		// Substatechart
		for (RealtimeStatechartInstance subStatechart : rtscI
				.getSubRealtimeStatechartInstances()) {
			// Only create subRtscTable if behavioral element is not set. These
			// Tables will be created for the corresponding behavioral element
			if (subStatechart.getRuntimeBehavioralElement() == null) {
				GraphvizHTMLTableRow subRtscIRow = new GraphvizHTMLTableRow();

				GraphvizHTMLTableCell subRtscICell = new GraphvizHTMLTableCell();

				// get predecessor
				RealtimeStatechartInstance rtscIPre = null;
				if (predecessor != null)
					rtscIPre = (RealtimeStatechartInstance) getPredecessor(
							subStatechart,
							predecessor.getSubRealtimeStatechartInstances());

				GraphvizHTMLTable subRtscITable = createRealtimeStatechartInstanceTable(
						subStatechart, rtscIPre);
				subRtscICell.addTable(subRtscITable);
				subRtscIRow.addTableCell(subRtscICell);

				rtscITable.addTableRow(subRtscIRow);
			}

		}

		if (predecessor == null && predecessorCicState != null)
			rtscITable.markChanged();

		return rtscITable;
	}

	protected GraphvizHTMLTable createVariableBindingTable(
			RealtimeStatechartInstance rtscI,
			RealtimeStatechartInstance predecessor) {
		GraphvizHTMLTable vBTable = new GraphvizHTMLTable();
		vBTable.addBGColor("seagreen1");
		vBTable.addCellBorder("0");

		GraphvizHTMLTableRow vBRow = new GraphvizHTMLTableRow();
		vBTable.addTableRow(vBRow);
		GraphvizHTMLTableCell vBCell = new GraphvizHTMLTableCell();
		vBRow.addTableCell(vBCell);
		vBCell.addLabel("Variable Bindings:");

		GraphvizHTMLTableRow curVarBindingRow = null;
		int numberOfCells = 0;
		for (int i = 0; i < rtscI.getVariableBindings().size(); i++) {
			VariableBinding curVariableBinding = rtscI.getVariableBindings()
					.get(i);

			if (curVariableBinding.getVariable().isConstant()) {
				continue;
				// we do not show the value of constant variables
			}
			
			// create new row
			if (numberOfCells % 2 == 0) {
				curVarBindingRow = new GraphvizHTMLTableRow();
				vBTable.addTableRow(curVarBindingRow);
			}
			numberOfCells++;

			// get predecessor
			VariableBinding vBPre = null;
			if (predecessor != null)
				vBPre = getPredecessor(curVariableBinding,
						predecessor.getVariableBindings());

			GraphvizHTMLTableCell newCell = createVariableBindingCell(
					curVariableBinding, vBPre);
			curVarBindingRow.addTableCell(newCell);
		}
		return vBTable;

	}

	protected GraphvizHTMLTableCell createVariableBindingCell(
			VariableBinding vB, VariableBinding predecessor) {
		GraphvizHTMLTableCell vBCell = new GraphvizHTMLTableCell();
		
		if (vB.getVariable().isConstant()) {
			// TODO print the variable's initialize expression
		} else {
			vBCell.addLabel(vB.getVariable().getName() + "="
					+ vB.getValue().toString());
		}
		
		if (predecessor == null && predecessorCicState != null)
			vBCell.markChanged();
		return vBCell;
	}

	protected GraphvizHTMLTable createClockBindingTable(
			ClockBindingsExtension clockBindingsExtension,
			ClockBindingsExtension predecessor) {
		GraphvizHTMLTable cBTable = new GraphvizHTMLTable();
		cBTable.addBGColor("khaki2");
		cBTable.addCellBorder("0");

		GraphvizHTMLTableRow vBRow = new GraphvizHTMLTableRow();
		cBTable.addTableRow(vBRow);
		GraphvizHTMLTableCell vBCell = new GraphvizHTMLTableCell();
		vBRow.addTableCell(vBCell);
		vBCell.addLabel("Clock Bindings:");

		GraphvizHTMLTableRow curVarBindingRow = null;
		for (int i = 0; i < clockBindingsExtension.getClockBindings().size(); i++) {

			ClockBinding curClockBinding = clockBindingsExtension
					.getClockBindings().get(i);
			// create new row
			if (i % 2 == 0) {
				curVarBindingRow = new GraphvizHTMLTableRow();
				cBTable.addTableRow(curVarBindingRow);
			}

			// get predecessor
			ClockBinding cBPre = null;
			if (predecessor != null)
				cBPre = getPredecessor(curClockBinding,
						predecessor.getClockBindings());

			GraphvizHTMLTableCell newCell = createClockBindingCell(
					curClockBinding, cBPre);
			curVarBindingRow.addTableCell(newCell);
		}
		return cBTable;

	}

	protected GraphvizHTMLTableCell createClockBindingCell(ClockBinding cB,
			ClockBinding predecessor) {
		GraphvizHTMLTableCell cBCell = new GraphvizHTMLTableCell();
		cBCell.addLabel(cB.getClock().getName() + "=" + cB.getValue());
		if (predecessor == null && predecessorCicState != null)
			cBCell.markChanged();
		return cBCell;
	}

	protected GraphvizHTMLTableCell createRuntimeMessageCell(RuntimeMessage rM,
			RuntimeMessage predecessor) {
		GraphvizHTMLTableCell rMCell = new GraphvizHTMLTableCell();
		StringBuffer parameters = new StringBuffer();
		parameters.append("(");

		for (int i = 0; i < rM.getParameters().size(); i++) {
			parameters.append(rM.getParameters().get(i).getValue().toString());
			if (i < rM.getParameters().size() - 1)
				parameters.append(", ");
		}

		parameters.append(")");

		rMCell.addLabel(rM.getName() + parameters.toString());

		if (predecessor == null && predecessorCicState != null)
			rMCell.markChanged();
		return rMCell;
	}

	private RealtimeStatechartInstance getRealtimeStatechartInstance(
			RuntimeBehavioralElement rBE, CICZoneGraphState state) {
		for (RealtimeStatechartInstance rtscI : state.getLocations()) {
			if (rtscI.getRuntimeBehavioralElement() == rBE)
				return rtscI;
		}
		return null;
	}



	private NamedElement getPredecessor(NamedElement curObject,
			EList<? extends NamedElement> candidatesOfPredecessorState) {

		if (candidatesOfPredecessorState == null
				|| candidatesOfPredecessorState.isEmpty())
			return null;

		for (NamedElement candidate : candidatesOfPredecessorState) {

			if ((curObject).getName().equals(candidate.getName()))
				return candidate;
		}

		return null;
	}

	private MessageOnConnector getPredecessor(MessageOnConnector curObject,
			EList<MessageOnConnector> candidatesOfPredecessorState) {

		if (candidatesOfPredecessorState == null
				|| candidatesOfPredecessorState.isEmpty())
			return null;

		EList<MessageOnConnector> remainingCandidates = new BasicEList<MessageOnConnector>();
		for (MessageOnConnector candidate : candidatesOfPredecessorState) {
			// Compare name of the receiver, because
			// RuntimeBehavioralElements are NamedElements
			if (curObject.getReceiver().getName()
					.equals(candidate.getReceiver().getName())
					&& isPredecessorOf(curObject.getMessage(),
							candidate.getMessage()))
				remainingCandidates.add(candidate);
		}
		
		EList<MessageOnConnector> curIsoMessagesOnCon = new BasicEList<MessageOnConnector>();
		if(curObject.eContainer() instanceof RuntimeConnectorInstance){
			RuntimeConnectorInstance container = (RuntimeConnectorInstance) curObject.eContainer();
			for (MessageOnConnector m : container.getTransientMessages()) {
				if (isPredecessorOf(curObject.getMessage(), m.getMessage()))
					curIsoMessagesOnCon.add(m);
			}
			
			if(curIsoMessagesOnCon.indexOf(curObject) > remainingCandidates.size()-1)
				return null;
			
			return remainingCandidates.get(curIsoMessagesOnCon.indexOf(curObject));
		}
		return null;
	}

	private RuntimeMessageBuffer getPredecessor(RuntimeMessageBuffer curObject,
			EList<RuntimeMessageBuffer> candidatesOfPredecessorState) {

		if (candidatesOfPredecessorState == null
				|| candidatesOfPredecessorState.isEmpty())
			return null;

		for (RuntimeMessageBuffer candidate : candidatesOfPredecessorState) {
			if (curObject.getMessageBuffer().getName()
					.equals(candidate.getMessageBuffer().getName()))
				return candidate;
		}
		return null;
	}

	private RuntimeMessage getPredecessor(RuntimeMessage curObject,
			EList<RuntimeMessage> candidatesOfPredecessorState, RuntimeMessageBuffer predBuffer) {

		if (candidatesOfPredecessorState == null
				|| candidatesOfPredecessorState.isEmpty())
			return null;

		EList<RuntimeMessage> remainingCandidates = new BasicEList<RuntimeMessage>();
		for (RuntimeMessage candidate : candidatesOfPredecessorState) {
			if (isPredecessorOf(curObject, candidate))
				remainingCandidates.add(candidate);
		}
		
		EList<RuntimeMessage> curIsoMessagesInBuffer = new BasicEList<RuntimeMessage>();
		if(curObject.eContainer() instanceof RuntimeMessageBuffer){
			RuntimeMessageBuffer container = (RuntimeMessageBuffer) curObject.eContainer();
			for (RuntimeMessage m : container.getMessages()) {
				if (isPredecessorOf(curObject, m))
					curIsoMessagesInBuffer.add(m);
			}
			
			if(curIsoMessagesInBuffer.indexOf(curObject) > remainingCandidates.size()-1)
				return null;
			
			return remainingCandidates.get(curIsoMessagesInBuffer.indexOf(curObject));
		}
		return null;
	}

	private RealtimeStatechartInstance getPredecessor(
			RealtimeStatechartInstance curObject,
			EList<RealtimeStatechartInstance> candidatesOfPredecessorState) {

		if (candidatesOfPredecessorState == null
				|| candidatesOfPredecessorState.isEmpty())
			return null;

		for (RealtimeStatechartInstance candidate : candidatesOfPredecessorState) {

			RealtimeStatechart curObjectRtsc = curObject.getInstanceOf();
			RealtimeStatechart candidateRtsc = candidate.getInstanceOf();

			if (curObjectRtsc.equals(candidateRtsc))
				return candidate;
		}
		return null;
	}

	private ConnectorInstance getPredecessor(PortConnectorInstance curObject,
			EList<? extends PortConnectorInstance> candidatesOfPredecessorState) {

		if (candidatesOfPredecessorState == null
				|| candidatesOfPredecessorState.isEmpty())
			return null;

		EStructuralFeature containingFeature = curObject.eContainingFeature();
		EObject container = curObject.eContainer();
		Object containingFeatureValues = container.eGet(containingFeature);
		if (containingFeatureValues instanceof List) {
			int curObjectIndex = ((List<?>) containingFeatureValues)
					.indexOf(curObject);
			return candidatesOfPredecessorState.get(curObjectIndex);
		}
		return null;
	}

	private VariableBinding getPredecessor(VariableBinding curObject,
			EList<VariableBinding> candidatesOfPredecessorState) {

		if (candidatesOfPredecessorState == null
				|| candidatesOfPredecessorState.isEmpty())
			return null;

		for (VariableBinding candidate : candidatesOfPredecessorState) {
			if (curObject.getVariable().equals(candidate.getVariable())
					&& curObject.getValue().equals(candidate.getValue()))
				return candidate;
		}
		return null;
	}

	private ClockBinding getPredecessor(ClockBinding curObject,
			EList<ClockBinding> candidatesOfPredecessorState) {

		if (candidatesOfPredecessorState == null
				|| candidatesOfPredecessorState.isEmpty())
			return null;

		for (ClockBinding candidate : candidatesOfPredecessorState) {
			if (curObject.getClock().equals(candidate.getClock())
					&& curObject.getValue() == candidate.getValue())
				return candidate;
		}
		return null;
	}

	private NamedElement getPredecessor(NamedElement curObject,
			NamedElement candidateOfPredecessorState) {
		if (candidateOfPredecessorState == null)
			return null;

		String curObjectName = curObject.getName();
		String candidateName = candidateOfPredecessorState.getName();
		if (curObjectName.equals(candidateName))
			return candidateOfPredecessorState;

		return null;
	}

	private RealtimeStatechartInstance getPredecessor(
			RealtimeStatechartInstance curObject,
			RealtimeStatechartInstance candidateOfPredecessorState) {
		if (candidateOfPredecessorState == null)
			return null;

		RealtimeStatechart curObjectRtsc = curObject.getInstanceOf();
		RealtimeStatechart candidateRtsc = candidateOfPredecessorState
				.getInstanceOf();

		if (curObjectRtsc.equals(candidateRtsc))
			return candidateOfPredecessorState;
		return null;
	}
	
	private Boolean isPredecessorOf(RuntimeMessage curMessage,
			RuntimeMessage candidate) {
		if (curMessage.getType().equals(candidate.getType())
				&& curMessage.getParameters().size() == candidate
						.getParameters().size()) {

			// compare parameters
			for (int i = 0; i < curMessage.getParameters().size(); i++) {
				if (!isPredecessorOf(curMessage.getParameters().get(i),
						candidate.getParameters().get(i)))
					return false;
			}
			return true;
		}
		return false;
	}

	private Boolean isPredecessorOf(RuntimeParameter curParameter,
			RuntimeParameter candidate) {
		if (curParameter.getParameter().equals(candidate.getParameter())
				&& curParameter.getValue().equals(candidate.getValue()))
			return true;
		return false;
	}


}
