/* Java program to swap a two characters in the String */

import java.util.*;

public class SwapCharacter
 {
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
    
        String str = obj.nextLine();
        
        char ch1 = obj.next().charAt(0);
        
        char ch2 = obj.next().charAt(0);

        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) 
        {
            ch[i] = str.charAt(i);
        }

        for (int i = 0; i < str.length(); i++)
         {
            if (ch[i] == ch2) 
            {
                ch[i] = ch1;
                System.out.print(ch[i]);
            } 
            else if (ch[i] == ch1)
            {
                ch[i] = ch2;
                System.out.print(ch[i]);
            }
             else 
            {
                System.out.print(ch[i]);
            }
        }
    }
}

