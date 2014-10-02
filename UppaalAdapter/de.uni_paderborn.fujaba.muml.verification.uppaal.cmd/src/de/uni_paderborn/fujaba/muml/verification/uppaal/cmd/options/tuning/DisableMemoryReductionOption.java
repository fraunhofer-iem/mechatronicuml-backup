package de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.tuning;

import de.uni_paderborn.cmd.Option;
import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.VerifyTACommand;

public class DisableMemoryReductionOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "C";
	}

}
