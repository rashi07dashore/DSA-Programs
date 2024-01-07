import java.util.Scanner;
public class array1 {
    public static void main(String args[])
    {
        System.out.println("Hello this is first dsa program..");
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("give number of elements of array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("give array elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int a: arr)
        {
            System.out.print(a+ " : ");
        }
    }
}