

public class StringPanagramChecking {
    boolean isPanagram(String s)
    {
        int n =s.length();
        if(n<26)
        {
            return false;
        }
        boolean visited[] = new boolean[26];
        for(int i=0;i<n;i++)
        {
            char x = s.charAt(i);
            if(x>='a' && x<='z')
            {
                visited[x-'a'] = true;
            }
            if(x>='A' && x<='Z')
            visited[x-'A']=true;
        }
        for(int i=0;i<26;i++)
        {
            if(visited[i]==false)
            {
                return false;
            }
            
        }
        return true;

        
        

        
    }
    public static void main(String[] args) {
        StringPanagramChecking checker = new StringPanagramChecking();
        String testString = "The quick brown fox jumps over the lazy dog";
        if (checker.isPanagram(testString)) {
            System.out.println("Yes, it is a pangram.");
        } else {
            System.out.println("No, it is not a pangram.");
        }
    }
}
// String s = "The quick brown fox jumps over the lazy dog";
        
// System.out.println(isPanagram(s));