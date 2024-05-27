//int a = 3, b=2, we have to find 3^2 = 9
//To find the power, we will take the logic of even and odd, if power number is even then:
// (a)^b = a^b/2 * a*b/2
// for odd: 
//(a)^b = a * (a^b/2 * a*b/2)

import java.util.Scanner;

public class PowerRecursion {

    public static int power(int a, int b)
    {
        if(b==0)
        return 1;

        if(b%2==0)
        {
            return power(a, b/2) * power(a, b/2);
        }
        else{
            return a* power(a, b/2) * power(a, b/2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int ans = power(a, b);
        System.out.println("Answer is: "+ans);
    }
}
