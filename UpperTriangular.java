import java.io.*;
import java.util.*;

public class UpperTriangular
{

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();  
        int[][] arr = new int[n][n];

        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = obj.nextInt();
            }
        }


        boolean isUpperTriangular = true;

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < i; j++)
            {  
                if (arr[i][j] != 0) 
                {
                    isUpperTriangular = false;
                    break;
                }
            }
            if (!isUpperTriangular)
            {
                break;
            }
        }

        if (isUpperTriangular) 
        {
            System.out.print("Upper triangular matrix");
        } else 
        {
            System.out.print("Not an Upper triangular matrix");
        }
    }
}
