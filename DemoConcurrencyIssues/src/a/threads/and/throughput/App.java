package a.threads.and.throughput;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

	private List<Task> tasks = new ArrayList<>();
	CountDownLatch cnt = new CountDownLatch(100);

	public void initializetasks() {
		for (int i = 0; i < 100; i++) {
			tasks.add(new Task(cnt));
		}
	}

	public void run() {

		try {
			TimeUnit.MILLISECONDS.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting..");
	}

	public void singleThreadedIdiom() {
		for (int i = 0; i < 100; i++) {
			this.run();
		}
	}

	public void parallelExecutionIdiom(List<Task> tasks) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		for (Task task : tasks) {
			service.submit(task);
		}
		service.shutdown();
		try {
			cnt.await();
		} catch (InterruptedException e) {}
	}

	public static void main(String[] args) {
		App app = new App();
		app.initializetasks();
		
		//start timer
		long start = System.currentTimeMillis();

//		 app.singleThreadedIdiom();
		app.parallelExecutionIdiom(app.tasks);
		
		//stop timer
		long timeTaken = System.currentTimeMillis() - start;
		System.out.println(timeTaken / 1000 + " secs");
	}
}
