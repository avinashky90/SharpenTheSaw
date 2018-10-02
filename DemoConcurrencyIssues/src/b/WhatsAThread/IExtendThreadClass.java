package b.WhatsAThread;

public class IExtendThreadClass extends Thread {

	IExtendThreadClass(String name){
		super(name);
	}
	
	@Override
	public void run() {
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
