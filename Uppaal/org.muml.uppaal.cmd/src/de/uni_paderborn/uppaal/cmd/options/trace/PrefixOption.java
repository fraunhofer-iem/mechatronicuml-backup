package de.uni_paderborn.uppaal.cmd.options.trace;

import org.muml.core.common.cmd.Option;

import de.uni_paderborn.uppaal.cmd.VerifyTACommand;

public class PrefixOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "f";
	}

}
