/* Write a code to find the number is Adam or Not */

import java.util.*;
class AdamNum
{
    public static void main(String[] args)
     {
           Scanner obj=new Scanner(System.in);
           int n=obj.nextInt();
           int a=n*n;
           int b=0,b1=0,sum=0,sum1=0;
           while(n>0)
           {
              b=n%10;
              sum=sum*10+b;
              n=n/10;
           }
           sum=sum*sum;
           while(sum>0)
           {
              b1=sum%10;
              sum1=sum1*10+b1;
              sum=sum/10;
           }
           if(a==sum1)
           {
            System.out.print("adam");
           }
           else
           {
            System.out.print(" not adam ");
           }
           obj.close();
    }
}
