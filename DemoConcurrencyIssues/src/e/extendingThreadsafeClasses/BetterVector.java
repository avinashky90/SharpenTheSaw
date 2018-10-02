package e.extendingThreadsafeClasses;

import java.util.Vector;

public class BetterVector<E> extends Vector<E> {
	
	//put if absent
	public synchronized boolean putIfAbsent(E x) {
		boolean absent = !contains(x);
		if (absent)
			add(x);
		return absent;
	}
}
