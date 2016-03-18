package de.uni_paderborn.uppaal.cmd.options.misc;

import de.uni_paderborn.fujaba.common.cmd.Option;
import de.uni_paderborn.uppaal.cmd.VerifyTACommand;

public class SummaryOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "u";
	}

}
