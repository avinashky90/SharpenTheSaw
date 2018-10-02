package codemonk.a.basicprogramming.e.basicofbitmanipulation;

public class TestClass {

	public static void main(String[] args) {
		int i = 23;
		int j = 512;

		System.out.println(isPowerOfTwo(i));
		System.out.println(isPowerOfTwo(j));

		System.out.println("Num Of Ones :" + i + " -> " + numOfOnesInBinaryRep(i));
		System.out.println("Num Of Ones :" + j + " -> " + numOfOnesInBinaryRep(j));

		System.out.println("##########");
		System.out.println("Testing Ith bit set functionality..");
		for (int k = 0; k < 10; k++) {
			System.out.println(Integer.toBinaryString(i) + " -> " + k + " " + isIthBitSet(i, k));
		}
		
		System.out.println("##########");
		System.out.println("Print Subsets....");
		printSubsets(new char[] {'a','b','c','d'});
		

	}

	private static boolean isPowerOfTwo(int n) {
		if (n != 0) {
			System.out.println(Integer.toBinaryString(n & (n - 1)));
		}
		return !(n == 0) && (n & (n - 1)) == 0;
	}

	private static int numOfOnesInBinaryRep(int n) {
		if (n == 0)
			return 0;

		int numOfOnes = 0;
		while (n > 0) {
			n = n & (n - 1);
			numOfOnes++;
		}

		return numOfOnes;
	}

	private static boolean isIthBitSet(int n, int i) {
		return (n & (1 << i)) > 0;
	}
	
	 // Print all subsets of given set[] 
    private static void printSubsets(char set[]) 
    { 
        int n = set.length; 
  
        // Run a loop for printing all 2^n 
        // subsets one by obe 
        for (int i = 0; i < (1<<n); i++) 
        { 
            System.out.print("{ "); 
  
            // Print current subset 
            for (int j = 0; j < n; j++) 
  
                // (1<<j) is a number with jth bit 1 
                // so when we 'and' them with the 
                // subset number we get which numbers 
                // are present in the subset and which 
                // are not
                if ((i & (1 << j)) > 0) 
                    System.out.print(set[j] + " "); 
  
            System.out.println("}"); 
        } 
    } 
}
