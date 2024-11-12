public class StringAnagramCharacterArray {
    static boolean AnagramCharArray(String s1[], String s2[])
    {
        if (s1.length != s2.length) {
            return false; // Early exit if lengths are different
        }
        int count[] = new int[26];
        
        for(int i =0;i<s1.length;i++)
        {
            char char1 = s1[i].charAt(0);
            char char2 = s2[i].charAt(0);
            count[char1-'a']++;
            count[char2-'a']--;

        }
        for(int count1: count)
        {
            if(count1!=0)
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
        System.out.println("Are the arrays anagrams? " + AnagramCharArray(s1, s2));
    }
}
