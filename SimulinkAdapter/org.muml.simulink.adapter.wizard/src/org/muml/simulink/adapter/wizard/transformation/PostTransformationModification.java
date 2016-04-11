package org.muml.simulink.adapter.wizard.transformation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.muml.simulink.Block;
import org.muml.simulink.BusCreator;
import org.muml.simulink.BusSelector;
import org.muml.simulink.ChartBlock;
import org.muml.simulink.InPortBlock;
import org.muml.simulink.LibraryReference;
import org.muml.simulink.Line;
import org.muml.simulink.OutPortBlock;
import org.muml.simulink.Parameter;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkFactory;
import org.muml.simulink.SimulinkLibrary;
import org.muml.simulink.SimulinkModel;
import org.muml.simulink.SubSystem;
import org.muml.simulink.ZeroOrderHold;
import org.muml.simulink.msglib.CommunicationSwitch;
import org.muml.simulink.msglib.LinkLayer;
import org.muml.simulink.stateflow.Action;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.StateflowFactory;
import org.muml.simulink.stateflow.StateflowPackage;
import org.muml.simulink.stateflow.Transition;

public class PostTransformationModification {

	// for component library
	final int BLOCK_WIDTH = 250;
	final int BLOCK_HEIGHT_PER_PORT = 50;
	final int BLOCKS_IN_A_LINE = 5;

	// for discrete atomic components
	final int X_POSITION_OF_SC_AND_LINK_LAYERS = 250;
	final int Y_POSITION_OF_SC = 30;
	final int DISTANCE_BETWEEN_ELEMENTS = 60;
	final int SC_AND_LINK_LAYER_WIDTH = 550;
	final int SC_HEIGHT_PER_PORT = 210;
	final int LINK_LAYER_HEIGHT = 400;
	final int PORT_SIZE = 30;
	final int DISTANCE_BETWEEN_LL_AND_PORT = 60;
	final int DISTANCE_BETWEEN_LL_AND_ZOH_BLOCK = 90;
	final int DISTANCE_BETWEEN_PORT_AND_ZOH_BLOCK = 100;

	// for continuous atomic components
	final int CONT_DISTANCE_BETWEEN_PORTS = 80;
	final int CONT_LEFT_COLUMN_X = 50;
	final int CONT_RIGHT_COLUMN_X = 700;
	final int CONT_PORT_Y = 40;

	// for component instance configuration
	final int CS_X_POSITION = 980;	
	final int CS_Y_POSITION = 500;	
	final int CS_HEIGHT = 120;
	final int CS_WIDTH = 100;	
	final int LEFT_COLUMN_X = 200;
	final int RIGHT_COLUMN_X = 1500;
	final int RIGHT_COLUMN_X_WITHOUT_CS = 800;
	final int START_Y = 100;
	final int DISTANCE_BETWEEN_LIBREFS_AND_BLOCKS = 100;
	final int BLOCK_SIZE = 30;
	final int EMPTY_SPACE = 10;

	private SimulinkLibrary atomicLibrary;
	private List<Transition> transitions;

	/*
	 * BLOCK_HEIGHT_PER_PORT = 50 and BLOCK_SIZE = 30, so, there are 10 pixel
	 * empty space above a block (e.g. port or constant block) and 10 pixel
	 * empty space under a block
	 */

	int block_height;

	int max_port = 0;

	HashMap<Block, int[]> blockPositions = new HashMap<Block, int[]>();

	SimulinkFactory simulinkFactory = org.muml.simulink.SimulinkFactory.eINSTANCE;
	StateflowFactory stateflowFactory = org.muml.simulink.stateflow.StateflowFactory.eINSTANCE;

