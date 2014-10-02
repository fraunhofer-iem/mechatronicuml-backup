package de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.tuning;

import java.util.Collections;
import java.util.List;

import de.uni_paderborn.cmd.Option;
import de.uni_paderborn.cmd.OptionArgument;
import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.VerifyTACommand;

public class SpaceConsumptionOption extends Option<VerifyTACommand> {
	
	public SpaceConsumptionOption(SpaceConsumptionOperator operator) {
		this.operator = operator;
	}
	
	private SpaceConsumptionOperator operator;
	
	@Override
	public String getOption() {
		return "S";
	}
	
	@Override
	public List<? extends OptionArgument<SpaceConsumptionOption>> getArguments() {
	
		return Collections.singletonList(
			
			new OptionArgument<SpaceConsumptionOption>() {
				
				@Override
				public String getArgument() {
					return String.valueOf(operator.getOperator());
				}
		
			}
				
		);	
		
	}

	
	public enum SpaceConsumptionOperator {
				
		None(0),
        Default(1),
        Most(2);
		
		private int operator;
		
		private SpaceConsumptionOperator(int operator) {
			this.operator = operator;
		}
		
		private int getOperator() {
			return operator;
		}
		
	}

}
