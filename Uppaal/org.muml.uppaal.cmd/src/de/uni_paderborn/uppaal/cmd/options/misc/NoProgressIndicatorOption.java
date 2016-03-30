package de.uni_paderborn.uppaal.cmd.options.misc;

import org.muml.core.common.cmd.Option;

import de.uni_paderborn.uppaal.cmd.VerifyTACommand;

public class NoProgressIndicatorOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "s";
	}

}
