package e.extendingThreadsafeClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CorrectListHelper<E> {
	public List<E> list = Collections.synchronizedList(new ArrayList<E>());

	//put if absent
	public boolean putIfAbsent(E x) {
		synchronized (list) {
			boolean absent = !list.contains(x);
			if (absent)
				list.add(x);
			return absent;
		}
	}
}
