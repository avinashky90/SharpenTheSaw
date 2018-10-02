import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchRecursive {
	
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{23, 45,54,75,79,81,85,91,103,105,107,108}));
//		List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{23, 45, 54}));
//		List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{23, 45}));
		List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{23}));
//		List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{}));
		
		System.out.println(binarySearch(list, 23, 0, list.size()));
		
	}
	
	public static int binarySearch(List<Integer> list, int key, int minIndex, int maxIndex){
		
		if(list.size() == 0 || (minIndex == maxIndex))
			return -1;
				
		int mid = ( minIndex + maxIndex ) /2;
		
		if(key == list.get(mid))
			return mid;
		
		if(key < list.get(mid))
			 return binarySearch(list, key, minIndex, mid);
		
		if(key > list.get(mid))
			return binarySearch(list, key, mid, maxIndex);
		
		return -1;
	}
}
