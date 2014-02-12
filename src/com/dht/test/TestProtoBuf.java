package com.dht.test;

import com.dht.serializer.*;
import com.dht.serializer.MessageX.Command;
import com.dht.serializer.MessageX.Data;
import com.dht.serializer.MessageX.Message;
import com.dht.serializer.MessageX.Peer;
import com.google.protobuf.ByteString;

public class TestProtoBuf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Peer peer = Peer.newBuilder()
				.setName("DXP")
				.setType("DISPATCHER")
				.build();
		
		Command command = Command.newBuilder()
				.setCommand("PING")
				.addArg("TEST")
				.build();
		
		Data data = Data.newBuilder()
				.setKey("Testkey")
				.setData(ByteString.copyFromUtf8("TESTDATA"))
				.build();
		
		Message message = Message.newBuilder()
				.setAgent(peer)
				.setData(data)
				.addCommand(command)
				.addCommand(command)
				.build();
		
		
		//get the Agent-Name
		System.out.println(message.getAgent().getName().toString());
		
		//print EveryThing
		System.out.println(message.toString());
		
		String X = new String("sdfsd");		
		long longX = Integer.MIN_VALUE + X.hashCode();
		
		
	}

}
