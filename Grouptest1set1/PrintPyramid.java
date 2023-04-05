package Grouptest1set1;

import java.util.Scanner;

public class PrintPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // iterate through each row
        for (int i = 1; i <= n; i++) {

            // print spaces before the numbers
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // print the numbers in descending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // print the numbers in ascending order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            // move to the next line
            System.out.println();
        }
    }
}
