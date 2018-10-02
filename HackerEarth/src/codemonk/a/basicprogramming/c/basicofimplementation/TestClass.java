package codemonk.a.basicprogramming.c.basicofimplementation;

/**
You are given a string S. 
Count the number of occurrences of all the digits in the string S.

Input: 
First line contains string S.

Output: 
For each digit starting from 0 to 9, print the count of their occurrences in the string S. 
So, print  lines, each line containing 2 space separated integers. 
First integer i and second integer count of occurrence of i. 
See sample output for clarification.
 */
import java.util.*;

public class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
*/
        Scanner s = new Scanner(System.in);
        String inputStr = s.nextLine();                 // Reading input from STDIN
        
        int[] count = new int[10];
        Arrays.fill(count, 0);
        
        for(int i=0; i < inputStr.length(); i++){
            int digit = new Integer(String.valueOf(inputStr.charAt(i)));
            count[digit] ++;
        }
        
        for(int i = 0; i< 10; i++){
            System.out.println(i + " " + count[i]);
        }
    }
}
