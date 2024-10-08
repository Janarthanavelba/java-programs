/*A bus stop queue has 'n' groups of people. The i-th group from the beginning has 'ai' people. Every 30 minutes an empty bus arrives at the bus stop, it can carry atmost 'm' people. Naturally,the people from the
first group enter the bus first. Then goes the people from the second group and so on. Note that the order of groups in the queue never changes. Moreover, if some group cannot fit all of its members into the current 
bus, it waits for the next bus and joins with the other groups standing after them in the queue. Your task is to determine the number of buses needed to transport all 'n' groups to the Jeju Island countryside. */

import java.io.*;
import java.util.*;

public class Solution
{

    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int c=0,a=0;
        for(int i=0;i<n;i++)
        {
           if(a+arr[i]>m)
           {
            c++;
            a=arr[i];
           }
            else
            {
                a=a+arr[i];
            }
        }
            if(a>0) c++;
        
        System.out.print(c);
    }
}
