package de.uni_paderborn.uppaal.cmd.options.misc;

import org.muml.common.cmd.Option;

import de.uni_paderborn.uppaal.cmd.VerifyTACommand;

public class HelpOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "h";
	}

}
