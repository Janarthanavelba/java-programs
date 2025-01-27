//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

class Solution {
    public int searchInsert(int[] nums, int target) {
        int a=0;
        if(nums[nums.length-1]<target) a=nums.length;
        else{
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target) 
            {
                a=i;
                break;
            }
            if(nums[i]<target && nums[i+1]>target)
            {
                a=i+1;
                break;
            }
        }
    }
    return a;
}
}
