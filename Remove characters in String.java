/* Write a java program to Remove all characters in Second String that are present in First String. */

import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String s1=obj.nextLine();
        String s2=obj.nextLine();
        char []ch1=s1.toCharArray();
        char []ch2=s2.toCharArray();
        
        
        ArrayList<Character> s=new ArrayList<>();
        
        for(char c:ch1)
        {
              s.add(c);
        }
        
        for(char c:ch2)
        {
            if(!s.contains(c)) System.out.print(c);
        }
    }
}
