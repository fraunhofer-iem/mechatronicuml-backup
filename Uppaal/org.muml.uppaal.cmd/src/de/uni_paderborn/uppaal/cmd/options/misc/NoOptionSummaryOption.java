package de.uni_paderborn.uppaal.cmd.options.misc;

import org.muml.core.common.cmd.Option;

import de.uni_paderborn.uppaal.cmd.VerifyTACommand;

public class NoOptionSummaryOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "q";
	}

}
