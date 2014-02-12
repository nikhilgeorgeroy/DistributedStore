package com.dht.transport;

import org.zeromq.ZContext;
import org.zeromq.ZMQ;

public class DataTransportFrameworkFactory {
	
	private final static ZContext ctx = new ZContext();
		
	public static DataTransportFrameworkImpl createSocket(SocketMetaData sockInfo){
		
		DataTransportFrameworkImpl socket = new DataTransportFrameworkImpl(ctx,sockInfo);
	
		return socket;
	}
	
	
	public static void main(){
		
		DataTransportFrameworkImpl X = DataTransportFrameworkFactory.createSocket(new SocketMetaData(ZMQ.REQ,Network.TCP,Network.LOCALHOST,"5555"));
		X.connect();
		
	}
	
}
