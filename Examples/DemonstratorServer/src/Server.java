import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
	
	public static final byte[] EMPTY_MESSAGE = new byte[32]; // 32 zeroes
	public static final byte[] START_MESSAGE = new byte[] { 2, 20, 6, 8, 20, 16, 14, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	
	private Map<Integer, List<byte[]>> messages = new HashMap<Integer, List<byte[]>>();

    public static void main(String[] args) throws IOException {
        new Server().startServer();
       
    }

    public void startServer() throws IOException {
        final ExecutorService clientProcessingPool = Executors.newFixedThreadPool(10);

        Runnable serverTask = new Runnable() {
            @Override
            public void run() {
                try {
                    @SuppressWarnings("resource")
					ServerSocket serverSocket = new ServerSocket(9999);
                    System.out.println("Waiting for clients to connect...");
                    while (true) {
                        Socket clientSocket = serverSocket.accept();
                        clientProcessingPool.submit(new ClientTask(clientSocket));
                    }
                } catch (IOException e) {
                    System.err.println("Unable to process client request");
                    e.printStackTrace();
                }
            }
        };
        Thread serverThread = new Thread(serverTask);
        serverThread.start();
        
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while(null != (line = console.readLine())) {
        	if ("start".equals(line)) {
        		pushMessage(0, START_MESSAGE);
        		System.out.println("*pushed start message*");
        	}
        }
        
    }
    
    public synchronized void pushMessage(int portId, byte[] message) {
    	List<byte[]> messagesList = messages.get(portId);
    	if (messagesList == null) {
    		messagesList = new ArrayList<byte[]>();
    		messages.put(portId, messagesList);
    	}
    	messagesList.add(message);
    }
    
    public synchronized byte[] popMessage(int portId) {
    	List<byte[]> messagesList = messages.get(portId);
    	if (messagesList != null && !messagesList.isEmpty()) {
    		return messagesList.remove(0);
    	}
    	return null;
    }
    
    private class ClientTask implements Runnable {
        private final Socket clientSocket;

        private ClientTask(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
        	OutputStream os = null;
            InputStream is = null;
        	try {
	            while (true) {
					os = clientSocket.getOutputStream();
					is = clientSocket.getInputStream();
					
		            byte receive[] = new byte[32];
		            if (is.read(receive) != -1) {
			            String clientName = getClientName(clientSocket.getInetAddress());

	            		PrintStream out = System.out;
		            	if (clientName.equals("SectionControl")) {
		            		out = System.err;
		            	}
		            	out.println(getTime() + " " + Arrays.toString(receive));
	            		
	            		
			            
			            boolean request = receive[0] == 0;
			            if (request) {
			            	int portId = receive[1];
			            	if (portId == 0) {
			            		pushMessage(0, START_MESSAGE);
			            	}
			            	byte[] message = popMessage(portId);
			            	if (message == null) {
			            		message = EMPTY_MESSAGE;
			            	} else {
			            		out.println(getTime() + " -> sent '" + clientName + "' port #" + portId + ":\t " + Arrays.toString(message));
			            	}
		            	
		            		os.write(message);
		    	        	os.flush();
		
			            } else {
			            	int portId = receive[1];
			            	if (portId > 0) {
			            		pushMessage(portId, receive);
			            		out.println(getTime() + " <- recv '" + clientName + "' port #" + portId + ":\t " + Arrays.toString(receive));
			            		
			            	} else {
			            		System.err.println("XXXX invalid port id XXXX");
			            	}
			            }
		            }
		            return;
	            }
	        	
			} catch (IOException e) {
				e.printStackTrace();
        	} finally {
	            try {
	            	if (is != null) {
	            		is.close();
	            	}
	            	if (os != null) {
	            		os.close();
	            	}
					clientSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
        	}
        	System.out.println();
        }
    }

	public String getClientName(InetAddress inetAddress) {
		String clientName = inetAddress.toString().substring(1);
		if (clientName.equals("192.168.0.103")) {
			return "ApproacherR2";
		}
		if (clientName.equals("192.168.0.104")) {
			return "OvertakeeR2";
		}
		if (clientName.equals("192.168.0.105")) {
			return "OvertakerR2";
		}
		if (clientName.equals("192.168.0.102")) {
			return "SectionControl";
		}
		return clientName;
	}

	public String getTime() {
		DateFormat df = DateFormat.getTimeInstance(DateFormat.MEDIUM, new Locale ("de", "DE"));
		String formattedDate = df.format (new Date ());
		return "[" + formattedDate + "]";
	}
}