/*
Question :  Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

1. string s: a string
2. int k: the length of the substrings to find.

Returns :
string: the string ' + "\n" + ' where and are the two substrings.

Input Format :
The first line contains a string denoting s.
The second line contains an integer denoting k.
*/

Answer :

import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
    smallest = largest = s.substring(0, k);

    for (int i=1; i<s.length()-k+1; i++) {
        String substr = s.substring(i, i+k);
        if (smallest.compareTo(substr) > 0)
            smallest = substr;
        if (largest.compareTo(substr) < 0)
            largest = substr;
    }

    return smallest + "\n" + largest;
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
