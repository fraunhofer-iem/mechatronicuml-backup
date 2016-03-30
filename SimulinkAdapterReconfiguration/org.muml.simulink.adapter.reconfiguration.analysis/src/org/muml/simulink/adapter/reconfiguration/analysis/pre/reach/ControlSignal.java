package org.muml.simulink.adapter.reconfiguration.analysis.pre.reach;

/**
 * Constants for the generation of the setup/fading/teardown functions
 */
public interface ControlSignal 
{
	public interface Component {
		static final int INACTIVE = 0;
		static final int ACTIVE = 1;
	}
	
	public interface FadingComponent {
		static final int INACTIVE = 0;
		static final int FADING = 1;
	}
	
	public interface Connection {
		static final int INACTIVE = 0;
		static final int ACTIVE = 1;
	}

}
