package de.uni_paderborn.fujaba.muml.verification.kronos.cmd;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.IPreferenceStore;

import de.uni_paderborn.cmd.Option;
import de.uni_paderborn.cmd.OptionArgument;
import de.uni_paderborn.cmd.Parameter;
import de.uni_paderborn.cmd.PathCommand;
import de.uni_paderborn.fujaba.muml.verification.modelchecker.ui.MCRegistry;
import de.uni_paderborn.fujaba.muml.verification.modelchecker.ui.preferences.PreferenceConstants;

public class KronosCommand extends PathCommand {
	
	private IPath modelPath;
	private IPath queryPath;
	private String kronosPath = ""; 

	public void setKronosPath(String kronosPath) {
		this.kronosPath = kronosPath;
	}

	public KronosCommand() {
	
		super(new Path("bash"));

		IPreferenceStore store = MCRegistry.getDefault().getPreferenceStore();
		kronosPath = store.getString(PreferenceConstants.P_PATH);
		
		Parameter<KronosCommand> param = new Option<KronosCommand>() {

			@Override
			public String getOption() {
				return "c";
			}
			
			@Override
			public List<? extends OptionArgument<? extends Option<KronosCommand>>> getArguments() {
				List<OptionArgument<Option<KronosCommand>>> args = new ArrayList<OptionArgument<Option<KronosCommand>>>();
				OptionArgument<Option<KronosCommand>> modelCheckerCallArg = new OptionArgument<Option<KronosCommand>>() {

					@Override
					public String getArgument() {
						return kronosPath + " -reach " + "D:/test12.xml D:/test12.q"; // model checker path
					}
//					
//					@Override
//					public List<? extends Parameter<?>> getParameters() {
//						List<PathArgument<KronosCommand>> pathArgs = new ArrayList<PathArgument<KronosCommand>>();
//						
//						PathArgument<KronosCommand> modelPathArg = new PathArgument<KronosCommand>(modelPath);
//						PathArgument<KronosCommand> queryPathArg = new PathArgument<KronosCommand>(queryPath);
//						
//						pathArgs.add(modelPathArg);
//						pathArgs.add(queryPathArg);
//						
//						return pathArgs;
//					}

				};
				args.add(modelCheckerCallArg);
				return args;
			}
		};
		addParameter(param);
	}

}
