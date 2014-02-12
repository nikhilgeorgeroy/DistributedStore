package com.dht.transport;

public class Network {
	
	protected static final String TCP = new String("tcp");
	protected static final String INPROC = new String("inproc");
	protected static final String LOCALHOST = new String("localhost");
	protected static final String _ = new String("://");
	protected static final String __ = new String(":");
	
	
	public static String builder(String protocol, String peerID, String portID ){
		
		return new String(protocol+"://"+peerID+":"+portID);
	}

}
