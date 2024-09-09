/* Write a java program to multiply two matrices of the same dimensions together. */


import java.util.*;
public class Solution
{

    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int m1=obj.nextInt();
        int m2=obj.nextInt();
        int arr1[][]=new int[m1][m1];
        int arr2[][]=new int[m2][m2];
        int arr3[][]=new int[m2][m2];
        for(int i=0;i<m1;i++)
        {
           for(int j=0;j<m1;j++)
           {
            arr1[i][j]=obj.nextInt();
           }
        }
        for(int i=0;i<m2;i++)
        {
           for(int j=0;j<m2;j++)
           {
            arr2[i][j]=obj.nextInt();
           }
        }
            for(int i=0;i<m1;i++)
        {
           for(int j=0;j<m2;j++)
           {
              for (int k = 0; k < m2; k++) 
              {
                    arr3[i][j] =arr3[i][j] + arr1[i][k] * arr2[k][j];
                }
           }
        }  
        for(int i=0;i<m2;i++)
        {
           for(int j=0;j<m2;j++)
           {
            System.out.print(arr3[i][j]+" ");
           }
            System.out.println();
        }
    }
}
