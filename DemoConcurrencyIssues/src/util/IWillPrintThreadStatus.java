package util;

import java.lang.Thread.State;

public class IWillPrintThreadStatus implements Runnable{
	
	private Thread inputThread;
	private String name;
	
	
	public IWillPrintThreadStatus(String name, Thread inputThread) {
		super();
		this.inputThread = inputThread;
		this.name = name;
	}

	@Override
	public void run() {
		// I'm Setting the name here.. Why not in constructor ?
		Thread.currentThread().setName(name);
		while(true) {
			System.out.println("*SA : " +inputThread.getName() +" : " +inputThread.getState().toString() + "\n");
			sleep();
		}
	}
	
	public void sleep(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
