/* Write a program that takes an integer n as input and prints a hollow X pattern of stars (*) of size n × n.

The X is formed by stars along the main diagonal (top-left to bottom-right) and the anti-diagonal (top-right to bottom-left).

All other positions should be spaces.

The program should work for both even and odd values of n. */

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || (i+j==n-1) ) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
