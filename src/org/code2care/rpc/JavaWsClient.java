package org.code2care.rpc;

import java.net.URL;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;


public class JavaWsClient {
   public static void main (String [] args) {
   
   
	   try {
			System.out.println("XML-RPC Client call to : http://localhost:1080/xmlrpc/xmlrpc");
			XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
			config.setServerURL(new URL(
					"http://localhost:1080/xml-rpc-example/xmlrpc"));
			XmlRpcClient client = new XmlRpcClient();
			client.setConfig(config);
			Object[] params = new Object[] { "Chris Martin" };
			String response = (String) client.execute("HelloWorld.message", params);
			System.out.println("Message : " + response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	    
    	   

    
   }
}