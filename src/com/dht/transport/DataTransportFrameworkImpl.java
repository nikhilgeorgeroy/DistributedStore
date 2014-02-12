package com.dht.transport;

import org.zeromq.ZContext;
import org.zeromq.ZMQ;
import org.zeromq.ZMQ.Socket;

public  class DataTransportFrameworkImpl {
	
	
	private final SocketMetaData sockInfo; 
	
	private final ZMQ.Socket socket;
	
	private final ZContext ctx;
	
	public DataTransportFrameworkImpl(ZContext ctx,  SocketMetaData sockInfo){
		this.ctx = ctx;
		this.sockInfo = sockInfo;	
		socket = initSocket(sockInfo);
		
	}
	
	
	public ZMQ.Socket initSocket(SocketMetaData sockInfo){
		
		return ctx.createSocket(sockInfo.getZMQDataType());
	}

	
	public void connect()  {		
		socket.connect(Network.builder(sockInfo.getProtocol(), sockInfo.getIPAddress() ,sockInfo.getPort()));
		
	}

	
	public void bind()  {
		socket.bind(Network.builder(sockInfo.getProtocol(), sockInfo.getIPAddress() ,sockInfo.getPort()));
	}

	public void setIdentity(byte[] identity){
		socket.setIdentity(identity);
	}
	
	public ZMQ.Socket getSocket(){
		return socket;
	}
	
	public boolean receive() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean send()  {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
