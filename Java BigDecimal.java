/*
Question :-

Given an array, s, of n real number strings, sort them in descending order — but wait, there's more!
Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is printed as 0.1.
If two numbers represent numerically equivalent values, then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array s's elements according to the instructions above.

Input Format :

The first line consists of a single integer, n, denoting the number of integer strings.
Each line  of the  subsequent lines contains a real number denoting the value of si.

Constraints :
1<=n<=200
Each si has at most 300 digits.

*/

// Answer :-

import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        //Write your code here
        for(int i=1; i<n ; i++){
            for(int j=i; j>=1; j--){

                if(new BigDecimal(s[j]).compareTo(new BigDecimal(s[j-1]))>0){   
                    String temp = s[j];
                    s[j] = s[j-1];
                    s[j-1] = temp;
                    
                }else{
                    break;
                }
            }  
        } 
        
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
