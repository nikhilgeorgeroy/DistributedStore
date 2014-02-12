package com.dht.transport;

import org.zeromq.ZContext;

public class SocketMetaData {
	
	
	private  final  String protocol;
			
	private  final  String ipAddress;
	
	private  final  String port ;
	
	private int ZMQDataType; 

	
	SocketMetaData (int zmqDataType,String protocol,String ipAddress,String port){

		this.protocol = protocol;
		this.ipAddress = ipAddress;
		this.port = port;
		this.ZMQDataType = zmqDataType;
	}
	

	String getProtocol(){
		return protocol;
	}
	
	String getIPAddress(){
		return ipAddress;
	}
	
	String getPort(){
		return port;
	}
	
	int getZMQDataType(){
		return ZMQDataType;
	}
}
