package b.WhatsAThread;

public class IImplementARunnableClass implements Runnable {

private String name;
	
IImplementARunnableClass (String name){
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// Setting the name here.. Why not in constructor ?
		Thread.currentThread().setName(name);
		
		for(int i = 0; i<10; i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
