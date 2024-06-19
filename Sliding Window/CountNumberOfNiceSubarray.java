//LEETCODE - 1248
//COUNT NUMBER OF NICE SUBARRAY

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        //Take odds as 1 and evens as 0
        // Now the sum of odds will be k
        //Turned this problem into Binary Subarray With Sum
      for(int i=0; i< nums.length; i++)
      {
        if(nums[i] %2==0)
        {
            nums[i] =0;
        }
        else
        {
            nums[i] =1;
        }
      }
       return ans(nums, k) - ans(nums, k-1);
    }
    private static int ans(int nums[], int goal)
    {
     int count=0, sum=0;
       int l=0, r=0;
       while(r < nums.length)
       {
        if(goal< 0)
        return 0;

        sum += nums[r];

        while(sum > goal)
        {
            sum = sum- nums[l];
            l++;
        }
        count = count+ (r-l+1);
        r++;
       }
       return count;
    }
}