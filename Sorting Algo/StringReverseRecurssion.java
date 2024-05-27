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
    public static void main(String[] args) {
        String s = "rashi";
        StringBuilder sb = new StringBuilder(s);
        reverse(0, s.length()-1 , sb);
        System.out.println(sb.toString());
    }
}
