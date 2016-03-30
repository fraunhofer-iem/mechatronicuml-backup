package de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.tuning;

import org.muml.common.cmd.Option;

import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.VerifyTACommand;

public class BitstateHashingOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "Z";
	}

}
