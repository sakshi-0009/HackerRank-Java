/*

Input Format :-

The first line contains a single integer,n, denoting the size of the array.
Each line i of the n subsequent lines contains a single integer denoting the value of element ai.

Output Format :-

You are not responsible for printing any output to stdout. Locked code in the editor loops through array a and prints each sequential element on a new line.

*/

# Answer :-
  
import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
            int[] a = new int[n];
    for(int i = 0; i < n; i++){
        a[i]=scan.nextInt();
    }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
