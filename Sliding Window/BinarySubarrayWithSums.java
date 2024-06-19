//LEETCODE PROBLEM - 930

class Solution {
    //count the subarrays with sum goal
    //number of subarrays where sum is lesser than or equal goal!
    public int numSubarraysWithSum(int[] nums, int goal) {
     
       return ans(nums, goal) - ans(nums, goal-1);
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

// class Solution {
//     public int numSubarraysWithSum(int[] nums, int goal) {
//         int count=0;
//         for(int i=0; i<nums.length; i++)
//         {
//             int currsum =0;
//             for(int j=i; j<nums.length; j++)
//             {
//                 currsum += nums[j];
//                 if(currsum == goal)
//                 {
//                     count++;
//                 }
//                 if(currsum > goal)
//                 break;

//             }
//         }
//         return count;
//     }
// }

/*
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    private int atMost(int[] nums, int goal) {
        int head, tail = 0, sum = 0, result = 0;
        for (head = 0; head < nums.length; head++) {
            sum += nums[head];
            while (sum > goal && tail <= head) {
                sum -= nums[tail];
                tail++;
            }
            result += head - tail + 1;
        }
        return result;
    }
}
*/