package de.uni_paderborn.uppaal.cmd.options.tuning;

import java.util.Collections;
import java.util.List;

import de.uni_paderborn.fujaba.common.cmd.Option;
import de.uni_paderborn.fujaba.common.cmd.OptionArgument;
import de.uni_paderborn.uppaal.cmd.VerifyTACommand;

public class HashTableSizeOption extends Option<VerifyTACommand> {
	
	public HashTableSizeOption(int n) {
		this.n = n;
	}
	
	private int n;
	
	@Override
	public String getOption() {
		return "H";
	}
	
	@Override
	public List<? extends OptionArgument<HashTableSizeOption>> getArguments() {
	
		return Collections.singletonList(
			
			new OptionArgument<HashTableSizeOption>() {
				
				@Override
				public String getArgument() {
					return String.valueOf(n);
				}
		
			}
				
		);	
		
	}

}
