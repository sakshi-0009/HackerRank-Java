/*
Task :-
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
Use the power of Java's BigInteger class and solve this problem.

Input Format :-
There will be two lines containing two numbers, a and b.

Constraints :-
a and b are non-negative integers and can have maximum 200 digits.

Output Format :-
Output two lines. The first line should contain a+b, and the second line should contain a*b. Don't print any leading zeros.

*/

// Answer :-

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
     BigInteger bi1 = new BigInteger(sc.next());
     BigInteger bi2 = new BigInteger(sc.next());

        BigInteger  bi3, bi4;
        bi3 = bi1.add(bi2);
        bi4 = bi1.multiply(bi2);
        System.out.println( bi3);
        System.out.println( bi4);
    }
}
