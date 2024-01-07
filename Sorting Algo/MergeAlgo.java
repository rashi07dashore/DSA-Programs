import java.util.*;

class MergeSort
{
    //Method to divide the array into single element hypothetical array
    public static void divide(int arr[], int low, int high)
    {
        if(low >= high)
        return;
        int mid = (low+high)/2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    //merging all those hypothetical arrays into one sorted array
    public static void merge(int []arr, int low,int mid, int high)
    {
       ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;
        int right= mid+1;
        while(left<=mid && right<= high)
        {
            if(arr[left]<= arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }
        while(right<= high)
        {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++)
        {
            arr[i] = temp.get(i - low);
        }
    }
}
public class MergeAlgo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[], n;
        System.out.println("How many elements you want to enter: ");
        n= sc.nextInt();
        a = new int[n];

        System.out.println("Enter Elemente: ");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
       MergeSort ms = new MergeSort();
       ms.divide(a, 0, n-1);
       System.out.println("After sorting array using Merge Sort: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}