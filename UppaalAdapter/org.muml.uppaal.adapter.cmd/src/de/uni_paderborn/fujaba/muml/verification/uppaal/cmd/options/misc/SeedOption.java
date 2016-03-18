package de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.misc;

import java.util.Collections;
import java.util.List;

import de.uni_paderborn.fujaba.common.cmd.Option;
import de.uni_paderborn.fujaba.common.cmd.OptionArgument;
import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.VerifyTACommand;

public class SeedOption extends Option<VerifyTACommand> {
	
	public SeedOption(int seed) {
		this.seed = seed;
	}
	
	private int seed;
	
	@Override
	public String getOption() {
		return "r";
	}
	
	@Override
	public List<? extends OptionArgument<SeedOption>> getArguments() {
	
		return Collections.singletonList(
			
			new OptionArgument<SeedOption>() {
				
				@Override
				public String getArgument() {
					return String.valueOf(seed);
				}
		
			}
				
		);	
		
	}

}
