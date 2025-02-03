/* Given an array nums of integers, return how many of them contain an even number of digits. */

class Solution 
{
    public int findNumbers(int[] nums)
    {
        
       int c =0;

       for(int i=0;i<nums.length;i++)
       {
        int n=nums[i];
        int count =0;
        while(n>0)
        {
            n/=10;
            count++;
        }

        if(count%2==0) c++;
       }

       return c;
    }
}
