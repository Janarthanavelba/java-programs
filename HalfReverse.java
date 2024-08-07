import java.util.*;
class HalfReverse
{
   public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int []arr=new int[n];
        int k=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=k-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
        for(int i=k;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
