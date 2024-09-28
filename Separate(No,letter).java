/* Write a java program to separate Number and Alphabet Letter from a String */

import java.util.*;
class String
{
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        String str = ob.nextLine();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Character>list2=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(Character.isDigit(c)) 
                list1.add(Character.getNumericValue(c));
            else 
                list2.add(c);
        }
        for(int i=0;i<list1.size();i++)
        {
        System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        for(int i=0;i<list2.size();i++)
        {
        System.out.print(list2.get(i)+" ");
        }
    }
}
