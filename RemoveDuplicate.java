import java.util.*;
class RemoveDuplicate
{
 public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while (true)
        { 
            int a=obj.nextInt();
            if(a==-1)  break;
            list.add(a);
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
        System.out.print(list);
    }   
}
