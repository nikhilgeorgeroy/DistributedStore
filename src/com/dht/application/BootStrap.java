package com.dht.application;
import com.dht.component.Dispatcher;
import com.dht.component.NodeFactory;

public class BootStrap {
	
	
	private final int initialNodeCount ; 
	
	private final int nodeCapacity ;
	
	private final Dispatcher dispatcher ;
	
	private final NodeFactory nodeFactory;
	
	BootStrap(int initialNodeCount,int nodeCapacity){
		this.initialNodeCount = initialNodeCount;
		this.nodeCapacity = nodeCapacity;
		
		this.dispatcher = new Dispatcher();
		this.nodeFactory = new NodeFactory(initialNodeCount,nodeCapacity);
		
	
	}
	
	
	
	public static void main(String[] args){
		
		assert(args.length==2);	
		final int initialNodeCount = Integer.valueOf(args[0]);
		final int nodeCapacity = Integer.valueOf(args[1]);
		
		BootStrap DHTEngine = new BootStrap(initialNodeCount,nodeCapacity);
		
		
	}

}
