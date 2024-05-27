public class BinarySearchRecurssion {
    public static boolean binarySearch(int arr[], int start, int end, int key)
    {
        
        //base case
        if(end< start)
        {
            return false;
        }

        //processing
        int mid = (start+ end)/2;

        //base case- found
        if(arr[mid] == key)
        {
            return true;
        }
        //recurssion
        if(arr[mid]< key)
        {
           return binarySearch(arr, mid+1, end, key);
        }
        else{
           return binarySearch(arr, start, mid-1, key);
        }


    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 10, 14, 16, 18, 29};
        int size = 8;
        int key = 18;
        if(binarySearch(arr, 0, size-1, key))
        {
            System.out.println("Element found");
        }
        else{
            System.out.println("not found");
        }

    }
}