	public void modify(String simu_file) {

		// Initialize the simulink model
		// org.muml.simulink.SimulinkPackage.eINSTANCE.eClass();
		// String oclDelegateURI = OCLDelegateDomain.OCL_DELEGATE_URI;
		// EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
		// new OCLInvocationDelegateFactory.Global());
		// EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
		// new OCLSettingDelegateFactory.Global());
		// EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
		// new OCLValidationDelegateFactory.Global());
		//
		// Register the .model resource factory for the .model extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("model", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// // Get the resource
		Resource simulink_res = resSet.getResource(URI.createURI(simu_file),
				true);
		SimulinkContainer cont = (SimulinkContainer) simulink_res.getContents()
				.get(0);

		// get the maximal number of ports
		for (SimulinkLibrary lib : cont.getLibraries())
			for (Block block : lib.getBlocks())
				if (block.getOutPorts().size() + block.getInPorts().size() > max_port)
					max_port = block.getOutPorts().size()
							+ block.getInPorts().size();

		for (SimulinkLibrary lib : cont.getLibraries())
			layoutSubSystemsFromLibrary(lib);

		EList<SimulinkModel> list = cont.getModels();
		SimulinkModel mod = (SimulinkModel) list.get(0);
		layoutSimulinkModel(mod);

		// correct the order of transition actions
		transitions = new ArrayList<Transition>();
		correctOrderOfTransitionActions();

		// save

		try {
			simulink_res.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void correctOrderOfTransitionActions() {
		if (atomicLibrary.getStateflowMachine() != null) {
			for (Chart chart : atomicLibrary.getStateflowMachine().getCharts()) {
				collectTransitions(chart);
			}
			for (Transition tr : transitions) {
				EList<Action> actionsList = tr.getAction();
				int lastIndex = actionsList.size() - 1;
				for (int i = 0; i < actionsList.size(); i++) {
					if (actionsList.get(i).getExpression() != null
							&& actionsList.get(i).getExpression()
									.startsWith("send") && i != lastIndex) {

						Action sendAction = actionsList.get(i);
						Action lastAction = actionsList.get(lastIndex);

						actionsList.move(lastIndex, sendAction);
						actionsList.move(i, lastAction);
					}
				}
			}
		}
	}

	public void collectTransitions(Chart chart) {
		TreeIterator<EObject> it = EcoreUtil.getAllContents(chart, true);
		while (it.hasNext()) {
			EObject object = it.next();
			if(StateflowPackage.Literals.TRANSITION.isSuperTypeOf(object.eClass()))
				transitions.add((Transition) object);
		}
	}

	public void modify(SimulinkContainer cont) {
		// get the maximal number of ports
		for (SimulinkLibrary lib : cont.getLibraries())
			for (Block block : lib.getBlocks())
				if (block.getOutPorts().size() + block.getInPorts().size() > max_port)
					max_port = block.getOutPorts().size()
							+ block.getInPorts().size();

		for (SimulinkLibrary lib : cont.getLibraries())
			layoutSubSystemsFromLibrary(lib);

		layoutSimulinkModel(cont.getModels().get(0));		
		
		// correct the order of transition actions
		transitions = new ArrayList<Transition>();
		correctOrderOfTransitionActions();
	}

	public void layoutSubSystemsFromLibrary(SimulinkLibrary lib) {

		int x = 20;
		int y = 20;
		block_height = BLOCK_HEIGHT_PER_PORT * max_port;

		// If it is a library with one structured-SubSystem
		if (!lib.getName().equals("AtomicLibrary")) {
			SubSystem subSys = (SubSystem) lib.getBlocks().get(0);

			createPositionParameter(subSys, x, y, BLOCK_WIDTH, block_height);
			
			Block cs = getCommunicationSwitch(subSys);

			layoutCompInstConfig(subSys, cs);
		}

		// If it is a library with atomic SubSystems
		else {
			atomicLibrary = lib;

			int blockcounter = 1;

			for (Block block : lib.getBlocks()) {

				if ((block instanceof SubSystem)) {

					SubSystem subSys = (SubSystem) block;
					createPositionParameter(block, x, y, BLOCK_WIDTH,
							block_height);

					x += (BLOCK_WIDTH + DISTANCE_BETWEEN_ELEMENTS);
					if (blockcounter == BLOCKS_IN_A_LINE) {
						y += (block_height + DISTANCE_BETWEEN_ELEMENTS);
						x = 20;
						blockcounter = 1;
					} else
						blockcounter++;

					ChartBlock chartBlock = getChartBlock(subSys);
					ArrayList<LinkLayer> list = getLinkLayerBlocks(subSys);

					// check if subSys was a discrete atomic component
					if (chartBlock != null && list.size() > 0) {
						layoutDiscAtomSubSystem(subSys, chartBlock, list);
					}
					// else it was a continuous component
					else
						layoutContAtomSubSystem(subSys);
				}
			}
		}
	}

	public void layoutDiscAtomSubSystem(SubSystem subSys,
			ChartBlock chartBlock, ArrayList<LinkLayer> list) {

		int lowestLine = 0;
		int x = X_POSITION_OF_SC_AND_LINK_LAYERS;

		lowestLine += Y_POSITION_OF_SC;

		// Layouting the ChartBlock
		createPositionParameter(chartBlock, x, lowestLine,
				SC_AND_LINK_LAYER_WIDTH, SC_HEIGHT_PER_PORT * list.size());
		lowestLine += SC_HEIGHT_PER_PORT * list.size()
				+ DISTANCE_BETWEEN_ELEMENTS;
		int left_ports = 0;
		int right_ports = 0;

		// Layouting the LinkLayer-Blocks
		for (LinkLayer linkLayer : list) {
			createPositionParameter(linkLayer, x, lowestLine,
					SC_AND_LINK_LAYER_WIDTH, LINK_LAYER_HEIGHT);
			lowestLine += LINK_LAYER_HEIGHT + DISTANCE_BETWEEN_ELEMENTS;
		}

		// Layouting the ports
		HashMap<Block, Integer> linkLayerInPorts = new HashMap<Block, Integer>();
		Block targetBlock;
		for (InPortBlock inPort : subSys.getInPorts()) {
			if (inPort.getOutgoingLines().size() > 0) {
				targetBlock = inPort.getOutgoingLines().get(0).getTargetBlock();
				if (targetBlock.getName().contains("Link Layer")) {
					int inPorts = 0;
					if (linkLayerInPorts.containsKey(targetBlock)) {
						inPorts = linkLayerInPorts.get(targetBlock);
						linkLayerInPorts.put(targetBlock, inPorts + 1);
					} else {
						linkLayerInPorts.put(targetBlock, 1);
					}

					if (blockPositions.containsKey(targetBlock)) {
						int[] position = blockPositions.get(targetBlock);
						createPositionParameter(inPort, position[0]
								- DISTANCE_BETWEEN_LL_AND_PORT, position[1]
								+ (inPorts * PORT_SIZE * 2), PORT_SIZE,
								PORT_SIZE);
					}
				} else if (targetBlock.getName().contains("Statechart")) {
					createPositionParameter(inPort, x
							- DISTANCE_BETWEEN_LL_AND_PORT, Y_POSITION_OF_SC
							+ (left_ports * PORT_SIZE * 2), PORT_SIZE,
							PORT_SIZE);
					left_ports++;
				} else if (targetBlock instanceof ZeroOrderHold) {
					createPositionParameter(inPort, x
							- DISTANCE_BETWEEN_LL_AND_ZOH_BLOCK
							- DISTANCE_BETWEEN_PORT_AND_ZOH_BLOCK,
							Y_POSITION_OF_SC + (left_ports * PORT_SIZE * 2),
							PORT_SIZE, PORT_SIZE);

					createPositionParameter(targetBlock, x
							- DISTANCE_BETWEEN_LL_AND_ZOH_BLOCK,
							Y_POSITION_OF_SC + (left_ports * PORT_SIZE * 2),
							PORT_SIZE, PORT_SIZE);

					left_ports++;
				}
			}
		}
		HashMap<Block, Integer> linkLayerOutPorts = new HashMap<Block, Integer>();
		Block sourceBlock;
		for (OutPortBlock outPort : subSys.getOutPorts()) {
			if (outPort.getIncomingLines().size() > 0) {
				sourceBlock = outPort.getIncomingLines().get(0)
						.getSourceBlock();
				if (sourceBlock.getName().contains("Link Layer")) {
					int outPorts = 0;
					if (linkLayerOutPorts.containsKey(sourceBlock)) {
						outPorts = linkLayerOutPorts.get(sourceBlock);
						linkLayerOutPorts.put(sourceBlock, outPorts + 1);
					} else {
						linkLayerOutPorts.put(sourceBlock, 1);
					}

					if (blockPositions.containsKey(sourceBlock)) {
						int[] position = blockPositions.get(sourceBlock);
						createPositionParameter(outPort, position[0]
								+ SC_AND_LINK_LAYER_WIDTH
								+ DISTANCE_BETWEEN_LL_AND_PORT, position[1]
								+ (outPorts * PORT_SIZE * 2), PORT_SIZE,
								PORT_SIZE);
					}
				} else if (sourceBlock.getName().contains("Statechart")) {
					createPositionParameter(outPort, x
							+ SC_AND_LINK_LAYER_WIDTH
							+ DISTANCE_BETWEEN_LL_AND_PORT, Y_POSITION_OF_SC
							+ (right_ports * PORT_SIZE * 2), PORT_SIZE,
							PORT_SIZE);
					right_ports++;
				}
			}
		}
	}

	private void layoutContAtomSubSystem(SubSystem subSys) {
		EList<InPortBlock> inPorts = subSys.getInPorts();
		EList<OutPortBlock> outPorts = subSys.getOutPorts();

		int y = CONT_PORT_Y;

		for (InPortBlock inPort : inPorts) {
			createPositionParameter(inPort, CONT_LEFT_COLUMN_X, y, PORT_SIZE,
					PORT_SIZE);
			y += PORT_SIZE + CONT_DISTANCE_BETWEEN_PORTS;
		}

		y = CONT_PORT_Y;

		for (OutPortBlock outPort : outPorts) {
			createPositionParameter(outPort, CONT_RIGHT_COLUMN_X, y, PORT_SIZE,
					PORT_SIZE);
			y += PORT_SIZE + CONT_DISTANCE_BETWEEN_PORTS;
		}
	}

	public void layoutSimulinkModel(SimulinkModel simMod) {
		EList<Block> blocks = simMod.getBlocks();		
		Block cs = null;
		for (Block b : blocks) {
			if (b instanceof CommunicationSwitch)
				cs=b;			
		}

		layoutCompInstConfig(simMod.getBlocks(), simMod.getLines(), cs);
	}

	public void layoutCompInstConfig(SubSystem subSys, Block cs) {
		layoutCompInstConfig(subSys.getBlocks(), subSys.getLines(), cs);
	}

	public void layoutCompInstConfig(EList<Block> blocks, EList<Line> lines, Block cs) {

		boolean communicationSwitch = false;

		// If this transformed component instance configuration contains
		// communication switch 
		if (cs != null) {
			communicationSwitch = true;
						
			createPositionParameter(cs, CS_X_POSITION, CS_Y_POSITION, CS_WIDTH, CS_HEIGHT);			
		}

		// Collecting the LibraryReferences and their ports
		ArrayList<LibraryReference> left_set = new ArrayList<LibraryReference>();
		ArrayList<LibraryReference> right_set = new ArrayList<LibraryReference>();

		HashMap<Block, List<Block>> libRefInPorts = new HashMap<Block, List<Block>>();
		HashMap<Block, List<Block>> libRefOutPorts = new HashMap<Block, List<Block>>();

		for (Block b : blocks) {
			if (b instanceof LibraryReference) {
				libRefInPorts.put(
						b,
						getInPortBlocksOfLibraryReference((LibraryReference) b,
								lines));
				libRefOutPorts.put(
						b,
						getOutPortBlocksOfLibraryReference(
								(LibraryReference) b, lines));
			}
		}

		// divide the library references into 2 sets
		int i = 1;
		for (Block b : blocks) {
			if (b instanceof LibraryReference) {
				LibraryReference libRef = ((LibraryReference) b);

				if (i % 2 != 0)
					left_set.add(libRef);
				else
					right_set.add(libRef);

				i++;
			}
		}

		int y = START_Y;
		// Layouting the left_set
		for (LibraryReference libRef : left_set) {
			createPositionParameter(libRef, LEFT_COLUMN_X, y, BLOCK_WIDTH,
					block_height);

			// layout the blocks which are connected to the inports of the
			// library reference
			layoutBlocksOfLibraryReference(libRefInPorts.get(libRef),
					LEFT_COLUMN_X, true, y);

			// layout the blocks which are connected to the outports of the
			// library reference
			layoutBlocksOfLibraryReference(libRefOutPorts.get(libRef),
					LEFT_COLUMN_X, false, y);

			y += block_height + DISTANCE_BETWEEN_ELEMENTS;
		}

		y = START_Y;

		int right_column;
		if (communicationSwitch)
			right_column = RIGHT_COLUMN_X;
		else
			right_column = RIGHT_COLUMN_X_WITHOUT_CS;

		// Layouting the right_set
		for (LibraryReference libRef : right_set) {
			createPositionParameter(libRef, right_column, y, BLOCK_WIDTH,
					block_height);

			// layout the blocks which are connected to the inports of the
			// library reference
			layoutBlocksOfLibraryReference(libRefInPorts.get(libRef),
					right_column, true, y);

			// layout the blocks which are connected to the outports of the
			// library reference
			layoutBlocksOfLibraryReference(libRefOutPorts.get(libRef),
					right_column, false, y);

			y += block_height + DISTANCE_BETWEEN_ELEMENTS;
		}
	}

	public ChartBlock getChartBlock(SubSystem subSys) {
		for (Block b : subSys.getBlocks()) {
			if (b instanceof ChartBlock)
				return (ChartBlock) b;
		}
		return null;
	}

	public Block getCommunicationSwitch(SubSystem subSys) {
		for (Block b : subSys.getBlocks()) {
			if (b instanceof CommunicationSwitch)
				return b;
		}
		return null;
	}

	public ArrayList<LinkLayer> getLinkLayerBlocks(SubSystem subSys) {
		ArrayList<LinkLayer> list = new ArrayList<LinkLayer>();
		for (Block b : subSys.getBlocks()) {
			if (b.getName() != null && b instanceof LinkLayer)
				list.add((LinkLayer) b);
		}
		return list;
	}

	public boolean isLayouted(Block subSys) {
		try {
			subSys.getParameter("Position");
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public void createPositionParameter(Block block, int x, int y, int w, int h) {
		// if (!isLayouted(block)) {
		Parameter newParam = simulinkFactory.createParameter();
		newParam.setName("Position");
		newParam.setValue("[" + x + ", " + y + ", " + (x + w) + ", " + (y + h)
				+ "]");
		block.getParameters().add(newParam);
		int[] params = { x, y, x + w, y + h };
		blockPositions.put(block, params);
		// System.out.println(block.getName() + " " + newParam.getValue());
		// }
	}

	public int[] getPositionParameter(Block subSys) {
		String pos = subSys.getParameter("Position");
		String[] params = pos.split(",");

		int[] params_int = new int[4];

		for (int i = 0; i < 4; i++) {
			params[i] = params[i].replace(" ", "");
			params[i] = params[i].replace("[", "");
			params[i] = params[i].replace("]", "");

			if (i <= 1)
				params_int[i] = Integer.parseInt(params[i]);
			else {
				params_int[i] = Integer.parseInt(params[i]) - params_int[i - 2];
			}
		}

		return params_int;
	}

	public void layoutBlocksOfLibraryReference(List<Block> blocks,
			int column_x, boolean blocks_to_inports, int y) {

		for (int j = 0; j < blocks.size(); j++) {
			y += EMPTY_SPACE;

			int x;
			if (blocks_to_inports)
				x = column_x - DISTANCE_BETWEEN_LIBREFS_AND_BLOCKS;
			else
				x = column_x + BLOCK_WIDTH
						+ DISTANCE_BETWEEN_LIBREFS_AND_BLOCKS;

			Block b = blocks.get(j);

			if (!(b instanceof LibraryReference)) {
				createPositionParameter(b, x, y, BLOCK_SIZE, BLOCK_SIZE);

				y += BLOCK_SIZE + EMPTY_SPACE;
			}
		}
	}

	public List<Block> getInPortBlocksOfLibraryReference(
			LibraryReference libRef, List<Line> lines) {
		LinkedList<Block> blocks = new LinkedList<Block>();

		for (InPortBlock inport : libRef.getInPorts()) {
			Block source = findSource(inport, lines);
			if (source != null && !(source instanceof CommunicationSwitch))
				blocks.add(source);
		}
		return blocks;
	}

	public List<Block> getOutPortBlocksOfLibraryReference(
			LibraryReference libRef, List<Line> lines) {
		LinkedList<Block> blocks = new LinkedList<Block>();

		for (OutPortBlock outport : libRef.getOutPorts()) {
			Block target = findTarget(outport, lines);

			if (target != null && !(target instanceof CommunicationSwitch))
				blocks.add(target);
		}
		return blocks;
	}

	public Block findSource(InPortBlock inport, List<Line> lines) {
		for (Line l : lines) {
			if (l.getTargetPort() == inport
					&& !(l.getSourceBlock() instanceof BusSelector))
				return l.getSourceBlock();
		}
		return null;
	}

	public Block findTarget(OutPortBlock inport, List<Line> lines) {
		for (Line l : lines) {
			if (l.getSourcePort() == inport
					&& !(l.getTargetBlock() instanceof BusCreator))
				return l.getTargetBlock();
		}
		return null;
	}
}
