package c.ch.readModifyWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class b_SynchronizedRandomNumberGenerator {
	Random numGen = new Random(100);
	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();

	public synchronized void task1() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list1.add(numGen.nextInt());
	}

	public synchronized void task2() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list2.add(numGen.nextInt());
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			task1();
			task2();
		}
	}

	public void main() {
		System.out.println("Starting...");

		long beginTime = System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Task Duration : " + (System.currentTimeMillis() - beginTime));
		System.out.println("List 1 : " + list1.size() + " | List 2 :" + list2.size());
	}

	public static void main(String[] args) {
		b_SynchronizedRandomNumberGenerator b = new b_SynchronizedRandomNumberGenerator();
		b.main();
	}
}
