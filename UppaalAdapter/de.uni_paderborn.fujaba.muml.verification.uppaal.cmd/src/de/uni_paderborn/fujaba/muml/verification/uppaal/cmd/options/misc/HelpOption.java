package de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.misc;

import de.uni_paderborn.cmd.Option;
import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.VerifyTACommand;

public class HelpOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "h";
	}

}
