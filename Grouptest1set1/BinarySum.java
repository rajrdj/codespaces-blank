package Grouptest1set1;

import java.util.*;
public class BinarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s1 = sc.nextLine().trim();
            String s2 = sc.nextLine().trim();
            StringBuilder sb = new StringBuilder();
            int carry = 0;
            int i = s1.length() - 1, j = s2.length() - 1;
            while (i >= 0 || j >= 0 || carry > 0) {
                int sum = carry;
                if (i >= 0) sum += s1.charAt(i--) - '0';
                if (j >= 0) sum += s2.charAt(j--) - '0';
                sb.append(sum % 2);
                carry = sum / 2;
            }
            System.out.println(sb.reverse().toString());
        }
        sc.close();
    }
}
