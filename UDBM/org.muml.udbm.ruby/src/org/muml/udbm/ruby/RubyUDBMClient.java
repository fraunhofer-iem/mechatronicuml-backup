/**
 * 
 */
package org.muml.udbm.ruby;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

import org.muml.udbm.UDBMClock;

/**
 * @author Tobias E, Chris H
 * 
 */
public class RubyUDBMClient {

	public static final String CONTEXT_NAME_PREFIX = "C";
	public static final String CONTEXT_VAR_PREFIX = "x";

	private String address = "localhost";
	private int port = 8326;
	private Socket udbmClientSocket;
	
	/** The writer used to write messages to the socket. */
	private PrintWriter writer;
	
	/** The reader used to read messages from the socket. */
	private BufferedReader reader;

	private boolean connected = false;
	
	//private HashMap<String, String> contextVariables;
	private String lastContextKey;
	private String lastContextVariable;
	
	public String getContextVariable(List<UDBMClock> clocks){
		String key = buildContextKey(clocks);
		
		//if current key does not match the last one, create new context
		if (!key.equals(lastContextKey)){
			try {
				createContext(clocks, key);
			} catch (IOException e) {
				return "";
			}
		}
		
		return lastContextVariable;
	}
	
	/**
	 * @return the connected
	 */
	public boolean isConnected() {
		return connected;
	}

	public void connect() throws UnknownHostException, IOException {
		udbmClientSocket = new Socket(address, port);
		//contextVariables = new HashMap<String, String>();
		
		//set up reader and writer for the new socket
		writer = new PrintWriter(udbmClientSocket.getOutputStream(), true);
		reader = new BufferedReader(new InputStreamReader(
				udbmClientSocket.getInputStream()));
	}

	public void switchToIdle() throws IOException {
		writer.println("disconnect");
	}

	public void shutdownClient() throws IOException {
		if (udbmClientSocket != null){
			udbmClientSocket.close();
			writer.close();
			reader.close();
		}
	}

	public void shutdownServerAndClient() throws IOException {
		writer.println("shutdown");
		shutdownClient();
	}

	/**
	 * Sets the context for the UDBM operation and defines the clocks to be used.
	 * This operation will create one context for each new list of clockIds (i.e. a 
	 * list containing the same IDs hasn't been provided before). Otherwise, an 
	 * existing context will be used.
	 * 
	 * @param clockIds the ordered list of clock IDs for the current operation
	 * @throws IOException
	 */
	public void setContext(List<UDBMClock> clocks) throws IOException {

		//check whether suitable context already exists
		String key = buildContextKey(clocks);
		
		//if context exists, use it, otherwise create new one
		if(!(key.equals(lastContextKey))){
			createContext(clocks, key);
		}
		
		defineClockVariables(lastContextVariable, clocks);
	}
	
	/**
	 * Creates a new context including a context variable in the udbmServer using the given list of clocks. 
	 * The created context variable will be associated with the newContextKey.
	 * @param clocks
	 * @param newContextKey
	 * @return
	 * @throws IOException
	 */
	private boolean createContext(List<UDBMClock> clocks, String newContextKey) throws IOException{
		writer.println("createContextReq");
		String answer = reader.readLine();
		String contextVariable = null;
		if (answer.startsWith("createContextAck")) {
			String contextNumber = answer.substring(16);
			contextVariable = CONTEXT_VAR_PREFIX + contextNumber;
			
			//Store values
			lastContextKey = newContextKey;
			lastContextVariable = contextVariable;
			
			// Ruby Code to create the context
			String createContextString = contextVariable + "=Context.create('"
					+ CONTEXT_NAME_PREFIX + contextNumber + "'";
			for (UDBMClock clock : clocks) {
				createContextString += ",:" + clock.getId();
			}
			createContextString += ")";

			writer.println(createContextString);
		}
		
		answer = reader.readLine();
		if (answer.equals("contextCreated")){
			return true;
		} else {
			return false;
		}
	}

	private void defineClockVariables(String contextVar, List<UDBMClock> clocks) throws IOException {
		writer.println("clockVarDefReq");
		String answer = reader.readLine();
		if (answer.equals("clockVarDefAck")) {

			// Ruby Code to create the clock variable definitions
			String defineClockVarString = "";
			for (UDBMClock clock : clocks) {
				defineClockVarString += "" + clock.getId() + "=" + contextVar + "."
				+ clock.getId() + ";";
			}

			writer.println(defineClockVarString);
			
			answer = reader.readLine();
		}
	}

	public String executeFedOperation(String rubySetDefinition)
			throws IOException {
		writer.println("executeFedOpReq");
		String answer = reader.readLine();
		if (answer.equals("executeFedOpAck")) {
			writer.println(rubySetDefinition);
		}
		answer = reader.readLine();
		return answer;
	}

	public boolean testFedProperty(String rubySetDefinition) throws IOException {
		boolean result = false;

		writer.println("checkFedPropertyReq");
		String answer = reader.readLine();
		if (answer.equals("checkFedPropertyAck")) {
			writer.println(rubySetDefinition);
		}
		answer = reader.readLine();
		if (answer.equals("true")) {
			result = true;
		} else if (answer.equals("false")) {
			result = false;
		} else {
			System.err.println("Unexpexted Result from UDBM-Server received!");
		}
		return result;
	}
	
	/**
	 * Builds a key for the context variable to search and store the context variable in the map
	 * of all context variables.
	 * @param clockIds
	 * @return
	 */
	private String buildContextKey (List<UDBMClock> clocks){
		StringBuilder result = new StringBuilder();
		for(UDBMClock c : clocks){
			result.append(c.getId());
			result.append('#');
		}
		return result.toString();
	}
	
}
