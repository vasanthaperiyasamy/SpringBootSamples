package com.thread;

public class ThreadFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxPriorityThreadFactory highPriorityThread=new MaxPriorityThreadFactory(" Thread ..");
		
		Runnable task=new Task("MaxPriorityThread");
		for(int j=0;j<10;j++) {
			highPriorityThread.newThread(task).start();
			
		}
	
		
	}

}
