
import java.util.*;

public class StringCheckSubSequence {
   static boolean isSubSeq(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int j = 0; // Pointer for s2

        // Traverse s1 and check characters matching with s2
        for(int i = 0; i < n && j < m; i++) {
            if(s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
        }
        
        return j == m; // If j reaches m, all characters of s2 matched in order
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string s1: ");
        String s1 = sc.next();
        
        System.out.print("Enter string s2: ");
        String s2 = sc.next();
        
        // Check if s2 is a subsequence of s1
        System.out.println("Is s2 a subsequence of s1? " + isSubSeq(s1, s2));
        sc.close();
    }
}
