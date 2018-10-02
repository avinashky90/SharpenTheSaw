package a.threads.and.throughput;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
	
	private CountDownLatch cnt;
	
	public Task(CountDownLatch cnt) {
		super();
		this.cnt = cnt;
	}

	@Override
	public void run() {
		
		try {
			TimeUnit.MILLISECONDS.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting..");
		cnt.countDown();
	}

}
