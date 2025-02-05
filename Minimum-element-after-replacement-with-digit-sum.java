/* You are given an integer array nums.

You replace each element in nums with the sum of its digits.

Return the minimum element in nums after all replacements. */

class Solution {
    public int minElement(int[] nums) {

        List<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            int sum=0;
            while(n>0)
            {
                int a=n%10;
                sum=sum+a;
                n=n/10;
            }
            list.add(sum);
        }

        Collections.sort(list);

        return list.get(0);
        
    }
}
