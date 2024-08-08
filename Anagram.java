/*Write a program to find the given String is Anagram or Not */

import java.util.*;
class Anagram
{
   public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        int n1=s1.length();
        String s2=obj.nextLine();
        int n2=s2.length();
        char[]arr1=new char[n1];
        char[]arr2=new char[n2];
        for(int i=0;i<n1;i++)
        {
           arr1[i]=s1.charAt(i);
        }
        for(int i=0;i<n2;i++)
        {
           arr2[i]=s2.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String ss=new String(arr1);
        String sss=new String(arr2);
        if(ss.equals(sss))
        {
            System.out.print("Anagram");
        }
        else{
            System.out.print("not Anagram");
        }
    }
}
