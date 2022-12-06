/*
Function Description :

Complete the canWin function in the editor below.
canWin has the following parameters:
int leap: the size of the leap
int game[n]: the array to traverse

Returns :
boolean: true if the game can be won, otherwise false

Input Format :

The first line contains an integer, q, denoting the number of queries (i.e., function calls).
The 2 . q subsequent lines describe each query over two lines:

The first line contains two space-separated integers describing the respective values of n and leap.
The second line contains  space-separated binary integers (i.e., zeroes and ones) describing the respective values of game0, game1,....game n-1 .
*/

Answer :

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game, int i) {
        if (i < 0 || game[i] == 1)
            return false;
        if (i + 1 >= game.length || i + leap >= game.length)
            return true;

        game[i] = 1; //flag

        return canWin(leap, game, i + leap)
                || canWin(leap, game, i + 1)
                || canWin(leap, game, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game, 0)) ? "YES" : "NO");
        }
        scan.close();
    }
}
