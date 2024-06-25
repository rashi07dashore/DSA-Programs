//LEETCODE- HOUSE ROBBER 
// LEETCODE 198 MEDIUM 

class Solution {
    //TABULATION METHOD: Space optimization 
    //create all subsquence and check
    public int rob(int[] nums) {
    int prev2 =0;
   int prev = nums[0];
   int neg=0;
   for(int i=1; i<nums.length; i++)
   {
    int pick = nums[i];
    if(i>1)
    pick += prev2;
    int notpick = 0+ prev;
    prev2 = prev;
    prev = Math.max(pick, notpick);
    
   }
   return prev;
    }
}


class Solution {
    //TABULATION METHOD 
    //create all subsquence and check
    public int rob(int[] nums) {
   int dp[] = new int[nums.length];
   dp[0] = nums[0];
   int neg=0;
   for(int i=1; i<nums.length; i++)
   {
    int pick = nums[i];
    if(i>1)
    pick += dp[i-2];
    int notpick = 0+ dp[i-1];
    dp[i] = Math.max(pick, notpick);
   }
   return dp[nums.length-1];
    }
}

//Using Memoization
class Solution {
    //create all subsquence and check
    public int rob(int[] nums) {
    int dp[] = new int[nums.length];
    Arrays.fill(dp, -1);
   int ans= fun(nums.length-1,nums, dp);    
   return ans;
    }

    private static int fun(int ind, int[] nums, int[] dp)
    {
    if(ind==0)
    return nums[ind];

    if(ind<0) return 0;
    
    if(dp[ind] != -1)
    return dp[ind];

    int pick = nums[ind] + fun(ind-2, nums, dp);
    int notpick = fun(ind-1, nums, dp);
    return dp[ind] = Math.max(pick, notpick);
    }
}