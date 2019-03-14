package com.thread;

import java.util.concurrent.ThreadFactory;

public class MaxPriorityThreadFactory implements ThreadFactory{
	
	private int counter=1;
	private String name;
	
	MaxPriorityThreadFactory(String name){
		this.name=name;
	}

	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread thread=new Thread(r,name+ "" +counter);
		thread.setPriority(Thread.MAX_PRIORITY);
		//thread.setName(name);
		counter++;
		System.out.println("created thread with name "+ thread.getId()  + "  "+thread.getName());
		return thread;
	}

	
	
}
