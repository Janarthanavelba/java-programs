//Rotate the matrix by 90 or 180 or 270 

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int [][]mat=new int[n][n];
        int [][]res=new int[n][n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=obj.nextInt();
            }
        }
        int degree =obj.nextInt();
        
        if(degree==90)
        {
             for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                res[i][j]=mat[n-j-1][i];
            }
        }
        }
        else if(degree==180)
        {
             for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
            {
                res[i][j]=mat[n-i-1][n-j-1];
            }
            }
        }
        else
        {
             for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                res[i][j]=mat[j][n-i-1];
            }
        }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
