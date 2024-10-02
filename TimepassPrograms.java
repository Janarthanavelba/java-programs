//Program 1
import java.util.*;
class Boring
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        int sum=0;
        
        Arrays.sort(arr);
int i=0;
        while(i<n)
        {
            if(i==0)
            {
           int a=arr[i+1]-arr[i];
            sum=sum+a;
            i++;
            }
            else if(i!=n-1)
            {
                int a=arr[i]-arr[i-1];
                int  b=arr[i+1]-arr[i];
                i++;
                 if(a<b) sum=sum+a;
                 else sum=sum+b;
            }
            else
            {
            
                 int a=arr[i]-arr[i-1];
                sum+=a;
                break;
            }


        }         
        System.out.print(sum);
    }
}

//Program 2
import java.util.*;
class Acen2 
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }


        int sum=0;
        for(int i=0;i<n;i++)
        {  
            if(i==n-1)  
            {
                int s=Math.abs(arr[i]-arr[0]);
                sum =sum+s;
            }
            else
            {
                 int s=Math.abs(arr[i]-arr[i+1]);
                 sum =sum+s;
            }
        }
        System.out.print(sum);
    }
}





