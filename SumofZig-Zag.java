/* Java program to calculate the sum of the Zig-Zag pattern in the Matrix */

import java.io.*;
import java.util.*;

public class SUM
{

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();
        int col = obj.nextInt();
        int n=row;
        int sum = 0;
        
        int[][] arr = new int[row][col];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) 
            {
                arr[i][j] = obj.nextInt();
            }
        }

       
        for (int j = 0; j < n; j++) 
        {
            sum += arr[0][j];
        }

        
        for (int i = 1; i < n - 1; i++)
        {
            sum += arr[i][i];
        }

       
        for (int j = 0; j < n ; j++)
        {
            sum += arr[n - 1][j];
        }

        System.out.print("Sum of Zig-Zag pattern is " + sum);
    }
}
