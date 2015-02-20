package de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.tuning;

import java.util.Collections;
import java.util.List;

import de.uni_paderborn.cmd.Option;
import de.uni_paderborn.cmd.OptionArgument;
import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.VerifyTACommand;

public class ExtrapolationOption extends Option<VerifyTACommand> {
	
	public ExtrapolationOption(ExtrapolationOperator operator) {
		this.operator = operator;
	}
	
	private ExtrapolationOperator operator;
	
	@Override
	public String getOption() {
		return "n";
	}
	
	@Override
	public List<? extends OptionArgument<ExtrapolationOption>> getArguments() {
	
		return Collections.singletonList(
			
			new OptionArgument<ExtrapolationOption>() {
				
				@Override
				public String getArgument() {
					return String.valueOf(operator.getOperator());
				}
		
			}
				
		);	
		
	}

	public enum ExtrapolationOperator {
		
		Automatic (0),
        No(1),
        Difference(2),
        LocationBased(3),
        LowerUpper(4);
		
		private int operator;
		
		private ExtrapolationOperator(int operator) {
			this.operator = operator;
		}
		
		private int getOperator() {
			return operator;
		}
		
	}

}
