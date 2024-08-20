/* Write a program to move all zeroes to the end of a given integer */

import java.io.*;
import java.util.*;

public class Solution
{

    public static void main(String[] args) 
    {
        Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        while(n>0)
        {
            int a=obj.nextInt();
            int c=0,v=0;
            while(a>0)
            {
                if(a%10==0)
                {
                    c++;
                    a/=10;
                }
                else
                {
                   v++;
                    a/=10;
                }
            }
            for(int i=0;i<v;i++)
            {
               System.out.print("1");
            }
            for(int i=0;i<c;i++)
            {
                 System.out.print("0");
            }
            System.out.println();
         }        
      }    
    }
    

