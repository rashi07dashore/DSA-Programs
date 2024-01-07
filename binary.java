import java.util.*;
public class binary{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("no of arr elemnts:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Give sorted array elements : ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int beg=0, end=n-1, c=0;         // c is counter
        int mid; 
     System.out.println("Element to find: ");
     int x = sc.nextInt();

     while(beg<=end)
     {
        mid =(beg+end)/2;
        if(x == arr[mid])
        {
            System.out.println("Item found at index: "+mid);
            c++;
            break;
        }
        else if(x > arr[mid])
        {
            beg = mid+1;
        }
        else           //x < arr[mid]
        {
            end = mid-1;
        }
     }
     if(c==0)
     {
        System.out.println("Element not found in array");
     }
    }
}