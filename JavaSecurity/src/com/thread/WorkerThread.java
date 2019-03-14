package com.thread;

public class WorkerThread  implements Runnable{
	
	String name;
	
	public WorkerThread(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()  +" ........"+name );
		processWorkerThread();
		System.out.println(Thread.currentThread().getName()  +" End." );
	}
	
	public void processWorkerThread() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
