package de.uni_paderborn.uppaal.cmd.options.misc;

import java.util.Collections;
import java.util.List;

import org.muml.common.cmd.Option;
import org.muml.common.cmd.OptionArgument;

import de.uni_paderborn.uppaal.cmd.VerifyTACommand;

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
