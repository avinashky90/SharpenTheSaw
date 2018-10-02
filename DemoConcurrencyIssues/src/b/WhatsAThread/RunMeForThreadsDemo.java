package b.WhatsAThread;

import util.IWillPrintThreadStatus;

public class RunMeForThreadsDemo {
	/*
	 * 1. A seperate thread of execution vs Simple execution
	 * 2. Call Multiple times ?
	 */
	public static void main(String[] args) throws InterruptedException {
		
		Thread childThread = new IExtendThreadClass("ChildThread");
//		Thread childThread = new Thread(new IImplementARunnableClass("ChildThread"));
		
		
		startTrackingThreadStatus(childThread);
		
		childThread.start();
//		childThread.run();
		
		childThread.join();
		childThread.start();
		
		System.out.println("####################################################");
		System.out.println("Exiting Main Thread..\n");
	}
	
	public static void startTrackingThreadStatus(Thread threadToBeTracked){
		Thread childThreadStats = new Thread(new IWillPrintThreadStatus("ChildThreadTracker", threadToBeTracked));
		Thread mainThreadStats = new Thread(new IWillPrintThreadStatus("MainThreadTracker", Thread.currentThread()));
		childThreadStats.start();
		mainThreadStats.start();
	}
}
