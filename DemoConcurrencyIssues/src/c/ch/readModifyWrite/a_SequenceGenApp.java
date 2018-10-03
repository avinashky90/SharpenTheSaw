package c.ch.readModifyWrite;

public class a_SequenceGenApp {

	public static void main(String[] args) {
		// if there are no concurrency 
		new Thread(new SequenceClient()).start();
		new Thread(new SequenceClient()).start();
	}

}

class SequenceClient implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int num = a_UnsafeSequenceGenerator.getNext();
//			int num = SafeSequenceGenerator.getNext();
			System.out.println(Thread.currentThread().getName() + " -> " + num);
		}
	}
}