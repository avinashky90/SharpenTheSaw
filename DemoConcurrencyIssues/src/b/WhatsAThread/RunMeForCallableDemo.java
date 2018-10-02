package b.WhatsAThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunMeForCallableDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Callable<String> callable = new IImplementACallable();
		
		Future<String> future = executor.submit(callable);
//		executor.shutdown();
		System.out.println(future.get().toString());
		
		System.out.println("Exiting main thread..");
	}
}
