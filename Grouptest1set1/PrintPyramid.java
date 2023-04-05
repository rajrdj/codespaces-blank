package Grouptest1set1;

import java.util.Scanner;

public class PrintPyramid {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        
        for (int i=0;i<N;i++)
        {
            int val=i+1;
            for (int j=0;j<(N-i-1);j++)
            {
                System.out.print(" ");
            }
            
            for (int j=0;j<=i;j++)
            {
                System.out.print(val);
                val++;
            }
            val--;
            
            for (int j=0;j<i;j++)
            {
                --val;
                System.out.print(val);
            }
            System.out.println(" ");
        }
        scan.close();
	}
}
