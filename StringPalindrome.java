public class StringPalindrome {
    public static void main(String[] args) {
        String a  = "geeks";
        int start =0;
        int end = a.length()-1;
        boolean isPal= true;
        while (start<end) {
            if(a.charAt(start)!=a.charAt(end))
            {
                isPal = false;
                break;
            }
            start++;
            end--;
            
        }
        if(isPal==true)
        {
            System.out.println("Yes");
        }
        else
        System.out.println("No");


    }
}
