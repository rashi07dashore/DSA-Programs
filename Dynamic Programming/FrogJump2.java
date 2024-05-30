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
        int n=4;
        int k = 2;
        int height[] = {10, 20, 30, 10};
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);

        System.out.println(fun(n, k, height, dp));
    }
}
