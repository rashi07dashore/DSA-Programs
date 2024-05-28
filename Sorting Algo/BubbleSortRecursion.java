public class BubbleSortRecursion {
    public static void bubbleSort(int arr[], int n)
    {
        if(n==0 || n ==1)
            return;

        for(int i=0; i<n; i++)
        {
            if(arr[i]> arr[i+1])
            {
                int temp= arr[i];
                arr[i]= arr[i+1];
                arr[i+1] = temp;
            }
        }

        bubbleSort(arr, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1, 10, 12, 7};
        bubbleSort(arr, 7);
        for(int a: arr)
        {
            System.out.println(a);
        }
    }
}
