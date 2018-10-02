
public class FactorialRecursive {
	
	private static int num = 5;

	/** Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getFactorial(num));
	}

	/**
	 * Method generates Factorial.. 
	 * @param i
	 * @return
	 */
	private static int getFactorial(int i) {
		if (i == 0)
			return 1;
		return i*getFactorial(i - 1);
	}
}
