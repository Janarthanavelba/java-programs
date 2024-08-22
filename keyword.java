/* Java program to identify the given word is keyword or not */

import java.util.*;
public class Keyword
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int c=0;
        ArrayList<String>list=new ArrayList<>();
        list.add("break");
        list.add("case");
        list.add("continue");
        list.add("default");
        list.add("defer");
        list.add("else");
        list.add("for");
        list.add("func");
        list.add("goto");
        list.add("if");
        list.add("map");

        for(int i=0;i<list.size();i++)
        {
            if(s.equals(list.get(i)))
            {
                System.out.print(s+ " is a keyword");
            }
            else  c++;
        }
        if(c==list.size()) System.out.print(s+ " is a not keyword");
    }
}
