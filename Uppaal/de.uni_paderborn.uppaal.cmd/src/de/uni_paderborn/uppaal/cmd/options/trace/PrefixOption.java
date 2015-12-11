package de.uni_paderborn.uppaal.cmd.options.trace;

import de.uni_paderborn.fujaba.common.cmd.Option;
import de.uni_paderborn.uppaal.cmd.VerifyTACommand;

public class PrefixOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "f";
	}

}
