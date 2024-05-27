public class StringReverseRecurssion {
    
    public static void reverse(int i, int j, StringBuilder s)
    {
        //base case
        if(i>j)
        return;

        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);

        reverse(i+1, j-1, s);

    }
    public static void palindrome(int i, int j, StringBuilder str)
    {
        //base case
        if(i>j)
        {
            System.out.println("It is a palindrome");
            return;
        }

        //false condition
        if(str.charAt(i)!= str.charAt(j))
        {
        System.out.println("Not a palidrome");
        return;
        }
        else{
            //recursion
            palindrome(i+1, j-1, str);
        }

    }
    public static void main(String[] args) {
        String s = "rashi";
        StringBuilder sb = new StringBuilder(s);
        reverse(0, s.length()-1 , sb);
        System.out.println(sb.toString());
        StringBuilder str = new StringBuilder("RACECAR");
        palindrome(0, str.length()-1, str);
    }
}
