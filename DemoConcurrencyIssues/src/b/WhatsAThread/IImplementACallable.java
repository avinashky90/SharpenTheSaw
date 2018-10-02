package b.WhatsAThread;

import java.util.concurrent.Callable;

public class IImplementACallable implements Callable<String> {

	
	@Override
	public String call() throws Exception {
		for(int i = 0; i<10; i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return "Exiting Callable Thread. Btw my name is " + Thread.currentThread().getName();
	}

}
