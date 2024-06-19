// LEETCODE - 992
// SUBARRAYS WITH K DIFFERENT INTEGERS
// LEETCODE HARD PROBLEM

// ~ This problem creates an confusion when to shrink or increase the frame, hence we
// use the logic of lesser or equal too, instead of equal to and subtract it with previous one!

class Solution {
    //Can you count the number of subarrays where differnt integers are lesser or equal to k
    public int subarraysWithKDistinct(int[] nums, int k) {
        return ans(nums, k) - ans(nums, k-1);
    }

private int ans(int nums[], int k)
{
        int count=0;
        int l =0, r=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(r< nums.length)
        {
            if(map.containsKey(nums[r]))
            map.put(nums[r], map.get(nums[r])+1);
            else
            map.put(nums[r], 1);

            while (map.size() > k)
            {
                map.put(nums[l], map.get(nums[l])-1);
                if(map.get(nums[l])==0) 
                map.remove(nums[l]);
                l++;
            }
            count = count + (r-l+1);
            r++;
        }
        return count;
}
}
//BRUTE FORCE- TLE
// class Solution {
//     public int subarraysWithKDistinct(int[] nums, int k) {
//         int count=0;
//       for(int i=0; i<nums.length ; i++)
//       {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int j=i; j<nums.length; i++)
//         {
//             if(map.containsKey(nums[j]))
//             {
//                 map.put(nums[j], map.get(nums[j])+1);
//             }
//             else
//             {
//                 map.put(nums[j], 1);
//             }

//             if(map.size() == k)
//             count++;

//             else if(map.size() > k)
//             break;
//         }
//       }  
//       return count;
//     }
// }
