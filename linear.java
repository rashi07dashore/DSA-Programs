import java.util.Scanner;
public class linear
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("no of arr elemnts:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Give elements : ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

     System.out.println("Element to find: ");
     int x = sc.nextInt();
     int counter =0;
     int i;
     for( i=0; i<n;i++)
     {
        if(x==arr[i])
        {
            counter++;
            break;
        }
     }
     if(counter>0)
     {
        System.out.println("Value found at index : "+i);
     }
     else
     System.out.println("Elements does not exists.");
    }
}