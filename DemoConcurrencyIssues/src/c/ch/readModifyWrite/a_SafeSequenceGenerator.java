package c.ch.readModifyWrite;

public class a_SafeSequenceGenerator {
	private static int value = 0;

	
	public static int getNext() {
		
		// Monitor/intrinsic locking vs Arbitrary locking on any object/class
		//These are Mutex Locks -> block entry to code paths
		synchronized (a_SafeSequenceGenerator.class) {
			return value++;
		}
	}
}
