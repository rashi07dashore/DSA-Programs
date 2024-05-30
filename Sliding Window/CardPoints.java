
public class CardPoints {
    public static int maxScore(int[] cardPoints, int k) {
        int left=0;
        int right=0;
        int maxSum=0;
        for(int i=0; i<k; i++)
        {
            left = left + cardPoints[i];
            maxSum = Math.max(maxSum, left);
        }
        int n= cardPoints.length -1;
        for(int i=k-1; i>=0; i--)
        {
            left = left - cardPoints[i];
            right = right + cardPoints[n];
            n= n-1;
            maxSum = Math.max(maxSum, left+ right);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(arr, k));
    }
}
