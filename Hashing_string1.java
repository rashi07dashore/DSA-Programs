import java.util.*;
class Hashing_string1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give string: ");
        String s = sc.next();

        //precompute Hashing
        int hash[] = new int[26];       // we are taking 26 because we have exclusive lowercase problem
        //otherwise using int[256] is more of a easy way to implement, then we can use hash[s.chatAt(i)] in line 15
        // and hash[c] at line 26
        //ONLY USE ::: int[256] when we have to implement for all the characters
        for(int i=0; i<s.length(); i++)
        {
            hash[s.charAt(i)-'a']++;
        }

        //queries 
        System.out.println("Number of queries : ");
        int q = sc.nextInt();
        while(q>0)
        {
            char c = sc.next().charAt(0);      //This is how you red character in java
            //fetch from hash
            System.out.println("Number of occurance of character: "+ hash[c-'a']);
            q--;
        }
    }
}