/*A company transfers an encrypted code to one of its clients. The code needs to be decrypted so that it can be used for accessing all the required information. The code can be decrypted by interchanging each 
consecutive digit and once a digit has been interchanged then it cannot be used again. If at a certain point there is no digit to be interchanged with, then the single digit must be left as it is.

Write an algorithm to decrypt the code so that it can be used to access the required information. */

import java.io.*;
import java.util.*;

public class Solution
{

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        char []ch=new char[100];
        for(int i=0;i<s.length();i++)
        {
        ch[i]=s.charAt(i);
        }
        int i=0,j=1;
        if(s.length()%2==0)
        {
            while(i<s.length())
            {
                System.out.printf("%c%c",ch[j],ch[i]);
                i=i+2;
                j=j+2;
            }
        }
        else
        {
            int k=s.length()-1;
            while(i<s.length()-1)
            {
                System.out.printf("%c%c",ch[j],ch[i]);
                i=i+2;
                j=j+2;
            }
            System.out.printf("%c",ch[k]);
        }
        
    }
}
