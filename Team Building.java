/* Problem Statement
Your company is organizing a team-building activity where you need to arrange employees into two distinct groups: one group for technical activities and the other for creative activities.
The arrangement must ensure that:
    Technical employees (represented by positive integers) and creative employees (represented by negative integers) are alternated.
    The relative order within each group should be preserved.
    You have a list of employees where each employee is represented by a unique integer (positive for technical and negative for creative).
Your task is to rearrange the list such that technical and creative employees are alternated while maintaining the order within each group.
Write a program to rearrange the employees' list based on the given conditions.
Example
Input 
6
1 2 3 -4 -1 4
Output 
1 2 3 -4 -1 4  -------> Input list
-4 1 -1 2 3 4  -------> Rearranged list */

// You are using Java
import java.util.*;
class java
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int nn=obj.nextInt();
        int arr[]=new int[nn];
        List<Integer>p=new ArrayList<>();
        List<Integer>n=new ArrayList<>();
        for(int i=0;i<nn;i++)
        {
            arr[i]=obj.nextInt();
            if(arr[i]<0) n.add(arr[i]);
            else p.add(arr[i]);
            
        }
        int ns=0,ps=0;
        int res[]=new int[nn];
        for(int i=0;i<nn;i++)
        {
            if(i%2==0 && ns<n.size())
            {
                res[i]=n.get(ns);
                ns++;
            }
            else{
                res[i]=p.get(ps);
                ps++;
            }
        }
        for(int i=0;i<nn;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
        for(int i=0;i<res.length;i++){
        System.out.print(res[i]+" ");
        }
    }
}
