package de.uni_paderborn.uppaal.cmd.options.misc;

import de.uni_paderborn.fujaba.common.cmd.Option;
import de.uni_paderborn.uppaal.cmd.VerifyTACommand;

public class VersionNumberOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "v";
	}

}
