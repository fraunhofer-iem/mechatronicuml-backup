/**
 * 
 */
package org.muml.udbm.ruby;

import java.io.IOException;

/**
 * @author Tobias E
 *
 */
public class RubyClientServerShutdownThread extends Thread {

	private RubyUDBMClient runningRubyClient;
	
	/**
	 * @param runningRubyClient
	 */
	public RubyClientServerShutdownThread(RubyUDBMClient runningRubyClient) {
		this.runningRubyClient = runningRubyClient;
	}



	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		try {
			runningRubyClient.shutdownClient();
		} catch (IOException e) {
			// should never happen
			e.printStackTrace();
		}
	}

}
