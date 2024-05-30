import java.util.Arrays;

public class FrogJump2 {
    //k jumps frog can do
    // Find minimum energy

    public static int fun(int n, int k, int height[], int dp[])
    {
        // Base case: If we are at the beginning (index 0), no cost is needed.
        if(n==0)
        return 0;

        if(dp[n] != -1)
        return dp[n];

        int mmsteps = Integer.MAX_VALUE;

        // Loop to try all possible jumps from '1' to 'k'
        for(int i=1; i<=k ; i++)
        {
            // Ensure that we do not jump beyond the beginning of the array
            if(i-k>=0)
            {
                // Calculate the cost for this jump and update mmSteps with the minimum cost
                int jump = fun(i-k, k, height, dp) + Math.abs(height[i]- height[i-k]);
                mmsteps = Math.min(mmsteps, jump);
            }
        }
        return dp[n] = mmsteps;
    }
    public static void main(String[] args) {
        int k = 3;
        int height[] = {30, 10, 60, 10, 60, 50};
        int n = height.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);

        System.out.println(fun(n, k, height, dp));
    }
}
/*  
TABULATION Method
*  static int solveUtil(int n, int[] height, int[] dp, int k) {
        dp[0] = 0;

        // Loop through the array to fill in the dp array
        for (int i = 1; i < n; i++) {
            int mmSteps = Integer.MAX_VALUE;

            // Loop to try all possible jumps from '1' to 'k'
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(height[i] - height[i - j]);
                    mmSteps = Math.min(jump, mmSteps);
                }
            }
            dp[i] = mmSteps;
        }
        return dp[n - 1]; // The result is stored in the last element of dp
    }

    // Function to find the minimum cost to reach the end of the array
    static int solve(int n, int[] height, int k) {
        int[] dp = new int[n]; // Initialize a memoization array to store calculated results
        Arrays.fill(dp, -1);
        return solveUtil(n, height, dp, k);
    }
 */