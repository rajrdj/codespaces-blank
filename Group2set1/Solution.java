package Group2set1;

import java.util.Scanner;

public class Solution {
    
    public static int allWays(int a, int b) {
        int x = (int) Math.pow(a, 1.0/b);
        int[][] dp = new int[a+1][x+1];
        dp[0][0] = 1;
        for (int i = 1; i <= x; i++) {
            int p = (int) Math.pow(i, b);
            for (int j = 0; j <= a; j++) {
                dp[j][i] = dp[j][i-1];
                if (j >= p) {
                    dp[j][i] += dp[j-p][i-1];
                }
            }
        }
        return dp[a][x];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = allWays(a,b);
        System.out.println(ans);
    }
}
