package org.muml.udbm.ruby.test;

import java.io.IOException;
import java.net.UnknownHostException;

import org.junit.AfterClass;
import org.junit.Test;
import org.muml.udbm.ruby.RubyUDBMClient;

public class RubyUDBMTestFinalizer {

	@Test
	public void dummyTest(){
		
	}
	
	@AfterClass
	public static void shutdownClient(){
		RubyUDBMClient client = new RubyUDBMClient();
		try {
			client.connect();
			
			client.shutdownServerAndClient();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
