/*

Input Format :-
There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.
The part of the code that handles input operation is already provided in the editor.

Output Format :-
For each case, print 'true' if the string is balanced, 'false' otherwise.

*/

// Answer :-

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i=0; i<s.length();++i){
            if (s.charAt(i) == '(') stack.push('(');
            else if (s.charAt(i) == '{') stack.push('{');
            else if (s.charAt(i) == '[') stack.push('[');
            else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '(') return false;
            }
            else if (s.charAt(i) == '}') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '{') return false;
            }
            else if (s.charAt(i) == ']') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        String line;
        while (sc.hasNextLine()){
            line = sc.nextLine();
            if (isBalanced(line)) System.out.println("true");
            else System.out.println("false");
        }
    }
}
