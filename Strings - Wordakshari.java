/* Antakshari is a popular parlor game played in India. Many word games are similar to antakshari. One such game is wordakshari. The game can be played by two or more people. The first player has to recite a word.
The last letter of the word is then used by the next player to recite another word starting with that letter. The winner or winning team is decided by a process of elimination. The person or the team that cannot
come up with a word with the right consonant is eliminated. - The following rules need to be followed while playing this game. - (i) All other words except the first word have to begin with the last letter of the
previous word - (ii) No words can be repeated. write a program to print the wordakshari chain. */ 

import java.io.*;
import java.util.*;

public class Solution
  {
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();

        while (true) 
        {
            String s = obj.nextLine();
            if (s.equals("####"))  
                break;
            str.add(s);  
        }

        
        for (int i = 0; i < str.size(); i++) 
        {
            if (i > 0) 
            {
                String prevWord = str.get(i - 1);
                String currWord = str.get(i);
                char lastCharOfPrev = prevWord.charAt(prevWord.length() - 1);
                char firstCharOfCurr = currWord.charAt(0);

                if (lastCharOfPrev != firstCharOfCurr) 
                {
                    break;  
                }
            }
            System.out.println(str.get(i)); 
        }
    }
}
