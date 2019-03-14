package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String args[]) {
		
		ExecutorService executor=Executors.newFixedThreadPool(5);
		
		for(int i=1;i<=10;i++) {
			WorkerThread workerThread=new WorkerThread("thread " + i);
			executor.execute(workerThread);
		}
		
		executor.shutdown();
		
		 while (!executor.isTerminated()) {
	        }
		 
		 System.out.println("Finished all threads");
		
		
	}
	
}
