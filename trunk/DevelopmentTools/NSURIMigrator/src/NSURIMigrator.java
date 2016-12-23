import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class NSURIMigrator {
	private String[][] replacements = {                                                                                                                                                                                                                   
		{		"http://www.fujaba.de/muml/actionlanguage/0.4.0", "http://www.muml.org/pim/actionlanguage/1.0.0" },
		{		"http://migration/0.1", "http://www.muml.org/emm/1.0.0" },
		{		"http://de.uni_paderborn.fujaba.properties/0.5.1", "http://www.muml.org/ape/1.0.0" },
		{		"http://www.fujaba.de/muml/0.4.0", "http://www.muml.org/pim/1.0.0" },
		{		"http://www.fujaba.de/muml/component/0.4.0", " http://www.muml.org/pim/component/1.0.0" },
		{		"http://www.fujaba.de/muml/constraint/0.4.0", "http://www.muml.org/pim/constraint/1.0.0" },
		{		"http://www.fujaba.de/muml/instance/0.4.0", "http://www.muml.org/pim/instance/1.0.0" },
		{		"http://www.fujaba.de/muml/protocol/0.4.0", "http://www.muml.org/pim/protocol/1.0.0" },
		{		"http://www.fujaba.de/muml/realtimestatechart/0.4.0", "http://www.muml.org/pim/realtimestatechart/1.0.0" },
		{		"http://www.fujaba.de/muml/msgtype/0.4.0", "http://www.muml.org/pim/msgtype/1.0.0" },
		{		"http://www.fujaba.de/muml/types/0.4.0", "http://www.muml.org/pim/types/1.0.0" },
		{		"http://www.fujaba.de/muml/connector/0.4.0", "http://www.muml.org/pim/connector/1.0.0" },
		{		"http://www.fujaba.de/muml/valuetype/0.4.0", "http://www.muml.org/pim/valuetype/1.0.0" },
		{		"http://www.fujaba.de/muml/behavior/0.4.0", "http://www.muml.org/pim/behavior/1.0.0" },
		{		"http://www.fujaba.de/muml/pattern/0.3.18", "http://www.muml.org/pim/pattern/1.0.0" },
		{		"http://www.fujaba.de/muml/one_to_n_schemata/0.4.0", "http://www.muml.org/pim/one_to_n_schemata/1.0.0" },
		{		"http://www.fujaba.de/reachAnalysis/tsdm/helper/0.1.0", "http://www.muml.org/reconfigurationverification.reachanalysis.tsdm.transform/helper/1.0.0" },
		{		"http://www.fujaba.de/reachabilityGraph/cic/0.4.0", "http://www.muml.org/verification/core/reachanalysis/reachabilitygraph/cic/1.0.0" },
		{		"http://www.fujaba.de/muml/verification/fotctl/0.1.0", "http://www.muml.org/reconfigurationverification/fotctl/1.0.0" },
		{		"http://www.fujaba.de/muml/verification/tctl/0.1.0", "http://www.muml.org/reconfigurationverification/tctl/1.0.0" },
		{		"http://de/uni_paderborn/fujaba/muml/testlanguage/specification", "http://www.muml.org/testlanguage/specification/1.0" },
		{		"http://www.storydriven.org/modeling/expressions/common/Expressions", "http://www.muml.org/storydiagram/expressions/common/expressions/1.0" },
		{		"http://de/uni_paderborn/fujaba/muml/testlanguage", "http://www.muml.org/testlanguage/1.0" },
		{		"http://www.fujaba.de/reachabilityGraph/rtsc/0.4.0", "http://www.muml.org/verification/core/reachanalysis/reachabilitygraph/rtsc/1.0.0" },
		{		"http://www.fujaba.de/muml/allocation/algorithm/ilp/opt4j/0.1.0/config", "http://www.muml.org/psm/allocation/algorithm/ilp/opt4j/config/1.0.0" },
		{		"http://migration/release/0.1", "http://www.muml.org/emm/release/1.0.0" },
		{		"http://www.uni_paderborn.de/fujaba/muml/verification/uppaal/results", "http://www.muml.org/uppaal/adapter/results/1.0.0" },
		{		"http://de.uni_paderborn.fujaba2simulink http://de.uni_paderborn.fujaba2simulink.behavior", "http://www.muml.org/simulink/adapter/corrmodel/1.0.0" },
		{		"http://www.storydriven.org/storydiagrams/0.2.1", "http://www.muml.org/storydiagram/1.0.0" },
		{		"http://www.storydriven.org/storydiagrams/activities/0.2.1", "http://www.muml.org/storydiagram/activities/1.0.0" },
		{		"http://www.storydriven.org/storydiagrams/activities/expressions/0.2.0", "http://www.muml.org/storydiagram/activities/expressions/1.0.0" },
		{		"http://www.storydriven.org/storydiagrams/calls/0.2.0", "http://www.muml.org/storydiagram/calls/1.0.0" },
		{		"http://www.storydriven.org/storydiagrams/calls/expressions/0.2.0", "http://www.muml.org/storydiagram/calls/expressions/1.0.0" },
		{		"http://www.storydriven.org/storydiagrams/patterns/0.2.1", "http://www.muml.org/storydiagram/patterns/1.0.0" },
		{		"http://www.storydriven.org/storydiagrams/patterns/expressions/0.2.1", "http://www.muml.org/storydiagram/patterns/expressions/1.0.0" },
		{		"http://www.storydriven.org/storydiagrams/templates/0.2.0", "http://www.muml.org/storydiagram/templates/1.0.0" },
		{		"http://www.fujaba.de/muml/hardware/1.1/", "http://www.muml.org/pm/hardware/1.0.0" },
		{		"http://www.fujaba.de/muml/hardware/hwplatform/1.1/", "http://www.muml.org/pm/hardware/hwplatform/1.0.0" },
		{		"http://www.fujaba.de/muml/hardware/hwvaluetype/1.1/", "http://www.muml.org/pm/hardware/hwvaluetype/1.0.0" },
		{		"http://www.fujaba.de/muml/hardware/hwplatforminstance/1.1/", "http://www.muml.org/pm/hardware/hwplatforminstance/1.0.0" },
		{		"http://www.fujaba.de/muml/hardware/hwresource/1.1/", "http://www.muml.org/pm/hardware/hwresource/1.0.0" },
		{		"http://www.fujaba.de/muml/hardware/hwresourceinstance/1.1/", "http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0" },
		{		"http://www.fujaba.de/muml/verification/test/railcab/0.1.0", "http://www.muml.org/example/railcab/1.0.0" },
		{		"http://www.fujaba.de/muml/swplatform/0.4.0/", "http://www.muml.org/pm/software/platform/1.0.0" },
		{		"http://www.fujaba.de/muml/ontology/0.4.0", "http://www.muml.org/ontology/1.0.0" },
		{		"http://www.fujaba.de/muml/dependencylanguage/0.4.0", "http://www.muml.org/cbs/dependencylanguage/1.0.0" },
		{		"http://www.fujaba.de/muml/componentstorydiagram/0.4.0", "http://www.muml.org/reconfiguration/componentstorydiagram/1.0.0" },
		{		"http://www.fujaba.de/reachabilityGraph/0.4.0", "http://www.muml.org/core/reachabilitygraph/1.0.0" },
		{		"http://www.fujaba.de/modelica/m2t/transform/0.4.0", "http://www.muml.de/modelica/transform/1.0.0" },
		{		"de.uni_paderborn.fujaba.simulink", "http://www.muml.org/simulink/1.0.0" },
		{		"de.uni_paderborn.fujaba.simulink.model.stateflow", "http://www.muml.org/simulink/stateflow/1.0.0" },
		{		"de.uni_paderborn.fujaba.simulink.model.msglib", "http://www.muml.org/simulink/msglib/1.0.0" },
		{		"de.uni_paderborn.fujaba.simulink.model.msglib.buffer", "http://www.muml.org/simulink/msglib/buffer/1.0.0" },                                                                                                                             
		{		"de.uni_paderborn.fujaba.simulink.model.reconfiguration", "http://www.muml.org/simulink/reconfiguration/1.0.0" },
		{		"http://www.fujaba.de/muml/verification/extension/0.4.0", "http://www.muml.org/uppaal/adapter/extension/verificationextension/1.0.0" },
		{		"http://www.fujaba.de/muml/componentstorypattern/0.4.0", "http://www.muml.org/reconfiguration/componentstorypattern/1.0.0" },
		{		"http://www.fujaba.de/muml/runtime/0.4.0", "http://www.muml.org/verification/core/runtime/1.0.0" },
		{ 		"http://www.fujaba.de/reachabilityGraph/timedsdm/0.4.0", "http://www.muml.org/reconfigurationverification/reachanalysis.reachabilitygraph/timedsdm/1.0.0" },
		{		"http://de/uni_paderborn/fujaba/umlrt/reachanalysis/time/timedsdm/reachabilityGraph", "http://www.muml.org/reconfigurationverification/reachanalysis.reachabilitygraph/timedsdm/1.0.0" }, 
		{		"http://www.fujaba.de/muml/examples/profiles/0.3.2 http://www.fujaba.de/muml/examples/profiles/0.3.2", "http://www.muml.org/examples/profiles/1.0.0" },
		{		"http://www.fujaba.de/modelinstance/0.4.0", "http://www.muml.org/modelinstance/1.0.0" },
		{		"http://www.storydriven.org/core/0.3.1", "http://www.muml.org/core/1.0.0" },
		{		"http://www.storydriven.org/core/expressions/0.3.1", "http://www.muml.org/core/expressions/1.0.0" },
		{		"http://www.storydriven.org/core/expressions/common/0.3.1", "http://www.muml.org/core/expressions/common/1.0.0" },
		{		"http://www.uni_paderborn.de/fujaba/muml/verification/uppaal/Mtctl/Quantifiers", "http://www.muml.org/uppaal/adapter/mtctl/quantifiers/1.0.0" },
		{		"http://www.uni_paderborn.de/fujaba/muml/verification/uppaal/Mtctl/Predicates", "http://www.muml.org/uppaal/adapter/mtctl/predicates/1.0.0" },
		{		"http://www.uni_paderborn.de/fujaba/muml/verification/uppaal/Mtctl/Sets", "http://www.muml.org/uppaal/adapter/mtctl/sets/1.0.0" },
		{		"http://www.uni_paderborn.de/fujaba/muml/verification/uppaal/Mtctl/BooleanLogic", "http://www.muml.org/uppaal/adapter/mtctl/booleanlogic/1.0.0" },
		{		"http://www.uni_paderborn.de/fujaba/muml/verification/uppaal/Mtctl/Comparables", "http://www.muml.org/uppaal/adapter/mtctl/comparables/1.0.0" },
		{		"http://www.uni_paderborn.de/fujaba/muml/verification/uppaal/options", "http://www.muml.org/uppaal/options/1.0.0" },
		{		"http://www.uni_paderborn.de/fujaba/muml/verification/uppaal/Mtctl", "http://www.muml.org/uppaal/adapter/mtctl/1.0.0" },
		{		"http://www.uni-paderborn.de/uppaal/trace/0.4.0", "http://www.muml.org/uppaal/trace/1.0.0" },
		{		"http://www.uni-paderborn.de/requirements/0.4.0", "http://www.muml.org/uppaal/requirements/1.0.0" },
		{		"http://www.fujaba.de/muml/allocation/ilp/0.1.0", "http://www.muml.org/psm/allocation/ilp/1.0.0" },
		{		"http://www.fujaba.de/muml/allocation/language/0.1.0/cs", "http://www.muml.org/psm/allocation/language/cs/1.0.0" },
		{		"http://www.fujaba.de/muml/allocation/language/0.1.0/oclcontext", "http://www.muml.org/psm/allocation/language/oclcontext/1.0.0" },
		{		"http://www.fujaba.de/muml/allocation/language/0.1.0/as", "http://www.muml.org/psm/allocation/language/as/1.0.0" },
		{		"http://www.fujaba.de/muml/psm/0.4.0/", "http://www.muml.org/psm/1.0.0" },
		{		"http://www.fujaba.de/muml/psm/allocation/0.4.0/", "http://www.muml.org/psm/allocation/1.0.0" },
		{		"http://www.fujaba.de/muml/psm/properties/0.4.0/", "http://www.muml.org/psm/properties/1.0.0" },
		{		"http://www.fujaba.de/muml/psm/realtimestatechart/0.4.0/", "http://www.muml.org/psm/realtimestatechart/1.0.0" },
		{		"http://www.fujaba.de/muml/psm/realtimestatechart/realtimestatechartparameter/0.1.0/", "http://www.muml.org/psm/realtimestatechart/realtimestatechartparameter/1.0.0" },
		{		"http://www.fujaba.de/muml/psm/realtimestatechart/realtimestatechartparameterbinding/0.1.0/", "http://www.muml.org/psm/realtimestatechart/realtimestatechartparameterbinding/1.0.0" },
		{		"http://www.fujaba.de/muml/psm/instance/0.4.0/", "http://www.muml.org/psm/instance/1.0.0" },
		{		"http://www.fujaba.de/muml/psm/portapimapping/0.4.0/", "http://www.muml.org/psm/portapimapping/1.0.0" },
		{		"http://www.fujaba.de/muml/psm/apiexpressions/0.4.0/", "http://www.muml.org/psm/apiexpressions/1.0.0" },
		{		"http://www.fujaba.de/muml/psm/codegen/0.4.0/", "http://www.muml.org/psm/codegen/1.0.0" },
		{		"http://www.fujaba.de/reachabilityAnalysis/ttcExample/0.1.0", "http://www.muml.org/example/ttccarplatooning/1.1.0" },                                                                                                                         
		{		"http://www.fujaba.de/muml/verification/sdd/basicSDD/0.4.0", "http://www.muml.org/storydiagram/verification/sdd/basicsdd/1.0.0" },
		{		"http://www.fujaba.de/reachabilityGraph/sdm/wrapper/0.4.0", "http://www.muml.org/storydiagram/reachanalysis/reachabilitygraph/sdm/wrapper/1.0.0" },
		{		"http://www.fujaba.de/reachabilityGraph/sdm/0.4.0", "http://www.muml.org/storydiagram.reachanalysis.reachabilitygraph/sdm/1.0.0" },
		{		"http://www.storydriven.org/patterns/expressions/pathbridge", "http://www.muml.org/storydiagram/patterns/expressions/pathbridge/1.0"},
		{		"http://www.storydriven.org/modeling/expressions/PathExpressions", "http://www.storydriven.org/modeling/expressions/PathExpressions" },
		{		"http://www.fujaba.de/muml/verification/sdd/0.4.0", "http://www.muml.org/storydiagram/verification/sdd/1.0.0" },
		{		"http://www.mdelab.de/sdm/interpreter/core/executionTrace/1.0", "http://www.muml.org/storydiagram/interpreter/core/executiontrace/1.0" },
		{		"http://www.fujaba.de/muml/verification/sdd/componentsdd/0.4.0", "http://www.muml.org/reconfiguration/verification/sdd/componentsdd/1.0.0" },
		{		"http://www.fujaba.de/muml/reconfiguration/0.3.18", "http://www.muml.org/reconfiguration/1.0.0" },
		{		"http://www.fujaba.de/muml/reconfiguration/expression/0.3.7", "http://www.muml.org/reconfiguration/expression/1.0.0" },
		{		"http://www.fujaba.de/muml/reconfiguration/structdatatype/0.3.18", "http://www.muml.org/reconfiguration/structdatatype/1.0.0" },
		{		"http://www.fujaba.de/muml/reconfiguration/protocolinstantiation/0.4.0", "http://www.muml.org/reconfiguration/protocolinstantiation/1.0.0" },
		{		"http://www.fujaba.de/muml/reconfiguration/reconfInstance/0.4.0", "http://www.muml.org/reconfiguration/reconfInstance/1.0.0" },
		{		"http://www.fujaba.de/graphviz/0.1.0", "http://www.muml.org/graphviz/1.0.0" },
		{		"http://www.fujaba.de/graphviz/dot/0.1.0", "http://www.muml.org/graphviz/dot/1.0.0" },
		{		"http://www.fujaba.de/graphviz/plain/0.1.0", "http://www.muml.org/graphviz/plain/1.0.0" },
		{		"http://www.fujaba.de/graphviz/common/0.1.0", "http://www.muml.org/graphviz/common/1.0.0" },
		{		"http://www.fujaba.de/graphviz/util/0.1.0", "http://www.muml.org/graphviz/util/1.0.0" },
		{		"http://www.fujaba.de/timedstorydiagram/0.1.0", "http://www.muml.org/reconfigurationverification/timedstorydiagram/1.0.0" },
		{		"http://www.fujaba.de/verification/timedstorychart/transform/helper/0.1.0", "http://www.fujaba.de/verification/timedstorychart/transform/helper/0.1.0" },                                                                                     
		{		"http://www.fujaba.de/reachabilityGraph/gtautomaton/labeling/0.1.0", "http://www.muml.org/reconfigurationverification/reachanalysis/reachabilitygraph/gtautomaton/labeling/1.0.0" },
		{		"http://www.fujaba.de/reachabilityGraph/gtautomaton/0.4.0", "http://www.muml.org/reconfigurationverification/reachanalysis/reachabilitygraph/gtautomaton/1.0.0" },
		
		// modelelementcategory keys
		{ "key=\"de.uni_paderborn.fujaba.muml.types.category\"", "key=\"org.muml.types.category\"", },
		{ "key=\"de.uni_paderborn.fujaba.muml.realtimestatechart.category\"", "key=\"org.muml.pim.realtimestatechart.category\"", },
		{ "key=\"de.uni_paderborn.fujaba.muml.instance.category\"", "key=\"org.muml.pim.instance.category\"", },
		{ "key=\"de.uni_paderborn.fujaba.muml.pattern.category\"", "key=\"org.muml.pim.pattern.category\"", },
		{ "key=\"de.uni_paderborn.fujaba.muml.protocol.category\"", "key=\"org.muml.pim.protocol.category\"", },
		{ "key=\"de.uni_paderborn.fujaba.muml.components.category\"", "key=\"org.muml.pim.components.category\"", },
		{ "key=\"de.uni_paderborn.fujaba.muml.messagetype.category\"", "key=\"org.muml.pim.messagetype.category\"", },
		
		// predefined types
		{ "href=\"platform:/plugin/de.uni_paderborn.fujaba.muml.types/model/predefined.mumltypes#", "href=\"platform:/plugin/org.muml.pim.types/model/predefined.mumltypes#" },
	};

	public static void main(String[] args) throws IOException {
		NSURIMigrator migrator = new NSURIMigrator();
		migrator.migrate(new File("../de.uni_paderborn.fujaba.muml.coordinationpatternlib"));
	}

	private void migrate(File dir) throws IOException {

		for (File file : dir.listFiles()) {
			if (!file.getName().startsWith(".")) {
				if (file.isDirectory()) {
					migrate(file);
				} else {
					handle(file);
				}
			}
		}

	}

	private void handle(File file) throws IOException {
		StringBuffer buf = new StringBuffer();
		BufferedReader br = null;
		FileWriter fr = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String line = br.readLine();
			if (line != null) {
				buf.append(processLine(line));
				while (null != (line = br.readLine())) {
					buf.append('\n');
					buf.append(processLine(line));
				}
			}
			fr = new FileWriter(file);
			fr.write(buf.toString());
		} finally {
			if (br != null) {
				br.close();
			}
			if (fr != null) {
				fr.close();
			}
		}
	}

	private Object processLine(String line) {
		for (String[] replacement : replacements) {
			if (replacement.length == 2) {
				line = line.replaceAll(replacement[0], replacement[1]);
			}
		}
		return line;
	}

}
