/* Program to find the given String is a Palindrome or Not */

import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        
        String s = obj.nextLine();
        
        
        int n = s.length();
        char[]chr=new char[n];
        
        for(int i = 0; i < n; i++) 
        {
           chr[i] = s.charAt(n - 1 - i); 
        }
        
        String str = new String(chr);
        
        if (s.equals(str))
        {
            System.out.print("Palindrome");
        } else 
        {
            System.out.print("Not a Palindrome");
        }
    }
}
