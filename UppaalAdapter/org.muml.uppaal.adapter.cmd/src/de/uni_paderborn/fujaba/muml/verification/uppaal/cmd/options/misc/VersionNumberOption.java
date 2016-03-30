package de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.misc;

import org.muml.common.cmd.Option;

import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.VerifyTACommand;

public class VersionNumberOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "v";
	}

}
