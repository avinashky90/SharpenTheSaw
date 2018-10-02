
public class Factorial {

	public static void main(String[] args) {
		System.out.println(getFactorial(5));
	}

	private static int getFactorial(int i) {
		if (i == 0)
			return 1;
		return i*getFactorial(i - 1);
	}
}
