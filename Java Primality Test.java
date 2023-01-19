/*

Input Format :-
A single line containing an integer, n (the number to be checked).

Constraints :-
n contains at most 100 digits.
 
Output Format :-
If n is a prime number, print prime; otherwise, print not prime.

*/

# Answer :-

import java.math.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger n = scan.nextBigInteger();
        scan.close();
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}
