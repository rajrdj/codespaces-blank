package Group2set1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(superPow(a, b));
    }

    static int superPow(int a, int[] b) {
        int result = 1;
        for (int i = 0; i < b.length; i++) {
            result = power(result, 10) * power(a, b[i]) % 1337;
        }
        return result;
    }

    static int power(int a, int b) {
        if (b == 0) return 1;
        if (b == 1) return a % 1337;
        int temp = power(a, b / 2);
        if (b % 2 == 0) {
            return temp * temp % 1337;
        } else {
            return ((a % 1337) * (temp * temp % 1337)) % 1337;
        }
    }
}
