package fail.fast.iterators.concurrent.modification;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

public class FailFastIterators {
	
	private static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		
		for(int i =0; i<1074856; i++){
			list.add(i);
		}
		
//		
		
		Runnable arrayModifier = new ChangeArray(list);
		new Thread(arrayModifier).start();
		
//		for(int i=0;i<1074856;i++)
//			System.out.println(list.get(i));
			
		ListIterator<Integer> it = list.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

class ChangeArray implements Runnable{
	private List<Integer> list = new ArrayList<>();
	
	ChangeArray(List<Integer> list){
		this.list = list;
	}

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		list.remove(574856);
		System.out.println("List modified..");
	}
}