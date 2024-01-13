public class test2 {
    public static void main(String[] args) {
        
    
    String a= "race car";
    boolean flag =true;
    
    int low=0, high = a.length()-1;
    while(high>=low)
    {
        if(a.charAt(high)==' ')
        high--;
        if(a.charAt(low)==' ')
        low++;
        if(a.charAt(high)!= a.charAt(low))
        {
            flag = false;
        break;
        }
        low++;
        high--;
    }
    if(!flag)
    {
        System.out.println("not a palindrome");
    }
    
}
}
