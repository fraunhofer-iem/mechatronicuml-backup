package de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.tuning;

import java.util.Collections;
import java.util.List;

import de.uni_paderborn.cmd.Option;
import de.uni_paderborn.cmd.OptionArgument;
import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.VerifyTACommand;

public class SearchOrderOption extends Option<VerifyTACommand> {
	
	public SearchOrderOption(SearchOrderOperator operator) {
		this.operator = operator;
	}
	
	private SearchOrderOperator operator;
	
	@Override
	public String getOption() {
		return "o";
	}
	
	@Override
	public List<? extends OptionArgument<SearchOrderOption>> getArguments() {
	
		return Collections.singletonList(
			
			new OptionArgument<SearchOrderOption>() {
				
				@Override
				public String getArgument() {
					return String.valueOf(operator.getOperator());
				}
		
			}
				
		);	
		
	}

	
	public enum SearchOrderOperator {
				
		BreadthFirst(0),
        DepthFirst(1),
        RandomDepthFirst(2),
        OptimalFirst(3),
        RandomOptimalFirst(4);
		
		private int operator;
		
		private SearchOrderOperator(int operator) {
			this.operator = operator;
		}
		
		private int getOperator() {
			return operator;
		}
		
	}

}
