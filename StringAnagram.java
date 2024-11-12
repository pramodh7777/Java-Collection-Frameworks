import java.util.HashMap;

public class StringAnagram {
   static boolean Anagram(String s1[], String s2[])
    {
        HashMap<String,Integer> hp = new HashMap<>();
        if (s1.length != s2.length) {
            return false; // Early exit if lengths are different
        }
        for(int i=0;i<s1.length;i++)
        {
            hp.put(s1[i],hp.getOrDefault(s1[i],0)+1);
        }
        System.out.println(hp);
        for(int i=0;i<s2.length;i++)
        {
            hp.put(s1[i],hp.getOrDefault(s1[i],0)-1);
        }
        System.out.println(hp);
        for(int count :hp.values())
        {
            if(count!=0)
            {
                return false;
            }
        }
        return true;
    }
      public static void main(String[] args) {
        String s1[] = {"h","e","a","r","t"};
        String s2[] ={ "e","a","r","t","h"};
     //   Anagram(s1, s2);
        System.out.println("Are the arrays anagrams? " + Anagram(s1, s2));
      }
}
