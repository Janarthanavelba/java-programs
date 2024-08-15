/* Arrays 1D - Count distinct elements */

import java.io.*;
import java.util.*;
public class Countdistinct
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int n=obj.nextInt();
        while(n>0)
        {
            int a=obj.nextInt();
            list.add(a);
            n=n-1;
         }
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(j).equals(list.get(i)))
                {
                    list.remove(j);
                    j--;
}
}
        }
        int m=list.size();
        System.out.print("There are " +m+ " distinct element in the array.");
}
}
