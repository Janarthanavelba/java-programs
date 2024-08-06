import java.util.*;
class gab sum
{
   public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int []arr=new int[n];
        int gab=3;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<gab;i++)
        {
            int sum=0;
            for(int j=i;j<n;j+=gab)
            {
                sum+=arr[j];
            }
            System.out.println(sum);
        }
    }
}
