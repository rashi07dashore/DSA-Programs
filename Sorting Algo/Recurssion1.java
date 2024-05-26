public class Recurssion1
 {
    static void printNum(int n)
    {
        // to print till zero backwards
        if(n==-1)
        return;

        System.out.println(n);
        printNum(n-1);
    }
    static int fibonacci(int n)
    {
        if(n==0)
        return 0;
        if(n==1)
        return 1;

        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static int powerOfTwo(int n)
    {
        //power of 2
        if(n==0)
        return 1;

        return 2 * powerOfTwo(n-1);
    }
    public static void main(String args[])
    {
        int n=3;
        System.out.println("Power of 2: "+powerOfTwo(n));

        System.out.println("Printing number backwards");
        printNum(n);


        System.out.println("Fibonnaci number at nth pos: "+fibonacci(n));
    }
}

